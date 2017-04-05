package io.leonardortlima;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/**
 * @author leonardortlima
 * @since 2017-02-24
 */
public class Serializator {

    public static String toJson(Object object) {
        if(object == null) {
            throw new IllegalArgumentException("object null");
        }

        StringBuilder builder = new StringBuilder();
        appendObject(builder, object);
        return builder.toString();
    }

    private static String appendObject(StringBuilder builder, Object object) {
        System.out.println("appendObject");

        Class myClass = object.getClass();
        Field[] fields = myClass.getDeclaredFields();

        builder.append("{");
        for(Field field : fields) {
            convertField(builder, field, object);
            builder.append(',');
        }

        builder.setLength(builder.length() - 1);
        builder.append("}");
        return builder.toString();
    }

    private static StringBuilder convertField(StringBuilder builder, Field field, Object object) {
        builder.append("\"")
                .append(field.getName())
                .append("\"")
                .append(":");

        try {
            field.setAccessible(true);
            Object value = field.get(object);
            convertFieldValue(builder, value);
        } catch(IllegalAccessException e) {
            builder.append("null");
        }

        field.setAccessible(false);
        return builder;
    }

    private static StringBuilder convertFieldValue(StringBuilder builder, Object value) {
        if(value == null) {
            builder.append("null");
            return builder;
        }

        if(InstanceChecker.isPrimitive(value)) {
            appendValueNoQuote(builder, value);
            return builder;
        }

        if(InstanceChecker.isText(value)) {
            appendValueQuoted(builder, value);
            return builder;
        }

        if(InstanceChecker.isArray(value)) {
            appendArrayValue(builder, value);
            return builder;
        }

        if(InstanceChecker.isCollection(value)) {
            appendCollection(builder, value);
            return builder;
        }

        appendObject(builder, value);
        return builder;
    }

    private static StringBuilder appendValueNoQuote(StringBuilder builder, Object value) {
        builder.append(value);
        return builder;
    }

    private static StringBuilder appendValueQuoted(StringBuilder builder, Object value) {
        builder.append('\"').append(value).append('\"');
        return builder;
    }

    private static StringBuilder appendArrayValue(StringBuilder builder, Object value) {
        builder.append('[');

        int length = Array.getLength(value);
        for (int i = 0; i < length; i ++) {
            Object arrayElement = Array.get(value, i);
            convertFieldValue(builder, arrayElement);
            builder.append(',');
        }

        builder.setLength(builder.length() - 1);
        builder.append(']');
        return builder;
    }

    private static StringBuilder appendCollection(StringBuilder builder, Object value) {
        builder.append('[');

        for(Object object : (Collection) value) {
            convertFieldValue(builder, object);
            builder.append(',');
        }

        builder.setLength(builder.length() - 1);
        builder.append(']');
        return builder;
    }
}

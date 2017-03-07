package io.leonardortlima;

import java.util.Collection;

/**
 * @author leonardortlima
 * @since 2017-02-24
 */
public class InstanceChecker {

    public static boolean isPrimitive(Object object) {
        return object instanceof Number || object instanceof Boolean;
    }

    public static boolean isText(Object object) {
        return object instanceof String || object instanceof Character;
    }

    public static boolean isArray(Object object) {
        return object.getClass().isArray();
    }

    public static boolean isCollection(Object object) {
        return object instanceof Collection;
    }

}

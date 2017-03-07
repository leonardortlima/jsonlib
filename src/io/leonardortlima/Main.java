package io.leonardortlima;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        User user = new User();
        user.setName("Leonardo Lima");
        user.setAge(26);
        user.setAlive(Boolean.TRUE);
        user.setPaying(false);
        user.setUpdateCount(2);
        user.setLevels(new int[]{1, 2, 3});
        user.setPermissions(new boolean[]{false, true, true});
        user.setSurnames(new String[] {"Ross", "Torquato"});
        user.setCharacters(new char[] {'l', 'r', 't', 'l'});
        user.setMovies(Arrays.asList("Matrix", "Avatar"));

        Screen screen = new Screen();
        screen.setUser(user);
        screen.setNumber(5);

        String json = Serializator.toJson(screen);
        System.out.println(json);
    }
}

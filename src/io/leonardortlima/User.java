package io.leonardortlima;

import java.util.List;

/**
 * @author leonardortlima
 * @since 2017-02-24
 */
public class User {

    private String name;

    private Integer age;

    private int updateCount;

    private Boolean isAlive;

    private boolean isPaying;

    private int[] levels;

    private boolean[] permissions;

    private String[] surnames;

    private char[] characters;

    private List<String> movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public boolean isPaying() {
        return isPaying;
    }

    public void setPaying(boolean paying) {
        isPaying = paying;
    }

    public int[] getLevels() {
        return levels;
    }

    public void setLevels(int[] levels) {
        this.levels = levels;
    }

    public boolean[] getPermissions() {
        return permissions;
    }

    public void setPermissions(boolean[] permissions) {
        this.permissions = permissions;
    }

    public String[] getSurnames() {
        return surnames;
    }

    public void setSurnames(String[] surnames) {
        this.surnames = surnames;
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", updateCount=" + updateCount +
                ", isAlive=" + isAlive +
                ", isPaying=" + isPaying +
                '}';
    }
}

package io.leonardortlima;

/**
 * @author leonardortlima
 * @since 2017-02-24
 */
public class Screen {

    private int number;

    private User user;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "number=" + number +
                ", user=" + user +
                '}';
    }
}

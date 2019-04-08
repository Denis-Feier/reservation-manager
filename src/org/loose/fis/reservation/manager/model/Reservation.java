package org.loose.fis.reservation.manager.model;

import java.util.Objects;

public class Reservation {
    private String id;
    private User user;
    private String message;

    public Reservation(User user, String message) {
        this.user = user;
        this.message = message;
    }

    @Override public String toString() {
        return "Reservation{" + "user=" + user + ", message='" + message + '\'' + '}';
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id);
    }

    @Override public int hashCode() {
        return Objects.hash(id);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

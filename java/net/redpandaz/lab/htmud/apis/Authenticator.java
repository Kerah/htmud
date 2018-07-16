package net.redpandaz.lab.htmud.apis;

public interface Authenticator {
    boolean checkPassword(String login, String password);
}

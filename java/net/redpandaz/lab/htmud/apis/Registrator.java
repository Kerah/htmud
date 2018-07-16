package net.redpandaz.lab.htmud.apis;

public interface Registrator {
    boolean register(String login, String password, String repeatPassword);
}

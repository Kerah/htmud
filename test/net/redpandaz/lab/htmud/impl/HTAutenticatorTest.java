package net.redpandaz.lab.htmud.impl;

import net.redpandaz.lab.htmud.apis.Authenticator;

class HTAutenticatorTest {
    public static void main(String[] args) {
        Authenticator auth = new HTAutenticator();

        System.out.print(
                "Хт пустил: ");
        System.out.print(
                auth.checkPassword("Sanek", "zz"));
        System.out.println();
    }
}
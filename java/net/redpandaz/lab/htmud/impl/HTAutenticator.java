package net.redpandaz.lab.htmud.impl;

import net.redpandaz.lab.htmud.apis.Authenticator;

public class HTAutenticator implements Authenticator {
    public boolean checkPassword(String login, String password) {
        boolean answer = true;

        if (!password.equals("butylka") ) {
            answer = false;
        }
        return answer;
    }
}

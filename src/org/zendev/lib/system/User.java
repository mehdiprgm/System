package org.zendev.lib.system;

public class User {

    public static String getUsername() {
        return System.getProperty("user.name");
    }

    public static String getHomeDirectory() {
        return System.getProperty("user.home");
    }

    public static String getRunPath() {
        return System.getProperty("user.dir");
    }
}

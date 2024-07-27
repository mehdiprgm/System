package org.zendev.lib.system.jvm;

/**
 * @author Mehdi Lavasani (ZENDEV)
 * @version 3.0
 * @since 17
 */
public class Java {

    /**
     * Get the default jdk version from system.
     *
     * @return Returns the default jdk version.
     */
    public static String getVersion() {
        return System.getProperty("java.runtime.version");
    }

    /**
     * Get the default jdk name from system.
     *
     * @return Returns the default jdk name.
     */
    public static String getName() {
        return System.getProperty("java.vm.name");
    }

    /**
     * Get the default jdk compile class version..
     *
     * @return Returns the default jdk compile class version...
     */
    public static String getClassVersion() {
        return System.getProperty("java.class.version");
    }
}

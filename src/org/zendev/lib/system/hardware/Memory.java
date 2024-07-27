package org.zendev.lib.system.hardware;


import org.zendev.lib.system.process.ProcessUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Mehdi Lavasani (ZENDEV)
 * @version 4.0
 * @since 17
 */
public class Memory {
    private static List<String> memoryInformation;

    static {
        try {
            memoryInformation = ProcessUtils.executeCommand("systeminfo");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getMemoryInformation(String keyword) {
        return memoryInformation.stream()
                .filter(x -> x.contains(keyword))
                .toList()
                .get(0)
                .split(":")[1]
                .trim();
    }

    public static long getTotalSpace() {
        String totalSpace = getMemoryInformation("Total Physical Memory").split("\\s+")[0].trim().replace(",", "");
        return Long.parseLong(totalSpace) * 1024 * 1024;
    }

    public static long getFreeSpace() {
        String totalSpace = getMemoryInformation("Available Physical Memory").split("\\s+")[0].trim().replace(",", "");
        return Long.parseLong(totalSpace) * 1024 * 1024;
    }

    public static long getUsedSpace() {
        return getTotalSpace() - getFreeSpace();
    }
}

package org.zendev.lib.system.hardware;

import org.zendev.lib.system.process.ProcessUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author Mehdi Lavasani (ZENDEV)
 * @version 4.0
 * @since 17
 */
public class CPU {
    public static List<String> cpuInformation;

    static {
        try {
            cpuInformation = ProcessUtils.executeCommand("powershell.exe", "Get-WmiObject", "-Class Win32_Processor",
                    "-ComputerName.", "|", "Select-Object", "-Property", "[a-z]*");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String getCpuInformation(String key) throws IOException, InterruptedException {
        return cpuInformation.stream()
                .filter(x -> x.startsWith(key))
                .toList()
                .get(0)
                .split(":")[1]
                .trim();
    }

    public static String getName() throws IOException, InterruptedException {
        return getCpuInformation("Name");
    }

    public static String getArchitecture() throws IOException, InterruptedException {
        String code = getCpuInformation("Architecture");
        return switch (code) {
            case "0" -> "x86";

            case "1" -> "MIPS";
            case "2" -> "Alpha";
            case "3" -> "PowerPC";
            case "6" -> "ia64";
            case "9" -> "x64";
            default -> "UNKNOWN";

        };
    }

    public static String getAssetTag() throws IOException, InterruptedException {
        return getCpuInformation("AssetTag");
    }

    public static String getCaption() throws IOException, InterruptedException {
        return getCpuInformation("Caption");
    }

    public static String getDeviceID() throws IOException, InterruptedException {
        return getCpuInformation("DeviceID");
    }

    public static int getNumberOfCores() throws IOException, InterruptedException {
        return Integer.parseInt(getCpuInformation("NumberOfCores"));
    }

    public static String getMaxClockSpeed() throws IOException, InterruptedException {
        return getCpuInformation("MaxClockSpeed");
    }

    public static String getCurrentClockSpeed() throws IOException, InterruptedException {
        return getCpuInformation("CurrentClockSpeed");
    }

    public static String getStatus() throws IOException, InterruptedException {
        return getCpuInformation("Status");
    }

    public static String getLoadPercentage() throws IOException, InterruptedException {
        return getCpuInformation("LoadPercentage");
    }

    public static String getCurrentVoltage() throws IOException, InterruptedException {
        return getCpuInformation("CurrentVoltage");
    }

    public static String getSocketDesignation() throws IOException, InterruptedException {
        return getCpuInformation("SocketDesignation");
    }

    public static String getDescription() throws IOException, InterruptedException {
        return getCpuInformation("Description");
    }

    public static String getManufacturer() throws IOException, InterruptedException {
        return getCpuInformation("Manufacturer");
    }

    public static String getProcessorId() throws IOException, InterruptedException {
        return getCpuInformation("ProcessorId");
    }
}

package org.zendev.lib.system.process;

import org.zendev.lib.system.options.RunningProcessesFormat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mehdi Lavasani (ZENDEV)
 * @version 4.0
 * @since 17
 */
public class ProcessUtils {

    public static boolean isCommandExecutedSuccessfully(String... command) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(command);

        Process process = processBuilder.start();
        process.waitFor();

        return true;
    }

    public static List<String> executeCommand(String... command) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(command);

        List<String> output = new ArrayList<>();

        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            output.add(line);
        }

        process.waitFor();
        return output;
    }

    public static List<String> getAllRunningProcess(RunningProcessesFormat format) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();

        if (format == null) {
            processBuilder.command("tasklist.exe");
        } else {
            switch (format) {
                case TABLE -> processBuilder.command("tasklist.exe");
                case CSV -> processBuilder.command("tasklist.exe", "/FO", "CSV");
            }
        }

        List<String> output = new ArrayList<>();

        Process process = processBuilder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            output.add(line);
        }

        process.waitFor();
        return output;
    }
}

package org.zendev.lib.system.hardware;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PartitionManager {

    public static List<Partition> getAllPartitions(boolean mounted) {
        List<Partition> partitions = new ArrayList<>();

        for (File f : File.listRoots()) {
            if (mounted) {
                if (f.canRead()) {
                    partitions.add(new Partition(f.getAbsolutePath()));
                }
            } else {
                partitions.add(new Partition(f.getAbsolutePath()));
            }
        }

        return partitions;
    }
}

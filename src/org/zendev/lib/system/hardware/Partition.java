package org.zendev.lib.system.hardware;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

/**
 * @author Mehdi Lavasani (ZENDEV)
 * @version 4.0
 * @since 17
 */
public class Partition {
    private FileSystemView fileSystemView;
    private String partition;

    public Partition(String partition) {
        this.partition = partition;
        this.fileSystemView = FileSystemView.getFileSystemView();
    }

    public String getDisplayName() {
        return fileSystemView.getSystemDisplayName(new File(partition));
    }

    public boolean isDrive() {
        return fileSystemView.isDrive(new File(partition));
    }

    public boolean isFloppy() {
        return fileSystemView.isFloppyDrive(new File(partition));
    }

    public boolean isReadable() {
        return new File(partition).canRead();
    }

    public boolean isWritable() {
        return new File(partition).canWrite();
    }

    public long getTotalSpace() {
        return new File(partition).getTotalSpace();
    }

    public long getFreeSpace() {
        return new File(partition).getUsableSpace();
    }

    public long getUsedSpace() {
        return new File(partition).getTotalSpace() - new File(partition).getUsableSpace();
    }

    public FileSystemView getFileSystemView() {
        return fileSystemView;
    }

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    @Override
    public String toString() {
        return "Partition{" +
                "fileSystemView=" + fileSystemView +
                ", partition='" + partition + '\'' +
                '}';
    }
}

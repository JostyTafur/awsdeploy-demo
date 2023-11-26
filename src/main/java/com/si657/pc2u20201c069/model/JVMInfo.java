package com.si657.pc2u20201c069.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JVMInfo {
    private int cpus;
    private long mmax;
    private long mtotal;
    private long mfree;
    private double elapseTime;
    private double spaceTotalC;
    private double spaceFreeC;

    public void retrieveJVMData() {
        long start = System.nanoTime();
        Runtime runtime = Runtime.getRuntime();
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

        this.cpus = runtime.availableProcessors();
        this.mmax = runtime.maxMemory() / 1024 / 1024;
        this.mtotal = runtime.totalMemory() / 1024 / 1024;
        this.mfree = runtime.freeMemory() / 1024 / 1024;

        File cDrive = new File("C:");

        this.elapseTime = (System.nanoTime() - start) / 1_000_000_000.0;

        this.spaceTotalC = (double) cDrive.getTotalSpace() / 1073741824;
        this.spaceFreeC = (double) cDrive.getFreeSpace() / 1073741824;
    }
}

package org.example.Creational.Singleton;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger logger = null;

    private static File logFile = null;
    private static BufferedWriter bufferedWriter = null;
    private static FileWriter fileWriter = null;

    private Logger() {
        createNewLog("default.txt");
    }

    public static synchronized Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public synchronized void setFileName(String fileName) {
        close();
        createNewLog(fileName);
    }

    public synchronized void write(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void close() {
        try {
            fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void createNewLog(String fileName) {
        try {
            logFile = new File(fileName);
            fileWriter = new FileWriter(fileName, true); //true = continue the previous log and do not override.
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


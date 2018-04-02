package com.poc.lombok;

import lombok.Cleanup;
import lombok.extern.java.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Log
public class CleanUpClass {

    public static void useInputStream() throws IOException {
        Properties properties = new Properties();
        @Cleanup
        InputStream in = new FileInputStream("/home/simar/intellij_projects/lombok/src/main/resources/application.conf");
        properties.load(in);
        String key = properties.getProperty("private_key");
        log.info("key: " + key);
    }

    public static void main(String[] args) throws IOException {
        CleanUpClass.useInputStream();
    }
}

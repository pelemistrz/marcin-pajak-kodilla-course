package com.kodilla.patterns.singleton;

public enum Logger {
    LOG;

    private String lastLog = "";

    public void setLog(final String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}

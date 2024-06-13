package com.convertor.constants;

public enum FileFormatType {

    CSV("Workbook2.csv"), PRN("Workbook2.prn");

    private final String fileName;

    FileFormatType(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }
}

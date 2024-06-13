package com.convertor.dto;

import java.util.List;

import static com.convertor.constants.Constants.HTML_FILE;

public class WorkbookDTO {

    private final String source;
    private final String outputFileName;
    private final List<PersonDetails> personDetails;

    public WorkbookDTO(String source, List<PersonDetails> personDetails) {
        this.source = source;
        this.outputFileName = HTML_FILE;
        this.personDetails = personDetails;
    }

    public String getSource() {
        return source;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public List<PersonDetails> getPersonDetails() {
        return personDetails;
    }
}

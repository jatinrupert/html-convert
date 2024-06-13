package com.convertor.input;

import com.convertor.constants.FileFormatType;
import com.convertor.dto.PersonDetails;
import com.convertor.dto.WorkbookDTO;

import java.util.List;

public interface InputProcessor {

    default WorkbookDTO buildWorkbookDTO(List<PersonDetails> personDetails, FileFormatType fileFormatType) {
        return new WorkbookDTO(fileFormatType.name(), personDetails);
    }

    WorkbookDTO process();
}

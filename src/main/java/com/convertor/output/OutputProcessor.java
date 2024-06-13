package com.convertor.output;

import com.convertor.dto.WorkbookDTO;

public interface OutputProcessor {

    void process(WorkbookDTO workbookDTO);
}

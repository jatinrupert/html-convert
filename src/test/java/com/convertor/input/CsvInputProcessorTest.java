package com.convertor.input;

import com.convertor.dto.WorkbookDTO;
import org.junit.Assert;
import org.junit.Test;

public class CsvInputProcessorTest {

    private final InputProcessor inputProcessor = new CsvInputProcessor();

    @Test
    public void testWrite() {
        final WorkbookDTO workbookDTO = inputProcessor.process();
        Assert.assertEquals("CSV", workbookDTO.getSource());
        Assert.assertEquals(7, workbookDTO.getPersonDetails().size());
        Assert.assertEquals("Johnson, John", workbookDTO.getPersonDetails().get(0).getName());
        Assert.assertEquals("Børkestraße 32", workbookDTO.getPersonDetails().get(6).getAddress());
    }
}

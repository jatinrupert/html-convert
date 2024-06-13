package com.convertor.output;

import com.convertor.dto.PersonDetails;
import com.convertor.dto.WorkbookDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import static com.convertor.constants.Constants.HTML_FILE;

public class HtmlOutputProcessorTest {

    private final OutputProcessor outputProcessor = new HtmlOutputProcessor();

    @Before
    public void setup() throws IOException {
        File file = new File(HTML_FILE);
        Files.deleteIfExists(file.toPath());
    }

    @Test
    public void testWrite() {
        File f = new File(HTML_FILE);
        Assert.assertFalse(f.exists() && !f.isDirectory());
        final List<PersonDetails> personDetails = Arrays.asList(new PersonDetails("Johnson, John", "Voorstraat 32", "3122gg", "020 3849381", "1000000", "19870101"));
        final WorkbookDTO workbookDTO = new WorkbookDTO("PRN", personDetails);
        outputProcessor.process(workbookDTO);
        Assert.assertTrue(f.exists() && !f.isDirectory());
    }
}

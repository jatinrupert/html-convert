package com.convertor.input;

import com.convertor.constants.FileProcessException;
import com.convertor.dto.PersonDetails;
import com.convertor.dto.WorkbookDTO;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static com.convertor.constants.FileFormatType.CSV;

public class CsvInputProcessor implements InputProcessor {

    @Override
    public WorkbookDTO process() {
        final List<PersonDetails> personDetails = new ArrayList<>();
        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(CSV.getFileName(), StandardCharsets.ISO_8859_1)).withSkipLines(1).build()) {
            String[] values;
            final AtomicInteger index = new AtomicInteger(0);
            while ((values = csvReader.readNext()) != null) {
                index.incrementAndGet();
                if(values.length != 6) {
                    throw new FileProcessException("Rows do not match the expected value of 6, and are of size" + values.length
                     + ". This is for the row : " + index.get());
                }
                personDetails.add(new PersonDetails(values[0], values[1], values[2], values[3], values[4], values[5]));
            }
        }
        catch (CsvValidationException | IOException exception) {
            throw new FileProcessException(exception);
        }

        return buildWorkbookDTO(personDetails, CSV);
    }


}

package com.convertor.output;

import com.convertor.constants.FileProcessException;
import com.convertor.dto.PersonDetails;
import com.convertor.dto.WorkbookDTO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HtmlOutputProcessor implements OutputProcessor{

    @Override
    public void process(WorkbookDTO workbookDTO) {
        List<String> list = new ArrayList<>();

        String documentPre = "<html><style> table, th, td { border: 1px solid black; </style> </head> <body>";
        list.add(documentPre);

        String headerColumn = "<table> <tr> <th>Name</th> <th>Address</th> <th>Post Code</th> <th>Phone</th> </tr>";
        list.add(headerColumn);

        for(PersonDetails person : workbookDTO.getPersonDetails()) {
            String htmlColumn = "<tr> <td>"+person.getName()+"</td> <td>"+person.getAddress()+"<td>"+person.getPostcode()+"<td>"
                    +person.getPhone()+"</td>";
            list.add(htmlColumn);
        }

        String documentPost = " </table></body></html>";
        list.add(documentPost );

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(workbookDTO.getOutputFileName()))) {
            for (String html : list) {
                bw.write(html);
            }
        }
        catch (IOException ioException) {
            throw new FileProcessException(ioException);
        }

    }
}

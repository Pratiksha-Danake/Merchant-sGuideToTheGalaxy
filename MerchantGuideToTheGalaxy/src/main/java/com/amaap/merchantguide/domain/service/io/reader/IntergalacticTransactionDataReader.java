package com.amaap.merchantguide.domain.service.io.reader;

import com.amaap.merchantguide.domain.service.io.reader.extractor.IntergalacticUnitExtractor;
import com.amaap.merchantguide.domain.service.io.reader.extractor.MetalValueExtractor;
import com.amaap.merchantguide.domain.service.io.reader.extractor.QueryExtracter;
import com.amaap.merchantguide.domain.service.io.reader.validator.InputLineValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntergalacticTransactionDataReader {
    private final InputLineValidator inputLineValidator;

    public IntergalacticTransactionDataReader(InputLineValidator inputLineValidator) {
        this.inputLineValidator = inputLineValidator;
    }

    public boolean readTransactionData(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (inputLineValidator.isValidUnitLine(line))
                    IntergalacticUnitExtractor.getIntergalacticUnit(line);
                else if (inputLineValidator.isValidMetalCreditLine(line))
                    MetalValueExtractor.getMetalAndValue(line);
                else if (inputLineValidator.isValidQueryLine(line))
                    QueryExtracter.getQuery(line);
//                else
//                    throw new InvalidInputDataLineException("Not Useful Data Found..!");
            }
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return true;
    }
}

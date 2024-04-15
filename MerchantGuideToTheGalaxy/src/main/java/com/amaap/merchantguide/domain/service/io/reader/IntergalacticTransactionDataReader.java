package com.amaap.merchantguide.domain.service.io.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntergalacticTransactionDataReader {
    public boolean readTransactionData(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return true;
    }
}

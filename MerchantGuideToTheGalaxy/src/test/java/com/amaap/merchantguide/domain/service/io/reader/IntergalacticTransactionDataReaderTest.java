package com.amaap.merchantguide.domain.service.io.reader;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class IntergalacticTransactionDataReaderTest {
    @Test
    void shouldBeAbleToReturnTrueIfGetsReadIntergalacticTransactionDataFile() throws IOException {
        // arrange
        File file = new File("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\test\\java\\com\\amaap\\merchantguide\\IntergalacticTransactionData");
        IntergalacticTransactionDataReader intergalacticTransactionDataReader = new IntergalacticTransactionDataReader();

        // act && assert
        assertTrue(intergalacticTransactionDataReader.readTransactionData(file));
    }

    @Test
    void shouldThrowIOExceptionWhenFailsToReadIntergalacticTransactionDataFile() throws IOException {
        // arrange
        File file = new File("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\test\\java\\com\\amaap\\merchantguide\\config\\IntergalacticTransactionData");
        IntergalacticTransactionDataReader intergalacticTransactionDataReader = new IntergalacticTransactionDataReader();

        // act && assert
        assertThrows(IOException.class,()->intergalacticTransactionDataReader.readTransactionData(file));
    }
}
package com.amaap.merchantguide.config;

import com.amaap.merchantguide.domain.service.io.reader.IntergalacticTransactionDataReader;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntergalacticTransactionDataReaderTest {

    @Test
    void shouldBeAbleToReadIntergalacticTransactionData() {
        // arrange
        File file = new File("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\test\\java\\com\\amaap\\merchantguide\\config\\IntergalacticTransactionData");
        IntergalacticTransactionDataReader intergalacticTransactionDataReader = new IntergalacticTransactionDataReader();

        // act && assert
        assertTrue(intergalacticTransactionDataReader.readTransactionData(file));
    }
}
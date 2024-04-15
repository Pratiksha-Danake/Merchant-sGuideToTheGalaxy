package com.amaap.merchantguide.domain.service.io.reader;

import com.amaap.merchantguide.domain.service.io.reader.validator.InputLineValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntergalacticTransactionDataReaderTest {
    IntergalacticTransactionDataReader intergalacticTransactionDataReader;

    @BeforeAll
    void setUp() {
        intergalacticTransactionDataReader = new IntergalacticTransactionDataReader(new InputLineValidator());
    }

    @Test
    void shouldBeAbleToReturnTrueIfGetsReadIntergalacticTransactionDataFile() throws IOException {
        // arrange
        File file = new File("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\test\\java\\com\\amaap\\merchantguide\\IntergalacticTransactionData");

        // act && assert
        assertTrue(intergalacticTransactionDataReader.readTransactionData(file));
    }

    @Test
    void shouldThrowIOExceptionWhenFailsToReadIntergalacticTransactionDataFile() throws IOException {
        // arrange
        File file = new File("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\test\\java\\com\\amaap\\merchantguide\\config\\IntergalacticTransactionData");

        // act && assert
        assertThrows(IOException.class, () -> intergalacticTransactionDataReader.readTransactionData(file));
    }

//    @Test
//    void shouldThrowInvalidInputDataLineExceptionWhenLineDoesNotMatchWithAnyDataFormat() throws IOException {
//        // arrange
//        File file = new File("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\test\\java\\com\\amaap\\merchantguide\\IntergalacticTransactionData");
//
//        // act && assert
//        assertThrows(InvalidInputDataLineException.class, () -> intergalacticTransactionDataReader.readTransactionData(file));
//    }
}
package com.amaap.merchantguide.domain.service.io.reader.extractor;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntergalacticUnitExtractorTest {
    @Test
    void shouldBeAbleToReturnIntergalacticUnitObjectByExtractingItFromInputLine() {
        // arrange
        String lineContainsUnitData = "glob is I";
        String intergalacticUnitName = "glob";
        String romanValue = "I";
        IntergalacticUnit expectedIntergalacticUnit = IntergalacticUnit.create(intergalacticUnitName, romanValue);

        // act
        IntergalacticUnit actualIntergalacticUnit = IntergalacticUnitExtractor.getIntergalacticUnit(lineContainsUnitData);

        // assert
        assertEquals(expectedIntergalacticUnit, actualIntergalacticUnit);
    }
}
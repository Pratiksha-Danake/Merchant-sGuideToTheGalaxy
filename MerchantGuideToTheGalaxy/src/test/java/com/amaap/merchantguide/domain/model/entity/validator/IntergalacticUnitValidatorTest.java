package com.amaap.merchantguide.domain.model.entity.validator;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntergalacticUnitValidatorTest {
    @Test
    void shouldBeAbleReturnTrueIfTheIntergalacticUnitIsValid() throws FileNotFoundException {
        // arrange
        IntergalacticUnit intergalacticUnitToValidate = IntergalacticUnit.create("glob", "I");

        // act && assert
        assertTrue(IntergalacticUnitValidator.isValidIntergalacticUnit(intergalacticUnitToValidate));
    }
}
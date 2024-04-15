package com.amaap.merchantguide.service;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntergalacticUnitServiceTest {
    IntergalacticUnitService intergalacticUnitService = new IntergalacticUnitService();
    @Test
    void shouldBeAbleToAddIntergalacticUnit(){
        // arrange
        IntergalacticUnit intergalacticUnitToAdd = IntergalacticUnit.create("glob", "I");

        // act && assert
        assertTrue(intergalacticUnitService.addIntergalacticUnit(intergalacticUnitToAdd));
    }
}
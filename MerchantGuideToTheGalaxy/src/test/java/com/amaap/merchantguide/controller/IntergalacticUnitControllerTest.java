package com.amaap.merchantguide.controller;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.domain.model.valueobject.HttpStatus;
import com.amaap.merchantguide.domain.model.valueobject.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntergalacticUnitControllerTest {
    IntergalacticUnitController intergalacticUnitController = new IntergalacticUnitController();

    @Test
    void shouldBeAbleToReturnResponseAsOKIfAddsIntergalacticUnit() {
        // arrange
        IntergalacticUnit intergalacticUnitToAdd = IntergalacticUnit.create("glob", "I");
        Response expected = new Response(HttpStatus.OK, "Added New Unit");

        // act
        Response actual = intergalacticUnitController.addIntergalacticUnit(intergalacticUnitToAdd);

        // assert
        assertEquals(expected, actual);
    }
}
package com.amaap.merchantguide.controller;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.domain.model.valueobject.HttpStatus;
import com.amaap.merchantguide.domain.model.valueobject.Response;
import com.amaap.merchantguide.repository.IntergalacticUnitRepository;
import com.amaap.merchantguide.repository.db.InMemoryDatabase;
import com.amaap.merchantguide.repository.db.impl.FakeInMemoryDatabase;
import com.amaap.merchantguide.repository.impl.InMemoryIntergalacticUnitRepository;
import com.amaap.merchantguide.service.IntergalacticUnitService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntergalacticUnitControllerTest {
    InMemoryDatabase inMemoryDatabase = new FakeInMemoryDatabase();
    IntergalacticUnitRepository intergalacticUnitRepository =
            new InMemoryIntergalacticUnitRepository(inMemoryDatabase);
    IntergalacticUnitService intergalacticUnitService =
            new IntergalacticUnitService(intergalacticUnitRepository);
    IntergalacticUnitController intergalacticUnitController =
            new IntergalacticUnitController(intergalacticUnitService);

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
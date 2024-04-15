package com.amaap.merchantguide.service;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.repository.IntergalacticUnitRepository;
import com.amaap.merchantguide.repository.db.InMemoryDatabase;
import com.amaap.merchantguide.repository.db.impl.FakeInMemoryDatabase;
import com.amaap.merchantguide.repository.impl.InMemoryIntergalacticUnitRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntergalacticUnitServiceTest {
    InMemoryDatabase inMemoryDatabase = new FakeInMemoryDatabase();
    IntergalacticUnitRepository intergalacticUnitRepository = new InMemoryIntergalacticUnitRepository(inMemoryDatabase);
    IntergalacticUnitService intergalacticUnitService = new IntergalacticUnitService(intergalacticUnitRepository);

    @Test
    void shouldBeAbleToAddIntergalacticUnit() {
        // arrange
        IntergalacticUnit intergalacticUnitToAdd = IntergalacticUnit.create("glob", "I");

        // act && assert
        assertTrue(intergalacticUnitService.addIntergalacticUnit(intergalacticUnitToAdd));
    }
}
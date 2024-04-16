package com.amaap.merchantguide.repository.impl;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.repository.IntergalacticUnitRepository;
import com.amaap.merchantguide.repository.db.InMemoryDatabase;
import com.amaap.merchantguide.repository.db.impl.FakeInMemoryDatabase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class InMemoryIntergalacticUnitRepositoryTest {
    InMemoryDatabase inMemoryDatabase = new FakeInMemoryDatabase();
    IntergalacticUnitRepository intergalacticUnitRepository =
            new InMemoryIntergalacticUnitRepository(inMemoryDatabase);

    @Test
    void shouldBeAbleToAddIntergalacticUnitToDatabase() {
        // arrange
        IntergalacticUnit intergalacticUnitToAdd = IntergalacticUnit.create("glob", "I");

        // act && assert
        assertTrue(intergalacticUnitRepository.addIntergalacticUnit(intergalacticUnitToAdd));
    }
}
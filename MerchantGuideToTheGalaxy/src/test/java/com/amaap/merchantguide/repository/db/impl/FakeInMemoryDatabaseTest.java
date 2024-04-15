package com.amaap.merchantguide.repository.db.impl;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FakeInMemoryDatabaseTest {
    FakeInMemoryDatabase fakeInMemoryDatabase = new FakeInMemoryDatabase();
    @Test
    void shouldBeAbleToAddIntergalacticUnit() {
        // arrange
        IntergalacticUnit intergalacticUnitToAdd = IntergalacticUnit.create("glob", "I");

        // act && assert
        assertTrue(fakeInMemoryDatabase.addIntergalacticUnit(intergalacticUnitToAdd));
    }
}
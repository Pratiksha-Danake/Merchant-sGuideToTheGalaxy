package com.amaap.merchantguide.repository.impl;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.repository.IntergalacticUnitRepository;
import com.amaap.merchantguide.repository.db.InMemoryDatabase;

public class InMemoryIntergalacticUnitRepository implements IntergalacticUnitRepository {
    private InMemoryDatabase inMemoryDatabase;

    public InMemoryIntergalacticUnitRepository(InMemoryDatabase inMemoryDatabase) {
        this.inMemoryDatabase = inMemoryDatabase;
    }

    @Override
    public boolean addIntergalacticUnit(IntergalacticUnit intergalacticUnitToAdd) {
        return inMemoryDatabase.addIntergalacticUnit(intergalacticUnitToAdd);
    }
}

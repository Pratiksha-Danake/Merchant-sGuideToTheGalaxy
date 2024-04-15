package com.amaap.merchantguide.repository.db.impl;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.repository.db.InMemoryDatabase;

import java.util.ArrayList;
import java.util.List;

public class FakeInMemoryDatabase implements InMemoryDatabase {
    List<IntergalacticUnit> intergalacticUnits = new ArrayList<>();
    @Override
    public boolean addIntergalacticUnit(IntergalacticUnit intergalacticUnitToAdd) {
        if (intergalacticUnits.add(intergalacticUnitToAdd))
            return true;
        return false;
    }
}

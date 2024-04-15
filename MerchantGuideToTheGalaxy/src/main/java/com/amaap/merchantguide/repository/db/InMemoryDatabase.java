package com.amaap.merchantguide.repository.db;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;

public interface InMemoryDatabase {

    boolean addIntergalacticUnit(IntergalacticUnit intergalacticUnitToAdd);
}

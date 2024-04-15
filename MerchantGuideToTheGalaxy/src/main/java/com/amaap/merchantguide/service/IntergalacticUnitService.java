package com.amaap.merchantguide.service;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.repository.IntergalacticUnitRepository;

public class IntergalacticUnitService {
    private IntergalacticUnitRepository intergalacticUnitRepository;


    public IntergalacticUnitService(IntergalacticUnitRepository intergalacticUnitRepository) {
        this.intergalacticUnitRepository = intergalacticUnitRepository;
    }

    public boolean addIntergalacticUnit(IntergalacticUnit intergalacticUnitToAdd) {
        intergalacticUnitRepository.addIntergalacticUnit(intergalacticUnitToAdd);
        return true;
    }
}

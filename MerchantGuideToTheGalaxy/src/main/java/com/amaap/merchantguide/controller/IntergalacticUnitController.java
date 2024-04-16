package com.amaap.merchantguide.controller;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.domain.model.valueobject.HttpStatus;
import com.amaap.merchantguide.domain.model.valueobject.Response;
import com.amaap.merchantguide.service.IntergalacticUnitService;

public class IntergalacticUnitController {
    private final IntergalacticUnitService intergalacticUnitService;

    public IntergalacticUnitController(IntergalacticUnitService intergalacticUnitService) {
        this.intergalacticUnitService = intergalacticUnitService;
    }

    public Response addIntergalacticUnit(IntergalacticUnit intergalacticUnitToAdd) {
        if (intergalacticUnitService.addIntergalacticUnit(intergalacticUnitToAdd))
            return new Response(HttpStatus.OK, "Added New Unit");
        else
            return new Response(HttpStatus.BAD_REQUEST, "Already Added");
    }
}

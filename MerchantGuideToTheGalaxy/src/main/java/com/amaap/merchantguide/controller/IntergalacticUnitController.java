package com.amaap.merchantguide.controller;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import com.amaap.merchantguide.domain.model.valueobject.HttpStatus;
import com.amaap.merchantguide.domain.model.valueobject.Response;
import com.amaap.merchantguide.domain.service.IntergalacticUnitService;

public class IntergalacticUnitController {

    public Response addIntergalacticUnit(IntergalacticUnit intergalacticUnitToAdd) {
        return new Response(HttpStatus.OK,"Added New Unit");
    }
}

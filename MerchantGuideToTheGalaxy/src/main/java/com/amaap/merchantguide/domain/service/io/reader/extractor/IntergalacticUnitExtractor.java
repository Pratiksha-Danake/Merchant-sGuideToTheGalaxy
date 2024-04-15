package com.amaap.merchantguide.domain.service.io.reader.extractor;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;

public class IntergalacticUnitExtractor {

    public static IntergalacticUnit getIntergalacticUnit(String line) {
        String[] unitParts = line.split("is");
        String unitName = unitParts[0].strip();
        String romanValue = unitParts[1].strip();
        return IntergalacticUnit.create(unitName, romanValue);
    }
}

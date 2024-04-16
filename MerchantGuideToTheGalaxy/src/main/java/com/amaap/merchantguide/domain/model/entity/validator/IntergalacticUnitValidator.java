package com.amaap.merchantguide.domain.model.entity.validator;

import com.amaap.merchantguide.domain.model.entity.IntergalacticUnit;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class IntergalacticUnitValidator {
    public static boolean isValidIntergalacticUnit(IntergalacticUnit intergalacticUnitToValidate) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        FileInputStream inputStream = new FileInputStream("E:\\MerchantGuideToTheGalaxy\\MerchantGuideToTheGalaxy\\src\\main\\java\\com\\amaap\\merchantguide\\domain\\config\\GalaxyData.yaml");
        Map<String, List<String>> yamlData = yaml.load(inputStream);
        List<String> intergalacticUnits = yamlData.get("intergalacticUnits");
        return intergalacticUnits.contains(intergalacticUnitToValidate.getName());
    }
}

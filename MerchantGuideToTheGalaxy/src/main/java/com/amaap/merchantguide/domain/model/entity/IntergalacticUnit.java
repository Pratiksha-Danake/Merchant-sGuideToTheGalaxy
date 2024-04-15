package com.amaap.merchantguide.domain.model.entity;

import java.util.Objects;

public class IntergalacticUnit {
    private final String name;
    private final String romanValue;

    public IntergalacticUnit(String name, String romanValue) {
        this.name = name;
        this.romanValue = romanValue;
    }

    public static IntergalacticUnit create(String intergalacticUnitName, String romanValue) {
        return new IntergalacticUnit(intergalacticUnitName, romanValue);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntergalacticUnit that = (IntergalacticUnit) o;
        return Objects.equals(name, that.name) && Objects.equals(romanValue, that.romanValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, romanValue);
    }
}

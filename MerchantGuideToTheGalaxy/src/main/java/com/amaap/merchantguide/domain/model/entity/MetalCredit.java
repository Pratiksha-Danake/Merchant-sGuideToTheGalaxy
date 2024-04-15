package com.amaap.merchantguide.domain.model.entity;

import java.util.Objects;

public class MetalCredit {
    private final String metalName;
    private final int metalValue;

    public MetalCredit(String metalName, int metalValue) {
        this.metalName = metalName;
        this.metalValue = metalValue;
    }

    public static MetalCredit create(String metalName, int metalValue) {
        return new MetalCredit(metalName, metalValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetalCredit that = (MetalCredit) o;
        return metalValue == that.metalValue && Objects.equals(metalName, that.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metalName, metalValue);
    }
}

package com.bumptech.glide;

public enum i {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float multiplier;

    private i(float f10) {
        this.multiplier = f10;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}

package com.example.interfaze;

public class Vegetable extends Product implements Expirable {
    private long expiryDate;

    private long harvest;

    @Override
    public long getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public long getHarvest() {
        return harvest;
    }

    public void setHarvest(long harvest) {
        this.harvest = harvest;
    }

    @Override
    public float getDiscount() {
        return 0.2f;
    }
}

package com.example.abztract.clazz;

public class Chips extends Product{
    private long expiryDate;

    private long packDate;

    public long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }

    public long getPackDate() {
        return packDate;
    }

    public void setPackDate(long packDate) {
        this.packDate = packDate;
    }

    @Override
    public float getDiscount() {
        return 0;
    }
}

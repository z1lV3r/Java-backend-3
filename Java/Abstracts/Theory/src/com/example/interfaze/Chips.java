package com.example.interfaze;

import com.example.abztract.clazz.Product;

public class Chips extends Product implements Expirable{
    private long expiryDate;

    private long packDate;

    @Override
    public long getExpiryDate() {
        return expiryDate;
    }

    @Override
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

package com.example.abztract.clazz;

public abstract class Product {
    private String name;
    protected float price;
    private String provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price - price * getDiscount();
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public abstract float getDiscount();
}

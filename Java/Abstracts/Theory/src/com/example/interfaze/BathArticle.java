package com.example.interfaze;

public class BathArticle extends Product {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public float getDiscount() {
        return 0.1f;
    }
}

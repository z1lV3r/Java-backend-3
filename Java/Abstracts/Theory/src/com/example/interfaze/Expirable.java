package com.example.interfaze;

public interface Expirable extends BaseInterface, SecondInterface {

    public long getExpiryDate();

    public void setExpiryDate(long expiryDate);
}

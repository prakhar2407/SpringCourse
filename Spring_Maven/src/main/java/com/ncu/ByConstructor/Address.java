package com.ncu.ByConstructor;

public class Address {
    private int pinCode;

    @Override
    public String toString(){
        return "Pincode : "+ pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

package com.ncu.ByType;

public class Address {
    private int pinCode;

    @Override
    public String toString(){
        return "Pin Code : "+pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

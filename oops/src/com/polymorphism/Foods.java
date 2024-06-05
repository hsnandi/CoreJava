package com.polymorphism;

public class Foods extends Products {
    private String expiryDate;
    private boolean veg;

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public boolean isVeg() {
        return veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    @Override
    public String toString() {
        return "Foods [expiryDate=" + expiryDate + ", veg=" + veg + ", brand=" + getBrand() + ", price=" + getPrice()
                + "]";
    }
}


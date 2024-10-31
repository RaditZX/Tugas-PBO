package com.example;

public class Passenger {
    private String name;
    private boolean Vip;

    public Passenger( String name, boolean VIP){
        this.name =name;
        this.Vip = VIP;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return Vip;
    }

    
}

package com.polban.jtk.jadwal;

public class Dosen extends Person{
    private String nip;

    public Dosen(String nama, int age,  String nip) {
        super(nama,age);
        this.nip = nip;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
}

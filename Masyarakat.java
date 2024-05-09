package com.mycompany.main_lelang;

import java.util.ArrayList;

public class Masyarakat implements User {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Masyarakat() {
        this.namaMasyarakat.add("Sarah");
        this.alamat.add("Malang");
        this.telepon.add("0813345322148");

        this.namaMasyarakat.add("Lia");
        this.alamat.add("Jakarta");
        this.telepon.add("0859873456213");

    }

    public int getJmlMasyarakat() {
        return this.namaMasyarakat.size();
    }

    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }
}

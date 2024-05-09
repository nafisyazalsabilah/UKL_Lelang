package com.mycompany.main_lelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Barang {

    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang : ");
        this.namaBarang.add(scan.next());
        System.out.print("Masukkan Harga Awal  : ");
        this.hargaAwal.add(scan.nextInt());
        System.out.print("Masukkan Status Awal : ");
        this.status.add(scan.nextBoolean());
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setIdMasyarakat(int idMasyarakat) {
        this.idMasyarakat.add(idMasyarakat);
    }

    public int getIdMasyarakat(int idMasyarakat) {
        return this.idMasyarakat.get(idMasyarakat);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idMasyarakat) {
        return this.namaBarang.get(idMasyarakat);
    }

    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal.add(hargaAwal);
    }

    public int getHargaAwal(int idBarang) {
        return this.hargaAwal.get(idBarang);
    }

    public void setStatus(Boolean status) {
        this.status.add(status);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    public void editStatus(int idBarang, boolean status) {
        this.status.set(idBarang, status);
    }
}

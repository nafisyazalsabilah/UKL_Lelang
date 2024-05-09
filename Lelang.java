package com.mycompany.main_lelang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lelang {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    public Lelang() {
        this.idMasyarakat.add(0);
        this.idBarang.add(0);
        this.hargaTawar.add(0);

        this.idMasyarakat.add(0);
        this.idBarang.add(0);
        this.hargaTawar.add(0);
    }

    public void setHargaTawar(int hargaTawar) {
        this.hargaTawar.add(hargaTawar);
    }

    public int hargaTawar(int idMasyarakat) {
        return this.hargaTawar.get(idMasyarakat);
    }

    public void editHargaTawar(int idMasyarakat, int hargaTawar) {
        this.hargaTawar.set(idMasyarakat, hargaTawar);
    }

    public void prosesLelang(Masyarakat masyarakat, Lelang lelang, Barang barang) {
        System.out.println("========================");
        System.out.println("Silahkan Melelang Barang");
        System.out.println("========================");
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        int i = 0;
        int idMasyarakat = 0;
        String temp;
        if (barang.getStatus(i) == true) {
            do {
                System.out.println("Apakah ada harga penawaran terbaru? [yes/no]");
                temp = scan.next();
                if ("yes".equals(temp)) {
                    System.out.print("Masukkan ID Penawar : ");
                    idMasyarakat = scan.nextInt();
                    System.out.println("Selamat Datang " + masyarakat.getNama(idMasyarakat));
                    System.out.print("Masukkan harga tawar : ");
                    int hargaTawar = scan.nextInt();
                    editHargaTawar(idMasyarakat, hargaTawar);
                    System.out.println(" ");
                    i++;
                }
            } while (!"no".equals(temp));
            System.out.println("============================");
            System.out.println("Hasil lelang sebagai berikut");
            System.out.println("============================");
            System.out.println("Nama Masyarakat \t\tNama Barang \tHarga Tawar \t");
            int x = hargaTawar.size();
            for (int j = 0; j < x; j++) {
                System.out.println(masyarakat.getNama(j) + "\t\t\t" + barang.getNamaBarang(0) + "\t\t" + hargaTawar.get(j));
            }
            int max = Collections.max(hargaTawar);
            int maxId = hargaTawar.indexOf(max);
            System.out.println(" ");
            System.out.println("================================================================================================");
            System.out.println("Pemenang lelang adalah dengan harga tawar : Rp" + max + " atas nama " + masyarakat.getNama(maxId));
            System.out.println("================================================================================================");
            System.out.println(" ");
            System.out.println("Barang sudah tidak dapat dilelang");
            barang.editStatus(0, false);
            System.out.println("Status barang saat ini : " + barang.getStatus(0));
            System.out.println("================================");
        } else {
            System.out.println("Barang tidak dapat dilelang");
        }
    }

    public void setLelang(Barang barang, int idMasyarakat, int idBarang, int hargaTawar) {
        this.idMasyarakat.add(idMasyarakat);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
    }

    public int getIdBarang(int id) {
        return this.idBarang.get(id);
    }

    public int getHargaTawar(int id) {
        return this.hargaTawar.get(id);
    }

    public int getIdMasyarakat(int id) {
        return this.idMasyarakat.get(id);
    }

    public int getJmlLelang() {
        return this.hargaTawar.size();
    }
}


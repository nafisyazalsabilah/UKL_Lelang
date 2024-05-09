package com.mycompany.main_lelang;

/**
 *
 * @author NAFISYA
 */
public class Laporan {

public void laporan(Barang barang) {
        int x = barang.getJmlBarang();

        System.out.println();
        System.out.println("===============================");
        System.out.println("\tTabel Barang");
        System.out.println("===============================");
        System.out.println("Nama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(barang.getNamaBarang(i) + "\t\t" + barang.getHargaAwal(i) + "\t\t" + barang.getStatus(i));
        }
    }

    public void laporan(Masyarakat masyarakat) {
        int x = masyarakat.getJmlMasyarakat();

        System.out.println();
        System.out.println("===============================");
        System.out.println("\tTabel Penawar");
        System.out.println("===============================");
        System.out.println("Nama \tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(masyarakat.getNama(i) + "\t" + masyarakat.getAlamat(i) + "\t\t" + masyarakat.getTelepon(i));
        }
    }

    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println();
        System.out.println("===============================");
        System.out.println("\tTabel Petugas");
        System.out.println("===============================");
        System.out.println("Nama \t\tAlamat \t\tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t\t" + petugas.getAlamat(i) + "\t\t" + petugas.getTelepon(i));
        }
    }

    public void laporan(Masyarakat masyarakat, Lelang lelang, Barang barang) {
        int x = lelang.getJmlLelang();

        System.out.println();
        System.out.println("===============================");
        System.out.println("\tLaporan Hasil Lelang");
        System.out.println("===============================");
        System.out.println("Nama Masyarakat \t\tBarang \t\tHarga Tawar");
        for (int i = 0; i < x; i++) {
            System.out.println(masyarakat.getNama(i) + "\t\t\t" + barang.getNamaBarang(0) + "\t\t" + lelang.getHargaTawar(i));
        }
    }
}

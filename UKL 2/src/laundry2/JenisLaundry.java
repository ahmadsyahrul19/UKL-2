/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry2;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class JenisLaundry {

    private ArrayList<String> namaJenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.namaJenisLaundry.add("Cuci Kering Normal");
        this.durasi.add(3);
        this.harga.add(6000);
        this.namaJenisLaundry.add("Cuci Kering Cepat");
        this.durasi.add(2);
        this.harga.add(10000);
        this.namaJenisLaundry.add("Cuci Kering + Setrika");
        this.durasi.add(1);
        this.harga.add(11000);
        this.namaJenisLaundry.add("Cuci Kering Cepat + Setrika");
        this.durasi.add(1);
        this.harga.add(15000);
        this.namaJenisLaundry.add("Cuci Kering Paket Komplit");
        this.durasi.add(1);
        this.harga.add(20000);
    }

    public int getJmlJenisLaundry() {
        return this.namaJenisLaundry.size();
    }

    public void setNamaJenisLaundry(String namaJenisLaundry) {
        this.namaJenisLaundry.add(namaJenisLaundry);
    }

    public String getNamaJenisLaundry(int idJenisLaundry) {
        return this.namaJenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getDurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }

    public void editDurasi(int idJenisLaundry, int durasi) {
        this.durasi.set(idJenisLaundry, durasi);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idJenisLaundry) {
        return this.harga.get(idJenisLaundry);
    }
}

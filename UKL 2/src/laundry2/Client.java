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
public class Client implements User{

 private ArrayList<String> namaClient = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> saldo = new ArrayList<Integer>();

 public Client() {
 this.namaClient.add("Syahrul");
 this.alamat.add("Malang");
 this.telepon.add("085232354819");
 this.saldo.add(800000);

 this.namaClient.add("Arfina");
 this.alamat.add("Sidoarjo");
 this.telepon.add("087871156309");
 this.saldo.add(600000);
 
 this.namaClient.add("Rora");
 this.alamat.add("Surabaya");
 this.telepon.add("085257572130");
 this.saldo.add(700000);  
 }
 public void setSaldo(int saldo){
 this.saldo.add(saldo);
 }
 public int getSaldo(int idClient){
 return this.saldo.get(idClient);
 }
 public void editSaldo(int idClient, int saldo){
 this.saldo.set(idClient, saldo);
 }
 public int getJumlahClient(){
 return this.saldo.size();
 }
 @Override
 public void setNama(String namaClient ){
 this.namaClient.add(namaClient);
 }

 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }

 @Override
 public String getNama(int idClient){
 return this.namaClient.get(idClient);
 }

 @Override
 public String getAlamat(int idClient){
 return this.alamat.get(idClient);
 }

 @Override
 public String getTelepon(int idClient){
 return this.telepon.get(idClient);
 } 
}

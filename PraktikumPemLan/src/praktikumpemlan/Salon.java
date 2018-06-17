/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpemlan;

public abstract class Salon {

    private String nama;
    private String anggota;
    protected double biaya;
    protected double diskon;
    protected double disc;
    protected double product;

    public Salon(String nama, String anggota, double biaya, double product) {
        this.nama = nama;
        this.anggota = anggota;
        this.biaya = biaya;
        this.product = product;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public String getAnggota() {
        return anggota;
    }

    public double getBiaya() {
        return biaya;
    }

    public double getDiskon() {
        return product - (product * 0.1);
    }

    public abstract double getProduct();

    public abstract void setProduct(double product);

    public abstract void display();

    public abstract void totalPerawatan();

}

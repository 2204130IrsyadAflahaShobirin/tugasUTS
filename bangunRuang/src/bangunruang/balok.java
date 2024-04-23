/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author User
 */
public class balok {

    private int panjang;
    private int lebar;
    private int tinggi;

    // Konstruktor tanpa parameter
    public balok() {
        this(1, 1, 1); // Set default values for clarity
    }

    // Konstruktor dengan parameter
    public balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    // Getter untuk panjang
    public int getPanjang() {
        return panjang;
    }

    // Setter untuk panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    // Getter untuk lebar
    public int getLebar() {
        return lebar;
    }

    // Setter untuk lebar
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    // Getter untuk tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk tinggi
    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    // Menghitung luas balok
    public int getLuas() {
        int luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return luasPermukaan;
    }

    // Menghitung keliling balok
    public int getKeliling() {
        int keliling = 4 * (panjang + lebar + tinggi);
        return keliling;
    }

    // Menghitung volume balok
    public int getVolume() {
        int volume = panjang * lebar * tinggi;
        return volume;
    }
}

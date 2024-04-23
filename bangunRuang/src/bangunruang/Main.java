/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangunruang;


public class Main {

    public static void main(String[] args) {
        // Balok 1
        balok balok1 = new balok();
        System.out.println("Balok dengan panjang : " + balok1.getPanjang() + ", lebar : " + balok1.getLebar() + " dan tinggi : " + balok1.getTinggi() + ".");
        System.out.println("Luasnya : " + balok1.getLuas() + ", sedangkan kelilingnya : " + balok1.getKeliling() + " dan volumenya : " + balok1.getVolume());

        // Balok 2
        balok balok2 = new balok(30, 40, 50);
        System.out.println("\nBalok dengan panjang : " + balok2.getPanjang() + ", lebar : " + balok2.getLebar() + " dan tinggi : " + balok2.getTinggi() + ".");
        System.out.println("Luasnya : " + balok2.getLuas() + ", sedangkan kelilingnya : " + balok2.getKeliling() + " dan volumenya : " + balok2.getVolume());

        // Balok 3
        balok balok3 = new balok(25, 35, 45);
        System.out.println("\nBalok dengan panjang : " + balok3.getPanjang() + ", lebar : " + balok3.getLebar() + " dan tinggi : " + balok3.getTinggi() + ".");
        System.out.println("Luasnya : " + balok3.getLuas() + ", sedangkan kelilingnya : " + balok3.getKeliling() + " dan volumenya : " + balok3.getVolume());
    }
    
}

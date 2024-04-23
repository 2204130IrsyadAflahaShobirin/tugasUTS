/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern;

import java.util.Scanner;
public class Pattern {

private static void pattern1(){
    for (int baris = 1; baris <= 5; baris++){
        for (int kolom = 1; kolom <= baris; kolom++){
            System.out.print(kolom);
        }
    System.out.println();
    }
}

private static void pattern2(){
    for (int baris = 1; baris <= 5; baris++){
        for (int kolom = 5; kolom >= baris; kolom--){
            System.out.print(kolom);
        }
    System.out.println();
    }

}

private static void pattern3(){
    for (int baris = 1; baris <= 5; baris++){
        for (int kolom = 1; kolom <= 6 - baris; kolom++){
            System.out.print(kolom);
        }
    System.out.println();
    }

}

private static void pattern4(){
    for (int baris = 1; baris <= 5; baris++){
        for (int kolom = 1; kolom <= baris; kolom++){
            System.out.print(6 - kolom);
        }
    System.out.println();
    }

}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Siku Kanan Bawah");
            System.out.println("2. Siku Kanan Atas");
            System.out.println("3. Siku Kiri Bawah");
            System.out.println("4. Siku Kiri Atas");
            System.out.println("Pilihan = [1] | [2] | [3] | [4]");
            
            int pilihan = scan.nextInt();
            
            switch (pilihan) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                default:
                    System.out.println("Error!");
                    System.exit(0);
            }
        }
    }
    
}

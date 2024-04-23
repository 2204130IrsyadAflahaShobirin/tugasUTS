/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan integer: ");
        int number = scanner.nextInt();
        
            int nomorAwal = number;
            int nomorBalik = 0;
    
            while (number != 0) {
                int digitAkhir = number % 10;
                nomorBalik = nomorBalik * 10 + digitAkhir;
                number /= 10;
        }
            
            if (nomorAwal == nomorBalik){
                System.out.println(nomorAwal + " adalah palindrom.");
            }else{
                System.out.println(nomorAwal + " bukan palindrom");
            }
    }

    
}

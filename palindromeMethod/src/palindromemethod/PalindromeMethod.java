/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromemethod;

import java.util.Scanner;
public class PalindromeMethod {
    
    public static int methodBalik(int number) {
        int nomorBalik = 0;
        while (number != 0) {
            int digit = number % 10;
            nomorBalik = nomorBalik * 10 + digit;
            number /= 10;
        }
        return nomorBalik;
    }
    
    public static boolean palindromCek(int number) {
        return number == methodBalik(number);
    };
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan integer: ");
        int number = scan.nextInt();
        
        if (palindromCek(number)) {
            System.out.println(number + " adalah palindrom");
        }else{
            System.out.println(number + " bukan palindrom");
        }
    }
    
}

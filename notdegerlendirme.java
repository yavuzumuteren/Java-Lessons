package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author SY
 */



public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen Nnotunuzu Giriniz :");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        if(n>89){
        System.out.println("Tebrikler AA aldın");        
        }
        else if(79<n){
        System.out.println("Tebrikler BB aldın");
        }
        else if(71<n){
        System.out.println("Tebrikler CC aldın");
        }
        else if(70>n){
        System.out.println("Tebrikler F aldın");
        }
        
         
    }
}

// && = and bağlacı
// || = veya operatörü

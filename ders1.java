
package javaapplication2;


public class JavaApplication2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("merhaba dünya"); //merhaba dünya yazdırma
        String s = "merhaba dostum"; //string değişken atama
        System.out.println(s); //değişkeni konsola yazdırma
        s= s.toUpperCase(); //string değişkenin karakterlerini büyültme
        System.out.println(s); //string değişkenini yazdırma
        double pi = 3.14; //double değişken atama
        System.out.println(pi); //değişkeni konsola yazdırma
        int ilkBosluk = s.indexOf(' '); 
        System.out.println(ilkBosluk);
        String isim = "umut eren";
        String soyisim = "yavuz";
        System.out.println(isim+soyisim); //iki değişkeni beraber yazma
        System.out.println(s.substring(ilkBosluk));//s.substring belirli karakterden sonrasını yadırma
        System.out.println(s.substring(0, ilkBosluk));//belirli iki karatkterin arasını yazdırma
        int sonBosluk = s.lastIndexOf(" ");//sondan belirli karakteri sona kadar yazdırma
        System.out.println(s.substring(sonBosluk));
        System.out.println(s.charAt(5));//inndex numarası verilen karakteri yazdırma                                      
        
    }
    
}

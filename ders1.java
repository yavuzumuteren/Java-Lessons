
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
        
        
        
        /***Döngüler***/
                    //For Döngüsü
        for(int i = 0;i<10;i++){ //loop variable
            System.out.println("sonuç :"+i);   
            }
                    //While Döngüsü
        int a=0;
        while(a<10){
            System.out.println("Sonuç :"+a);
            a++;
        }
                   //Do While Döngüsü
        int b=0;   
        do{
            System.out.println("2.Mesaj :"+b);
            b++;                  
        }while(b<10);
        
        /**İf Else Else İf**/
                int i=11;
        if(i==10){
        System.out.println("bu sayı 10");
                                                                 
    }
        else if(i<10){
        System.out.println("sayı ondan küçük ");
        }
        else{
        System.out.println("bu sayı 10 değil ve ondan büyük");
        }
        
        
    }
    
}

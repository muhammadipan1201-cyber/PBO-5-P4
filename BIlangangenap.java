
package p4;

import java.util.Scanner;


public class BIlangangenap {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.print("Masukan BIlangan : ");
        int Bilangan = Scanner.nextInt();
        
        if (Bilangan % 2 == 0 ){
        System.out.println("Bilangan Genap");
        }else{
            System.out.println("bilangan Ganjil");
        }
        
        Scanner.close();
    }
    
}

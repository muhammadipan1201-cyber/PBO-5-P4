package p4;

import java.util.Scanner;

public class namaharidankodehari {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
                System.out.print("Masukan Kode Hari 1-7 : ");
                int Kode = Scanner.nextInt();
                
                switch (Kode){
                    case 1:
                        System.out.println("Hari ke-1: senin");
                        break;
                    case 2:
                        System.out.println("Hari ke-2: selasa");
                        break;
                    case 3:
                        System.out.println("Hari ke-3: rabu");
                        break;
                    case 4:
                        System.out.println("Hari ke-4: kamis");
                        break;
                    case 5:
                        System.out.println("Hari ke-5:jumat");
                        break;
                    case 6:
                        System.out.println("Hari ke-6: sabtu");
                        break;
                    case 7:
                        System.out.println("Hari ke-7: minggu");
                        break;
                    default:
                        System.out.println("Kode hari tidak valid ! Masukan angka 1 sampai 7. ");
                        
                }
                Scanner.close();
    }
    
}

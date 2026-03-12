import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 
        
        Matakuliah[] arrayOfMatakuliah = new Matakuliah[jumlah];
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            
            System.out.print("SKS        : ");
            int sks = sc.nextInt();
            
            System.out.print("Jumlah Jam : ");
            int jam = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println();
            
            arrayOfMatakuliah[i] = new Matakuliah(kode, nama, sks, jam);
        }
        
        System.out.println("\n=== DATA MATAKULIAH ===");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Matakuliah ke-" + (i+1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("------------------------");
        }
    }
}
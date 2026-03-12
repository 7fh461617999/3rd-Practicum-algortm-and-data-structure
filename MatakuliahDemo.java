import java.util.Scanner;

public class MatakuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta user menentukan jumlah array (jawaban soal 4.4)
        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer
        
        // Membuat array dengan ukuran sesuai input user
        Matakuliah[] arrayOfMatakuliah = new Matakuliah[jumlah];
        
        // Loop untuk mengisi data matakuliah
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
            sc.nextLine(); // Membersihkan buffer
            
            System.out.println();
            
            // Membuat objek dan menyimpannya dalam array
            arrayOfMatakuliah[i] = new Matakuliah(kode, nama, sks, jam);
        }
        
        // Menampilkan semua data matakuliah
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
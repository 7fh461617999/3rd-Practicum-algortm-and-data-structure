package Exercise;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Clear buffer
        
        Dosen[] arrayOfDosen = new Dosen[jumlah];
        
        // Input data using FOR loop
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jk = sc.nextLine();
            Boolean gender = jk.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            arrayOfDosen[i] = new Dosen(kode, nama, gender, usia);
        }
        
        // Display data using FOREACH loop
        System.out.println("\nDATA DOSEN");
        System.out.println("============");
        int counter = 1;
        for (Dosen dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            dosen.printInfo();
            counter++;
        }
    }
}
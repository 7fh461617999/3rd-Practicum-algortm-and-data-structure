public class MahasiswaDemo {
    public static void main(String[] args) {
        
        // LANGKAH 1: Membuat array yang bisa menampung 3 objek Mahasiswa
        // Ini seperti membuat lemari dengan 3 laci kosong
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
        
        // LANGKAH 2: Mengisi setiap elemen array dengan objek Mahasiswa
        // Ini seperti meletakkan formulir kosong di setiap laci
        arrayOfMahasiswa[0] = new Mahasiswa();  // Taruh formulir di laci 0
        arrayOfMahasiswa[1] = new Mahasiswa();  // Taruh formulir di laci 1
        arrayOfMahasiswa[2] = new Mahasiswa();  // Taruh formulir di laci 2
        
        // LANGKAH 3: Mengisi atribut dari objek Mahasiswa pertama
        // Ini seperti mengisi formulir di laci 0
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "MUBASSYIR SYAKIB ALFATIH";
        arrayOfMahasiswa[0].kelas = "TI-1B";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
        
        // Mengisi atribut dari objek Mahasiswa kedua
        arrayOfMahasiswa[1].nim = "244107060034";
        arrayOfMahasiswa[1].nama = "AHMAD ZAKI";
        arrayOfMahasiswa[1].kelas = "TI-1B";
        arrayOfMahasiswa[1].ipk = (float) 3.80;
        
        // Mengisi atribut dari objek Mahasiswa ketiga
        arrayOfMahasiswa[2].nim = "244107060035";
        arrayOfMahasiswa[2].nama = "SITI AISYAH";
        arrayOfMahasiswa[2].kelas = "TI-1B";
        arrayOfMahasiswa[2].ipk = (float) 3.90;
        
        // LANGKAH 4: Menampilkan semua data
        System.out.println("=== DATA MAHASISWA ===");
        
        // Menampilkan mahasiswa pertama
        System.out.println("Mahasiswa ke-1:");
        System.out.println("NIM    : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[0].ipk);
        System.out.println("-------------------");
        
        // Menampilkan mahasiswa kedua
        System.out.println("Mahasiswa ke-2:");
        System.out.println("NIM    : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[1].ipk);
        System.out.println("-------------------");
        
        // Menampilkan mahasiswa ketiga
        System.out.println("Mahasiswa ke-3:");
        System.out.println("NIM    : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[2].ipk);
        System.out.println("-------------------");
    }
}

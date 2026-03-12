package Exercise;

public class Dosen {
    public String kode;
    public String nama;
    public Boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    public int usia;
    
    // Constructor
    public Dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    
    public void printInfo() {
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.print("Jenis Kelamin: ");
        if (jenisKelamin) {
            System.out.println("Laki-laki");
        } else {
            System.out.println("Perempuan");
        }
        System.out.println("Usia         : " + usia);
        System.out.println("------------------------");
    }
}
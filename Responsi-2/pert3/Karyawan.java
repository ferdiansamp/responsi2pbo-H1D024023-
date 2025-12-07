class Karyawan {
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    // Gunakan access modifier yang tepat agar bisa diakses oleh subclass (misal: protected)
    protected String namaKaryawan;
    protected double gaji;
    
    
    // Constructor untuk inisialisasi nama dan gajiPokok
    public  Karyawan(String namaKaryawan, double gaji) {
        this.namaKaryawan = namaKaryawan;
        this.gaji = gaji;
    }
    
    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println("Nama: " + this.namaKaryawan + " | Gaji Pokok: Rp " + this.gaji);
    }
}
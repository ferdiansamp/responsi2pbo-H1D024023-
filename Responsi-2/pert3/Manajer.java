// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    protected double tunjangan;

    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    public Manajer(String namaKaryawan, double gaji, double tunjangan) {
        super(namaKaryawan, gaji);
        this.tunjangan = tunjangan;
    }

    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + this.namaKaryawan + " | Gaji Pokok: Rp " + this.gaji + " | Tujangan: Rp " + this.tunjangan);
        System.out.println("Total Pendapatan: Rp " + (this.tunjangan + this.gaji));
    }
}
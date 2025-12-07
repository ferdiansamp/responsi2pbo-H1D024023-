public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
     private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - jumlahRudal
    // Panggil super(...) untuk parent.
    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 20 → tampilkan "Energi terlalu rendah! Mesin tidak dapat diaktifkan."
    // Jika cukup → tampilkan "Mesin pesawat tempur diaktifkan."
    @Override
    void aktifkanMesin() {
        if(super.getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }


    // @Override jelajah(int jarak)
    // Konsumsi energi: 3% per 1 km.
    // Jika energi tidak cukup → tampilkan pesan gagal.
    // Jika cukup → kurangi energi dan tampilkan:
    // "Pesawat tempur menjelajah sejauh [jarak] km."
    @Override
    void jelajah(int jarak) {
        if(jarak * 3 > super.getLevelEnergi()) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak);
        } else {
            super.setLevelEnergi(super.getLevelEnergi() - (jarak * 3));
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }


    // @Override isiEnergi(int jumlah)
    // Tambah energi sampai max 100%.
    // Tampilkan pesan peningkatan energi.
    @Override
    void isiEnergi(int jumlah) {
        super.setLevelEnergi(jumlah);
        System.out.println("Peningkatan energi.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void tembakRudal(int jumlah)
    // - Jika jumlahRudal cukup → kurangi dan tampilkan:
    //   "Menembakkan [jumlah] rudal!"
    // - Jika tidak cukup → tampilkan pesan gagal.
    void tembakRudal(int jumlah) {
        if(this.jumlahRudal > jumlah) {
            this.jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal");
        }
    }
}
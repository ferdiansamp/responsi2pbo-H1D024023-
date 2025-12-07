class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    protected int umur;
    protected double berat;
    protected double tinggi;

    // Jangan lupa tambahkan konstanta faktorAktivitas
    final double faktorAktivitas = 1.2f;
    
    double hitungBMI(double berat, double tinggi) {
        // Lengkapi method ini
        double tinggiMeter = tinggi / 100;
        double BMI = berat / (tinggiMeter * tinggiMeter);
        return BMI;
    }

    void tampilKategori(double BMI) {
        // Lengkapi method ini
        if(BMI >= 25) {
            System.out.println("Kategori: Obesitas");
        } else if(BMI > 18.5f) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Kurus");
        }
    }

    double hitungKalori(double berat) {
        // Lengkapi method ini
        return (berat * faktorAktivitas * 10);
    }

    void tampilInfo() {
        // Lengkapi method ini
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + this.umur + " tahun");
        System.out.println("Berat: " + this.berat + " kg");
        System.out.println("Tinggi: " + this.tinggi + " cm");
        System.out.println("BMI: " + hitungBMI(this.berat, this.tinggi));
        tampilKategori(hitungBMI(this.berat, this.tinggi));
        System.out.println("Kebutuhan Kalori: " + hitungKalori(this.berat) + " kal/hari");
        System.out.println("=====================================");
    }
}
public class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        // Buat objek PesawatTempur dengan:
        //   nama: "Astra-Fury"
        //   kapasitas: 2
        //   jumlahRudal: 8
        PesawatTempur astra = new PesawatTempur("Astra-Fury", 2, 8);


        // TODO:
        // Buat objek KapalEksplorasi dengan:
        //   nama: "Voyager X"
        //   kapasitas: 10
        //   modulScan: 4
        KapalEksplorasi voyager = new  KapalEksplorasi("Voyager X", 10, 4);


        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");

        // TODO:
        // Aktifkan mesin pesawat
        // Pesawat menjelajah 10 km
        // Pesawat menjelajah 30 km
        // Pesawat menembak 3 rudal
        // Tampilkan status pesawat
        System.out.println("\n--- PESAWAT TEMPUR ---");
        astra.aktifkanMesin();
        astra.jelajah(10);
        astra.jelajah(30);
        astra.tembakRudal(3);
        astra.tampilStatus();


        // TODO:
        // Aktifkan mesin kapal eksplorasi
        // Kapal menjelajah 15 km
        // Kapal melakukan scanPlanet("Kepler-442b")
        // Tampilkan status kapal
        System.out.println("\n--- KAPAL EKSPLORASI ---");
        voyager.aktifkanMesin();
        voyager.jelajah(15);
        voyager.scanPlanet("Kepler-442b");
        voyager.tampilStatus();

    }
}
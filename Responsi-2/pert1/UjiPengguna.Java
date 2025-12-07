class UjiPengguna {
    public static void main(String[] args) {
        // Buat objek pengguna dan isi datanya sesuai data uji coba
        Pengguna orang = new Pengguna();
        orang.umur = 25;
        orang.berat = 60;
        orang.tinggi = 170;
        // Panggil method tampilInfo
        orang.tampilInfo();
        // Tampilkan demonstrasi tentang konstanta final
//        orang.faktorAktivitas = 1.5;
    }
}
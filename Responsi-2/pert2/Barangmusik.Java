class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    protected String kodeBarang;
    protected String namaAlatMusik;
    protected double hargaSatuan;
    protected int stok;
    
    // Constructor
    public BarangMusik(String kodeBarang, String namaAlatMusik) {
        this.kodeBarang = kodeBarang;
        this.namaAlatMusik = namaAlatMusik;
        this.hargaSatuan = 0.0;
        this.stok = 0;
    }
    public BarangMusik(String kodeBarang, String namaAlatMusik, double hargaSatuan) {
        this.kodeBarang = kodeBarang;
        this.namaAlatMusik = namaAlatMusik;
        this.hargaSatuan = hargaSatuan;
        this.stok = 0;
    }
    public BarangMusik(String kodeBarang, String namaAlatMusik, double hargaSatuan, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaAlatMusik = namaAlatMusik;
        this.hargaSatuan = hargaSatuan;
        this.stok = stok;
    }


    void ubahHarga(double hargaBaru) {
        this.hargaSatuan = hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + this.namaAlatMusik + " | Kode: " + this.kodeBarang + " | Harga: Rp " +  this.hargaSatuan + " | Stok: " + this.stok + " unit");
    }
}
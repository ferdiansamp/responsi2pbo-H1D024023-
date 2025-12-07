class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    protected double kapasitasTarik;
    protected double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
        super.tampilInfo();
        System.out.print(" | Baterai: " + this.kapasitasBaterai + "kWh");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor listrik
        return (tenagaHP * 1.1 + kapasitasBaterai * 5) ;
    }

    @Override
    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}

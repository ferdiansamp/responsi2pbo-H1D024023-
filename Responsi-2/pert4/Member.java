class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    protected int poinReward;
    protected String levelAnggota;

    // TODO: Buat constructor dengan super
    public Member(String namaLengkap, String idCustomer, int totalBelanja, int poinReward, String levelAnggota) {
        super(namaLengkap, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelAnggota = levelAnggota;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + this.poinReward + " | Level: " +  this.levelAnggota);
    }
}

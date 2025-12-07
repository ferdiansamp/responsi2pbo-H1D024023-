class Customer {
    // TODO: Buatkan atribut
    protected String namaLengkap;
    protected String idCustomer;
    protected int totalBelanja;

    // TODO: Sediakan constructor
    public Customer(String namaLengkap, String idCustomer, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " + this.namaLengkap + " | ID: " + this.idCustomer + " | Total Belanja: Rp " + this.totalBelanja);
    }
}

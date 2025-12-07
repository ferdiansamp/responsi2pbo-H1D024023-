public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    private String namaLayanan;
    private int jumlahSaldo;
    private int nominalTransaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, int jumlahSaldo, int nominalTransaksi) {
        this.namaLayanan = namaLayanan;
        this.jumlahSaldo = jumlahSaldo;
        this.nominalTransaksi = nominalTransaksi;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod
    public String getPaymentDetails() {
        return namaLayanan;
    }
    public int getBalance() {
        return jumlahSaldo;
    }
    public int getTransactionFee() {
        return nominalTransaksi;
    }

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal
    public void processPayment() {
        if(jumlahSaldo >= nominalTransaksi + 2000) {
            jumlahSaldo -= (nominalTransaksi + 2000);
            System.out.println("Pembayaran Berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

}

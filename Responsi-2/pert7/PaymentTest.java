public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi
        EWalletPayment uang = new EWalletPayment("DANA", 150000, 50000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println("Saldo awal: " + uang.getBalance());
        System.out.println("Memproses pembayaran sebesar: " + uang.getTransactionFee() + "...");
        uang.processPayment();
        System.out.println("Sisa saldo: " + uang.getBalance());
        System.out.println("Detail Transaksi: Pembayaran dilakukan melalui " + uang.getPaymentDetails());
    }
}

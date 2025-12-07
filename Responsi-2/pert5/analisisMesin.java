class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] arr = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        arr[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        arr[3] = new mesinMotor("Yamaha R25", 250, "Sport");

        // Isi array dengan objek mesinTraktor
        arr[1] = new mesinTraktor("Kutoba MX5200", 520, 4.5);

        // Isi array dengan objek mesinTraktorListrik
        arr[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        arr[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for(int i = 0; i < arr.length; i++){
            arr[i].tampilInfo();
            System.out.println("\nKategori: " + arr[i].kategoriMesin());
            System.out.println("Performa: " + arr[i].nilaiPerforma() + "\n\n");
        }

        // Loop untuk menampilkan kategori dan performa

        System.out.println("=== SUARA MESIN ===");

        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for(int i = 0; i < arr.length; i++){
//            arr[i].suaraMesin();
            if(arr[i] instanceof mesinMotor){
                mesinMotor m = (mesinMotor) arr[i];
                System.out.print(m.namaMesin + " → ");
                m.suaraMesin();
            } else if(arr[i] instanceof mesinTraktor){
                mesinTraktor m = (mesinTraktor) arr[i];
                System.out.print(m.namaMesin + " → ");
                m.suaraMesin();
            } else if(arr[i] instanceof mesinTraktorListrik){
                mesinTraktorListrik m = (mesinTraktorListrik) arr[i];
                System.out.print(m.namaMesin + " → ");
                m.suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        int satu = 0;
        double top = arr[0].nilaiPerforma();
        for(int i = 1; i < (arr.length); i++){
            if(arr[i].nilaiPerforma() > top){
                satu = i;
                top = arr[i].nilaiPerforma();
            }
        }
        System.out.println(arr[satu].namaMesin + " → " + arr[satu].nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        int dua = 0;
        top =  arr[0].nilaiPerforma();
        for(int i = 0; i < arr.length; i++){
            if(i == satu) {
                continue;
            } else {
                if(arr[i].nilaiPerforma() > top){
                    dua = i;
                    top = arr[i].nilaiPerforma();
                }
            }
        }

        int tiga = 0;
        top =  arr[0].nilaiPerforma();
        for(int i = 0; i < arr.length; i++){
            if(i == satu || i == dua) {
                continue;
            } else {
                if(arr[i].nilaiPerforma() > top){
                    tiga = i;
                    top = arr[i].nilaiPerforma();
                }
            }
        }

        System.out.println("1. " + arr[satu].namaMesin + " → " + arr[satu].nilaiPerforma());
        System.out.println("2. " + arr[dua].namaMesin + " → " + arr[dua].nilaiPerforma());
        System.out.println("3. " + arr[tiga].namaMesin + " → " + arr[tiga].nilaiPerforma());
    }
}

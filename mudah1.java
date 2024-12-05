import java.util.Scanner;

public class mudah1 {
    public static double mudah1(double beratPaket, double jarakTempuh, double panjangPaket, double lebarPaket, double tinggiPaket) {
        double biayaPerKg = (jarakTempuh <= 10) ? 4250 : 6000;
        double volume = panjangPaket * lebarPaket * tinggiPaket;
        double biayaVolume = (volume > 100) ? 50000 : 0;
        double totalBiaya = (beratPaket * biayaPerKg) + biayaVolume;

        return totalBiaya; // Mengembalikan hasil total biaya
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input dari pengguna
        System.out.println("Masukkan berat paket (kg): ");
        double beratPaket = s.nextDouble();

        System.out.println("Masukkan jarak tempuh (km): ");
        double jarakTempuh = s.nextDouble();

        System.out.println("Masukkan panjang paket (cm): ");
        double panjangPaket = s.nextDouble();

        System.out.println("Masukkan lebar paket (cm): ");
        double lebarPaket = s.nextDouble();

        System.out.println("Masukkan tinggi paket (cm): ");
        double tinggiPaket = s.nextDouble();

        // System.out.println("Masukkan volume :");
        // double volume = s.nextDouble();

        // if (volume >= 100) {
        //     System.out.println("Ansa mendapatkan harga 50.000");
        // }else if (volume >= 200) {
        //     System.out.println("Anda mendapatkan harga 100.000");
        // }

        // Menghitung volume dan biaya pengiriman
        double volume = panjangPaket * lebarPaket * tinggiPaket;
        double totalBiaya = mudah1(beratPaket, jarakTempuh, panjangPaket, lebarPaket, tinggiPaket);

        // Menampilkan hasil
        System.out.println("\n----------Biaya Pengiriman----------");
        System.out.println("Berat paket: " + beratPaket + " kg");
        System.out.println("Jarak tempuh: " + jarakTempuh + " km");
        System.out.println("Panjang paket: " + panjangPaket + " cm");
        System.out.println("Lebar paket: " + lebarPaket + " cm");
        System.out.println("Tinggi paket: " + tinggiPaket + " cm");
        System.out.println("Volume: " + volume + " cm^3");
        System.out.println("Total biaya: Rp " + totalBiaya);
        System.out.println("-------------------------------------");
    }
}

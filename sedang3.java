import java.util.Scanner;
import java.util.Random;

public class sedang3 {
    public static Random r = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            // Menghasilkan dan memproses soal
            if (!prosesPertanyaan()) {
                break; // Jika pengguna memilih untuk berhenti, keluar dari loop
            }
        }
    }

    private static boolean prosesPertanyaan() {
        int bilangan1 = r.nextInt(10) + 1;
        int bilangan2 = r.nextInt(10) + 1;

        int operator = r.nextInt(3);
        int hasil = 0;
        String operatorSimbol = "";

        switch (operator) {
            case 0:
                operatorSimbol = "x";
                hasil = bilangan1 * bilangan2;
                break;
            case 1:
                operatorSimbol = "/";
                // Pastikan bilangan2 tidak nol untuk menghindari pembagian dengan nol
                while (bilangan2 == 0) {
                    bilangan2 = r.nextInt(10) + 1;
                }
                hasil = bilangan1 / bilangan2;
                break;
            case 2:
                operatorSimbol = "%";
                hasil = bilangan1 % bilangan2;
                break;
        }

        // Tampilkan soal dan jawab kuis
        System.out.println("Soal: " + bilangan1 + " " + operatorSimbol + " " + bilangan2 + " = ?");
        System.out.print("Jawaban Anda: ");
        int jawaban = scanner.nextInt();

        // Periksa jawaban
        if (cekJawaban(jawaban, hasil)) {
            System.out.println("Benar!");
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + hasil);
        }

        // Tanyakan apakah pengguna ingin mencoba lagi
        return lanjut();
    }

    private static boolean cekJawaban(int jawaban, int hasil) {
        return jawaban == hasil;
    }

    private static boolean lanjut() {
        System.out.print("Ingin mencoba lagi? (ya/no): ");
        String lanjut = scanner.next();
        if (lanjut.equalsIgnoreCase("no")) {
            System.out.println("Terima Kasih Telah Bermain Kuis!");
            return false; // Kembali false untuk keluar dari loop
        }
        return true; // Kembali true untuk melanjutkan
    }
}


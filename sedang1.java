import java.util.Scanner;

public class sedang1 {
    // Fungsi untuk menghitung faktorial
    public static int hitungFaktorial(int n) {
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        return hasil;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bilangan;

        System.out.println("Menghitung Faktorial!");

        // Meminta input bilangan bulat positif dari pengguna
        System.out.println("Masukkan bilangan bulat positif : ");
        bilangan = s.nextInt();

        // Validasi input
        if (bilangan < 0) {
            System.out.println("Bilangan Harus Positif !");

        } else {
            // Menghitung faktorial menggunakan metode iterasi
            int faktorial = hitungFaktorial(bilangan);

            // Menampilkan hasil
            System.out.println("Hasil faktorial dari " + bilangan + " adalah = " + faktorial);
        }
    }

    
}

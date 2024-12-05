import java.util.Scanner;

public class sulit3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Menginputkan data array
        int[] array = inputArray(s);

        // Menghitung dan menampilkan frekuensi
        frekuensi(array);
    }

    // Menginputkan Data Array
    public static int[] inputArray(Scanner s) {
        System.out.println("Inputkan Jumlah Array :");
        int jumlahArray = s.nextInt();
        int[] array = new int[jumlahArray];

        System.out.println("Masukkan data array");
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("data ke " + (i + 1) + " : ");
            array[i] = s.nextInt();
        }

        return array; // Mengembalikan array yang telah diisi
    }

    // Proses perhitungan frekuensi
    public static void frekuensi(int[] array) {
        int jumlahArray = array.length;

        // Menghitung frekuensi dari Setiap Elemen
        // Menggunakan dua loop bersarang

        // Loop pertama untuk memilih elemen yang akan dihitung frekuensinya
        for (int i = 0; i < jumlahArray; i++) {
            int jumlah = 1;
            boolean hitung = false;

            // Loop kedua untuk menghitung berapa kali elemen tersebut muncul dalam array
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    hitung = true;
                    break;
                }
            }

            // Loop ini digunakan untuk menghitung berapa kali elemen yang sedang dianalisis
            // muncul dalam sisa array
            if (!hitung) {
                for (int j = i + 1; j < jumlahArray; j++) {
                    if (array[i] == array[j]) {
                        jumlah++;
                    }
                }
                // Menampilkan hasil
                System.out.println(array[i] + " terdapat " + jumlah + " kali ");
            }
        }
    }
}

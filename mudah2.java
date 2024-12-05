import java.util.Scanner;

public class mudah2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bilangan;

        System.out.println("Inputkan Bilangan : ");
        bilangan = s.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " merupakan bilangan genap.");
            
        } else {
            System.out.println("Bilangan " + bilangan + " merupakan bilangan ganjil.");
        }

        s.close();
    }
}

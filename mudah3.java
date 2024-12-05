public class mudah3 {
   public static void main(String[] args) {
      runMain();
   }

   public static void runMain() {
      for (int i = 50; i >= 1; i--) {
         moklet(i);
      }
      loop2(); // Menampilkan pesan tambahan setelah loop
   }

   public static void moklet(int i) {
      if (i == 1) {
         System.out.println(i + ". saya senang");
      } else if (i % 3 == 0) {
         System.out.println(i + ". saya angkatan 33");
      } else if (i % 2 == 0) {
         System.out.println(i + ". saya anak moklet");
      } else {
         System.out.println(i + ". saya anak wikusama");
      }
   }

   public static void loop2() {
      int b = 50;
      // Loop yang tidak akan pernah dijalankan karena kondisi b > 50 (tidak pernah benar)
      while (b > 50) {
         System.out.println(b + ". saya senang");
         b--;
      }
   }
}
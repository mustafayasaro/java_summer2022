package day17_nestedForLoop;

public class C01_ForLoop {
//   public static void main(String[] args) {

//       /*
//       Verilen String'deki kullanilan harfleri
//       tekrarsiz olarak yazdirip
//       keliimed kullanilan farkli harf sayisini veren bir method yapiniz
//        */

//       String input = "Java her zaman guzel";


//       tekrarsizYap(input);


//   }

//   public static void tekrarsizYap(String input) {
//       String benzersizInput = "";

//       String islenecekKelime = input.replaceAll("\\W", ""); //   Javaherzamanguzel
//       System.out.print(islenecekKelime.substring(0, 1));  // J
//       benzersizInput += islenecekKelime.substring(0, 1); //  J

//       for (int i = 1; i < islenecekKelime.length(); i++) {
//
//           if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) ;
//           {
//               System.out.print(", " + islenecekKelime.substring(i, i + 1));
//               benzersizInput += islenecekKelime.substring(i, i + 1);

//           }
//       }
//       System.out.println("");
//       System.out.println("input : " + input);
//       System.out.println("benzersiz input : " + benzersizInput);

//   }

    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input = "taka tuka";
        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput = "";
        String islenecekKelime = input.replaceAll("\\W", "");
        System.out.print(islenecekKelime.substring(0, 1));
        benzersizInput += islenecekKelime.substring(0, 1);
        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i, i + 1))) {
                System.out.print(", " + islenecekKelime.substring(i, i + 1));   // t, a, k, u
                benzersizInput += islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println("");
        System.out.println("input: " + input); // input: taka tuka
        System.out.println("benzersiz input : " + benzersizInput); // benzersiz input : taku
    }
}

import java.util.Scanner;
public class harflereAyirma {
    public static void main(String[] args) {
        System.out.println("Lütfen Adınızın İlk 5 Karakterini Giriniz :");
        Scanner input = new Scanner(System.in);
        String ad = input.nextLine();
        System.out.println("1. Karakter :"+ad.charAt(0));
        System.out.println("2. Karakter :"+ad.charAt(1));
        System.out.println("3. Karakter :"+ad.charAt(2));
        System.out.println("4. Karakter :"+ad.charAt(3));
        System.out.println("5. Karakter :"+ad.charAt(4));


    }
}

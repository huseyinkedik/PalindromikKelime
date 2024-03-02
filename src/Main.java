import java.util.Scanner;

public class Main {
    //Baştan sondan başlayarak kelimeyi karşılaştırıyoruz.
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Sonuç doğru ise istediğimiz çıktıları bastırıyoruz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String veri = input.next();

        if (isPalindrome(veri)) {
            System.out.println(veri + " palidromik bir kelimedir");
        } else {
            System.out.println(veri + " palidromik kelime değildir");
        }
    }
}
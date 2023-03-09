import java.time.DayOfWeek;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Exercicio 1:\n");
        ticoTeco();
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("Exercicio 2\n");
        System.out.println("Digite uma palavra e verifique se e Palindrome: ");
        System.out.println(isPalindrome(scan.next()));
    }

    public static void ticoTeco() {
        String mult3 = "Tico";
        String mult5 = "Teco";

        String result = "";
        boolean isMult = false;

        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                result += mult3;
                isMult = true;
            }
            if (x % 5 == 0) {
                result += mult5;
                isMult = true;
            }
            if (!isMult) {
                result += x;
            }
            if (x < 100) {
                result += ", ";
            }
            isMult = false;
        }
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String aux = new StringBuilder(s).reverse().toString();
        return s.equals(aux) ? true : false;
    }
}
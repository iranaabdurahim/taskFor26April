import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = randomNum();

        while (true) {
            int yourChoice = chooseNum();
            if (compareBoth(number, yourChoice)) {
                break;
            }
        }
    }

    public static int randomNum() {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        System.out.println(randomNum);
        return randomNum;
    }

    public static int chooseNum() {
        System.out.print("1-den 100-dek texmini bir reqem qeyd edin: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static boolean compareBoth(int number, int yourChoice) {
        if (yourChoice == number) {
            System.out.println("Tebrikler! Texmininiz dogrudur!");
            return true;
        } else if (yourChoice < number) {
            System.out.println("Bir az boyuk reqem daxil edin.");
            return false;
        } else {
            System.out.println("Bir az kicik reqem daxil edin.");
            return false;
        }

    }
}
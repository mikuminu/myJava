import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("3과 5의 배수 둘다 만족합니다.");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (num % 5 == 0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("X");
        }
        sc.close();
    }
}

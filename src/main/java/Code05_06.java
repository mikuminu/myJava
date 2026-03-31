import java.util.Scanner;

public class Code05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("숫자 입력 ==> ");
        num = sc.nextInt();

        if (num > 100) {
            if (num < 1000) {
                System.out.println("100보다 크고 100보다 적군요.");
            } else {
                System.out.println("와~ 100보다 크군요.");
            }
        }
        else {
            System.out.println("음~ 100보다 적군요.");
        }

        sc.close();
    }
}

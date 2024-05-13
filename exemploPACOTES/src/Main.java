import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int area = L * L;
        System.out.println(area);
        scanner.close();
    }
}
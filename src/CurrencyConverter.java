import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 25000;
        double usd;
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.printf("Số tiền VND là: %.3f VND", vnd);
    }
}

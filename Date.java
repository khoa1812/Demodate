package Demo;

import java.util.Scanner;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println("Ngày bạn đã nhập là: " + date);
    }
}


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// nhap phan so thu nhat a/b
        System.out.print("Nhap tu so thu nhat (a):");
        int a = scanner.nextInt();
        System.out.print("Nhap mau so thu nhat (b):");
        int b = scanner.nextInt();
// nhap phan so thu 2 c/d
        System.out.print("Nhap tu so thu hai (c)");
        int c = scanner.nextInt();
        System.out.print("Nhap mau so thu hai (d)");
        int d = scanner.nextInt();
// Tinh tu so va mau so cua tong theo cong thu (ad+bc)/bd
        int tuTong = a*b+b*c;
        int mauTong = b*d;
// in ket qua duoi dang phan so
        System.out.printf("Tong cua hai phan so la :%d/%d\n",tuTong,mauTong);
        scanner.close();1

    }
}

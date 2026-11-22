import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
Scanner scanner = new Scanner(System.in);
// nhap ban kinh hinh tron
        System.out.print("Nhap ban kinh hinh tron:");
        double r = scanner.nextDouble();
// Tinh dien tich theo cong thuc A= 3.14 * r * r
        double dienTich = 3.14 * r * r ;
// in ket qua ra man hinh
        System.out.printf("Dien tich: %.2f\n",dienTich);
        scanner.close();



    }
}

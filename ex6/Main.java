import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//tao doi tuong Scanner de nhap du lieu
        Scanner scanner = new Scanner(System.in);
//  Khai bao cac bien kieu float theo yeu cau
        float width,height,area,circumference;
//  Nhap chieu rong va chieu cao tu ban phim
        System.out.print("Nhap chieu rong(width):");
        width = scanner.nextFloat();
        System.out.print("Nhap chieu cao (height):");
        height = scanner.nextFloat();
//  Tinh dien tich va chu vi
        area = width * height;
        circumference = 2 * (width + height);
//  in ket qua ra man hinh
        System.out.printf("Dien tich:%.2f\n",area);
        System.out.printf("Chu vi:%.2f\n",circumference);
        scanner.close();
    }
}

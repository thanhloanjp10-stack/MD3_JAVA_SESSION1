//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    khai bao va khoi tao gia tri cho 2 bien so nguyen a va b
        int a = 10;
        int b = 5;
//    Thuc hien phep toan
     int tong = a+b;
     int hieu = a-b;
     int tich = a*b;
     int thuong = a/b;
     int soDu = a%b;
//    In gia tri 2 bien va ket qua ra man hinh
        System.out.printf("Gia tri a =%d,b=%d\n",a,b );
        System.out.printf("Hieu cua a va b : %d\n",hieu);
        System.out.printf("Tich cua a va b : %d\n",tich);
        System.out.printf("Thuong cua a khi chia cho b : %d\n",thuong);
        System.out.printf("So du khi chia a cho b : %d\n",soDu);


    }
}

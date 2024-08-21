package pheptinh;
import java.util.Scanner;
public class PhepTinh {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a:");
        int a = keyboard.nextInt();
        System.out.println("Nhap vao s nguyen b:");
        int b = keyboard.nextInt();
        int tong = a + b;
        int tru = a - b;
        int nhan = a * b;
        int chia = a / b;
        int chiadu = a % b;
        System.out.println("Ket qua cua phep cong: " + tong);
        System.out.println("Ket qua cua phep tru: " + tru);
        System.out.println("Ket qua cua phep nhan: " + nhan);
        System.out.println("Ket qua cua phep chia: " + chia);
        System.out.println("Ket qua cua phep chia lay du: " + chiadu);
    }
    
}

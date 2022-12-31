import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calculation = new Calculation();
        int menu;

        do {
            System.out.println("== Menu Program ==\n1. Square is persegi\n2. Circle is lingkaran\n3. Trapezoid is trapesium\n0. Finish is parantos rengse");
            try {
                System.out.println("Pilih menu sesuka hati : ");
                menu = input.nextInt();
                switch(menu){
                    case 1:
                        System.out.println("Pokoknya masukkan panjang sisi dari Square is persegi : ");
                        double side = input.nextDouble();
                        calculation.setSquare(side);
                        calculation.run();
                        System.out.println("Yaa hasilnya segini : " +calculation.getSquare());
                        break;
                    case 2:
                        System.out.println("Harus memasukkan jari-jari dari Circle is lingkaran : ");
                        double radius = input.nextDouble();
                        calculation.setCircle(radius);
                        calculation.run();
                        System.out.println("Yaa hasilnya segini : " +calculation.getCircle());
                        break;
                    case 3:
                        System.out.println("Wajib memasukkan sisi alas dari Trapezoid is trapesium : ");
                        double a = input.nextDouble();
                        System.out.println("Lalu masukkan sisi atas dari Trapezoid is trapesium : ");
                        double b = input.nextDouble();
                        System.out.println("Terakhir masukkan tinggi dari Trapezoid is trapesium : ");
                        double t = input.nextDouble();
                        calculation.setTrapezoid(a, b, t);
                        calculation.run();
                        System.out.println("Yaa hasilnya segini : " +calculation.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Uudah deh, programnya selesai.");
                        break;
                    default:
                        System.out.println("Pilih yang ada aja, jangan cari yang gaada");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e){
                System.out.println("===EROR : INPUTNYA HARUS NUMBER YA===");
                Scanner scanner;
                input.next();
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while (repeat);
        input.close();
    }
}
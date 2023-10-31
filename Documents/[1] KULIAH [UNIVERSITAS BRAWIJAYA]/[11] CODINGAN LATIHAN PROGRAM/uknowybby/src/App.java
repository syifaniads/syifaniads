//SYIFANI ADILLAH SALSABILA
//235150207111052
///////////////////////////////TUGAS AOK///////////////////////////////
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("PILIH JENIS KONVERSI");
            System.out.println("1. KONVERSI BINER KE DESIMAL");
            System.out.println("2. KONVERSI DESIMAL KE BINER");
            System.out.println("3. KONVERSI BINER KE HEXA");
            System.out.println("4. KONVERSI HEXA KE BINER");
            System.out.println("5. KONVERSI DESIMAL KE HEXA");
            System.out.println("6. KONVERSI HEXA KE DESIMAL");
            System.out.println("0. KELUAR");
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String biner = scanner.next();
                    System.out.println("Hasil: " + binaryToDecimal(biner));
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimal = scanner.nextInt();
                    System.out.println("Hasil: " + decimalToBinary(desimal));
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binerToHexa = scanner.next();
                    System.out.println("Hasil: " + binaryToHexa(binerToHexa));
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexa = scanner.next();
                    System.out.println("Hasil: " + hexaToBinary(hexa));
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int desimalToHexa = scanner.nextInt();
                    System.out.println("Hasil: " + decimalToHexa(desimalToHexa));
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexaToDecimal = scanner.next();
                    System.out.println("Hasil: " + hexaToDecimal(hexaToDecimal));
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String binaryToHexa(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String hexaToBinary(String hexa) {
        int decimal = Integer.parseInt(hexa, 16);
        return Integer.toBinaryString(decimal);
    }

    public static String decimalToHexa(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int hexaToDecimal(String hexa) {
        return Integer.parseInt(hexa, 16);
    }
}
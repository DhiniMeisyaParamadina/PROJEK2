import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dhini = new Scanner(System.in);
        //devinisi variabel
        String name;
        double x, sNaik, sTurun, sTotal, r;
        //x(tinggi mula - mula), r(jari - jari)

        System.out.println("Menghitung Panjang Lintasan Bola dari Awal Sampai Akhir");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Masukkan nama anda");
        name = dhini.nextLine();
        System.out.println("Masukkan ketinggian bola");
        double a = dhini.nextDouble();
        System.out.println("Masukkan coef r");
        r = dhini.nextDouble();
        sNaik = a / (1 - r);
        System.out.println("s Naik = a / 1-r");
        System.out.println("s Naik = 60 / 1-0,75");
        System.out.println("s Naik = 240");
        System.out.println("Diketahui s Naik dari sebuah bola : 240");
        sTurun = (a * r) / (1 - r);
        System.out.println("s Turun = a(r) / 1-r");
        System.out.println("s Turun = 60(0,75) / (1-0,75)");
        System.out.println("s Turun = 180 ");
        System.out.println("Diketahui s Turun dari sebuah bola : 180 ");
        sTotal = sNaik + sTurun;
        System.out.println("s Total = s Naik + s Turun");
        System.out.println("s Total = 240 + 180 = 420 ");
        System.out.println("===================================================================");
        System.out.println("Jadi Panjang Lintasan Bola dari Awal Sampai Berhenti Adalah 420 ");
        System.out.println("====================================================================");
        if (sTotal % 2 == 0) {
            System.out.println("Panjang Lintasan merupakan Bilangan Genap");
        } else {
            System.out.println("Panjang Lintasan Bukan merupakam Bilangan Genap");
        }
        System.out.println("------------------------- Thank You ----------------------------------------");



    }
}
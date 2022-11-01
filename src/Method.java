public class Method {
    public static void Penjumlahan(){
        int angka1=3;
        int angka2=4;
        int hasil = angka1+angka2;
    }
    public static void Perkalian(){
        int angka3 = 5;
        int angka4 = 8;
        int hasil_kali= angka3*angka4;
    }
     public static void CetakHearder(String header){
        System.out.println(header);
     }

     public static void CetakFooter(String footer){
        System.out.println(footer);
        System.out.println("---------------------------------------");
     }

     public static void GanjilGenap(int number1,int number2){
        int AfterCalculate = number1 * number2;
        if(AfterCalculate%2==0){
            System.out.println(AfterCalculate+"Adalah genap ");
        }else {
            System.out.println(AfterCalculate+"Adalah ganjil ");
        }
     }

     public static void main(String[] args){
        Penjumlahan();
        Perkalian();
        CetakHearder("ini adalah Haeder untuk ganjil genap");
        GanjilGenap(5,9);
        CetakFooter("ini adalah akhir ganjil genap");
     }
}

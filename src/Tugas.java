import java.util.Scanner;

public class Tugas {
    public static void main(String[] args){

        //deklarasi array
        String[] nama = new String[6];

        //membuat scanner
        Scanner scan =new Scanner(System.in);

        //input 6 nama siswa dalam array
        for (int i = 0; i < nama.length;i++){
            System.out.print("NAMA ke-" + i +":");
            nama[i] = scan.nextLine();
        }
        System.out.println("------------------------------------");

        //MENAMPILKAN SEMUA HASIL array
        for ( String b : nama){
            if((b.contains("a"))||(b.contains("i"))) {
                System.out.println("ADA a sama i ");
            }else {
                System.out.println("Gak ada a sama i");
            }
        }


    }
}

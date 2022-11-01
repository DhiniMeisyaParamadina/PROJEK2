import java.util.Scanner;










public class contoh2 {
    public static void main(String[] args){

        Scanner dhini= new Scanner(System.in);
        String[] belanjaansaya=new String[10];
        for (int index=0; index<belanjaansaya.length;index++){
            System.out.println("masukkan nama baranag");
            belanjaansaya[index]= dhini.nextLine();
        }
    }
}

import java.util.Scanner;

public class contoh {
    public static void main(String[] args){
        Scanner dhini =new Scanner(System.in);
        int input1 ;
        int input2 ;
        int hasil;
        System.out.println("masukkan input1 = ");
        input1= dhini.nextInt();
        System.out.println("masukkan input 2 =");
        input2= dhini.nextInt();
        for(int n= input1;n<=input2;n++){
            if ((n%3==0)&&(n%7==0)) {
                System.out.println("angka =" + n);
            }else {
                System.out.println("Tidak ada Kelipatan 3 dan 7");
            }



        }


        }
    }


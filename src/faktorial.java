import java.util.Scanner;

public class faktorial {
    public static void main(String[] args){

        Scanner inputData = new Scanner(System.in);
      int angka;
        int Faktorial=1;
      System.out.println("masukkan angka: ");
      angka = inputData.nextInt();
      for(int i = 1; 1<=angka;i++ ) {
          Faktorial = Faktorial *i;
      }
      System.out.println("hasil faktorial :" +Faktorial);

    }
}

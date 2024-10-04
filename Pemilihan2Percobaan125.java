import java.util.Scanner;

public class Pemilihan2Percobaan125{

    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input25.nextInt();

        if ((tahun %4) == 0) {
            if ((tahun % 100) != 0)
              System.out.print("Tahun Kabisat");
                if ((tahun % 400) != 0)
                System.out.print("Bukan Tahun Kabisat");
        }else
            System.out.print("Bukan Tahun Kabisat");

        input25.close();
    }







}
package TugasP4;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Tugas4 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        System.out.println("Masukan Angka: ");
        s = Integer.parseInt(br.readLine());

        for (int i = 0; i <= s; i++) {

            for (int j = i; j < s; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }


}

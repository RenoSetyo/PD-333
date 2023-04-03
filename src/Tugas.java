import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas {
    public static void main(String[] args) throws IOException {

        double sks = 3;
        double totalSks = 18;
        double totalNilai;
        double IPS;
        int nilai1;
        int nilai2;
        int nilai3;
        int nilai4;
        int nilai5;
        int nilai6;
        String huruf1, huruf2, huruf3, huruf4, huruf5, huruf6;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nilai mata kuliah ke - 1 : ");
        nilai1 = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Nilai mata kuliah ke - 2 : ");
        nilai2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 3 : ");
        nilai3 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 4 : ");
        nilai4 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 5 : ");
        nilai5 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai mata kuliah ke - 6 : ");
        nilai6 = Integer.parseInt(br.readLine());

//        KONVERSI NILAI KE BOBOT
//        Nilai 1
        if (nilai1 >= 80 && nilai1 <= 100) {
            huruf1 = "A";
        } else if (nilai1 >= 75 && nilai1 <= 79) {
            huruf1 = "B+";
        } else if (nilai1 >= 65 && nilai1 <= 74) {
            huruf1 = "B";
        } else if (nilai1 >= 60 && nilai1 <= 64) {
            huruf1 = "C+";
        } else if (nilai1 >= 55 && nilai1 <= 59) {
            huruf1 = "C";
        } else if (nilai1 >= 40 && nilai1 <= 54) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }

        if (nilai2 >= 80 && nilai2 <= 100) {
            huruf2 = "A";
        } else if (nilai2 >= 75 && nilai2 <= 79) {
            huruf2  = "B+";
        } else if (nilai2 >= 65 && nilai2 <= 74) {
            huruf2  = "B";
        } else if (nilai2 >= 60 && nilai2 <= 64) {
            huruf2  = "C+";
        } else if (nilai2 >= 55 && nilai2 <= 59) {
            huruf2  = "C";
        } else if (nilai2 >= 40 && nilai2 <= 54) {
            huruf2  = "D";
        } else {
            huruf2  = "E";
        }

//        Nilai 3
        if (nilai3 >= 80 && nilai3 <= 100) {
            huruf3 = "A";
        } else if (nilai3 >= 75 && nilai3 <= 79) {
            huruf3 = "B+";
        } else if (nilai3 >= 65 && nilai3 <= 74) {
            huruf3 = "B";
        } else if (nilai3 >= 60 && nilai3 <= 64) {
            huruf3 = "C+";
        } else if (nilai3 >= 55 && nilai3 <= 59) {
            huruf3 = "C";
        } else if (nilai3 >= 40 && nilai3 <= 54) {
            huruf3 = "D";
        } else {
            huruf3 = "E";
        }

//        Nilai 4
        if (nilai4 >= 80 && nilai4 <= 100) {
            huruf4 = "A";
        } else if (nilai4 >= 75 && nilai4 <= 79) {
            huruf4 = "B+";
        } else if (nilai4 >= 65 && nilai4 <= 74) {
            huruf4 = "B";
        } else if (nilai4 >= 60 && nilai4 <= 64) {
            huruf4 = "C+";
        } else if (nilai4 >= 55 && nilai4 <= 59) {
            huruf4 = "C";
        } else if (nilai4 >= 40 && nilai4 <= 54) {
            huruf4 = "D";
        } else {
            huruf4 = "E";
        }

//        Nilai 5
        if (nilai5 >= 80 && nilai5 <= 100) {
            huruf5 = "A";
        } else if (nilai5 >= 75 && nilai5 <= 79) {
            huruf5 = "B+";
        } else if (nilai5 >= 65 && nilai5 <= 74) {
            huruf5 = "B";
        } else if (nilai5 >= 60 && nilai5 <= 64) {
            huruf5 = "C+";
        } else if (nilai5 >= 55 && nilai5 <= 59) {
            huruf5 = "C";
        } else if (nilai5 >= 40 && nilai5 <= 54) {
            huruf5 = "D";
        } else {
            huruf5 = "E";
        }

//        Nilai 6
        if (nilai6 >= 80 && nilai6 <= 100) {
            huruf6 = "A";
        } else if (nilai6 >= 75 && nilai6 <= 79) {
            huruf6 = "B+";
        } else if (nilai6 >= 65 && nilai6 <= 74) {
            huruf6 = "B";
        } else if (nilai6 >= 60 && nilai6 <= 64) {
            huruf6 = "C+";
        } else if (nilai6 >= 55 && nilai6 <= 59) {
            huruf6 = "C";
        } else if (nilai6 >= 40 && nilai6 <= 54) {
            huruf6 = "D";
        } else {
            huruf6 = "E";
        }

        double ipk1 = 0, ipk2 = 0, ipk3 = 0, ipk4 = 0, ipk5 = 0, ipk6 = 0;

//        NILAI MATKUL KE - 1
        if (huruf1 == "A") {
            ipk1 = 4.0;
        } else if (huruf1 == "B+") {
            ipk1 = 3.50;
        } else if (huruf1 == "B") {
            ipk1 = 3.0;
        } else if (huruf1 == "C+") {
            ipk1 = 2.50;
        } else if (huruf1 == "C") {
            ipk1 = 2.0;
        } else if (huruf1 == "D") {
            ipk1 = 1.0;
        } else {
            ipk1 = 0.0;
        }

        //        NILAI MATKUL KE - 2
        if (huruf2 == "A") {
            ipk2 = 4.0;
        } else if (huruf2 == "B+") {
            ipk2 = 3.50;
        } else if (huruf2 == "B") {
            ipk2 = 3.0;
        } else if (huruf2 == "C+") {
            ipk2 = 2.50;
        } else if (huruf2 == "C") {
            ipk2 = 2.0;
        } else if (huruf2 == "D") {
            ipk2 = 1.0;
        } else {
            ipk2 = 0.0;
        }

//        NILAI MATKUL KE - 3
        if (huruf3 == "A") {
            ipk3 = 4.0;
        } else if (huruf3 == "B+") {
            ipk3 = 3.50;
        } else if (huruf3 == "B") {
            ipk3 = 3.0;
        } else if (huruf3 == "C+") {
            ipk3 = 2.50;
        } else if (huruf3 == "C") {
            ipk3 = 2.0;
        } else if (huruf3 == "D") {
            ipk3 = 1.0;
        } else {
            ipk3 = 0.0;
        }

        if (huruf4 == "A") {
            ipk4 = 4.0;
        } else if (huruf4 == "B+") {
            ipk4 = 3.50;
        } else if (huruf4 == "B") {
            ipk4 = 3.0;
        } else if (huruf4 == "C+") {
            ipk4 = 2.50;
        } else if (huruf4 == "C") {
            ipk4 = 2.0;
        } else if (huruf4 == "D") {
            ipk4 = 1.0;
        } else {
            ipk4 = 0.0;
        }

//        NILAI MATKUL KE - 5
        if (huruf5 == "A") {
            ipk5 = 4.0;
        } else if (huruf5 == "B+") {
            ipk5 = 3.50;
        } else if (huruf5 == "B") {
            ipk5 = 3.0;
        } else if (huruf5 == "C+") {
            ipk5 = 2.50;
        } else if (huruf5 == "C") {
            ipk5 = 2.0;
        } else if (huruf5 == "D") {
            ipk5 = 1.0;
        } else {
            ipk5 = 0.0;
        }

//        NILAI MATKUL KE - 6
        if (huruf6 == "A") {
            ipk6 = 4.0;
        } else if (huruf6 == "B+") {
            ipk6 = 3.50;
        } else if (huruf6 == "B") {
            ipk6 = 3.0;
        } else if (huruf6 == "C+") {
            ipk6 = 2.50;
        } else if (huruf6 == "C") {
            ipk6 = 2.0;
        } else if (huruf6 == "D") {
            ipk6 = 1.0;
        } else {
            ipk6 = 0.0;
        }

        totalNilai = ipk1 * sks + ipk2* sks + ipk3 * sks + ipk4 * sks + ipk5 * sks + ipk6 * sks;
        IPS = totalNilai / totalSks;

        System.out.println("\nNilai mata kuliah ke - 1 adalah : "+huruf1+"\nNilai mata kuliah ke - 2 adalah : "+huruf2+"\nNilai mata kuliah ke - 3 adalah : "+huruf3+"\nNilai mata kuliah ke - 4 adalah : "+huruf4+"\nNilai mata kuliah ke - 5 adalah : "+huruf5+"\nNilai mata kuliah ke - 6 adalah : "+huruf6);
        System.out.print("IPS yang diperoleh adalah: " + IPS);

//        Percabangan pengambilan SKS
        if (IPS < 2.00) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 18 SKS");
        } else if (IPS >= 2.00 && IPS <= 2.99) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 20 SKS");
        } else if (IPS >= 3.00 && IPS <= 3.49) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 22 SKS");
        } else if (IPS >= 3.50) {
            System.out.println("\nMaksimal SKS yang bisa anda ambil adalah 24 SKS");
        }
    }
}
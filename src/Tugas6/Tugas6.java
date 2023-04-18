package Tugas6;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Tugas6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi
        String[][] toko = new String[5][4];
        //konversi variabel
        int qty, jumlahqty, harga, totalharga, grandtotal=0, uangbayar, kembalian;

        try{
            //input data
            for (int i = 0; i < toko.length; i++) {
                System.out.print("Masukan nama barang: ");
                toko[i][0] = br.readLine();
                System.out.print("Total barang: ");
                toko[i][1] = br.readLine();

                //konversi tipe data dari ips[i][1] (string) ke double
                qty = Integer.parseInt(toko[i][1]);
                System.out.print("Harga: ");
                toko[i][2] = br.readLine();
                harga = Integer.parseInt(toko[i][2]);

                //memasukan perhitung
                totalharga = qty * harga;

                toko[i][3] = String.valueOf(totalharga);
                System.out.println("Total : "+toko[i][3]);

                //hitung grandtotal
                grandtotal = grandtotal + totalharga;
                System.out.println("---------------------------");



            }

            System.out.println("Grand total : " +grandtotal);
            System.out.print("Uang dibayar: ");
            uangbayar = Integer.parseInt(br.readLine());

            //perhitungan
            kembalian = uangbayar - grandtotal;
            System.out.print("Uang kembalian anda: Rp."+kembalian);

        }catch (Exception e){

        }



    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan19.saldotabungan;
/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan hasil saldo tabungan
 */
public class IF110119028Latihan19SaldoTabungan {

    /**
     */
    public static int saldo, lama = 6;
    public static Double bunga, jmlbunga;
    
    public static double hitungBunga(double bunga, int saldo) {
        jmlbunga = bunga * saldo;
        return jmlbunga;
    }
    
    public static void tampilSaldo(double bunga, int saldo) {
        for (int i = 1; i <= lama; i++) {
            saldo += hitungBunga(bunga, saldo);
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,d%n", saldo);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        tampilSaldo(0.15, 2500000);
    }
    
}
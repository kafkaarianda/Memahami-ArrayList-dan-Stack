import java.util.ArrayList;
import java.util.Scanner;

class SaldoArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balance = 2000000;
        ArrayList<Integer> tr = new ArrayList<>();
        System.out.println("1.Penarikan 2.Menyimpan 3.Lihat Saldo 4.Total Masuk 5.Total Keluar 0.Exit");
        while (true) {
            System.out.print("Pilih menu: ");
            int nav = in.nextInt();
            if (nav == 0) break;
            if ((nav == 1 || nav == 2) && tr.size() == 5) {System.out.println("Data Transaksi Sudah Penuh"); continue; }
            if (nav == 1) {
                System.out.print("Jumlah Yang Ditarik");
                int a = in.nextInt();
                if (a > balance) { System.out.println("saldo kurang, hanya " + balance); continue; }
                tr.add(-a); balance -= a;
            } else if (nav == 2) {
                System.out.print("Jumlah Yang Disimpan: ");
                int a = in.nextInt();
                tr.add(a); balance += a;
            } else if (nav == 3) {
                System.out.println("Saldo anda : " + balance);
            } else if (nav == 4) {
                int total = 0;
                for (int t : tr) if (t > 0) total += t;
                System.out.println("Total Uang Masuk : " + total);
            } else if (nav == 5) {
                int total = 0;
                for (int t : tr) if (t < 0) total += t;
                System.out.println("Total Uang Keluar : " + (-total));
            }
        }
        in.close();
      
      
      
      
      
      
        
    }
}

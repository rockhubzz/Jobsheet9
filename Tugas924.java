import java.util.Scanner;

public class Tugas924 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tinggi= 0, rendah= 2147483647, total= 0;
        
        System.out.print("Masukkan banyaknya elemen: ");
        int jmlElemen= sc.nextInt();
        int[] nilaiElemen= new int [jmlElemen];

        for(int i=0; i<jmlElemen; i++){
            System.out.print("Masukkan nilai elemen ke-"+(i+1)+": ");
            nilaiElemen[i]= sc.nextInt();
            total+= nilaiElemen[i];
        }

        for (int i=0; i<jmlElemen; i++) {
            if (nilaiElemen[i] > tinggi){
                tinggi = nilaiElemen[i];
            }else if (nilaiElemen[i] < rendah) {
                rendah = nilaiElemen[i];
            }
        }

        double rata2= (double) total/jmlElemen;
        System.out.println();
        System.out.println("Nilai elemen tertinggi adalah   : "+tinggi);
        System.out.println("Nilai elemen terendah adalah    : "+rendah);
        System.out.println("Nilai rata-rata elemen adalah   : "+rata2);

    }
}
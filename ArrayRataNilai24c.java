import java.util.Scanner;

public class ArrayRataNilai24c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nilaiMhs= new int[10];
        double total=0, rata2;
        int mhsLulus= 0, mhsGagal=0, nilaiLulus= 0, nilaiGagal= 0;

        for(int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilaiMhs[i]= sc.nextInt();
            if(nilaiMhs[i]>70){
                nilaiLulus+= nilaiMhs[i];
                mhsLulus++;
            }else if(nilaiMhs[i]<70){
                nilaiGagal+= nilaiMhs[i];
                mhsGagal++;
            }
        }
        System.out.println();

        int rata2Lulus= nilaiLulus/mhsLulus;
        int rata2Gagal= nilaiGagal/mhsGagal;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2Gagal);
        System.out.println("Jumlah mahasiswa yang lulus = "+mhsLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = "+mhsGagal);
    }
}
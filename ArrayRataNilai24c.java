import java.util.Scanner;

public class ArrayRataNilai24c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double total=0, rata2;
        int mhsLulus= 0, mhsGagal=0, nilaiLulus= 0, nilaiGagal= 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa= sc.nextInt();
        int[] nilaiMhs= new int[jmlMahasiswa];

        for(int i=0; i<jmlMahasiswa; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
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

        double rata2Lulus= (double) nilaiLulus/mhsLulus;
        double rata2Gagal= (double) nilaiGagal/mhsGagal;
        System.out.println("Rata-rata nilai lulus               = "+rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus         = "+rata2Gagal);
        System.out.println("Jumlah mahasiswa yang lulus         = "+mhsLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus   = "+mhsGagal);
    }
}
import java.util.Scanner;

public class ArrayRataNilai24b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] nilaiMhs= new int[10];
        double total=0, rata2;
        int mhsLulus= 0;

        for(int i=0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilaiMhs[i]= sc.nextInt();
            if(nilaiMhs[i]>70){
                mhsLulus++;
            }
        }

        for(int i=0; i<nilaiMhs.length; i++){
            total+= nilaiMhs[i];
        }

        rata2= total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus:"+mhsLulus);
    }
}
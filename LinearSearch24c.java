import java.util.Scanner;

public class LinearSearch24c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int hasil=0 ;
        System.out.print("Masukkan banyaknya elemen: ");
        int jmlElemen= sc.nextInt();
        int[] elemen= new int[jmlElemen];

        for(int i=0; i<jmlElemen; i++){
            System.out.print("Masukkan nilai elemen ke-"+(i+1)+": ");
            elemen[i]= sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key= sc.nextInt();

        for(int i=0; i<jmlElemen; i++){
            if(elemen[i] == key){
                hasil = i;
                System.out.println("Key yang anda cari berada di indeks ke-"+(hasil+1));
                break;
            } else{
                System.out.println("Key tidak ditemukan.");
                break;
            }
        }
    }
}
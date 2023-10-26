public class LinearSearch24 {
    public static void main(String[] args) {
        int[] arrayint= {34, 18, 26, 48, 72, 20, 56, 63};
        int key= 20;
        int Hasil= 0;

        for(int i=0; i<arrayint.length; i++){
            if(arrayint[i] == key){
                Hasil= i;
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-"+Hasil);
    }
}
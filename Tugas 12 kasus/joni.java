public class joni {
    public static void main(String[] args) {
        int akhir=110;

        for (int i=1;i<=akhir;i++){
            if(i%5==0){
                System.out.print("joni");
            }else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
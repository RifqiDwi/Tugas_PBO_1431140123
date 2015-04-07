public class persegipanjang {
    public static void main(String[] args) {
        int panjang=2;
        int lebar=4;
        for (int i=1;i<=lebar;i++){
            if (i%2==0){
                System.out.print(" ");
            }
            for (int j=1;j<=panjang;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}

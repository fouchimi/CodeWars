public class Triangular {

    public static int triangular(int n){
        int count = 0;
        while(n > 0){
            for(int i=0; i < n; i++){
                System.out.print("*");
                count++;
            }
            System.out.println();
            n--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Triangular.triangular(2));
        System.out.println(Triangular.triangular(4));
    }
}

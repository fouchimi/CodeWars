public class Logarithm {

    public static int lg(int N){
        return computeLogarithm(computeFactorial(N));
    }

    private static int computeLogarithm(int N){
        int counter = 0;
        while (N > 1){
            N = N/2;
            counter++;
        }
        return counter;
    }

    private static int computeFactorial(int N){
        if(N == 0 || N == 1) return 1;
        else return N*computeFactorial(N-1);
    }

    public static void main(String[] args) {
        System.out.println(Logarithm.lg(5));
    }
}

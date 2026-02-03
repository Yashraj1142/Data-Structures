class PowerSolution{
    double myPow(double x, int n){
        long N = n; //preventing overflow

        if(N<0){
            x = 1/x;
            N = -N;
        }

        return fastPow(x, N);
    }

    double fastPow(double x, long n){
        if(n == 0) return 1.0;

        double half = fastPow(x, n/2);

        if(n%2 == 0){
            return half*half;
        } else{
            return x*half*half;
        }
    }
}

public class Power{
    public static void main(String[] args) {
        PowerSolution p1 = new PowerSolution();
        System.out.println(p1.myPow(2, 5));
    }
}
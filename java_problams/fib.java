public class fib {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int a){
        if(a==1)
        return 0;
        if(a==2)
        return 1;
        return fibo(a-1)+fibo(a-2);
    }
}

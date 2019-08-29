public class Practice01MathRecursive implements Practice01Math {
    @Override
    public int fact(int n) throws Exception {
        if(n<0){
            throw new IllegalArgumentException();
        }
        if(n==0){
            return 1;
        }
        return (n*fact(n-1));
    }

    @Override
    public int fib(int n) throws Exception {
        if(n<0){
            throw new IllegalArgumentException();
        }
        if(n==0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
public class Practice01MathIterative implements Practice01Math {

    /**
     * Calculates the factorial of the input
     * @param n input
     * @return product
     * @throws Exception
     */
    @Override
    public int fact(int n) throws Exception {
        if (n < 0){
            throw new IllegalArgumentException();
        }
        int product = 1;
        for ( int j=1; j<=n; j++ ){
            product *= j;
        }
        return product;

    }

    @Override
    public int fib(int n) throws Exception {
        int x = 0;
        int y = 1;
        int z = 0;
        if(n < 0){
            throw new IllegalArgumentException();
        }
        if(n==0 || n==1){
            return n;
        }
        for(int i = 1; i < n; i++) {
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }

    public static void main(String[] args) {
        Practice01Math fib = new Practice01MathIterative();
        try{
            System.out.println(fib.fib(5));
        }catch (IllegalStateException e){
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SwapNumbers{
    public static void main(String[] args){
        int a = 12;
        int b = 41;

        int c = a + b;

        a = c - a;
        b = c - b;

        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
    }
}
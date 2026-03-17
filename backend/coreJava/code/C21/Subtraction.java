// Develop a program to subtract two numbers without using - sign
// This can be achieved using bitwise 2s compliment
// num = 4 --> ~num = -(num + 1) -- > ~num = -5

class Subtraction{
    public static void main(String[] args){
        int a = 8;
        int b = 3;
        int result = a + (~b + 1);
        System.out.println(result);
    }
}
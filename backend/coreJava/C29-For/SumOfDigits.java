// Develop a program to calculate the sum of all digits of a number

class SumOfDigits{
    public static void main(String[] args){
        int num = 255;
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num /=  10;
        }
        System.out.println("Sum of the digits in 255 is : " + sum);
    }
}
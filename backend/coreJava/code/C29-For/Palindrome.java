// Develop a program to check whether the number is palindrome or not

class Palindrome{
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);

        int num = 10101;
        int rev = 0;
        int tempNum = num;

        while(tempNum > 0){
            rev = (rev * 10) + (tempNum % 10);
            tempNum /= 10; 
        }
        if(num == rev) System.out.println(num + " is palindrome");
        else System.out.println(num + " is not palindrome");
    }
}
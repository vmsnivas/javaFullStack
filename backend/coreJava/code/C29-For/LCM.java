// Find the LCM of 4 and 6

class LCM{
    public static void main(String[] args){
        int a = 4;
        int b = 6;
        int lcm = 0;
        int max = (a > b) ? a : b;

        for(int num = max; ; num++){
            if((num % a == 0) && (num % b == 0)){
                lcm = num;
                break;
            }
        }
        System.out.println("LCM of " + a + " and " + b + " is : " + lcm);
    }
}
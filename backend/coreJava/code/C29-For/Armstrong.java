// Check whether a number is Armstrong number

class Armstrong{
    public static void main(String[] args){
        int num = 153;
        int count = 0;
        int sum = 0;
        int tempNum = num;
        while(tempNum > 0){
            count += 1;
            tempNum /= 10;
        }
        for(int i = 0; i < count; i++){
            int rem = num % 10;
            
        }
        System.out.println(count);
    }
}
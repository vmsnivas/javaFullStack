// Print prime numbers between 1 and 100

class Prime{
    public static void main(String[] args){
        for(int num = 1; num <= 100; num++){
            int tempNum = num;
            int count = 0;
            while(tempNum > 0){
                if(num % tempNum == 0) count += 1;
                tempNum--;
            }
            if(count == 2) System.out.println(num);
        }
    }
}
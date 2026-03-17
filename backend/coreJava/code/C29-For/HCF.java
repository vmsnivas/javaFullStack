// Find the HCF of 24 and 36

class HCF{
    public static void main(String[] args){
        int a = 24;
        int b = 36;
        int largest = 0;
        int smallest = 0;
        int hcf = 0;

        if(a > b){
            largest = a;
            smallest = b;
        }
        else{
            largest = b;
            smallest = a;
        }

        for(int num = 1; num <= smallest; num++){
            if((largest % num == 0) && (smallest % num == 0)) hcf = num;
        }
        System.out.println("HCF of " + a + " and " + b + " is : " + hcf);
    }
}
class Count {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9,10};

        int oddCount = 0;
        int evenCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0) oddCount++;
            else evenCount++;
        }

        System.out.println("There are " + oddCount + " odd numbers and " + evenCount + " even numbers in the array.");
    }
}
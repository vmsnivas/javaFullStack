class SmallestNum{
    public static void main(String[] args) {
        int []nums = {-1, 6, 8, 1, 3, 5, 0, -5, 8};
        int smallest = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < smallest) smallest = nums[i];
        }

        System.out.println("Smallest number is : " + smallest);
    }
}
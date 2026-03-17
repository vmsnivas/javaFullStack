class Sum {
    int sum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Sum s = new Sum();
        int []arr = {1,2,3,4,5};
        int result = s.sum( arr );

        System.out.println("Sum of the elements in array is : " + result);
    }    
}

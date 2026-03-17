class ReturnArray {
    int[] nums(){
        int []evens = {2,4,6,8,10};
        return evens;
    }
    public static void main(String[] args) {
        ReturnArray ra = new ReturnArray();
        int []arr = ra.nums();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

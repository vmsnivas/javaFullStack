class VarArgs {
    void add(int... nums){
        int sum = 0;
        for(int i : nums) sum += i;
        System.out.println("Sum : " + sum);
    }

    public static void main(String[] args) {
        VarArgs va = new VarArgs();
        va.add(1);
        va.add(1,2,2);
        va.add(1,2,4,8,0,9);
    }
}

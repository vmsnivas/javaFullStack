import java.util.Random;


class Otp{
    public static void main(String[] args){
        Random random = new Random();

        int otp = 100000 + random.nextInt(899999);

        System.out.println("OTP for account verification is : " + otp);
    }
}
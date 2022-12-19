package interviewprogram.exception;

public class CustomizedException {

    public String EligibleBuyCar(long Amount)throws MinCarAmount{

        if (Amount<500000){
            throw new MinCarAmount("You don't buy car");
        }else{
            return "You are Eligible to buy car";
        }

    }

    public static void main(String[] args) throws MinCarAmount {

        CustomizedException obj = new CustomizedException();
        String EligibleBuyCar = obj.EligibleBuyCar(600000);
        System.out.println(EligibleBuyCar);
    }
}

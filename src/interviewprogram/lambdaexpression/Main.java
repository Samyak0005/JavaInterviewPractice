package interviewprogram.lambdaexpression;

public class Main {
    public static void main(String[] args) {

        Vehicles vehicles = new BikeImpl();
        vehicles.SpeedMeter();

        //By Annomyrics Function

        Vehicles vehicles1 = new Vehicles() {
            @Override
            public void SpeedMeter() {
                System.out.println("This is Working With anonymous Function");
            }
        };
        vehicles1.SpeedMeter();

        // By lambda Experiences

        Vehicles vehicles2 = ()-> System.out.println("This is Working with Lambda Expression");
        vehicles2.SpeedMeter();

        //Multiply

        Multiply multiply = ((a, b) -> a*b);
        System.out.println("Multiply of two no "+multiply.mul(4,2));

        // Sum

        SumOfTwoNum sumOfTwoNum = ((a, b) ->{
            return(a+b);
        });
        System.out.println("Sum of Two Number"+sumOfTwoNum.Sum(4,4));

        // Even No
        
    }

}

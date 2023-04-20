package interviewprogram.polymorphism.override;

public class DemoB extends DemoA{

    public int AddSum(int n){

        return (n*n);
    }

    public static void main(String[] args) {
        //this is Error Becoz child Does Not Hold parent class object
        // DemoB obj = new DemoA();
        // We can Changes access Modifier like Protected to public
        //we change return like parent class Used String as Return and child class used int as Return
        DemoB obj = new DemoB();
        System.out.println(obj.AddSum(2,3));
        System.out.println(obj.AddSum(2));
        DemoA obj1 = new DemoB();
        System.out.println(obj.AddSum(3,4));
        DemoA obj2 = new DemoA();
        System.out.println(obj.AddSum(4,5));
    }
}

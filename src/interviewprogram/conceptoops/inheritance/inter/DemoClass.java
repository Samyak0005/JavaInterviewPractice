package interviewprogram.conceptoops.inheritance.inter;

public class DemoClass implements DemoInterface1,DemoInterface2{
    @Override
    public void m1() {
        System.out.println("this is Method of DemoInterface1");
    }

    @Override
    public void m2() {

        System.out.println("this is Method of DemoInterface2");
    }


    public static void main(String[] args) {

        DemoClass obj = new DemoClass();
        obj.m1();
        obj.m2();
    }


}

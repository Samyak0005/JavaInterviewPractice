package interviewprogram.designpattern;

public class Singleton {

    private Singleton(){}

    private static Singleton instance = new Singleton();

    public synchronized Singleton getInstance(){

        if(instance==null){

            return new Singleton();

        }else {
            return instance;
        }
    }

}

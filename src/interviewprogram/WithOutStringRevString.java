package interviewprogram;

public class WithOutStringRevString {
    public static void main(String[] args) {

        String name = "Samyak";
        String Rev = "";

        char [] ch = name.toCharArray();


        for (int i = ch.length-1; i>=0; i--){
            Rev = Rev+ch[i];
        }
        System.out.println(Rev);
    }
}

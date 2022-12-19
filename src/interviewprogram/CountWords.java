package interviewprogram;

public class CountWords {
    public static void main(String[] args) {

        String name = "ram kumar";
        int  count=1;

        for (int i=0; i<name.length()-1; i++){

             char a,b;
            a = name.charAt(i);
            b = name.charAt(i+1);

            if ((a==' ') && (b!=' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}

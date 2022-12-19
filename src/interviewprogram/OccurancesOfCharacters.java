package interviewprogram;

public class OccurancesOfCharacters {
    public static void main(String[] args) {
        String name = "Java is Good language";

        int temp = name.length();//
        int temp1 = name.replace("a","").length();

        int result = temp-temp1;
        System.out.println("Occurances of characters  "+result);

    }
}

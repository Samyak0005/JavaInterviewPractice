package interviewprogram;

public class CountTotalNumCharactersString {
    public static void main(String[] args) {

        String name = "Learn Java";
        int Count=0;

        for (int i=0; i<name.length(); i++){
            if (name.charAt(i)!=' '){
                Count = Count + 1;
            }
        }
        System.out.println(Count);
    }
}

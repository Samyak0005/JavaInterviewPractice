package interviewprogram;

public class DuplicationNum {
    public static void main(String[] args) {
        
        int marks[] = new int[]{23,45,60,65,34,50,40,90,50,40};

        Boolean temp = false;
        for (int i=0; i<marks.length; i++){
            for (int j=i+1; j<marks.length; j++){

                if (marks[i]==marks[j]){
                    System.out.println("Found Duplication Element :"+marks[i]);
                    temp = true;
                }
            }
        }
        if (temp==false){
            System.out.println("No Duplication Element");
        }

    }
}

import java.util.Scanner;

public class FamilyTree {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gen = sc.nextInt();
        int pos = sc.nextInt();


        char prof = predict_profession(gen , pos );

        System.out.println(prof=='e'? "Engineer" : "Doctor");

    }

    private static char predict_profession(int gen, int pos) {


        if( gen==1){
            return 'e';
        }

        double parent_pos= (double)  pos/2;

        char parent_prof= predict_profession(gen-1, (int) Math.ceil(parent_pos));

        if( pos%2==0){
            // if pos is even

//            if( parent_prof=='e'){
//                return 'd';
//            }
//            return 'e';

            return (parent_prof=='e'? 'd': 'e');
        }
        else {
            return (parent_prof=='e'? 'e': 'd');
        }



    }


}

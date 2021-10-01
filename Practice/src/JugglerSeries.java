import java.util.Scanner;

public class JugglerSeries {

    public static  int series(int first , int index){

        if ( index==1){
            return first ;
        }

        int previous = series(first, index-1);

        if( index%2==0){
            return  previous*previous*previous;
        }
        return  previous*previous;


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first_no = sc.nextInt();
        int index = sc.nextInt();

        int ans = series(first_no, index );
        System.out.println(ans);


    }

}

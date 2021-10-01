import java.util.ArrayList;
import java.util.Scanner;

public class Pascal_REC {

    public  static ArrayList<Integer> pascal(int row){

        if ( row==1){
            ArrayList<Integer> arr= new ArrayList<>();
            arr.add(1);
            //[1]
            return  arr;

        }
        if ( row==2){
            ArrayList<Integer> arr= new ArrayList<>();
            arr.add(1);
            arr.add(1);
            ////[1,1]
            return  arr;
        }

        //1,3,3,1
        ArrayList<Integer> prev = pascal(row-1);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 0; i <prev.size() -1; i++) {
            ans.add(prev.get(i)+prev.get(i+1));
        }
        ans.add(1);
        return  ans;



    }


    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int row = sc.nextInt();

        ArrayList<Integer> ans= pascal(row);
        System.out.println(ans);


    }

}

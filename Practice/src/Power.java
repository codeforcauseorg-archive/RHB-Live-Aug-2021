import java.util.Scanner;

public class Power {


    public static  int power2( int base, int power){

        if ( power ==0){
            return  1;
        }
        if ( power==1){
            return  base;
        }

        else{
            // compute the half power value;
            int rest_ans = power2(base , power/2);


            if ( power%2==0){
                return  rest_ans*rest_ans;
            }
            else {
                return  rest_ans*rest_ans*base;
            }


        }


    }


    public  static  int power( int base, int power){

        if ( power==0){
            return 1;
        }

        else{

            int ansrest =power(base, power-1);
                    //base^pow-1
            return  ansrest*base;

        }



    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        long start = System.currentTimeMillis();
        //
        System.out.println(start);


        int ans = power(base, power);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime);
        System.out.println(ans+" "+elapsedTime );
        start = System.currentTimeMillis();
        int ans2= power2(base, power);
        end = System.currentTimeMillis();
        elapsedTime = end - start;
        System.out.println(ans2+" "+ elapsedTime);



    }

}

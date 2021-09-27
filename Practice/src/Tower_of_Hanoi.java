import java.util.Scanner;

public class Tower_of_Hanoi {
//C:\Users\ishu\IdeaProjects\Practice\src\Tower_of_Hanoi.java

    public  static  void toh( int rings, char source, char aux, char dest){

        if( rings==1){
            System.out.println("Move the Disk no "+ rings+ " from " + source + " to "+ dest);
        }

        else{
            // mere upafr waalon ko aux mein bhej do
            toh(rings-1, source, dest, aux);
            System.out.println("Move the Disk no "+ rings+ " from " + source + " to "+ dest);
            //aux ->(source ) dest
            toh( rings-1,aux , source, dest);

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rings = sc.nextInt();

        toh( rings, 'A', 'B', 'C');

    }


}

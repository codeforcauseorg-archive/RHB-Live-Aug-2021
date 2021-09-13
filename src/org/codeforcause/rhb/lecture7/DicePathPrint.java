package org.codeforcause.rhb.lecture7;

public class DicePathPrint {

    public static void main(String[] args) {
        int sols = DicePathPrint.dicePath(5, 3);
        System.out.println(sols);
    }

    private static int dicePath(int target, int faces){
        if(target == 0){
            return 1;
        }

        int acc = 0;
        for (int face = 1; (face <= faces) && (face <= target); face++) {
            acc += dicePath(target-face, faces);
        }

        return acc;
    }
}

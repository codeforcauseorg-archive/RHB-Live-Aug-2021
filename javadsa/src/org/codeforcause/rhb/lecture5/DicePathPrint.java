package org.codeforcause.rhb.lecture5;

public class DicePathPrint {

    public static void main(String[] args) {
        DicePathPrint.dicePath("", 5, 3);
    }

    private static void dicePath(String tillNow, int target, int faces){
        if(target == 0){
            System.out.println(tillNow);
            return;
        }

        for (int face = 1; (face <= faces) && (face <= target); face++) {
            dicePath(tillNow+face, target-face, faces);
        }

    }
}

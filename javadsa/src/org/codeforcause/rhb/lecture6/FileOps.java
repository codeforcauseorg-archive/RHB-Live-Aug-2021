package org.codeforcause.rhb.lecture6;

import java.io.File;

public class FileOps {

    public static void main(String[] args) {
        File file = new File("sr/bingo");
//        System.out.println(file.exists());
//        file.createNewFile()
        if(!file.exists()){
            Boolean possible = file.mkdir();
            System.out.println(possible);
        }


    }
}

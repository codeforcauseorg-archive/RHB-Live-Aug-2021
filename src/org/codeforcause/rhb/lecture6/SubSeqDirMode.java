package org.codeforcause.rhb.lecture6;

import java.io.File;
import java.util.Scanner;

public class SubSeqDirMode {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String unproc = scn.nextLine();
        SubSeqDirMode.generate(unproc, "", "./solution/");
    }

    public static void generate(String unproc, String proc, String path){
        if(unproc.length() == 0){
            File location = new File(path);
            location.mkdirs();
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        SubSeqDirMode.generate(unproc, proc + ch, path+ proc + ch + "/");
        if (proc.equals("")){
            SubSeqDirMode.generate(unproc, proc, path + "*/");
        } else {
            SubSeqDirMode.generate(unproc, proc, path + proc + "/");
        }
    }




}

package org.codeforcause.rhb.lecture6;

import java.io.*;
import java.util.Scanner;

public class ReadFileProc {

    public static void main(String[] args) throws Exception{
        File file = new File("hello.txt");
//        InputStream ins = new FileInputStream(file);
//        Scanner scn = new Scanner(ins);

        PrintStream out = new PrintStream(file);
        out.println("Wee have this under control");

//        System.out.println(scn.nextLine());


    }
}

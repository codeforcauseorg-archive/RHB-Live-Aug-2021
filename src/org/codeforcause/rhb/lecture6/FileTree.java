package org.codeforcause.rhb.lecture6;

import org.codeforcause.rhb.lecture5.Fibo;

import java.io.File;

public class FileTree {
    public static void main(String[] args) {

        File root = new File(".");
        FileTree.nameFilesIndent(root, "");

//        File root = new File(".");
//        File[] children = root.listFiles();
//        for (int i = 0; i < children.length; i++) {
//            File file = children[i];
//            System.out.println(file.getName() + " " + file.isDirectory());
//        }
////        System.out.println(root.getAbsolutePath());
    }

    public static void nameFiles(File root){
        if(!root.isDirectory()){
            System.out.println(root.getName());
            return;
        }

        System.out.println(root.getName());
        File[] children = root.listFiles();
        for (int i = 0; i < children.length; i++) {
            File file = children[i];
            FileTree.nameFiles(file);
        }
    }

    public static void nameFilesIndent(File root, String indent){
        if(!root.isDirectory()){
            System.out.println(indent + root.getName());
            return;
        }

        System.out.println(indent + root.getName());
        File[] children = root.listFiles();
        for (int i = 0; i < children.length; i++) {
            File file = children[i];
            FileTree.nameFilesIndent(file, indent + "\t");
        }
    }
}

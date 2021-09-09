package org.codeforcause.rhb.lecture4;

public class ConvertAlternateCase {
    public static void main(String[] args) {
        String line = "We are so happy.";
        String result = ConvertAlternateCase.toAlternateCase(line);
        System.out.println(result);
    }

    public static String toAlternateCase(String line){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if((i % 2) == 0){
                if((ch >= 'a') && (ch <= 'z')){
                    int index = ch - 'a';
                    ch = (char)('A' + index);
                }
            } else {
                if((ch >= 'A') && (ch <= 'Z')){
                    int index = ch - 'A';
                    ch = (char)('a' + index);
                }
            }


            sb.append(ch);
        }

        return sb.toString();

    }
}

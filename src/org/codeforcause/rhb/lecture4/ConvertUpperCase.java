package org.codeforcause.rhb.lecture4;

public class ConvertUpperCase {
    public static void main(String[] args) {
        String line = "We are so happy.";
        String result = ConvertUpperCase.toUpperCase(line);
        System.out.println(result);
    }

    public static String toUpperCase(String line){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if((ch >= 'a') && (ch <= 'z')){
                int index = ch - 'a';
                ch = (char)('A' + index);
            }

            sb.append(ch);

        }

        return sb.toString();

    }
}

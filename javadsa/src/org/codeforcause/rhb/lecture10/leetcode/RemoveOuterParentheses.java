package org.codeforcause.rhb.lecture10.leetcode;

// https://leetcode.com/problems/remove-outermost-parentheses/

public class RemoveOuterParentheses {

    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder("");
        int counter = 0;

        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                counter++;
                if(counter > 1){
                    sb.append("(");
                }
            } else {
                counter--;
                if(counter >= 1){
                    sb.append(")");
                }
            }
        }

        return sb.toString();

    }
}

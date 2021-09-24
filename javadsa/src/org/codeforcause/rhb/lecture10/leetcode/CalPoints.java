package org.codeforcause.rhb.lecture10.leetcode;


// https://leetcode.com/problems/baseball-game

import java.util.Stack;

class CalPoints {
    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<ops.length; i++){
            String op = ops[i];

            if(op.equals("C")){
                stack.pop();
            } else if(op.equals("D")){
                stack.push(stack.peek()*2);
            } else if(op.equals("+")){
                int top = stack.pop();
                int second = stack.pop();
                int sum = top + second;

                stack.push(second);
                stack.push(top);
                stack.push(sum);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while(!stack.empty()){
            sum += stack.pop();
        }

        return sum;

    }
}
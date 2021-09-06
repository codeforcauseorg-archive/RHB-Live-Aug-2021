package org.codeforcause.rhb.lecture3;

import javax.crypto.spec.PSource;

public class StringEdit {
    public static void main(String[] args) {
//        String something = "a";
//        for (int i = 0; i < 1000000; i++) {
//            something = something + "a";
//        }

        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 100000000; i++) {
            sb.append("a");
        }
    }
}

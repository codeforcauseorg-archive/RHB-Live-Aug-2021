package org.codeforcause.rhb.lecture10;

public class CFCTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Teaches awesome content");
    }

    public void dance() {
        System.out.println("BBam bam bams");
    }
}

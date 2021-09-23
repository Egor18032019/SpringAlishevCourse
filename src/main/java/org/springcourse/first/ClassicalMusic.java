package org.springcourse.first;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Rapsodia";
    }

    public void doMyInit (){
        System.out.println("Do my initialization ......");
    }

    public void doMyDestroy(){
        System.out.println("Destroy alll");
    }
}

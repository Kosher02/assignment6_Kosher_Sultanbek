package com.company.task2;

public class Main {

    public static void main(String[] args) {
        transport t1 = service.getInstance().getCab("CAR");//output with word
        System.out.println(t1.getRate());//cout

        transport t2 = service.getInstance().getCab("BOAT");
        System.out.println(t2.getRate());    }//cout
}

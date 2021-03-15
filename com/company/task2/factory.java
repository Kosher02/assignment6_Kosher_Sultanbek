package com.company.task2;

class factory {

    public transport getTransport(String type) {
        switch(type) {
            case "CAR" ://cases
                return new Car();//output
            case "BOAT" ://another case
                return new Boat();//output
            default:
                return null;//0
        }
    }
}

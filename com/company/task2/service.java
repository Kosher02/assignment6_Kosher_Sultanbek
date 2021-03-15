package com.company.task2;

class service{
    private static service onlyInstance;//static

    private service() {
    }


    synchronized public static service getInstance() {

        if (onlyInstance == null) {//if else for checking
            synchronized (service.class) {
                if (onlyInstance == null) {
                    onlyInstance = new service();
                }
            }
        }
        return onlyInstance;
    }

    public transport getCab(String type) {
        return new factory().getTransport(type);
    }//getter
}

package com.company.task1;//taks1

public class Database {//class

    private static Database instance = null;//equalling
    public String s;//string

    private Database()
    { }

    public static Database getInstance()
    {
        if (instance == null)//if else statement
            instance = new Database();//new instance

        return instance;
    }

}

package com.chennai;
public class MethodOverLoading
{public  static void main(String[] args)
{   System.out.println("main method");
    MethodOverLoading.main(15);
    MethodOverLoading.main(15,48);
    MethodOverLoading.main();
    MethodOverLoading.main("hello");
}
public  static void main(int num1)
{
    
    System.out.println("main method overloaded 1st");
}
public  static void main(int num1,int num2)
{
    
    System.out.println("main method overloaded 2st");
}

public  static void main()
{
    
    System.out.println("main method overloaded 3nd");
}

public  static void main(String args)
{
    
    System.out.println("main method overloaded 3rd");
}



}

package india;

public class Market
{
int mp,sp,d;
String name,company;
Market(int mp,int sp,int d)
{

    this.mp=mp;                 // this keyword is used to differentiate local variable and instance variable
    this.sp=sp;
    this.d=d;
System.out.println("first constructor");
}
Market(int mp,int sp,int d,String name)
{

    this(mp,sp,d);              // this() keyword is used to call current class constructor
    this.name=name;
System.out.println("second constructor");

}
Market(int mp,int sp,int d,String name,String company)
{
this(mp,sp,d,name);
this.company=company;
System.out.println("third constructor");
}
Market()
{System.out.println("product not available");
}
public static void main(String[] args)
{
Market obj = new Market(100,80,20);
Market obj1 = new Market(200,180,20,"garlic");
Market obj2 = new Market(300,280,20,"lemon","aachi");
Market obj3= new Market();
obj.details();
obj1.details();
obj2.details();
obj3.details();
}
public void details()
{
System.out.println(mp+" "+sp+" "+d+" "+name+" "+company);
this.address();                             // this is used to invoke method
}
public static void address()
{System.out.println("aachi store no branch");
}
}

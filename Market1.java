package india;

public class Market1 extends Market
{
int mp,sp,d;
String name,company,manufact;
Market1(int mp,int sp,int d,String name,String company, String manufact)
{
super(mp,sp,d,name,company);            //reusing parent constructor // explicity call of parent constructor 
this.manufact=manufact;
}
public static void main(String[] args)
{
Market1 obj = new Market1(400,380,20,"calendar","murugan","local");
obj.details();
}
public void details()
{
System.out.println(mp+" "+sp+" "+d+" "+name+" "+company+" "+manufact);

}
}

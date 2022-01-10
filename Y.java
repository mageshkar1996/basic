package india;

public class Y extends X
{
int a=116;
int h=112;
public static void main(String[] args)
{
    Y obj = new Y();
    obj.display();
    obj.walking();
}
public void display()
{
System.out.println(h);
System.out.println(a);
System.out.println(b);              
System.out.println(c);
System.out.println(super.a);
}
public void walking()               //overridden method 
{
System.out.println("y is walking now");
super.walking();                    //parent class method 
}

}

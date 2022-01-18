class School
{
String school;
int pincode;
int rank;

School(String school,int pincode,int rank)
{
this.school=school;
this.pincode=pincode;
this.rank=rank;
}
}

public class Jck extends School
{
int phone;
Jck(String school,int pincode,int rank,int phone)
{
super(school,pincode,rank);
this.phone=phone;
}
public static void main(String[] args)
{
    Jck magesh= new Jck("jck",614802,4,84);
magesh.function();
}
public void function()
{
System.out.println(school);
System.out.println(pincode);
System.out.println(rank);
System.out.println(phone);
}
}


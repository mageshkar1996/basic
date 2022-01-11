public class OverLoading
{

public static void main(String[] args)
{
        OverLoading obj = new OverLoading();
        System.out.println(obj.max(4,5));
        System.out.println(obj.max(4.7,5.8));
        System.out.println(obj.max('a','b'));
}
public int max(int a,int b)
{
return a>b?a:b;    
}
public double max(double a,double b)
{
return a>b?a:b;    
}
public char max(char a,char b)
{
return a>b?a:b;    
}


}

public class OverLoading
{

public static void main(String[] args)
{
        OverLoading obj = new OverLoading();
        System.out.println(obj.max(4,5));
        System.out.println(obj.max(4.7,5.8));
        System.out.println(obj.max('a','b'));
        System.out.println(obj.max(14,18,98));
        System.out.println(obj.max('f','e','t'));
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
public int max(int a,int b,int c)
{
return (a>b)?(a>c?a:c):(b>c?b:c);
}
public char max(char a,char b,char c)
{
return (a>b)?(a>c?a:c):(b>c?b:c);    
}


}

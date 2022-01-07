public class Student
{
    int social;
    int science;
    int maths;
    static String school="ABC"; 
    int roll;
    int score;
    String name;
    Student(String name,int roll,int social,int science,int maths)
    {
    this.name    =   name;
    this.roll    =   roll;
    this.social  =   social;
    this.science =   science;
    this.maths   =   maths;
    }
Student()
{
    System.out.println("hello");
}
Student(String name,int roll)
{
    this.name =name;
    this.roll =roll;
}

    public static void main(String[] args)
    {
    Student student1 = new Student("abi",100,89,79,87);
    Student student2 = new Student("bala",101,90,75,88);
    Student student3 = new Student("charles",102,91,99,78);
    Student student4 = new Student("eniyan",103,92,45,48);
    Student student5 = new Student("kumar",104,93,48,78);
    Student student6 = new Student();
    Student student7 = new Student("roja",105);
    student1.studentdetails();
    student2.studentdetails();
    student3.studentdetails();
    student4.studentdetails();
    student5.studentdetails();
    student6.studentdetails();
    student7.studentdetails();
    }
public void studentdetails()
{
System.out.println("school name:"+" "+Student.school);
System.out.println("student name:"+" "+name);
System.out.println("student roll no:"+" "+roll);
System.out.println("total marks:"+" "+maths+science+social);
int total=maths+science+social;
if (total>250)
{
System.out.println("status"+" "+"scoring good"+" "+name);
}
else
{
System.out.println("status"+" "+"need improvement"+" "+name);
}
System.out.println();


}

}

import java.lang.*;
import java.util.*;
//class 1
class Student
{
    int rollno;
    String name,address;
    public Student(int rollno, String name, String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
    public String toString()
    {
        return this.rollno+" "+this.name+" "+this.address;
    }
}
//class 2
class SortbyRollno implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.rollno-b.rollno;
    }
}
//class 3
class SortbyName implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.name.compareTo(b.name);
    }
}
//class 4
class SortbyAddress implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.address.compareTo(b.address);
    }
}
//main driver class
class Comparator1
{
    public static void main(String args[])
    {
        ArrayList<Student> ar=new ArrayList<Student>();
        ar.add(new Student(5,"g","r"));
        ar.add(new Student(9,"j","p"));
        ar.add(new Student(7,"f","w"));
        ar.add(new Student(3,"p","d"));

        System.out.println("Unsorted");
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));

        System.out.println("Sort by rollno");
        Collections.sort(ar,new SortbyRollno());
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));

        System.out.println("Sort by name");
        Collections.sort(ar,new SortbyName());
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));

        System.out.println("Sort by address");
        Collections.sort(ar,new SortbyAddress());
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));
    }
}

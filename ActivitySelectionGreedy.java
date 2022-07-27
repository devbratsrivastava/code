import java.util.*;
import java.io.*;
class Activity
{
    int start ,finish;
    public Activity(int start ,int finish)
    {
        this.start=start;
        this.finish=finish;
    }
}
// user defined comparator
class Compare
{
     static void compare(Activity arr[],int n)
     {
         Arrays.sort(arr,new Comparator<Activity>()
                 {
                     @Override
                     public int compare(Activity s1,Activity s2)
                     {
                         return s1.finish-s2.finish;
                     }
                 }
         );
     }
}
// driver class
class ActivitySelectionGreedy
{
    static void printMaxActivities(Activity arr[],int n)
    {
        Compare obj=new Compare();
        obj.compare(arr,n);
        System.out.println("Activities selected");
        int i=0;
        System.out.println(arr[i].start+" "+arr[i].finish);
        for(int j=1;j<n;j++)
        {
            if(arr[j].start>=arr[i].finish)
            {
                System.out.println(arr[j].start+" "+arr[j].finish);
                i=j;
            }
        }
    }
    //main
    public static void main(String args[])
    {
        int n=6;
        Activity arr[]=new Activity[n];
        arr[0] = new Activity(5, 9);
        arr[1] = new Activity(1, 2);
        arr[2] = new Activity(3, 4);
        arr[3] = new Activity(0, 6);
        arr[4] = new Activity(5, 7);
        arr[5] = new Activity(8, 9);
        printMaxActivities(arr,n);
    }
}

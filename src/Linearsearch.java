import java.util.Iterator;
import java.util.Scanner;
public class Linearsearch {
    public void lin_Search(int a[],int k)
    {
        int flag=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]==k) {
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }

    public int [] sel_sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int swap=a[i];
            a[i]=a[min];
            a[min]=swap;

        }
        return a;
    }
    public void Binary_search(int a[],int k) {
        int f=0;
        int b[]=new int[a.length];
        b=sel_sort(a);
        int m,s=0,l=b.length;
        for (int i=0;i<l+1;i++) {
            m=(s+l)/2;
            if(b[m]==k){
                f=1;
                break;
            }
            else if(b[m]>k) {
                l=m-1;
            }
            else {
                s=m+1;
            }
        }
        if(f==1) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        int n,search;
        Scanner myobj= new Scanner(System.in);
        System.out.println("enter the no of elements to be  added");
        n=myobj.nextInt();
        int  a[]=new int[n];
        System.out.println("search the element in the given array");
        search=myobj.nextInt();
        System.out.println("enter the elements to be added:");
        for(int i=0;i<n;i++)
        {
            a[i]=myobj.nextInt();
        }
        Linearsearch obj=new Linearsearch();
        obj.lin_Search(a, search);
        int b[]=new int[a.length];
        b=obj.sel_sort(a);
        System.out.println("sorted array is:");
        for(int e : b)
        {
            System.out.println(e);
        }
        System.out.println("binary search:");
        obj.Binary_search(a,search);
    }
}

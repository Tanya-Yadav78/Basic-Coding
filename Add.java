import java.util.*;
public class Add
{
    public static void add(int a,int b)
    {   int add;
        add=a+b;
        System.out.println(add);
    
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);

    }
}


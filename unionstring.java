import java.util.*;
class Main
{
    public static void main(String args[])
    {
        String  ar1[]={"hello","hai","amar","raj"};
        String ar2[]={"raj","hello","hello","rajitha"};
        Set<String> a=new HashSet<>();
        Set<String> b=new HashSet<>();
        for(String s : ar1)
        a.add(s);
        for(String s1 : ar2)
        b.add(s1);
        System.out.println(a);
        System.out.println(b);
        Set<String> u=new HashSet<>(a);
        u.addAll(b);
        System.out.println(u);


    }
}
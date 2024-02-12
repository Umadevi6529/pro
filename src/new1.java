import java.util.*;
public class new1 {
    public static void main(String args[])
    {
        StringBuilder s= new StringBuilder("kiran");
        System.out.println(s);
        s.setCharAt(0, 'p');
        System.out.println(s);

        for(int i=0;i<s.length()/2;i++)
        {
            int f=i;
            int b=s.length() - 1 - i;
            char fr=s.charAt(f);
            char br=s.charAt(b);
            s.setCharAt(f, br);
            s.setCharAt(b, fr);
        }
        System.out.println(s);
    }
}

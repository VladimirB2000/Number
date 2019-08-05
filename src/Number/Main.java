package Number;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int a = Integer.parseInt(number);
        if (a==0)
            System.out.println("ноль");
        if ((a+(a%2))-a==0 && a>0)
            System.out.println("положительное четное число" );
        if ((a+(a%2))-a !=0 && a>0)
            System.out.println("положительное нечетное число");
        if ((a+(a%2))-a==0 && a<0)
            System.out.println("отрицательное четное число");
        if ((a+(a%2))-a !=0  && a<0)
            System.out.println("отрицательное нечетное число");

    }
}

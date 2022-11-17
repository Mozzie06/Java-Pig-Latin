import java.util.*;



public class Program

{

    public static void main(String[] args) {

    

        Scanner in = new Scanner(System.in);

        String[] ws = in.nextLine().split(" "); 

        for (String w:ws) System.out.print(w.substring(1) + w.substring(0,1) + "ay ");

	}
}

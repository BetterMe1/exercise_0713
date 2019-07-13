package exercise.exercise_0712;


/*
Broken KeyBoard
 */
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.next().toUpperCase();
            String s2 = in.next().toUpperCase();
            int len1 = s1.length();
            int len2 = s2.length();
            String result = "";
            int i=0;
            int j=0;
            char b = s2.charAt(j);
            for(; i<len1; i++){
                char a = s1.charAt(i);
                if(j<len2){
                    b = s2.charAt(j);
                    if(a!=b){
                        if(!result.contains(String.valueOf(a))){
                            result += String.valueOf(a);
                        }
                    }else{
                        j++;
                    }
                }else{
                    if(!result.contains(String.valueOf(a))){
                        result += String.valueOf(a);
                    }
                }
            }
            System.out.println(result);
        }
    }
}*/

/*
球的半径和体积
 */
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int z0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int z1 = in.nextInt();
            double R = Math.sqrt((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1)+(z0-z1)*(z0-z1));
            double V = R*R*R*Math.acos(-1)*4/3;
            System.out.println(String.format("%.3f",R)+" "+String.format("%.3f",V));
        }
    }
}
*/

/*
百万富翁问题
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        solution(30);
    }
    public static void solution(int n) {
        System.out.print(10*n);
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.pow(2,i);
        }
        System.out.println(" "+sum);
    }
}
/**
 * Created by anton.y.melnyk on 7/10/2017.
 */
public class Main {
    private int number = 5;
    private String test = "testgit";
    private double positionX = 0.013d;

    private String concat(String s, double d){
        String concatStr = s + d;
        return concatStr;

    }

    private static void doSome(){
        System.out.println(new Main().concat("Number", 0.0456));
    }
}

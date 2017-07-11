/**
 * Created by anton.y.melnyk on 7/10/2017.
 */
public class Main {
    public void setNumber(int number) {
        this.number = number;
    }

    private int number = 5;

    private int x =6;

    private String name = "";

    public int getNumber() {
        return number;
    }

    public String getTest() {
        return test;
    }

    private String test = "testgit";
    private double positionX = 0.013d;

    private String concat(String s, double d){
        String concatStr = s + d;
        return concatStr;

    }

    private static void doSome(){
        System.out.println(new Main().concat("Number ", 0.0456));
    }

    public static void main(String[] args) {
        Main m = new Main();

        System.out.println(m.number);
        Main.doSome();
        m.setNumber(7);
        System.out.println(m.getNumber());
        System.out.println(new Main().number);
    }
}

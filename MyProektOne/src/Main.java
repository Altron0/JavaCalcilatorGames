import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        Chi objA = new Chi("One obrt", 12);
        Chi objB = new Chi(objA);

        objA.showText();
        objB.showText();

        objB.name = "Второй обьект";
        objB.namber = 178;

        objB.showText();

        objA = objB.copy();

        objA.showText();

        objB.name = "Третий обьект!!!!!!!!!!!!!";
        objB.namber = 134587623;

        objA.showText();
        objB.showText();
    }
}

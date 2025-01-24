import javax.swing.*;
import java.util.Objects;
class Chi{
    int namber;
    String name;


    Chi(String str, int num){
        namber =  num;
        name = str;
    }


    Chi(Chi obj){
        name = obj.name;
        namber = obj.namber;
    }


    Chi copy(){
        Chi obj = new Chi(name, namber);
    return obj;
    }


    public void showText(){
         String str = "Поля обьектов:\n";
         str += "nume = " + name + "\n";
         str += "namber = " + namber + "\n";
         JOptionPane.showMessageDialog(null, str);
     }
}






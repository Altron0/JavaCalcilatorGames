import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoadWindow extends JFrame {


    public static ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    };


    /// Задает Название.окн, Высоту.окн,  Ширину.окн
    public RoadWindow(String text, int height, int width){
        setTitle(text);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static Button[] AddMushButton(Button[] bt){
        for(int i = 0;i < bt.length;i++){

            String copyI = String.valueOf(i);

            bt[i] = new Button();
            bt[i].setLabel(copyI);

            bt[i].addActionListener(actionListener);
        }
        return bt;
    }


    public static void AddDescription(){}

}

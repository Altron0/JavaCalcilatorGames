import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //создание основного окна
        JFrame roadWindow = new RoadWindow("Calculator", 450, 300);

        JPanel windowPanel = new JPanel();
        roadWindow.add(windowPanel);

        Button[] button = new Button[10];
        RoadWindow.AddMushButton(button);

        for (Button value : button) {
            windowPanel.add(value);
            windowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        }

        roadWindow.setVisible(true);
    }
}
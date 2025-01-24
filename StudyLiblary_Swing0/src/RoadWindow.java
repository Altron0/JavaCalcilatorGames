import javax.swing.*;

public class RoadWindow extends JFrame {

    /// Задает Название.окн, Высоту.окн,  Ширину.окн
    public RoadWindow(String text, int height, int width){
        setTitle(text);
        setSize(width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

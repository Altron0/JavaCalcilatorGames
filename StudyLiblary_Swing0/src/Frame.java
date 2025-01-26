import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    /// Создание интерфейса для раположения элементов
    private JPanel MainPanel;

    /// Подсчет полученных значений с калькулятора и вывод вычесленного результата
    private JLabel TextField;

    /// Создание кнопок для получения значений
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;


    /// Создание кнопок для определения типа операции
    private JButton typeOperationButton1;
    private JButton typeOperationButton2;
    private JButton typeOperationButton3;
    private JButton typeOperationButton4;
    private JButton PrintResultButton;


    /// Создание обработчика событий для получения информации с нажатой кнопки калькулятора
    public ActionListener actionListener;

    /// Получение чисел с нажатых кнопок и также тип операции для их вычисления
    public int OneText;
    public int TwoText;
    public char TypeOperation;

    /// Переменная служит для последовательного получения результата с нажатой кнопки (по очереди)
    public int couldInputValue = 0;

    /// Конструктор - создает и реализует главное окно
    public Frame() {
        Add_MainWindow();

        // Реализация слушателей, а также добавление слушателя ко всем кнопкам
        // И вычисление результата введеного с калькулятора
        actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton sours = (JButton) e.getSource();

                switch (couldInputValue) {


                    case 0: {
                        OneText = Integer.parseInt(sours.getText());
                        TextField.setText(String.valueOf(OneText));
                        couldInputValue++;
                        break;
                    }


                    case 1: {
                        TypeOperation = sours.getText().charAt(0);
                        TextField.setText(String.valueOf(TextField.getText() + String.valueOf(TypeOperation)));
                        couldInputValue++;
                        break;
                    }


                    case 2: {
                        TwoText = Integer.parseInt(sours.getText());
                        TextField.setText(TextField.getText() + String.valueOf(TwoText));
                    couldInputValue++;
                        break;
                    }


                    case 3: {
                        switch (TypeOperation) {

                            case '+':
                                TextField.setText(String.valueOf(OneText + TwoText));
                                break;

                            case '-':
                                TextField.setText(String.valueOf(OneText - TwoText));
                                break;

                            case '*':
                                TextField.setText(String.valueOf(OneText * TwoText));
                                break;
                            case '/':
                                TextField.setText(String.valueOf(OneText / TwoText));
                                break;
                        }
                        couldInputValue = 0;
                        break;

                    }
                }

            }
        };
        AddActionListener();
        setVisible(true);
    }


    ///Создание главного окна и добавление интерфейса для расположения компонентов
    public void Add_MainWindow() {
        setTitle("Calculator");
        setSize(300, 300);
        setContentPane(MainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    /// Добавление СТУШАТЕЛЕЙ для всех кнопок
    public void AddActionListener() {
        button0.addActionListener(actionListener);
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        button6.addActionListener(actionListener);
        button7.addActionListener(actionListener);
        button8.addActionListener(actionListener);
        button9.addActionListener(actionListener);

        typeOperationButton1.addActionListener(actionListener);
        typeOperationButton2.addActionListener(actionListener);
        typeOperationButton3.addActionListener(actionListener);
        typeOperationButton4.addActionListener(actionListener);

        PrintResultButton.addActionListener(actionListener);
    }

}

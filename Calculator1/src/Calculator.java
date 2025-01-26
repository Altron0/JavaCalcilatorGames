public class Calculator {
    private static double A;
    private static double B;
    private static char TypeOperation;


    /// Присваивание значение классу;
    /// Тип операции, первое число, второе число.
    public static void CalculatorGive(char Operation, double a, double b){
        A = a;
        B = b;
        TypeOperation = Operation;
    }


    /// Вычисление результата из введеных пользователем данных
    public static double CalculatorOperation(){
        double Value = 0;
        switch (TypeOperation){
            case '+': {
                Value = A + B;
                break;
            }
            case '-': {
                Value = A - B;
                break;
            }
            case '*': {
                Value = A * B;
                break;
            }
            case '/': {
                Value = A / B;
                break;
            }
        }
        return Value;
    }
}

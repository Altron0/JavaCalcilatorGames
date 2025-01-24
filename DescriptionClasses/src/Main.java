import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to filling and add a Player and Coach!");

        System.out.println("Enter coach for team: ");
        Coach coach = ChessTeam();

        System.out.println("Enter ChessPlayer for Coach: ");
        ChessPlayer chessPlayer1 = ChessPlayer(coach);

        ShowAll_Information(chessPlayer1);
    }


    public static Coach ChessTeam(){
        System.out.println("Enter serName: ");
        String SerName = scannerString();

        System.out.println("Enter Name: ");
        String Name = scannerString();

        System.out.println("Enter MiddleName: ");
        String MiddleName = scannerString();

        System.out.println("Enter country");
        String country = scannerString();

        System.out.println("Enter SpeciaLization for coach: ");
        String speciallization = scannerString();

        Coach coachChess = new Coach(country, SerName, Name, MiddleName, speciallization);
        return coachChess;
    }


    public static ChessPlayer ChessPlayer(Coach coach){
        System.out.println("Enter serName: ");
        String SerName = scannerString();

        System.out.println("Enter Name: ");
        String Name = scannerString();

        System.out.println("Enter MiddleName: ");
        String MiddleName = scannerString();

        System.out.println("Enter country");
        String country = scannerString();

        System.out.println("Enter SpeciaLization for coach: ");
        String speciallization = scannerString();

        System.out.println("Enter Category for ChessPlayer: ");
        int Category = scannerInteger();

        ChessPlayer chessPlayer1 = new ChessPlayer(coach, SerName, Name, MiddleName, country, Category);

        return chessPlayer1;
    }


    public static void ShowAll_Information(ChessPlayer chessPlayer){
        chessPlayer.ShowInformation();
    }


    public static int scannerInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public static String scannerString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
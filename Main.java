import java.util.Scanner;

public class Main {
    public static GUIFactory factory;

    public static void main(String[] args) throws Exception {
        System.out.print("Which operating systems are you using: MacOs or Windows? ");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        
        if (data.equalsIgnoreCase("MacOs")) {
            factory = new MacFactory();
        } else if (data.equalsIgnoreCase("Windows")) {
            factory = new WinFactory();
        } else {
            input.close();
            throw new Exception("Error! Unknown Dialog.");
        }
        input.close();

        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}

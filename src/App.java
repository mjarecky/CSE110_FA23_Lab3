public class App {
    public static void main(String[] args) throws Exception {
        display("This is my display!");
    }

    public static void display(String message) {

        int length = message.length();

        String boarder = "+";

        for (int i = 0; i < length + 2; i++) {
            boarder += "-";
        }

        boarder += "+";

        System.out.println(boarder);
        System.out.println("| " + message + " |");
        System.out.println(boarder);
    }
}
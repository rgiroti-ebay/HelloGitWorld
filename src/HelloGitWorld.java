import java.io.Console;

/**
 * @author: rgiroti
 * @created: 8/3/11 - 11:26 AM
 */

public class HelloGitWorld {

    public static void main(String[] args) {
        String prompt = "Provide input string to echo?";
        System.out.println(prompt);
        Console console;
        String message = null;
        if ((console = System.console()) != null) {
            message = console.readLine();
        }
        System.out.println("Hello" +
                ((message != null && message.length() > 0) ? message : " Git World"));

    }


}

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class Exercise {
    public static void main(String[] args) {
        Input input = new Input();
        //Tell us if the text entered is a number.
        System.out.println("Enter a number: ");
        System.out.println("StringUtils.isNumeric(input.getString()) = " + StringUtils.isNumeric(input.getString()));

        //Flip the case of a string. For example "Hello World" "hELLO wORlD"
        System.out.println("Enter your name: ");
        System.out.println("Swap case: " + StringUtils.swapCase(input.getString()));

        //Reverse a string.
        System.out.println("Enter your city: ");
        System.out.println(StringUtils.reverse(input.getString()));
    }
}

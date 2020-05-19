import com.google.common.base.Joiner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from a Maven application.");

        Joiner joiner = Joiner.on("; ").skipNulls();
        System.out.println(joiner.join("Harry", null, "Ron", "Hermione"));
    }
}

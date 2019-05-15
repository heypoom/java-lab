import lombok.val;

public class Main {
    public static void main(String[] args) {
        val a = new Mountain("A", "B");

        System.out.println("Mountain " + a.getName().toLowerCase() + "is beautiful!");
    }
}

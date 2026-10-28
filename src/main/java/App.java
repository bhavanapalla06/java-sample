public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Hello from Java and Maven!");
        System.out.println("10 + 20 = " + app.add(10, 20));
    }
}

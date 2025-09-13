package prep.corejava;

public class MySingleton {
    private static MySingleton mySingleton = new MySingleton();

    private MySingleton() {
        System.out.println("Never Called");
    }

    public static MySingleton getInstance() {
        return mySingleton;
    }

    public static void main(String[] args) {
        MySingleton m1 = MySingleton.getInstance();
        MySingleton m2 = MySingleton.getInstance();
        System.out.println(m1 == m2);
    }
}

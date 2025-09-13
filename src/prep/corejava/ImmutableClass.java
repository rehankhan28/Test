package prep.corejava;

public class ImmutableClass {
    public static void main(String[] args) {
        ImmutableClass ic = new ImmutableClass(1, "Rehan");
        System.out.println(ic.getId() + "\t" + ic.getName());
    }

    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

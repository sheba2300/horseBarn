public class Mustang implements Horse{

    private String name;
    private int weight;

    public Mustang(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public String getName()
    {
        return this.name;
    }

}

public class HorseBarn {
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);

        Horse[] horses = new Horse[6];

        horse[1] = horse1;
    }

    public static int getWeight(int weight)
    {
        this.weight = weight;
    }
    public static int getName(String name)
    {
        this.name = name;
    }
    public int findHorseSpace(String name) {
        for (int i = 0; i < this.horses.length; i++) {
            if (this.horses[i]!=null && name.equals(this.horses[i].getName())) {
                return i;
            }
        }
        return -1;
    }
    public void consolidate() {
        for (int i = 0; i < this.horses.length-1; i++) {
            if (this.horses[i] == null) {
                for (int j = i+1; j < this.horses.length; j++) {
                    if (this.horses[j] != null) {
                        this.horses[i] = this.spaces[j];
                        this.horses[j] = null;
                        j = this.horses.length;
                    }
                }
            }
        }
    }
}

public interface Horse
{
    String getName();
    int getWeight();
}


/**
 * concrete class: Healer
 *
 * @Chenhao Cui
 */
public class Healer extends Player {

    /**
     * constructor
     *
     * @param name
     */
    public Healer(String name) {
        this.name = name;
        intellect = 8;
        attack = 2;
        defense = 3;
        weapon = "Staf";
        armor = "Robe";
    }

    @Override
    public String toString() {
        return String.format("Healer: %s\n", name) + super.toString();
    }
}

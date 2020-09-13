/**
 * concrete class: Mage
 *
 * @Chenhao Cui
 */
public class Mage extends Player {

    /**
     * constructor
     *
     * 
     */
    public Mage(String name) {
        this.name = name;
        intellect = 7;
        attack = 3;
        defense = 4;
        weapon = "Staf";
        armor = "Robe";
    }

    @Override
    public String toString() {
        return String.format("Mage: %s\n", name) + super.toString();
    }
}

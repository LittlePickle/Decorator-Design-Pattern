/**
 * concrete class: Warrior
 *
 * @Chenhao Cui
 */
public class Warrior extends Player {

    /**
     * constructor
     *
     * @param name
     */
    public Warrior(String name) {
        this.name = name;
        intellect = 2;
        attack = 8;
        defense = 5;
        weapon = "Sword";
        armor = "Breast Plate";
    }

    @Override
    public String toString() {
        return String.format("Warrior: %s\n", name) + super.toString();
    }
}

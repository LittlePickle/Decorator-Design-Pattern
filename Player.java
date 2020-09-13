
/**
 * abstract base class
 *
 * @Chenhao Cui
 */
public abstract class Player {

    protected String name;
    protected int intellect;
    protected int defense;
    protected int attack;
    protected String weapon;
    protected String armor;

    /**
     * @return the generic part of the toString which is the same for all
     * players
     */
    @Override
    public String toString() {
        return String.format("Carries a %s, and wears a %s", weapon, armor);
    }

    /**
     * @return the players power = attack * 3 + defense + intellect / 2
     */
    public double getPower() {
        double power = attack * 3 + defense + intellect / 2;
        return power;
    }
}

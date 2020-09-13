
/**
 * additional description: "\nUpgraded weapon"</br>
 * additional power: 5
 *
 * @Chenhao Cui
 */
public class WeaponUpgrade extends PlayerDecorator {

    private Player player;

    public WeaponUpgrade(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return player.toString() + "\nnUpgraded weapon";
    }

    public double getPower() {
        return player.getPower() + 5;
    }
}

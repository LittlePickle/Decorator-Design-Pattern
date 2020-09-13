
/**
 * additional description: "\nUpgraded armor" </br>
 * additional power: 3
 *
 * @Chenhao Cui
 */
public class ArmorUpgrade extends PlayerDecorator {

    private Player player;

    public ArmorUpgrade(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return player.toString() + "\nUpgraded armor";
    }

    public double getPower() {
        return player.getPower() + 3;
    }
}

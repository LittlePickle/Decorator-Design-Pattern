
/**
 * additional description: "\nGained a skill"</br>
 * additional power: 2
 *
 * @author
 */
public class Skill extends PlayerDecorator {

    private Player player;

    public Skill(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return player.toString() + "\nGained a skill";
    }

    public double getPower() {
        return player.getPower() + 2;
    }
}

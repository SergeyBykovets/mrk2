public class Mage extends Character{
    public Mage(String name, int x, int y) {
        super(name, 100, 40, x, y);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.attackPower);
    }
}

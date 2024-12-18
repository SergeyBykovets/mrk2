public class Archer extends Character{
    public Archer(String name, int x, int y) {
        super(name, 120, 30, x, y);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.attackPower);
    }
}

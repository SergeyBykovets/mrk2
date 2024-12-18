public class Warrior extends Character {
    public Warrior(String name, int x, int y) {
        super(name, 150, 20, x, y);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.attackPower);
    }
}

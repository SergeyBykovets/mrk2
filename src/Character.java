abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public abstract void attack(Character target);

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

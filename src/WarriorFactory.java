public class WarriorFactory implements Factory {
    @Override
    public Character createCharacter(String name, int x, int y) {
        return new Warrior(name, x, y);
    }
}

public class MageFactory implements Factory {
    @Override
    public Character createCharacter(String name, int x, int y) {
        return new Mage(name, x, y);
    }
}

public class ArcherFactory implements Factory {
    @Override
    public Character createCharacter(String name, int x, int y) {
        return new Archer(name, x, y);
    }
}

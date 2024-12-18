public class Main {
    public static void main(String[] args) {
        Factory warriorFactory = new WarriorFactory();
        Factory mageFactory = new MageFactory();
        Factory archerFactory = new ArcherFactory();

        Arena arena = new Arena();

        PlayerObserver player1 = new PlayerObserver("Гравець 1");
        PlayerObserver player2 = new PlayerObserver("Гравець 2");

        arena.addObserver(player1);
        arena.addObserver(player2);

        Character warrior = warriorFactory.createCharacter("Воїн", 0, 0);
        Character mage = mageFactory.createCharacter("Маг", 1, 1);
        Character archer = archerFactory.createCharacter("Лучник", 2, 2);

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        System.out.println("Воїн атакує лучника!");
        warrior.attack(archer);
        System.out.println("Здоров'я лучника: " + archer.getHealth());
    }
}
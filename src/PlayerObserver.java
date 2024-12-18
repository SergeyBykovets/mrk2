public class PlayerObserver implements ArenaObserver {
    private String playerName;

    public PlayerObserver(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public void onCharacterAdded(Character character) {
        System.out.println(playerName + " отримує сповіщення: " + "На арену додано персонажа " + character.getName());
    }
}

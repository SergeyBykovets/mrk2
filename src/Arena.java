import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Character> characters = new ArrayList<>();
    private List<ArenaObserver> observers = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void addObserver(ArenaObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (ArenaObserver observer : observers) {
            observer.onCharacterAdded(character);
        }
    }
}

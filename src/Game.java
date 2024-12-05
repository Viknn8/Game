import java.util.ArrayList;
import java.util.List;

class Game extends WordChanges { //реализую принцип наследования
    private final List<Character> guessed = new ArrayList<>();
    private final List<Character> incorrect = new ArrayList<>();
    private final Drawing drawing = new Drawing();
    private int attempts = 8;

    public Game(String randomWord) {
        super(randomWord);//Вызываю конструктор суперкласса WordChanges с помощью которого инициализируются поля wordtoguess и curentguess
    }

    public boolean checkLetter(char letter) {
        if (guessed.contains(letter) || incorrect.contains(letter)) {
            System.out.println("Вы уже угадывали эту букву.");
            return false;
        }
        if (getMainWord().contains(String.valueOf(letter))) {
            guessed.add(letter);
            updateCurrentWord(letter);
            return true;
        } else {
            incorrect.add(letter);
            attempts--;
            return false;
        }
    }

    private void updateCurrentWord(char letter) {
        for (int i = 0; i < getMainWord().length(); i++) {
            if (getMainWord().charAt(i) == letter) {
                updateCurrent(i, letter);
            }
        }
    }

    public void start() {
        System.out.println("Слово: " + String.valueOf(getCurrent()));
        System.out.println("Ошибочные буквы: " + incorrect);
        System.out.println("Осталось попыток: " + attempts);
        drawing.human(attempts);
    }

    public boolean isGameOver() {
        return attempts == 0 || String.valueOf(getCurrent()).equals(getMainWord());
    }
}


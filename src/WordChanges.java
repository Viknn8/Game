import java.util.Arrays;

class WordChanges {
    private final String MainWord;
    private final char[] current;

    public WordChanges(String mainword) {
        this.MainWord = mainword;
        this.current = new char[mainword.length()];
        Arrays.fill(this.current, '?');
    }
    public String getMainWord() {//геттер для первого поля
        return MainWord;
    }
    public char[] getCurrent() {//геттер для второго поля
        return current;
    }
    public void updateCurrent(int i, char letter) {//метод заменяющий ? на букву
        current[i] = letter;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        while (play) {
            WordCreation wordcreation = new WordCreation();//объект класса WordCreation
            String randomWord = wordcreation.getRandomWord();//вызов метода класса WordCreation
            Game game = new Game(randomWord);//объект класса Game
            System.out.println("Добро пожаловать в игру Виселица! Тема: Животные. Слова загаданы на русском языке. Вам стоит быть аккуратными, ведь у вас ВСЕГО 7 ПОПЫТОК");
            while (!game.isGameOver()) {
                game.start();
                System.out.print("Введите букву: ");
                char letter = scanner.next().charAt(0);
                if (game.checkLetter(letter)) {
                    System.out.println("Верно!");
                } else {
                    System.out.println("Неверно!");
                }
            }
            if (String.valueOf(game.getCurrent()).equals(game.getMainWord())) {
                System.out.println("Ураааа! Вы угадали слово: " + randomWord);
            } else {
                System.out.println("Вас повесили:)) Приходите еще! Загаданное слово было: " + randomWord);
                System.out.println("""
                            ------
                            |    |
                            |    O
                            |   /|\\
                            |   / \\
                            |
                        ---------
                        """);
            }
            System.out.println("Хотите сыграть снова? (да/нет)");
            scanner.nextLine();
            String answer = scanner.nextLine();
            play = answer.equals("да");
        }
        System.out.println("Спасибо за игру!:)");
    }
}
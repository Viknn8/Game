import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WordCreation {
    private final List<String> words = new ArrayList<>(List.of("тигр", "хомяк", "жираф", "зебра", "заяц","черепаха","обезьяна","волк", "лиса","корова","баран"));
    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(11));//генерируется случайное число от 0 до 6 и возвращается слово из списка под рандомным индексом
    }
}

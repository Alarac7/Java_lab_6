import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TopWords {
    static void main() {
        String filePath = "C:\\Users\\Павел\\Desktop\\вуз\\КТП лабы\\6 лаба\\1_task.txt";
        File file = new File(filePath);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл по пути " + filePath + " не найден!");
            return;
        }

        Map<String, Integer> wordCountMap = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-zа-яё]", "");

            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        scanner.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCountMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Топ-10 самых часто встречающихся слов:");

        int limit = Math.min(10, list.size());

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = list.get(i);

            System.out.println((i + 1) + ". " + entry.getKey() + " — " + entry.getValue() + " раз(а)");
        }
    }
}

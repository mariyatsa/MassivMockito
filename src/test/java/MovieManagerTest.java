import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {
    @Test
    public void addingMovie() {
        MovieManager manager = new MovieManager();
        manager.addendum("Комедия");

        String[] expected = {"Комедия"};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedMovies4() { // добавлено фильмов
        MovieManager manager = new MovieManager();
        manager.addendum("Комедия");
        manager.addendum("Трейлер");
        manager.addendum("Боевик");
        manager.addendum("Фэнтези");

        String[] expected = {"Комедия", "Трейлер", "Боевик", "Фэнтези"};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void showTheSavedOnes() { // показать Сохраненные
        MovieManager manager = new MovieManager();
        manager.addendum("Комедия");
        manager.addendum("Трейлер");
        manager.addendum("Боевик");
        manager.addendum("Фэнтези");
        String[] expected = {"Фэнтези", "Боевик", "Трейлер", "Комедия"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputOfSavedMoviesInReverseOrderLimit2() { // вывод Сохраненных Фильмов В Обратном Порядке Ограничение 2
        MovieManager manager = new MovieManager(2);
        manager.addendum("Комедия");
        manager.addendum("Трейлер");
        manager.addendum("Боевик");
        manager.addendum("Фэнтези");
        String[] expected = {"Фэнтези", "Боевик"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputOfSavedMoviesWithoutLimit() { // вывод сохраненных фильмов без лимита
        MovieManager manager = new MovieManager();
        manager.addendum("Поттер часть 1");
        manager.addendum("Поттер часть 2");
        manager.addendum("Поттер часть 3");
        manager.addendum("Поттер часть 4");
        manager.addendum("Поттер часть 5");
        manager.addendum("Поттер часть 6");

        String[] expected = {"Поттер часть 1", "Поттер часть 2", "Поттер часть 3", "Поттер часть 4", "Поттер часть 5", "Поттер часть 6"};
        String[] actual = manager.findAll();
        Assert.assertArrayEquals(expected, actual);
    }
}
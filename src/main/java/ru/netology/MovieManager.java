package ru.netology;

public class MovieManager {

    private String[] movies = new String[0];  //создаем массив с кол-вом 0
    private int limit;

    public MovieManager() { // приминяем коструктор, который принимает значение 5
        this.limit = 5;
    }

    public MovieManager(int limit) { // этот принимает то количество которое укажем
        this.limit = limit;

    }

    public void addendum(String movie) { // Добавление нового фильма.
        String[] tmp = new String[movies.length + 1];// создаем новый массив из старого который увеличиваем на 1
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i]; // копируем старый массив в новый
        }
        tmp[tmp.length - 1] = movie; // добавляем в последнюю ячейку нового массива фильм
        movies = tmp;
    }

    public String[] findAll() { //Вывод всех фильмов в порядке добавления
        return movies; // показывает информацию которая в массиве мовис
    }
    public String[] findLast() {  //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке
        int arraySize; // Создаем новую переменную, эта переменная будет массивом
        if (movies.length < limit) { // если длинна масива меньше указанного лимита (2), ТО.....
            arraySize = movies.length; // это условие приминяется если мы не указали длину массива (лимит) т е если
            // мы сохранили 10 фильмов все 10 и отобразятся в обратном порядке когда мы попросим показать сохраненые
        } else {
            arraySize = limit; // .....длинна массива равна этому лимиту т е - 2
        }
        String[] tmp = new String[arraySize]; // новый массив равен 2
        for (int i = 0; i < tmp.length; i++){
            tmp[i] = movies[movies.length-1-i]; // записываем сохраненые фильмы в новый массив и
            // показываем фильмы в обратном порядке
        }
        return tmp; // выводим на экран ново-созданный масив из указзаного количества символов в неи т е 2
    }
}

# testTask
Для запуска файлов необходимо:

1.скачать и установить Comunity Edition IDE IntelliJ IDEA от JetBrains https://www.jetbrains.com/ru-ru/idea/download/#section=windows

2.Склонировать данный проект из репозитория

3.Запустить проект в IntelliJ IDEA

4.Перейти в нужный файл task

5.Нажать комбинацию клавиш Ctr+shift+f10 или нажать в меню RUN->Run task

Тестовые сценарии

проверка на null

Пример работы с приложением

входная строка: the quick brown fox jumps over the lazy dog

результат:

task1.kt вывод списка:

the
quick
brown
fox
jumps
over
the
lazy
dog

task2.kt сортировка в алфавитном порядке:

brown
dog
fox
jumps
lazy
over
quick
the
the

task3.kt вывод уникальных значений:

brown
dog
fox
jumps
lazy
over
quick
the

task4.kt кол-во уникальных значений:

brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1
the 2

task5.kt сортировка по кол-ву уникальных значений:

the 2
brown 1
dog 1
fox 1
jumps 1
lazy 1
over 1
quick 1

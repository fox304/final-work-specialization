![](pics/1.png)
# ЗАДАНИЕ
1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).
2. Создать директорию, переместить файл туда.
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
4. Установить и удалить deb-пакет с помощью dpkg.
5. Выложить историю команд в терминале ubuntu
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
7. В подключенном MySQL репозитории создать базу данных “Друзья
   человека”
8. Создать таблицы с иерархией из диаграммы в БД
9. Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
    питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
11. Создать новую таблицу “молодые животные” в которую попадут все
    животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
    до месяца подсчитать возраст животных в новой таблице
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
    прошлую принадлежность к старым таблицам.
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных.
    В программе должен быть реализован следующий функционал:
    * 14.1 Завести новое животное
    * 14.2 определять животное в правильный класс
    * 14.3 увидеть список команд, которое выполняет животное
    * 14.4 обучить животное новым командам
    * 14.5 Реализовать навигацию по меню
15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
    значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
    животное” Сделайте так, чтобы с объектом такого типа можно было работать в
    блоке try-with-resources. Нужно бросить исключение, если работа с объектом
    типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
    считать в ресурсе try, если при заведения животного заполнены все поля.

#  РЕШЕНИЕ
<details>
    <summary>1 и 2</summary>

    cat > pets
    cat > pack-animals
    cat pets pack-animals > animals
    cat animals
    mv animals human\ friends
    mkdir dir-animals
    mv human\ friends dir-animals/
    cat dir-animals/human\ friends

</details>

![](pics/2.png)

--- 

<details>
    <summary>3 и 4</summary>

    sudo apt install mysql-client
    
</details>

![](pics/3.png)

создаем файл __mysql.list__ 

<details>
    <summary></summary>

    cd /etc/apt/sources.list.d/
    sudo touch mysql.list
    sudo nano mysql.list

</details>

![](pics/4.png)

<details>
    <summary>устанавливаем ключ и обновляем</summary>

    sudo apt-key adv __keyserver pgp.mit.edu --recv-keys 3A79BD29
    sudo apt update

</details>

![](pics/5.png)


<details>
    <summary>скачиваем  пакет deb через dpkg</summary>

    wget http://cz.archive.ubuntu.com/ubuntu/pool/main/e/ed/ed_1.18-1_amd64.deb
    

</details>

![](pics/6.png)

<details>
    <summary>устанавливаем пакет,зависимости и удаляем</summary>

    sudo dpkg -i ed_1.18-1_amd64.deb
    sudo apt -f install
    sudo dpkg -r ed_1.18-1_amd64


</details>

![](pics/7.png)

___

<details>
    <summary>5</summary>

    история

</details>

![](pics/8.png)

<details>
    <summary>6</summary>

    диаграмма

</details>


![](pics/9.png)

<details>
    <summary>7 и 8</summary>

    sudo mysql -u root
    mysql> CREATE DATABASE human_friends;


    CREATE TABLE animals (
    id INT PRIMARY KEY AUTO_INCREMENT);


    CREATE TABLE pets (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES animals(id));


    CREATE TABLE pack_animals (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES animals(id));


    CREATE TABLE dogs (
    id INT PRIMARY KEY,
    name VARCHAR(15),
    dog_command VARCHAR(10),
    birthday DATE,
    FOREIGN KEY (id) REFERENCES pets(id));


    CREATE TABLE cats (
    id INT PRIMARY KEY,
    name VARCHAR(15),
    cat_command VARCHAR(10),
    birthday DATE,
    FOREIGN KEY (id) REFERENCES pets(id));


    CREATE TABLE hamsters (
    id INT PRIMARY KEY,
    имя VARCHAR(15),
    hamster_command VARCHAR(10),
    birthday DATE,
    FOREIGN KEY (id) REFERENCES pets(id));


    CREATE TABLE horses (
    id INT PRIMARY KEY,
    name VARCHAR(15),
    horse_command VARCHAR(10),
    birthday DATE,
    FOREIGN KEY (id) REFERENCES pack_animals(id));


    CREATE TABLE camels (
    id INT PRIMARY KEY,
    name VARCHAR(15),
    camel_command VARCHAR(10),
    birthday DATE,
    FOREIGN KEY (id) REFERENCES pack_animals(id));
    
    
    CREATE TABLE donckeys (
    id INT PRIMARY KEY,
    name VARCHAR(15),
    donckey_command VARCHAR(10),
    birthday DATE,
    FOREIGN KEY (id) REFERENCES pack_animals(id));


</details>


![](pics/10.png)


package com.geektech;

public class Main {

    public static void main(String[] args) {

        Shelter romashka = new Shelter("Romashka",
                "Ibraimova 90");

        Dog sharik = new Dog();
        Dog layka = new Dog("Layka ",
                "Чихуахуа", Color.BLACK, romashka);
        Dog barsik = new Dog("Barsik ",
                "Домашняя ", Color.BROWN, romashka,
                new String[]{"Стоять", "Сидеть"});
        System.out.println(barsik.getInfo());
        System.out.println(sharik.getInfo());
        System.out.println(barsik.getInfo());

        barsik.makeVoice("Гав гав", 3);
        sharik.makeVoice("Гов,гов",3);
        barsik.makeVoice("Гев,гев",3);
    }
}

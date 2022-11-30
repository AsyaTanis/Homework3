public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int apple = 1147483555;
        byte banana = 65;
        short grapes = 10778;
        long lemon = 865423465495672346L;
        float mango = 7.89f;
        double kiwi = 4.9999;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        System.out.println("Значение переменной grapes с типом short равно " + grapes);
        System.out.println("Значение переменной lemon с типом long равно " + lemon);
        System.out.println("Значение переменной mango с типом float равно " + mango);
        System.out.println("Значение переменной kiwi с типом double равно " + kiwi);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte banana = 67;
        short grapes = 569;
        short lime = -159;
        short melon = 27897;
        long lemon = 987678965549L;
        float mango = 27.12f;
        double kiwi = 2.786;
        System.out.println("Значение переменной lime с типом short равно " + lime);
        System.out.println("Значение переменной banana с типом byte равно " + banana);
        System.out.println("Значение переменной grapes с типом short равно " + grapes);
        System.out.println("Значение переменной lemon с типом long равно " + lemon);
        System.out.println("Значение переменной mango с типом float равно " + mango);
        System.out.println("Значение переменной kiwi с типом double равно " + kiwi);
        System.out.println("Значение переменной melon с типом short равно " + melon);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int paper = 480;
        int lyudmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        paper = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int bottlesMinute = 16 / 2;
        int twentyMinutes = bottlesMinute * 20;
        int day = bottlesMinute * 60 * 24;
        int threeDays = bottlesMinute * 60 * 24 * 3;
        int mounth = bottlesMinute * 60 * 24 * 30;

        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + mounth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int brown = 4;
        int white = 2;
        int totalColors = 120;
        int colorsClass = brown + white;
        brown = brown * (totalColors / colorsClass);
        white = white * (totalColors / colorsClass);
        System.out.println("В школе, где 120 классов, нужно " + white + " банок белой краски и " + brown + "  банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int bananas = 80;
        int iceCream = 100;
        int milk = 105;
        int eggs = 70;
        int totalGrams = 5 * bananas + 2 * milk + 2 * iceCream + 4 * eggs;
        float totalKg = (float) totalGrams / 1000;
        System.out.println("Общий вес в граммах = " + totalGrams);
        System.out.println("Общий вес в килограммах = " + totalKg);
    }
    
    public static void task7 () {
        System.out.println("Задача 7");
        int weight = 7;
        int theFirst = 250;
        int theSecond = 500;
        float middle = ((float)weight * 1000) / (((float)theFirst + (float)theSecond)/2);
        theFirst = (weight * 1000) / theFirst;
        theSecond = (weight * 1000) / theSecond;
        System.out.println("Дней в 1 способе при 250 гр = " + theFirst);
        System.out.println("Дней во 2 способе при 500 гр = " + theSecond);
        System.out.println("Дней в среднем = " + middle);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        float raising = (float) 0.1;
        float masha = 67760f;
        float denis = 83690f;
        float kristina = 76230f;
        float yearMasha = masha*(1+raising)*12 - masha*12;
        float yearDenis = denis*(1+raising)*12 - denis*12;
        float yearKristina = kristina*(1+raising)*12 - kristina*12;
        masha = masha*(1+raising);
        denis = denis*(1+raising);
        kristina = kristina*(1+raising);

        System.out.println("Маша теперь получает "+ masha +" рублей. Годовой доход вырос на "+yearMasha+" рублей");
        System.out.println("Денис теперь получает "+ denis +" рублей. Годовой доход вырос на "+yearDenis+" рублей");
        System.out.println("Кристина теперь получает "+ kristina +" рублей. Годовой доход вырос на "+yearKristina+" рублей");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        double total = 2_459_000;
        int start = 15_000;
        int month = 1;
        int counter = 0;
        while (total >= counter) {
            System.out.println("Месяц " + month + " , сумма накоплений равна " + counter + " рублей");
            month++;
            counter += start;
        }
        System.out.println("Задача №2");
        counter = 1;
        while (10 >= counter) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("");
        counter = 10;
        for (int i = counter; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Задача №3");
        int populationСountry = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            populationСountry = populationСountry + populationСountry * (fertility - mortality) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + populationСountry);
        }
        System.out.println("Задача №4");
        double percent = 7d / 100;
        int target = 12_000_000;
        total = 15_000;
        month = 1;
        while (total <= target) {
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            total = total * (1 + percent);
            month++;

        }
        System.out.println("Задача №5");
        percent = 7d / 100;
        target = 12_000_000;
        total = 15_000;
        month = 1;
        while (total <= target) {
            total = total * (1 + percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
        System.out.println("Задача №6");
        int yearInProgerss = 9 * 12;
        double percentInProgerss = 7d / 100;
        total = 15_000;
        month = 1;
        while (month <= yearInProgerss) {
            total = total * (1 + percentInProgerss);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
        System.out.println("Задача №7");
        int dayInMounth = 31;
        int friday = 5;
        for (int day = friday; day <= dayInMounth; day++) {
            if (day%7==friday){
                System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("Задача №7");
        int cycle = 79;
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int andYear = currentYear + 100;
        for (int year = 0; year < andYear; year+=cycle) {
            if(year>=startYear){
                System.out.println(year);
            }
        }
    }
}
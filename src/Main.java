public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1" + " dog = " + dog + " cat = " + cat + " paper = " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2 " + " dog + 4 = " + dog + " cat + 4 = " + cat + " paper + 4 = " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3 " + " dog - 3.5 = " + dog + " cat - 1.6 = " + cat + " paper - 7639 = " + paper);
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var resultSumm = boxerWeight1 + boxerWeight2;
        var resultDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Задача 6");
        System.out.println("Масса двух боксеров равна: " + resultSumm + "кг");
        System.out.println("Разница в массе составила: " + resultDifference + "кг");
        var remainder = boxerWeight2 % boxerWeight1;
        System.out.println("Задача 7");
        System.out.println("Разница в массе составила: " + remainder);
        var hoursGeneral = 640;
        var hoursIndividual = 8;
        var worker = hoursGeneral / hoursIndividual;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании - " + worker + " человек.");
        worker = worker + 94;
        var hours = 640 / worker;
        System.out.println("Если в компании работает " + worker + " человека, то всего " + hours + " часа работы может быть поделено между сотрудниками.");
        byte apple = 6;
        short ant = 200;
        int people = 9000000;
        long flower = 1000000000;
        float milk = 80.5F;
        double distance = 800.148D;
        System.out.println("Задание 1");
        System.out.println("Значение переменной яблоки" + " с типом byte равно " + apple + " шт.");
        System.out.println("Значение переменной муравьи" + " с типом short равно " + ant + " шт.");
        System.out.println("Значение переменной люди" + " с типом int равно " + people + " чел.");
        System.out.println("Значение переменной цветы" + " с типом long равно " + flower + " шт.");
        System.out.println("Значение переменной молоко" + " с типом float равно " + milk + " мл.");
        System.out.println("Значение переменной дистанция" + " с типом double равно " + distance + " м.");
        System.out.println("Задание 2");
        float height = 27.12F;
        float memory = 987678965549F;
        float width = 2.786F;
        short weight = 569;
        short degree = -159;
        short time = 27897;
        byte volume = 67;
        System.out.println("Задание 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short list = 480;
        int studentTotal = teacher1 + teacher2 + teacher3;
        int result = list / studentTotal;
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги.");
        System.out.println("Задание 4");
        byte bottle = 16;
        byte timeWork = 2;
        int machine = bottle / timeWork;
        int timeWork20Min = machine * 20;
        int timeWorkDay = (machine * 60) * 24;
        int timeWork3Day = timeWorkDay * 3;
        long timeWorkMonth = timeWorkDay * 30;
        System.out.println("За 20 минут машина произвела " + timeWork20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + timeWorkDay + " штук бутылок.");
        System.out.println("За трое суток машина произвела " + timeWork3Day + " штук бутылок.");
        System.out.println("За месяц машина произвела " + timeWorkMonth + " штук бутылок.");
        System.out.println("Задание 5");
        byte paintTotal = 120;
        byte blancheOneClass = 2;
        byte brownOneClass = 4;
        int classTotal = paintTotal / (blancheOneClass + brownOneClass);
        int blancheTotal = classTotal * blancheOneClass;
        int brownTotal = classTotal * brownOneClass;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + blancheTotal + " банок белой краски и " + brownTotal + " банок коричневой краски.");
        System.out.println("Задание 6");
        byte weightBanana = 80;
        int weightBananas = 5 * weightBanana;
        byte weightMilk100Ml = 105;
        int weightMilk200Ml = 2 * weightMilk100Ml;
        byte weightIceCream = 100;
        int weightIceCreamDouble = weightIceCream * 2;
        byte weightOneEgg = 70;
        int weight4Egg = weightOneEgg * 4;
        int weightBreakfast = weightBananas + weightMilk200Ml + weightIceCreamDouble + weight4Egg;
        float weightKg = weightBreakfast / 1000F;
        System.out.println("Вес завтрака в граммах составит " + weightBreakfast + " грамм, или " + weightKg + " килограмма.");
        System.out.println("Задание 7");
        byte weightTotalKg = 7;
        int weightTotalGr = weightTotalKg * 1000;
        short diet1 = 250;
        short diet2 = 500;
        float diet3 = (diet1 + diet2) / 2F;
        int dayDiet1 = weightTotalGr / diet1;
        int dayDiet2 = weightTotalGr / diet2;
        float dayDiet3 = weightTotalGr / diet3;
        System.out.println("Если спортсмен будет терять по 250гр в день, то достигнет результата за " + dayDiet1 + " дней, если он будет терять по 500гр в день, то достигнет результата за " + dayDiet2 + " дней, а при средней потере веса, результат можно ожидать через " + dayDiet3 + " дня.");
        System.out.println("Задание 8");
        int salaryMary = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        float salaryPromotion = 0.1F;
        float promotionMary = salaryMary * salaryPromotion;
        float salaryPromotionMary = promotionMary + salaryMary;
        float promotionDen = salaryDen * salaryPromotion;
        float salaryPromotionDen = promotionDen + salaryDen;
        float promotionKris = salaryKris * salaryPromotion;
        float salaryPromotionKris = promotionKris + salaryKris;
        float salaryYearMary = salaryMary * 12;
        float salaryYearMaryNew = salaryPromotionMary * 12;
        float differenceMary = salaryYearMaryNew - salaryYearMary;
        float salaryYearDen = salaryDen * 12;
        float salaryYearDenNew = salaryPromotionDen * 12;
        float differenceDen = salaryYearDenNew - salaryYearDen;
        float salaryYearKris = salaryKris * 12;
        float salaryYearKrisNew = salaryPromotionKris * 12;
        float differenceKris = salaryYearKrisNew - salaryYearKris;
        System.out.println("Маша теперь получает " + salaryPromotionMary + " руб., ее годовойдоход вырос на " + differenceMary + " руб.");
        System.out.println("Денис теперь получает " + salaryPromotionDen + " руб., его годовойдоход вырос на " + differenceDen + " руб.");
        System.out.println("Кристина теперь получает " + salaryPromotionKris + " руб., ее годовойдоход вырос на " + differenceKris + " руб.");

    }
}
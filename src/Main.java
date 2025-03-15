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

    }
}
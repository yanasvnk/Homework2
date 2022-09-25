public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        var generalWeight = boxer1 + boxer2;
        System.out.println(generalWeight);
        var weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);

        var weightDifference1 = boxer2 % boxer1;
        System.out.println(weightDifference1);

        var workingHours = 640;
        System.out.println(workingHours);
        var workFor1Employee = 8;
        System.out.println(workFor1Employee);
        var quantityOfEmployees = workingHours / workFor1Employee;
        System.out.println("Всего работников в компании – " + quantityOfEmployees + " человек");

        var quantityOfEmployees1 = quantityOfEmployees + 94;
        System.out.println(quantityOfEmployees1);
        var workFor1Employee1 = workingHours / quantityOfEmployees1;
        System.out.println("Если в компании работает " + quantityOfEmployees1 + " человек, то всего " + workFor1Employee1 + " часов работы может быть поделено между сотрудниками");




    }
}
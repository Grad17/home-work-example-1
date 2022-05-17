public class Main {
    public static void main(String[] args) {
        // Задача 1 //

        var age = 18;
        byte pulse = 0;
        short growth = 181;
        int footSize = 41;
        long numberOfTattoos = 6L;
        float theWeight = 88.6f;
        double temperature = 3.5;
        char mortuaryDepartment = 35;
        boolean life = pulse > 0;

        System.out.println("alive = " + life);
        //System.out.println("mortuaryDepartment = " + mortuaryDepartment + "13");

// Задача 2 //

        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;

        double totalWeightOfBoxer = boxerWeight1 + boxerWeight2;
        double boxerWeightDifference = boxerWeight2 - boxerWeight1;

        System.out.println("Task 2");
        System.out.println("Total weight of boxer = " + totalWeightOfBoxer + " kg");
        System.out.println("Boxer weight difference = " + boxerWeightDifference + " kg");

// Задача 3 //

        System.out.println("Task 3");

        int amountBanana = 5;
        int banana = 80;
        //int amountMilk = 200;
        int milk = 200 / 100;
        int milkWegth = 105;
        int amountIceCreme = 2;
        int iceCreme = 100;
        int amountEgg =4;
        int egg =70;
        int grammInKg = 1000;

        int cocktail = (amountBanana * banana) + (milk * milkWegth) + (amountIceCreme * iceCreme) + (amountEgg * egg);
        double total = cocktail / (grammInKg * 1.0);
        System.out.println("cocktail = " + total +" kg");

// Задача 4 //
        System.out.println("Task 4");

        int theWight = 7;
        int weghtLoss1 = 250;
        int weghtLoss2 = 500;

        int grInKg = 1000;
        int weghtInGr = theWight * grInKg;

        int dayWeghtLoss1 = weghtInGr / weghtLoss1;
        int dayWeghtLoss2 = weghtInGr / weghtLoss2;
        int average = (dayWeghtLoss1 + dayWeghtLoss2) / 2;

        System.out.println("dayWeghtLoss1 = " + dayWeghtLoss1 + " days");
        System.out.println("dayWeghtLoss2 = " + dayWeghtLoss2 + " days");
        System.out.println("average = " + average + " days");

  // Задача 5 //

        System.out.println("Task 5");
        int percent = 10;
        double monthSalaryIncrease = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinSalary = 76_230;

        int year = 12;

        int mashaMonthSalaryIncrease = (int) (mashaSalary * monthSalaryIncrease) + mashaSalary;
        int denisMonthSalaryIncrease = (int) (denisSalary * monthSalaryIncrease) + denisSalary;
        int kristinMonthSalaryIncrease = (int) (kristinSalary * monthSalaryIncrease) + kristinSalary;

        int mashaDifferenceSalary = (mashaMonthSalaryIncrease - mashaSalary) * year;
        int denisDifferenceSalary = (denisMonthSalaryIncrease - denisSalary) * year;
        int kristineDifferenceSalary = (kristinMonthSalaryIncrease - kristinSalary) * year;

        System.out.println("Masha now receives " + mashaMonthSalaryIncrease + " rubles. Annual income increased by " + mashaDifferenceSalary + "rubles.");
        System.out.println("Denis now receives " + denisMonthSalaryIncrease + " rubles. Annual income increased by " + denisDifferenceSalary + "rubles.");
        System.out.println("Kristin now receives " + kristinMonthSalaryIncrease + " rubles. Annual income increased by " + kristineDifferenceSalary + "rubles.");



    }
}
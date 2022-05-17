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

        double amountBanana = 5;
        double banana = 80;
        double amountMilk = 200;
        double milk = 1.05;
        double amountIceCreme = 2;
        double iceCreme = 100;
        double amountEgg =4;
        double egg =70;
        double kilogram = 1000;

        double cocktail = (amountBanana * banana + amountMilk * milk + amountIceCreme * iceCreme + amountEgg * egg) / kilogram;

        System.out.println("cocktail = " + cocktail +" kg");

// Задача 4 //

        double theWight = 7;
        double weghtLoss1 = 250;
        double weghtLoss2 = 500;
        double kilogram1 = 1000;// переменная килограмм инициализированна в задаче выше, но на всякий случай создам еще. //
        double dayWeghtLoss1 = theWight / (weghtLoss1 / kilogram1);
        double dayWeghtLoss2 = theWight / (weghtLoss2 / kilogram1);
        double average = (dayWeghtLoss1 + dayWeghtLoss2) / 2;
        //System.out.println("dayWeghtLoss1 = " + dayWeghtLoss1 + " days");
        //System.out.println("dayWeghtLoss2 = " + dayWeghtLoss2 + " days");
        //System.out.println("average = " + average + " days");

  // Задача 5 //

        System.out.println("Task 5");
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinSalary = 76230;
        double monthSalaryIncrease = 0.1;
        double year = 12;
        double mashaYearlySalary = mashaSalary * year;
        double denisYearlySalary = denisSalary * year;
        double kristinYearlySalary = kristinSalary * year;
        double mashaMonthSalaryIncrease = (mashaSalary * monthSalaryIncrease) + mashaSalary;
        double denisMonthSalaryIncrease = (denisSalary * monthSalaryIncrease) + denisSalary;
        double kristinMonthSalaryIncrease = (kristinSalary * monthSalaryIncrease) + kristinSalary;
        double mashaYearAfterSalaryIncrease = mashaMonthSalaryIncrease * year;
        double denisYearAfterSalaryIncrease = denisMonthSalaryIncrease * year;
        double kristinYearAfterSalaryIncrease = kristinMonthSalaryIncrease * year;
        double mashaDifferenceSalary = mashaYearAfterSalaryIncrease - mashaYearlySalary;
        double denisDifferenceSalary = denisYearAfterSalaryIncrease - denisYearlySalary;
        double kristineDifferenceSalary = kristinYearAfterSalaryIncrease - kristinYearlySalary;

        System.out.println("Masha now receives " + mashaMonthSalaryIncrease + " rubles. Annual income increased by " + mashaDifferenceSalary + "rubles.");
        System.out.println("Denis now receives " + denisMonthSalaryIncrease + " rubles. Annual income increased by " + denisDifferenceSalary + "rubles.");
        System.out.println("Kristin now receives " + kristinMonthSalaryIncrease + " rubles. Annual income increased by " + kristineDifferenceSalary + "rubles.");

        //System.out.println("mashaYearlySalary = " + mashaYearlySalary);
        //System.out.println("denisYearlySalary = " + denisYearlySalary);
        //System.out.println("kristinYearlySalary = " + kristinYearlySalary);
        //System.out.println("mashaMonthSalaryIncrease = " + mashaMonthSalaryIncrease);
        //System.out.println("denisMonthSalaryIncrease = " + denisMonthSalaryIncrease);
        //System.out.println("kristinMonthSalaryIncrease = " + kristinMonthSalaryIncrease);
        //System.out.println("mashaYearAfterSalaryIncrease = " + mashaYearAfterSalaryIncrease);
        //System.out.println("denisYearAfterSalaryIncrease = " + denisYearAfterSalaryIncrease);
        //System.out.println("kristinYearAfterSalaryIncrease = " + kristinYearAfterSalaryIncrease);
        //System.out.println("mashaDifferenceSalary = " + mashaDifferenceSalary);
        //System.out.println("denisDifferenceSalary = " + denisDifferenceSalary);
        //System.out.println("kristineDifferenceSalary = " + kristineDifferenceSalary);


    }
}
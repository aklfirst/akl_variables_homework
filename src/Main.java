public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var akl = 5;
        byte akl1 = 127;
        short akl2 = 32000;
        int akl3 = 2000000;
        long akl4 = 4000000L;
        float akl5 = 1.5f;
        double akl6 = 1.6985632;

        System.out.println("var = "+akl);
        System.out.println("double = "+akl6);

        float boxerOneWeight = 78.2f;
        float boxerTwoWeight = 82.7f;
        float bothBoxersWeight = boxerOneWeight + boxerTwoWeight;
        float differenceBoxersWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println("2 boxers common weight is "+bothBoxersWeight+" kg");
        System.out.println("difference of weight between boxers is "+differenceBoxersWeight+" kg");

        float bananaSingleWeight = 80f;
        float bananasQty = 5f;
        float bananaTotalWeight = (bananaSingleWeight * bananasQty);

        float milkSingleWeight = 105f;
        float milkQty = 2f;
        float milkTotalWeight = (milkSingleWeight * milkQty);

        float icecreamSingleWeight = 100f;
        float icecreamQty = 2f;
        float icecreanTotalWeight = (icecreamSingleWeight * icecreamQty);

        float eggSingleWeight = 70f;
        float eggQty = 4f;
        float eggTotalWeight = (eggSingleWeight * eggQty);

        float sportBreakfastWeightGR = bananaTotalWeight + milkTotalWeight + icecreanTotalWeight + eggTotalWeight;
        float sportBreakfastWeightKG = sportBreakfastWeightGR / 1000;
        System.out.println("Breakfast from Trainer is " + sportBreakfastWeightKG + " kg");

        int weightToLose = 7000;
        int weightPerDayMin = 250;
        int weightPerDayMax = 500;
        int daysToLoseMax = weightToLose / weightPerDayMin;
        int daysToLoseMin = weightToLose / weightPerDayMax;
        double averageDaysToLoseWeight = (daysToLoseMax + daysToLoseMin)/(2*1.0);
        double alternativeAverageDaysToLoseWeight = weightToLose/((weightPerDayMax+weightPerDayMin)/(2*1.0));
        System.out.println("Maximum days to lose weight " + daysToLoseMax);
        System.out.println("Minimum days to lose weight " + daysToLoseMin);
        System.out.println("Average Days to lose weight is " + averageDaysToLoseWeight);
        System.out.println("If average weight loss 375 gr per day, the days to lose weight would be " + alternativeAverageDaysToLoseWeight);

        float mashaSalaryCurrent = 67760;
        float denisSalaryCurrent = 83690f;
        float kristinaSalaryCurrent = 76230f;
        float salaryIncrease = 0.1f;
        float mashaSalaryNew = mashaSalaryCurrent * (1+salaryIncrease);
        float denisSalaryNew = denisSalaryCurrent * (1+salaryIncrease);
        float kristinaSalaryNew = kristinaSalaryCurrent * (1+salaryIncrease);
        float annualMashaSalaryGrowth = mashaSalaryCurrent * salaryIncrease * 12;
        float annualDenisSalaryGrowth = denisSalaryCurrent * salaryIncrease * 12;
        float annualKristinaSalaryGrowth = kristinaSalaryCurrent * salaryIncrease * 12;
        System.out.println("Masha earns now " + mashaSalaryNew + " rub" + " Annual Salary grew by " + annualMashaSalaryGrowth + " rub");
        System.out.println("Denis earns now " + denisSalaryNew + " rub" + " Annual Salary grew by " + annualDenisSalaryGrowth + " rub");
        System.out.println("Kristina earns now " + kristinaSalaryNew + " rub" + " Annual Salary grew by " + annualKristinaSalaryGrowth + " rub");
















    }




}
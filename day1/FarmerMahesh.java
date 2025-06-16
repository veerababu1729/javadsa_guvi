package day1;
public class FarmerMahesh {
    public static void main(String[] args) {
        int totalAcres = 80;
        int segments = 5;
        int acresPerSegment = totalAcres / segments;

        double tomatoYieldPart1 = 0.3 * acresPerSegment * 10;
        double tomatoYieldPart2 = 0.7 * acresPerSegment * 12;
        double tomatoTotalYield = tomatoYieldPart1 + tomatoYieldPart2;
        double tomatoRevenue = tomatoTotalYield * 1000 * 7;

        double potatoYield = acresPerSegment * 10;
        double potatoRevenue = potatoYield * 1000 * 20;

        double cabbageYield = acresPerSegment * 14;
        double cabbageRevenue = cabbageYield * 1000 * 24;

        double sunflowerYield = acresPerSegment * 0.7;
        double sunflowerRevenue = sunflowerYield * 1000 * 200;

        double sugarcaneYield = acresPerSegment * 45;
        double sugarcaneRevenue = sugarcaneYield * 4000;

        double totalRevenue = tomatoRevenue + potatoRevenue + cabbageRevenue + sunflowerRevenue + sugarcaneRevenue;
        System.out.println("a. Total Overall Sales: Rs. " + totalRevenue);

        double chemicalFreeRevenue = tomatoRevenue + potatoRevenue + cabbageRevenue + sunflowerRevenue;
        System.out.println("b. Chemical-Free Farming Sales at 11 months: Rs. " + chemicalFreeRevenue);
    }
}

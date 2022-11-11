public class Task {
    public static void main(String[] args) {
        //Level1:
        long chinasPopulation = 1_411_778_724L;
        int earthsCountries = 197;

        long earthsPopulationIfEveryCountryWasChina = chinasPopulation * earthsCountries;

        System.out.println(earthsPopulationIfEveryCountryWasChina);

        //level2:
        long felixesLifeInSeconds = 3_011_456_567L;
        long felixesLifeInYears = felixesLifeInSeconds / 31_557_600;

        System.out.println(felixesLifeInYears);

    }
}

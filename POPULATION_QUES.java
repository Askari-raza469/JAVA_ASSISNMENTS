 import java.util.Scanner; 
public class POPULATION_QUES {
    public static void main(String[] args) {
    //     int [] population ={45,67,78,89,90};
    //     System.out.println(population.);

        Scanner input = new Scanner(System.in);

        long totalPopulation = 0;
        long population;

        System.out.println("Enter population of countries (enter a negative number to stop):");

        while (true) {
            population = input.nextLong();

            if (population < 0) {
                break; // stop when negative value is entered
            }

            totalPopulation += population;
        }

        System.out.println("Total population of entered countries: " + totalPopulation);

        input.close();
    }
}




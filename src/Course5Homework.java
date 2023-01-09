import java.util.Arrays;
import java.util.Random;

public class Course5Homework {
    /*
    1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor

    2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare

    3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai mari decat numarul primit

    4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.

    5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta se termina, campania se va incheia

    6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua
     */
    public static void main(String[] args) {
        Integer[] givenArray = new Integer[20];
        Random randomGenerator = new Random();

        for (int index = 0; index < givenArray.length; index++) {
            givenArray[index] = randomGenerator.nextInt(10000);
        }

        Integer sum = sumOfArray(givenArray);
        System.out.println(sum);

        Integer counter = countOddNumbers(givenArray);
        System.out.println(counter);

        int target = randomGenerator.nextInt(10000);
        System.out.println(target);
        Integer[] result = getBiggerThanGivenNumber(givenArray, target);
        Arrays.stream(result).forEach(System.out::println);

        //giveDonation(10000);
        giveDonationWithMaxNumberOfDonations(10000, 35);

        printStrings("Ana are mere.Merele sunt bune.Si perele sunt bune");


    }

    private static void printStrings(String givenString) {
        String[] result = givenString.split("\\.");
        for(String phrase: result){
            System.out.println(phrase);
        }
    }

    private static void giveDonationWithMaxNumberOfDonations(int targetDonations, int maxNumberOfDonations) {
        Random random = new Random();
        int donations = 0;
        int counterDonations = 0;
        while (donations < targetDonations && counterDonations <= maxNumberOfDonations) {
            int currentDonation = random.nextInt(500);
            System.out.println(currentDonation);
            donations += currentDonation;
            counterDonations++;
        }
        System.out.printf("Campain over with the following results. Donations sum: %s with numberOfDonations: %s%n", donations, counterDonations);
    }

    private static void giveDonation(int targetDonations) {
        Random random = new Random();
        int donations = 0;
        while (donations < targetDonations) {
            int currentDonation = random.nextInt(500);
            System.out.println(currentDonation);
            donations += currentDonation;
        }
        System.out.println("Success");
    }

    private static Integer[] getBiggerThanGivenNumber(Integer[] givenArray, int target) {
        int resultArrayLength = 0;
        for (int index = 0; index < givenArray.length; index++) {
            if (givenArray[index] > target) {
                resultArrayLength++;
            }
        }
        Integer[] resultArray = new Integer[resultArrayLength];
        int counter = 0;
        for (int index = 0; index < givenArray.length; index++) {
            if (givenArray[index] > target) {
                resultArray[counter] = givenArray[index];
                counter++;
            }
        }
        return resultArray;
    }

    private static Integer countOddNumbers(Integer[] givenArray) {
        int counter = 0;
        for (Integer currentNumber : givenArray) {
            if (currentNumber % 2 != 0) {
                //counter = counter + 1
                counter++;
            }
        }
        return counter;
    }

    // 1 2 3
    // 1-> sum = 1
    // 2-> sum = sum + 2
    // 3-> sum = sum+ 3
    private static Integer sumOfArray(Integer[] givenArray) {
        int sum = 0;
        for (Integer currentNumber : givenArray) {
            //sum = sum + currentNumber
            sum += currentNumber;
        }
        return sum;
    }
}

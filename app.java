public class App {
    public static void main (String[] args){
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        ages[ages.length-1] -= ages[0];
        System.out.println(ages[7]);

        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 83};
        ages2[ages2.length-1] -= ages2[0];
        System.out.println(ages2[8]);

        int sum = 0;
        for (int i = 0; i < ages.length; i++){
            sum += ages[i];
        }
        double average = (double)sum / ages.length;
        System.out.println(average);

        sum = 0;
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        for (String name : names){
            sum += name.length();
        }
        average = (double) sum / names.length;
        System.out.println(average);
        
        String nameString = "";
        for (String name : names){
            nameString = nameString.concat(name);
        }
        System.out.println(nameString);

        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++){
            nameLengths[i] = names[i].length();
        }

        sum = 0;
        for (int length : nameLengths){
            sum += length;
        }
        System.out.println(sum);

        System.out.println(echo("Hello", 3));
    }

    public static String echo(String word, int repeats){
        String message = "";
        for (int i = 0; i < repeats; i++){
            message = message.concat(word);
        }
        return message;
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public static boolean moreThan100(int[] intArray){
        int total = 0;
        for (int number : intArray){
            total += number;
        }
        return total > 100;
    }

    public static double averageDoubleArray(double[] doubleArray){
        double total = 0.0;
        int elements = 0;
        for (double number : doubleArray){
            total += number;
            elements++;
        }
        return total / (double) elements;
    }

    public static boolean compareArrayAverages(double[] firstArray, double[] secondArray){
        double total = 0.0;
        int elements = 0;
        for (double number : firstArray){
            total += number;
            elements++;
        }
        double firstAverage = total / (double) elements;
        total = 0;
        elements = 0;
        for (double number : secondArray){
            total += number;
            elements++;
        }
        double secondAverage = total / (double) elements;
        return firstAverage > secondAverage;
    }

    public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket){
        return isHotOutside && moneyInPocket > 10.5;
    }

    public static boolean isAssignmentDone(boolean isSaturday, String code, boolean forgotToSubmit){
        if (!(code.equals("")) && isSaturday && !forgotToSubmit){
        return true;
        }
        else return false;
    }
}
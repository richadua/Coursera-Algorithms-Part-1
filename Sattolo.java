import java.util.Random;

public class Sattolo{
    public static void main(String[] args) {
        int[] array = new int[6];
        int[] shuffledArray = new int[6];
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        shuffledArray = sottoloShuffle(array);
        System.out.println("Shuffled Array is:");
        for(int j = 0; j < shuffledArray.length; j++) {
            System.out.printf("%d", shuffledArray[j]);
        }
    }
    
    public static int[] sottoloShuffle(int[] array) {
        Random random = new Random();
        for(int i = array.length; i-- >1; ) {
            int j = random.nextInt(i);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
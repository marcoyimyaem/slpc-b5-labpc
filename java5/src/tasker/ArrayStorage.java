package tasker;
import java.io.*;
import java.util.Arrays;

public class ArrayStorage {

    public static void main(String[] args) {
        // Example array
        int[] originalArray = {1, 2, 33, 45, 5};

        // Save the array to a file
        saveArray(originalArray, "config.bankingapp");

        // Retrieve the array from the file
        int[] retrievedArray = loadArray("config.bankingapp");

        // Display the retrieved array
        if (retrievedArray != null) {
            System.out.println("Retrieved Array: " + Arrays.toString(retrievedArray));
        }
    }

    private static void saveArray(int[] array, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Write the array to the file
            oos.writeObject(array);
            System.out.println("Array saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] loadArray(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            // Read the array from the file
            Object obj = ois.readObject();
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}


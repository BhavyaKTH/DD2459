package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generator {
    public static void generateTestCases() throws IOException 
    {
        
        String filepath = new File("test/randomTestData.txt").getAbsolutePath();
        BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));

        generateRandomTestData(20, 100, bw);
        
        bw.close();
    }

    public static void addDataToFile(BufferedWriter bw, int[] array) throws IOException {
    
    	bw.append(Integer.toString(array.length) + " ");
    	for(int i = 0; i < array.length; i++) {
    		bw.append(Integer.toString(array[i]) + " ");
    	}
        bw.append("\r\n");
    }

    public static void generateRandomTestData(int arraySize, int quantity, BufferedWriter bw) throws IOException
    {
        Random random = new Random();
        for (int i = 0; i < quantity; i++)
        {
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++)
            {
                array[j] = random.nextInt(101);
            }
            addDataToFile(bw, array);
        }
    }

    public static void main(String[] args) throws IOException {
        generateTestCases();
    }

}

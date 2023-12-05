package ait.titanicpassenger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TitanicPassengerAppl {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("train.csv"))) {
            String str = br.readLine();
            String[] cells = str.split(",");
            printCells(cells);
            str = br.readLine();
            double fares = 0;
            int count = 0;
            while (str != null) {
                count++;
                cells = str.split(",");
                fares += Double.parseDouble(cells[10]);
                str = br.readLine();
            }
            System.out.println("Total fares: " + fares);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void printCells(String[] cells) {
        for (String string : cells) {
            System.out.print(string + "\t");
        }
        System.out.println();
    }

}

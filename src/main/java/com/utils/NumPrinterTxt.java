package com.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NumPrinterTxt {

    public void printNumList(List<Long> numbers, String archiveName) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archiveName));

            for (Long numero : numbers) {
                writer.write(numero.toString());
                writer.newLine();
            }

            writer.close();
            System.out.println("The list has been successfully printed in " + archiveName);

        } catch (IOException e) {
            System.out.println("Error: The list has not been successfully printed" + archiveName);
        }
    }
}


package exercicios;

import java.io.File;

public class AcessaArquivo {

public static void main(String[] args) {

    File folder = new File("C:\\");

    File[] listOfFiles = folder.listFiles();

    for (int i = 0; i < listOfFiles.length; i++) {
        if (listOfFiles[i].isFile()) {
            System.out.println("Esse � arquivo " + listOfFiles[i].getName());
        } else if (listOfFiles[i].isDirectory()) {
            System.out.println("Esse � o diret�rio " + listOfFiles[i].getName());
            }
        }

    }
}

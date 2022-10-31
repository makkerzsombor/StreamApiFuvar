package hu.petrik;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Fuvar> fuvarok = new ArrayList<>();

    public static void main(String[] args) {
        // Bolvasás
        try {
            beolvas("fuvar.csv");
        } catch (FileNotFoundException e) {
            System.out.println("A fájl nem található");;
        }
        //kiiratas
        for (Fuvar fuvar: fuvarok) {
            System.out.println(fuvar);
        }
        
    }
    private static void beolvas(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        sc.nextLine();
        while (sc.hasNext()){
            String[] sor = sc.nextLine().split(";");
            fuvarok.add(new Fuvar( Integer.parseInt(sor[0]), sor[1], Integer.parseInt(sor[2]),
                    Double.parseDouble(sor[3].replace(",",".")), Double.parseDouble(sor[4].replace(",",".")),
                    Double.parseDouble(sor[5].replace(",",".")), sor[6]));
        }
        sc.close();
    }
}

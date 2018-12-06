ppackage ba.unsa.rpr.tutorijal7;

import ba.unsa.rpr.tutorijal7.Grad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Tutorijal {

    public static void main(String[] args) {
        // write your code here
    }

    public static ArrayList<Grad> ucitajGradove(){
        ArrayList<Grad> g = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        int vel = 0;
        Scanner ulaz;
        try {
            ulaz = new Scanner(new FileReader("mjerenja.txt"));
        } catch(FileNotFoundException e) {
            System.out.println("Datoteka brojevi.txt ne postoji ili se ne može otvoriti.");
            System.out.println("Greška: " + e);
            return null; // kraj programa
        }
        while(ulaz.hasNextLine()){
            temp.add(ulaz.nextLine());
        }
        for(int i = 0 ; i < temp.size(); i ++){
            Grad gr = new Grad();
            String [] t =temp.get(i).split(",");
            double [] d;
            for(int j = 0 ; j<t.length ; j++){
                try {
                    temp.set(j - 1, String.valueOf(Double.valueOf(t[i])));
                } catch (ArrayIndexOutOfBoundsException e){
                    return null;
                }
            }
        }
        return g;
    }
}
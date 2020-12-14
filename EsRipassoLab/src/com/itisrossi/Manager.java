package com.itisrossi;

import java.io.*;
import java.util.ArrayList;

public class Manager {

    private BufferedWriter writer;

    public Manager(String filename){
        try {
            this.writer = new BufferedWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scriviSuFile() {

        Squadra juventus = new Squadra("juventus", "Torino");
        Squadra milan = new Squadra("milan", "Milano");

        ArrayList<Calciatore> arrayList = new ArrayList<>();

        arrayList.add(new Calciatore("Bonucci", juventus));
        arrayList.add(new Calciatore("Chiellini", juventus));
        arrayList.add(new Calciatore("Cristiano Ronaldo", juventus));
        arrayList.add(new Calciatore("Ibraimovic", milan));

        try {

            for(Calciatore calciatore: arrayList) {
                    writer.write(calciatore.getCognome() + ";" + calciatore.getSquadra().getNome() + "\n");
                    //writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

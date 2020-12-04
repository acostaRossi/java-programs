package com.itisrossi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayList_VS_LinkedList {

    public static void main(String[] args) {

        testArrayList();

        testLinkedList();

    }

    public static void testArrayList() {

        System.out.println("*********** ARRAYLIST ***********");

        ArrayList<String> arrayList = new ArrayList<>();

        // inserimento di elementi vari

        arrayList.add("AAA");
        arrayList.add("BBB");
        arrayList.add("CCC");
        arrayList.add("DDD");
        arrayList.add("EEE");
        arrayList.add("FFF");
        arrayList.add("GGG");

        // Inserimento di un nuovo elemento in posizione 2 utilizzando add(value).
        // Viene inserito alla fine della lista.
        // Complessita': O(1).

        arrayList.add("INTRUSO-1");

        // Inserimento di un nuovo elemento in posizione 2 utilizzando add(index, value).
        // Viene inserito tra CCC e DDD.
        // Complessita': O(n) -> comporta lo spostamento di tutti gli elementi successivi.

        arrayList.add(3, "INTRUSO-2");

        // stampa dei dati

        System.out.println(arrayList);

    }

    public static void testLinkedList() {

        System.out.println("\n\n*********** LINKEDLIST ***********");

        // crea linked list vuota

        LinkedList<String> linkedList = new LinkedList<>();

        // inserimento di elementi vari

        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("CCC");
        linkedList.add("DDD");
        linkedList.add("EEE");
        linkedList.add("FFF");
        linkedList.add("GGG");

        // Inserimento di un nuovo elemento in posizione 2 utilizzando add(value).
        // Viene inserito alla fine della lista.
        // Complessita': O(1).

        linkedList.add("INTRUSO-1");

        // Inserimento di un nuovo elemento in posizione 2 utilizzando add(index, value).
        // Viene inserito tra CCC e DDD.
        // Complessita': O(n).

        linkedList.add(3, "INTRUSO-2");

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!! IMPORTANTE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Inserimento di elementi durante l'iterazione.
        // Viene inserito un elemento dopo EEE e dopo FFF
        // Complessita': O(n) per il primo elemento e poi O(n-m) per il secondo

        ListIterator<String> i = linkedList.listIterator();
        while(i.hasNext()) {
            String current = i.next();
            if(current.equals("EEE")) {
                i.add("INTRUSO-3");
            }
            if(current.equals("FFF")) {
                i.add("INTRUSO-4");
            }
        }

        // stampa dei dati

        System.out.println(linkedList);

        // scorrimento della LinkedList al contrario

        System.out.println("\nIterazione e stampa della lista al contrario:");

        while(i.hasPrevious()) {
            System.out.println(i.previous());
        }
    }
}

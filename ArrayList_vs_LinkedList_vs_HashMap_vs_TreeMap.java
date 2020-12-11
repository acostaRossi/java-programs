package com.itisrossi;

import java.util.*;

public class ArrayList_vs_LinkedList_vs_HashMap_vs_TreeMap {

    public static void main(String[] args) {

        testArrayList();

        testLinkedList();

        testHashMap();

        testTreeMap();

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

        // Inserimento di un nuovo elemento utilizzando add(value).
        // Viene inserito alla fine della lista.
        // Complessita': O(1).

        arrayList.add("INTRUSO-1");

        // Inserimento di un nuovo elemento in posizione 3 utilizzando add(index, value).
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

        // Inserimento di un nuovo elemento utilizzando add(value).
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

    public static void testHashMap() {

        /*
         - HashMap contains value based on the key.
         - It may have a single null key and multiple null values.
         - HashMap does not maintain order while iterating.
         - It contains unique elements.
        */

        System.out.println("\n\n*********** HASHMAP ***********");

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("AAA", 1);
        hm.put("BBB", 2);
        hm.put("CCC", 3);
        hm.put("DDD", 4);
        hm.put("EEE", 5);
        hm.put("FFF", 6);
        hm.put("GGG", 7);

        // inserimento di un nuovo elemento
        // complessita' O(1)

        hm.put("HHH", 8);

        for (String key : hm.keySet()) {
            System.out.println(hm.get(key));
        }
    }

    public static void testTreeMap() {

        System.out.println("\n\n*********** TREEMAP ***********");

        /*
         - TreeMap is sorted by keys.
         - It cannot have a null key but have multiple null values.
         - Keys are in ascending order.
         - It stores the object in the tree structure.
        */

        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("AAA", 1);
        tm.put("BBB", 2);
        tm.put("CCC", 3);
        tm.put("DDD", 4);
        tm.put("EEE", 5);
        tm.put("FFF", 6);
        tm.put("GGG", 7);

        // inserimento di un nuovo elemento
        // complessita' O(log n) perche' gli elementi sono ordinati

        tm.put("HHH", 8);

        for (String key : tm.keySet()) {
            System.out.println(tm.get(key));
        }
    }
}

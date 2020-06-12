/*
*   The MAP data structure doesn't allow duplicate values.
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Main{
    public static void main(String[] args) {
        myHashes h = new myHashes();
        h.PrintToHashMap();
        h.PrintToLinkedHashMap();
        h.PrintToTreeMap();
    }
}

class myHashes{

    private HashMap<String, String> dictionary = new HashMap<String, String>(); //a hash map needs a key and value pairs. It DOESNT care about the sorting based on the insertion

    private LinkedHashMap<String, String> linkedHashMapdictionary = new LinkedHashMap<String, String>(); //a linked hash map needs a key and value pairs. It DOES care about the sorting based on the insertion

    private TreeMap<String, String> TreeMapDictionary = new TreeMap<String, String>(); //a TreeMap will sort entries alphabetically

    public void PrintToHashMap(){
        dictionary.put("Tom", "Male");
        dictionary.put("Sam", "Male");
        dictionary.put("Harold", "Male");
        dictionary.put("Janeth", "Female");
        dictionary.put("Paul", "Non-binary");

        for (String word: dictionary.keySet()) { //Notice that this will not be sorted since it's not a linked hash maps
            System.out.println(word); //get the key
            System.out.println(dictionary.get(word)); //get the value/definition
        }
        System.out.println("\n");
    }

    public void PrintToLinkedHashMap(){
        linkedHashMapdictionary.put("Tom", "Male");
        linkedHashMapdictionary.put("Sam", "Male");
        linkedHashMapdictionary.put("Harold", "Male");
        linkedHashMapdictionary.put("Janeth", "Female");
        linkedHashMapdictionary.put("Paul", "Non-binary");

        for (String word: linkedHashMapdictionary.keySet()) { //This time the hashmap is sorted since it's using the linked data structure
            System.out.println(word); //get the key
            System.out.println(linkedHashMapdictionary.get(word)); //get the value/definition
        }
        System.out.println("\n");
    }

    public void PrintToTreeMap(){
        TreeMapDictionary.put("Tom", "Male");
        TreeMapDictionary.put("Sam", "Male");
        TreeMapDictionary.put("Harold", "Male");
        TreeMapDictionary.put("Janeth", "Female");
        TreeMapDictionary.put("Paul", "Non-binary");

        for (String word: TreeMapDictionary.keySet()) { //This time the hashmap is sorted since it's using the linked data structure
            System.out.println(word); //get the key
            System.out.println(TreeMapDictionary.get(word)); //get the value/definition
        }
        System.out.println("\n");
    }
}

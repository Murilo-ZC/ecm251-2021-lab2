package br.maua.sets;

import br.maua.models.Item;
import br.maua.models.ItemComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestDrive {
    public static void main(String[] args) {
        Set<Item> itemSet = new TreeSet<>(new ItemComparator());
        //Adiciona itens no HashSet
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Pera", 2));
        itemSet.add(new Item("Maca", 1));
        itemSet.add(new Item("Banana", 3));

        //Passa por todos os seus elementos
        itemSet.forEach( item -> System.out.println(item));
    }
}

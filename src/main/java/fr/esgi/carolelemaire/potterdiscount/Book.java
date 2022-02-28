package fr.esgi.carolelemaire.potterdiscount;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

    private final int BOOK_PRICE = 8;
    private List<Integer> books;
    private double[] discount = {0, 0, 0.05, 0.1, 0.2, 0.25};

    public Book(List<Integer> books){
        this.books = books;
    }

    public double price(){
        double price = 0;

        while (this.books.size() > 0){
            final Set<Integer> uniqueBooks = new HashSet();
            for (Integer book : this.books)
                uniqueBooks.add(book);

            price += this.BOOK_PRICE * uniqueBooks.size() * (1 - this.discount[uniqueBooks.size()]);
            books = removeItemsFrom(books, uniqueBooks);
        }

        return price;
    }

    private List<Integer> removeItemsFrom(List<Integer> array, Set<Integer> removable) {
        for (Integer x: removable){
            array.remove(x);
        }

        return array;
    }


}

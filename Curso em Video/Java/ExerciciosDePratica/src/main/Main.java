package main;

import classe.Book;
import classe.Person;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        Book[] book = new Book[3];
        people[0] = new Person("José", 29, "Male");
        people[1] = new Person("Maria", 31, "Female");

        book[0] = new Book("O Conde de Monte Cristo", "Pitombas", 303, people[0]);
        book[1] = new Book("50 tons de Rosa-Choque", "Ondina", 258, people[1]);
        book[2] = new Book("Java para Idiotas", "The Books is on the table", 159, people[0]);

        book[0].leafTroughBook(200);
        book[0].nextPage();
        System.out.println(book[0].detalhes());
    }
}

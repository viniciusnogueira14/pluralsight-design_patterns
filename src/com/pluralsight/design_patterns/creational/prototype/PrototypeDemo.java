package com.pluralsight.design_patterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie firstMovie = (Movie) registry.createItem("Movie");
        firstMovie.setTitle("Creational DesignPatterns in Java");

        System.out.println(firstMovie);
        System.out.println(firstMovie.getTitle());
        System.out.println(firstMovie.getPrice());
        System.out.println(firstMovie.getUrl());
        System.out.println(firstMovie.getRuntime());

        Movie secondMovie = (Movie) registry.createItem("Movie");
        secondMovie.setTitle("Pluralsight DesignPatterns Course");
        secondMovie.setPrice(9.99);

        System.out.println(secondMovie);
        System.out.println(secondMovie.getTitle());
        System.out.println(secondMovie.getPrice());
        System.out.println(secondMovie.getUrl());
        System.out.println(secondMovie.getRuntime());

        Book firstBook = (Book) registry.createItem("Book");
        firstBook.setUrl("http://www.google.com");
        firstBook.setNumberOfPages(10);

        System.out.println(firstBook);
        System.out.println(firstBook.getTitle());
        System.out.println(firstBook.getPrice());
        System.out.println(firstBook.getUrl());
        System.out.println(firstBook.getNumberOfPages());

    }
}

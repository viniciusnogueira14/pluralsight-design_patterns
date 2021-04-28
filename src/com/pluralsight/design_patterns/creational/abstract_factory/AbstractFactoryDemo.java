package com.pluralsight.design_patterns.creational.abstract_factory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(770);
        CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(creditCard.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        creditCard = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard.getClass());
    }
}

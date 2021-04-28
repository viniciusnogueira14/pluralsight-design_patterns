package com.pluralsight.design_patterns.creational.abstract_factory;

/** Abstract Factory **/
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int score) {
        if (score > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType type);

    public abstract Validator getValidator(CardType type);
}

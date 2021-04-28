package com.pluralsight.design_patterns.creational.abstract_factory;

/** Concrete Factory **/
public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType type) {
        return new AmexValidator();
    }
}

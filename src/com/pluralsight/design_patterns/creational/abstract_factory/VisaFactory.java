package com.pluralsight.design_patterns.creational.abstract_factory;

/** Concrete Factory **/
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType type) {
        switch (type) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            default:
                return null;
        }
    }

    @Override
    public Validator getValidator(CardType type) {
        return new VisaValidator();
    }
}

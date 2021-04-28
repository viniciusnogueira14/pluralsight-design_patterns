package com.pluralsight.design_patterns.creational.abstract_factory;

public class VisaValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

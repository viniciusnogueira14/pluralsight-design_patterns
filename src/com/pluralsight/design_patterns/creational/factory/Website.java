package com.pluralsight.design_patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    protected Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();
}

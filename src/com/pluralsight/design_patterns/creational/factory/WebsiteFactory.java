package com.pluralsight.design_patterns.creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType type) {
        switch (type) {
            case BLOG : return new Blog();
            case SHOP : return new Shop();
            default : return null;
        }
    }
}

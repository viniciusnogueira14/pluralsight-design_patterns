package com.pluralsight.design_patterns.creational.singleton;

import java.util.Objects;

public class DbSingleton {

    /**
     * This property will be only instance of the object.
     * Returned every time the class is called.
     */
    private static volatile DbSingleton instance = null;

    /**
     * Private Constructor is necessary in Singleton.
     * It avoids user to call the constructor directly.
    **/
    private DbSingleton() {
        if (Objects.nonNull(instance)) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        // This null validation is to make the instance LazyLoaded.
        if (Objects.isNull(instance)) {
            synchronized (DbSingleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}

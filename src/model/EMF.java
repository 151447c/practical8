package model;

/**
 * Created by 151447c on 12/8/2016.
 */

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EMF {
    private static final EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("bookstore");
    private EMF() {}
    public static EntityManagerFactory get() {
        return emfInstance;
    }
}
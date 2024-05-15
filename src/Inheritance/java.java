package Inheritance;

public class java extends Programming {
    String feature;

    java() {
        System.out.println("java DC");

    }

    java(String ref_feature) {
        this.feature = ref_feature;

    }

    void printInfo() {
       System.out.println("Feature -> " + this.feature);
    }
    }




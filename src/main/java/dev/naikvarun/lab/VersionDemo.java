package dev.naikvarun.lab;

public class VersionDemo {
    public static void main(String[] args) {
        System.out.println("Version Demo");
        System.out.println("Version: " + VersionDemo.class.getPackage().getImplementationVersion());
    }
}

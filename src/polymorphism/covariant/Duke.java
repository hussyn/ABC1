//package com.javaworld.javachallengers.polymorphism.covariant;
package polymorphism.covariant;
public class Duke extends JavaMascot {

    @Override
    Duke getMascot() {
        return new Duke();
    }

}

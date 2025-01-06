// Package: mypackage2
package mypackage2;

import mypackage1.MainClass;

public class SubClass extends MainClass {
    public void testAccess() {
        System.out.println("\nAccessing from SubClass (Different Package):");

        System.out.println(publicField);     // Accessible
        System.out.println(protectedField); // Accessible (because of inheritance)
        // System.out.println(defaultField); // Not accessible (uncommenting will cause an error)
        // System.out.println(privateField); // Not accessible (uncommenting will cause an error)

        showPublic();     // Accessible
        showProtected();  // Accessible (because of inheritance)
        // showDefault(); // Not accessible (uncommenting will cause an error)
        // showPrivate(); // Not accessible (uncommenting will cause an error)
    }
}

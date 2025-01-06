// Package: mypackage2
package mypackage2;

import mypackage1.MainClass;

public class DifferentPackageClass {
    public void testAccess() {
        MainClass main = new MainClass();

        System.out.println("\nAccessing from DifferentPackageClass (Different Package):");
        System.out.println(main.publicField); // Accessible
        // System.out.println(main.protectedField); // Not accessible (uncommenting will cause an error)
        // System.out.println(main.defaultField); // Not accessible (uncommenting will cause an error)
        // System.out.println(main.privateField); // Not accessible (uncommenting will cause an error)

        main.showPublic();     // Accessible
        // main.showProtected(); // Not accessible (uncommenting will cause an error)
        // main.showDefault();   // Not accessible (uncommenting will cause an error)
        // main.showPrivate();   // Not accessible (uncommenting will cause an error)
    }
}

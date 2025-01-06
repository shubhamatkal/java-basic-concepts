// Package: mypackage1
package mypackage1;

public class SamePackageClass {
    public void testAccess() {
        MainClass main = new MainClass();

        System.out.println("\nAccessing from SamePackageClass (Same Package):");
        System.out.println(main.publicField);     // Accessible
        System.out.println(main.protectedField); // Accessible
        System.out.println(main.defaultField);   // Accessible
        // System.out.println(main.privateField); // Not accessible (uncommenting will cause an error)

        main.showPublic();     // Accessible
        main.showProtected();  // Accessible
        main.showDefault();    // Accessible
        // main.showPrivate(); // Not accessible (uncommenting will cause an error)
    }
}

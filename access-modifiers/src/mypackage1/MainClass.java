// Package: mypackage1
package mypackage1;

public class MainClass {
    public String publicField = "Public Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field"; // No modifier
    private String privateField = "Private Field";

    // Public method
    public void showPublic() {
        System.out.println("Public Method");
    }

    // Protected method
    protected void showProtected() {
        System.out.println("Protected Method");
    }

    // Default method
    void showDefault() {
        System.out.println("Default Method");
    }

    // Private method
    private void showPrivate() {
        System.out.println("Private Method");
    }

    // Method to demonstrate private access within the same class
    public void showAllFields() {
        System.out.println("Inside MainClass:");
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
        System.out.println(privateField); // Accessible within the same class
    }
}


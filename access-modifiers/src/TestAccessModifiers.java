import mypackage1.*;
import mypackage2.*;

public class TestAccessModifiers {
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.showAllFields();

        SamePackageClass samePackage = new SamePackageClass();
        samePackage.testAccess();

        SubClass1 subClass1 = new SubClass1();
        subClass1.testAccess();

        SubClass subClass = new SubClass();
        subClass.testAccess();

        DifferentPackageClass differentPackage = new DifferentPackageClass();
        differentPackage.testAccess();
    }
}

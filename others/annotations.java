class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    void display() { // Correctly overriding the method
        System.out.println("Child display");
    }
}



public class annotations {
    public static void main(String[] args){
        Child Child_ = new Child();
        Child_.display();

    }
	
}
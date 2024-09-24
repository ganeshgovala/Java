import java.util.*;

interface area {
    void display();
}

class Main implements area  {
    public void display() {
        System.out.println("This is an example of interface");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}

output : 
This is an example of interface

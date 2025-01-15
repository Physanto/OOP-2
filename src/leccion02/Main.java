package leccion02;


abstract class Figura {

    public abstract boolean area();
    public abstract void dibujar();
}

class Triangulo extends Figura {

    public boolean area(){
        System.out.println("calculando area");
        return true;
    }

    public void dibujar(){
        System.out.println("Dibujando por pantalla");
    }
}

public class Main {

    public static void main(String[] ar){      
        System.out.println("hello");
    }
}

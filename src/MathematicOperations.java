public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.E);

        // Devuelve un enero hacia arriba
        System.out.println(Math.ceil(x));

        // Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el número mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        //Área de un circulo
        //pi *2
        System.out.println(Math.PI*Math.pow(y,2));

        //Área de una esfera
        //4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));

        //Volumen de u na esfuera
        //(4/3)*pi*r3
        System.out.println(4/3*Math.PI*Math.pow(y,3));
    }
}

public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        double area = circleArea(y);
        System.out.println(area);
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }

    public static double convertToDollar(double quantity, String currency) {
        //MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
            default:
                System.out.println("No se reconoce " + currency);
                quantity = quantity * -1;
        }
        return quantity;
    }
}

package module.one;

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double x2 = Double.parseDouble(args[2]);
        double y1 = Double.parseDouble(args[1]);
        double y2 = Double.parseDouble(args[3]);
        double x1Rad = Math.toRadians(x1);
        double y1Rad = Math.toRadians(y1);
        double x2Rad = Math.toRadians(x2);
        double y2Rad = Math.toRadians(y2);
        double r = 6371.0;
        double a = Math.pow(Math.sin((x2Rad - x1Rad) / 2), 2)
                + Math.cos(x1Rad) * Math.cos(x2Rad)
                * Math.pow(Math.sin((y2Rad - y1Rad) / 2), 2);
        double distance = 2 * r * Math.asin(Math.sqrt(a));

        System.out.println(distance + " kilometers");
    }
}


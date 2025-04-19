package module.two;

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double harmonicSum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / Math.pow(i, r);
        }
        System.out.println(harmonicSum);
    }
}

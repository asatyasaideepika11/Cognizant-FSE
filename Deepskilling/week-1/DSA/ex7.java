public class ex7 {

    static double predict(double currentValue, double growthRate, int years) {

        if (years == 0)
            return currentValue;

        return predict(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double result = predict(10000, 0.10, 5);

        System.out.println(result);
    }
}
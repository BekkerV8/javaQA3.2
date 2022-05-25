public class BmiService {
    public int calculate(int h, int m) {
        int result = ((m * 10_000) / (h * h));

        return result;
    }
}

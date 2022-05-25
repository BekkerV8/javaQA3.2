public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int h = 168; //рост в см
        int m = 65; //масса тела в киллограммах
        int bmi = service.calculate(h, m);
        System.out.println("Body Mass Index: " + bmi);
    }
}

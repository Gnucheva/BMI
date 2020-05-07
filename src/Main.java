public class Main {
public static void main(String [] args) {
    BmiService service = new BmiService();
    double weight = 63;
    double height = 1.73;
    double bmi=service.calculate(weight,height);
    System.out.println(bmi);
}
}

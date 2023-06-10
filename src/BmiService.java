public class BmiService {
    public int calculate(int weight, double heightMeters) {
        int bmi =  (int)(weight / (heightMeters * heightMeters));
        return bmi;
    }
}

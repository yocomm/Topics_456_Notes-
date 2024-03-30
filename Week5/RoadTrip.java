package Week5;



import java.util.HashMap;
import java.util.Map;
public class RoadTrip {
    public static void main(String[] args) {
        Map<String, Integer> distances = new HashMap<>();
        distances.put("Duluth", 154);
        distances.put("Stillwater", 26);
        distances.put("Brainerd", 127);
        distances.put("Ely", 245);
        distances.put("Red Wing", 54);
        System.out.printin(distances);
    }
}
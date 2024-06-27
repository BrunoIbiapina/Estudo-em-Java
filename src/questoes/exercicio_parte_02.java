package questoes;
import java.util.ArrayList;
import java.util.Locale;

public class exercicio_parte_02 {
public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Double PI = 3.141519;
    Double totalarea;
    ArrayList<Double> radiusList = new ArrayList<Double>();
    radiusList.add(2.0); // index 0
    radiusList.add(100.64); // index 1
    radiusList.add(150.0); // index 2
    for(int i = 0; i < radiusList.size(); i++) {

        totalarea = PI * Math.pow(radiusList.get(i), 2);
        System.out.printf("%.2f%n", totalarea);
    }

}
    
}

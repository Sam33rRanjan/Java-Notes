import java.util.*;

public class L24_Localization_and_Internationalization {
    public static void main(String[] args) {
        // Localization: The process of adapting software to a specific region or language L10N
        // Internationalization: The process of designing software so that it can be adapted to various languages and regions without engineering changes I18N
        
        Locale l1 = Locale.of("hi", "IN");
        System.out.println(l1.getCountry());

        ResourceBundle rb = ResourceBundle.getBundle("L24_Bundle", l1);

        String str = rb.getString("wish");
        System.out.println(str);
    }
}

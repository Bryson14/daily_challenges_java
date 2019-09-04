import java.util.ArrayList;

public class dcp11_autocomplete {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("Deep");
        items.add("Dog");
        items.add("Deer");
        String s = "De";

        ArrayList<String> results = new ArrayList<>();
        for (String item : items) {
            if (item.startsWith(s)) {
                results.add(item);
            }
        }
        System.out.println(results.toString());
    }


}

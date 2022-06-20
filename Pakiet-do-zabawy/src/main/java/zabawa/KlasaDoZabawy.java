package zabawa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KlasaDoZabawy {

    public static void main(String[] args) {
       Map<Integer, List<String>> mapa = new HashMap<>();
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        List<String> lista4 = new ArrayList<>();
        lista1.add("ford");
        lista1.add("focus");
        lista1.add("1,4");
        lista2.add("fiat");
        lista2.add("ducato");
        lista3.add("bmw");
        lista3.add("x1");
        lista3.add("3.5");
        lista4.add("ford");
        lista4.add("Mondeo");
        mapa.put(1, lista1);
        mapa.put(2, lista2);
        mapa.put(3, lista3);
        mapa.put(4, lista4);
        String marka = mapa.get(1).get(0);
        Map<String, Map<Integer, List<String>>> mapaFull = new HashMap<>();
        Map<Integer, List<String>> output = mapa.entrySet().stream()
                        .filter(entry -> entry.getValue().get(0).matches("ford"))
                                .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry ::getValue));
        mapaFull.put(mapa.get(1).get(0), new HashMap<>());
        mapaFull.get(mapa.get(1).get(0)).put(1, mapa.get(1));
     System.out.println(mapa);
        System.out.println(mapaFull);
     System.out.println(marka);
     System.out.println(output);

     Map<String, Map<Integer, List<String>>> output2 = mapaFull.entrySet().stream()
             .filter(entry -> entry.getKey().matches("ford"))
             .collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry ::getValue));
     System.out.println(output2);
    }



}

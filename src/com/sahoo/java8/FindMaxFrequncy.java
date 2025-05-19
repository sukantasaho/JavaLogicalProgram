public class MaxFrequency {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
            "sukanta", 12,
            "manoj", 20,
            "mukti", 50,
            "gaurav", 100
        );

        map.entrySet()
           .stream()
           .max(Map.Entry.comparingByValue())
           .ifPresent(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
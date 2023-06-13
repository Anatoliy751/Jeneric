public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<String>(4);

        stringMagicBox.add("10220");
        stringMagicBox.add("elesee");
        stringMagicBox.add("films");
        stringMagicBox.add("jeneric");

        String pick =stringMagicBox.pick();
        System.out.println(pick);
    }
}
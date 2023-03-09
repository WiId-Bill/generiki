import my.accounts.MagicBox;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(3);
        stringMagicBox.add("111");
        stringMagicBox.add("222");
        stringMagicBox.add("333");

        String pick = stringMagicBox.pick();
        System.out.println(pick);
    }
}
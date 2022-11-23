import java.util.Objects;

public class Tresor<T> {


    private int _pin;
    private T _inhalt;

    public Tresor(int i, T objkte) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tresor<?> tresor1)) return false;
        return _pin == tresor1._pin && _inhalt.equals(tresor1._inhalt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_pin, _inhalt);
    }

    public T getInhalt(String str) {
        if (Objects.equals(str, String.valueOf(_pin))) {
            return _inhalt;

        }else {
        throw new RuntimeException("Falscher Code");
        }
    }



    public static void main(String[] args) {
        Tresor<String> meinTresor = new Tresor<>(13, "Zahnbürste");

        String str = System.console().readLine(
                "Enter password : ");
        System.out.println(meinTresor.getInhalt(str));


    }


}

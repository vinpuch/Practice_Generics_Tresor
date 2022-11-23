import java.util.Objects;
import java.util.Scanner;

public class Tresor<T> {


    private int _pin;
    private T _inhalt;

    public Tresor(int _pin, T _inhalt) {
        this._pin = _pin;
        this._inhalt = _inhalt;
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

    public T getInhalt(int str) {
        if (str ==_pin) {
            return _inhalt;
        }else {
        throw new RuntimeException("Falscher Code");
        }
    }



    public static void main(String[] args) {
        Tresor<String> meinTresor = new Tresor<>(13, "Zahnbürste");
        System.out.println("Eingabe");
        Scanner s = new Scanner(System.in);
        int str = s.nextInt();
        System.out.println(str);
        System.out.println(meinTresor.getInhalt(13));


    }


}

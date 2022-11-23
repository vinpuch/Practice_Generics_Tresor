import java.util.Objects;

public class Tresor<T> {


    private int _pin;
    private T _inhalt;

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

    public int get_pin() {
        return _pin;
    }

    public void set_pin(int _pin) {
        this._pin = _pin;
    }

    public T getInhalt() {
        return _inhalt;
    }

    public void setInhalt(T inhalt) {
        _inhalt = inhalt;
    }


    public Tresor(int _pin, T inhalt) {
        this._pin = _pin;
        _inhalt = inhalt;
    }

    @Override
    public String toString() {
        return "Tresor{" +
                "_pin=" + _pin +
                ", _inhalt=" + _inhalt +
                '}';
    }

    public static void main(String[] args) {
        Tresor<String> meinTresor = new Tresor<>(13, "Zahnbürste");

        System.out.println(meinTresor);

    }

}

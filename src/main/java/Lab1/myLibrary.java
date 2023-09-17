package Lab1;

public class myLibrary {
    public static int Power(int Base, int Exp) {
        if (Exp == 1)
            return Base * Exp;
        else
            return Base * Power(Base, Exp - 1);
    }
}

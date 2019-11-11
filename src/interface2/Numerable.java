package interface2;

public interface Numerable extends Plus, Minus, Multiply, Devide {

    @Override
    void plus();

    @Override
    void minus();

    @Override
    void multiply();

    @Override
    void devide();
}

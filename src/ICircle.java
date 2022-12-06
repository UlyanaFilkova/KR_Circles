public interface ICircle<T>{
    // T - числовой тип, IC - тип-наследник ICircle
    T getX();
    T getY();
    T getR();

    void setX(T x);

    void setY(T y);

    void setR(T r);

    ICircle<T> clone();

    int compareTo(ICircle<?> o);

    <T extends ICircle<?>> T plus (T o);
    //<T extends ICircle<?>> int compareTo(T o) throws NullPointerException;
    /*ICircle avgCircle();
    ICircle maxCircle();
    int compareMaxCircle(ICircle other);
    //void set_AvgCircleFirst(ICircle other, Pair pair);
    ICircle at(int i);*/
}

import java.util.Arrays;
import java.util.Iterator;
@SuppressWarnings("unchecked")

public class Cjv <T extends ICircle> implements Cloneable, Iterable<T> {
    T[] array;
    Cjv(T[] arr){
        array = arr;
    }

    T avgCircle(){
        if(array.length == 0) throw new ArrayIndexOutOfBoundsException("Array is empty");
        T average = (T)array[0].clone();
        //T average = new CircleInt(array[0].getX(), array[0].getY(), array[0].getR());

        for(int i = 1; i < array.length; i++){
            average.plus(array[i]);
        }
        average.setX((Integer)average.getX() / array.length);
        average.setY((Integer)average.getY() / array.length);
        average.setR((Integer)average.getR() / array.length);
        return average;
    }
    T maxCircle(){
        if(array.length == 0) throw new ArrayIndexOutOfBoundsException("Array is empty");
        T maxCir = (T)array[0].clone();
        for(int i = 1; i < array.length; i++){
            if (Integer.compare((Integer)maxCir.getR(), (Integer)array[i].getR()) < 0){
                maxCir = (T)array[i].clone();
            }
        }
        return maxCir;
    }

    int compareMaxCircle(Cjv<?> other){
        return this.maxCircle().compareTo(other.maxCircle());
    }

    void set_AverageCircleFirst(Cjv<?> other, Pair<ICircle<?>> pair){
        if(this.avgCircle().compareTo(other.at(0)) < 0){
            pair.setFirst(this.avgCircle());
            pair.setSecond(this.at(0));
        }
        else{
            pair.setFirst(other.avgCircle());
            pair.setSecond(other.at(0));
        }
    }

    void setAt (T el, int n){
        array[n] = el;
    }

    T at(int n){
        if (n >= 0 && n < array.length) {
            return array[n];
        } else {
            throw new ArrayIndexOutOfBoundsException("Wrong index!");
        }
    }

    @Override
    public String toString ()
    {
        return Arrays.toString(array);
    }

    public Cjv<T> clone () throws CloneNotSupportedException
    {
        Cjv<T> clone = (Cjv<T>) super.clone();
        for (T i : clone.array) {
            i = (T) i.clone();
        }
        return clone;
    }
    public Iterator<T> iterator()
    {
        return new jvIterator();
    }

    private class jvIterator implements Iterator<T>
    {
        int i = 0;

        @Override
        public boolean hasNext ()
        {
            return i < array.length;
        }

        @Override
        public T next ()
        {
            return array[i++];
        }
    }
}

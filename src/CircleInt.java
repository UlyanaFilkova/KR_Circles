//public class CircleInt implements ICircle, Comparable<CircleInt>
public class CircleInt implements ICircle<Integer>, Cloneable, Comparable<ICircle>
{
    private Integer x;
    private Integer y;
    private Integer r;

    public CircleInt(Integer x, Integer y, Integer r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ICircle<?>> T plus (T o)
    {
        return (T) new CircleInt(x + (Integer) o.getX()
                , y + (Integer) o.getY()
                , r + (Integer) o.getR());
    }

    @Override
    public Integer getX() {
        return x;
    }
    @Override
    public Integer getY() {
        return y;
    }
    @Override
    public Integer getR() {
        return r;
    }
    @Override
    public void setX(Integer x) {
        this.x = x;
    }
    @Override
    public void setY(Integer y) {
        this.y = y;
    }
    @Override
    public void setR(Integer r) {
        this.r = r;
    }

    public String toString(){
        return "[(" + x + "," + y + "), " + r + "]";
    }
    @Override
    public CircleInt clone(){
        return new CircleInt(x, y, r);
        //return (CircleInt) super.clone();
    }

   /* @Override
    public <T extends ICircle<?>> int compareTo(T o) throws NullPointerException
    {
        if (this == o) return 0;

        if (o == null) throw new NullPointerException("NULL!");

        if (getClass() != o.getClass()) return Integer.compare(this.hashCode(), o.hashCode());

        return this.compareTo((CircleInt) o);
    }
   @Override
   public <T extends ICircle<?>> int compareTo (T o) throws NullPointerException
   {
       if (this == o) return 0;

       if (o == null) throw new NullPointerException("NULL!");

       if (getClass() != o.getClass()) return Integer.compare(this.hashCode(), o.hashCode());

       return this.compareTo((CircleInt) o);
   }

    public int compareTo (CircleInt o){
        return this.r*this.r - o.getR()*o.getR();
    }


    @Override
    public int compareTo(ICircle<?> o) {
        return 0;
    }*/


    @Override
    public int compareTo(ICircle o) {
        if (this == o) return 0;

        if (o == null) throw new NullPointerException("NULL!");
        return this.r*this.r - (Integer) o.getR()*(Integer) o.getR();//((CircleInt)o).getR()*((CircleInt)o).getR();
    }
}

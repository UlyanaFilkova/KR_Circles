//public class CircleInt implements ICircle, Comparable<CircleInt>
public class CircleDouble implements ICircle<Double>, Cloneable, Comparable<ICircle>
{
    private Double x;
    private Double y;
    private Double r;

    public CircleDouble(Double x, Double y, Double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ICircle<?>> T plus (T o)
    {
        return (T) new CircleDouble(x + (Double) o.getX()
                , y + (Double) o.getY()
                , r + (Double) o.getR());
    }

    @Override
    public Double getX() {
        return x;
    }
    @Override
    public Double getY() {
        return y;
    }
    @Override
    public Double getR() {
        return r;
    }
    @Override
    public void setX(Double x) {
        this.x = x;
    }
    @Override
    public void setY(Double y) {
        this.y = y;
    }
    @Override
    public void setR(Double r) {
        this.r = r;
    }

    public String toString(){
        return "[(" + x + "," + y + "), " + r + "]";
    }
    @Override
    public CircleDouble clone(){
        return new CircleDouble(x, y, r);
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

        double d = this.r*this.r - (Double) o.getR()*(Double) o.getR();
        if(d > 0) return 1;
        else return (d<0)? -1 : 0;
    }
}

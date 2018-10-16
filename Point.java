public class Point{
    private int x;
    private int y;
    public Point(int X, int Y)
    {
        x = X;
        y = Y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public double distanceTo(Point other)
    {
        double xGap = Math.pow(getX() - other.getX(), 2);
        double yGap = Math.pow(getY() - other.getY(), 2);
        return Math.pow(xGap + yGap, 0.5);
    }

}
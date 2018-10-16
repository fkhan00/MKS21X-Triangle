public class Triangle{
    public Point P1,P2,P3;
    public Triangle(Point NP1, Point NP2, Point NP3)
    {
        P1 = NP1;
        P2 = NP2;
        P3 = NP3;
    }
    public Point[] Vertices(){
        Point[] Vertex = new Point[3];
        Vertex[0] = this.P1;
        Vertex[1] = this.P2;
        Vertex[2] = this.P3;
        return Vertex;
    }

    public Point getVertex(int index)
    {
        Point V1 = Vertices()[0];
        return V1;
    }
    public void setVertex(int index, Point newP){
        Vertices()[index] = newP;
    }
    public double Perimeter()
    {
        return P1.distanceTo(P2) + P1.distanceTo(P3) + P2.distanceTo(P3);
    }
}
}
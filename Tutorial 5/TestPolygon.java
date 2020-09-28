public class TestPolygon extends Polygon {
    public TestPolygon(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
        super.setPolytype(KindofPolygon.POLY_PLAIN);
    }

    public void printArea(Rectangle r) {
        System.out.println(r.calArea());
    }

    public void printArea(Triangle t) {
        System.out.println(t.calArea());
    }

    public static void main(String[] args) {
        TestPolygon c = new Rectangle(TestPolygon, theWidth, theHeight)
    }

}

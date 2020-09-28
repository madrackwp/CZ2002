public class Rectangle extends Polygon {
    public Rectangle(String name, float theWidth, float theHeight) {
        super(name, theWidth, theHeight);
        super.setPolytype(KindofPolygon.POLY_RECT);
    }

    public float calArea() {
        return this.height * this.width;
    }

}

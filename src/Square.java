public class Square {

    private Rectangle square;
    private int side;

    public Square(int xx) {
        this.side = xx;
        this.square = new Rectangle(xx,xx);
    }
}

package Model;

public class Layout {
    private char[][] area;
    private char icon;
    private int maxX;
    private int maxY;

    public char getIcon() {
        return icon;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public char[][] getArea() {
        return area;
    }

    public Layout(int maxX, int maxY, char icon) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.icon = icon;
        area = new char[maxX][maxY];
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                area[i][j] = this.icon;
            }
        }
    }
}

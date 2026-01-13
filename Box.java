import java.awt.Color;
public class Box {

    private Color color;
    public Color getColor() {
        return color;
    }       
    public void setColor(Color color) {
        this.color = color;
    }   
    private int length;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    private int breadth;
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    private int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String toString() {
        return "Box [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }   
    public int getVolume() {
        // Calculate volume of the box
        return length * breadth * height;
    }
    
    
}

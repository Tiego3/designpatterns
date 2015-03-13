package za.ac.cput.designpatterns.builderpattern;

/**
 * Created by student on 2015/03/11.
 */
public class Clothing {
    private String size;
    private String colour;
    private String style;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}

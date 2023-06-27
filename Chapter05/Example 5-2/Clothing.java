/**
 * Example 4-2
 */
package ca.ucalgary.ensf409.examples;

public class Clothing {
    private int color;
    private String material;
    private final static String COLORS[] = {"black", "white", "yellow"};
    
    // Getters and setters
    public String getColor() { return COLORS[this.color]; }
    public int getColorID() { return this.color; }
    public String getMaterial() { return this.material; }
    public void setMaterial(String material) { this.material = material; }
    public void setColor(String color) {
        for (int i=0; i<COLORS.length; i++) {
            if (color.equals(COLORS[i])) {
                this.color = i;
            } else {
                this.color = 0;
            }
        }
    }
    public void setColor(int color) {
        if (color < COLORS.length) {
            this.color = color;
        } else {
            this.color = 0;
        }
    }
    // Constructors
    public Clothing(String color, String material) {
        this.setColor(color);
        this.material = material;
    }
    public Clothing(int color, String material) {
        this.setColor(color);
        this.material = material;
    }

    public static void main(String[] args) {
        var garment = new Clothing(0, "cotton");
        System.out.printf("Color: %s, Material: %s\n",
          garment.getColor(), garment.getMaterial());
    }
}

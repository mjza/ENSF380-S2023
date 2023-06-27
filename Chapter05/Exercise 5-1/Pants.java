/**
 * Exercise 5-1
 */
package ca.ucalgary.ensf409.exercise;

public class Pants {
    private Clothing fabric;
    private int waistSize;
    private int legSize;

    public Pants(String color, String material, int waist, int leg) {
        this.fabric = new Clothing(color, material);
        this.waistSize = waist;
        this.legSize = leg;
    }

    public static void main(String[] args) {
        var myPants = new Pants("blue", "cotton", 34, 36);
        System.out.printf("Color: %s, Material: %s, Waist: %d, Leg: %d\n",
          myPants.getColor(), 
          myPants.getMaterial(), 
          myPants.getWaistSize(),
          myPants.getWaistSize());
    }

	private Object getWaistSize() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getColor() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Clothing {
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
        var garment = new Clothing("black", "cotton");
        System.out.printf("Color: %s, Material: %s\n",
          garment.getColor(), garment.getMaterial());
    }
}




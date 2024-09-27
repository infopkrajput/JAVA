class Box {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate uninitialized val
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// BoxWeight now fully implements all constructors.
class BoxWeight extends Box {
    double weight; // weight of box

    // BoxWeight(double w, double h, double d, double m) {
    // width = w;
    // height = h;
    // depth = d;
    // weight = m;
    // }

    // BoxWeight now uses super to initialize its Box attributes.

    // initialize width, height, and depth using super()

    BoxWeight(double w, double h, double d, double m) {

        super(w, h, d); // call superclass constructor
        weight = m;

    }

    // default constructor
    BoxWeight() {
        weight = -1;
    }
}

class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();
        // // assign BoxWeight reference to Box reference
        plainbox = weightbox;
        vol = plainbox.volume(); // OK, volume() defined in Box
        System.out.println("Volume of plainbox is " + vol);
        /*
         * 
         * 
         * The following statement is invalid because plainbox does not define
         * a
         * 
         * 
         * weight member.
         * 
         * 
         */

        // System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}
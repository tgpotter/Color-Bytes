public class ColorBytes {
    public static void main(String[] args) {

        int a = 23,
            r = 121,
            g = 255,
            b = 130;

        //pack four components into one int color
        int color = 0;
        color = (color | (a << 24));
        color = (color | (r << 16));
        color = (color | (g << 8));
        color = (color | b);


        System.out.println("a, r, g, b = " + a +
                           ", "  + r + ", " + g + ", " + b);
        System.out.println("color = " + color);

        //unpack color to get its four
        //components back in a, r, g, b
        //
        a = (color >> 24) & 0xFF;
        r = (color >> 16) & 0xFF;
        g = (color >> 8) & 0xFF;
        b = (color) & 0xFF;

        System.out.println("a, r, g, b = " + a +
                            ", " + r + ", " + g + ", " + b);
    }
}

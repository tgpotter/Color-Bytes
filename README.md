# Color Bytes
A quick assignment to practice the use of bitwise operators. It takes 4 int values between 0-255, packs them into a single int, prints that value to the terminal, and then unpacks to confirm the original values were stored properly. 

## Directive
Write a program defining four natural numbers from the range [0,255] and representing components of a color: α, red, green, blue. Then pack these four numbers into
one int, bytes of which (from the most to the least significant) correspond to the four components of the color in the order given above.

Using only this integer, unpack it to four numbers corresponding to the four components of the color.
For example, the following program:

````java 
public class ColorBytes {
	public static void main(String[] args) {
		int a = 23, r = 121, g = 255, b = 130, color;
		// pack four components into one int color
		//
		// ...
		//
		System.out.println("a, r, g, b = " + a +
				", " + r + ", " + g + ", " + b);
		System.out.println("color = " + color);
		a = 0;
		r = 0;
		g = 0;
		b = 0;
		
		// unpack color to get its four
		// components back in a, r, g, b
		//
		// ...
		//
		System.out.println("a, r, g, b = " + a +
				", " + r + ", " + g + ", " + b);
		}
	}
````	

Should print:
````java
	a, r, g, b = 23, 121, 255, 130
	color = 393871234
	a, r, g, b = 23, 121, 255, 130
````



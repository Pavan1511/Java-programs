//WAP to print the properties of the existing screen

import java.awt.*;
public class ScreenDetails {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		System.out.println(toolkit.getScreenResolution());
		System.out.println(toolkit.getScreenSize());
	}
}

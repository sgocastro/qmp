package qmp.classes;

public class Color {
	private int red;
	private int green;
	private int blue;
	
	public Color(int red, int green, int blue) {
		try {
			if(!isValidRGBValue(red) || !isValidRGBValue(green) || !isValidRGBValue(blue)) {
				throw new Exception("Los valores ingresados no son correctos.");
			}
			
			this.setRed(red);
			this.setGreen(green);
			this.setBlue(blue);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	private boolean isValidRGBValue(int value){
		return value <= 255 & value >= 0;
	}
}
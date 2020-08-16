import java.awt.image.BufferedImage;
import java.io.File;

public class Peg // a class to represent individual peg objects on the users board 
{
	private static File filePath; //the location that the user wishes to source the peg image from
	private static String name; //the name of the peg
	private static BufferedImage img; //the image that will be displayed for the peg

	public Peg(File filePath, String name)
	{
		this.filePath = filePath;
		this.name = name;
		this.img = drawImage(File filePath);
	}

	public static BufferedImage drawImage(File filePath)
	{
		return ImageIO.read(filePath));
	}

	public String getName() //returns the name of the users peg
	{
		return name;
	}

	public BufferedImage getImage() //returns the image that represents the peg
	{
		return img;
	}

}
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.net.URL;

public class Peg // a class to represent individual peg objects on the users board 
{
	private static File filePath; //the location that the user wishes to source the peg image from
	private static String name; //the name of the peg
	private static BufferedImage img; //the image that will be displayed for the peg

	public Peg(File filePath) throws Exception
	{
		this.filePath = filePath;
		//this.name = name;
		this.img = drawImage(filePath);
	}

	public Peg(URL url) throws Exception
	{
		this.img = webImage(url);
	}

	public Peg() throws Exception
	{
		this.filePath = new File("default.png");
		this.name = "default";
		this.img = drawImage(filePath);
	}

	public static BufferedImage drawImage(File filePath) throws Exception
	{
		return ImageIO.read(filePath);
		
	}

	public static BufferedImage webImage(URL url) throws Exception
	{
		return ImageIO.read(url);
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
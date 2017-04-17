package Sikuliwindowappautomation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;



public class ImagevViewWindowbase {
	
	public static void main(String[] args) throws SikuliException, Exception {
		
		
		Screen sc = new Screen();
		Pattern image1 = new Pattern("G:\\eclipse\\selenium cook book\\driver\\SikuliWindowAutomatetestpic.png");
		Pattern image2 = new Pattern("G:\\eclipse\\selenium cook book\\driver\\picturefolder.png");
		Pattern image3 = new Pattern("G:\\eclipse\\selenium cook book\\driver\\samplepicturefolder.png");
		Pattern image4 = new Pattern("G:\\eclipse\\selenium cook book\\driver\\penguinpic.png");
	sc.click(image1);
	Thread.sleep(3000);
	sc.click(image2);
	Thread.sleep(3000);
	sc.doubleClick(image3);
	Thread.sleep(3000);
	sc.doubleClick(image4);
	Thread.sleep(3000);
		
	}

}

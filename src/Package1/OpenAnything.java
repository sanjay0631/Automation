package Package1;

import java.awt.*;
import java.io.*;
import java.net.URI;
public class OpenAnything{
	public static void main(String[] Args) {
		try{
			
			File file = new File("C:\\Users\\Administrator\\Desktop\\sanjay\\Java RoadMap.JPG");
			URI u1= new URI("https://in.tradingview.com/chart/7kiSiVn5/");
			URI u2= new URI("https://chartink.com/screener/falling-channel");
			
			if(!Desktop.isDesktopSupported())
			{
				System.out.println("File not supported");
				return;
			}
			else
			{
					Desktop d=Desktop.getDesktop();
					d.print(file);
					d.browse(u1);
					d.browse(u2);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
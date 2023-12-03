package Package1;
import java.awt.*;  
import java.net.URI;  
public class OpenExcel   
{  
public static void main(String[] args)   
{  
try  
{  
//constructor of file class having file as argument  
//File file = new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");   
	URI u =new URI("mailto:sanjay.v4@cognizant.com");
//if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
//{  
//System.out.println("not supported");  
//return;  
//}  
Desktop desktop = Desktop.getDesktop();  
//if(file.exists())         //checks file exists or not  
desktop.mail(u);              //opens the specified file  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  
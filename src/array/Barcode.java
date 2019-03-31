package array;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcode {

	@Test
 public void barcode() throws Exception {
  //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
  WebDriver dr= new FirefoxDriver();
  dr.manage().window().maximize();
  dr.get("https://barcode.tec-it.com/en/Code128?data=vinay%20vykuntam");
  String Barcode= dr.findElement(By.tagName("img")).getAttribute("src");
  System.out.println(Barcode);
  URL url = new URL(Barcode);
  BufferedImage bufferimage=ImageIO.read(url);
  
  BufferedImageLuminanceSource lumninaceS=new BufferedImageLuminanceSource(bufferimage);
  BinaryBitmap Bitm= new BinaryBitmap(new HybridBinarizer(lumninaceS));
  Result result= new MultiFormatReader().decode(Bitm);
  String x = result.getText();
  System.out.println(x);
  //Result result= new MultiFormartReader().decode(Bitm);

}
}
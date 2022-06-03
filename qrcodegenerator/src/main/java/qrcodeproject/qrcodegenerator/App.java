package qrcodeproject.qrcodegenerator;

import java.io.IOException;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class App {
  public static void main(String[] args) throws WriterException, IOException {
    System.out.println("Hello World!");
    String Qrcodedetails="This qrcode is developed by vasu through java code";
    String path="C:\\Users\\srini\\java projects\\qrcode.jpg";
    BitMatrix matrix=new MultiFormatWriter().encode(Qrcodedetails,BarcodeFormat.QR_CODE,500,500);
    MatrixToImageWriter.writeToPath(matrix,"jpg",Paths.get(path));
  }
}
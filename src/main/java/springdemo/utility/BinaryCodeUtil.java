package springdemo.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

public class BinaryCodeUtil {
    public void Encoder(String contents, String imageName) {
        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();

        hints.put(EncodeHintType.CHARACTER_SET, "GBK");
        BitMatrix matrix = null;
        try {
            matrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, 300, 300, hints);
        } catch (WriterException e1) {
            // TODO 自動生成された catch ブロック
            e1.printStackTrace();
        }

        File file = new File("C:/Users/deng_wenxin/Desktop/" + imageName + ".png");
        try {
            MatrixToImageWriter.writeToFile(matrix, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String Decode(String imageName) {
        File file = new File("C:/Users/deng_wenxin/Desktop/" + imageName +".png");
        BufferedImage bufferedImage = null;

        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Hashtable<DecodeHintType, String> hints = new Hashtable<DecodeHintType, String>();
        hints.put(DecodeHintType.CHARACTER_SET, "GBK");
        Result result = null;

        try {
            result = new MultiFormatReader().decode(bitmap, hints);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}

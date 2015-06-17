import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class Encode {

    public static void main(String[] args) {

        String contents = "邓文新";

        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();

        hints.put(EncodeHintType.CHARACTER_SET, "GBK");

        BitMatrix matrix = null;

        try {

            matrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, 300, 300, hints);

        } catch (WriterException e) {

            e.printStackTrace();

        }

        File file = new File("C:/Users/deng_wenxin/Desktop/1e.png");

        try {

            MatrixToImageWriter.writeToFile(matrix, "png", file);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}

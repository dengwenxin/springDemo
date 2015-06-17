package springdemo.utility;

import java.io.UnsupportedEncodingException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonUtil {


    /**
     * バイト配列をStringに変換（DBのblob系カラム取得用）
     * 
     * @param byteArray
     * @return
     */
    public static String byteToString(byte[] byteArray) {
        String str = "";

        if (byteArray == null) {
            return null;
        }

        try {
            str = new String(byteArray, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }

        return str;
    }
    

    public static int[] stringArrToIntArr(String[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = Integer.parseInt(arr[i]);
        }
        return ret;
    }

}

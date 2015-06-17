package springdemo.utility;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * j暗号化のユーティリティクラス
 */
public class EncryptUtil {

    private Logger logger = LoggerFactory.getLogger(EncryptUtil.class);

    /**
     * javaによる暗号化。
     *
     * @param str 対象値
     * @return 暗号化された値
     */
    public String encrypt(String str) {

        String encryptStr = "";
        if (str != null) {
            try {
                byte[] key = "3G1SG@^b($2lQgvP".getBytes();
                byte[] iv = "ZZ?Ag0N}TI5zQMP1".getBytes();
                SecretKey cipherKey = new SecretKeySpec(key, "AES");
                IvParameterSpec ivSpec = new IvParameterSpec(iv);
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(Cipher.ENCRYPT_MODE, cipherKey, ivSpec);
                byte[] cipherText = cipher.doFinal(str.getBytes());
                encryptStr = asHex(cipherText);
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }

        return encryptStr;
    }

    /**
     * 十六進数
     * @param bytes
     * @return strbuf
     */
    private String asHex(byte bytes[]) {
        StringBuffer strbuf = new StringBuffer(bytes.length * 2);
        for (int index = 0; index < bytes.length; index++) {
            int bt = bytes[index] & 0xff;
            if (bt < 0x10) {
                strbuf.append("0");
            }
            strbuf.append(Integer.toHexString(bt));
        }
        return strbuf.toString();
    }

    /**
     * 暗号化した値と文字列の比較
     * @param arg0 入力値
     * @param arg1 DBの値
     */
    public boolean matches(CharSequence arg0, String arg1) {
        if (encrypt(arg0.toString()).equals(arg1)) {
            return true;
        }
        return false;
    }
}

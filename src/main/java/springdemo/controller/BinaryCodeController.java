package springdemo.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springdemo.bean.BinaryCode;
import springdemo.utility.BinaryCodeUtil;

@Controller
public class BinaryCodeController {

    @RequestMapping(value = "BinaryCode")
    public String init() {
        return "BinaryCode";
    }

    @RequestMapping(value = "BinaryCode", method = RequestMethod.POST)
    public void createBinaryCode(HttpServletRequest request, HttpServletResponse response, BinaryCode codeInfo, Model model) {
        String binaryCode = codeInfo.getCodeContent();
        String imageName = codeInfo.getImageName();
        if (!binaryCode.isEmpty()) {
            BinaryCodeUtil code = new BinaryCodeUtil();
            code.Encoder(binaryCode, imageName);
            String deImageContent = code.Decode(imageName);
            model.addAttribute("deImageContent", deImageContent);
            model.addAttribute("imageUrl", "C:/Users/deng_wenxin/Desktop/" + imageName + ".png");
//            response.setContentType("image/*");
//            FileInputStream fis = null;
//            OutputStream os = null;
//            try {
//                fis = new FileInputStream("C:/Users/deng_wenxin/Desktop/" + imageName + ".png");
//                os = response.getOutputStream();
//                int count = 0;
//                byte[] buffer = new byte[1024 * 8];
//                while ((count = fis.read(buffer)) != -1) {
//                    os.write(buffer, 0, count);
//                    os.flush();
//                }
//                
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    fis.close();
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }
    // @RequestMapping("showImage")
    // public void showImage(HttpServletRequest re,HttpServletResponse response,String
    // pic_addr){//pic_addr:图片路径(d:\\upload\a.jpg)
    // response.setContentType("image/*");
    // FileInputStream fis = null;
    // OutputStream os = null;
    // try {
    // fis = new FileInputStream(pic_addr);
    // os = response.getOutputStream();
    // int count = 0;
    // byte[] buffer = new byte[1024*8];
    // while ( (count = fis.read(buffer)) != -1 ){
    // os.write(buffer, 0, count);
    // os.flush();
    // }
    // }catch(Exception e){
    // e.printStackTrace();
    // }finally {
    // try {
    // fis.close();
    // os.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }
    // }
}

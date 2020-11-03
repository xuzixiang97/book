package util;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @Author: xuzixiang
 * @CreateTime: 2020-11-03 14:47
 * @Description:
 */
public class FileUtil {

    /**
     * string2InputStream
     * @param str
     * @return
     */
    public static InputStream stringToInputStream(String str) {
        InputStream stream = new ByteArrayInputStream(str.getBytes());
        return stream;
    }

    /**
     * inputStream2String
     * @param is
     * @return
     * @throws IOException
     */
    public static String inputStreamToString(InputStream is) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = in.readLine()) != null){
            buffer.append(line);
        }
        return buffer.toString();
    }

    /**
     * inputstreamToFile
     * @param ins
     * @param file
     * @throws IOException
     */
    public static void inputstreamToFile(InputStream ins,File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.close();
        ins.close();
    }





}

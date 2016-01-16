package com.jc.Hash;

import sun.text.normalizer.UTF16;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Timer;

/**
 * Created by jc on 1/9/2016.
 */
public class Hash {
    private static String toHex(byte buffer[]) {
        StringBuffer sb = new StringBuffer(buffer.length * 2);
        for (int i = 0; i < buffer.length; i++) {
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(buffer[i] & 15, 16));
        }

        return sb.toString();
    }

    private static String getHash(String fileName, String hashType)
            throws Exception {
        InputStream fis = new FileInputStream(fileName);
        byte buffer[] = new byte[1024];
        MessageDigest md5 = MessageDigest.getInstance(hashType);
        for(int numRead = 0; (numRead = fis.read(buffer)) > 0;)
        {
            md5.update(buffer, 0, numRead);
        }
        fis.close();
        return toHex(md5.digest());
    }

//3ef7aa6cbeff8004297cbbe35dcc2e21d1ee22f4
    //"MD5"，"SHA1"，"SHA-256"，"SHA-384"，"SHA-512"
    public static void main(String[] args)throws Exception{
        System.out.println(getHash("G:\\ThunderDownload\\少数派报告BD中英双字1280x720高清版.rmvb","SHA1"));
    }

}

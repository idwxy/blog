package com.idwxy.blog.util;

import java.security.MessageDigest;

public class MD5Util {

    private static String byteArrayTohexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    public static String MD5Encode(String orign, String charsetname) {
        String resultSring = null;
        try {
            resultSring = new String(orign);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname == null || "".equals(charsetname)) {
                resultSring = byteArrayTohexString(md.digest(resultSring.getBytes()));
            } else {
                resultSring = byteArrayTohexString(md.digest(resultSring.getBytes(charsetname)));
            }
        } catch (Exception exception) {

        }
        return resultSring;
    }

    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
}

package com.example.bart.asd;

import java.math.BigInteger;
import com.example.bart.asd.RSA;

/**
 * Created by jberg on 6/20/2016.
 */
public class rsaTest {

    public static void main(String[] args) {
        int N = 226;
        RSA key = new RSA(N);
        System.out.println(key);

        // create random message, encrypt and decrypt
        // BigInteger message = new BigInteger(N-1, random);

        //// create message by converting string to integer
        String s = "Ik heb zin in stampot";
        byte[] bytes = s.getBytes();
        BigInteger message = new BigInteger(bytes);

        BigInteger encrypt = key.encrypt(message);
        BigInteger decrypt = key.decrypt(encrypt);
        byte[] rebytes = RSA.bigIntToByteArray(decrypt);
        String res = RSA.byteArrayToUTF(rebytes);

        System.out.println("Original message = " + s);
        System.out.println("message   = " + message);
        System.out.println("encrypted = " + encrypt);
        System.out.println("decrypted = " + decrypt);
        System.out.print("Re-Original messaage = " + res);

    }
}

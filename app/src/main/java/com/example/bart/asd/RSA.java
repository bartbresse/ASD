package com.example.bart.asd;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.SecureRandom;


public class RSA {
    private final static BigInteger one      = new BigInteger("1");
    private final static SecureRandom random = new SecureRandom();

    private BigInteger privateKey;
    private BigInteger publicKey;
    private BigInteger modulus;

    // generate an N-bit (roughly) public and private key
    RSA(int N) {
        BigInteger p = BigInteger.probablePrime(N/2, random);
        BigInteger q = BigInteger.probablePrime(N/2, random);
        BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

        modulus    = p.multiply(q);
        publicKey  = new BigInteger("65537");     // common value in practice = 2^16 + 1
        privateKey = publicKey.modInverse(phi);
    }


    BigInteger encrypt(BigInteger message) {
        return message.modPow(publicKey, modulus);
    }

    BigInteger decrypt(BigInteger encrypted) {
        return encrypted.modPow(privateKey, modulus);
    }

    public String toString() {
        String s = "";
        s += "public  = " + publicKey  + "\n";
        s += "private = " + privateKey + "\n";
        s += "modulus = " + modulus;
        return s;
    }

    /**
     * @param decrypt
     * @return
     */
    public static byte[] bigIntToByteArray(BigInteger decrypt) {
        byte[] rebytes = decrypt.toByteArray();
        return rebytes;
    }

    /**
     * @param rebytes
     * @return
     */
    public static String byteArrayToUTF(byte[] rebytes) {
        String res;
        try {
            res = new String(rebytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            res = "error";
        }
        return res;
    }









}

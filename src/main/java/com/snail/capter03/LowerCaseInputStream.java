package com.snail.capter03;

import java.io.*;

/**
 * FilterInputStream是jdk中对文件输入流的一个包装类
 * 自定义包装类，继承了jdk的FilterInputStream
 * 包装了FileInputStream，将所有读取到的字节转成小写
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return (read == -1 ? read : Character.toLowerCase(read));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int r = super.read(b, off, len);
        for(int i=off; i<off+r;i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return r;
    }
}

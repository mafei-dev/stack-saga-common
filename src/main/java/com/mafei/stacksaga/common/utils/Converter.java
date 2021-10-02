package com.mafei.stacksaga.common.utils;

import java.io.*;

public class Converter {
    public static byte[] write(Object obj) throws IOException {
        try (
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oout = new ObjectOutputStream(baos);
        ) {
            oout.writeObject(obj);
            return baos.toByteArray();
        }

    }

    public static <T> T read(byte[] data, Class<T> aClass) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectIn = new ObjectInputStream(new ByteArrayInputStream(data))) {
            return aClass.cast(objectIn.readObject());
        }
    }

    public static <T> T read(ByteArrayInputStream byteArrayInputStream, Class<T> aClass) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectIn = new ObjectInputStream(byteArrayInputStream)) {
            return aClass.cast(objectIn.readObject());
        }
    }



    public static Integer objectOrNull(Integer data) {
        if (data == null) {
            return null;
        } else {
            return data;
        }
    }
}

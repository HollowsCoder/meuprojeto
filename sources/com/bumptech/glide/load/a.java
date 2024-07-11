package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import t2.b;
import z2.w;

public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                int c10 = ((ImageHeaderParser) list.get(i10)).c(inputStream, bVar);
                if (c10 != -1) {
                    return c10;
                }
                i10++;
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                ImageHeaderParser.ImageType b10 = ((ImageHeaderParser) list.get(i10)).b(inputStream);
                inputStream.reset();
                if (b10 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return b10;
                }
                i10++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

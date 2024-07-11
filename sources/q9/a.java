package q9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import n.e;
import w9.c0;
import w9.p;
import w9.q;
import w9.s;
import z8.g;

public final class a implements b {
    public final void a(File file) {
        g.f(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public final p b(File file) {
        g.f(file, "file");
        Logger logger = q.f9346a;
        return e.H(new FileInputStream(file));
    }

    public final s c(File file) {
        g.f(file, "file");
        try {
            Logger logger = q.f9346a;
            return new s(new FileOutputStream(file, false), new c0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = q.f9346a;
            return new s(new FileOutputStream(file, false), new c0());
        }
    }

    public final void d(File file) {
        g.f(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i10 = 0;
            while (i10 < length) {
                File file2 = listFiles[i10];
                g.e(file2, "file");
                if (file2.isDirectory()) {
                    d(file2);
                }
                if (file2.delete()) {
                    i10++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public final s e(File file) {
        g.f(file, "file");
        try {
            Logger logger = q.f9346a;
            return new s(new FileOutputStream(file, true), new c0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = q.f9346a;
            return new s(new FileOutputStream(file, true), new c0());
        }
    }

    public final boolean f(File file) {
        g.f(file, "file");
        return file.exists();
    }

    public final void g(File file, File file2) {
        g.f(file, "from");
        g.f(file2, "to");
        a(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    public final long h(File file) {
        g.f(file, "file");
        return file.length();
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}

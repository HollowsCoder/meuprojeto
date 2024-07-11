package q1;

import t1.c;

public enum b {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private b(String str) {
        this.extension = str;
    }

    public static b forFile(String str) {
        for (b bVar : values()) {
            if (str.endsWith(bVar.extension)) {
                return bVar;
            }
        }
        c.b("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    public String toString() {
        return this.extension;
    }
}

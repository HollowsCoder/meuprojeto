package a0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import f0.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public final class c {

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final C0003c[] f13a;

        public b(C0003c[] cVarArr) {
            this.f13a = cVarArr;
        }
    }

    /* renamed from: a0.c$c  reason: collision with other inner class name */
    public static final class C0003c {

        /* renamed from: a  reason: collision with root package name */
        public final String f14a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16c;
        public final String d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17e;

        /* renamed from: f  reason: collision with root package name */
        public final int f18f;

        public C0003c(int i10, int i11, int i12, String str, String str2, boolean z) {
            this.f14a = str;
            this.f15b = i10;
            this.f16c = z;
            this.d = str2;
            this.f17e = i11;
            this.f18f = i12;
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final e f19a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21c;
        public final String d;

        public d(e eVar, int i10, int i11, String str) {
            this.f19a = eVar;
            this.f21c = i10;
            this.f20b = i11;
            this.d = str;
        }
    }

    public static a a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        boolean z;
        int i11;
        Resources resources2 = resources;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, (String) null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), n.e.f7303y);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), n.e.z);
                                int i12 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i12 = 1;
                                }
                                int i13 = obtainAttributes2.getInt(i12, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i10 = 6;
                                } else {
                                    i10 = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i10, 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i14 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i14 = 3;
                                }
                                int i15 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i15 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i15);
                                int i16 = obtainAttributes2.getInt(i14, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i11 = 5;
                                } else {
                                    i11 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                                String string6 = obtainAttributes2.getString(i11);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c(xmlResourceParser);
                                }
                                arrayList.add(new C0003c(i13, i16, resourceId2, string6, string5, z));
                            } else {
                                c(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new b((C0003c[]) arrayList.toArray(new C0003c[arrayList.size()]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new d(new e(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String decode : stringArray) {
                            arrayList2.add(Base64.decode(decode, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String decode2 : stringArray2) {
                    arrayList3.add(Base64.decode(decode2, 0));
                }
                arrayList.add(arrayList3);
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}

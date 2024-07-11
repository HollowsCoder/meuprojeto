package g7;

import android.util.JsonReader;
import com.karumi.dexter.BuildConfig;
import f7.b;
import f7.b0;
import f7.o;
import f7.r;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import q7.d;
import q7.e;
import t3.u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f4992a;

    /* renamed from: g7.a$a  reason: collision with other inner class name */
    public interface C0071a<T> {
        T b(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        f7.a.f4634a.a(eVar);
        eVar.d = true;
        f4992a = new d(eVar);
    }

    public static r a(JsonReader jsonReader) {
        r.a aVar = new r.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    aVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f4856b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    aVar.f4855a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    aVar.f4857c = jsonReader.nextString();
                    break;
                case 4:
                    aVar.f4858e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static f7.d b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str3 = jsonReader.nextString();
                if (str3 == null) {
                    throw new NullPointerException("Null value");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new f7.d(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static <T> b0<T> c(JsonReader jsonReader, C0071a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.b(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f7.k d(android.util.JsonReader r23) {
        /*
            r0 = r23
            f7.k$a r1 = new f7.k$a
            r1.<init>()
            r23.beginObject()
        L_0x000a:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x0493
            java.lang.String r2 = r23.nextName()
            r2.getClass()
            int r3 = r2.hashCode()
            java.lang.String r4 = "timestamp"
            r5 = 1
            r6 = 2
            r7 = 4
            r8 = 3
            switch(r3) {
                case -1335157162: goto L_0x004f;
                case 96801: goto L_0x0044;
                case 107332: goto L_0x0039;
                case 3575610: goto L_0x002e;
                case 55126294: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x005a
        L_0x0025:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            r2 = r7
            goto L_0x005b
        L_0x002e:
            java.lang.String r3 = "type"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            r2 = r8
            goto L_0x005b
        L_0x0039:
            java.lang.String r3 = "log"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0042
            goto L_0x005a
        L_0x0042:
            r2 = r6
            goto L_0x005b
        L_0x0044:
            java.lang.String r3 = "app"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            r2 = r5
            goto L_0x005b
        L_0x004f:
            java.lang.String r3 = "device"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = -1
        L_0x005b:
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r9 = ""
            switch(r2) {
                case 0: goto L_0x03dc;
                case 1: goto L_0x00ce;
                case 2: goto L_0x0082;
                case 3: goto L_0x0071;
                case 4: goto L_0x0066;
                default: goto L_0x0062;
            }
        L_0x0062:
            r23.skipValue()
            goto L_0x000a
        L_0x0066:
            long r2 = r23.nextLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.f4819a = r2
            goto L_0x000a
        L_0x0071:
            java.lang.String r2 = r23.nextString()
            if (r2 == 0) goto L_0x007a
            r1.f4820b = r2
            goto L_0x000a
        L_0x007a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null type"
            r0.<init>(r1)
            throw r0
        L_0x0082:
            r23.beginObject()
            r10 = 0
        L_0x0086:
            boolean r2 = r23.hasNext()
            if (r2 == 0) goto L_0x00ae
            java.lang.String r2 = r23.nextName()
            r2.getClass()
            java.lang.String r4 = "content"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x009f
            r23.skipValue()
            goto L_0x0086
        L_0x009f:
            java.lang.String r10 = r23.nextString()
            if (r10 == 0) goto L_0x00a6
            goto L_0x0086
        L_0x00a6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null content"
            r0.<init>(r1)
            throw r0
        L_0x00ae:
            r23.endObject()
            if (r10 != 0) goto L_0x00b5
            java.lang.String r9 = " content"
        L_0x00b5:
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x00c4
            f7.t r2 = new f7.t
            r2.<init>(r10)
            r1.f4822e = r2
            goto L_0x000a
        L_0x00c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r9)
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            r23.beginObject()
            r2 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x00d6:
            boolean r11 = r23.hasNext()
            if (r11 == 0) goto L_0x03af
            java.lang.String r11 = r23.nextName()
            r11.getClass()
            int r16 = r11.hashCode()
            switch(r16) {
                case -1332194002: goto L_0x0117;
                case -1090974952: goto L_0x010c;
                case -80231855: goto L_0x0101;
                case 555169704: goto L_0x00f6;
                case 928737948: goto L_0x00eb;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x0122
        L_0x00eb:
            java.lang.String r10 = "uiOrientation"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00f4
            goto L_0x0122
        L_0x00f4:
            r10 = r7
            goto L_0x0123
        L_0x00f6:
            java.lang.String r10 = "customAttributes"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ff
            goto L_0x0122
        L_0x00ff:
            r10 = r8
            goto L_0x0123
        L_0x0101:
            java.lang.String r10 = "internalKeys"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x010a
            goto L_0x0122
        L_0x010a:
            r10 = r6
            goto L_0x0123
        L_0x010c:
            java.lang.String r10 = "execution"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0115
            goto L_0x0122
        L_0x0115:
            r10 = r5
            goto L_0x0123
        L_0x0117:
            java.lang.String r10 = "background"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            r10 = 0
            goto L_0x0123
        L_0x0122:
            r10 = -1
        L_0x0123:
            if (r10 == 0) goto L_0x03a1
            r11 = 7
            if (r10 == r5) goto L_0x0165
            if (r10 == r6) goto L_0x0145
            if (r10 == r8) goto L_0x013b
            if (r10 == r7) goto L_0x0132
            r23.skipValue()
            goto L_0x00d6
        L_0x0132:
            int r2 = r23.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00d6
        L_0x013b:
            r3.b r10 = new r3.b
            r10.<init>(r11)
            f7.b0 r13 = c(r0, r10)
            goto L_0x00d6
        L_0x0145:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r23.beginArray()
        L_0x014d:
            boolean r11 = r23.hasNext()
            if (r11 == 0) goto L_0x015b
            f7.d r11 = b(r23)
            r10.add(r11)
            goto L_0x014d
        L_0x015b:
            r23.endArray()
            f7.b0 r14 = new f7.b0
            r14.<init>(r10)
            goto L_0x00d6
        L_0x0165:
            r23.beginObject()
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0172:
            boolean r10 = r23.hasNext()
            if (r10 == 0) goto L_0x0378
            java.lang.String r10 = r23.nextName()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1375141843: goto L_0x01b3;
                case -1337936983: goto L_0x01a8;
                case -902467928: goto L_0x019d;
                case 937615455: goto L_0x0192;
                case 1481625679: goto L_0x0187;
                default: goto L_0x0186;
            }
        L_0x0186:
            goto L_0x01be
        L_0x0187:
            java.lang.String r11 = "exception"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0190
            goto L_0x01be
        L_0x0190:
            r10 = r7
            goto L_0x01bf
        L_0x0192:
            java.lang.String r11 = "binaries"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x019b
            goto L_0x01be
        L_0x019b:
            r10 = r8
            goto L_0x01bf
        L_0x019d:
            java.lang.String r11 = "signal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01a6
            goto L_0x01be
        L_0x01a6:
            r10 = r6
            goto L_0x01bf
        L_0x01a8:
            java.lang.String r11 = "threads"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01b1
            goto L_0x01be
        L_0x01b1:
            r10 = r5
            goto L_0x01bf
        L_0x01b3:
            java.lang.String r11 = "appExitInfo"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x01bc
            goto L_0x01be
        L_0x01bc:
            r10 = 0
            goto L_0x01bf
        L_0x01be:
            r10 = -1
        L_0x01bf:
            r11 = 6
            if (r10 == 0) goto L_0x028e
            if (r10 == r5) goto L_0x0283
            if (r10 == r6) goto L_0x01e2
            if (r10 == r8) goto L_0x01d5
            if (r10 == r7) goto L_0x01cf
            r23.skipValue()
            goto L_0x0372
        L_0x01cf:
            f7.o r19 = e(r23)
            goto L_0x0372
        L_0x01d5:
            r3.b r5 = new r3.b
            r6 = 8
            r5.<init>(r6)
            f7.b0 r22 = c(r0, r5)
            goto L_0x0372
        L_0x01e2:
            r23.beginObject()
            r5 = 0
            r6 = 0
            r10 = 0
        L_0x01e8:
            boolean r11 = r23.hasNext()
            if (r11 == 0) goto L_0x024d
            java.lang.String r11 = r23.nextName()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1147692044: goto L_0x0213;
                case 3059181: goto L_0x0208;
                case 3373707: goto L_0x01fd;
                default: goto L_0x01fc;
            }
        L_0x01fc:
            goto L_0x021e
        L_0x01fd:
            java.lang.String r12 = "name"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0206
            goto L_0x021e
        L_0x0206:
            r11 = 2
            goto L_0x021f
        L_0x0208:
            java.lang.String r12 = "code"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0211
            goto L_0x021e
        L_0x0211:
            r11 = 1
            goto L_0x021f
        L_0x0213:
            java.lang.String r12 = "address"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x021c
            goto L_0x021e
        L_0x021c:
            r11 = 0
            goto L_0x021f
        L_0x021e:
            r11 = -1
        L_0x021f:
            switch(r11) {
                case 0: goto L_0x0244;
                case 1: goto L_0x0235;
                case 2: goto L_0x0226;
                default: goto L_0x0222;
            }
        L_0x0222:
            r23.skipValue()
            goto L_0x01e8
        L_0x0226:
            java.lang.String r5 = r23.nextString()
            if (r5 == 0) goto L_0x022d
            goto L_0x01e8
        L_0x022d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null name"
            r0.<init>(r1)
            throw r0
        L_0x0235:
            java.lang.String r6 = r23.nextString()
            if (r6 == 0) goto L_0x023c
            goto L_0x01e8
        L_0x023c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null code"
            r0.<init>(r1)
            throw r0
        L_0x0244:
            long r10 = r23.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x01e8
        L_0x024d:
            r23.endObject()
            if (r5 != 0) goto L_0x0255
            java.lang.String r11 = " name"
            goto L_0x0256
        L_0x0255:
            r11 = r9
        L_0x0256:
            if (r6 != 0) goto L_0x025e
            java.lang.String r12 = " code"
            java.lang.String r11 = r11.concat(r12)
        L_0x025e:
            if (r10 != 0) goto L_0x0266
            java.lang.String r12 = " address"
            java.lang.String r11 = b0.d.e(r11, r12)
        L_0x0266:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0279
            f7.p r11 = new f7.p
            long r7 = r10.longValue()
            r11.<init>(r5, r6, r7)
            r21 = r11
            goto L_0x0372
        L_0x0279:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r11)
            r0.<init>(r1)
            throw r0
        L_0x0283:
            t3.u r5 = new t3.u
            r5.<init>(r11)
            f7.b0 r18 = c(r0, r5)
            goto L_0x0372
        L_0x028e:
            f7.c$a r5 = new f7.c$a
            r5.<init>()
            r23.beginObject()
        L_0x0296:
            boolean r6 = r23.hasNext()
            if (r6 == 0) goto L_0x036b
            java.lang.String r6 = r23.nextName()
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case 110987: goto L_0x02f7;
                case 111312: goto L_0x02ec;
                case 113234: goto L_0x02e1;
                case 55126294: goto L_0x02d8;
                case 202325402: goto L_0x02cd;
                case 722137681: goto L_0x02c2;
                case 723857505: goto L_0x02b7;
                case 2125650548: goto L_0x02ac;
                default: goto L_0x02aa;
            }
        L_0x02aa:
            goto L_0x0302
        L_0x02ac:
            java.lang.String r7 = "importance"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x02b5
            goto L_0x0302
        L_0x02b5:
            r6 = 7
            goto L_0x0303
        L_0x02b7:
            java.lang.String r7 = "traceFile"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x02c0
            goto L_0x0302
        L_0x02c0:
            r6 = r11
            goto L_0x0303
        L_0x02c2:
            java.lang.String r7 = "reasonCode"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x02cb
            goto L_0x0302
        L_0x02cb:
            r6 = 5
            goto L_0x0303
        L_0x02cd:
            java.lang.String r7 = "processName"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x02d6
            goto L_0x0302
        L_0x02d6:
            r6 = 4
            goto L_0x0303
        L_0x02d8:
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x02df
            goto L_0x0302
        L_0x02df:
            r6 = 3
            goto L_0x0303
        L_0x02e1:
            java.lang.String r7 = "rss"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x02ea
            goto L_0x0302
        L_0x02ea:
            r6 = 2
            goto L_0x0303
        L_0x02ec:
            java.lang.String r7 = "pss"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x02f5
            goto L_0x0302
        L_0x02f5:
            r6 = 1
            goto L_0x0303
        L_0x02f7:
            java.lang.String r7 = "pid"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r6 = 0
            goto L_0x0303
        L_0x0302:
            r6 = -1
        L_0x0303:
            switch(r6) {
                case 0: goto L_0x035f;
                case 1: goto L_0x0353;
                case 2: goto L_0x0347;
                case 3: goto L_0x033b;
                case 4: goto L_0x0329;
                case 5: goto L_0x031d;
                case 6: goto L_0x0315;
                case 7: goto L_0x030a;
                default: goto L_0x0306;
            }
        L_0x0306:
            r23.skipValue()
            goto L_0x0296
        L_0x030a:
            int r6 = r23.nextInt()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.d = r6
            goto L_0x0296
        L_0x0315:
            java.lang.String r6 = r23.nextString()
            r5.f4766h = r6
            goto L_0x0296
        L_0x031d:
            int r6 = r23.nextInt()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.f4762c = r6
            goto L_0x0296
        L_0x0329:
            java.lang.String r6 = r23.nextString()
            if (r6 == 0) goto L_0x0333
            r5.f4761b = r6
            goto L_0x0296
        L_0x0333:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null processName"
            r0.<init>(r1)
            throw r0
        L_0x033b:
            long r6 = r23.nextLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.f4765g = r6
            goto L_0x0296
        L_0x0347:
            long r6 = r23.nextLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.f4764f = r6
            goto L_0x0296
        L_0x0353:
            long r6 = r23.nextLong()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.f4763e = r6
            goto L_0x0296
        L_0x035f:
            int r6 = r23.nextInt()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.f4760a = r6
            goto L_0x0296
        L_0x036b:
            r23.endObject()
            f7.c r20 = r5.a()
        L_0x0372:
            r5 = 1
            r6 = 2
            r7 = 4
            r8 = 3
            goto L_0x0172
        L_0x0378:
            r23.endObject()
            if (r21 != 0) goto L_0x0380
            java.lang.String r5 = " signal"
            goto L_0x0381
        L_0x0380:
            r5 = r9
        L_0x0381:
            if (r22 != 0) goto L_0x0389
            java.lang.String r6 = " binaries"
            java.lang.String r5 = r5.concat(r6)
        L_0x0389:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0397
            f7.m r12 = new f7.m
            r17 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x03a9
        L_0x0397:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r5)
            r0.<init>(r1)
            throw r0
        L_0x03a1:
            boolean r5 = r23.nextBoolean()
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)
        L_0x03a9:
            r5 = 1
            r6 = 2
            r7 = 4
            r8 = 3
            goto L_0x00d6
        L_0x03af:
            r23.endObject()
            if (r12 != 0) goto L_0x03b6
            java.lang.String r9 = " execution"
        L_0x03b6:
            if (r2 != 0) goto L_0x03be
            java.lang.String r4 = " uiOrientation"
            java.lang.String r9 = r9.concat(r4)
        L_0x03be:
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x03d2
            f7.l r3 = new f7.l
            int r16 = r2.intValue()
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            r1.f4821c = r3
            goto L_0x000a
        L_0x03d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r9)
            r0.<init>(r1)
            throw r0
        L_0x03dc:
            f7.s$a r2 = new f7.s$a
            r2.<init>()
            r23.beginObject()
        L_0x03e4:
            boolean r3 = r23.hasNext()
            if (r3 == 0) goto L_0x0488
            java.lang.String r3 = r23.nextName()
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1708606089: goto L_0x0430;
                case -1455558134: goto L_0x0425;
                case -1439500848: goto L_0x041a;
                case 279795450: goto L_0x040f;
                case 976541947: goto L_0x0404;
                case 1516795582: goto L_0x03f9;
                default: goto L_0x03f8;
            }
        L_0x03f8:
            goto L_0x043b
        L_0x03f9:
            java.lang.String r4 = "proximityOn"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0402
            goto L_0x043b
        L_0x0402:
            r3 = 5
            goto L_0x043c
        L_0x0404:
            java.lang.String r4 = "ramUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x040d
            goto L_0x043b
        L_0x040d:
            r3 = 4
            goto L_0x043c
        L_0x040f:
            java.lang.String r4 = "diskUsed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0418
            goto L_0x043b
        L_0x0418:
            r3 = 3
            goto L_0x043c
        L_0x041a:
            java.lang.String r4 = "orientation"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0423
            goto L_0x043b
        L_0x0423:
            r3 = 2
            goto L_0x043c
        L_0x0425:
            java.lang.String r4 = "batteryVelocity"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x042e
            goto L_0x043b
        L_0x042e:
            r3 = 1
            goto L_0x043c
        L_0x0430:
            java.lang.String r4 = "batteryLevel"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0439
            goto L_0x043b
        L_0x0439:
            r3 = 0
            goto L_0x043c
        L_0x043b:
            r3 = -1
        L_0x043c:
            switch(r3) {
                case 0: goto L_0x047c;
                case 1: goto L_0x0470;
                case 2: goto L_0x0464;
                case 3: goto L_0x0459;
                case 4: goto L_0x044e;
                case 5: goto L_0x0443;
                default: goto L_0x043f;
            }
        L_0x043f:
            r23.skipValue()
            goto L_0x03e4
        L_0x0443:
            boolean r3 = r23.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.f4866c = r3
            goto L_0x03e4
        L_0x044e:
            long r3 = r23.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f4867e = r3
            goto L_0x03e4
        L_0x0459:
            long r3 = r23.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f4868f = r3
            goto L_0x03e4
        L_0x0464:
            int r3 = r23.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.d = r3
            goto L_0x03e4
        L_0x0470:
            int r3 = r23.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f4865b = r3
            goto L_0x03e4
        L_0x047c:
            double r3 = r23.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.f4864a = r3
            goto L_0x03e4
        L_0x0488:
            r23.endObject()
            f7.s r2 = r2.a()
            r1.d = r2
            goto L_0x000a
        L_0x0493:
            r23.endObject()
            f7.k r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.d(android.util.JsonReader):f7.k");
    }

    public static o e(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        b0 b0Var = null;
        o oVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    b0Var = c(jsonReader, new u(7));
                    break;
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    if (str2 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    oVar = e(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " type";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (b0Var == null) {
            str = str.concat(" frames");
        }
        if (num == null) {
            str = b0.d.e(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new o(str2, str3, b0Var, oVar, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f7.b f(android.util.JsonReader r28) {
        /*
            java.nio.charset.Charset r0 = f7.a0.f4737a
            f7.b$a r0 = new f7.b$a
            r0.<init>()
            r28.beginObject()
        L_0x000a:
            boolean r1 = r28.hasNext()
            if (r1 == 0) goto L_0x0532
            java.lang.String r1 = r28.nextName()
            r1.getClass()
            int r2 = r1.hashCode()
            java.lang.String r4 = "buildVersion"
            java.lang.String r5 = "installationUuid"
            java.lang.String r6 = "platform"
            java.lang.String r7 = "displayVersion"
            r9 = 5
            r12 = 2
            r15 = 0
            switch(r2) {
                case -2118372775: goto L_0x0070;
                case -1962630338: goto L_0x0065;
                case -911706486: goto L_0x005c;
                case 344431858: goto L_0x0051;
                case 719853845: goto L_0x0048;
                case 1874684019: goto L_0x003f;
                case 1975623094: goto L_0x0036;
                case 1984987798: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x007b
        L_0x002b:
            java.lang.String r2 = "session"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0034
            goto L_0x007b
        L_0x0034:
            r1 = 7
            goto L_0x007c
        L_0x0036:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x003d
            goto L_0x007b
        L_0x003d:
            r1 = 6
            goto L_0x007c
        L_0x003f:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0046
            goto L_0x007b
        L_0x0046:
            r1 = r9
            goto L_0x007c
        L_0x0048:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x004f
            goto L_0x007b
        L_0x004f:
            r1 = 4
            goto L_0x007c
        L_0x0051:
            java.lang.String r2 = "gmpAppId"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            r1 = 3
            goto L_0x007c
        L_0x005c:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0063
            goto L_0x007b
        L_0x0063:
            r1 = r12
            goto L_0x007c
        L_0x0065:
            java.lang.String r2 = "sdkVersion"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006e
            goto L_0x007b
        L_0x006e:
            r1 = 1
            goto L_0x007c
        L_0x0070:
            java.lang.String r2 = "ndkPayload"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r1 = r15
            goto L_0x007c
        L_0x007b:
            r1 = -1
        L_0x007c:
            java.lang.String r2 = "Null buildVersion"
            java.lang.String r16 = ""
            java.lang.String r3 = "Missing required properties:"
            r17 = 0
            switch(r1) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04c4;
                case 2: goto L_0x04b4;
                case 3: goto L_0x04a2;
                case 4: goto L_0x0490;
                case 5: goto L_0x0484;
                case 6: goto L_0x0472;
                case 7: goto L_0x008e;
                default: goto L_0x0087;
            }
        L_0x0087:
            r4 = r28
            r28.skipValue()
            goto L_0x000a
        L_0x008e:
            f7.g$a r1 = new f7.g$a
            r1.<init>()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.f4786e = r8
            r28.beginObject()
        L_0x009a:
            boolean r8 = r28.hasNext()
            if (r8 == 0) goto L_0x0467
            java.lang.String r8 = r28.nextName()
            r8.getClass()
            int r18 = r8.hashCode()
            r19 = 8
            java.lang.String r10 = "identifier"
            switch(r18) {
                case -2128794476: goto L_0x0129;
                case -1618432855: goto L_0x0120;
                case -1606742899: goto L_0x0115;
                case -1335157162: goto L_0x010a;
                case -1291329255: goto L_0x00ff;
                case 3556: goto L_0x00f4;
                case 96801: goto L_0x00e9;
                case 3599307: goto L_0x00de;
                case 286956243: goto L_0x00d0;
                case 1025385094: goto L_0x00c2;
                case 2047016109: goto L_0x00b4;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            goto L_0x0134
        L_0x00b4:
            java.lang.String r11 = "generatorType"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00be
            goto L_0x0134
        L_0x00be:
            r8 = 10
            goto L_0x0135
        L_0x00c2:
            java.lang.String r11 = "crashed"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00cc
            goto L_0x0134
        L_0x00cc:
            r8 = 9
            goto L_0x0135
        L_0x00d0:
            java.lang.String r11 = "generator"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00da
            goto L_0x0134
        L_0x00da:
            r8 = r19
            goto L_0x0135
        L_0x00de:
            java.lang.String r11 = "user"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00e7
            goto L_0x0134
        L_0x00e7:
            r8 = 7
            goto L_0x0135
        L_0x00e9:
            java.lang.String r11 = "app"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00f2
            goto L_0x0134
        L_0x00f2:
            r8 = 6
            goto L_0x0135
        L_0x00f4:
            java.lang.String r11 = "os"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00fd
            goto L_0x0134
        L_0x00fd:
            r8 = r9
            goto L_0x0135
        L_0x00ff:
            java.lang.String r11 = "events"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0108
            goto L_0x0134
        L_0x0108:
            r8 = 4
            goto L_0x0135
        L_0x010a:
            java.lang.String r11 = "device"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0113
            goto L_0x0134
        L_0x0113:
            r8 = 3
            goto L_0x0135
        L_0x0115:
            java.lang.String r11 = "endedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x011e
            goto L_0x0134
        L_0x011e:
            r8 = r12
            goto L_0x0135
        L_0x0120:
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0127
            goto L_0x0134
        L_0x0127:
            r8 = 1
            goto L_0x0135
        L_0x0129:
            java.lang.String r11 = "startedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r8 = r15
            goto L_0x0135
        L_0x0134:
            r8 = -1
        L_0x0135:
            java.lang.String r11 = "Null identifier"
            java.lang.String r20 = " identifier"
            java.lang.String r13 = "version"
            switch(r8) {
                case 0: goto L_0x045b;
                case 1: goto L_0x0448;
                case 2: goto L_0x043c;
                case 3: goto L_0x0328;
                case 4: goto L_0x0306;
                case 5: goto L_0x027b;
                case 6: goto L_0x01b9;
                case 7: goto L_0x016d;
                case 8: goto L_0x015b;
                case 9: goto L_0x014f;
                case 10: goto L_0x0143;
                default: goto L_0x013e;
            }
        L_0x013e:
            r28.skipValue()
            goto L_0x009a
        L_0x0143:
            int r8 = r28.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.f4792k = r8
            goto L_0x009a
        L_0x014f:
            boolean r8 = r28.nextBoolean()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r1.f4786e = r8
            goto L_0x009a
        L_0x015b:
            java.lang.String r8 = r28.nextString()
            if (r8 == 0) goto L_0x0165
            r1.f4783a = r8
            goto L_0x009a
        L_0x0165:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x016d:
            r28.beginObject()
            r8 = r17
        L_0x0172:
            boolean r13 = r28.hasNext()
            if (r13 == 0) goto L_0x0196
            java.lang.String r13 = r28.nextName()
            r13.getClass()
            boolean r13 = r13.equals(r10)
            if (r13 != 0) goto L_0x0189
            r28.skipValue()
            goto L_0x0172
        L_0x0189:
            java.lang.String r8 = r28.nextString()
            if (r8 == 0) goto L_0x0190
            goto L_0x0172
        L_0x0190:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x0196:
            r28.endObject()
            if (r8 != 0) goto L_0x019e
            r10 = r20
            goto L_0x01a0
        L_0x019e:
            r10 = r16
        L_0x01a0:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x01af
            f7.v r10 = new f7.v
            r10.<init>(r8)
            r1.f4788g = r10
            goto L_0x009a
        L_0x01af:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r10)
            r0.<init>(r1)
            throw r0
        L_0x01b9:
            r28.beginObject()
            r22 = r17
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
        L_0x01c8:
            boolean r8 = r28.hasNext()
            if (r8 == 0) goto L_0x024e
            java.lang.String r8 = r28.nextName()
            r8.getClass()
            int r19 = r8.hashCode()
            switch(r19) {
                case -1618432855: goto L_0x020f;
                case -519438642: goto L_0x0204;
                case 213652010: goto L_0x01f9;
                case 351608024: goto L_0x01f0;
                case 719853845: goto L_0x01e7;
                case 1975623094: goto L_0x01de;
                default: goto L_0x01dc;
            }
        L_0x01dc:
            r8 = -1
            goto L_0x0217
        L_0x01de:
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x01e5
            goto L_0x01dc
        L_0x01e5:
            r8 = r9
            goto L_0x0217
        L_0x01e7:
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x01ee
            goto L_0x01dc
        L_0x01ee:
            r8 = 4
            goto L_0x0217
        L_0x01f0:
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x01f7
            goto L_0x01dc
        L_0x01f7:
            r8 = 3
            goto L_0x0217
        L_0x01f9:
            java.lang.String r14 = "developmentPlatformVersion"
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x0202
            goto L_0x01dc
        L_0x0202:
            r8 = r12
            goto L_0x0217
        L_0x0204:
            java.lang.String r14 = "developmentPlatform"
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x020d
            goto L_0x01dc
        L_0x020d:
            r8 = 1
            goto L_0x0217
        L_0x020f:
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0216
            goto L_0x01dc
        L_0x0216:
            r8 = r15
        L_0x0217:
            switch(r8) {
                case 0: goto L_0x0241;
                case 1: goto L_0x023c;
                case 2: goto L_0x0237;
                case 3: goto L_0x0228;
                case 4: goto L_0x0223;
                case 5: goto L_0x021e;
                default: goto L_0x021a;
            }
        L_0x021a:
            r28.skipValue()
            goto L_0x01c8
        L_0x021e:
            java.lang.String r24 = r28.nextString()
            goto L_0x01c8
        L_0x0223:
            java.lang.String r25 = r28.nextString()
            goto L_0x01c8
        L_0x0228:
            java.lang.String r23 = r28.nextString()
            if (r23 == 0) goto L_0x022f
            goto L_0x01c8
        L_0x022f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x0237:
            java.lang.String r27 = r28.nextString()
            goto L_0x01c8
        L_0x023c:
            java.lang.String r26 = r28.nextString()
            goto L_0x01c8
        L_0x0241:
            java.lang.String r22 = r28.nextString()
            if (r22 == 0) goto L_0x0248
            goto L_0x01c8
        L_0x0248:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x024e:
            r28.endObject()
            if (r22 != 0) goto L_0x0256
            r8 = r20
            goto L_0x0258
        L_0x0256:
            r8 = r16
        L_0x0258:
            if (r23 != 0) goto L_0x0260
            java.lang.String r10 = " version"
            java.lang.String r8 = r8.concat(r10)
        L_0x0260:
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0271
            f7.h r8 = new f7.h
            r21 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r1.f4787f = r8
            goto L_0x009a
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r8)
            r0.<init>(r1)
            throw r0
        L_0x027b:
            f7.u$a r8 = new f7.u$a
            r8.<init>()
            r28.beginObject()
        L_0x0283:
            boolean r10 = r28.hasNext()
            if (r10 == 0) goto L_0x02fb
            java.lang.String r10 = r28.nextName()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -911706486: goto L_0x02b6;
                case -293026577: goto L_0x02ab;
                case 351608024: goto L_0x02a2;
                case 1874684019: goto L_0x0299;
                default: goto L_0x0297;
            }
        L_0x0297:
            r10 = -1
            goto L_0x02be
        L_0x0299:
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x02a0
            goto L_0x0297
        L_0x02a0:
            r10 = 3
            goto L_0x02be
        L_0x02a2:
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x02a9
            goto L_0x0297
        L_0x02a9:
            r10 = r12
            goto L_0x02be
        L_0x02ab:
            java.lang.String r11 = "jailbroken"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x02b4
            goto L_0x0297
        L_0x02b4:
            r10 = 1
            goto L_0x02be
        L_0x02b6:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x02bd
            goto L_0x0297
        L_0x02bd:
            r10 = r15
        L_0x02be:
            switch(r10) {
                case 0: goto L_0x02ec;
                case 1: goto L_0x02e1;
                case 2: goto L_0x02d0;
                case 3: goto L_0x02c5;
                default: goto L_0x02c1;
            }
        L_0x02c1:
            r28.skipValue()
            goto L_0x0283
        L_0x02c5:
            int r10 = r28.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.f4873a = r10
            goto L_0x0283
        L_0x02d0:
            java.lang.String r10 = r28.nextString()
            if (r10 == 0) goto L_0x02d9
            r8.f4874b = r10
            goto L_0x0283
        L_0x02d9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x02e1:
            boolean r10 = r28.nextBoolean()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8.d = r10
            goto L_0x0283
        L_0x02ec:
            java.lang.String r10 = r28.nextString()
            if (r10 == 0) goto L_0x02f5
            r8.f4875c = r10
            goto L_0x0283
        L_0x02f5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x02fb:
            r28.endObject()
            f7.u r8 = r8.a()
            r1.f4789h = r8
            goto L_0x009a
        L_0x0306:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r28.beginArray()
        L_0x030e:
            boolean r10 = r28.hasNext()
            if (r10 == 0) goto L_0x031c
            f7.k r10 = d(r28)
            r8.add(r10)
            goto L_0x030e
        L_0x031c:
            r28.endArray()
            f7.b0 r10 = new f7.b0
            r10.<init>(r8)
            r1.f4791j = r10
            goto L_0x009a
        L_0x0328:
            f7.j$a r8 = new f7.j$a
            r8.<init>()
            r28.beginObject()
        L_0x0330:
            boolean r10 = r28.hasNext()
            if (r10 == 0) goto L_0x0431
            java.lang.String r10 = r28.nextName()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1981332476: goto L_0x03a1;
                case -1969347631: goto L_0x0396;
                case 112670: goto L_0x038b;
                case 3002454: goto L_0x0380;
                case 81784169: goto L_0x0375;
                case 94848180: goto L_0x036a;
                case 104069929: goto L_0x035f;
                case 109757585: goto L_0x0354;
                case 2078953423: goto L_0x0347;
                default: goto L_0x0344;
            }
        L_0x0344:
            r10 = -1
            goto L_0x03ab
        L_0x0347:
            java.lang.String r11 = "modelClass"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0350
            goto L_0x0344
        L_0x0350:
            r10 = r19
            goto L_0x03ab
        L_0x0354:
            java.lang.String r11 = "state"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x035d
            goto L_0x0344
        L_0x035d:
            r10 = 7
            goto L_0x03ab
        L_0x035f:
            java.lang.String r11 = "model"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0368
            goto L_0x0344
        L_0x0368:
            r10 = 6
            goto L_0x03ab
        L_0x036a:
            java.lang.String r11 = "cores"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0373
            goto L_0x0344
        L_0x0373:
            r10 = r9
            goto L_0x03ab
        L_0x0375:
            java.lang.String r11 = "diskSpace"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x037e
            goto L_0x0344
        L_0x037e:
            r10 = 4
            goto L_0x03ab
        L_0x0380:
            java.lang.String r11 = "arch"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0389
            goto L_0x0344
        L_0x0389:
            r10 = 3
            goto L_0x03ab
        L_0x038b:
            java.lang.String r11 = "ram"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0394
            goto L_0x0344
        L_0x0394:
            r10 = r12
            goto L_0x03ab
        L_0x0396:
            java.lang.String r11 = "manufacturer"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x039f
            goto L_0x0344
        L_0x039f:
            r10 = 1
            goto L_0x03ab
        L_0x03a1:
            java.lang.String r11 = "simulator"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x03aa
            goto L_0x0344
        L_0x03aa:
            r10 = r15
        L_0x03ab:
            switch(r10) {
                case 0: goto L_0x0425;
                case 1: goto L_0x0413;
                case 2: goto L_0x0407;
                case 3: goto L_0x03fb;
                case 4: goto L_0x03ef;
                case 5: goto L_0x03e3;
                case 6: goto L_0x03d1;
                case 7: goto L_0x03c5;
                case 8: goto L_0x03b3;
                default: goto L_0x03ae;
            }
        L_0x03ae:
            r28.skipValue()
            goto L_0x0330
        L_0x03b3:
            java.lang.String r10 = r28.nextString()
            if (r10 == 0) goto L_0x03bd
            r8.f4814i = r10
            goto L_0x0330
        L_0x03bd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null modelClass"
            r0.<init>(r1)
            throw r0
        L_0x03c5:
            int r10 = r28.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.f4812g = r10
            goto L_0x0330
        L_0x03d1:
            java.lang.String r10 = r28.nextString()
            if (r10 == 0) goto L_0x03db
            r8.f4808b = r10
            goto L_0x0330
        L_0x03db:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null model"
            r0.<init>(r1)
            throw r0
        L_0x03e3:
            int r10 = r28.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.f4809c = r10
            goto L_0x0330
        L_0x03ef:
            long r10 = r28.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r8.f4810e = r10
            goto L_0x0330
        L_0x03fb:
            int r10 = r28.nextInt()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.f4807a = r10
            goto L_0x0330
        L_0x0407:
            long r10 = r28.nextLong()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r8.d = r10
            goto L_0x0330
        L_0x0413:
            java.lang.String r10 = r28.nextString()
            if (r10 == 0) goto L_0x041d
            r8.f4813h = r10
            goto L_0x0330
        L_0x041d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null manufacturer"
            r0.<init>(r1)
            throw r0
        L_0x0425:
            boolean r10 = r28.nextBoolean()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8.f4811f = r10
            goto L_0x0330
        L_0x0431:
            r28.endObject()
            f7.j r8 = r8.a()
            r1.f4790i = r8
            goto L_0x009a
        L_0x043c:
            long r10 = r28.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r1.d = r8
            goto L_0x009a
        L_0x0448:
            java.lang.String r8 = r28.nextString()
            byte[] r8 = android.util.Base64.decode(r8, r12)
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = f7.a0.f4737a
            r10.<init>(r8, r11)
            r1.f4784b = r10
            goto L_0x009a
        L_0x045b:
            long r10 = r28.nextLong()
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r1.f4785c = r8
            goto L_0x009a
        L_0x0467:
            r28.endObject()
            f7.g r1 = r1.a()
            r0.f4750g = r1
            goto L_0x000a
        L_0x0472:
            java.lang.String r1 = r28.nextString()
            if (r1 == 0) goto L_0x047c
            r0.f4749f = r1
            goto L_0x000a
        L_0x047c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x0484:
            int r1 = r28.nextInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f4747c = r1
            goto L_0x000a
        L_0x0490:
            java.lang.String r1 = r28.nextString()
            if (r1 == 0) goto L_0x049a
            r0.d = r1
            goto L_0x000a
        L_0x049a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x04a2:
            java.lang.String r1 = r28.nextString()
            if (r1 == 0) goto L_0x04ac
            r0.f4746b = r1
            goto L_0x000a
        L_0x04ac:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        L_0x04b4:
            java.lang.String r1 = r28.nextString()
            if (r1 == 0) goto L_0x04be
            r0.f4748e = r1
            goto L_0x000a
        L_0x04be:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x04c4:
            java.lang.String r1 = r28.nextString()
            if (r1 == 0) goto L_0x04ce
            r0.f4745a = r1
            goto L_0x000a
        L_0x04ce:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sdkVersion"
            r0.<init>(r1)
            throw r0
        L_0x04d6:
            r28.beginObject()
            r1 = r17
            r2 = r1
        L_0x04dc:
            boolean r4 = r28.hasNext()
            if (r4 == 0) goto L_0x050e
            java.lang.String r4 = r28.nextName()
            r4.getClass()
            java.lang.String r5 = "files"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0502
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x04fd
            r28.skipValue()
            goto L_0x04dc
        L_0x04fd:
            java.lang.String r2 = r28.nextString()
            goto L_0x04dc
        L_0x0502:
            t3.u r1 = new t3.u
            r1.<init>(r9)
            r4 = r28
            f7.b0 r1 = c(r4, r1)
            goto L_0x04dc
        L_0x050e:
            r4 = r28
            r28.endObject()
            if (r1 != 0) goto L_0x0517
            java.lang.String r16 = " files"
        L_0x0517:
            r5 = r16
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0528
            f7.e r3 = new f7.e
            r3.<init>(r1, r2)
            r0.f4751h = r3
            goto L_0x000a
        L_0x0528:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.concat(r5)
            r0.<init>(r1)
            throw r0
        L_0x0532:
            r4 = r28
            r28.endObject()
            f7.b r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.a.f(android.util.JsonReader):f7.b");
    }

    public static b g(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            b f10 = f(jsonReader);
            jsonReader.close();
            return f10;
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}

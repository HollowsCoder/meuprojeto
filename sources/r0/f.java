package r0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f8344a;

    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f8345a;

        /* renamed from: b  reason: collision with root package name */
        public final d f8346b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8347c = true;

        public a(TextView textView) {
            this.f8345a = textView;
            this.f8346b = new d(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f8347c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                    InputFilter inputFilter = inputFilterArr[i10];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i10, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i13 = 0;
            while (true) {
                d dVar = this.f8346b;
                if (i13 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                } else if (inputFilterArr[i13] == dVar) {
                    return inputFilterArr;
                } else {
                    i13++;
                }
            }
        }

        public final void b(boolean z) {
            if (z) {
                d();
            }
        }

        public final void c(boolean z) {
            this.f8347c = z;
            d();
            TextView textView = this.f8345a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void d() {
            TextView textView = this.f8345a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f8347c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f8354o;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z) {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f8348a;

        public c(TextView textView) {
            this.f8348a = new a(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            boolean z;
            if (e.f1039j != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return inputFilterArr;
            }
            return this.f8348a.a(inputFilterArr);
        }

        public final void b(boolean z) {
            boolean z10;
            if (e.f1039j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                this.f8348a.b(z);
            }
        }

        public final void c(boolean z) {
            boolean z10;
            if (e.f1039j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            a aVar = this.f8348a;
            if (z11) {
                aVar.f8347c = z;
            } else {
                aVar.c(z);
            }
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f8344a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}

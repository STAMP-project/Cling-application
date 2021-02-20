import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray25 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray16 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder8.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder1.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder22.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray32 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder26.append("", shortArray32, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(shortArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = reflectionToStringBuilder1.append("", (short) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray39 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder5 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray6 = reflectionToStringBuilder5.getExcludeFieldNames();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("hi!", 'a');
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.lang.String str20 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder14.append("hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder14.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder24);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder25.append(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray28 = reflectionToStringBuilder25.getExcludeFieldNames();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray13 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        java.lang.String str14 = reflectionToStringBuilder1.toString();
        reflectionToStringBuilder1.setAppendTransients(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray17 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray16 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder8.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = reflectionToStringBuilder1.append("hi!", shortArray16, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder22 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder22.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray32 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder26.append("", shortArray32, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder1.append(shortArray32);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder36 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) shortArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray37 = reflectionToStringBuilder36.getExcludeFieldNames();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray22 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder15.append(booleanArray22);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder23.append("", doubleArray27, false);
        char[] charArray34 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder23.append("", charArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder38.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.lang.String str47 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray46);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = reflectionToStringBuilder38.setExcludeFieldNames(strArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder48.append("hi!", 'a');
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.lang.String str57 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder51.append("hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder23.append("hi!", (java.lang.Object[]) strArray56, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder1.append("hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder64 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder64.append("", 10);
        float[] floatArray71 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = reflectionToStringBuilder64.append(floatArray71);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder1.append("hi!", floatArray71);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = reflectionToStringBuilder1.append(true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder77 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray84 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder85 = reflectionToStringBuilder77.append(booleanArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = reflectionToStringBuilder1.append(booleanArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray87 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = toStringBuilder9.append("", (double) 10.0f);
        int[] intArray19 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder20 = toStringBuilder9.append(intArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = toStringBuilder9.append(true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = toStringBuilder22.append((double) 1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder26 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray33 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = reflectionToStringBuilder26.append(booleanArray33);
        double[] doubleArray38 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder34.append("", doubleArray38, false);
        char[] charArray45 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder34.append("", charArray45);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = toStringBuilder22.append(charArray45);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder49 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray57 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder59 = reflectionToStringBuilder49.append("hi!", doubleArray57, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = reflectionToStringBuilder49.append("hi!", (float) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder22.appendAsObjectToString((java.lang.Object) reflectionToStringBuilder49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray64 = reflectionToStringBuilder49.getExcludeFieldNames();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray22 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder15.append(booleanArray22);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder23.append("", doubleArray27, false);
        char[] charArray34 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder23.append("", charArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder38.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.lang.String str47 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray46);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = reflectionToStringBuilder38.setExcludeFieldNames(strArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder48.append("hi!", 'a');
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.lang.String str57 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder51.append("hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder23.append("hi!", (java.lang.Object[]) strArray56, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder1.append("hi!", (java.lang.Object[]) strArray56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray62 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray21 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(booleanArray21);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder22.append("", doubleArray26, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder22.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray41 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder34.append(booleanArray41);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder42.append("", doubleArray46, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder22.append("", doubleArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder1.append("", doubleArray46);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder53.append("", 10);
        double[] doubleArray63 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder53.append("", doubleArray63);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = reflectionToStringBuilder1.append("", doubleArray63);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder66 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray67 = reflectionToStringBuilder66.getExcludeFieldNames();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", false);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append((short) (byte) 100);
        java.lang.Class<?> wildcardClass20 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder23 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder23.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!" };
        java.lang.String str32 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray31);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = reflectionToStringBuilder23.setExcludeFieldNames(strArray31);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder35 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = reflectionToStringBuilder35.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "hi!" };
        java.lang.String str44 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray43);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder45 = reflectionToStringBuilder35.setExcludeFieldNames(strArray43);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = reflectionToStringBuilder45.append("hi!", 'a');
        java.lang.String[] strArray53 = new java.lang.String[] { "", "hi!" };
        java.lang.String str54 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray53);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder48.append("hi!", (java.lang.Object[]) strArray53);
        java.lang.String str56 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) reflectionToStringBuilder23, strArray53);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder57 = reflectionToStringBuilder1.append("", (java.lang.Object[]) strArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray58 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder15.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.String str24 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray23);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = reflectionToStringBuilder15.setExcludeFieldNames(strArray23);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray35 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder28.append(booleanArray35);
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = toStringBuilder36.append("", doubleArray40, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = toStringBuilder36.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray55 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder48.append(booleanArray55);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = toStringBuilder56.append("", doubleArray60, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder36.append("", doubleArray60);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder15.append("", doubleArray60);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder66 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder66.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!" };
        java.lang.String str75 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray74);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder76 = reflectionToStringBuilder66.setExcludeFieldNames(strArray74);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder15.append((java.lang.Object[]) strArray74);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = reflectionToStringBuilder1.append((java.lang.Object[]) strArray74);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder81 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray88 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder89 = reflectionToStringBuilder81.append(booleanArray88);
        float[] floatArray91 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder92 = reflectionToStringBuilder81.append("hi!", floatArray91);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder94 = reflectionToStringBuilder81.append('4');
        long[] longArray96 = new long[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder97 = toStringBuilder94.append("hi!", longArray96);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder98 = reflectionToStringBuilder1.append("", longArray96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray99 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        java.lang.Class<?> wildcardClass13 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray16 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray23 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder25 = reflectionToStringBuilder15.append("hi!", shortArray23, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder32 = reflectionToStringBuilder28.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.lang.String str37 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray36);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = reflectionToStringBuilder28.setExcludeFieldNames(strArray36);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder41 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray48 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder41.append(booleanArray48);
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder49.append("", doubleArray53, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder49.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder61 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray68 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder69 = reflectionToStringBuilder61.append(booleanArray68);
        double[] doubleArray73 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = toStringBuilder69.append("", doubleArray73, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = toStringBuilder49.append("", doubleArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder28.append("", doubleArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = toStringBuilder25.append("", (java.lang.Object) doubleArray73);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = reflectionToStringBuilder1.append("hi!", doubleArray73, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder82 = reflectionToStringBuilder1.append(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray83 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("hi!", 'a');
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.lang.String str20 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder14.append("hi!", (java.lang.Object[]) strArray19);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = toStringBuilder21.append((int) (short) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray32 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder25.append(booleanArray32);
        double[] doubleArray37 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder33.append("", doubleArray37, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = toStringBuilder33.append("", (double) 10.0f);
        int[] intArray43 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder33.append(intArray43);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder33.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle47 = toStringBuilder46.getStyle();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder23, toStringStyle47);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder48.append("<null>", (double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray52 = reflectionToStringBuilder48.getExcludeFieldNames();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder4 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray11 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder4.append(booleanArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append("", booleanArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder15.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!" };
        java.lang.String str24 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray23);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder25 = reflectionToStringBuilder15.setExcludeFieldNames(strArray23);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray35 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = reflectionToStringBuilder28.append(booleanArray35);
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = toStringBuilder36.append("", doubleArray40, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = toStringBuilder36.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray55 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder48.append(booleanArray55);
        double[] doubleArray60 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder62 = toStringBuilder56.append("", doubleArray60, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder36.append("", doubleArray60);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder15.append("", doubleArray60);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder66 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder70 = reflectionToStringBuilder66.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!" };
        java.lang.String str75 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray74);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder76 = reflectionToStringBuilder66.setExcludeFieldNames(strArray74);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder77 = reflectionToStringBuilder15.append((java.lang.Object[]) strArray74);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder78 = reflectionToStringBuilder1.append((java.lang.Object[]) strArray74);
        boolean boolean79 = reflectionToStringBuilder1.isAppendTransients();
        java.lang.Class<?> wildcardClass80 = reflectionToStringBuilder1.getUpToClass();
        java.lang.String str81 = reflectionToStringBuilder1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray82 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.append('4');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append((byte) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray25 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder26 = reflectionToStringBuilder18.append(booleanArray25);
        float[] floatArray28 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = reflectionToStringBuilder18.append("hi!", floatArray28);
        java.lang.String str30 = org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString((java.lang.Object) floatArray28);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder1.append("", floatArray28);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder33 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray40 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = reflectionToStringBuilder33.append(booleanArray40);
        double[] doubleArray45 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = toStringBuilder41.append("", doubleArray45, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = toStringBuilder41.append("", (double) 10.0f);
        java.lang.String str51 = toStringBuilder50.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder57 = reflectionToStringBuilder53.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!" };
        java.lang.String str62 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray61);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder63 = reflectionToStringBuilder53.setExcludeFieldNames(strArray61);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder63.append("hi!", 'a');
        java.lang.String[] strArray71 = new java.lang.String[] { "", "hi!" };
        java.lang.String str72 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray71);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = toStringBuilder66.append("hi!", (java.lang.Object[]) strArray71);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder76 = toStringBuilder66.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder79 = toStringBuilder76.append("hi!", (float) (byte) 10);
        long[] longArray84 = new long[] { 0, 1L, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder86 = toStringBuilder79.append("", longArray84, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder87 = toStringBuilder50.append(longArray84);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = reflectionToStringBuilder1.append(longArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray89 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", (double) (short) 0);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray26 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder18.append("hi!", doubleArray26, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder15.append("hi!", doubleArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder15.append((short) 1);
        java.lang.String str32 = toStringBuilder15.build();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder35 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray43 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder45 = reflectionToStringBuilder35.append("hi!", shortArray43, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder47 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder47.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder54 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray62 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder54.append("hi!", shortArray62, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder66 = reflectionToStringBuilder47.append("hi!", shortArray62, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder68 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = reflectionToStringBuilder68.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray76 = new java.lang.String[] { "", "hi!" };
        java.lang.String str77 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray76);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder78 = reflectionToStringBuilder68.setExcludeFieldNames(strArray76);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = reflectionToStringBuilder78.append("hi!", 'a');
        java.lang.String[] strArray86 = new java.lang.String[] { "", "hi!" };
        java.lang.String str87 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray86);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder88 = toStringBuilder81.append("hi!", (java.lang.Object[]) strArray86);
        java.lang.String str89 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) shortArray62, strArray86);
        java.lang.String str90 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "hi!", strArray86);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder91 = toStringBuilder15.append("<null>", (java.lang.Object[]) strArray86);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder92 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder15);
        java.lang.String str93 = reflectionToStringBuilder92.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray94 = reflectionToStringBuilder92.getExcludeFieldNames();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder3 = reflectionToStringBuilder1.append(true);
        java.lang.StringBuffer stringBuffer4 = reflectionToStringBuilder1.getStringBuffer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray5 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray21 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(booleanArray21);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = toStringBuilder22.append("", doubleArray26, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = toStringBuilder22.append("", (double) 10.0f);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray41 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder34.append(booleanArray41);
        double[] doubleArray46 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder42.append("", doubleArray46, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = toStringBuilder22.append("", doubleArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder1.append("", doubleArray46);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder53.append("", 10);
        double[] doubleArray63 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder53.append("", doubleArray63);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder65 = reflectionToStringBuilder1.append("", doubleArray63);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder68 = toStringBuilder65.append("", ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder69 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) "");
        java.lang.Class<?> wildcardClass70 = reflectionToStringBuilder69.getUpToClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray71 = reflectionToStringBuilder69.getExcludeFieldNames();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder4 = reflectionToStringBuilder1.append("", 10);
        double[] doubleArray11 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("", doubleArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder18 = reflectionToStringBuilder14.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.lang.String str23 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray22);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = reflectionToStringBuilder14.setExcludeFieldNames(strArray22);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder24.append("hi!", 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.lang.String str33 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = toStringBuilder27.append("hi!", (java.lang.Object[]) strArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder27.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder40 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray48 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = reflectionToStringBuilder40.append("hi!", shortArray48, true);
        byte[] byteArray52 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder40.append("", byteArray52, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder57 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray65 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder57.append("hi!", shortArray65, true);
        byte[] byteArray69 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder71 = reflectionToStringBuilder57.append("", byteArray69, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = reflectionToStringBuilder40.append("hi!", byteArray69);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder74 = toStringBuilder27.append("hi!", byteArray69, false);
        long[] longArray79 = new long[] { ' ', (short) 100, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder80 = toStringBuilder27.append("hi!", longArray79);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder81 = reflectionToStringBuilder1.append(longArray79);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder84 = toStringBuilder81.append("hi!", (byte) -1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder85 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray86 = reflectionToStringBuilder85.getExcludeFieldNames();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        java.lang.Class<?> wildcardClass25 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder1.append((double) ' ');
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder30 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder34 = reflectionToStringBuilder30.append("", (java.lang.Object) 1.0d, false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder37 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray45 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder47 = reflectionToStringBuilder37.append("hi!", shortArray45, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder49 = reflectionToStringBuilder30.append("hi!", shortArray45, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder51 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = reflectionToStringBuilder51.append("", (java.lang.Object) 1.0d, false);
        short[] shortArray61 = new short[] { (byte) 10, (short) 1, (short) 10, (short) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder63 = toStringBuilder55.append("", shortArray61, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder64 = reflectionToStringBuilder30.append(shortArray61);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder65 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) shortArray61);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder1.append("", shortArray61, false);
        reflectionToStringBuilder1.setAppendStatics(false);
        boolean boolean70 = reflectionToStringBuilder1.isAppendTransients();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray71 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("hi!", false);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append((short) (byte) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder21 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray29 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder21.append("hi!", shortArray29, true);
        byte[] byteArray33 = new byte[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder21.append("", byteArray33, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = toStringBuilder35.append((double) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder35.append("<null>", (short) 100);
        java.lang.Object obj41 = toStringBuilder40.getObject();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder1.appendAsObjectToString(obj41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray43 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder13 = reflectionToStringBuilder1.appendToString("<null>");
        java.lang.Class<?> wildcardClass14 = reflectionToStringBuilder1.getUpToClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray15 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = reflectionToStringBuilder1.append("<null>", true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder1.append(1L);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder19 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray26 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder19.append(booleanArray26);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = toStringBuilder27.append("", doubleArray31, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder36 = toStringBuilder27.append("", (double) 10.0f);
        int[] intArray37 = new int[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder27.append(intArray37);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder40 = toStringBuilder27.append(true);
        org.apache.commons.lang3.builder.ToStringStyle toStringStyle41 = toStringBuilder40.getStyle();
        java.lang.String str43 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString((java.lang.Object) reflectionToStringBuilder1, toStringStyle41, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray44 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        float[] floatArray11 = new float[] {};
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder12 = reflectionToStringBuilder1.append("hi!", floatArray11);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder15 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray22 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder23 = reflectionToStringBuilder15.append(booleanArray22);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder29 = toStringBuilder23.append("", doubleArray27, false);
        char[] charArray34 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = toStringBuilder23.append("", charArray34);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder38 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = reflectionToStringBuilder38.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!" };
        java.lang.String str47 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray46);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder48 = reflectionToStringBuilder38.setExcludeFieldNames(strArray46);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = reflectionToStringBuilder48.append("hi!", 'a');
        java.lang.String[] strArray56 = new java.lang.String[] { "", "hi!" };
        java.lang.String str57 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder58 = toStringBuilder51.append("hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder60 = toStringBuilder23.append("hi!", (java.lang.Object[]) strArray56, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder61 = reflectionToStringBuilder1.append("hi!", (java.lang.Object[]) strArray56);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder64 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder67 = reflectionToStringBuilder64.append("", 10);
        float[] floatArray71 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder72 = reflectionToStringBuilder64.append(floatArray71);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder73 = reflectionToStringBuilder1.append("hi!", floatArray71);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder75 = reflectionToStringBuilder1.append(true);
        boolean boolean76 = reflectionToStringBuilder1.isAppendStatics();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray77 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append("hi!", (float) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder1.append((byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append("<null>", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray20 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append("hi!", (float) (byte) 0);
        java.lang.Class<?> wildcardClass15 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder18 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder18.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.lang.String str27 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray26);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder28 = reflectionToStringBuilder18.setExcludeFieldNames(strArray26);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder31 = reflectionToStringBuilder28.append("hi!", 'a');
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.lang.String str37 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray36);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder38 = toStringBuilder31.append("hi!", (java.lang.Object[]) strArray36);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder41 = toStringBuilder31.append("", (float) (byte) 100);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder41.append("hi!", (float) (byte) 10);
        long[] longArray49 = new long[] { 0, 1L, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder51 = toStringBuilder44.append("", longArray49, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = reflectionToStringBuilder1.append("", longArray49);
        reflectionToStringBuilder1.setAppendStatics(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray55 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray8 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder9 = reflectionToStringBuilder1.append(booleanArray8);
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder15 = toStringBuilder9.append("", doubleArray13, false);
        char[] charArray20 = new char[] { '4', '#', '4' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder21 = toStringBuilder9.append("", charArray20);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder24.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!" };
        java.lang.String str33 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray32);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder34 = reflectionToStringBuilder24.setExcludeFieldNames(strArray32);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder37 = reflectionToStringBuilder34.append("hi!", 'a');
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!" };
        java.lang.String str43 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder44 = toStringBuilder37.append("hi!", (java.lang.Object[]) strArray42);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder46 = toStringBuilder9.append("hi!", (java.lang.Object[]) strArray42, false);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder48 = toStringBuilder46.append((double) (short) -1);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder50 = toStringBuilder46.appendAsObjectToString((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder52 = toStringBuilder46.appendSuper("");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder53 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder52);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = reflectionToStringBuilder53.append(10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray56 = reflectionToStringBuilder53.getExcludeFieldNames();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder14 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = reflectionToStringBuilder14.append("", 10);
        float[] floatArray21 = new float[] { 100, 1, (byte) 100 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder22 = reflectionToStringBuilder14.append(floatArray21);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder24 = reflectionToStringBuilder1.append("", floatArray21, true);
        java.lang.Class<?> wildcardClass25 = reflectionToStringBuilder1.getUpToClass();
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder1.append("hi!", (int) (short) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = reflectionToStringBuilder1.append((float) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder33 = reflectionToStringBuilder1.append("", '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray34 = reflectionToStringBuilder1.getExcludeFieldNames();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder5 = reflectionToStringBuilder1.append("", (java.lang.Object) 1.0d, false);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toStringExclude((java.lang.Object) "", strArray9);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder11 = reflectionToStringBuilder1.setExcludeFieldNames(strArray9);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder11.append("hi!", 'a');
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder17 = toStringBuilder14.append("hi!", (float) 1);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder20 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        boolean[] booleanArray27 = new boolean[] { true, true, true, true, false, true };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder28 = reflectionToStringBuilder20.append(booleanArray27);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder30 = toStringBuilder14.append("", booleanArray27, true);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder31 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) toStringBuilder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray32 = reflectionToStringBuilder31.getExcludeFieldNames();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder1 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        double[] doubleArray9 = new double[] { (byte) 1, 10, 0.0f, 1L, 10.0f, ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder11 = reflectionToStringBuilder1.append("hi!", doubleArray9, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder14 = reflectionToStringBuilder1.append("hi!", (float) (byte) 0);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder16 = reflectionToStringBuilder1.append((byte) 10);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder19 = reflectionToStringBuilder1.append("<null>", true);
        reflectionToStringBuilder1.setAppendTransients(false);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder24 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder27 = reflectionToStringBuilder24.append("", 10);
        double[] doubleArray34 = new double[] { (short) 100, 0, 1.0f, '4', 0L };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder35 = reflectionToStringBuilder24.append("", doubleArray34);
        char[] charArray38 = new char[] { ' ' };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder39 = toStringBuilder35.append("", charArray38);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder42 = toStringBuilder35.append("", (short) 100);
        org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionToStringBuilder44 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder((java.lang.Object) 100.0f);
        short[] shortArray52 = new short[] { (short) 1, (short) 100, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder54 = reflectionToStringBuilder44.append("hi!", shortArray52, true);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder55 = toStringBuilder35.append(shortArray52);
        org.apache.commons.lang3.builder.ToStringBuilder toStringBuilder56 = reflectionToStringBuilder1.append("", shortArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray57 = reflectionToStringBuilder1.getExcludeFieldNames();
    }
}


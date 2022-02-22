import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type0.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type18.getInternalName();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 193);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) 151);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 100);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) 151);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = type16.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type5, type8, type9, type13, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type0.getDimensions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type0.getDimensions();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type0.getElementType();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type0.getDimensions();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException6 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException8 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException6.addSuppressed((java.lang.Throwable) analyzerException8);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException6);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException10);
        boolean boolean12 = type0.equals((java.lang.Object) analyzerException11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type0.getElementType();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = type6.getDimensions();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.getClassName();
        int int24 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.tree.analysis.Value value33 = simpleVerifier30.newValue(type31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = type31.getInternalName();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type0.getInternalName();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        int int35 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type0.getElementType();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type18.getInternalName();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.getClassName();
        int int24 = type0.getSort();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException27 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException28 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException27);
        java.lang.Class<?> wildcardClass29 = analyzerException28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        boolean boolean31 = type0.equals((java.lang.Object) str30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type0.getElementType();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type18.getSort();
        java.lang.String str24 = type18.getDescriptor();
        boolean boolean26 = type18.equals((java.lang.Object) 179);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type18.getInternalName();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        java.lang.String str18 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type0.getElementType();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        int int23 = type10.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type10.getElementType();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException37 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException38 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException37);
        java.lang.Throwable[] throwableArray39 = analyzerException38.getSuppressed();
        boolean boolean40 = type0.equals((java.lang.Object) analyzerException38);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException42 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        java.lang.Throwable[] throwableArray43 = analyzerException42.getSuppressed();
        boolean boolean44 = type0.equals((java.lang.Object) analyzerException42);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException47 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException48 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException47);
        java.lang.Class<?> wildcardClass49 = analyzerException48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        boolean boolean53 = type0.equals((java.lang.Object) str52);
        java.lang.String str54 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type0.getDimensions();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("float");
        java.lang.String str9 = type8.getDescriptor();
        int int10 = type8.getSort();
        int int11 = type8.getSize();
        java.lang.String str12 = type8.getClassName();
        int int13 = type8.getSize();
        boolean boolean14 = type0.equals((java.lang.Object) int13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type0.getElementType();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B: expected null, but found .");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException6 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException8 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException6.addSuppressed((java.lang.Throwable) analyzerException8);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException6);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException10);
        boolean boolean12 = type0.equals((java.lang.Object) analyzerException11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        java.lang.String str9 = type6.getClassName();
        int int11 = type6.getOpcode(138);
        int int12 = type6.getSize();
        boolean boolean14 = type6.equals((java.lang.Object) 154);
        java.lang.String str15 = type6.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type5, type6, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier0.newValue(type6);
        java.lang.String str19 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type6.getElementType();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        int int24 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type0.getInternalName();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.toString();
        int int25 = type0.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        int int28 = type26.getOpcode(101);
        int int30 = type26.getOpcode(191);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier32 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type26, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type26.getInternalName();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 151);
        java.lang.String str5 = type2.getClassName();
        int int7 = type2.getOpcode(138);
        int int8 = type2.getSize();
        boolean boolean10 = type2.equals((java.lang.Object) 154);
        java.lang.String str11 = type2.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier13 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type2.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type[] typeArray32 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)B");
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = type0.getInternalName();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type0.getDimensions();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.tree.analysis.Value value33 = simpleVerifier30.newValue(type31);
        int int34 = type31.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = type31.getInternalName();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type[] typeArray32 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)B");
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type0.getDimensions();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type0.getElementType();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.tree.analysis.Value value24 = simpleVerifier22.newValue(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type23.getInternalName();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        java.lang.String str9 = type6.getClassName();
        int int11 = type6.getOpcode(138);
        int int12 = type6.getSize();
        boolean boolean14 = type6.equals((java.lang.Object) 154);
        java.lang.String str15 = type6.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type5, type6, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier0.newValue(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type6.getInternalName();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type6.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        boolean boolean15 = type10.equals((java.lang.Object) 177);
        java.lang.String str16 = type10.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException19 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException19);
        java.lang.Class<?> wildcardClass21 = analyzerException19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        int int24 = type22.getOpcode(114);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 151);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 100);
        java.lang.String str33 = type30.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 151);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) (byte) 100);
        java.lang.String str40 = type37.getClassName();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type30, type34, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray41);
        boolean boolean44 = type10.equals((java.lang.Object) typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type0.getElementType();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) 151);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 100);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) 151);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = type16.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type5, type8, type9, type13, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException25 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException26 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException25);
        java.lang.Class<?> wildcardClass27 = analyzerException25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier32 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type30, true);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("LB;");
        org.mockito.asm.tree.analysis.Value value35 = simpleVerifier32.newValue(type34);
        int int37 = type34.getOpcode(81);
        org.mockito.asm.Type type38 = type34.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type38.getDimensions();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.tree.analysis.Value value24 = simpleVerifier22.newValue(type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = simpleVerifier22.newValue(type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type25.getDimensions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(116);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        java.lang.String str35 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type0.getElementType();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        java.lang.String str35 = type0.getClassName();
        int int36 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type0.getDimensions();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        int int5 = type0.getOpcode(96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.tree.analysis.Value value14 = simpleVerifier5.newValue(type10);
        int int15 = type10.getSize();
        int int17 = type10.getOpcode(114);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type10.getInternalName();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException12 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException10.addSuppressed((java.lang.Throwable) analyzerException12);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException10);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException18 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException18.addSuppressed((java.lang.Throwable) analyzerException20);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException22 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException18);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException23 = new org.mockito.asm.tree.analysis.AnalyzerException("(CBFCF)B", (java.lang.Throwable) analyzerException18);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException30 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException32 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException30.addSuppressed((java.lang.Throwable) analyzerException32);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException34 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException30);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException35 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException34);
        boolean boolean36 = type24.equals((java.lang.Object) analyzerException35);
        analyzerException23.addSuppressed((java.lang.Throwable) analyzerException35);
        analyzerException10.addSuppressed((java.lang.Throwable) analyzerException23);
        boolean boolean39 = type0.equals((java.lang.Object) analyzerException23);
        java.lang.String str40 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = type0.getInternalName();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException12 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException10.addSuppressed((java.lang.Throwable) analyzerException12);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException10);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException18 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException18.addSuppressed((java.lang.Throwable) analyzerException20);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException22 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException18);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException23 = new org.mockito.asm.tree.analysis.AnalyzerException("(CBFCF)B", (java.lang.Throwable) analyzerException18);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException30 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException32 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException30.addSuppressed((java.lang.Throwable) analyzerException32);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException34 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException30);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException35 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException34);
        boolean boolean36 = type24.equals((java.lang.Object) analyzerException35);
        analyzerException23.addSuppressed((java.lang.Throwable) analyzerException35);
        analyzerException10.addSuppressed((java.lang.Throwable) analyzerException23);
        boolean boolean39 = type0.equals((java.lang.Object) analyzerException23);
        java.lang.String str40 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type0.getDimensions();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.toString();
        java.lang.String str6 = type0.toString();
        java.lang.String str7 = type0.getClassName();
        int int8 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Lhi!;");
        org.mockito.asm.Type type2 = type1.getElementType();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type3, type4, true);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value12 = simpleVerifier8.newValue(type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 100);
        java.lang.String str16 = type13.getClassName();
        org.mockito.asm.tree.analysis.Value value17 = simpleVerifier8.newValue(type13);
        int int18 = type13.getSize();
        int int20 = type13.getOpcode(114);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type13, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type13.getElementType();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.getClassName();
        int int24 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type0.getInternalName();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.toString();
        int int25 = type0.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        int int28 = type26.getOpcode(101);
        int int30 = type26.getOpcode(191);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier32 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type26, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type26.getElementType();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(CBFCF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type2, type5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type2.getInternalName();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        java.lang.String str9 = type6.getClassName();
        int int11 = type6.getOpcode(138);
        int int12 = type6.getSize();
        boolean boolean14 = type6.equals((java.lang.Object) 154);
        java.lang.String str15 = type6.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type5, type6, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier0.newValue(type6);
        java.lang.String str19 = type6.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("J");
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) 193);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) 151);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) 151);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 100);
        java.lang.String str39 = type36.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean42 = type40.equals((java.lang.Object) 151);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) (byte) 100);
        java.lang.String str46 = type43.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type32, type35, type36, type40, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray47);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray47);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray47);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray47);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type6.getDimensions();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type18.getSort();
        java.lang.String str24 = type18.getDescriptor();
        boolean boolean26 = type18.equals((java.lang.Object) 179);
        java.lang.String str27 = type18.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type18.getElementType();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException6 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException8 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException6.addSuppressed((java.lang.Throwable) analyzerException8);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException6);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException10);
        boolean boolean12 = type0.equals((java.lang.Object) analyzerException11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type0.getElementType();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSize();
        int int6 = type0.getOpcode(148);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) 151);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 100);
        java.lang.String str22 = type19.getClassName();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type8, type11, type12, type16, type19 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type0.getDimensions();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        java.lang.String str31 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type0.getInternalName();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        boolean boolean10 = type5.equals((java.lang.Object) 177);
        java.lang.String str11 = type5.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException15 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException14);
        java.lang.Class<?> wildcardClass16 = analyzerException14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        int int19 = type17.getOpcode(114);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) 151);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 100);
        java.lang.String str28 = type25.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) 151);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) (byte) 100);
        java.lang.String str35 = type32.getClassName();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type21, type24, type25, type29, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray36);
        boolean boolean39 = type5.equals((java.lang.Object) typeArray36);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type1.getElementType();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getClassName();
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type6.getInternalName();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type18.getSort();
        java.lang.String str24 = type18.getDescriptor();
        boolean boolean26 = type18.equals((java.lang.Object) 179);
        int int27 = type18.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type18.getDimensions();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier16 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type10, true);
        java.lang.String str17 = type10.getDescriptor();
        int int19 = type10.getOpcode(151);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type10.getInternalName();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier16 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type10, true);
        java.lang.String str17 = type10.getDescriptor();
        int int19 = type10.getOpcode(151);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type10.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = type4.getClassName();
        boolean boolean9 = type4.equals((java.lang.Object) 177);
        java.lang.String str10 = type4.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException13 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException13);
        java.lang.Class<?> wildcardClass15 = analyzerException13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        int int18 = type16.getOpcode(114);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) 151);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 100);
        java.lang.String str27 = type24.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean30 = type28.equals((java.lang.Object) 151);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (byte) 100);
        java.lang.String str34 = type31.getClassName();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type20, type23, type24, type28, type31 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray35);
        boolean boolean38 = type4.equals((java.lang.Object) typeArray35);
        int int39 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value40 = simpleVerifier0.newValue(type4);
        int int41 = type4.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type4.getInternalName();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("(CBFCF)C");
        org.mockito.asm.tree.analysis.Value value22 = simpleVerifier5.newValue(type21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type21.getInternalName();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type6.getElementType();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(48);
        java.lang.String str7 = type4.getClassName();
        java.lang.String str8 = type4.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier9 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value13 = simpleVerifier9.newValue(type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) (byte) 100);
        java.lang.String str17 = type14.getClassName();
        boolean boolean19 = type14.equals((java.lang.Object) 177);
        java.lang.String str20 = type14.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException23 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException24 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException23);
        java.lang.Class<?> wildcardClass25 = analyzerException23.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        int int28 = type26.getOpcode(114);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) 151);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) (byte) 100);
        java.lang.String str37 = type34.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) 151);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean43 = type41.equals((java.lang.Object) (byte) 100);
        java.lang.String str44 = type41.getClassName();
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type30, type33, type34, type38, type41 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray45);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray45);
        boolean boolean48 = type14.equals((java.lang.Object) typeArray45);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray45);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray45);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type52 = type0.getElementType();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException12 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException10.addSuppressed((java.lang.Throwable) analyzerException12);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException10);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException18 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException18.addSuppressed((java.lang.Throwable) analyzerException20);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException22 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException18);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException23 = new org.mockito.asm.tree.analysis.AnalyzerException("(CBFCF)B", (java.lang.Throwable) analyzerException18);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException30 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException32 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException30.addSuppressed((java.lang.Throwable) analyzerException32);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException34 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException30);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException35 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException34);
        boolean boolean36 = type24.equals((java.lang.Object) analyzerException35);
        analyzerException23.addSuppressed((java.lang.Throwable) analyzerException35);
        analyzerException10.addSuppressed((java.lang.Throwable) analyzerException23);
        boolean boolean39 = type0.equals((java.lang.Object) analyzerException23);
        java.lang.String str40 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type0.getDimensions();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) 151);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 100);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) 151);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = type16.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type5, type8, type9, type13, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException25 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException26 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException25);
        java.lang.Class<?> wildcardClass27 = analyzerException25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier32 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type30, true);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("LB;");
        org.mockito.asm.tree.analysis.Value value35 = simpleVerifier32.newValue(type34);
        int int37 = type34.getOpcode(81);
        org.mockito.asm.Type type38 = type34.getElementType();
        int int39 = type38.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type38.getDimensions();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.toString();
        java.lang.String str6 = type0.toString();
        java.lang.String str7 = type0.getClassName();
        int int8 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type0.getDescriptor();
        int int7 = type0.getSort();
        java.lang.String str8 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        int int35 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type0.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 151);
        java.lang.String str5 = type2.getClassName();
        int int7 = type2.getOpcode(138);
        int int8 = type2.getSize();
        boolean boolean10 = type2.equals((java.lang.Object) 154);
        java.lang.String str11 = type2.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier13 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        java.lang.String str14 = type2.getClassName();
        java.lang.String str15 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type2.getInternalName();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException8 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException8);
        java.lang.Class<?> wildcardClass10 = analyzerException8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        boolean boolean12 = type0.equals((java.lang.Object) wildcardClass10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 193);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) 151);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) (byte) 100);
        java.lang.String str17 = type14.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) (byte) 100);
        java.lang.String str24 = type21.getClassName();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type10, type13, type14, type18, type21 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray25);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type0.getInternalName();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type[] typeArray32 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)B");
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type0.getElementType();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type6.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        boolean boolean15 = type10.equals((java.lang.Object) 177);
        java.lang.String str16 = type10.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException19 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException19);
        java.lang.Class<?> wildcardClass21 = analyzerException19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        int int24 = type22.getOpcode(114);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 151);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 100);
        java.lang.String str33 = type30.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 151);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) (byte) 100);
        java.lang.String str40 = type37.getClassName();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type30, type34, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray41);
        boolean boolean44 = type10.equals((java.lang.Object) typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        int int48 = type0.getOpcode(88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = type0.getInternalName();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        int int7 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSort();
        java.lang.String str7 = type0.toString();
        java.lang.String str8 = type0.toString();
        java.lang.String str9 = type0.toString();
        int int10 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B: expected null, but found .");
        int int3 = type1.getOpcode(113);
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        int int33 = type31.getOpcode(101);
        int int35 = type31.getOpcode(191);
        org.mockito.asm.tree.analysis.Value value36 = simpleVerifier30.newValue(type31);
        int int37 = type31.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = type31.getInternalName();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        java.lang.String str19 = type0.toString();
        int int21 = type0.getOpcode(9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        int int24 = type0.getSort();
        java.lang.String str25 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type0.getInternalName();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/tree/analysis/SimpleVerifier;");
        int int2 = type1.getSort();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type4, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type4.getElementType();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        int int7 = type0.getSort();
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type6.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        boolean boolean15 = type10.equals((java.lang.Object) 177);
        java.lang.String str16 = type10.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException19 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException19);
        java.lang.Class<?> wildcardClass21 = analyzerException19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        int int24 = type22.getOpcode(114);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 151);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 100);
        java.lang.String str33 = type30.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 151);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) (byte) 100);
        java.lang.String str40 = type37.getClassName();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type30, type34, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray41);
        boolean boolean44 = type10.equals((java.lang.Object) typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        int int48 = type0.getOpcode(88);
        int int49 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type0.getElementType();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        int int7 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("double");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(116);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        int int6 = type5.getSize();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type5, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type0.getDescriptor();
        int int7 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int6 = type0.getSize();
        java.lang.String str7 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(CBFCF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type2, type5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type5.getInternalName();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        int int32 = type0.getOpcode(171);
        int int33 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type0.getDimensions();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        int int24 = type0.getSort();
        java.lang.String str25 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException30 = new org.mockito.asm.tree.analysis.AnalyzerException("org/mockito/asm/tree/analysis/BasicInterpreter");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException31 = new org.mockito.asm.tree.analysis.AnalyzerException("S", (java.lang.Throwable) analyzerException30);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException32 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException", (java.lang.Throwable) analyzerException31);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException33 = new org.mockito.asm.tree.analysis.AnalyzerException("Lorg/mockito/asm/Type;", (java.lang.Throwable) analyzerException32);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException37 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException39 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException37.addSuppressed((java.lang.Throwable) analyzerException39);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException44 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException46 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException44.addSuppressed((java.lang.Throwable) analyzerException46);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException48 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException44);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException49 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException48);
        analyzerException39.addSuppressed((java.lang.Throwable) analyzerException48);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException55 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException57 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException55.addSuppressed((java.lang.Throwable) analyzerException57);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException59 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException55);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException60 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException59);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException61 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException60);
        analyzerException48.addSuppressed((java.lang.Throwable) analyzerException60);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException63 = new org.mockito.asm.tree.analysis.AnalyzerException("LB;", (java.lang.Throwable) analyzerException48);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException64 = new org.mockito.asm.tree.analysis.AnalyzerException("void", (java.lang.Throwable) analyzerException48);
        analyzerException33.addSuppressed((java.lang.Throwable) analyzerException48);
        boolean boolean66 = type0.equals((java.lang.Object) analyzerException33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type67 = type0.getElementType();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type0.getDimensions();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) 151);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 100);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) 151);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = type16.getClassName();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type5, type8, type9, type13, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException25 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException26 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException25);
        java.lang.Class<?> wildcardClass27 = analyzerException25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier32 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type30, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type0.getElementType();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(0);
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.tree.analysis.Value value33 = simpleVerifier30.newValue(type31);
        java.lang.String str34 = type31.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type31.getDimensions();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getDescriptor();
        java.lang.String str7 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type1.getInternalName();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException6 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException8 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException6.addSuppressed((java.lang.Throwable) analyzerException8);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException6);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException10);
        boolean boolean12 = type0.equals((java.lang.Object) analyzerException11);
        java.lang.String str13 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type0.getElementType();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        int int24 = type0.getSort();
        java.lang.String str25 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException30 = new org.mockito.asm.tree.analysis.AnalyzerException("org/mockito/asm/tree/analysis/BasicInterpreter");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException31 = new org.mockito.asm.tree.analysis.AnalyzerException("S", (java.lang.Throwable) analyzerException30);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException32 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException", (java.lang.Throwable) analyzerException31);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException33 = new org.mockito.asm.tree.analysis.AnalyzerException("Lorg/mockito/asm/Type;", (java.lang.Throwable) analyzerException32);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException37 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException39 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException37.addSuppressed((java.lang.Throwable) analyzerException39);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException44 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException46 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException44.addSuppressed((java.lang.Throwable) analyzerException46);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException48 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException44);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException49 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException48);
        analyzerException39.addSuppressed((java.lang.Throwable) analyzerException48);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException55 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException57 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException55.addSuppressed((java.lang.Throwable) analyzerException57);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException59 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException55);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException60 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException59);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException61 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException60);
        analyzerException48.addSuppressed((java.lang.Throwable) analyzerException60);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException63 = new org.mockito.asm.tree.analysis.AnalyzerException("LB;", (java.lang.Throwable) analyzerException48);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException64 = new org.mockito.asm.tree.analysis.AnalyzerException("void", (java.lang.Throwable) analyzerException48);
        analyzerException33.addSuppressed((java.lang.Throwable) analyzerException48);
        boolean boolean66 = type0.equals((java.lang.Object) analyzerException33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = type0.getInternalName();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.toString();
        int int25 = type0.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type26, true);
        java.lang.String str31 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type0.getDimensions();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        int int32 = type0.getOpcode(171);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type0.getInternalName();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("J");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 193);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        java.lang.String str10 = type7.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) 151);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = type16.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) 151);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) (byte) 100);
        java.lang.String str26 = type23.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type12, type15, type16, type20, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray27);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray27);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray27);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type1.getInternalName();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("CBFCF)Lg/mockito/asm/tree/analysis/AnalyzerException");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) 151);
        java.lang.String str5 = type2.getClassName();
        int int7 = type2.getOpcode(138);
        int int8 = type2.getSize();
        boolean boolean10 = type2.equals((java.lang.Object) 154);
        java.lang.String str11 = type2.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier13 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        java.lang.String str14 = type2.getClassName();
        java.lang.String str15 = type2.toString();
        java.lang.String str16 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type2.getDimensions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type6.getElementType();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        int int4 = type0.getOpcode(191);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        java.lang.String str26 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type0.getDimensions();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        int int7 = type0.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("(CBFCF)Lorg/mockito/asm/tree/analysis/BasicValue;");
        boolean boolean10 = type0.equals((java.lang.Object) "(CBFCF)Lorg/mockito/asm/tree/analysis/BasicValue;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(CBFCF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type2.getElementType();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int24 = type0.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        int int7 = type0.getSort();
        int int8 = type0.getSort();
        java.lang.String str9 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        java.lang.String str9 = type6.getClassName();
        int int11 = type6.getOpcode(138);
        int int12 = type6.getSize();
        boolean boolean14 = type6.equals((java.lang.Object) 154);
        java.lang.String str15 = type6.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type5, type6, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier0.newValue(type6);
        java.lang.String str19 = type6.getClassName();
        java.lang.String str20 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type6.getElementType();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) (byte) 100);
        java.lang.String str22 = type19.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) 151);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 100);
        java.lang.String str29 = type26.getClassName();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type15, type18, type19, type23, type26 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray30);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("(CBFCF)Lbyte;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier40 = new org.mockito.asm.tree.analysis.SimpleVerifier(type35, type38, true);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier42 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type35, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int43 = type6.getDimensions();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type0.getInternalName();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        java.lang.String str19 = type0.toString();
        int int20 = type0.getSort();
        java.lang.String str21 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type0.getInternalName();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("float");
        java.lang.String str9 = type8.getDescriptor();
        int int10 = type8.getSort();
        int int11 = type8.getSize();
        java.lang.String str12 = type8.getClassName();
        int int13 = type8.getSize();
        boolean boolean14 = type0.equals((java.lang.Object) int13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type0.getInternalName();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type18.getSort();
        java.lang.String str24 = type18.getDescriptor();
        boolean boolean26 = type18.equals((java.lang.Object) 179);
        java.lang.String str27 = type18.getDescriptor();
        int int28 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type18.getElementType();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        java.lang.String str8 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSize();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B: expected null, but found .");
        int int3 = type1.getOpcode(113);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(CBFCF)L(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ;;");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSort();
        java.lang.String str5 = type2.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(48);
        java.lang.String str9 = type6.getClassName();
        java.lang.String str10 = type6.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier11 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.CHAR_TYPE;
        int int14 = type12.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value15 = simpleVerifier11.newValue(type12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 100);
        java.lang.String str19 = type16.getClassName();
        boolean boolean21 = type16.equals((java.lang.Object) 177);
        java.lang.String str22 = type16.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException25 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException26 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException25);
        java.lang.Class<?> wildcardClass27 = analyzerException25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        int int30 = type28.getOpcode(114);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) 151);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 100);
        java.lang.String str39 = type36.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean42 = type40.equals((java.lang.Object) 151);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) (byte) 100);
        java.lang.String str46 = type43.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type32, type35, type36, type40, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray47);
        boolean boolean50 = type16.equals((java.lang.Object) typeArray47);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray47);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray47);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray47);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier55 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type2.getElementType();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(CBFCF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type2, type5, true);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        int int10 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value11 = simpleVerifier8.newValue(type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type9.getDimensions();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        int int24 = type0.getSize();
        int int26 = type0.getOpcode(100);
        int int27 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type0.getElementType();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)I");
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        int int7 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        java.lang.String str9 = type6.getClassName();
        int int11 = type6.getOpcode(138);
        int int12 = type6.getSize();
        boolean boolean14 = type6.equals((java.lang.Object) 154);
        java.lang.String str15 = type6.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type5, type6, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier0.newValue(type6);
        java.lang.String str19 = type6.getClassName();
        java.lang.String str20 = type6.getClassName();
        int int21 = type6.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type6.getInternalName();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        int int24 = type0.getSort();
        java.lang.String str25 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type0.getInternalName();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.tree.analysis.Value value14 = simpleVerifier5.newValue(type10);
        int int15 = type10.getSize();
        java.lang.String str16 = type10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type10.getInternalName();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSort();
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)C");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type1.getInternalName();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        int int23 = type10.getOpcode(0);
        int int24 = type10.getSort();
        java.lang.String str25 = type10.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type10.getInternalName();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException6 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException8 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException6.addSuppressed((java.lang.Throwable) analyzerException8);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("hi!", (java.lang.Throwable) analyzerException6);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("char", (java.lang.Throwable) analyzerException10);
        boolean boolean12 = type0.equals((java.lang.Object) analyzerException11);
        java.lang.String str13 = type0.getDescriptor();
        java.lang.String str14 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type0.getDimensions();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        int int19 = type0.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("float");
        java.lang.String str22 = type21.getDescriptor();
        int int23 = type21.getSort();
        int int24 = type21.getSize();
        java.lang.String str25 = type21.getClassName();
        int int26 = type21.getSize();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type21, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type0.getInternalName();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        java.lang.String str22 = type10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type10.getInternalName();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        int int24 = type0.getSort();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException27 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException28 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException27);
        java.lang.Class<?> wildcardClass29 = analyzerException27.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = type30.getElementType();
        java.lang.String str32 = type31.getClassName();
        java.lang.String str33 = type31.getDescriptor();
        org.mockito.asm.Type type34 = type31.getElementType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("byte");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier37 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.CHAR_TYPE;
        int int40 = type38.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value41 = simpleVerifier37.newValue(type38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) (byte) 100);
        java.lang.String str45 = type42.getClassName();
        boolean boolean47 = type42.equals((java.lang.Object) 177);
        java.lang.String str48 = type42.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException51 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException52 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException51);
        java.lang.Class<?> wildcardClass53 = analyzerException51.getClass();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        int int56 = type54.getOpcode(114);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean60 = type58.equals((java.lang.Object) 151);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean64 = type62.equals((java.lang.Object) (byte) 100);
        java.lang.String str65 = type62.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean68 = type66.equals((java.lang.Object) 151);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean71 = type69.equals((java.lang.Object) (byte) 100);
        java.lang.String str72 = type69.getClassName();
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type58, type61, type62, type66, type69 };
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray73);
        boolean boolean76 = type42.equals((java.lang.Object) typeArray73);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray73);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray73);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray73);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = type0.getInternalName();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        int int32 = type0.getOpcode(139);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type0.getInternalName();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        java.lang.String str35 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type0.getInternalName();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        int int23 = type10.getOpcode(0);
        int int24 = type10.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type10.getElementType();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type0.getElementType();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B: expected null, but found .");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.CHAR_TYPE;
        int int33 = type31.getOpcode(101);
        int int35 = type31.getOpcode(191);
        org.mockito.asm.tree.analysis.Value value36 = simpleVerifier30.newValue(type31);
        int int37 = type31.getSort();
        boolean boolean39 = type31.equals((java.lang.Object) "LCBFCF)Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type31.getDimensions();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = type0.getInternalName();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getClassName();
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: float: expected null, but found .");
        org.mockito.asm.tree.analysis.Value value3 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        java.lang.String str9 = type6.getClassName();
        int int11 = type6.getOpcode(138);
        int int12 = type6.getSize();
        boolean boolean14 = type6.equals((java.lang.Object) 154);
        java.lang.String str15 = type6.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type5, type6, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier0.newValue(type6);
        java.lang.String str19 = type6.getClassName();
        java.lang.String str20 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type6.getDimensions();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(CBFCF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type2, type5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type2.getDimensions();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        int int7 = type0.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("(CBFCF)Lorg/mockito/asm/tree/analysis/BasicValue;");
        boolean boolean10 = type0.equals((java.lang.Object) "(CBFCF)Lorg/mockito/asm/tree/analysis/BasicValue;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type18.getElementType();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ;;");
        org.mockito.asm.Type type2 = type1.getElementType();
        org.mockito.asm.Type type3 = type2.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        int int22 = type10.getSize();
        java.lang.String str23 = type10.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type10.getDimensions();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        int int23 = type10.getOpcode(0);
        int int24 = type10.getSort();
        java.lang.String str25 = type10.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type10.getElementType();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        int int24 = type0.getSize();
        int int26 = type0.getOpcode(100);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) 193);
        java.lang.Class<?> wildcardClass30 = type27.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier36 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type34, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = type0.getInternalName();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: Lorg/mockito/asm/tree/analysis/BasicValue;: expected (CBFCF)F, but found .");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.tree.analysis.Value value33 = simpleVerifier30.newValue(type31);
        int int34 = type31.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type31.getDimensions();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        boolean boolean12 = type1.equals((java.lang.Object) type11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type1.getInternalName();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
        org.mockito.asm.tree.analysis.Value value25 = simpleVerifier22.newValue(type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType("J");
        java.lang.String str28 = type27.toString();
        java.lang.String str29 = type27.toString();
        int int30 = type27.getSize();
        java.lang.String str31 = type27.getDescriptor();
        org.mockito.asm.tree.analysis.Value value32 = simpleVerifier22.newValue(type27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type27.getElementType();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(CBFCF)B");
        org.mockito.asm.Type type2 = type1.getElementType();
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type2, type5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type5.getElementType();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(CBFCF)C;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("LB;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        java.lang.String str19 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type0.getDimensions();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(119);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int6 = type0.getSize();
        int int8 = type0.getOpcode(14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        int int23 = type10.getOpcode(0);
        org.mockito.asm.Type[] typeArray25 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)B");
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray25);
        java.lang.String str27 = type10.getClassName();
        int int28 = type10.getSize();
        java.lang.String str29 = type10.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type10.getElementType();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("CBFCF)L(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier16 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type10, true);
        int int17 = type10.getSort();
        int int19 = type10.getOpcode((int) 'a');
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        int int21 = type20.getSize();
        java.lang.String str22 = type20.toString();
        boolean boolean23 = type10.equals((java.lang.Object) str22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type10.getDimensions();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("J");
        int int3 = type1.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Lhi!;");
        org.mockito.asm.Type type2 = type1.getElementType();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean6 = type4.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type3, type4, true);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value12 = simpleVerifier8.newValue(type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 100);
        java.lang.String str16 = type13.getClassName();
        org.mockito.asm.tree.analysis.Value value17 = simpleVerifier8.newValue(type13);
        int int18 = type13.getSize();
        int int20 = type13.getOpcode(114);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type13, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type13.getInternalName();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.tree.analysis.Value value24 = simpleVerifier22.newValue(type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type23.getElementType();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) 151);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 100);
        java.lang.String str20 = type17.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type6, type9, type10, type14, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        int int24 = type0.getSize();
        int int26 = type0.getOpcode(100);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) 193);
        java.lang.Class<?> wildcardClass30 = type27.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier36 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type34, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type0.getElementType();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B: expected null, but found .");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) 151);
        java.lang.String str13 = type10.getClassName();
        int int15 = type10.getOpcode(138);
        int int16 = type10.getSize();
        boolean boolean18 = type10.equals((java.lang.Object) 154);
        org.mockito.asm.tree.analysis.Value value19 = simpleVerifier5.newValue(type10);
        int int21 = type10.getOpcode(0);
        java.lang.String str22 = type10.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type10.getElementType();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str2 = type1.getDescriptor();
        int int4 = type1.getOpcode(191);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.toString();
        java.lang.String str25 = type0.toString();
        java.lang.String str26 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type0.getElementType();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int6 = type0.getSize();
        java.lang.String str7 = type0.toString();
        java.lang.String str8 = type0.getDescriptor();
        java.lang.String str9 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        int int32 = type0.getOpcode(171);
        int int33 = type0.getSize();
        java.lang.String str34 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type0.getElementType();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("J");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier16 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type10, true);
        int int17 = type10.getSort();
        int int19 = type10.getOpcode((int) 'a');
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        int int21 = type20.getSize();
        java.lang.String str22 = type20.toString();
        boolean boolean23 = type10.equals((java.lang.Object) str22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type10.getInternalName();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 151);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) 151);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 100);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type7, type10, type11, type15, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier28 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type24, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type6, true);
        boolean boolean32 = type6.equals((java.lang.Object) 81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type6.getElementType();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(101);
        java.lang.String str3 = type0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("V");
        int int6 = type5.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type5, false);
        int int9 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type5.getElementType();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("LLB;;");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = type1.getElementType();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException6 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException6);
        java.lang.Class<?> wildcardClass8 = analyzerException6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = type9.getElementType();
        java.lang.String str11 = type10.getClassName();
        java.lang.String str12 = type10.getDescriptor();
        org.mockito.asm.Type type13 = type10.getElementType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("byte");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier16 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        int int19 = type17.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value20 = simpleVerifier16.newValue(type17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) (byte) 100);
        java.lang.String str24 = type21.getClassName();
        boolean boolean26 = type21.equals((java.lang.Object) 177);
        java.lang.String str27 = type21.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException30 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException31 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException30);
        java.lang.Class<?> wildcardClass32 = analyzerException30.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        int int35 = type33.getOpcode(114);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) 151);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean43 = type41.equals((java.lang.Object) (byte) 100);
        java.lang.String str44 = type41.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean47 = type45.equals((java.lang.Object) 151);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean50 = type48.equals((java.lang.Object) (byte) 100);
        java.lang.String str51 = type48.getClassName();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type37, type40, type41, type45, type48 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray52);
        boolean boolean55 = type21.equals((java.lang.Object) typeArray52);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray52);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray52);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray52);
        org.mockito.asm.Type type59 = type13.getElementType();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier61 = new org.mockito.asm.tree.analysis.SimpleVerifier(type3, type59, true);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int64 = type62.getOpcode(48);
        java.lang.String str65 = type62.getClassName();
        java.lang.String str66 = type62.getClassName();
        int int68 = type62.getOpcode(119);
        int int69 = type62.getSort();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType("(CBFCF)Lorg/mockito/asm/tree/analysis/BasicValue;");
        boolean boolean72 = type62.equals((java.lang.Object) "(CBFCF)Lorg/mockito/asm/tree/analysis/BasicValue;");
        org.mockito.asm.tree.analysis.Value value73 = simpleVerifier61.newValue(type62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type74 = type62.getElementType();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(183);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        java.lang.String str6 = type0.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException9);
        java.lang.Class<?> wildcardClass11 = analyzerException9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        int int14 = type12.getOpcode(114);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) 151);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) (byte) 100);
        java.lang.String str23 = type20.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) 151);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) (byte) 100);
        java.lang.String str30 = type27.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type16, type19, type20, type24, type27 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray31);
        boolean boolean34 = type0.equals((java.lang.Object) typeArray31);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException37 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException38 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException37);
        java.lang.Throwable[] throwableArray39 = analyzerException38.getSuppressed();
        boolean boolean40 = type0.equals((java.lang.Object) analyzerException38);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException42 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        java.lang.Throwable[] throwableArray43 = analyzerException42.getSuppressed();
        boolean boolean44 = type0.equals((java.lang.Object) analyzerException42);
        int int46 = type0.getOpcode(182);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type0.getInternalName();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        int int4 = type0.getOpcode(0);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(CBFCF)B");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException3 = new org.mockito.asm.tree.analysis.AnalyzerException("Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException5 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        analyzerException3.addSuppressed((java.lang.Throwable) analyzerException5);
        java.lang.Class<?> wildcardClass7 = analyzerException5.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier10 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type8, false);
        int int11 = type1.getSort();
        java.lang.String str12 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type1.getInternalName();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.toString();
        int int25 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type0.getInternalName();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int6 = type0.getSize();
        int int8 = type0.getOpcode(14);
        java.lang.String str9 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 151);
        java.lang.String str3 = type0.getClassName();
        int int5 = type0.getOpcode(138);
        int int6 = type0.getSize();
        boolean boolean8 = type0.equals((java.lang.Object) 154);
        java.lang.String str9 = type0.getDescriptor();
        java.lang.String str10 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int18 = type0.getSize();
        java.lang.String str19 = type0.toString();
        int int20 = type0.getSort();
        java.lang.String str21 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        java.lang.String str8 = type0.toString();
        int int9 = type0.getSize();
        java.lang.String str10 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.BasicValue");
        java.lang.String str3 = type2.getDescriptor();
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type5.getOpcode(48);
        java.lang.String str8 = type5.getClassName();
        java.lang.String str9 = type5.getClassName();
        int int11 = type5.getOpcode(119);
        int int12 = type5.getSort();
        int int13 = type5.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicInterpreter;");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("float");
        int int18 = type17.getSize();
        int int19 = type17.getDimensions();
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        org.mockito.asm.tree.analysis.Value value25 = simpleVerifier0.newValue(type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type5.getDimensions();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 100);
        java.lang.String str3 = type0.getClassName();
        boolean boolean5 = type0.equals((java.lang.Object) 177);
        int int7 = type0.getOpcode(167);
        java.lang.String str8 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSize();
        java.lang.String str8 = type1.getClassName();
        int int9 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type6.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        boolean boolean15 = type10.equals((java.lang.Object) 177);
        java.lang.String str16 = type10.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException19 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException19);
        java.lang.Class<?> wildcardClass21 = analyzerException19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        int int24 = type22.getOpcode(114);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 151);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 100);
        java.lang.String str33 = type30.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean36 = type34.equals((java.lang.Object) 151);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean39 = type37.equals((java.lang.Object) (byte) 100);
        java.lang.String str40 = type37.getClassName();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type26, type29, type30, type34, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray41);
        boolean boolean44 = type10.equals((java.lang.Object) typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type0.getDimensions();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)Lorg.mockito.asm.tree.analysis.AnalyzerException: ;");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier5.newValue(type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.tree.analysis.Value value14 = simpleVerifier5.newValue(type10);
        int int15 = type10.getSize();
        int int17 = type10.getOpcode(114);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type10.getElementType();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 151);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 100);
        java.lang.String str8 = type5.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) 151);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) (byte) 100);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type1, type4, type5, type9, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) 151);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier22 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type18, false);
        int int23 = type0.getSize();
        java.lang.String str24 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }
}


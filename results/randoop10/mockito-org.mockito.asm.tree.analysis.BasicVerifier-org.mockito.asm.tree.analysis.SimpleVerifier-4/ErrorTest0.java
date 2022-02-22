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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type18.getInternalName();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.tree.analysis.Value value24 = simpleVerifier22.newValue(type23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.tree.analysis.Value value26 = simpleVerifier22.newValue(type25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type25.getDimensions();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier0 = new org.mockito.asm.tree.analysis.SimpleVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(101);
        org.mockito.asm.tree.analysis.Value value4 = simpleVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(48);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("double");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type5, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier30 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type26, true);
        java.lang.String str31 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type0.getDimensions();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type0.getInternalName();
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
        int int23 = type18.getSort();
        java.lang.String str24 = type18.getDescriptor();
        boolean boolean26 = type18.equals((java.lang.Object) 179);
        java.lang.String str27 = type18.getDescriptor();
        int int28 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type18.getElementType();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (CBFCF)B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("LB;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        java.lang.String str23 = type0.toString();
        java.lang.String str24 = type0.toString();
        java.lang.String str25 = type0.toString();
        java.lang.String str26 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type0.getElementType();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        boolean boolean32 = type6.equals((java.lang.Object) 81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type6.getElementType();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        java.lang.String str24 = type0.getInternalName();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type0.getDimensions();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        int int16 = type2.getDimensions();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type1.getClassName();
        int int7 = type1.getSort();
        org.mockito.asm.Type[] typeArray9 = org.mockito.asm.Type.getArgumentTypes("(CBFCF)C");
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean3 = type1.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
        org.mockito.asm.Type type35 = type34.getElementType();
        java.lang.String str36 = type34.getInternalName();
        java.lang.String str37 = type34.toString();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException40 = new org.mockito.asm.tree.analysis.AnalyzerException("");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException41 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Throwable) analyzerException40);
        java.lang.Class<?> wildcardClass42 = analyzerException40.getClass();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str49 = type48.getInternalName();
        int int50 = type48.getDimensions();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier52 = new org.mockito.asm.tree.analysis.SimpleVerifier(type34, type48, false);
        org.mockito.asm.Type type53 = type34.getElementType();
        org.mockito.asm.tree.analysis.Value value54 = simpleVerifier32.newValue(type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean57 = type55.equals((java.lang.Object) 151);
        java.lang.String str58 = type55.getClassName();
        int int60 = type55.getOpcode(138);
        org.mockito.asm.tree.analysis.Value value61 = simpleVerifier32.newValue(type55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type62 = type55.getElementType();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        java.lang.String str27 = type0.getInternalName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        int int31 = type0.getDimensions();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        int int25 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type18.getElementType();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("()Lorg/mockito/asm/tree/analysis/SimpleVerifier;");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier5 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) 24);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier11 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type7, true);
        java.lang.String str12 = type7.getClassName();
        int int13 = type7.getSize();
        org.mockito.asm.tree.analysis.Value value14 = simpleVerifier5.newValue(type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type7.getDimensions();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType("()LB;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier29 = new org.mockito.asm.tree.analysis.SimpleVerifier(type10, type27, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type10.getElementType();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.lang.String str21 = type6.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type6.getDimensions();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("LB;");
        java.lang.String str38 = type37.getInternalName();
        java.lang.String str39 = type37.toString();
        org.mockito.asm.tree.analysis.Value value40 = simpleVerifier32.newValue(type37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean44 = type42.equals((java.lang.Object) 151);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean48 = type46.equals((java.lang.Object) (byte) 100);
        java.lang.String str49 = type46.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) 151);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean55 = type53.equals((java.lang.Object) (byte) 100);
        java.lang.String str56 = type53.getClassName();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type42, type45, type46, type50, type53 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray57);
        int int59 = type41.getSize();
        int int60 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value61 = simpleVerifier32.newValue(type41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int62 = type41.getDimensions();
    }
}


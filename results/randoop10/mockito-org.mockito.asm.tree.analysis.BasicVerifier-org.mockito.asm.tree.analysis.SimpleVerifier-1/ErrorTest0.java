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
        int int1 = type0.getDimensions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        int int5 = type3.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type3.getInternalName();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(C)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(C)Z");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int3 = type0.getOpcode(0);
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        boolean boolean5 = type0.equals((java.lang.Object) basicVerifier2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        int int5 = type3.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        int int8 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type3.getInternalName();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSize();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSize();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException3 = new org.mockito.asm.tree.analysis.AnalyzerException("S");
        boolean boolean4 = type1.equals((java.lang.Object) analyzerException3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        int int6 = type0.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)C");
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.asm.Type type4 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int3 = type1.getOpcode(86);
        java.lang.String str4 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        int int5 = type3.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        java.lang.String str8 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("(C)C");
        org.mockito.asm.tree.analysis.Value value6 = simpleVerifier3.newValue(type5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I;");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        int int6 = type0.getOpcode(154);
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int5 = type2.getOpcode(0);
        java.lang.String str6 = type2.getClassName();
        int int7 = type2.getSize();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier9 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        java.lang.String str10 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type1.getInternalName();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
        int int4 = type2.getOpcode(8192);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type2, true);
        java.lang.String str7 = type0.getDescriptor();
        int int9 = type0.getOpcode(199);
        int int11 = type0.getOpcode(153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int3 = type1.getOpcode(160);
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int5 = type2.getOpcode(0);
        java.lang.String str6 = type2.getClassName();
        int int7 = type2.getSize();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier9 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type2, true);
        java.lang.String str10 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type1.getElementType();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(S)C");
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        boolean boolean9 = type1.equals((java.lang.Object) str8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier12 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type10, false);
        org.mockito.asm.Type type13 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type13.getInternalName();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(S)C;");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
        int int4 = type2.getOpcode(8192);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type2, true);
        java.lang.String str7 = type0.getDescriptor();
        int int9 = type0.getOpcode(199);
        int int11 = type0.getOpcode(153);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)C");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (S)C");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier10 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type8, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type8.getInternalName();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: S: expected 192, but found I: expected org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: S: expected 192, but found I: expected org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I, but found I");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)C");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        int int5 = type3.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier7.newValue(type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type8.getInternalName();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)C");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (S)C");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier10 = new org.mockito.asm.tree.analysis.SimpleVerifier(type6, type8, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type8.getElementType();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
        int int4 = type2.getOpcode(8192);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type2, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("LLS;;");
        int int2 = type1.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: (S)C;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type4, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type4.getDimensions();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type4, type5, true);
        int int8 = type4.getSize();
        org.mockito.asm.tree.analysis.Value value9 = simpleVerifier3.newValue(type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type4.getElementType();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(S)F;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(C)I;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicVerifier0.newValue(type1);
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(141);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSize();
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getClassName();
        int int7 = type0.getOpcode(81);
        java.lang.String str8 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        int int6 = type0.getOpcode(105);
        int int8 = type0.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str4 = type0.getClassName();
        int int6 = type0.getOpcode(141);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (S)S: expected 175, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: : expected L(S)F;, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (SC)C: expected Lorg/mockito/asm/Type;, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int3 = type1.getOpcode(86);
        java.lang.String str4 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: L(C)Z;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(C)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)C");
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.asm.Type type4 = type1.getElementType();
        java.lang.String str5 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type4.getInternalName();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        boolean boolean5 = type0.equals((java.lang.Object) basicVerifier2);
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        boolean boolean5 = type0.equals((java.lang.Object) basicVerifier2);
        int int6 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(C)B;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)C");
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.asm.Type type4 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("J");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int4 = type3.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type3.getElementType();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)S");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: S: expected 192, but found I: expected org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I, but found I");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(C)D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int3 = type1.getOpcode(86);
        java.lang.String str4 = type1.toString();
        int int6 = type1.getOpcode((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
        int int4 = type2.getOpcode(8192);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type2, true);
        java.lang.String str7 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(2);
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = type1.getElementType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type7 = type6.getElementType();
        boolean boolean8 = type1.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type9.getElementType();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SC)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: L(C)Z;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier2.newValue(type3);
        int int5 = type3.getSort();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier7 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type3, false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int13 = type10.getOpcode(0);
        java.lang.String str14 = type10.getClassName();
        int int15 = type10.getSize();
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type9, type10, true);
        org.mockito.asm.tree.analysis.Value value18 = simpleVerifier7.newValue(type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type9.getInternalName();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("(C)C");
        org.mockito.asm.tree.analysis.Value value6 = simpleVerifier3.newValue(type5);
        int int7 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type5.getDimensions();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) "float");
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(C)I");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type type3 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type3.getElementType();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (S)D: expected I, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("LLS;;");
        int int2 = type1.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: (S)C;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier6 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type4, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type4.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int3 = type1.getOpcode(160);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected null, but found I");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        int int6 = type0.getOpcode(154);
        java.lang.String str7 = type0.getDescriptor();
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)F");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)I: expected null, but found J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)V");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)S");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException3 = new org.mockito.asm.tree.analysis.AnalyzerException("S");
        boolean boolean4 = type1.equals((java.lang.Object) analyzerException3);
        int int6 = type1.getOpcode(48);
        int int8 = type1.getOpcode(117);
        java.lang.String str9 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        int int3 = type1.getOpcode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I");
        boolean boolean6 = type4.equals((java.lang.Object) "Lmockito/asm/Type;");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier8 = new org.mockito.asm.tree.analysis.SimpleVerifier(type1, type4, false);
        java.lang.String str9 = type4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type4.getElementType();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(84);
        int int4 = type0.getOpcode(136);
        int int6 = type0.getOpcode(154);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C)Lorg.mockito.asm.Type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(S)C");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = type1.getElementType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("(S)C");
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (S)C");
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier15 = new org.mockito.asm.tree.analysis.SimpleVerifier(type11, type13, false);
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier17 = new org.mockito.asm.tree.analysis.SimpleVerifier(type4, type13, true);
        int int18 = type4.getSize();
        int int19 = type4.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type4.getDimensions();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S");
        int int2 = type1.getSort();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: S: expected 192, but found I: expected org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (C)S: expected org.mockito.asm.tree.analysis.AnalyzerException: S, but found I, but found I");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(S)V");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.tree.analysis.SimpleVerifier simpleVerifier3 = new org.mockito.asm.tree.analysis.SimpleVerifier(type0, type1, true);
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }
}


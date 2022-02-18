import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = type64.getElementType();
        java.lang.String str67 = type64.getDescriptor();
        java.lang.Class<?> wildcardClass68 = type64.getClass();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str73 = type72.getClassName();
        int int75 = type72.getOpcode(83);
        org.mockito.asm.tree.analysis.Value value76 = basicInterpreter0.newValue(type72);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str78 = type77.getClassName();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.VOID_TYPE;
        int int81 = type80.getSize();
        int int82 = type80.getSize();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type84 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] { type79, type80, type83, type84 };
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type77, typeArray85);
        int int87 = type77.getSort();
        boolean boolean89 = type77.equals((java.lang.Object) 95);
        org.mockito.asm.tree.analysis.Value value90 = basicInterpreter0.newValue(type77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type91 = type77.getElementType();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type15.getInternalName();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        boolean boolean3 = type0.equals((java.lang.Object) "boolean");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type21, type22, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray27);
        int int29 = type19.getSort();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier4.newValue(type19);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        int int37 = type36.getSize();
        int int38 = type36.getSize();
        java.lang.String str39 = type36.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray40);
        java.lang.String str43 = type19.getClassName();
        java.lang.String str44 = type19.getClassName();
        boolean boolean45 = type0.equals((java.lang.Object) str44);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier46 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier46.newValue(type47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        int int52 = type51.getSize();
        int int53 = type51.getSize();
        java.lang.String str54 = type51.getDescriptor();
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type50, type51 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray55);
        java.lang.String str58 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int59 = type0.getDimensions();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        int int7 = type0.getOpcode(86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.tree.analysis.Value value14 = basicInterpreter0.newValue(type12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        java.lang.String str19 = type16.getDescriptor();
        int int21 = type16.getOpcode(160);
        org.mockito.asm.tree.analysis.Value value22 = basicInterpreter0.newValue(type16);
        java.lang.String str23 = type16.getDescriptor();
        java.lang.String str24 = type16.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type16.getElementType();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = type5.getElementType();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier0.newValue(type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException13 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean14 = type9.equals((java.lang.Object) analyzerException13);
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type9);
        java.lang.String str16 = type9.getClassName();
        int int17 = type9.getSort();
        java.lang.String str18 = type9.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type9.getElementType();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        java.lang.String str27 = type15.toString();
        int int28 = type15.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type15.getDimensions();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        java.lang.String str39 = type15.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type15.getDimensions();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        boolean boolean4 = type0.equals((java.lang.Object) 4);
        boolean boolean6 = type0.equals((java.lang.Object) 193);
        java.lang.String str7 = type0.getClassName();
        java.lang.String str8 = type0.getClassName();
        java.lang.String str9 = type0.getDescriptor();
        int int11 = type0.getOpcode(157);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        int int28 = type27.getSize();
        int int29 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        int int34 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier0.newValue(type24);
        java.lang.String str36 = type24.toString();
        int int38 = type24.getOpcode(182);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type24.getInternalName();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier7 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier7.newValue(type8);
        int int11 = type8.getSort();
        int int12 = type8.getSize();
        boolean boolean14 = type8.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        int int22 = type20.getSize();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        int int27 = type25.getSize();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier24.newValue(type25);
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier15.merge(value23, value28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        int int34 = type33.getSize();
        int int35 = type33.getSize();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type32, type33, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray38);
        int int40 = type30.getSort();
        org.mockito.asm.tree.analysis.Value value41 = basicVerifier15.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier42 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.tree.analysis.Value value45 = basicVerifier42.newValue(type43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        int int48 = type47.getSize();
        int int49 = type47.getSize();
        java.lang.String str50 = type47.getDescriptor();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type46, type47 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray51);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray51);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type57 = type1.getElementType();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        boolean boolean7 = type1.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        int int15 = type13.getSize();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier8.merge(value16, value21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type25, type26, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray31);
        int int33 = type23.getSort();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier8.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray44);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        java.lang.String str48 = type1.toString();
        java.lang.String str49 = type1.getDescriptor();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        int int54 = type53.getSize();
        int int55 = type53.getSize();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type52, type53, type56, type57 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = type1.getInternalName();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        int int45 = type41.getSort();
        boolean boolean47 = type41.equals((java.lang.Object) (byte) 0);
        int int48 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicInterpreter0.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.tree.analysis.Value value52 = basicInterpreter0.newValue(type51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        int int55 = type53.getSize();
        boolean boolean57 = type53.equals((java.lang.Object) 4);
        boolean boolean59 = type53.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.Value value60 = basicInterpreter0.newValue(type53);
        java.lang.String str61 = type53.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type62 = type53.getElementType();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        int int8 = type4.getOpcode(99);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSize();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray15);
        int int19 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type4.getElementType();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        java.lang.String str23 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier0.newValue(type16);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier30 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier30.newValue(type31);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier39 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        int int42 = type40.getSize();
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier39.newValue(type40);
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier30.merge(value38, value43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        int int49 = type48.getSize();
        int int50 = type48.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type47, type48, type51, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray53);
        int int55 = type45.getSort();
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier30.newValue(type45);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier57 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier57.newValue(type58);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier61 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str63 = type62.getClassName();
        int int64 = type62.getSize();
        org.mockito.asm.tree.analysis.Value value65 = basicVerifier61.newValue(type62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier66 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.getClassName();
        int int69 = type67.getSize();
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier66.newValue(type67);
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier57.merge(value65, value70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.VOID_TYPE;
        int int73 = type72.getSize();
        int int74 = type72.getSize();
        java.lang.String str75 = type72.getDescriptor();
        org.mockito.asm.tree.analysis.Value value76 = basicVerifier57.newValue(type72);
        org.mockito.asm.tree.analysis.Value value77 = basicVerifier30.newValue(type72);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str79 = type78.getClassName();
        int int80 = type78.getSize();
        boolean boolean82 = type78.equals((java.lang.Object) 4);
        int int83 = type78.getSort();
        org.mockito.asm.tree.analysis.Value value84 = basicVerifier30.newValue(type78);
        java.lang.Class<?> wildcardClass85 = value84.getClass();
        java.lang.String str86 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass85);
        java.lang.String str87 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass85);
        org.mockito.asm.Type type88 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass85);
        java.lang.String str89 = type88.getInternalName();
        org.mockito.asm.tree.analysis.Value value90 = basicVerifier0.newValue(type88);
        org.mockito.asm.Type type92 = org.mockito.asm.Type.getType("F");
        java.lang.String str93 = type92.getClassName();
        java.lang.String str94 = type92.toString();
        int int95 = type92.getSize();
        java.lang.String str96 = type92.getDescriptor();
        org.mockito.asm.tree.analysis.Value value97 = basicVerifier0.newValue(type92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int98 = type92.getDimensions();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.tree.analysis.Value value14 = basicInterpreter0.newValue(type12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        java.lang.String str19 = type16.getDescriptor();
        int int21 = type16.getOpcode(160);
        org.mockito.asm.tree.analysis.Value value22 = basicInterpreter0.newValue(type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type16.getDimensions();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        int int8 = type5.getSort();
        int int9 = type5.getSize();
        boolean boolean11 = type5.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        int int19 = type17.getSize();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier16.newValue(type17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier21 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        int int24 = type22.getSize();
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier21.newValue(type22);
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier12.merge(value20, value25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type29, type30, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray35);
        int int37 = type27.getSort();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier12.newValue(type27);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier39 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier39.newValue(type40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        int int45 = type44.getSize();
        int int46 = type44.getSize();
        java.lang.String str47 = type44.getDescriptor();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type43, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray48);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray48);
        java.lang.String str53 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = type1.getElementType();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        java.lang.String str11 = type4.toString();
        int int12 = type4.getSize();
        int int14 = type4.getOpcode(177);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type4.getDimensions();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(68);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type21, type22, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray27);
        int int29 = type19.getSort();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier4.newValue(type19);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        java.lang.String str33 = type32.getInternalName();
        java.lang.String str34 = type32.getDescriptor();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier4.newValue(type32);
        boolean boolean36 = type0.equals((java.lang.Object) value35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type0.getDimensions();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)F: expected 188, but found I: expected a, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I");
        int int3 = type1.getOpcode(137);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.tree.analysis.Value value14 = basicInterpreter0.newValue(type12);
        int int15 = type12.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type12.getDimensions();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        java.lang.String str39 = type15.getClassName();
        int int41 = type15.getOpcode(53);
        java.lang.String str42 = type15.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        int int46 = type44.getOpcode(151);
        java.lang.Class<?> wildcardClass47 = type44.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.asm.Type.getArgumentTypes("(ZV)Z");
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = type15.getDimensions();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        java.lang.String str11 = type4.toString();
        java.lang.String str12 = type4.getClassName();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        java.lang.String str21 = type18.getDescriptor();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type4.getElementType();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        org.mockito.asm.Type[] typeArray4 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.String str6 = type0.toString();
        int int8 = type0.getOpcode(87);
        boolean boolean10 = type0.equals((java.lang.Object) "[Lorg/mockito/asm/Type;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        int int45 = type41.getSort();
        boolean boolean47 = type41.equals((java.lang.Object) (byte) 0);
        int int48 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicInterpreter0.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.tree.analysis.Value value52 = basicInterpreter0.newValue(type51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        int int55 = type53.getSize();
        boolean boolean57 = type53.equals((java.lang.Object) 4);
        boolean boolean59 = type53.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.Value value60 = basicInterpreter0.newValue(type53);
        int int61 = type53.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type62 = type53.getElementType();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        boolean boolean7 = type1.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        int int15 = type13.getSize();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier8.merge(value16, value21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type25, type26, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray31);
        int int33 = type23.getSort();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier8.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray44);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        java.lang.String str48 = type1.toString();
        java.lang.String str49 = type1.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        int int52 = type50.getSize();
        boolean boolean54 = type50.equals((java.lang.Object) "(ZV)Lorg.mockito.asm.tree.analysis.AnalyzerException: hi!: expected 18, but found I;");
        boolean boolean55 = type1.equals((java.lang.Object) boolean54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str58 = type57.getClassName();
        int int60 = type57.getOpcode(83);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier61 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.tree.analysis.Value value64 = basicVerifier61.newValue(type62);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.VOID_TYPE;
        int int67 = type66.getSize();
        int int68 = type66.getSize();
        java.lang.String str69 = type66.getDescriptor();
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type65, type66 };
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray70);
        org.mockito.asm.Type[] typeArray73 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray73);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str77 = type1.getInternalName();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        java.lang.String str8 = type0.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str10 = type9.getClassName();
        boolean boolean12 = type9.equals((java.lang.Object) "boolean");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        int int25 = type23.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier13.merge(value21, value26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        int int32 = type31.getSize();
        int int33 = type31.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type30, type31, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        int int38 = type28.getSort();
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier13.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        int int46 = type45.getSize();
        int int47 = type45.getSize();
        java.lang.String str48 = type45.getDescriptor();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type45 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray49);
        java.lang.String str52 = type28.getClassName();
        java.lang.String str53 = type28.getClassName();
        boolean boolean54 = type9.equals((java.lang.Object) str53);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier55 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str57 = type56.getClassName();
        org.mockito.asm.tree.analysis.Value value58 = basicVerifier55.newValue(type56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        int int61 = type60.getSize();
        int int62 = type60.getSize();
        java.lang.String str63 = type60.getDescriptor();
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type59, type60 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray64);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray64);
        int int68 = type0.getSize();
        java.lang.String str69 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = type0.getInternalName();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        java.lang.String str21 = type11.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type29 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray33);
        java.lang.String str38 = type4.getClassName();
        boolean boolean40 = type4.equals((java.lang.Object) 148);
        java.lang.String str41 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type4.getInternalName();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        java.lang.String str23 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier0.newValue(type16);
        int int31 = type16.getOpcode(256);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type16.getElementType();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        int int9 = type7.getSize();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.merge(value5, value10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str14 = type13.getClassName();
        int int16 = type13.getOpcode(83);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier17.newValue(type18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSize();
        java.lang.String str25 = type22.getDescriptor();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type21, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray29);
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier0.newValue(type13);
        int int33 = type13.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int34 = type13.getDimensions();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        int int7 = type4.getSort();
        int int8 = type4.getSort();
        java.lang.String str9 = type4.toString();
        java.lang.String str10 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type4.getElementType();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        int int13 = type3.getOpcode((int) (byte) -1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        java.lang.Class<?> wildcardClass15 = basicVerifier14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier17.newValue(type18);
        int int21 = type18.getSort();
        int int22 = type18.getSize();
        boolean boolean24 = type18.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        int int44 = type43.getSize();
        int int45 = type43.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type42, type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray48);
        int int50 = type40.getSort();
        org.mockito.asm.tree.analysis.Value value51 = basicVerifier25.newValue(type40);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier52 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier52.newValue(type53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        int int58 = type57.getSize();
        int int59 = type57.getSize();
        java.lang.String str60 = type57.getDescriptor();
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type56, type57 };
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray61);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray61);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray61);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray61);
        java.lang.String str67 = type3.getClassName();
        java.lang.String str68 = type3.toString();
        java.lang.String str69 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = type3.getInternalName();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZV)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType("LLorg/mockito/asm/Type;;");
        org.mockito.asm.Type type4 = type3.getElementType();
        java.lang.String str5 = type3.getInternalName();
        boolean boolean6 = type1.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.toString();
        org.mockito.asm.tree.analysis.Value value14 = basicInterpreter0.newValue(type12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        int int19 = type15.getSort();
        boolean boolean21 = type15.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.tree.analysis.Value value22 = basicInterpreter0.newValue(type15);
        java.lang.String str23 = type15.getClassName();
        java.lang.String str24 = type15.getDescriptor();
        java.lang.String str25 = type15.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type15.getElementType();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        boolean boolean6 = type0.equals((java.lang.Object) (byte) 0);
        int int7 = type0.getSize();
        java.lang.String str8 = type0.getDescriptor();
        int int9 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        int int20 = type15.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("D");
        int int23 = type22.getSort();
        boolean boolean24 = type15.equals((java.lang.Object) int23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str30 = type29.getClassName();
        int int31 = type29.getSize();
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier25.newValue(type29);
        boolean boolean36 = type15.equals((java.lang.Object) type29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = type29.getInternalName();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        int int5 = type3.getSize();
        boolean boolean7 = type3.equals((java.lang.Object) 4);
        boolean boolean9 = type3.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier10.newValue(type11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        int int22 = type20.getSize();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier10.merge(value18, value23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        int int29 = type28.getSize();
        int int30 = type28.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type27, type28, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        int int35 = type25.getSort();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier10.newValue(type25);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier37 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier37.newValue(type38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        int int43 = type42.getSize();
        int int44 = type42.getSize();
        java.lang.String str45 = type42.getDescriptor();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type41, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray46);
        boolean boolean49 = type3.equals((java.lang.Object) typeArray46);
        int int50 = type3.getSize();
        int int51 = type3.getSort();
        int int52 = type3.getSize();
        int int54 = type3.getOpcode(187);
        boolean boolean55 = type1.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type1.getElementType();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier39 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier39.newValue(type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        int int44 = type43.getSize();
        int int45 = type43.getSize();
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier39.newValue(type43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value50 = basicVerifier47.newValue(type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.Type[] typeArray55 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray55);
        org.mockito.asm.tree.analysis.Value value57 = basicVerifier47.newValue(type51);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        int int62 = type61.getSize();
        int int63 = type61.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type60, type61, type64, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray66);
        java.lang.String str68 = type58.getDescriptor();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier71 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str73 = type72.getClassName();
        org.mockito.asm.tree.analysis.Value value74 = basicVerifier71.newValue(type72);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type76 = org.mockito.asm.Type.VOID_TYPE;
        int int77 = type76.getSize();
        int int78 = type76.getSize();
        java.lang.String str79 = type76.getDescriptor();
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type75, type76 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type72, typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray80);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray80);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray80);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray80);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray80);
        java.lang.String str87 = type15.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int88 = type15.getDimensions();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        int int8 = type4.getOpcode(99);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type4.getElementType();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        java.lang.String str11 = type4.toString();
        int int12 = type4.getSort();
        int int13 = type4.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        int int18 = type17.getSize();
        int int19 = type17.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type16, type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray22);
        java.lang.Class<?> wildcardClass24 = type14.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        boolean boolean30 = type4.equals((java.lang.Object) str29);
        java.lang.String str31 = type4.getClassName();
        java.lang.String str32 = type4.getClassName();
        int int33 = type4.getSort();
        int int35 = type4.getOpcode(141);
        int int36 = type4.getSort();
        int int37 = type4.getSort();
        int int38 = type4.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type4.getDimensions();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        int int20 = type15.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("D");
        int int23 = type22.getSort();
        boolean boolean24 = type15.equals((java.lang.Object) int23);
        java.lang.String str25 = type15.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type15.getElementType();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier36 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        int int39 = type37.getSize();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier36.newValue(type37);
        org.mockito.asm.tree.analysis.Value value41 = basicVerifier27.merge(value35, value40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        int int43 = type42.getSize();
        int int44 = type42.getSize();
        java.lang.String str45 = type42.getDescriptor();
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier27.newValue(type42);
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier0.newValue(type42);
        java.lang.String str48 = type42.toString();
        java.lang.String str49 = type42.getDescriptor();
        int int51 = type42.getOpcode(184);
        java.lang.String str52 = type42.getClassName();
        int int53 = type42.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type42.getDimensions();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        java.lang.Class<?> wildcardClass1 = basicVerifier0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        int int5 = type3.getOpcode(141);
        int int6 = type3.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) type3);
        java.lang.String str8 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        boolean boolean5 = type1.equals((java.lang.Object) 4);
        boolean boolean7 = type1.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        int int15 = type13.getSize();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier8.merge(value16, value21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type25, type26, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray31);
        int int33 = type23.getSort();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier8.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray44);
        boolean boolean47 = type1.equals((java.lang.Object) typeArray44);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier51 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier51.newValue(type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getClassName();
        int int57 = type55.getSize();
        org.mockito.asm.Type[] typeArray59 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray59);
        org.mockito.asm.tree.analysis.Value value61 = basicVerifier51.newValue(type55);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException62 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException: ", (java.lang.Object) type49, value61);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException63 = new org.mockito.asm.tree.analysis.AnalyzerException("(JVSZ)L(JVSZ)V;", (java.lang.Object) type1, value61);
        int int65 = type1.getOpcode(190);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str66 = type1.getInternalName();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type4.getSize();
        int int6 = type4.getSize();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier0.newValue(type4);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getClassName();
        int int14 = type12.getSize();
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier8.newValue(type12);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type21, type22, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray27);
        java.lang.String str29 = type19.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier32.newValue(type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        int int38 = type37.getSize();
        int int39 = type37.getSize();
        java.lang.String str40 = type37.getDescriptor();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type36, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray41);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier49 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier49.newValue(type50);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier53 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str55 = type54.getClassName();
        int int56 = type54.getSize();
        org.mockito.asm.tree.analysis.Value value57 = basicVerifier53.newValue(type54);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier58 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        int int61 = type59.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicVerifier58.newValue(type59);
        org.mockito.asm.tree.analysis.Value value63 = basicVerifier49.merge(value57, value62);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException64 = new org.mockito.asm.tree.analysis.AnalyzerException("Lorg/mockito/asm/Type;", (java.lang.Object) 21, value63);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str70 = type69.getClassName();
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier68.newValue(type69);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier72 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str74 = type73.getClassName();
        org.mockito.asm.tree.analysis.Value value75 = basicVerifier72.newValue(type73);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier76 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str78 = type77.getClassName();
        int int79 = type77.getSize();
        org.mockito.asm.tree.analysis.Value value80 = basicVerifier76.newValue(type77);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier81 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type82 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str83 = type82.getClassName();
        int int84 = type82.getSize();
        org.mockito.asm.tree.analysis.Value value85 = basicVerifier81.newValue(type82);
        org.mockito.asm.tree.analysis.Value value86 = basicVerifier72.merge(value80, value85);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier87 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type88 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str89 = type88.getClassName();
        org.mockito.asm.tree.analysis.Value value90 = basicVerifier87.newValue(type88);
        org.mockito.asm.tree.analysis.Value value91 = basicVerifier68.merge(value86, value90);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException92 = new org.mockito.asm.tree.analysis.AnalyzerException("", (java.lang.Object) 144, value91);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException93 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException: : expected 88, but found null", (java.lang.Throwable) analyzerException92);
        analyzerException64.addSuppressed((java.lang.Throwable) analyzerException92);
        boolean boolean95 = type4.equals((java.lang.Object) analyzerException92);
        int int96 = type4.getSort();
        int int98 = type4.getOpcode(46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type99 = type4.getElementType();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        int int12 = type3.getSize();
        int int13 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type3.getInternalName();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("S");
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type5, type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type0.getDimensions();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        int int14 = type1.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        boolean boolean19 = type15.equals((java.lang.Object) 4);
        boolean boolean21 = type15.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier26 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        int int29 = type27.getSize();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier26.newValue(type27);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier22.merge(value30, value35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type39, type40, type43, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray45);
        int int47 = type37.getSort();
        org.mockito.asm.tree.analysis.Value value48 = basicVerifier22.newValue(type37);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier49 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier49.newValue(type50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        int int55 = type54.getSize();
        int int56 = type54.getSize();
        java.lang.String str57 = type54.getDescriptor();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type53, type54 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray58);
        boolean boolean61 = type15.equals((java.lang.Object) typeArray58);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray58);
        int int64 = type1.getOpcode(512);
        int int65 = type1.getSort();
        int int66 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type67 = type1.getElementType();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        int int45 = type41.getSort();
        boolean boolean47 = type41.equals((java.lang.Object) (byte) 0);
        int int48 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicInterpreter0.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.tree.analysis.Value value52 = basicInterpreter0.newValue(type51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        int int55 = type53.getSize();
        boolean boolean57 = type53.equals((java.lang.Object) 4);
        boolean boolean59 = type53.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.Value value60 = basicInterpreter0.newValue(type53);
        int int61 = type53.getSize();
        java.lang.String str62 = type53.getDescriptor();
        int int63 = type53.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int64 = type53.getDimensions();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        int int45 = type41.getSort();
        boolean boolean47 = type41.equals((java.lang.Object) (byte) 0);
        int int48 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicInterpreter0.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.tree.analysis.Value value52 = basicInterpreter0.newValue(type51);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter53 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value55 = basicInterpreter53.newValue(type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException60 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean61 = type56.equals((java.lang.Object) analyzerException60);
        int int63 = type56.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value64 = basicInterpreter53.newValue(type56);
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter0.newValue(type56);
        java.lang.String str66 = type56.getClassName();
        int int67 = type56.getSort();
        int int69 = type56.getOpcode(125);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int70 = type56.getDimensions();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        java.lang.String str23 = type21.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type21.getElementType();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (ZV)S: expected void, but found I");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter2 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier3.newValue(type4);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier7 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier7.newValue(type8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        int int14 = type12.getSize();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier11.newValue(type12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        int int19 = type17.getSize();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier16.newValue(type17);
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier7.merge(value15, value20);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier3.merge(value21, value25);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier36 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        int int39 = type37.getSize();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier36.newValue(type37);
        org.mockito.asm.tree.analysis.Value value41 = basicVerifier27.merge(value35, value40);
        org.mockito.asm.tree.analysis.Value value42 = basicInterpreter2.merge(value21, value41);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier43 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier43.newValue(type44);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier47 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str49 = type48.getClassName();
        int int50 = type48.getSize();
        org.mockito.asm.tree.analysis.Value value51 = basicVerifier47.newValue(type48);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier52 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        int int55 = type53.getSize();
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier52.newValue(type53);
        org.mockito.asm.tree.analysis.Value value57 = basicVerifier43.merge(value51, value56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        int int59 = type58.getSize();
        int int60 = type58.getSize();
        java.lang.String str61 = type58.getDescriptor();
        org.mockito.asm.tree.analysis.Value value62 = basicVerifier43.newValue(type58);
        int int63 = type58.getSize();
        org.mockito.asm.tree.analysis.Value value64 = basicInterpreter2.newValue(type58);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str67 = type66.getClassName();
        org.mockito.asm.Type type68 = type66.getElementType();
        java.lang.String str69 = type66.getDescriptor();
        java.lang.Class<?> wildcardClass70 = type66.getClass();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        org.mockito.asm.tree.analysis.Value value72 = basicInterpreter2.newValue(type71);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str74 = type73.toString();
        java.lang.String str75 = type73.toString();
        org.mockito.asm.tree.analysis.Value value76 = basicInterpreter2.newValue(type73);
        int int78 = type73.getOpcode(133);
        java.lang.String str79 = type73.getDescriptor();
        org.mockito.asm.Type[] typeArray81 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)I");
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray81);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray81);
        int int85 = type1.getOpcode(191);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = type1.getElementType();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type5, type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
        int int15 = type0.getSort();
        java.lang.String str16 = type0.getClassName();
        int int17 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type0.getElementType();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        boolean boolean4 = type1.equals((java.lang.Object) 169);
        java.lang.String str5 = type1.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("L(JVSZ)LJVSZ)Lorg.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)F: expected 188, but found I;;");
        boolean boolean8 = type1.equals((java.lang.Object) "L(JVSZ)LJVSZ)Lorg.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)F: expected 188, but found I;;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)V");
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.newValue(type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = type13.getElementType();
        java.lang.String str16 = type15.getDescriptor();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier0.newValue(type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type15.getElementType();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        java.lang.String str27 = type15.toString();
        int int28 = type15.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = type15.getInternalName();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        int int9 = type7.getSize();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.merge(value5, value10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode(141);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier0.newValue(type12);
        java.lang.String str17 = type12.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type12.getDimensions();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getClassName();
        int int4 = type1.getOpcode(46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)V");
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.newValue(type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = type13.getElementType();
        java.lang.String str16 = type15.getDescriptor();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier0.newValue(type15);
        java.lang.String str19 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        int int25 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier20.newValue(type24);
        java.lang.Class<?> wildcardClass27 = basicVerifier20.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        int int30 = type29.getDimensions();
        org.mockito.asm.Type[] typeArray32 = org.mockito.asm.Type.getArgumentTypes("(ZV)L(JVSZ)Z;");
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type15.getDimensions();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        int int4 = type1.getSize();
        int int5 = type1.getDimensions();
        org.mockito.asm.Type type6 = type1.getElementType();
        int int7 = type6.getSize();
        int int9 = type6.getOpcode(182);
        java.lang.String str10 = type6.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type6.getDimensions();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        boolean boolean40 = type15.equals((java.lang.Object) 86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type15.getElementType();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        int int14 = type1.getSort();
        java.lang.String str15 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        int int4 = type0.getOpcode(158);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type4.getSize();
        int int6 = type4.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type3, type4, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        boolean boolean6 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = type0.getDescriptor();
        int int8 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        int int6 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str2 = type1.toString();
        int int4 = type1.getOpcode(197);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        java.lang.String str14 = type1.getDescriptor();
        int int16 = type1.getOpcode(4096);
        int int17 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type1.getInternalName();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I");
        int int3 = type1.getOpcode(120);
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.getClassName();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        java.lang.String str27 = type15.getDescriptor();
        int int28 = type15.getSort();
        int int29 = type15.getSize();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("L(JVSZ)Z;");
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)F");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray33);
        int int37 = type15.getOpcode(189);
        org.mockito.asm.Type[] typeArray39 = org.mockito.asm.Type.getArgumentTypes("(ZV)F");
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray39);
        java.lang.String str41 = type15.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int42 = type15.getDimensions();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        int int9 = type7.getSize();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.merge(value5, value10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        int int14 = type12.getOpcode(141);
        java.lang.String str15 = type12.getClassName();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier0.newValue(type12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type12.getInternalName();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter0.newValue(type63);
        int int66 = type63.getSort();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean69 = type67.equals((java.lang.Object) 3);
        java.lang.String str70 = type67.getDescriptor();
        int int72 = type67.getOpcode(0);
        boolean boolean73 = type63.equals((java.lang.Object) type67);
        int int74 = type63.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int75 = type63.getDimensions();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier23.newValue(type24);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        int int30 = type28.getSize();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        int int35 = type33.getSize();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier32.newValue(type33);
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier23.merge(value31, value36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        int int39 = type38.getSize();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getDescriptor();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier23.newValue(type38);
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier0.newValue(type38);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str46 = type45.getInternalName();
        int int48 = type45.getOpcode(173);
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier0.newValue(type45);
        org.mockito.asm.Type type50 = type45.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = type50.getElementType();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        java.lang.String str39 = type15.toString();
        java.lang.String str40 = type15.getDescriptor();
        java.lang.String str41 = type15.getClassName();
        int int42 = type15.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type43 = type15.getElementType();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        int int12 = type3.getSize();
        java.lang.String str13 = type3.toString();
        java.lang.String str14 = type3.getDescriptor();
        java.lang.String str15 = type3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type3.getElementType();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        java.lang.String str21 = type11.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type29 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray33);
        java.lang.String str38 = type4.getClassName();
        java.lang.String str39 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type40 = type4.getElementType();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int3 = type0.getOpcode(93);
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type5, type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type0.getElementType();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = type64.getElementType();
        java.lang.String str67 = type64.getDescriptor();
        java.lang.Class<?> wildcardClass68 = type64.getClass();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.toString();
        java.lang.String str73 = type71.toString();
        org.mockito.asm.tree.analysis.Value value74 = basicInterpreter0.newValue(type71);
        int int76 = type71.getOpcode(133);
        int int77 = type71.getSize();
        int int78 = type71.getSize();
        int int79 = type71.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type80 = type71.getElementType();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier2.newValue(type3);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.tree.analysis.Value value9 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSize();
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier10.newValue(type11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSize();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier15.newValue(type16);
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier6.merge(value14, value19);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier21 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier21.newValue(type22);
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier2.merge(value20, value24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type28, type29, type32, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray34);
        int int36 = type26.getSort();
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier2.newValue(type26);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str39 = type38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        int int45 = type44.getSize();
        int int46 = type44.getSize();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type43, type44, type47, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray49);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray49);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray49);
        java.lang.String str55 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str56 = type1.getInternalName();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        boolean boolean4 = type0.equals((java.lang.Object) 4);
        boolean boolean6 = type0.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier7 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier7.newValue(type8);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        int int14 = type12.getSize();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier11.newValue(type12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        int int19 = type17.getSize();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier16.newValue(type17);
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier7.merge(value15, value20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        int int26 = type25.getSize();
        int int27 = type25.getSize();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type24, type25, type28, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray30);
        int int32 = type22.getSort();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier7.newValue(type22);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier34.newValue(type35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        int int40 = type39.getSize();
        int int41 = type39.getSize();
        java.lang.String str42 = type39.getDescriptor();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type38, type39 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray43);
        boolean boolean46 = type0.equals((java.lang.Object) typeArray43);
        int int47 = type0.getSize();
        int int48 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str49 = type0.getInternalName();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        int int14 = type1.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        boolean boolean19 = type15.equals((java.lang.Object) 4);
        boolean boolean21 = type15.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier26 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        int int29 = type27.getSize();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier26.newValue(type27);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier22.merge(value30, value35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type39, type40, type43, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray45);
        int int47 = type37.getSort();
        org.mockito.asm.tree.analysis.Value value48 = basicVerifier22.newValue(type37);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier49 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier49.newValue(type50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        int int55 = type54.getSize();
        int int56 = type54.getSize();
        java.lang.String str57 = type54.getDescriptor();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type53, type54 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray58);
        boolean boolean61 = type15.equals((java.lang.Object) typeArray58);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray58);
        int int64 = type1.getOpcode(512);
        int int65 = type1.getSort();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException68 = new org.mockito.asm.tree.analysis.AnalyzerException("(JVSZ)Lorg/mockito/asm/tree/analysis/BasicVerifier;");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException69 = new org.mockito.asm.tree.analysis.AnalyzerException("(JVSZ)V", (java.lang.Throwable) analyzerException68);
        boolean boolean70 = type1.equals((java.lang.Object) analyzerException68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type71 = type1.getElementType();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)F");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("LLZ;;");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.toString();
        org.mockito.asm.Type type4 = type1.getElementType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        int int9 = type8.getSize();
        int int10 = type8.getSize();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type7, type8, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray13);
        java.lang.Class<?> wildcardClass15 = type5.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter18 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value20 = basicInterpreter18.newValue(type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        int int22 = type21.getSize();
        int int23 = type21.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException25 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean26 = type21.equals((java.lang.Object) analyzerException25);
        int int28 = type21.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter18.newValue(type21);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.toString();
        org.mockito.asm.tree.analysis.Value value32 = basicInterpreter18.newValue(type30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        int int34 = type33.getSize();
        int int35 = type33.getSize();
        java.lang.String str36 = type33.getDescriptor();
        int int37 = type33.getSort();
        boolean boolean39 = type33.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter18.newValue(type33);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.tree.analysis.Value value43 = basicInterpreter18.newValue(type41);
        boolean boolean44 = type16.equals((java.lang.Object) basicInterpreter18);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType("F");
        java.lang.String str47 = type46.getClassName();
        java.lang.String str48 = type46.toString();
        int int49 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value50 = basicInterpreter18.newValue(type46);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("char");
        java.lang.String str53 = type52.getDescriptor();
        org.mockito.asm.tree.analysis.Value value54 = basicInterpreter18.newValue(type52);
        boolean boolean55 = type1.equals((java.lang.Object) type52);
        org.mockito.asm.Type type56 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int57 = type56.getDimensions();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter0.newValue(type63);
        int int66 = type63.getSort();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean69 = type67.equals((java.lang.Object) 3);
        java.lang.String str70 = type67.getDescriptor();
        int int72 = type67.getOpcode(0);
        boolean boolean73 = type63.equals((java.lang.Object) type67);
        int int74 = type67.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int75 = type67.getDimensions();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        boolean boolean3 = type0.equals((java.lang.Object) "org.mockito.asm.tree.analysis.AnalyzerException: L(JVSZ)Z;: expected 1, but found I");
        int int5 = type0.getOpcode(148);
        int int7 = type0.getOpcode(197);
        java.lang.String str8 = type0.getDescriptor();
        java.lang.String str9 = type0.toString();
        int int10 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type0.getDimensions();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        java.lang.String str4 = type1.getDescriptor();
        int int6 = type1.getOpcode(160);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException4 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean5 = type0.equals((java.lang.Object) analyzerException4);
        int int7 = type0.getOpcode(155);
        int int8 = type0.getSize();
        int int9 = type0.getSize();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type12, type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray18);
        java.lang.Class<?> wildcardClass20 = type10.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        boolean boolean26 = type0.equals((java.lang.Object) wildcardClass20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type0.getElementType();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type15.getDimensions();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        boolean boolean4 = type0.equals((java.lang.Object) 4);
        boolean boolean6 = type0.equals((java.lang.Object) 193);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type11, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.getDescriptor();
        int int8 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        java.lang.String str23 = type21.toString();
        int int25 = type21.getOpcode(162);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type21.getDimensions();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type29, type30, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray35);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray35);
        int int39 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier0.newValue(type24);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        int int48 = type47.getSize();
        int int49 = type47.getSize();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type46, type47, type50, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray52);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray52);
        java.lang.String str56 = type41.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier57 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier57.newValue(type58);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier61 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str63 = type62.getClassName();
        int int64 = type62.getSize();
        org.mockito.asm.tree.analysis.Value value65 = basicVerifier61.newValue(type62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier66 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.getClassName();
        int int69 = type67.getSize();
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier66.newValue(type67);
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier57.merge(value65, value70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.VOID_TYPE;
        int int73 = type72.getSize();
        int int74 = type72.getSize();
        java.lang.String str75 = type72.getDescriptor();
        org.mockito.asm.tree.analysis.Value value76 = basicVerifier57.newValue(type72);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value79 = basicVerifier57.newValue(type78);
        java.lang.String str80 = type78.toString();
        boolean boolean81 = type41.equals((java.lang.Object) str80);
        java.lang.String str82 = type41.getClassName();
        org.mockito.asm.tree.analysis.Value value83 = basicVerifier0.newValue(type41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type84 = type41.getElementType();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getClassName();
        int int26 = type24.getSize();
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = type24.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        int int37 = type36.getSize();
        int int38 = type36.getSize();
        java.lang.String str39 = type36.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray40);
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier0.newValue(type24);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: hi!: expected 115, but found null");
        int int46 = type45.getDimensions();
        int int47 = type45.getDimensions();
        org.mockito.asm.tree.analysis.Value value48 = basicVerifier0.newValue(type45);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        java.lang.String str51 = type49.toString();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier0.newValue(type49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = type49.getInternalName();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = type64.getElementType();
        java.lang.String str67 = type64.getDescriptor();
        java.lang.Class<?> wildcardClass68 = type64.getClass();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.toString();
        java.lang.String str73 = type71.toString();
        org.mockito.asm.tree.analysis.Value value74 = basicInterpreter0.newValue(type71);
        int int76 = type71.getOpcode(133);
        int int77 = type71.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int78 = type71.getDimensions();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        java.lang.String str4 = type1.getDescriptor();
        int int6 = type1.getOpcode(160);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        boolean boolean10 = type8.equals((java.lang.Object) "(JVSZ)Z");
        int int11 = type8.getSize();
        boolean boolean12 = type1.equals((java.lang.Object) type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type1.getDimensions();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int3 = type1.getOpcode(101);
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.toString();
        boolean boolean5 = type1.equals((java.lang.Object) type2);
        int int6 = type2.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException9 = new org.mockito.asm.tree.analysis.AnalyzerException("[Lorg/mockito/asm/Type;");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("L(JVSZ)L(JVSZ)V;;", (java.lang.Throwable) analyzerException9);
        boolean boolean11 = type2.equals((java.lang.Object) analyzerException10);
        int int12 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type2.getInternalName();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter4 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value6 = basicInterpreter4.newValue(type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        int int8 = type7.getSize();
        int int9 = type7.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException11 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean12 = type7.equals((java.lang.Object) analyzerException11);
        int int14 = type7.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter4.newValue(type7);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.toString();
        org.mockito.asm.tree.analysis.Value value18 = basicInterpreter4.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        int int20 = type19.getSize();
        int int21 = type19.getSize();
        java.lang.String str22 = type19.getDescriptor();
        int int23 = type19.getSort();
        boolean boolean25 = type19.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.tree.analysis.Value value26 = basicInterpreter4.newValue(type19);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str28 = type27.toString();
        org.mockito.asm.tree.analysis.Value value29 = basicInterpreter4.newValue(type27);
        boolean boolean30 = type0.equals((java.lang.Object) value29);
        java.lang.String str31 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type0.getElementType();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        java.lang.Class<?> wildcardClass1 = basicVerifier0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        int int5 = type3.getOpcode(141);
        int int6 = type3.getSort();
        boolean boolean7 = type2.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str25 = type24.getClassName();
        int int26 = type24.getSize();
        org.mockito.asm.Type[] typeArray28 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = type24.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier31.newValue(type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        int int37 = type36.getSize();
        int int38 = type36.getSize();
        java.lang.String str39 = type36.getDescriptor();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type35, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray40);
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier0.newValue(type24);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        int int46 = type44.getSize();
        boolean boolean48 = type44.equals((java.lang.Object) "(ZV)Lorg.mockito.asm.tree.analysis.AnalyzerException: hi!: expected 18, but found I;");
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier0.newValue(type44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int50 = type44.getDimensions();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type4.getSize();
        int int6 = type4.getSize();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier0.newValue(type4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type4.getInternalName();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type2, type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        java.lang.String str10 = type0.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier13.newValue(type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        java.lang.String str21 = type18.getDescriptor();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type17, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        java.lang.String str26 = type0.toString();
        int int27 = type0.getSort();
        java.lang.String str28 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type0.getDimensions();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str2 = type1.getInternalName();
        int int4 = type1.getOpcode(15);
        org.mockito.asm.Type type5 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (ZV)S: expected void, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        java.lang.String str23 = type21.getDescriptor();
        java.lang.String str24 = type21.getDescriptor();
        int int26 = type21.getOpcode(128);
        java.lang.String str27 = type21.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type21.getElementType();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str2 = type1.getClassName();
        int int4 = type1.getOpcode(83);
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)I");
        java.lang.String str2 = type1.getClassName();
        int int4 = type1.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type1.getInternalName();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        java.lang.String str4 = type1.getDescriptor();
        int int6 = type1.getOpcode(155);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type1.getDimensions();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)V");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier2 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier3 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier3.newValue(type4);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier2.merge(value7, value12);
        boolean boolean14 = type1.equals((java.lang.Object) value12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.Type[] typeArray19 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        int int23 = type1.getOpcode(168);
        org.mockito.asm.Type type24 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type24.getElementType();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 3);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType("(JVSZ)Lorg.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)V;");
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getReturnType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier11 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier11.newValue(type12);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSize();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier15.newValue(type16);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        int int23 = type21.getSize();
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier11.merge(value19, value24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        java.lang.String str29 = type26.getDescriptor();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier11.newValue(type26);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier11.newValue(type32);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier38 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str40 = type39.getClassName();
        int int41 = type39.getSize();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier38.newValue(type39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier43 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        int int46 = type44.getSize();
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier43.newValue(type44);
        org.mockito.asm.tree.analysis.Value value48 = basicVerifier34.merge(value42, value47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        int int50 = type49.getSize();
        int int51 = type49.getSize();
        java.lang.String str52 = type49.getDescriptor();
        org.mockito.asm.tree.analysis.Value value53 = basicVerifier34.newValue(type49);
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier11.newValue(type49);
        int int56 = type49.getOpcode(5);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getObjectType("(JVSZ)V");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier59 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier60 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str62 = type61.getClassName();
        int int63 = type61.getSize();
        org.mockito.asm.tree.analysis.Value value64 = basicVerifier60.newValue(type61);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier65 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str67 = type66.getClassName();
        int int68 = type66.getSize();
        org.mockito.asm.tree.analysis.Value value69 = basicVerifier65.newValue(type66);
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier59.merge(value64, value69);
        boolean boolean71 = type58.equals((java.lang.Object) value69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str73 = type72.getClassName();
        int int74 = type72.getSize();
        org.mockito.asm.Type[] typeArray76 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type72, typeArray76);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray76);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray76);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray76);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray76);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int83 = type1.getDimensions();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        java.lang.String str8 = type0.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str10 = type9.getClassName();
        boolean boolean12 = type9.equals((java.lang.Object) "boolean");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        int int25 = type23.getSize();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier13.merge(value21, value26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        int int32 = type31.getSize();
        int int33 = type31.getSize();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type30, type31, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        int int38 = type28.getSort();
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier13.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier40 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier40.newValue(type41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        int int46 = type45.getSize();
        int int47 = type45.getSize();
        java.lang.String str48 = type45.getDescriptor();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type44, type45 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray49);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray49);
        java.lang.String str52 = type28.getClassName();
        java.lang.String str53 = type28.getClassName();
        boolean boolean54 = type9.equals((java.lang.Object) str53);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier55 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str57 = type56.getClassName();
        org.mockito.asm.tree.analysis.Value value58 = basicVerifier55.newValue(type56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        int int61 = type60.getSize();
        int int62 = type60.getSize();
        java.lang.String str63 = type60.getDescriptor();
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type59, type60 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray64);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray64);
        int int68 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = type0.getInternalName();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier23.newValue(type24);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        int int30 = type28.getSize();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        int int35 = type33.getSize();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier32.newValue(type33);
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier23.merge(value31, value36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        int int39 = type38.getSize();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getDescriptor();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier23.newValue(type38);
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier0.newValue(type38);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter44 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value46 = basicInterpreter44.newValue(type45);
        boolean boolean48 = type45.equals((java.lang.Object) 169);
        boolean boolean49 = type38.equals((java.lang.Object) 169);
        java.lang.String str50 = type38.toString();
        java.lang.String str51 = type38.toString();
        int int53 = type38.getOpcode(258);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type54 = type38.getElementType();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(ZV)LZ;");
        int int3 = type1.getOpcode((int) 'a');
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type6 = type5.getElementType();
        boolean boolean8 = type5.equals((java.lang.Object) 165);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        boolean boolean13 = type9.equals((java.lang.Object) 4);
        boolean boolean15 = type9.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier16.newValue(type17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        int int23 = type21.getSize();
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        int int28 = type26.getSize();
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier16.merge(value24, value29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        int int35 = type34.getSize();
        int int36 = type34.getSize();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type33, type34, type37, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray39);
        int int41 = type31.getSort();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier16.newValue(type31);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier43 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier43.newValue(type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        int int49 = type48.getSize();
        int int50 = type48.getSize();
        java.lang.String str51 = type48.getDescriptor();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type47, type48 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray52);
        boolean boolean55 = type9.equals((java.lang.Object) typeArray52);
        int int56 = type9.getSize();
        boolean boolean57 = type5.equals((java.lang.Object) type9);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        int int63 = type62.getSize();
        int int64 = type62.getSize();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type61, type62, type65, type66 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray67);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray67);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray67);
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray67);
        org.mockito.asm.Type type72 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int73 = type72.getDimensions();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        boolean boolean4 = type0.equals((java.lang.Object) 4);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        java.lang.String str8 = type0.toString();
        int int9 = type0.getSort();
        java.lang.String str10 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        org.mockito.asm.tree.analysis.Value value5 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        int int9 = type7.getSize();
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.merge(value5, value10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier12.newValue(type13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = type17.getElementType();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier12.newValue(type17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        int int22 = type21.getSize();
        int int23 = type21.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException25 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean26 = type21.equals((java.lang.Object) analyzerException25);
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier12.newValue(type21);
        java.lang.String str28 = type21.getClassName();
        java.lang.String str29 = type21.toString();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier0.newValue(type21);
        java.lang.String str31 = type21.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type21.getElementType();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type5, type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
        java.lang.String str15 = type0.toString();
        int int17 = type0.getOpcode(260);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type0.getElementType();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: L(JVSZ)F;: expected org/mockito/asm/tree/analysis/AnalyzerException, but found D");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type5, type6, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
        java.lang.String str15 = type0.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier16 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier16.newValue(type17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        int int23 = type21.getSize();
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        int int28 = type26.getSize();
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier16.merge(value24, value29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.VOID_TYPE;
        int int32 = type31.getSize();
        int int33 = type31.getSize();
        java.lang.String str34 = type31.getDescriptor();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier16.newValue(type31);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier16.newValue(type37);
        java.lang.String str39 = type37.toString();
        boolean boolean40 = type0.equals((java.lang.Object) str39);
        int int41 = type0.getSort();
        int int43 = type0.getOpcode(8192);
        java.lang.String str44 = type0.toString();
        int int46 = type0.getOpcode(212);
        java.lang.String str47 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type0.getInternalName();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type2, type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        java.lang.Class<?> wildcardClass10 = type0.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str12 = type11.getDescriptor();
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter13 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value15 = basicInterpreter13.newValue(type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        int int17 = type16.getSize();
        int int18 = type16.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException20 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean21 = type16.equals((java.lang.Object) analyzerException20);
        int int23 = type16.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value24 = basicInterpreter13.newValue(type16);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.toString();
        org.mockito.asm.tree.analysis.Value value27 = basicInterpreter13.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        int int29 = type28.getSize();
        int int30 = type28.getSize();
        java.lang.String str31 = type28.getDescriptor();
        int int32 = type28.getSort();
        boolean boolean34 = type28.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.tree.analysis.Value value35 = basicInterpreter13.newValue(type28);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str37 = type36.toString();
        org.mockito.asm.tree.analysis.Value value38 = basicInterpreter13.newValue(type36);
        boolean boolean39 = type11.equals((java.lang.Object) basicInterpreter13);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        int int44 = type43.getSize();
        int int45 = type43.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type42, type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray48);
        java.lang.Class<?> wildcardClass50 = type40.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        org.mockito.asm.tree.analysis.Value value55 = basicInterpreter13.newValue(type54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)Z: expected 183, but found I");
        int int59 = type57.getOpcode(131072);
        org.mockito.asm.tree.analysis.Value value60 = basicInterpreter13.newValue(type57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str61 = type57.getInternalName();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) 93);
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getDescriptor();
        int int7 = type0.getOpcode(4096);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        int int11 = type9.getOpcode(151);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(ZV)Z");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        java.lang.String str18 = type0.toString();
        java.lang.String str19 = type0.toString();
        java.lang.String str20 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I;");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(68);
        int int4 = type0.getSize();
        int int6 = type0.getOpcode(76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        java.lang.String str39 = type15.getClassName();
        java.lang.String str40 = type15.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type15.getDimensions();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type29, type30, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray35);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray35);
        int int39 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier0.newValue(type24);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str42 = type41.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        int int48 = type47.getSize();
        int int49 = type47.getSize();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type46, type47, type50, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray52);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray52);
        java.lang.String str56 = type41.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier57 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier57.newValue(type58);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier61 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str63 = type62.getClassName();
        int int64 = type62.getSize();
        org.mockito.asm.tree.analysis.Value value65 = basicVerifier61.newValue(type62);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier66 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str68 = type67.getClassName();
        int int69 = type67.getSize();
        org.mockito.asm.tree.analysis.Value value70 = basicVerifier66.newValue(type67);
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier57.merge(value65, value70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.VOID_TYPE;
        int int73 = type72.getSize();
        int int74 = type72.getSize();
        java.lang.String str75 = type72.getDescriptor();
        org.mockito.asm.tree.analysis.Value value76 = basicVerifier57.newValue(type72);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value79 = basicVerifier57.newValue(type78);
        java.lang.String str80 = type78.toString();
        boolean boolean81 = type41.equals((java.lang.Object) str80);
        java.lang.String str82 = type41.getClassName();
        org.mockito.asm.tree.analysis.Value value83 = basicVerifier0.newValue(type41);
        java.lang.String str84 = type41.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type85 = type41.getElementType();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)V");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int4 = type1.getOpcode(195);
        int int6 = type1.getOpcode(60);
        org.mockito.asm.Type type7 = type1.getElementType();
        int int8 = type7.getSort();
        java.lang.String str9 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type7.getInternalName();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException7 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean8 = type3.equals((java.lang.Object) analyzerException7);
        int int10 = type3.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value11 = basicInterpreter0.newValue(type3);
        int int13 = type3.getOpcode((int) (byte) -1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        java.lang.Class<?> wildcardClass15 = basicVerifier14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier17.newValue(type18);
        int int21 = type18.getSort();
        int int22 = type18.getSize();
        boolean boolean24 = type18.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        int int44 = type43.getSize();
        int int45 = type43.getSize();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type42, type43, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray48);
        int int50 = type40.getSort();
        org.mockito.asm.tree.analysis.Value value51 = basicVerifier25.newValue(type40);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier52 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier52.newValue(type53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        int int58 = type57.getSize();
        int int59 = type57.getSize();
        java.lang.String str60 = type57.getDescriptor();
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type56, type57 };
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray61);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray61);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray61);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray61);
        java.lang.String str67 = type3.getClassName();
        java.lang.String str68 = type3.toString();
        int int70 = type3.getOpcode(29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int71 = type3.getDimensions();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        boolean boolean3 = type1.equals((java.lang.Object) "(JVSZ)Z");
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getClassName();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.getDescriptor();
        int int8 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(68);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        boolean boolean6 = type2.equals((java.lang.Object) 4);
        boolean boolean8 = type2.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier18 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        int int21 = type19.getSize();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier18.newValue(type19);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier9.merge(value17, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        int int28 = type27.getSize();
        int int29 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        int int34 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier9.newValue(type24);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier36 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier36.newValue(type37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type40, type41 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray45);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray45);
        boolean boolean48 = type2.equals((java.lang.Object) typeArray45);
        int int49 = type2.getSize();
        int int50 = type2.getSort();
        java.lang.String str51 = type2.toString();
        int int52 = type2.getSort();
        boolean boolean53 = type1.equals((java.lang.Object) type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str54 = type1.getInternalName();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        java.lang.String str21 = type11.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type29 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray33);
        java.lang.String str38 = type4.getClassName();
        java.lang.String str39 = type4.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type4.getDimensions();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        boolean boolean4 = type0.equals((java.lang.Object) 4);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.toString();
        java.lang.String str8 = type0.toString();
        int int9 = type0.getSort();
        java.lang.String str10 = type0.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("org.mockito.asm.tree.analysis.AnalyzerException: L(JVSZ)Z;");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("void");
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException16 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException: ");
        analyzerException14.addSuppressed((java.lang.Throwable) analyzerException16);
        boolean boolean18 = type12.equals((java.lang.Object) analyzerException16);
        org.mockito.asm.Type type19 = type12.getElementType();
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(ZV)LL(JVSZ)Z;;");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type0.getInternalName();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        java.lang.String str11 = type4.toString();
        int int12 = type4.getSort();
        int int13 = type4.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        int int18 = type17.getSize();
        int int19 = type17.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type16, type17, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray22);
        java.lang.Class<?> wildcardClass24 = type14.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        boolean boolean30 = type4.equals((java.lang.Object) str29);
        java.lang.String str31 = type4.getClassName();
        java.lang.String str32 = type4.getClassName();
        int int33 = type4.getSort();
        int int35 = type4.getOpcode(141);
        int int36 = type4.getSort();
        int int37 = type4.getSort();
        int int38 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type4.getDimensions();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.toString();
        boolean boolean5 = type1.equals((java.lang.Object) type2);
        int int6 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        java.lang.String str27 = type15.getDescriptor();
        int int28 = type15.getSort();
        int int29 = type15.getSize();
        java.lang.String str30 = type15.toString();
        int int31 = type15.getSize();
        int int33 = type15.getOpcode(90);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str34 = type15.getInternalName();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        int int33 = type32.getSize();
        int int34 = type32.getSize();
        java.lang.String str35 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type31, type32 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type15.getInternalName();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: hi!: expected 18, but found I");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type4, type5, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray10);
        java.lang.String str12 = type2.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        java.lang.String str23 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray24);
        java.lang.String str28 = type2.toString();
        boolean boolean29 = type1.equals((java.lang.Object) type2);
        int int30 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type2.getElementType();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("(JVSZ)V");
        org.mockito.asm.Type type5 = type4.getElementType();
        int int7 = type4.getOpcode(195);
        int int9 = type4.getOpcode(194);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier10.newValue(type11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        int int22 = type20.getSize();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier10.merge(value18, value23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        int int26 = type25.getSize();
        int int27 = type25.getSize();
        java.lang.String str28 = type25.getDescriptor();
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier10.newValue(type25);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier10.newValue(type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        int int38 = type37.getSize();
        int int39 = type37.getSize();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type36, type37, type40, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray42);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray42);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray42);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type1.getElementType();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        int int31 = type30.getSize();
        int int32 = type30.getSize();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type29, type30, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray35);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray35);
        int int39 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier0.newValue(type24);
        java.lang.String str41 = type24.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type24.getInternalName();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (ZV)F");
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = type1.getElementType();
        int int5 = type3.getOpcode(113);
        java.lang.String str6 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type3.getInternalName();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        int int8 = type4.getOpcode(99);
        java.lang.String str9 = type4.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        int int14 = type13.getSize();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type12, type13, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray18);
        java.lang.Class<?> wildcardClass20 = type10.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        int int28 = type27.getSize();
        int int29 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        java.lang.String str34 = type24.getDescriptor();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier37 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier37.newValue(type38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        int int43 = type42.getSize();
        int int44 = type42.getSize();
        java.lang.String str45 = type42.getDescriptor();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type41, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray46);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray46);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray46);
        java.lang.String str51 = type23.getInternalName();
        int int52 = type23.getSort();
        boolean boolean53 = type4.equals((java.lang.Object) type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int54 = type4.getDimensions();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        int int25 = type24.getSize();
        int int26 = type24.getSize();
        java.lang.String str27 = type24.getDescriptor();
        boolean boolean29 = type24.equals((java.lang.Object) 129);
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier0.newValue(type24);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str33 = type32.toString();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier0.newValue(type32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        boolean boolean39 = type35.equals((java.lang.Object) 4);
        boolean boolean41 = type35.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier42 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.tree.analysis.Value value45 = basicVerifier42.newValue(type43);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier46 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        org.mockito.asm.tree.analysis.Value value50 = basicVerifier46.newValue(type47);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier51 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str53 = type52.getClassName();
        int int54 = type52.getSize();
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier51.newValue(type52);
        org.mockito.asm.tree.analysis.Value value56 = basicVerifier42.merge(value50, value55);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        int int61 = type60.getSize();
        int int62 = type60.getSize();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type59, type60, type63, type64 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray65);
        int int67 = type57.getSort();
        org.mockito.asm.tree.analysis.Value value68 = basicVerifier42.newValue(type57);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier69 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str71 = type70.getClassName();
        org.mockito.asm.tree.analysis.Value value72 = basicVerifier69.newValue(type70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type74 = org.mockito.asm.Type.VOID_TYPE;
        int int75 = type74.getSize();
        int int76 = type74.getSize();
        java.lang.String str77 = type74.getDescriptor();
        org.mockito.asm.Type[] typeArray78 = new org.mockito.asm.Type[] { type73, type74 };
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type70, typeArray78);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray78);
        boolean boolean81 = type35.equals((java.lang.Object) typeArray78);
        int int82 = type35.getSize();
        int int83 = type35.getSort();
        org.mockito.asm.tree.analysis.Value value84 = basicVerifier0.newValue(type35);
        int int85 = type35.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int86 = type35.getDimensions();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I");
        int int3 = type1.getOpcode(120);
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 142);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter3 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicInterpreter3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean11 = type6.equals((java.lang.Object) analyzerException10);
        int int13 = type6.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value14 = basicInterpreter3.newValue(type6);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.tree.analysis.Value value17 = basicInterpreter3.newValue(type15);
        boolean boolean18 = type0.equals((java.lang.Object) value17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        boolean boolean22 = type20.equals((java.lang.Object) "(JVSZ)Z");
        int int23 = type20.getSize();
        java.lang.String str24 = type20.getClassName();
        java.lang.String str25 = type20.getDescriptor();
        boolean boolean26 = type0.equals((java.lang.Object) type20);
        int int27 = type20.getSort();
        int int28 = type20.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type20.getDimensions();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)F");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        int int4 = type1.getDimensions();
        int int5 = type1.getDimensions();
        org.mockito.asm.Type type6 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        java.lang.String str23 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier0.newValue(type16);
        boolean boolean31 = type16.equals((java.lang.Object) "org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)Lorg/mockito/asm/tree/analysis/BasicVerifier;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type16.getElementType();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        int int4 = type1.getOpcode((int) 'a');
        int int5 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        boolean boolean5 = type1.equals((java.lang.Object) 4);
        boolean boolean7 = type1.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        int int15 = type13.getSize();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier8.merge(value16, value21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type25, type26, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray31);
        int int33 = type23.getSort();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier8.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray44);
        boolean boolean47 = type1.equals((java.lang.Object) typeArray44);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier51 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier51.newValue(type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getClassName();
        int int57 = type55.getSize();
        org.mockito.asm.Type[] typeArray59 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray59);
        org.mockito.asm.tree.analysis.Value value61 = basicVerifier51.newValue(type55);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException62 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException: ", (java.lang.Object) type49, value61);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException63 = new org.mockito.asm.tree.analysis.AnalyzerException("(JVSZ)L(JVSZ)V;", (java.lang.Object) type1, value61);
        boolean boolean65 = type1.equals((java.lang.Object) "(JVSZ)V");
        java.lang.String str66 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str67 = type1.getInternalName();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) 142);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter3 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value5 = basicInterpreter3.newValue(type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        int int7 = type6.getSize();
        int int8 = type6.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException10 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean11 = type6.equals((java.lang.Object) analyzerException10);
        int int13 = type6.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value14 = basicInterpreter3.newValue(type6);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str16 = type15.toString();
        org.mockito.asm.tree.analysis.Value value17 = basicInterpreter3.newValue(type15);
        boolean boolean18 = type0.equals((java.lang.Object) value17);
        java.lang.String str19 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str2 = type1.getInternalName();
        int int4 = type1.getOpcode(15);
        org.mockito.asm.Type type5 = type1.getElementType();
        org.mockito.asm.Type type6 = type1.getElementType();
        int int7 = type1.getSize();
        org.mockito.asm.Type type8 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type2, type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        java.lang.String str10 = type0.getDescriptor();
        java.lang.String str11 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        boolean boolean5 = type1.equals((java.lang.Object) 4);
        boolean boolean7 = type1.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        int int15 = type13.getSize();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier8.merge(value16, value21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type25, type26, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray31);
        int int33 = type23.getSort();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier8.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray44);
        boolean boolean47 = type1.equals((java.lang.Object) typeArray44);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier51 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier51.newValue(type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str56 = type55.getClassName();
        int int57 = type55.getSize();
        org.mockito.asm.Type[] typeArray59 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray59);
        org.mockito.asm.tree.analysis.Value value61 = basicVerifier51.newValue(type55);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException62 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException: ", (java.lang.Object) type49, value61);
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException63 = new org.mockito.asm.tree.analysis.AnalyzerException("(JVSZ)L(JVSZ)V;", (java.lang.Object) type1, value61);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.VOID_TYPE;
        int int65 = type64.getSize();
        int int66 = type64.getSize();
        java.lang.String str67 = type64.getDescriptor();
        int int68 = type64.getSort();
        boolean boolean70 = type64.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass71 = type64.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass71);
        java.lang.String str73 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass71);
        boolean boolean74 = type1.equals((java.lang.Object) str73);
        int int75 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str76 = type1.getInternalName();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        java.lang.String str27 = type15.getDescriptor();
        int int28 = type15.getSort();
        java.lang.String str29 = type15.getClassName();
        java.lang.String str30 = type15.toString();
        int int32 = type15.getOpcode(196653);
        java.lang.String str33 = type15.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type34 = type15.getElementType();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)F");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        int int4 = type1.getSort();
        java.lang.String str5 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier23.newValue(type24);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        int int30 = type28.getSize();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        int int35 = type33.getSize();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier32.newValue(type33);
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier23.merge(value31, value36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        int int39 = type38.getSize();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getDescriptor();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier23.newValue(type38);
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier0.newValue(type38);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str45 = type44.getClassName();
        int int46 = type44.getSize();
        boolean boolean48 = type44.equals((java.lang.Object) 4);
        boolean boolean50 = type44.equals((java.lang.Object) 193);
        java.lang.String str51 = type44.toString();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier0.newValue(type44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = type44.getInternalName();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier23.newValue(type24);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        int int30 = type28.getSize();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        int int35 = type33.getSize();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier32.newValue(type33);
        org.mockito.asm.tree.analysis.Value value37 = basicVerifier23.merge(value31, value36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        int int39 = type38.getSize();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getDescriptor();
        org.mockito.asm.tree.analysis.Value value42 = basicVerifier23.newValue(type38);
        org.mockito.asm.tree.analysis.Value value43 = basicVerifier0.newValue(type38);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str46 = type45.getInternalName();
        int int48 = type45.getOpcode(173);
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier0.newValue(type45);
        org.mockito.asm.Type type50 = type45.getElementType();
        org.mockito.asm.Type type51 = type45.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type52 = type51.getElementType();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        boolean boolean4 = type0.equals((java.lang.Object) 4);
        boolean boolean6 = type0.equals((java.lang.Object) 193);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        int int12 = type11.getSize();
        int int13 = type11.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type11, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
        int int20 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter0.newValue(type63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str67 = type66.toString();
        int int69 = type66.getOpcode((int) (short) -1);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str71 = type66.getInternalName();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        java.lang.String str3 = type0.getDescriptor();
        boolean boolean5 = type0.equals((java.lang.Object) 129);
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.getDescriptor();
        java.lang.String str8 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSort();
        int int6 = type1.getSize();
        int int7 = type1.getSort();
        org.mockito.asm.Type type8 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type8.getElementType();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        int int45 = type41.getSort();
        boolean boolean47 = type41.equals((java.lang.Object) (byte) 0);
        int int48 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicInterpreter0.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.tree.analysis.Value value52 = basicInterpreter0.newValue(type51);
        int int53 = type51.getSize();
        int int55 = type51.getOpcode(102);
        java.lang.String str56 = type51.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int57 = type51.getDimensions();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException4 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean5 = type0.equals((java.lang.Object) analyzerException4);
        int int7 = type0.getOpcode(155);
        int int8 = type0.getSize();
        java.lang.String str9 = type0.getDescriptor();
        java.lang.String str10 = type0.getDescriptor();
        int int12 = type0.getOpcode(93);
        int int13 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type0.getElementType();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        int int20 = type15.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("D");
        int int23 = type22.getSort();
        boolean boolean24 = type15.equals((java.lang.Object) int23);
        java.lang.String str25 = type15.toString();
        int int26 = type15.getSize();
        java.lang.String str27 = type15.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type15.getInternalName();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)Z: expected 183, but found I");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        boolean boolean3 = type0.equals((java.lang.Object) "org.mockito.asm.tree.analysis.AnalyzerException: L(JVSZ)Z;: expected 1, but found I");
        int int5 = type0.getOpcode(148);
        int int7 = type0.getOpcode(197);
        int int9 = type0.getOpcode(150);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)V");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int4 = type1.getOpcode(195);
        int int6 = type1.getOpcode(60);
        org.mockito.asm.Type type7 = type1.getElementType();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str13 = type12.getClassName();
        int int14 = type12.getSize();
        org.mockito.asm.Type[] typeArray16 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier8.newValue(type12);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        int int23 = type22.getSize();
        int int24 = type22.getSize();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type21, type22, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray27);
        java.lang.String str29 = type19.getDescriptor();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier32.newValue(type33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        int int38 = type37.getSize();
        int int39 = type37.getSize();
        java.lang.String str40 = type37.getDescriptor();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type36, type37 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray41);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray41);
        int int47 = type12.getOpcode(19);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str49 = type48.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        int int55 = type54.getSize();
        int int56 = type54.getSize();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type53, type54, type57, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray59);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray59);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getClassName();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.VOID_TYPE;
        int int67 = type66.getSize();
        int int68 = type66.getSize();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type65, type66, type69, type70 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray71);
        java.lang.String str73 = type63.getDescriptor();
        org.mockito.asm.Type type75 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier76 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str78 = type77.getClassName();
        org.mockito.asm.tree.analysis.Value value79 = basicVerifier76.newValue(type77);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.VOID_TYPE;
        int int82 = type81.getSize();
        int int83 = type81.getSize();
        java.lang.String str84 = type81.getDescriptor();
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] { type80, type81 };
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type77, typeArray85);
        java.lang.String str87 = org.mockito.asm.Type.getMethodDescriptor(type75, typeArray85);
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray85);
        org.mockito.asm.Type[] typeArray90 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str91 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray90);
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray90);
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray90);
        java.lang.String str94 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray90);
        int int95 = type7.getSize();
        int int96 = type7.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str97 = type7.getInternalName();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = type5.getElementType();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier0.newValue(type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException13 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean14 = type9.equals((java.lang.Object) analyzerException13);
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type9);
        java.lang.String str16 = type9.getClassName();
        java.lang.String str17 = type9.toString();
        java.lang.String str18 = type9.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type9.getDimensions();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        int int42 = type41.getSize();
        int int43 = type41.getSize();
        java.lang.String str44 = type41.getDescriptor();
        int int45 = type41.getSort();
        boolean boolean47 = type41.equals((java.lang.Object) (byte) 0);
        int int48 = type41.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicInterpreter0.newValue(type41);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.tree.analysis.Value value52 = basicInterpreter0.newValue(type51);
        int int53 = type51.getSize();
        int int55 = type51.getOpcode(143);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type56 = type51.getElementType();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int3 = type1.getOpcode(101);
        java.lang.String str4 = type1.getClassName();
        java.lang.String str5 = type1.getClassName();
        int int6 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) 93);
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getDescriptor();
        int int7 = type0.getOpcode(4096);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        int int11 = type9.getOpcode(151);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(ZV)Z");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type0.getElementType();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JVSZ)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value2 = basicInterpreter0.newValue(type1);
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(JVSZ)V");
        org.mockito.asm.Type type2 = type1.getElementType();
        int int4 = type1.getOpcode(195);
        int int6 = type1.getOpcode(60);
        org.mockito.asm.Type type7 = type1.getElementType();
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type7.getInternalName();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        java.lang.String str11 = type4.getClassName();
        int int12 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type4.getInternalName();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter7 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value9 = basicInterpreter7.newValue(type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        int int11 = type10.getSize();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException14 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean15 = type10.equals((java.lang.Object) analyzerException14);
        int int17 = type10.getOpcode(155);
        org.mockito.asm.tree.analysis.Value value18 = basicInterpreter7.newValue(type10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.toString();
        org.mockito.asm.tree.analysis.Value value21 = basicInterpreter7.newValue(type19);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type19);
        java.lang.String str23 = type19.getClassName();
        int int24 = type19.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type19.getDimensions();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter0.newValue(type63);
        int int66 = type63.getSort();
        java.lang.String str67 = type63.toString();
        int int69 = type63.getOpcode(26);
        java.lang.String str70 = type63.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str71 = type63.getInternalName();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        java.lang.String str23 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier0.newValue(type16);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier0.newValue(type30);
        int int34 = type30.getOpcode(1028);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type30.getElementType();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(165);
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Ldouble;");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (JVSZ)V");
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier0.newValue(type6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier0.newValue(type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("Lorg/mockito/asm/tree/analysis/AnalyzerException;");
        int int14 = type13.getSort();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException16 = new org.mockito.asm.tree.analysis.AnalyzerException("org.mockito.asm.tree.analysis.AnalyzerException: org/mockito/asm/tree/analysis/BasicValue: expected org.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I, but found F");
        java.lang.Throwable[] throwableArray17 = analyzerException16.getSuppressed();
        boolean boolean18 = type13.equals((java.lang.Object) analyzerException16);
        java.lang.String str19 = type13.getInternalName();
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier0.newValue(type13);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("(ZV)Lorg/mockito/asm/tree/analysis/BasicValue;");
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.newValue(type22);
        org.mockito.asm.Type type24 = type22.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type24.getElementType();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        int int8 = type4.getOpcode(99);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSize();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray15);
        int int19 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type4.getInternalName();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        int int14 = type1.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        boolean boolean19 = type15.equals((java.lang.Object) 4);
        boolean boolean21 = type15.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier26 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        int int29 = type27.getSize();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier26.newValue(type27);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier22.merge(value30, value35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type39, type40, type43, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray45);
        int int47 = type37.getSort();
        org.mockito.asm.tree.analysis.Value value48 = basicVerifier22.newValue(type37);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier49 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier49.newValue(type50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        int int55 = type54.getSize();
        int int56 = type54.getSize();
        java.lang.String str57 = type54.getDescriptor();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type53, type54 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray58);
        boolean boolean61 = type15.equals((java.lang.Object) typeArray58);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray58);
        int int64 = type1.getOpcode(512);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str65 = type1.getInternalName();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int4 = type3.getSize();
        int int5 = type3.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type2, type3, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        java.lang.String str10 = type0.getDescriptor();
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        java.lang.String str21 = type11.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type29 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray33);
        java.lang.String str38 = type4.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getReturnType("(ZV)D");
        boolean boolean41 = type4.equals((java.lang.Object) "(ZV)D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type4.getInternalName();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str64 = type63.getDescriptor();
        org.mockito.asm.tree.analysis.Value value65 = basicInterpreter0.newValue(type63);
        int int66 = type63.getSort();
        java.lang.String str67 = type63.toString();
        int int69 = type63.getOpcode(26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type70 = type63.getElementType();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org.mockito.asm.tree.analysis.AnalyzerException: L(JVSZ)F;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int16 = type15.getSize();
        int int17 = type15.getSize();
        java.lang.String str18 = type15.getDescriptor();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier0.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier23 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier23.newValue(type25);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier27 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier27.newValue(type28);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier36 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        int int39 = type37.getSize();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier36.newValue(type37);
        org.mockito.asm.tree.analysis.Value value41 = basicVerifier27.merge(value35, value40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        int int46 = type45.getSize();
        int int47 = type45.getSize();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type44, type45, type48, type49 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray50);
        int int52 = type42.getSort();
        org.mockito.asm.tree.analysis.Value value53 = basicVerifier27.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier54 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.tree.analysis.Value value57 = basicVerifier54.newValue(type55);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier58 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str60 = type59.getClassName();
        int int61 = type59.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicVerifier58.newValue(type59);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier63 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str65 = type64.getClassName();
        int int66 = type64.getSize();
        org.mockito.asm.tree.analysis.Value value67 = basicVerifier63.newValue(type64);
        org.mockito.asm.tree.analysis.Value value68 = basicVerifier54.merge(value62, value67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        int int70 = type69.getSize();
        int int71 = type69.getSize();
        java.lang.String str72 = type69.getDescriptor();
        org.mockito.asm.tree.analysis.Value value73 = basicVerifier54.newValue(type69);
        org.mockito.asm.tree.analysis.Value value74 = basicVerifier27.newValue(type69);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str76 = type75.getClassName();
        int int77 = type75.getSize();
        boolean boolean79 = type75.equals((java.lang.Object) 4);
        int int80 = type75.getSort();
        org.mockito.asm.tree.analysis.Value value81 = basicVerifier27.newValue(type75);
        org.mockito.asm.tree.analysis.Value value82 = basicVerifier0.merge(value26, value81);
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter83 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.tree.analysis.Value value85 = basicInterpreter83.newValue(type84);
        int int87 = type84.getOpcode((int) 'a');
        java.lang.String str88 = type84.toString();
        java.lang.String str89 = type84.toString();
        org.mockito.asm.tree.analysis.Value value90 = basicVerifier0.newValue(type84);
        java.lang.String str91 = type84.getClassName();
        java.lang.String str92 = type84.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int93 = type84.getDimensions();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        int int3 = type1.getOpcode(101);
        java.lang.String str4 = type1.getClassName();
        int int6 = type1.getOpcode(5);
        int int7 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(68);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        int int4 = type1.getSort();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        int int24 = type23.getSize();
        int int25 = type23.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type22, type23, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray28);
        int int30 = type20.getSort();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier5.newValue(type20);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier32 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier32.newValue(type33);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier36 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        int int39 = type37.getSize();
        org.mockito.asm.tree.analysis.Value value40 = basicVerifier36.newValue(type37);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        int int44 = type42.getSize();
        org.mockito.asm.tree.analysis.Value value45 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier32.merge(value40, value45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        int int48 = type47.getSize();
        int int49 = type47.getSize();
        java.lang.String str50 = type47.getDescriptor();
        org.mockito.asm.tree.analysis.Value value51 = basicVerifier32.newValue(type47);
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier5.newValue(type47);
        boolean boolean53 = type1.equals((java.lang.Object) type47);
        java.lang.String str54 = type47.toString();
        java.lang.String str55 = type47.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int56 = type47.getDimensions();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        java.lang.String str21 = type11.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type29 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray33);
        int int39 = type4.getOpcode(19);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        int int47 = type46.getSize();
        int int48 = type46.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type45, type46, type49, type50 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        int int59 = type58.getSize();
        int int60 = type58.getSize();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type57, type58, type61, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray63);
        java.lang.String str65 = type55.getDescriptor();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str70 = type69.getClassName();
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier68.newValue(type69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.VOID_TYPE;
        int int74 = type73.getSize();
        int int75 = type73.getSize();
        java.lang.String str76 = type73.getDescriptor();
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type72, type73 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type67, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray82);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray82);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = type4.getElementType();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int5 = type4.getSort();
        org.mockito.asm.tree.analysis.Value value6 = basicVerifier0.newValue(type4);
        int int8 = type4.getOpcode(99);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSize();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type4.getDimensions();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        java.lang.String str27 = type15.toString();
        java.lang.String str28 = type15.getDescriptor();
        java.lang.String str29 = type15.getClassName();
        java.lang.String str30 = type15.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type15.getElementType();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lorg.mockito.asm.tree.analysis.AnalyzerException: L(JVSZ)V;;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.toString();
        boolean boolean5 = type1.equals((java.lang.Object) type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.tree.analysis.Value value9 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSize();
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier10.newValue(type11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSize();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier15.newValue(type16);
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier6.merge(value14, value19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        int int25 = type24.getSize();
        int int26 = type24.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type23, type24, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray29);
        int int31 = type21.getSort();
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier6.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier33 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier33.newValue(type34);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier37 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str39 = type38.getClassName();
        int int40 = type38.getSize();
        org.mockito.asm.tree.analysis.Value value41 = basicVerifier37.newValue(type38);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier42 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        int int45 = type43.getSize();
        org.mockito.asm.tree.analysis.Value value46 = basicVerifier42.newValue(type43);
        org.mockito.asm.tree.analysis.Value value47 = basicVerifier33.merge(value41, value46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        int int49 = type48.getSize();
        int int50 = type48.getSize();
        java.lang.String str51 = type48.getDescriptor();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier33.newValue(type48);
        org.mockito.asm.tree.analysis.Value value53 = basicVerifier6.newValue(type48);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str55 = type54.getClassName();
        int int56 = type54.getSize();
        boolean boolean58 = type54.equals((java.lang.Object) 4);
        int int59 = type54.getSort();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier6.newValue(type54);
        java.lang.Class<?> wildcardClass61 = value60.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        java.lang.String str63 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        java.lang.String str65 = type64.getInternalName();
        java.lang.String str66 = type64.getInternalName();
        java.lang.String str67 = type64.getDescriptor();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier70 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str72 = type71.getClassName();
        org.mockito.asm.tree.analysis.Value value73 = basicVerifier70.newValue(type71);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type75 = org.mockito.asm.Type.VOID_TYPE;
        int int76 = type75.getSize();
        int int77 = type75.getSize();
        java.lang.String str78 = type75.getDescriptor();
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type74, type75 };
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type71, typeArray79);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray79);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier82 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str84 = type83.getClassName();
        org.mockito.asm.tree.analysis.Value value85 = basicVerifier82.newValue(type83);
        org.mockito.asm.Type type86 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type87 = org.mockito.asm.Type.VOID_TYPE;
        int int88 = type87.getSize();
        int int89 = type87.getSize();
        java.lang.String str90 = type87.getDescriptor();
        org.mockito.asm.Type[] typeArray91 = new org.mockito.asm.Type[] { type86, type87 };
        java.lang.String str92 = org.mockito.asm.Type.getMethodDescriptor(type83, typeArray91);
        java.lang.String str93 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray91);
        java.lang.String str94 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray91);
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int96 = type1.getDimensions();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = type64.getElementType();
        java.lang.String str67 = type64.getDescriptor();
        java.lang.Class<?> wildcardClass68 = type64.getClass();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str73 = type72.getClassName();
        int int75 = type72.getOpcode(83);
        org.mockito.asm.tree.analysis.Value value76 = basicInterpreter0.newValue(type72);
        java.lang.String str77 = type72.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = type72.getInternalName();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        int int19 = type18.getSize();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type17, type18, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray23);
        int int25 = type15.getSort();
        org.mockito.asm.tree.analysis.Value value26 = basicVerifier0.newValue(type15);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        java.lang.String str29 = type28.getInternalName();
        java.lang.String str30 = type28.getDescriptor();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier0.newValue(type28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str34 = type33.getClassName();
        java.lang.String str35 = type33.getClassName();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier0.newValue(type33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type33.getElementType();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: org/mockito/asm/tree/analysis/BasicValue: expected org.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I, but found F");
        int int3 = type1.getOpcode(47);
        int int5 = type1.getOpcode(142);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.tree.analysis.Value value7 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier13 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getClassName();
        int int16 = type14.getSize();
        org.mockito.asm.tree.analysis.Value value17 = basicVerifier13.newValue(type14);
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier4.merge(value12, value17);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier19 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier19.newValue(type20);
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier0.merge(value18, value22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        int int28 = type27.getSize();
        int int29 = type27.getSize();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type27, type30, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray32);
        int int34 = type24.getSort();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier0.newValue(type24);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("org.mockito.asm.tree.analysis.AnalyzerException: (ZV)LZ;");
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier0.newValue(type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getReturnType("(ZV)LZ;");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str44 = type43.getClassName();
        int int45 = type43.getSize();
        org.mockito.asm.Type[] typeArray47 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray47);
        java.lang.String str49 = type43.toString();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.tree.analysis.Value value53 = basicVerifier50.newValue(type51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        int int56 = type55.getSize();
        int int57 = type55.getSize();
        java.lang.String str58 = type55.getDescriptor();
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type54, type55 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray59);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray59);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray59);
        org.mockito.asm.tree.analysis.Value value64 = basicVerifier0.newValue(type39);
        java.lang.String str65 = type39.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type66 = type39.getElementType();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int3 = type0.getOpcode(21);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(ZV)S");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str3 = type2.getClassName();
        boolean boolean5 = type2.equals((java.lang.Object) "boolean");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier6 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.tree.analysis.Value value9 = basicVerifier6.newValue(type7);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier10 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSize();
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier10.newValue(type11);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSize();
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier15.newValue(type16);
        org.mockito.asm.tree.analysis.Value value20 = basicVerifier6.merge(value14, value19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        int int25 = type24.getSize();
        int int26 = type24.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type23, type24, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray29);
        int int31 = type21.getSort();
        org.mockito.asm.tree.analysis.Value value32 = basicVerifier6.newValue(type21);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier33 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier33.newValue(type34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        int int39 = type38.getSize();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getDescriptor();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type37, type38 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray42);
        java.lang.String str45 = type21.getClassName();
        java.lang.String str46 = type21.getClassName();
        boolean boolean47 = type2.equals((java.lang.Object) str46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier48 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.tree.analysis.Value value51 = basicVerifier48.newValue(type49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        int int54 = type53.getSize();
        int int55 = type53.getSize();
        java.lang.String str56 = type53.getDescriptor();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type52, type53 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray57);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int61 = type1.getDimensions();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = type64.getElementType();
        java.lang.String str67 = type64.getDescriptor();
        java.lang.Class<?> wildcardClass68 = type64.getClass();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.toString();
        java.lang.String str73 = type71.toString();
        org.mockito.asm.tree.analysis.Value value74 = basicInterpreter0.newValue(type71);
        int int76 = type71.getOpcode(133);
        java.lang.String str77 = type71.getDescriptor();
        org.mockito.asm.Type[] typeArray79 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)I");
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type71, typeArray79);
        boolean boolean82 = type71.equals((java.lang.Object) "(JVSZ)Lorg.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int83 = type71.getDimensions();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.mockito.asm.tree.analysis.BasicInterpreter basicInterpreter0 = new org.mockito.asm.tree.analysis.BasicInterpreter();
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier1 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.tree.analysis.Value value4 = basicVerifier1.newValue(type2);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier5 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier5.newValue(type6);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier14 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier14.newValue(type15);
        org.mockito.asm.tree.analysis.Value value19 = basicVerifier5.merge(value13, value18);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier20 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.tree.analysis.Value value23 = basicVerifier20.newValue(type21);
        org.mockito.asm.tree.analysis.Value value24 = basicVerifier1.merge(value19, value23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier25 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.tree.analysis.Value value28 = basicVerifier25.newValue(type26);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier29 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str31 = type30.getClassName();
        int int32 = type30.getSize();
        org.mockito.asm.tree.analysis.Value value33 = basicVerifier29.newValue(type30);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier34 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str36 = type35.getClassName();
        int int37 = type35.getSize();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier34.newValue(type35);
        org.mockito.asm.tree.analysis.Value value39 = basicVerifier25.merge(value33, value38);
        org.mockito.asm.tree.analysis.Value value40 = basicInterpreter0.merge(value19, value39);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier41 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.tree.analysis.Value value44 = basicVerifier41.newValue(type42);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier45 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str47 = type46.getClassName();
        int int48 = type46.getSize();
        org.mockito.asm.tree.analysis.Value value49 = basicVerifier45.newValue(type46);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier50 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str52 = type51.getClassName();
        int int53 = type51.getSize();
        org.mockito.asm.tree.analysis.Value value54 = basicVerifier50.newValue(type51);
        org.mockito.asm.tree.analysis.Value value55 = basicVerifier41.merge(value49, value54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        int int57 = type56.getSize();
        int int58 = type56.getSize();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.tree.analysis.Value value60 = basicVerifier41.newValue(type56);
        int int61 = type56.getSize();
        org.mockito.asm.tree.analysis.Value value62 = basicInterpreter0.newValue(type56);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = type64.getElementType();
        java.lang.String str67 = type64.getDescriptor();
        java.lang.Class<?> wildcardClass68 = type64.getClass();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        org.mockito.asm.tree.analysis.Value value70 = basicInterpreter0.newValue(type69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str72 = type71.toString();
        java.lang.String str73 = type71.toString();
        org.mockito.asm.tree.analysis.Value value74 = basicInterpreter0.newValue(type71);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int75 = type71.getDimensions();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.asm.tree.analysis.AnalyzerException: (ZV)Z: expected 18, but found I");
        int int3 = type1.getOpcode(137);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("(JVSZ)Z");
        java.lang.String str6 = type5.getClassName();
        int int8 = type5.getOpcode(83);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.tree.analysis.Value value12 = basicVerifier9.newValue(type10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        java.lang.String str17 = type14.getDescriptor();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type13, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray21);
        java.lang.String str25 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type1.getInternalName();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        int int6 = type5.getSize();
        int int7 = type5.getSize();
        java.lang.String str8 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type4, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray12);
        int int14 = type1.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str16 = type15.getClassName();
        int int17 = type15.getSize();
        boolean boolean19 = type15.equals((java.lang.Object) 4);
        boolean boolean21 = type15.equals((java.lang.Object) 193);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier22 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.tree.analysis.Value value25 = basicVerifier22.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier26 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getClassName();
        int int29 = type27.getSize();
        org.mockito.asm.tree.analysis.Value value30 = basicVerifier26.newValue(type27);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier31 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str33 = type32.getClassName();
        int int34 = type32.getSize();
        org.mockito.asm.tree.analysis.Value value35 = basicVerifier31.newValue(type32);
        org.mockito.asm.tree.analysis.Value value36 = basicVerifier22.merge(value30, value35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str38 = type37.getClassName();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type39, type40, type43, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray45);
        int int47 = type37.getSort();
        org.mockito.asm.tree.analysis.Value value48 = basicVerifier22.newValue(type37);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier49 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.tree.analysis.Value value52 = basicVerifier49.newValue(type50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        int int55 = type54.getSize();
        int int56 = type54.getSize();
        java.lang.String str57 = type54.getDescriptor();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type53, type54 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray58);
        boolean boolean61 = type15.equals((java.lang.Object) typeArray58);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray58);
        int int63 = type1.getSize();
        boolean boolean65 = type1.equals((java.lang.Object) false);
        java.lang.String str66 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type67 = type1.getElementType();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("LZ;");
        java.lang.String str4 = type3.toString();
        int int5 = type3.getSort();
        java.lang.String str6 = type3.getDescriptor();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(ZV)F");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray8);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = type5.getElementType();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier0.newValue(type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        int int11 = type9.getSize();
        boolean boolean13 = type9.equals((java.lang.Object) 4);
        boolean boolean15 = type9.equals((java.lang.Object) 193);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type19, type20, type23, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray25);
        int int29 = type9.getSort();
        int int30 = type9.getSort();
        org.mockito.asm.tree.analysis.Value value31 = basicVerifier0.newValue(type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type9.getDimensions();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JVSZ)Z");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = type5.getElementType();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier0.newValue(type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        int int10 = type9.getSize();
        int int11 = type9.getSize();
        org.mockito.asm.tree.analysis.AnalyzerException analyzerException13 = new org.mockito.asm.tree.analysis.AnalyzerException("boolean");
        boolean boolean14 = type9.equals((java.lang.Object) analyzerException13);
        org.mockito.asm.tree.analysis.Value value15 = basicVerifier0.newValue(type9);
        java.lang.String str16 = type9.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type9.getElementType();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSize();
        org.mockito.asm.Type[] typeArray6 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        int int9 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.toString();
        boolean boolean5 = type1.equals((java.lang.Object) type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        boolean boolean7 = type1.equals((java.lang.Object) 0.0f);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier8 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.tree.analysis.Value value11 = basicVerifier8.newValue(type9);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier12 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str14 = type13.getClassName();
        int int15 = type13.getSize();
        org.mockito.asm.tree.analysis.Value value16 = basicVerifier12.newValue(type13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier17 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSize();
        org.mockito.asm.tree.analysis.Value value21 = basicVerifier17.newValue(type18);
        org.mockito.asm.tree.analysis.Value value22 = basicVerifier8.merge(value16, value21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        int int27 = type26.getSize();
        int int28 = type26.getSize();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type25, type26, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray31);
        int int33 = type23.getSort();
        org.mockito.asm.tree.analysis.Value value34 = basicVerifier8.newValue(type23);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier35 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.tree.analysis.Value value38 = basicVerifier35.newValue(type36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        int int41 = type40.getSize();
        int int42 = type40.getSize();
        java.lang.String str43 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type39, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray44);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray44);
        org.mockito.asm.Type[] typeArray49 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)F");
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray49);
        int int51 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = type1.getInternalName();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type1);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier4 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSize();
        org.mockito.asm.tree.analysis.Value value8 = basicVerifier4.newValue(type5);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier9 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSize();
        org.mockito.asm.tree.analysis.Value value13 = basicVerifier9.newValue(type10);
        org.mockito.asm.tree.analysis.Value value14 = basicVerifier0.merge(value8, value13);
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier15 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.tree.analysis.Value value18 = basicVerifier15.newValue(type16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        int int21 = type20.getSize();
        int int22 = type20.getSize();
        java.lang.String str23 = type20.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type19, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        org.mockito.asm.tree.analysis.Value value29 = basicVerifier0.newValue(type16);
        int int31 = type16.getOpcode(256);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type16.getDimensions();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier0 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("D");
        org.mockito.asm.tree.analysis.Value value3 = basicVerifier0.newValue(type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str5 = type4.getClassName();
        int int6 = type4.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        org.mockito.asm.tree.analysis.Value value10 = basicVerifier0.newValue(type4);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        int int15 = type14.getSize();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type14, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray19);
        java.lang.String str21 = type11.getDescriptor();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier24 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.tree.analysis.Value value27 = basicVerifier24.newValue(type25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        int int30 = type29.getSize();
        int int31 = type29.getSize();
        java.lang.String str32 = type29.getDescriptor();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type28, type29 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray33);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray33);
        int int39 = type4.getOpcode(19);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str41 = type40.toString();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        int int47 = type46.getSize();
        int int48 = type46.getSize();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type45, type46, type49, type50 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray51);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        int int59 = type58.getSize();
        int int60 = type58.getSize();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type57, type58, type61, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray63);
        java.lang.String str65 = type55.getDescriptor();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.tree.analysis.BasicVerifier basicVerifier68 = new org.mockito.asm.tree.analysis.BasicVerifier();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str70 = type69.getClassName();
        org.mockito.asm.tree.analysis.Value value71 = basicVerifier68.newValue(type69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type73 = org.mockito.asm.Type.VOID_TYPE;
        int int74 = type73.getSize();
        int int75 = type73.getSize();
        java.lang.String str76 = type73.getDescriptor();
        org.mockito.asm.Type[] typeArray77 = new org.mockito.asm.Type[] { type72, type73 };
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray77);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type67, typeArray77);
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.asm.Type.getArgumentTypes("(JVSZ)Z");
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray82);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray82);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str86 = type4.getInternalName();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }
}


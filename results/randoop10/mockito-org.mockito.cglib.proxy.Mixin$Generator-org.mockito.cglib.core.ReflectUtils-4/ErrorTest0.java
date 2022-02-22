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
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type2.getElementType();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.proxy.Mixin mixin11 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator5.setUseCache(false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type12, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray14);
        generator5.setDelegates((java.lang.Object[]) typeArray14);
        boolean boolean17 = generator5.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator5.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray19 = generatorStrategy4.generate((org.mockito.cglib.core.ClassGenerator) generator5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator6.getNamingPolicy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean9 = namingPolicy7.equals((java.lang.Object) type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) type11);
        java.lang.String str13 = type11.getDescriptor();
        boolean boolean14 = namingPolicy7.equals((java.lang.Object) str13);
        generator4.setNamingPolicy(namingPolicy7);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator4.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray17 = generatorStrategy3.generate((org.mockito.cglib.core.ClassGenerator) generator4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader26 = generator0.getClassLoader();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator4.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator4.getNamingPolicy();
        generator4.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray9 = generatorStrategy3.generate((org.mockito.cglib.core.ClassGenerator) generator4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        boolean boolean3 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type14, type15, type16, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        boolean boolean21 = namingPolicy3.equals((java.lang.Object) type20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type20.getInternalName();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader37 = generator0.getClassLoader();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator13.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray15 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) generator13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader2 = generator0.getClassLoader();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader1 = generator0.getClassLoader();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        java.lang.String str4 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type2.getElementType();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type18, type19, type20, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray22);
        generator13.setDelegates((java.lang.Object[]) typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray25 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) generator13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray21);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray21);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray26 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Z(JFIF)V");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray21);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray21);
        org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type33, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray35);
        generator26.setDelegates((java.lang.Object[]) typeArray35);
        org.mockito.cglib.proxy.Mixin mixin38 = mixin25.newInstance((java.lang.Object[]) typeArray35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("[Ljava/lang/String;", type2, typeArray35);
        java.lang.String str40 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = type2.getInternalName();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        boolean boolean6 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type14, type15, type16, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        boolean boolean21 = namingPolicy3.equals((java.lang.Object) type20);
        int int23 = type20.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type20.getInternalName();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator10.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray12 = generatorStrategy9.generate((org.mockito.cglib.core.ClassGenerator) generator10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type30, type31, type32, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("B", type27, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        boolean boolean39 = signature36.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = signature36.getName();
        org.mockito.asm.Type[] typeArray41 = signature36.getArgumentTypes();
        generator0.setDelegates((java.lang.Object[]) typeArray41);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator44 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator44.setUseCache(false);
        generator44.setAttemptLoad(true);
        boolean boolean49 = generator44.getAttemptLoad();
        generator44.setAttemptLoad(true);
        boolean boolean52 = generator44.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = generator44.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray54 = generatorStrategy43.generate((org.mockito.cglib.core.ClassGenerator) generator44);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        int int5 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type2.getDimensions();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin mixin19 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin19.equals(mixin19)", mixin19.equals(mixin19));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator4.setUseCache(false);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type9, type10, type11, type12 };
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray13);
        generator4.setDelegates((java.lang.Object[]) typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type1.getElementType();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        boolean boolean11 = generatorStrategy9.equals((java.lang.Object) 100.0d);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator12.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator12.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray16 = generatorStrategy9.generate((org.mockito.cglib.core.ClassGenerator) generator12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator14.setUseCache(false);
        generator14.setAttemptLoad(true);
        boolean boolean19 = generator14.getAttemptLoad();
        generator14.setAttemptLoad(true);
        boolean boolean22 = generator14.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray23 = generatorStrategy13.generate((org.mockito.cglib.core.ClassGenerator) generator14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Z(JFIF)V");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray21);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray21);
        org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type33, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray35);
        generator26.setDelegates((java.lang.Object[]) typeArray35);
        org.mockito.cglib.proxy.Mixin mixin38 = mixin25.newInstance((java.lang.Object[]) typeArray35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("[Ljava/lang/String;", type2, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = type2.getDimensions();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        int int41 = type39.getSort();
        boolean boolean42 = generatorStrategy36.equals((java.lang.Object) type39);
        java.lang.String str43 = type39.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type39.getInternalName();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        boolean boolean16 = generator0.getUseCache();
        java.lang.String[] strArray22 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray22);
        generator0.setDelegates((java.lang.Object[]) strArray22);
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean31 = generator30.getAttemptLoad();
        boolean boolean32 = generator30.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator30.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator30.getStrategy();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str37 = type36.toString();
        boolean boolean38 = generatorStrategy34.equals((java.lang.Object) str37);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str42 = signature41.getName();
        boolean boolean43 = generatorStrategy34.equals((java.lang.Object) str42);
        generator0.setStrategy(generatorStrategy34);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean46 = generator45.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator45.getStrategy();
        boolean boolean48 = generator45.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray49 = generatorStrategy34.generate((org.mockito.cglib.core.ClassGenerator) generator45);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = type16.toString();
        java.lang.String str18 = type16.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type16.getElementType();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        int int41 = type39.getSort();
        boolean boolean42 = generatorStrategy36.equals((java.lang.Object) type39);
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean44 = generator43.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator45.getNamingPolicy();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean48 = namingPolicy46.equals((java.lang.Object) type47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean51 = type49.equals((java.lang.Object) type50);
        java.lang.String str52 = type50.getDescriptor();
        boolean boolean53 = namingPolicy46.equals((java.lang.Object) str52);
        generator43.setNamingPolicy(namingPolicy46);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray57 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray57);
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray61 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray61);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray61);
        java.lang.String[] strArray69 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray72 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray71, methodArray72);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray69, methodArray73);
        java.lang.Class[] classArray75 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray73);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray73);
        generator43.setDelegates((java.lang.Object[]) methodArray76);
        generator43.setAttemptLoad(false);
        generator43.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray82 = generatorStrategy36.generate((org.mockito.cglib.core.ClassGenerator) generator43);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type2.getDimensions();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, false, true);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray20);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        boolean boolean8 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator6.getStrategy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str13 = type12.toString();
        boolean boolean14 = generatorStrategy10.equals((java.lang.Object) str13);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str18 = signature17.getName();
        boolean boolean19 = generatorStrategy10.equals((java.lang.Object) str18);
        boolean boolean21 = generatorStrategy10.equals((java.lang.Object) 100.0f);
        generator0.setStrategy(generatorStrategy10);
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator25.getNamingPolicy();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean28 = namingPolicy26.equals((java.lang.Object) type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) type30);
        java.lang.String str32 = type30.getDescriptor();
        boolean boolean33 = namingPolicy26.equals((java.lang.Object) str32);
        generator23.setNamingPolicy(namingPolicy26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator23.getStrategy();
        boolean boolean36 = generator23.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray37 = generatorStrategy10.generate((org.mockito.cglib.core.ClassGenerator) generator23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator3.getClassLoader();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type30, type31, type32, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("B", type27, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        boolean boolean39 = signature36.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = signature36.getName();
        org.mockito.asm.Type[] typeArray41 = signature36.getArgumentTypes();
        generator0.setDelegates((java.lang.Object[]) typeArray41);
        boolean boolean43 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader44 = generator0.getClassLoader();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        boolean boolean17 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str7 = type6.toString();
        boolean boolean8 = generatorStrategy4.equals((java.lang.Object) str7);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str12 = signature11.getName();
        boolean boolean13 = generatorStrategy4.equals((java.lang.Object) str12);
        boolean boolean15 = generatorStrategy4.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        boolean boolean24 = generatorStrategy4.equals((java.lang.Object) false);
        boolean boolean26 = generatorStrategy4.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=boolean; propertyEditorClass=class [Ljava.lang.String;]");
        org.mockito.cglib.proxy.Mixin.Generator generator27 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator27.setUseCache(false);
        generator27.setAttemptLoad(true);
        boolean boolean32 = generator27.getAttemptLoad();
        generator27.setAttemptLoad(true);
        boolean boolean35 = generator27.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator27.getStrategy();
        generator27.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray39 = generatorStrategy4.generate((org.mockito.cglib.core.ClassGenerator) generator27);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("B", type2, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator16.setUseCache(false);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type21, type22, type23, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray25);
        generator16.setDelegates((java.lang.Object[]) typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray25);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("short", type2, typeArray25);
        java.lang.String str30 = signature29.getName();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type31.getElementType();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator8.getNamingPolicy();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = namingPolicy9.equals((java.lang.Object) type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        boolean boolean16 = namingPolicy9.equals((java.lang.Object) str15);
        generator6.setNamingPolicy(namingPolicy9);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray35 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray36);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray36);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray36);
        generator6.setDelegates((java.lang.Object[]) methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray39);
        generator0.setDelegates((java.lang.Object[]) classArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader43 = generator0.getClassLoader();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        int int16 = type14.getOpcode(42);
        java.lang.String str17 = type14.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type14.getInternalName();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setConstrained(false);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        java.lang.Class class16 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[] { class16 };
        generator13.setClasses(classArray17);
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) generator13);
        generator13.setStyle(2);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.Class<?> wildcardClass26 = strArray23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray27, false, false);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray27);
        generator13.setDelegates((java.lang.Object[]) propertyDescriptorArray27);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("I", method35, method36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor37.getPropertyEditorClass();
        java.lang.Object obj40 = propertyDescriptor37.getValue("LZ;");
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray44 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray44);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray48);
        java.lang.String[] strArray56 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray59 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray59);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray60);
        java.lang.Class[] classArray62 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray60);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray60);
        propertyDescriptor37.setValue("org/mockito/asm/Type", (java.lang.Object) strArray43);
        org.mockito.cglib.proxy.Mixin mixin65 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray43);
        java.lang.String[] strArray71 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray74 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray73, methodArray74);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray71, methodArray75);
        java.lang.Class[] classArray77 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray75);
        java.lang.String[] strArray78 = org.mockito.cglib.core.ReflectUtils.getNames(classArray77);
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray81 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray80, methodArray81);
        java.lang.Class[] classArray83 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray82);
        java.lang.reflect.Method[] methodArray84 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray78, methodArray82);
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray84);
        org.mockito.cglib.proxy.Mixin mixin86 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray43);
        boolean boolean87 = type33.equals((java.lang.Object) strArray43);
        generator13.setDelegates((java.lang.Object[]) strArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor37", propertyDescriptor3.equals(propertyDescriptor37) ? propertyDescriptor3.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = type16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type16.getElementType();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator3.getClassLoader();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader4 = generator0.getClassLoader();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.lang.String str27 = classInfo26.toString();
        org.mockito.asm.Type type28 = classInfo26.getSuperType();
        org.mockito.asm.Type[] typeArray29 = classInfo26.getInterfaces();
        generator0.setDelegates((java.lang.Object[]) typeArray29);
        boolean boolean31 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator32 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator32.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = generator32.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator35 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator35.setUseCache(false);
        generator35.setAttemptLoad(true);
        boolean boolean40 = generator35.getAttemptLoad();
        generator35.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator35.getStrategy();
        generator32.setStrategy(generatorStrategy43);
        generator0.setStrategy(generatorStrategy43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader46 = generator0.getClassLoader();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        int int15 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator8.getNamingPolicy();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = namingPolicy9.equals((java.lang.Object) type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        boolean boolean16 = namingPolicy9.equals((java.lang.Object) str15);
        generator6.setNamingPolicy(namingPolicy9);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray35 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray36);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray36);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray36);
        generator6.setDelegates((java.lang.Object[]) methodArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray39);
        generator0.setDelegates((java.lang.Object[]) classArray41);
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader44 = generator0.getClassLoader();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray7 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray23);
        generator0.setDelegates((java.lang.Object[]) methodArray26);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader30 = generator0.getClassLoader();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        java.lang.String str19 = type18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type18.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator15.getNamingPolicy();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean18 = namingPolicy16.equals((java.lang.Object) type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) type20);
        java.lang.String str22 = type20.getDescriptor();
        boolean boolean23 = namingPolicy16.equals((java.lang.Object) str22);
        generator13.setNamingPolicy(namingPolicy16);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator13.getStrategy();
        boolean boolean26 = generator13.getAttemptLoad();
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.Class<?> wildcardClass31 = strArray28.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        generator13.setDelegates((java.lang.Object[]) propertyDescriptorArray33);
        generator13.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray37 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) generator13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray16);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray16);
        java.lang.Class[] classArray19 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray12);
        java.lang.String[] strArray25 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray29);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray33 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray33);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray41 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray41);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray41);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray41);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray45);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        generator0.setDelegates((java.lang.Object[]) classArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator6.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = type16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type16.getDimensions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) ' ');
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JFIF)V");
        int int6 = type5.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) type8);
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator11.setUseCache(false);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type16, type17, type18, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray20);
        generator11.setDelegates((java.lang.Object[]) typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray20);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray20);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type0.getElementType();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getAttemptLoad();
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator10.setUseCache(false);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type15, type16, type17, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", type14, typeArray19);
        generator10.setDelegates((java.lang.Object[]) typeArray19);
        boolean boolean22 = generator10.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = generator10.getStrategy();
        generator10.setAttemptLoad(true);
        generator10.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean29 = generator28.getAttemptLoad();
        boolean boolean30 = generator28.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator28.getStrategy();
        generator10.setStrategy(generatorStrategy31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.lang.String str37 = classInfo36.toString();
        org.mockito.asm.Type type38 = classInfo36.getSuperType();
        org.mockito.asm.Type[] typeArray39 = classInfo36.getInterfaces();
        generator10.setDelegates((java.lang.Object[]) typeArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray41 = generatorStrategy9.generate((org.mockito.cglib.core.ClassGenerator) generator10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) ' ');
        int int3 = type0.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("(JFIF)V");
        int int6 = type5.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) type8);
        java.lang.String str10 = type8.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator11.setUseCache(false);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type16, type17, type18, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type15, typeArray20);
        generator11.setDelegates((java.lang.Object[]) typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray20);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray20);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type0.getInternalName();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) type9);
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        boolean boolean13 = classInfo3.equals((java.lang.Object) type9);
        int int14 = type9.getSize();
        int int15 = type9.getSize();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("boolean", "LZ;");
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        int int25 = type24.getSize();
        java.lang.String str26 = type24.toString();
        int int28 = type24.getOpcode(6);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        int int36 = type34.getOpcode((int) ' ');
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type39, type40, type41, type42 };
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", type38, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray43);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("booleanLZ;", type33, typeArray43);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type24, typeArray43);
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("g.mockito.asm.Type", type22, typeArray43);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray43);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = type9.getElementType();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        java.lang.String[] strArray7 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray10 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray10);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        generator0.setDelegates((java.lang.Object[]) classArray13);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        int int16 = type14.getOpcode(42);
        int int17 = type14.getSize();
        int int19 = type14.getOpcode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type14.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean6 = generator5.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator7.getNamingPolicy();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean10 = namingPolicy8.equals((java.lang.Object) type9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = type11.equals((java.lang.Object) type12);
        java.lang.String str14 = type12.getDescriptor();
        boolean boolean15 = namingPolicy8.equals((java.lang.Object) str14);
        generator5.setNamingPolicy(namingPolicy8);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray19 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray19);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray23);
        java.lang.String[] strArray31 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray34 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray35);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray35);
        generator5.setDelegates((java.lang.Object[]) methodArray38);
        generator5.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray42 = generatorStrategy4.generate((org.mockito.cglib.core.ClassGenerator) generator5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        boolean boolean8 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator6.getStrategy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str13 = type12.toString();
        boolean boolean14 = generatorStrategy10.equals((java.lang.Object) str13);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str18 = signature17.getName();
        boolean boolean19 = generatorStrategy10.equals((java.lang.Object) str18);
        boolean boolean21 = generatorStrategy10.equals((java.lang.Object) 100.0f);
        generator0.setStrategy(generatorStrategy10);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader25 = generator0.getClassLoader();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.lang.String str27 = classInfo26.toString();
        org.mockito.asm.Type type28 = classInfo26.getSuperType();
        org.mockito.asm.Type[] typeArray29 = classInfo26.getInterfaces();
        generator0.setDelegates((java.lang.Object[]) typeArray29);
        boolean boolean31 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader32 = generator0.getClassLoader();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        java.lang.String str5 = type2.toString();
        java.lang.String str6 = type2.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type13, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("B", type8, typeArray15);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        boolean boolean20 = signature17.equals((java.lang.Object) (short) 1);
        org.mockito.asm.Type[] typeArray21 = signature17.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type2.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader6 = generator0.getClassLoader();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator4 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean5 = generator4.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator6.getNamingPolicy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean9 = namingPolicy7.equals((java.lang.Object) type8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean12 = type10.equals((java.lang.Object) type11);
        java.lang.String str13 = type11.getDescriptor();
        boolean boolean14 = namingPolicy7.equals((java.lang.Object) str13);
        generator4.setNamingPolicy(namingPolicy7);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator4.getStrategy();
        boolean boolean17 = generator4.getAttemptLoad();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.Class<?> wildcardClass22 = strArray19.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        generator4.setDelegates((java.lang.Object[]) propertyDescriptorArray24);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, false, true);
        java.lang.Class[] classArray29 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        boolean boolean33 = generatorStrategy3.equals((java.lang.Object) strArray32);
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator36 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = generator36.getNamingPolicy();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean39 = namingPolicy37.equals((java.lang.Object) type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean42 = type40.equals((java.lang.Object) type41);
        java.lang.String str43 = type41.getDescriptor();
        boolean boolean44 = namingPolicy37.equals((java.lang.Object) str43);
        generator34.setNamingPolicy(namingPolicy37);
        org.mockito.cglib.proxy.Mixin.Generator generator46 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean47 = generator46.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy48 = generator46.getNamingPolicy();
        generator34.setNamingPolicy(namingPolicy48);
        boolean boolean50 = generator34.getUseCache();
        java.lang.String[] strArray56 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray59 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray59);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray60);
        java.lang.Class[] classArray62 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray56);
        generator34.setDelegates((java.lang.Object[]) strArray56);
        org.mockito.cglib.core.NamingPolicy namingPolicy64 = generator34.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray65 = generatorStrategy3.generate((org.mockito.cglib.core.ClassGenerator) generator34);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        boolean boolean16 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.String str4 = classInfo3.toString();
        org.mockito.asm.Type type5 = classInfo3.getSuperType();
        org.mockito.asm.Type[] typeArray6 = classInfo3.getInterfaces();
        org.mockito.asm.Type type7 = classInfo3.getType();
        int int8 = classInfo3.getModifiers();
        org.mockito.asm.Type type9 = classInfo3.getSuperType();
        int int10 = classInfo3.getModifiers();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("B(JFIF)V");
        boolean boolean13 = classInfo3.equals((java.lang.Object) "B(JFIF)V");
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator14.getNamingPolicy();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = namingPolicy15.equals((java.lang.Object) type16);
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSize();
        int int20 = type16.getSize();
        boolean boolean21 = classInfo3.equals((java.lang.Object) type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type16.getInternalName();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str7 = type6.toString();
        boolean boolean8 = generatorStrategy4.equals((java.lang.Object) str7);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str12 = signature11.getName();
        boolean boolean13 = generatorStrategy4.equals((java.lang.Object) str12);
        boolean boolean15 = generatorStrategy4.equals((java.lang.Object) 100.0f);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator16.setUseCache(false);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type21, type22, type23, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray25);
        generator16.setDelegates((java.lang.Object[]) typeArray25);
        boolean boolean28 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator16.getStrategy();
        generator16.setAttemptLoad(true);
        generator16.setAttemptLoad(true);
        boolean boolean34 = generator16.getAttemptLoad();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass36);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray38);
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray39);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray39);
        generator16.setClasses(classArray41);
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = generator16.getNamingPolicy();
        java.lang.ClassLoader classLoader44 = generator16.getClassLoader();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray45 = generatorStrategy4.generate((org.mockito.cglib.core.ClassGenerator) generator16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        boolean boolean6 = generator3.getAttemptLoad();
        generator3.setUseCache(true);
        generator3.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator3.getClassLoader();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        boolean boolean8 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("I", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj6 = propertyDescriptor3.getValue("LZ;");
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.String str8 = propertyDescriptor3.getName();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("boolean", method10, method11);
        propertyDescriptor12.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor12.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor12.setHidden(false);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setConstrained(false);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor12.getPropertyType();
        propertyDescriptor12.setName("(JFIF)Z");
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean26 = generator25.getAttemptLoad();
        boolean boolean27 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator25.getStrategy();
        generator25.setStyle(2);
        java.beans.PropertyEditor propertyEditor32 = propertyDescriptor12.createPropertyEditor((java.lang.Object) generator25);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator25.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean35 = generator34.getAttemptLoad();
        boolean boolean36 = generator34.getUseCache();
        java.lang.ClassLoader classLoader37 = null;
        generator34.setClassLoader(classLoader37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass40 = type39.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass40);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, true, false);
        generator34.setDelegates((java.lang.Object[]) methodArray46);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator34.getStrategy();
        generator25.setStrategy(generatorStrategy48);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = generator25.getStrategy();
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor3.createPropertyEditor((java.lang.Object) generatorStrategy50);
        boolean boolean53 = generatorStrategy50.equals((java.lang.Object) "Lorg/mockito/cglib/core/ReflectUtils$4;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor12", propertyDescriptor3.equals(propertyDescriptor12) ? propertyDescriptor3.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray8 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        generator0.setClasses(classArray14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator20.getNamingPolicy();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean23 = namingPolicy21.equals((java.lang.Object) type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) type25);
        java.lang.String str27 = type25.getDescriptor();
        boolean boolean28 = namingPolicy21.equals((java.lang.Object) str27);
        generator18.setNamingPolicy(namingPolicy21);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator18.getStrategy();
        boolean boolean31 = generator18.getAttemptLoad();
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray34 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray34);
        java.lang.Class<?> wildcardClass36 = strArray33.getClass();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        generator18.setDelegates((java.lang.Object[]) propertyDescriptorArray38);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = generator18.getStrategy();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        java.lang.Class[] classArray45 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray44);
        boolean boolean46 = generatorStrategy40.equals((java.lang.Object) classArray45);
        boolean boolean47 = generatorStrategy17.equals((java.lang.Object) generatorStrategy40);
        org.mockito.cglib.proxy.Mixin.Generator generator48 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean49 = generator48.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator50 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator50.getNamingPolicy();
        java.lang.String[] strArray57 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray60 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray59, methodArray60);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray57, methodArray61);
        java.lang.Class[] classArray63 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray61);
        java.lang.Class[] classArray64 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray63);
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray63);
        generator50.setDelegates((java.lang.Object[]) classArray63);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy67 = generator50.getStrategy();
        generator48.setStrategy(generatorStrategy67);
        boolean boolean69 = generator48.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray70 = generatorStrategy40.generate((org.mockito.cglib.core.ClassGenerator) generator48);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class<?> wildcardClass18 = strArray15.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        generator0.setDelegates((java.lang.Object[]) propertyDescriptorArray20);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator0.getStrategy();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray27 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray26);
        boolean boolean28 = generatorStrategy22.equals((java.lang.Object) classArray27);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean30 = generator29.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = generator31.getNamingPolicy();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean34 = namingPolicy32.equals((java.lang.Object) type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean37 = type35.equals((java.lang.Object) type36);
        java.lang.String str38 = type36.getDescriptor();
        boolean boolean39 = namingPolicy32.equals((java.lang.Object) str38);
        generator29.setNamingPolicy(namingPolicy32);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray47 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray58 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray57, methodArray58);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray59);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray59);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray59);
        generator29.setDelegates((java.lang.Object[]) methodArray62);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = generator29.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray65 = generatorStrategy22.generate((org.mockito.cglib.core.ClassGenerator) generator29);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        int int17 = type16.getSort();
        int int18 = type16.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type16.getInternalName();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        generator0.setStyle(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        java.lang.String str5 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type2.getDimensions();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("boolean", method8, method9);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.String str12 = propertyDescriptor10.getName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor10.setWriteMethod(method13);
        propertyDescriptor10.setHidden(false);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("I", method19, method20);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor21.getPropertyEditorClass();
        java.lang.Object obj24 = propertyDescriptor21.getValue("LZ;");
        propertyDescriptor21.setPreferred(true);
        propertyDescriptor21.setConstrained(true);
        java.lang.reflect.Method method29 = propertyDescriptor21.getWriteMethod();
        propertyDescriptor10.setValue("Z(JFIF)V", (java.lang.Object) propertyDescriptor21);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor21.setReadMethod(method31);
        boolean boolean33 = signature2.equals((java.lang.Object) propertyDescriptor21);
        java.lang.String str34 = signature2.getName();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("g/mockito/asm/Type", method36, method37);
        boolean boolean39 = signature2.equals((java.lang.Object) method37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor38", propertyDescriptor10.equals(propertyDescriptor38) ? propertyDescriptor10.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator15.getNamingPolicy();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean18 = namingPolicy16.equals((java.lang.Object) type17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean21 = type19.equals((java.lang.Object) type20);
        java.lang.String str22 = type20.getDescriptor();
        boolean boolean23 = namingPolicy16.equals((java.lang.Object) str22);
        generator13.setNamingPolicy(namingPolicy16);
        boolean boolean25 = generator13.getUseCache();
        boolean boolean26 = generator13.getAttemptLoad();
        boolean boolean27 = generator13.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray28 = generatorStrategy12.generate((org.mockito.cglib.core.ClassGenerator) generator13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.toString();
        java.lang.String str14 = signature11.getName();
        java.lang.Class<?> wildcardClass15 = signature11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("boolean", method20, method21);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor22.getPropertyEditorClass();
        java.lang.String str24 = propertyDescriptor22.getName();
        java.lang.String str25 = propertyDescriptor22.getShortDescription();
        java.lang.String str26 = propertyDescriptor22.getName();
        propertyDescriptor22.setName("I");
        propertyDescriptor22.setDisplayName("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
        boolean boolean31 = classInfo18.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]");
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("boolean", method33, method34);
        java.lang.Class<?> wildcardClass36 = propertyDescriptor35.getPropertyType();
        java.lang.String str37 = propertyDescriptor35.getDisplayName();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor35.getPropertyEditorClass();
        propertyDescriptor35.setShortDescription("java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=(JFIF)V; preferred]");
        boolean boolean41 = classInfo18.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=boolean; displayName=Z; shortDescription=(JFIF)V; preferred]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor35", propertyDescriptor22.equals(propertyDescriptor35) ? propertyDescriptor22.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        java.lang.String str5 = type2.toString();
        java.lang.String str6 = type2.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type13, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("B", type8, typeArray15);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        boolean boolean20 = signature17.equals((java.lang.Object) (short) 1);
        org.mockito.asm.Type[] typeArray21 = signature17.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type2.getDimensions();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        boolean boolean16 = generator0.getUseCache();
        boolean boolean17 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader18 = generator0.getClassLoader();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type14.getInternalName();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        java.lang.Class<?> wildcardClass35 = generator0.getClass();
        java.lang.Class[] classArray36 = null;
        java.lang.reflect.Constructor constructor37 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass35, classArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor37);
        org.mockito.cglib.core.MethodInfo methodInfo40 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor37, 0);
        java.lang.String str41 = org.mockito.asm.Type.getConstructorDescriptor(constructor37);
        org.mockito.cglib.core.MethodInfo methodInfo43 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor37, 12);
        org.mockito.cglib.core.MethodInfo methodInfo44 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor37);
        org.mockito.cglib.core.Signature signature45 = methodInfo44.getSignature();
        org.mockito.cglib.core.ClassInfo classInfo46 = methodInfo44.getClassInfo();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("boolean", method48, method49);
        java.lang.Class<?> wildcardClass51 = propertyDescriptor50.getPropertyEditorClass();
        java.lang.String str52 = propertyDescriptor50.getName();
        propertyDescriptor50.setConstrained(false);
        java.lang.String str55 = propertyDescriptor50.getShortDescription();
        java.lang.String str56 = propertyDescriptor50.getDisplayName();
        java.lang.String str57 = propertyDescriptor50.getName();
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("boolean", "V");
        java.lang.reflect.Method method63 = null;
        java.lang.reflect.Method method64 = null;
        java.beans.PropertyDescriptor propertyDescriptor65 = new java.beans.PropertyDescriptor("I", method63, method64);
        java.lang.Class<?> wildcardClass66 = propertyDescriptor65.getPropertyEditorClass();
        java.lang.Object obj68 = propertyDescriptor65.getValue("LZ;");
        boolean boolean69 = propertyDescriptor65.isHidden();
        propertyDescriptor65.setConstrained(false);
        boolean boolean72 = signature61.equals((java.lang.Object) false);
        propertyDescriptor50.setValue("java.beans.PropertyDescriptor[name=void]", (java.lang.Object) signature61);
        boolean boolean74 = classInfo46.equals((java.lang.Object) signature61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor50 and propertyDescriptor65", propertyDescriptor50.equals(propertyDescriptor65) ? propertyDescriptor50.hashCode() == propertyDescriptor65.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        generator0.setAttemptLoad(false);
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=boolean]", method23, method24);
        org.mockito.cglib.proxy.Mixin.Generator generator27 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean28 = generator27.getAttemptLoad();
        boolean boolean29 = generator27.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = generator27.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator27.getStrategy();
        boolean boolean32 = generator27.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator33.getStrategy();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str40 = type39.toString();
        boolean boolean41 = generatorStrategy37.equals((java.lang.Object) str40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str45 = signature44.getName();
        boolean boolean46 = generatorStrategy37.equals((java.lang.Object) str45);
        boolean boolean48 = generatorStrategy37.equals((java.lang.Object) 100.0f);
        generator27.setStrategy(generatorStrategy37);
        propertyDescriptor25.setValue("java.beans.PropertyDescriptor[name=boolean; values={(JFIF)Z=false}; constrained]", (java.lang.Object) generatorStrategy37);
        generator0.setStrategy(generatorStrategy37);
        org.mockito.cglib.proxy.Mixin mixin52 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin52.equals(mixin52)", mixin52.equals(mixin52));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str15 = type14.getDescriptor();
        int int17 = type14.getOpcode(9);
        java.lang.Class<?> wildcardClass18 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        boolean boolean20 = generatorStrategy13.equals((java.lang.Object) propertyDescriptorArray19);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean22 = generator21.getAttemptLoad();
        boolean boolean23 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator21.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator21.getStrategy();
        boolean boolean26 = generator21.getUseCache();
        boolean boolean27 = generator21.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = generator28.getNamingPolicy();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean31 = namingPolicy29.equals((java.lang.Object) type30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type36, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray38);
        boolean boolean40 = namingPolicy29.equals((java.lang.Object) signature39);
        generator21.setNamingPolicy(namingPolicy29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray42 = generatorStrategy13.generate((org.mockito.cglib.core.ClassGenerator) generator21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.String str10 = classInfo9.toString();
        org.mockito.asm.Type type11 = classInfo9.getType();
        org.mockito.asm.Type type12 = classInfo9.getType();
        int int13 = classInfo9.getModifiers();
        boolean boolean15 = classInfo9.equals((java.lang.Object) 0.0d);
        org.mockito.asm.Type[] typeArray16 = classInfo9.getInterfaces();
        boolean boolean17 = generatorStrategy5.equals((java.lang.Object) typeArray16);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator18.getStrategy();
        boolean boolean23 = generator18.getAttemptLoad();
        generator18.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = generator26.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = generator26.getNamingPolicy();
        generator26.setAttemptLoad(true);
        generator26.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = generator26.getNamingPolicy();
        generator26.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator36 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = generator36.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator36.getNamingPolicy();
        generator36.setAttemptLoad(true);
        generator36.setAttemptLoad(false);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass44);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray46);
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray47);
        generator36.setClasses(classArray47);
        java.lang.ClassLoader classLoader51 = generator36.getClassLoader();
        org.mockito.asm.Type[] typeArray53 = org.mockito.asm.Type.getArgumentTypes("(JFIF)B");
        org.mockito.cglib.proxy.Mixin mixin54 = org.mockito.cglib.proxy.Mixin.createBean(classLoader51, (java.lang.Object[]) typeArray53);
        generator26.setClassLoader(classLoader51);
        generator18.setClassLoader(classLoader51);
        java.lang.ClassLoader classLoader57 = generator18.getClassLoader();
        boolean boolean58 = generator18.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray59 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) generator18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        boolean boolean8 = generator0.getUseCache();
        boolean boolean9 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader10 = generator0.getClassLoader();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator8.setUseCache(false);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type13, type14, type15, type16 };
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", type12, typeArray17);
        generator8.setDelegates((java.lang.Object[]) typeArray17);
        boolean boolean20 = generator8.getUseCache();
        generator8.setStyle(2);
        boolean boolean23 = generator8.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray24 = generatorStrategy7.generate((org.mockito.cglib.core.ClassGenerator) generator8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str5 = signature4.getName();
        java.lang.Class<?> wildcardClass6 = signature4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray10 = classInfo9.getInterfaces();
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type30 = classInfo29.getType();
        int int31 = classInfo29.getModifiers();
        org.mockito.asm.Type type32 = classInfo29.getSuperType();
        int int33 = classInfo29.getModifiers();
        int int34 = classInfo29.getModifiers();
        java.lang.String str35 = classInfo29.toString();
        org.mockito.asm.Type type36 = classInfo29.getType();
        java.lang.Class<?> wildcardClass37 = classInfo29.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        generator0.setDelegates((java.lang.Object[]) propertyDescriptorArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader41 = generator0.getClassLoader();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator9.setUseCache(false);
        generator9.setAttemptLoad(true);
        boolean boolean14 = generator9.getAttemptLoad();
        generator9.setAttemptLoad(true);
        boolean boolean17 = generator9.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = generator9.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator9.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray20 = generatorStrategy8.generate((org.mockito.cglib.core.ClassGenerator) generator9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        boolean boolean16 = generator0.getUseCache();
        java.lang.String[] strArray22 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray22);
        generator0.setDelegates((java.lang.Object[]) strArray22);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader33 = generator0.getClassLoader();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type30, type31, type32, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("B", type27, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        boolean boolean39 = signature36.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = signature36.getName();
        org.mockito.asm.Type[] typeArray41 = signature36.getArgumentTypes();
        generator0.setDelegates((java.lang.Object[]) typeArray41);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader45 = generator0.getClassLoader();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        java.lang.Class<?> wildcardClass35 = generator0.getClass();
        java.lang.Class[] classArray36 = null;
        java.lang.reflect.Constructor constructor37 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass35, classArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor37);
        org.mockito.cglib.core.MethodInfo methodInfo40 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor37, 0);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("I", method42, method43);
        java.lang.Class<?> wildcardClass45 = propertyDescriptor44.getPropertyEditorClass();
        java.lang.Object obj47 = propertyDescriptor44.getValue("LZ;");
        boolean boolean48 = propertyDescriptor44.isHidden();
        java.lang.String str49 = propertyDescriptor44.getName();
        boolean boolean50 = propertyDescriptor44.isHidden();
        boolean boolean51 = propertyDescriptor44.isExpert();
        propertyDescriptor44.setExpert(false);
        boolean boolean54 = methodInfo40.equals((java.lang.Object) propertyDescriptor44);
        org.mockito.cglib.core.Signature signature55 = methodInfo40.getSignature();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator58 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator58.setUseCache(false);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type63, type64, type65, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type62, typeArray67);
        generator58.setDelegates((java.lang.Object[]) typeArray67);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("Z", type57, typeArray67);
        java.lang.String str71 = signature70.getDescriptor();
        org.mockito.asm.Type type72 = signature70.getReturnType();
        java.lang.String str73 = signature70.getDescriptor();
        java.lang.String str74 = signature70.getDescriptor();
        java.lang.String str75 = signature70.toString();
        org.mockito.asm.Type type76 = signature70.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator77 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator77.setUseCache(false);
        boolean boolean80 = signature70.equals((java.lang.Object) false);
        java.lang.String str81 = signature70.toString();
        java.lang.reflect.Method method83 = null;
        java.lang.reflect.Method method84 = null;
        java.beans.PropertyDescriptor propertyDescriptor85 = new java.beans.PropertyDescriptor("LI;", method83, method84);
        java.lang.reflect.Method method86 = null;
        propertyDescriptor85.setWriteMethod(method86);
        boolean boolean88 = signature70.equals((java.lang.Object) propertyDescriptor85);
        boolean boolean89 = signature55.equals((java.lang.Object) propertyDescriptor85);
        java.lang.String str90 = signature55.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor44 and propertyDescriptor85", propertyDescriptor44.equals(propertyDescriptor85) ? propertyDescriptor44.hashCode() == propertyDescriptor85.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = generator17.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator17.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean21 = generator20.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = generator22.getNamingPolicy();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean25 = namingPolicy23.equals((java.lang.Object) type24);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) type27);
        java.lang.String str29 = type27.getDescriptor();
        boolean boolean30 = namingPolicy23.equals((java.lang.Object) str29);
        generator20.setNamingPolicy(namingPolicy23);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type36, type37 };
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", type33, typeArray38);
        org.mockito.asm.Type type40 = signature39.getReturnType();
        boolean boolean41 = namingPolicy23.equals((java.lang.Object) type40);
        generator17.setNamingPolicy(namingPolicy23);
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator43.setUseCache(false);
        java.lang.String[] strArray51 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray54 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray53, methodArray54);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray55);
        java.lang.Class[] classArray57 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray55);
        java.lang.String[] strArray58 = org.mockito.cglib.core.ReflectUtils.getNames(classArray57);
        generator43.setClasses(classArray57);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = generator43.getStrategy();
        boolean boolean61 = namingPolicy23.equals((java.lang.Object) generator43);
        org.mockito.cglib.proxy.Mixin.Generator generator62 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean63 = generator62.getAttemptLoad();
        boolean boolean64 = generator62.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = generator62.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = generator62.getStrategy();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str69 = type68.toString();
        boolean boolean70 = generatorStrategy66.equals((java.lang.Object) str69);
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str74 = signature73.getName();
        boolean boolean75 = generatorStrategy66.equals((java.lang.Object) str74);
        generator43.setStrategy(generatorStrategy66);
        org.mockito.cglib.proxy.Mixin.Generator generator77 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator77.setUseCache(false);
        generator77.setAttemptLoad(true);
        boolean boolean82 = generator77.getAttemptLoad();
        generator77.setAttemptLoad(true);
        boolean boolean85 = generator77.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy86 = generator77.getStrategy();
        boolean boolean88 = generatorStrategy86.equals((java.lang.Object) 100.0d);
        generator43.setStrategy(generatorStrategy86);
        generator0.setStrategy(generatorStrategy86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader91 = generator0.getClassLoader();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        boolean boolean7 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator8.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator8.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean12 = generator11.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator13.getNamingPolicy();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean16 = namingPolicy14.equals((java.lang.Object) type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) type18);
        java.lang.String str20 = type18.getDescriptor();
        boolean boolean21 = namingPolicy14.equals((java.lang.Object) str20);
        generator11.setNamingPolicy(namingPolicy14);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type25, type26, type27, type28 };
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", type24, typeArray29);
        org.mockito.asm.Type type31 = signature30.getReturnType();
        boolean boolean32 = namingPolicy14.equals((java.lang.Object) type31);
        generator8.setNamingPolicy(namingPolicy14);
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator34.setUseCache(false);
        java.lang.String[] strArray42 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray45 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray45);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray46);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray46);
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        generator34.setClasses(classArray48);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = generator34.getStrategy();
        boolean boolean52 = namingPolicy14.equals((java.lang.Object) generator34);
        org.mockito.cglib.proxy.Mixin.Generator generator53 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean54 = generator53.getAttemptLoad();
        boolean boolean55 = generator53.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = generator53.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy57 = generator53.getStrategy();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str60 = type59.toString();
        boolean boolean61 = generatorStrategy57.equals((java.lang.Object) str60);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str65 = signature64.getName();
        boolean boolean66 = generatorStrategy57.equals((java.lang.Object) str65);
        generator34.setStrategy(generatorStrategy57);
        org.mockito.cglib.proxy.Mixin.Generator generator68 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator68.setUseCache(false);
        generator68.setAttemptLoad(true);
        boolean boolean73 = generator68.getAttemptLoad();
        generator68.setAttemptLoad(true);
        boolean boolean76 = generator68.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy77 = generator68.getStrategy();
        boolean boolean79 = generatorStrategy77.equals((java.lang.Object) 100.0d);
        generator34.setStrategy(generatorStrategy77);
        generator0.setStrategy(generatorStrategy77);
        org.mockito.cglib.proxy.Mixin.Generator generator82 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy83 = generator82.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy84 = generator82.getNamingPolicy();
        generator82.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray87 = generatorStrategy77.generate((org.mockito.cglib.core.ClassGenerator) generator82);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean8 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        int int15 = type1.getSort();
        int int16 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type1.getElementType();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        java.lang.String str4 = type2.getDescriptor();
        java.lang.String str5 = type2.toString();
        int int6 = type2.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type2.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        java.lang.String str18 = signature14.getDescriptor();
        java.lang.String str19 = signature14.toString();
        org.mockito.asm.Type type20 = signature14.getReturnType();
        org.mockito.asm.Type type21 = signature14.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type21.getElementType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(2);
        int int5 = type1.getOpcode(100);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator6.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator6.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator11.getNamingPolicy();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = namingPolicy12.equals((java.lang.Object) type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) type16);
        java.lang.String str18 = type16.getDescriptor();
        boolean boolean19 = namingPolicy12.equals((java.lang.Object) str18);
        generator9.setNamingPolicy(namingPolicy12);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type23, type24, type25, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", type22, typeArray27);
        org.mockito.asm.Type type29 = signature28.getReturnType();
        boolean boolean30 = namingPolicy12.equals((java.lang.Object) type29);
        generator6.setNamingPolicy(namingPolicy12);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type36, type37, type38, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", type35, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("B", type33, typeArray40);
        org.mockito.asm.Type[] typeArray43 = signature42.getArgumentTypes();
        boolean boolean45 = signature42.equals((java.lang.Object) (short) 1);
        java.lang.String str46 = signature42.getName();
        org.mockito.asm.Type[] typeArray47 = signature42.getArgumentTypes();
        generator6.setDelegates((java.lang.Object[]) typeArray47);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = generator6.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = generator6.getNamingPolicy();
        boolean boolean51 = type1.equals((java.lang.Object) generator6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type52 = type1.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        boolean boolean18 = generator0.getAttemptLoad();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray23);
        generator0.setClasses(classArray25);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader28 = generator0.getClassLoader();
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean30 = generator29.getAttemptLoad();
        boolean boolean31 = generator29.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator29.getStrategy();
        boolean boolean33 = generator29.getAttemptLoad();
        boolean boolean34 = generator29.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator29.getStrategy();
        generator0.setStrategy(generatorStrategy35);
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean38 = generator37.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator39.getNamingPolicy();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean42 = namingPolicy40.equals((java.lang.Object) type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) type44);
        java.lang.String str46 = type44.getDescriptor();
        boolean boolean47 = namingPolicy40.equals((java.lang.Object) str46);
        generator37.setNamingPolicy(namingPolicy40);
        org.mockito.cglib.proxy.Mixin.Generator generator49 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean50 = generator49.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator49.getNamingPolicy();
        generator37.setNamingPolicy(namingPolicy51);
        boolean boolean53 = generator37.getUseCache();
        boolean boolean54 = generator37.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray55 = generatorStrategy35.generate((org.mockito.cglib.core.ClassGenerator) generator37);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        boolean boolean7 = type1.equals((java.lang.Object) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type1.getElementType();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator7.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator7.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader12 = generator0.getClassLoader();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        boolean boolean4 = generator0.getAttemptLoad();
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getUseCache();
        boolean boolean7 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader8 = generator0.getClassLoader();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type4, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = type8.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean11 = generator10.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator12.getNamingPolicy();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = namingPolicy13.equals((java.lang.Object) type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) type17);
        java.lang.String str19 = type17.getDescriptor();
        boolean boolean20 = namingPolicy13.equals((java.lang.Object) str19);
        generator10.setNamingPolicy(namingPolicy13);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray40);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray40);
        generator10.setDelegates((java.lang.Object[]) methodArray43);
        generator10.setAttemptLoad(false);
        boolean boolean47 = type8.equals((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type48 = type8.getElementType();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getAttemptLoad();
        boolean boolean9 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator7.getStrategy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.lang.String str15 = classInfo14.toString();
        org.mockito.asm.Type type16 = classInfo14.getType();
        java.lang.String str17 = classInfo14.toString();
        boolean boolean18 = generatorStrategy10.equals((java.lang.Object) str17);
        generator0.setStrategy(generatorStrategy10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        int int17 = type16.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type16.getInternalName();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.String[] strArray5 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, false, true);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        org.mockito.cglib.proxy.Mixin.Generator generator32 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean33 = generator32.getAttemptLoad();
        boolean boolean34 = generator32.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator32.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator32.getStrategy();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray43);
        java.lang.String[] strArray51 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray54 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray53, methodArray54);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray55);
        java.lang.Class[] classArray57 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray55);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray55);
        generator32.setDelegates((java.lang.Object[]) methodArray58);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray58);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray58);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, true, true);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, false, true);
        java.lang.Class[] classArray69 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray62);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, false, false);
        java.lang.Class[] classArray73 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray62);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.proxy.Mixin mixin78 = org.mockito.cglib.proxy.Mixin.create((java.lang.Object[]) methodArray77);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        generator0.setAttemptLoad(false);
        generator0.setAttemptLoad(true);
        generator0.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator41 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean42 = generator41.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = generator43.getNamingPolicy();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean46 = namingPolicy44.equals((java.lang.Object) type45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean49 = type47.equals((java.lang.Object) type48);
        java.lang.String str50 = type48.getDescriptor();
        boolean boolean51 = namingPolicy44.equals((java.lang.Object) str50);
        generator41.setNamingPolicy(namingPolicy44);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = generator41.getStrategy();
        boolean boolean54 = generator41.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator41.getNamingPolicy();
        boolean boolean56 = generator41.getAttemptLoad();
        generator41.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = generator41.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader61 = generator0.getClassLoader();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        java.lang.String[] strArray3 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        boolean boolean13 = type1.equals((java.lang.Object) propertyDescriptorArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type1.getElementType();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        java.lang.String str18 = signature14.getDescriptor();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        org.mockito.asm.Type type20 = signature14.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type20.getDimensions();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        org.mockito.asm.Type type39 = signature13.getReturnType();
        org.mockito.asm.Type type40 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int41 = type40.getDimensions();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) type9);
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        boolean boolean13 = classInfo3.equals((java.lang.Object) type9);
        int int14 = type9.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type9.getDimensions();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) type9);
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        boolean boolean13 = classInfo3.equals((java.lang.Object) type9);
        int int14 = type9.getSize();
        int int15 = type9.getSize();
        java.lang.String str16 = type9.getDescriptor();
        int int18 = type9.getOpcode(14);
        int int19 = type9.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type9.getInternalName();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator11.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator11.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean15 = generator14.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = generator16.getNamingPolicy();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = namingPolicy17.equals((java.lang.Object) type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) type21);
        java.lang.String str23 = type21.getDescriptor();
        boolean boolean24 = namingPolicy17.equals((java.lang.Object) str23);
        generator14.setNamingPolicy(namingPolicy17);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type28, type29, type30, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray32);
        org.mockito.asm.Type type34 = signature33.getReturnType();
        boolean boolean35 = namingPolicy17.equals((java.lang.Object) type34);
        generator11.setNamingPolicy(namingPolicy17);
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean38 = generator37.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator39.getNamingPolicy();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean42 = namingPolicy40.equals((java.lang.Object) type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) type44);
        java.lang.String str46 = type44.getDescriptor();
        boolean boolean47 = namingPolicy40.equals((java.lang.Object) str46);
        generator37.setNamingPolicy(namingPolicy40);
        org.mockito.cglib.proxy.Mixin.Generator generator49 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean50 = generator49.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator49.getNamingPolicy();
        generator37.setNamingPolicy(namingPolicy51);
        boolean boolean53 = generator37.getUseCache();
        java.lang.String[] strArray59 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray62 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray59, methodArray63);
        java.lang.Class[] classArray65 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray59);
        generator37.setDelegates((java.lang.Object[]) strArray59);
        java.lang.Class[] classArray67 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray59);
        generator11.setClasses(classArray67);
        boolean boolean69 = generator11.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray70 = generatorStrategy10.generate((org.mockito.cglib.core.ClassGenerator) generator11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        boolean boolean18 = generator0.getAttemptLoad();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray23);
        generator0.setClasses(classArray25);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = generator0.getNamingPolicy();
        java.lang.ClassLoader classLoader28 = generator0.getClassLoader();
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean30 = generator29.getAttemptLoad();
        boolean boolean31 = generator29.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator29.getStrategy();
        boolean boolean33 = generator29.getAttemptLoad();
        boolean boolean34 = generator29.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator29.getStrategy();
        generator0.setStrategy(generatorStrategy35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass38 = type37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass38);
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        java.lang.String str41 = classInfo40.toString();
        org.mockito.asm.Type type42 = classInfo40.getSuperType();
        org.mockito.asm.Type[] typeArray43 = classInfo40.getInterfaces();
        org.mockito.asm.Type type44 = classInfo40.getType();
        int int45 = classInfo40.getModifiers();
        org.mockito.asm.Type type46 = classInfo40.getSuperType();
        org.mockito.asm.Type type47 = classInfo40.getSuperType();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass49 = type48.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type52 = classInfo51.getType();
        int int53 = classInfo51.getModifiers();
        org.mockito.asm.Type type54 = classInfo51.getSuperType();
        boolean boolean55 = classInfo40.equals((java.lang.Object) classInfo51);
        org.mockito.cglib.proxy.Mixin.Generator generator56 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator56.setUseCache(false);
        generator56.setAttemptLoad(true);
        boolean boolean61 = generator56.getAttemptLoad();
        generator56.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy64 = generator56.getStrategy();
        boolean boolean65 = classInfo51.equals((java.lang.Object) generator56);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = generator56.getStrategy();
        boolean boolean67 = generator56.getUseCache();
        generator56.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray70 = generatorStrategy35.generate((org.mockito.cglib.core.ClassGenerator) generator56);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        java.lang.Class<?> wildcardClass35 = generator0.getClass();
        java.lang.Class[] classArray36 = null;
        java.lang.reflect.Constructor constructor37 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass35, classArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor37);
        org.mockito.cglib.core.MethodInfo methodInfo40 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor37, 0);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("I", method42, method43);
        java.lang.Class<?> wildcardClass45 = propertyDescriptor44.getPropertyEditorClass();
        java.lang.Object obj47 = propertyDescriptor44.getValue("LZ;");
        boolean boolean48 = propertyDescriptor44.isHidden();
        java.lang.String str49 = propertyDescriptor44.getName();
        boolean boolean50 = propertyDescriptor44.isHidden();
        boolean boolean51 = propertyDescriptor44.isExpert();
        propertyDescriptor44.setExpert(false);
        boolean boolean54 = methodInfo40.equals((java.lang.Object) propertyDescriptor44);
        org.mockito.cglib.core.Signature signature55 = methodInfo40.getSignature();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator58 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator58.setUseCache(false);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type63, type64, type65, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", type62, typeArray67);
        generator58.setDelegates((java.lang.Object[]) typeArray67);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("Z", type57, typeArray67);
        java.lang.String str71 = signature70.getDescriptor();
        org.mockito.asm.Type type72 = signature70.getReturnType();
        java.lang.String str73 = signature70.getDescriptor();
        java.lang.String str74 = signature70.getDescriptor();
        java.lang.String str75 = signature70.toString();
        org.mockito.asm.Type type76 = signature70.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator77 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator77.setUseCache(false);
        boolean boolean80 = signature70.equals((java.lang.Object) false);
        java.lang.String str81 = signature70.toString();
        java.lang.reflect.Method method83 = null;
        java.lang.reflect.Method method84 = null;
        java.beans.PropertyDescriptor propertyDescriptor85 = new java.beans.PropertyDescriptor("LI;", method83, method84);
        java.lang.reflect.Method method86 = null;
        propertyDescriptor85.setWriteMethod(method86);
        boolean boolean88 = signature70.equals((java.lang.Object) propertyDescriptor85);
        boolean boolean89 = signature55.equals((java.lang.Object) propertyDescriptor85);
        java.lang.String str90 = signature55.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor44 and propertyDescriptor85", propertyDescriptor44.equals(propertyDescriptor85) ? propertyDescriptor44.hashCode() == propertyDescriptor85.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        int int41 = type39.getSort();
        boolean boolean42 = generatorStrategy36.equals((java.lang.Object) type39);
        java.lang.String str43 = type39.toString();
        java.lang.String str44 = type39.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = type39.getDimensions();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("B", type2, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator16.setUseCache(false);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type21, type22, type23, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray25);
        generator16.setDelegates((java.lang.Object[]) typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray25);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("short", type2, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type2.getDimensions();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        boolean boolean18 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        generator0.setStyle(2);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        boolean boolean10 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={[Ljava/lang/String;=100}]", "java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
        boolean boolean42 = generatorStrategy36.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = generator43.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = generator43.getNamingPolicy();
        generator43.setAttemptLoad(true);
        generator43.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = generator43.getNamingPolicy();
        generator43.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator53 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy54 = generator53.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator53.getNamingPolicy();
        generator53.setAttemptLoad(true);
        generator53.setAttemptLoad(false);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass61 = type60.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass61);
        java.lang.Class[] classArray64 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray63);
        int int65 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray64);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray64);
        generator53.setClasses(classArray64);
        java.lang.ClassLoader classLoader68 = generator53.getClassLoader();
        org.mockito.asm.Type[] typeArray70 = org.mockito.asm.Type.getArgumentTypes("(JFIF)B");
        org.mockito.cglib.proxy.Mixin mixin71 = org.mockito.cglib.proxy.Mixin.createBean(classLoader68, (java.lang.Object[]) typeArray70);
        generator43.setClassLoader(classLoader68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray73 = generatorStrategy36.generate((org.mockito.cglib.core.ClassGenerator) generator43);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        boolean boolean3 = generator0.getAttemptLoad();
        boolean boolean4 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = generator0.getStrategy();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.String str10 = classInfo9.toString();
        org.mockito.asm.Type type11 = classInfo9.getType();
        org.mockito.asm.Type type12 = classInfo9.getType();
        int int13 = classInfo9.getModifiers();
        boolean boolean15 = classInfo9.equals((java.lang.Object) 0.0d);
        org.mockito.asm.Type[] typeArray16 = classInfo9.getInterfaces();
        boolean boolean17 = generatorStrategy5.equals((java.lang.Object) typeArray16);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator18.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator18.getNamingPolicy();
        generator18.setAttemptLoad(true);
        generator18.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean26 = generator25.getAttemptLoad();
        boolean boolean27 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator25.getStrategy();
        boolean boolean30 = generator25.getAttemptLoad();
        generator25.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = generator33.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator33.getNamingPolicy();
        generator33.setAttemptLoad(true);
        generator33.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator33.getNamingPolicy();
        generator33.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = generator43.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = generator43.getNamingPolicy();
        generator43.setAttemptLoad(true);
        generator43.setAttemptLoad(false);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray54 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray53);
        int int55 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray54);
        java.lang.Class[] classArray56 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray54);
        generator43.setClasses(classArray54);
        java.lang.ClassLoader classLoader58 = generator43.getClassLoader();
        org.mockito.asm.Type[] typeArray60 = org.mockito.asm.Type.getArgumentTypes("(JFIF)B");
        org.mockito.cglib.proxy.Mixin mixin61 = org.mockito.cglib.proxy.Mixin.createBean(classLoader58, (java.lang.Object[]) typeArray60);
        generator33.setClassLoader(classLoader58);
        generator25.setClassLoader(classLoader58);
        java.lang.ClassLoader classLoader64 = generator25.getClassLoader();
        generator18.setClassLoader(classLoader64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray66 = generatorStrategy5.generate((org.mockito.cglib.core.ClassGenerator) generator18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        int int8 = type7.getSort();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        boolean boolean11 = generator9.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator9.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator9.getStrategy();
        generator9.setStyle(2);
        generator9.setStyle(2);
        generator9.setUseCache(false);
        boolean boolean20 = generator9.getAttemptLoad();
        boolean boolean21 = generator9.getAttemptLoad();
        boolean boolean22 = type7.equals((java.lang.Object) generator9);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        generator9.setDelegates((java.lang.Object[]) strArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader28 = generator9.getClassLoader();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        boolean boolean15 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader19 = generator0.getClassLoader();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=boolean; displayName=(JFIF)Lorg/mockito/asm/Type;; values={B(JFIF)V=D}]");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str9 = type8.getDescriptor();
        int int11 = type8.getOpcode(9);
        java.lang.String str12 = type8.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.lang.String str20 = classInfo19.toString();
        org.mockito.asm.Type[] typeArray21 = classInfo19.getInterfaces();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray21);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; bound]", type2, typeArray21);
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean26 = generator25.getAttemptLoad();
        boolean boolean27 = generator25.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator25.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = generator25.getStrategy();
        boolean boolean30 = generator25.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean32 = generator31.getAttemptLoad();
        boolean boolean33 = generator31.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator31.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator31.getStrategy();
        generator25.setStrategy(generatorStrategy35);
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = generator25.getNamingPolicy();
        generator25.setUseCache(false);
        boolean boolean40 = signature24.equals((java.lang.Object) generator25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader41 = generator25.getClassLoader();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("B", type2, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator16.setUseCache(false);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type21, type22, type23, type24 };
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", type20, typeArray25);
        generator16.setDelegates((java.lang.Object[]) typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray25);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("short", type2, typeArray25);
        java.lang.String str30 = signature29.getName();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type31.getDimensions();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        int int15 = type1.getSort();
        int int17 = type1.getOpcode(105);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type1.getElementType();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        boolean boolean15 = generator0.getUseCache();
        generator0.setUseCache(false);
        boolean boolean18 = generator0.getAttemptLoad();
        boolean boolean19 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        generator0.setUseCache(false);
        generator0.setStyle(0);
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getAttemptLoad();
        boolean boolean9 = generator7.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator7.getStrategy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.lang.String str15 = classInfo14.toString();
        org.mockito.asm.Type type16 = classInfo14.getType();
        java.lang.String str17 = classInfo14.toString();
        boolean boolean18 = generatorStrategy10.equals((java.lang.Object) str17);
        generator0.setStrategy(generatorStrategy10);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("V");
        int int23 = type21.getOpcode(2);
        int int25 = type21.getOpcode(100);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = generator26.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = generator26.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean30 = generator29.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = generator31.getNamingPolicy();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean34 = namingPolicy32.equals((java.lang.Object) type33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean37 = type35.equals((java.lang.Object) type36);
        java.lang.String str38 = type36.getDescriptor();
        boolean boolean39 = namingPolicy32.equals((java.lang.Object) str38);
        generator29.setNamingPolicy(namingPolicy32);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type43, type44, type45, type46 };
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", type42, typeArray47);
        org.mockito.asm.Type type49 = signature48.getReturnType();
        boolean boolean50 = namingPolicy32.equals((java.lang.Object) type49);
        generator26.setNamingPolicy(namingPolicy32);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type56, type57, type58, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type55, typeArray60);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("B", type53, typeArray60);
        org.mockito.asm.Type[] typeArray63 = signature62.getArgumentTypes();
        boolean boolean65 = signature62.equals((java.lang.Object) (short) 1);
        java.lang.String str66 = signature62.getName();
        org.mockito.asm.Type[] typeArray67 = signature62.getArgumentTypes();
        generator26.setDelegates((java.lang.Object[]) typeArray67);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy69 = generator26.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy70 = generator26.getNamingPolicy();
        boolean boolean71 = type21.equals((java.lang.Object) generator26);
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = generator26.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray73 = generatorStrategy10.generate((org.mockito.cglib.core.ClassGenerator) generator26);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setConstrained(true);
        java.lang.Object obj12 = propertyDescriptor3.getValue("Lorg/mockito/asm/Type;(JFIF)S");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("boolean", method22, method23);
        propertyDescriptor24.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor24.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method29 = null;
        propertyDescriptor24.setReadMethod(method29);
        boolean boolean31 = propertyDescriptor24.isHidden();
        propertyDescriptor24.setValue("[Ljava/lang/String;", (java.lang.Object) (short) 100);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("boolean", method37, method38);
        propertyDescriptor39.setDisplayName("Z");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        propertyDescriptor39.setValue("boolean", (java.lang.Object) type43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type47, type48, type49, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", type46, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray51);
        propertyDescriptor24.setValue("java.beans.PropertyDescriptor[name=boolean; values={(JFIF)Z=false}; constrained]", (java.lang.Object) typeArray51);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("char", type20, typeArray51);
        java.lang.String str56 = signature55.getDescriptor();
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature55);
        java.lang.reflect.Method method58 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method60 = null;
        java.lang.reflect.Method method61 = null;
        java.beans.PropertyDescriptor propertyDescriptor62 = new java.beans.PropertyDescriptor("hi!", method60, method61);
        boolean boolean63 = propertyDescriptor3.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor24 and propertyDescriptor62", propertyDescriptor24.equals(propertyDescriptor62) ? propertyDescriptor24.hashCode() == propertyDescriptor62.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getAttemptLoad();
        boolean boolean8 = generator6.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = generator6.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator6.getStrategy();
        generator0.setStrategy(generatorStrategy10);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean15 = generator14.getAttemptLoad();
        boolean boolean16 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator14.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator14.getStrategy();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str21 = type20.toString();
        boolean boolean22 = generatorStrategy18.equals((java.lang.Object) str21);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str26 = signature25.getName();
        boolean boolean27 = generatorStrategy18.equals((java.lang.Object) str26);
        boolean boolean29 = generatorStrategy18.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass31 = type30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass31);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, false);
        boolean boolean38 = generatorStrategy18.equals((java.lang.Object) false);
        generator0.setStrategy(generatorStrategy18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader40 = generator0.getClassLoader();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class<?> wildcardClass18 = strArray15.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        boolean boolean21 = generatorStrategy13.equals((java.lang.Object) wildcardClass18);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("(JFIF)V");
        java.lang.String str24 = type23.getClassName();
        int int25 = type23.getSize();
        java.lang.String str26 = type23.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator27 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean28 = generator27.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = generator29.getNamingPolicy();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean32 = namingPolicy30.equals((java.lang.Object) type31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean35 = type33.equals((java.lang.Object) type34);
        java.lang.String str36 = type34.getDescriptor();
        boolean boolean37 = namingPolicy30.equals((java.lang.Object) str36);
        generator27.setNamingPolicy(namingPolicy30);
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean40 = generator39.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = generator39.getNamingPolicy();
        generator27.setNamingPolicy(namingPolicy41);
        generator27.setAttemptLoad(true);
        boolean boolean45 = type23.equals((java.lang.Object) generator27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray46 = generatorStrategy13.generate((org.mockito.cglib.core.ClassGenerator) generator27);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyType();
        java.lang.String str10 = propertyDescriptor3.getName();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("boolean", method14, method15);
        propertyDescriptor16.setBound(true);
        boolean boolean19 = propertyDescriptor16.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("I", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getPropertyEditorClass();
        java.lang.Object obj27 = propertyDescriptor24.getValue("LZ;");
        boolean boolean28 = propertyDescriptor24.isHidden();
        java.lang.String str29 = propertyDescriptor24.getName();
        propertyDescriptor16.setValue("org/mockito/asm/Type", (java.lang.Object) str29);
        java.lang.String str31 = propertyDescriptor16.getShortDescription();
        java.lang.String str32 = propertyDescriptor16.getDisplayName();
        java.lang.reflect.Method method33 = null;
        propertyDescriptor16.setReadMethod(method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=boolean; propertyEditorClass=class [Ljava.beans.PropertyDescriptor;]", (java.lang.Object) propertyDescriptor16);
        org.mockito.cglib.proxy.Mixin.Generator generator38 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = generator38.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator38.getNamingPolicy();
        generator38.setAttemptLoad(true);
        java.lang.ClassLoader classLoader43 = null;
        generator38.setClassLoader(classLoader43);
        boolean boolean45 = generator38.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator38.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator38.getStrategy();
        propertyDescriptor3.setValue("booleanLZ;", (java.lang.Object) generator38);
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("I", method50, method51);
        java.lang.Class<?> wildcardClass53 = propertyDescriptor52.getPropertyEditorClass();
        java.lang.Object obj55 = propertyDescriptor52.getValue("LZ;");
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray59 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray59);
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray63 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray63);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray63);
        java.lang.String[] strArray71 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray74 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray73, methodArray74);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray71, methodArray75);
        java.lang.Class[] classArray77 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray75);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray75);
        propertyDescriptor52.setValue("org/mockito/asm/Type", (java.lang.Object) strArray58);
        java.beans.PropertyDescriptor[] propertyDescriptorArray80 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray83 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray80, true, true);
        java.lang.reflect.Method[] methodArray86 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray80, false, true);
        java.lang.reflect.Method[] methodArray89 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray80, true, true);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray89);
        java.lang.Class[] classArray91 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray89);
        generator38.setDelegates((java.lang.Object[]) classArray91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Z(JFIF)V");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray21);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray21);
        org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type33, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray35);
        generator26.setDelegates((java.lang.Object[]) typeArray35);
        org.mockito.cglib.proxy.Mixin mixin38 = mixin25.newInstance((java.lang.Object[]) typeArray35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("[Ljava/lang/String;", type2, typeArray35);
        java.lang.String str40 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type2.getElementType();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.toString();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        int int19 = type18.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type18.getDimensions();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        java.lang.String str39 = signature13.getDescriptor();
        org.mockito.asm.Type type40 = signature13.getReturnType();
        java.lang.String str41 = type40.getDescriptor();
        int int42 = type40.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str43 = type40.getInternalName();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = generator0.getStrategy();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, false, true);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, true);
        generator0.setDelegates((java.lang.Object[]) propertyDescriptorArray3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy14 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        java.lang.String[] strArray34 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray38);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray40);
        generator26.setClasses(classArray40);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator26.getStrategy();
        boolean boolean44 = namingPolicy6.equals((java.lang.Object) generator26);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean46 = generator45.getAttemptLoad();
        boolean boolean47 = generator45.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator45.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = generator45.getStrategy();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str52 = type51.toString();
        boolean boolean53 = generatorStrategy49.equals((java.lang.Object) str52);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str57 = signature56.getName();
        boolean boolean58 = generatorStrategy49.equals((java.lang.Object) str57);
        generator26.setStrategy(generatorStrategy49);
        boolean boolean60 = generator26.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = generator26.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator62 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator62.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = generator62.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = generator62.getStrategy();
        boolean boolean67 = generator62.getUseCache();
        boolean boolean68 = generator62.getAttemptLoad();
        boolean boolean69 = generator62.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray70 = generatorStrategy61.generate((org.mockito.cglib.core.ClassGenerator) generator62);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        boolean boolean8 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        generator0.setStyle(2);
        generator0.setUseCache(false);
        boolean boolean11 = generator0.getAttemptLoad();
        boolean boolean12 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        boolean boolean15 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        boolean boolean18 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator16.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator16.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean22 = generator21.getAttemptLoad();
        boolean boolean23 = generator21.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator21.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy25 = generator21.getStrategy();
        java.lang.Object obj26 = null;
        boolean boolean27 = generatorStrategy25.equals(obj26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("boolean", method29, method30);
        java.lang.Class<?> wildcardClass32 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str33 = propertyDescriptor31.getName();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        java.lang.String str35 = propertyDescriptor31.getName();
        java.lang.String str36 = propertyDescriptor31.getName();
        boolean boolean37 = generatorStrategy25.equals((java.lang.Object) propertyDescriptor31);
        org.mockito.cglib.proxy.Mixin.Generator generator38 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator38.setUseCache(false);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        generator38.setDelegates((java.lang.Object[]) methodArray44);
        boolean boolean46 = generatorStrategy25.equals((java.lang.Object) generator38);
        generator16.setStrategy(generatorStrategy25);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.Class[] classArray52 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray50);
        java.lang.String[] strArray53 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        java.lang.String[] strArray59 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray62 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray59, methodArray63);
        java.lang.Class[] classArray65 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray63);
        int int66 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray65);
        int int67 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray65);
        java.lang.String[] strArray68 = org.mockito.cglib.core.ReflectUtils.getNames(classArray65);
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Method method71 = null;
        java.beans.PropertyDescriptor propertyDescriptor72 = new java.beans.PropertyDescriptor("boolean", method70, method71);
        propertyDescriptor72.setDisplayName("Z");
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray77 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray76, methodArray77);
        java.beans.PropertyEditor propertyEditor79 = propertyDescriptor72.createPropertyEditor((java.lang.Object) methodArray77);
        java.lang.Class[] classArray80 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray77);
        java.lang.Class[] classArray81 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray77);
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray68, methodArray77);
        java.lang.reflect.Method[] methodArray83 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray53, methodArray77);
        generator16.setDelegates((java.lang.Object[]) methodArray83);
        org.mockito.cglib.core.NamingPolicy namingPolicy85 = generator16.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy85);
        java.lang.reflect.Method method88 = null;
        java.lang.reflect.Method method89 = null;
        java.beans.PropertyDescriptor propertyDescriptor90 = new java.beans.PropertyDescriptor("java.lang.String[]", method88, method89);
        boolean boolean91 = namingPolicy85.equals((java.lang.Object) "java.lang.String[]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor90", propertyDescriptor31.equals(propertyDescriptor90) ? propertyDescriptor31.hashCode() == propertyDescriptor90.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setConstrained(false);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setName("(JFIF)Z");
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        boolean boolean18 = generator16.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator16.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator16.getStrategy();
        generator16.setStyle(2);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) generator16);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = generator16.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean26 = generator25.getAttemptLoad();
        boolean boolean27 = generator25.getUseCache();
        java.lang.ClassLoader classLoader28 = null;
        generator25.setClassLoader(classLoader28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass31 = type30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass31);
        java.lang.String str33 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, false);
        generator25.setDelegates((java.lang.Object[]) methodArray37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator25.getStrategy();
        generator16.setStrategy(generatorStrategy39);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator16.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = generator16.getNamingPolicy();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("boolean", method44, method45);
        java.lang.Class<?> wildcardClass47 = propertyDescriptor46.getPropertyEditorClass();
        java.lang.String str48 = propertyDescriptor46.getName();
        propertyDescriptor46.setHidden(false);
        boolean boolean51 = propertyDescriptor46.isExpert();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type56, type57, type58, type59 };
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", type55, typeArray60);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("B", type53, typeArray60);
        java.beans.PropertyEditor propertyEditor63 = propertyDescriptor46.createPropertyEditor((java.lang.Object) type53);
        boolean boolean64 = propertyDescriptor46.isExpert();
        propertyDescriptor46.setExpert(false);
        boolean boolean67 = namingPolicy42.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = type12.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean15 = generator14.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = generator16.getNamingPolicy();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean19 = namingPolicy17.equals((java.lang.Object) type18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean22 = type20.equals((java.lang.Object) type21);
        java.lang.String str23 = type21.getDescriptor();
        boolean boolean24 = namingPolicy17.equals((java.lang.Object) str23);
        generator14.setNamingPolicy(namingPolicy17);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray32);
        java.lang.String[] strArray40 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray44);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray44);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray44);
        generator14.setDelegates((java.lang.Object[]) methodArray47);
        generator14.setAttemptLoad(false);
        boolean boolean51 = type12.equals((java.lang.Object) false);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type54, type55, type56, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type53, typeArray58);
        org.mockito.asm.Type type60 = signature59.getReturnType();
        java.lang.String str61 = type60.getClassName();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type66, type67, type68, type69 };
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("hi!", type65, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("B", type63, typeArray70);
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type60, typeArray70);
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("LZ;", type12, typeArray70);
        java.lang.Class[] classArray75 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray70);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray70);
        java.lang.String str77 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str78 = type0.getInternalName();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setUseCache(false);
        generator0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = classInfo14.getType();
        int int16 = classInfo14.getModifiers();
        org.mockito.asm.Type type17 = classInfo14.getType();
        org.mockito.asm.Type type18 = classInfo14.getType();
        int int19 = type18.getSort();
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean21 = generator20.getAttemptLoad();
        boolean boolean22 = generator20.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = generator20.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = generator20.getStrategy();
        generator20.setStyle(2);
        generator20.setStyle(2);
        generator20.setUseCache(false);
        boolean boolean31 = generator20.getAttemptLoad();
        boolean boolean32 = generator20.getAttemptLoad();
        boolean boolean33 = type18.equals((java.lang.Object) generator20);
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray36 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray36);
        generator20.setDelegates((java.lang.Object[]) strArray35);
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator39.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = generator39.getNamingPolicy();
        generator39.setAttemptLoad(true);
        generator39.setAttemptLoad(false);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass47 = type46.getClass();
        java.lang.String str48 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.lang.Class[] classArray50 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray49);
        int int51 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray50);
        java.lang.Class[] classArray52 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray50);
        generator39.setClasses(classArray50);
        java.lang.ClassLoader classLoader54 = generator39.getClassLoader();
        org.mockito.asm.Type[] typeArray56 = org.mockito.asm.Type.getArgumentTypes("(JFIF)B");
        org.mockito.cglib.proxy.Mixin mixin57 = org.mockito.cglib.proxy.Mixin.createBean(classLoader54, (java.lang.Object[]) typeArray56);
        generator20.setClassLoader(classLoader54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray59 = generatorStrategy10.generate((org.mockito.cglib.core.ClassGenerator) generator20);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(9);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type12, type13 };
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray14);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("B", type7, typeArray14);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type5, typeArray14);
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator19.setUseCache(false);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type24, type25, type26, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray28);
        generator19.setDelegates((java.lang.Object[]) typeArray28);
        boolean boolean31 = generator19.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator19.getStrategy();
        generator19.setAttemptLoad(true);
        generator19.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean38 = generator37.getAttemptLoad();
        boolean boolean39 = generator37.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy40 = generator37.getStrategy();
        generator19.setStrategy(generatorStrategy40);
        boolean boolean42 = signature17.equals((java.lang.Object) generatorStrategy40);
        java.lang.String str43 = signature17.getDescriptor();
        org.mockito.asm.Type type44 = signature17.getReturnType();
        boolean boolean45 = type0.equals((java.lang.Object) signature17);
        int int46 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = type0.getDimensions();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyType();
        java.lang.String str10 = propertyDescriptor3.getName();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("boolean", method14, method15);
        propertyDescriptor16.setBound(true);
        boolean boolean19 = propertyDescriptor16.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("I", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getPropertyEditorClass();
        java.lang.Object obj27 = propertyDescriptor24.getValue("LZ;");
        boolean boolean28 = propertyDescriptor24.isHidden();
        java.lang.String str29 = propertyDescriptor24.getName();
        propertyDescriptor16.setValue("org/mockito/asm/Type", (java.lang.Object) str29);
        java.lang.String str31 = propertyDescriptor16.getShortDescription();
        java.lang.String str32 = propertyDescriptor16.getDisplayName();
        java.lang.reflect.Method method33 = null;
        propertyDescriptor16.setReadMethod(method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=boolean; propertyEditorClass=class [Ljava.beans.PropertyDescriptor;]", (java.lang.Object) propertyDescriptor16);
        org.mockito.cglib.proxy.Mixin.Generator generator38 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = generator38.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator38.getNamingPolicy();
        generator38.setAttemptLoad(true);
        java.lang.ClassLoader classLoader43 = null;
        generator38.setClassLoader(classLoader43);
        boolean boolean45 = generator38.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator38.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator38.getStrategy();
        propertyDescriptor3.setValue("booleanLZ;", (java.lang.Object) generator38);
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray51 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray50, methodArray51);
        java.lang.Class[] classArray53 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray51);
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray53);
        java.lang.String[] strArray60 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray63 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray63);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray64);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray64);
        int int67 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray66);
        int int68 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray66);
        java.lang.String[] strArray69 = org.mockito.cglib.core.ReflectUtils.getNames(classArray66);
        java.lang.reflect.Method method71 = null;
        java.lang.reflect.Method method72 = null;
        java.beans.PropertyDescriptor propertyDescriptor73 = new java.beans.PropertyDescriptor("boolean", method71, method72);
        propertyDescriptor73.setDisplayName("Z");
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray78 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray77, methodArray78);
        java.beans.PropertyEditor propertyEditor80 = propertyDescriptor73.createPropertyEditor((java.lang.Object) methodArray78);
        java.lang.Class[] classArray81 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray78);
        java.lang.Class[] classArray82 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray78);
        java.lang.reflect.Method[] methodArray83 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray69, methodArray78);
        java.lang.reflect.Method[] methodArray84 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray54, methodArray78);
        generator38.setDelegates((java.lang.Object[]) methodArray78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) ' ');
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getDescriptor();
        int int6 = type0.getSort();
        java.lang.String str7 = type0.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type8.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getReturnType("Z(JFIF)V");
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray19 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray19);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray30 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray30);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray31);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray31);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray31);
        org.mockito.cglib.proxy.Mixin mixin35 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray14);
        org.mockito.cglib.proxy.Mixin.Generator generator36 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator36.setUseCache(false);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type41, type42, type43, type44 };
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", type40, typeArray45);
        generator36.setDelegates((java.lang.Object[]) typeArray45);
        org.mockito.cglib.proxy.Mixin mixin48 = mixin35.newInstance((java.lang.Object[]) typeArray45);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("[Ljava/lang/String;", type12, typeArray45);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray45);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray45);
        java.lang.String str52 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = type0.getDimensions();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type4, type5, type6, type7 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("B", type1, typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type[] typeArray12 = signature10.getArgumentTypes();
        org.mockito.asm.Type type13 = signature10.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        boolean boolean21 = type13.equals((java.lang.Object) wildcardClass15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type13.getInternalName();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        java.lang.String str5 = type2.toString();
        java.lang.String str6 = type2.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type13, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", type10, typeArray15);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("B", type8, typeArray15);
        org.mockito.asm.Type[] typeArray18 = signature17.getArgumentTypes();
        boolean boolean20 = signature17.equals((java.lang.Object) (short) 1);
        org.mockito.asm.Type[] typeArray21 = signature17.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type2.getInternalName();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        boolean boolean15 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean17 = generator16.getAttemptLoad();
        boolean boolean18 = generator16.getUseCache();
        java.lang.ClassLoader classLoader19 = null;
        generator16.setClassLoader(classLoader19);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator16.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy21);
        org.mockito.cglib.proxy.Mixin mixin23 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin23.equals(mixin23)", mixin23.equals(mixin23));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.lang.String str27 = classInfo26.toString();
        org.mockito.asm.Type type28 = classInfo26.getSuperType();
        org.mockito.asm.Type[] typeArray29 = classInfo26.getInterfaces();
        generator0.setDelegates((java.lang.Object[]) typeArray29);
        boolean boolean31 = generator0.getUseCache();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader34 = generator0.getClassLoader();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor7 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setConstrained(false);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        java.lang.Class class16 = null;
        java.lang.Class[] classArray17 = new java.lang.Class[] { class16 };
        generator13.setClasses(classArray17);
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) generator13);
        generator13.setStyle(2);
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator22.setUseCache(false);
        java.lang.String[] strArray30 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray33 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray33);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray34);
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray34);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        generator22.setClasses(classArray36);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = generator22.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean41 = generator40.getAttemptLoad();
        boolean boolean42 = generator40.getUseCache();
        java.lang.ClassLoader classLoader43 = null;
        generator40.setClassLoader(classLoader43);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = generator40.getNamingPolicy();
        boolean boolean47 = namingPolicy45.equals((java.lang.Object) "I");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type50, type51, type52, type53 };
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", type49, typeArray54);
        org.mockito.asm.Type type56 = signature55.getReturnType();
        boolean boolean57 = namingPolicy45.equals((java.lang.Object) type56);
        generator22.setNamingPolicy(namingPolicy45);
        generator13.setNamingPolicy(namingPolicy45);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("boolean", method61, method62);
        propertyDescriptor63.setDisplayName("Z");
        propertyDescriptor63.setConstrained(true);
        propertyDescriptor63.setBound(false);
        java.lang.reflect.Method method70 = null;
        propertyDescriptor63.setReadMethod(method70);
        java.lang.reflect.Method method72 = propertyDescriptor63.getWriteMethod();
        org.mockito.cglib.proxy.Mixin.Generator generator73 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean74 = generator73.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = generator73.getStrategy();
        boolean boolean76 = generator73.getAttemptLoad();
        boolean boolean77 = generator73.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy78 = generator73.getStrategy();
        java.beans.PropertyEditor propertyEditor79 = propertyDescriptor63.createPropertyEditor((java.lang.Object) generatorStrategy78);
        java.lang.reflect.Method method81 = null;
        java.lang.reflect.Method method82 = null;
        java.beans.PropertyDescriptor propertyDescriptor83 = new java.beans.PropertyDescriptor("I", method81, method82);
        java.lang.Class<?> wildcardClass84 = propertyDescriptor83.getPropertyEditorClass();
        java.lang.Object obj86 = propertyDescriptor83.getValue("LZ;");
        java.lang.String str87 = propertyDescriptor83.getShortDescription();
        boolean boolean88 = propertyDescriptor83.isPreferred();
        java.lang.String str89 = propertyDescriptor83.getDisplayName();
        propertyDescriptor83.setShortDescription("[Ljava/lang/String;");
        boolean boolean92 = generatorStrategy78.equals((java.lang.Object) "[Ljava/lang/String;");
        generator13.setStrategy(generatorStrategy78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor83", propertyDescriptor3.equals(propertyDescriptor83) ? propertyDescriptor3.hashCode() == propertyDescriptor83.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type4, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type14, type15, type16, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray18);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("B", type11, typeArray18);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray18);
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator22.setUseCache(false);
        java.lang.String[] strArray30 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray33 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray33);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray34);
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray34);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        generator22.setClasses(classArray36);
        boolean boolean39 = generator22.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator40.setUseCache(false);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray45 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray45);
        generator40.setDelegates((java.lang.Object[]) methodArray46);
        generator22.setDelegates((java.lang.Object[]) methodArray46);
        boolean boolean49 = type8.equals((java.lang.Object) generator22);
        int int51 = type8.getOpcode(1041);
        int int52 = type8.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = type8.getDimensions();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Z(JFIF)V");
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray9 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray9);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray21);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray21);
        org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type33, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray35);
        generator26.setDelegates((java.lang.Object[]) typeArray35);
        org.mockito.cglib.proxy.Mixin mixin38 = mixin25.newInstance((java.lang.Object[]) typeArray35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("[Ljava/lang/String;", type2, typeArray35);
        java.lang.String str40 = type2.getClassName();
        java.lang.String str41 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = type2.getInternalName();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        java.lang.String str39 = signature13.getDescriptor();
        org.mockito.asm.Type type40 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type40.getElementType();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        generator0.setAttemptLoad(true);
        boolean boolean5 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator11 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = generator11.getNamingPolicy();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean14 = namingPolicy12.equals((java.lang.Object) type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) type16);
        java.lang.String str18 = type16.getDescriptor();
        boolean boolean19 = namingPolicy12.equals((java.lang.Object) str18);
        generator9.setNamingPolicy(namingPolicy12);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean22 = generator21.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy23 = generator21.getNamingPolicy();
        generator9.setNamingPolicy(namingPolicy23);
        boolean boolean25 = generator9.getUseCache();
        java.lang.String[] strArray31 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray34 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray31);
        generator9.setDelegates((java.lang.Object[]) strArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray39 = generatorStrategy8.generate((org.mockito.cglib.core.ClassGenerator) generator9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type4, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = type8.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean11 = generator10.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator12.getNamingPolicy();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = namingPolicy13.equals((java.lang.Object) type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) type17);
        java.lang.String str19 = type17.getDescriptor();
        boolean boolean20 = namingPolicy13.equals((java.lang.Object) str19);
        generator10.setNamingPolicy(namingPolicy13);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray40);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray40);
        generator10.setDelegates((java.lang.Object[]) methodArray43);
        generator10.setAttemptLoad(false);
        boolean boolean47 = type8.equals((java.lang.Object) false);
        int int49 = type8.getOpcode((int) 'a');
        int int50 = type8.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type51 = type8.getElementType();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        java.lang.String[] strArray34 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray38);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray40);
        generator26.setClasses(classArray40);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator26.getStrategy();
        boolean boolean44 = namingPolicy6.equals((java.lang.Object) generator26);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean46 = generator45.getAttemptLoad();
        boolean boolean47 = generator45.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator45.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = generator45.getStrategy();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str52 = type51.toString();
        boolean boolean53 = generatorStrategy49.equals((java.lang.Object) str52);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str57 = signature56.getName();
        boolean boolean58 = generatorStrategy49.equals((java.lang.Object) str57);
        generator26.setStrategy(generatorStrategy49);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = generator26.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy61 = generator26.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator62 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean63 = generator62.getAttemptLoad();
        boolean boolean64 = generator62.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy65 = generator62.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = generator62.getStrategy();
        boolean boolean67 = generator62.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator68 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean69 = generator68.getAttemptLoad();
        boolean boolean70 = generator68.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy71 = generator68.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = generator68.getStrategy();
        generator62.setStrategy(generatorStrategy72);
        org.mockito.cglib.core.NamingPolicy namingPolicy74 = generator62.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy75 = generator62.getStrategy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray76 = generatorStrategy61.generate((org.mockito.cglib.core.ClassGenerator) generator62);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setDisplayName("Z");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("I", method14, method15);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor16.getPropertyEditorClass();
        java.lang.Object obj19 = propertyDescriptor16.getValue("LZ;");
        boolean boolean20 = propertyDescriptor16.isHidden();
        propertyDescriptor16.setConstrained(false);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass24 = propertyDescriptor16.getPropertyType();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=boolean; values={java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]=false}; constrained]", (java.lang.Object) propertyDescriptor16);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("boolean", method28, method29);
        propertyDescriptor30.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor30.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor30.setHidden(false);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor30.getPropertyEditorClass();
        propertyDescriptor30.setConstrained(false);
        java.lang.reflect.Method method40 = null;
        propertyDescriptor30.setReadMethod(method40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass43 = type42.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass43);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor30.createPropertyEditor((java.lang.Object) propertyDescriptorArray46);
        propertyDescriptor3.setValue("(JFIF)LLZ;;", (java.lang.Object) propertyDescriptor30);
        boolean boolean49 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor30", propertyDescriptor16.equals(propertyDescriptor30) ? propertyDescriptor16.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator13.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy15);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean22 = generator21.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = generator23.getNamingPolicy();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean26 = namingPolicy24.equals((java.lang.Object) type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) type28);
        java.lang.String str30 = type28.getDescriptor();
        boolean boolean31 = namingPolicy24.equals((java.lang.Object) str30);
        generator21.setNamingPolicy(namingPolicy24);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator21.getStrategy();
        boolean boolean34 = generator21.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator21.getNamingPolicy();
        boolean boolean36 = generator21.getAttemptLoad();
        generator21.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = generator21.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader41 = generator0.getClassLoader();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.toString();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        org.mockito.asm.Type type19 = signature14.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type19.getInternalName();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader14 = generator0.getClassLoader();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        boolean boolean15 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = generator20.getNamingPolicy();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean23 = namingPolicy21.equals((java.lang.Object) type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) type25);
        java.lang.String str27 = type25.getDescriptor();
        boolean boolean28 = namingPolicy21.equals((java.lang.Object) str27);
        generator18.setNamingPolicy(namingPolicy21);
        generator0.setNamingPolicy(namingPolicy21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader31 = generator0.getClassLoader();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        boolean boolean15 = generator0.getUseCache();
        generator0.setUseCache(false);
        boolean boolean18 = generator0.getAttemptLoad();
        boolean boolean19 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader24 = generator0.getClassLoader();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.toString();
        int int9 = type5.getOpcode(6);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("booleanLZ;", type14, typeArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type5, typeArray24);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray24);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        java.lang.String str31 = type0.toString();
        java.lang.String str32 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type0.getElementType();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = classInfo7.getType();
        int int9 = classInfo7.getModifiers();
        java.lang.String str10 = classInfo7.toString();
        org.mockito.asm.Type[] typeArray11 = classInfo7.getInterfaces();
        int int12 = classInfo7.getModifiers();
        org.mockito.asm.Type type13 = classInfo7.getType();
        java.lang.String str14 = classInfo7.toString();
        java.lang.String str15 = classInfo7.toString();
        org.mockito.asm.Type[] typeArray16 = classInfo7.getInterfaces();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("<init>", method18, method19);
        java.lang.String str21 = propertyDescriptor20.getName();
        propertyDescriptor20.setPreferred(true);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("boolean", method25, method26);
        java.lang.Class<?> wildcardClass28 = propertyDescriptor27.getPropertyType();
        java.lang.reflect.Method method29 = null;
        propertyDescriptor27.setWriteMethod(method29);
        boolean boolean31 = propertyDescriptor27.isHidden();
        java.lang.Object obj33 = propertyDescriptor27.getValue("java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
        java.lang.String str34 = propertyDescriptor27.getName();
        boolean boolean35 = propertyDescriptor27.isExpert();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getReturnType("LZ;");
        java.beans.PropertyEditor propertyEditor38 = propertyDescriptor27.createPropertyEditor((java.lang.Object) "LZ;");
        propertyDescriptor27.setExpert(true);
        propertyDescriptor27.setDisplayName("()B");
        java.lang.reflect.Method method43 = null;
        propertyDescriptor27.setWriteMethod(method43);
        java.lang.Class<?> wildcardClass45 = propertyDescriptor27.getPropertyType();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor20.createPropertyEditor((java.lang.Object) propertyDescriptor27);
        boolean boolean47 = classInfo7.equals((java.lang.Object) propertyDescriptor27);
        boolean boolean48 = type2.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor27", propertyDescriptor20.equals(propertyDescriptor27) ? propertyDescriptor20.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        boolean boolean15 = generator0.getUseCache();
        generator0.setUseCache(false);
        boolean boolean18 = generator0.getAttemptLoad();
        boolean boolean19 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin mixin20 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin20.equals(mixin20)", mixin20.equals(mixin20));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean21 = generator20.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = generator20.getNamingPolicy();
        boolean boolean23 = generator20.getAttemptLoad();
        generator20.setUseCache(true);
        generator20.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray28 = generatorStrategy19.generate((org.mockito.cglib.core.ClassGenerator) generator20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader15 = generator0.getClassLoader();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str26 = signature25.getName();
        java.lang.Class<?> wildcardClass27 = signature25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        generator0.setDelegates((java.lang.Object[]) propertyDescriptorArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader30 = generator0.getClassLoader();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator19.setUseCache(false);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type24, type25, type26, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray28);
        generator19.setDelegates((java.lang.Object[]) typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray28);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray28);
        generator0.setDelegates((java.lang.Object[]) typeArray28);
        boolean boolean34 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader35 = generator0.getClassLoader();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        boolean boolean17 = generator0.getUseCache();
        generator0.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.Class<?> wildcardClass18 = strArray15.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        generator0.setDelegates((java.lang.Object[]) propertyDescriptorArray20);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy22 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator23.setUseCache(false);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type28, type29, type30, type31 };
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", type27, typeArray32);
        generator23.setDelegates((java.lang.Object[]) typeArray32);
        boolean boolean35 = generator23.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator23.getStrategy();
        generator23.setAttemptLoad(true);
        generator23.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator41 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean42 = generator41.getAttemptLoad();
        boolean boolean43 = generator41.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator41.getStrategy();
        generator23.setStrategy(generatorStrategy44);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("boolean", method47, method48);
        java.lang.Class<?> wildcardClass50 = propertyDescriptor49.getPropertyEditorClass();
        java.lang.String str51 = propertyDescriptor49.getName();
        java.lang.String str52 = propertyDescriptor49.getShortDescription();
        java.lang.String str53 = propertyDescriptor49.getName();
        java.lang.Class<?> wildcardClass54 = propertyDescriptor49.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass55 = propertyDescriptor49.getPropertyEditorClass();
        boolean boolean56 = generatorStrategy44.equals((java.lang.Object) wildcardClass55);
        generator0.setStrategy(generatorStrategy44);
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("boolean", method59, method60);
        java.lang.Class<?> wildcardClass62 = propertyDescriptor61.getPropertyEditorClass();
        java.lang.String str63 = propertyDescriptor61.getName();
        java.lang.reflect.Method method64 = null;
        propertyDescriptor61.setWriteMethod(method64);
        propertyDescriptor61.setPreferred(false);
        java.lang.Class<?> wildcardClass68 = propertyDescriptor61.getPropertyEditorClass();
        propertyDescriptor61.setName("g.mockito.asm.Type");
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.cglib.proxy.Mixin.Generator generator73 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator73.setUseCache(false);
        org.mockito.asm.Type type77 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type80 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type81 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray82 = new org.mockito.asm.Type[] { type78, type79, type80, type81 };
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("hi!", type77, typeArray82);
        generator73.setDelegates((java.lang.Object[]) typeArray82);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type72, typeArray82);
        java.lang.Class<?> wildcardClass86 = type72.getClass();
        java.lang.String str87 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass86);
        java.beans.PropertyEditor propertyEditor88 = propertyDescriptor61.createPropertyEditor((java.lang.Object) wildcardClass86);
        java.util.Enumeration<java.lang.String> strEnumeration89 = propertyDescriptor61.attributeNames();
        boolean boolean90 = generatorStrategy44.equals((java.lang.Object) strEnumeration89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor49 and propertyDescriptor61", propertyDescriptor49.equals(propertyDescriptor61) ? propertyDescriptor49.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator0.getNamingPolicy();
        boolean boolean6 = generator0.getUseCache();
        generator0.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean10 = generator9.getAttemptLoad();
        boolean boolean11 = generator9.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator9.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator13.getNamingPolicy();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("boolean", method17, method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor19.getPropertyEditorClass();
        java.lang.String str21 = propertyDescriptor19.getName();
        propertyDescriptor19.setConstrained(false);
        java.lang.String str24 = propertyDescriptor19.getShortDescription();
        boolean boolean25 = namingPolicy15.equals((java.lang.Object) str24);
        generator9.setNamingPolicy(namingPolicy15);
        generator9.setUseCache(false);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator29.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy32 = generator29.getNamingPolicy();
        generator9.setNamingPolicy(namingPolicy32);
        generator0.setNamingPolicy(namingPolicy32);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("boolean", method36, method37);
        java.lang.Class<?> wildcardClass39 = propertyDescriptor38.getPropertyEditorClass();
        java.lang.String str40 = propertyDescriptor38.getName();
        java.lang.String str41 = propertyDescriptor38.getShortDescription();
        java.lang.String str42 = propertyDescriptor38.getName();
        propertyDescriptor38.setName("I");
        boolean boolean45 = propertyDescriptor38.isPreferred();
        propertyDescriptor38.setPreferred(false);
        boolean boolean48 = propertyDescriptor38.isPreferred();
        java.lang.String str49 = propertyDescriptor38.getDisplayName();
        java.lang.String str50 = propertyDescriptor38.getName();
        java.lang.reflect.Method method51 = propertyDescriptor38.getWriteMethod();
        boolean boolean52 = namingPolicy32.equals((java.lang.Object) method51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor38", propertyDescriptor19.equals(propertyDescriptor38) ? propertyDescriptor19.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyType();
        java.lang.String str10 = propertyDescriptor3.getName();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("boolean", method14, method15);
        propertyDescriptor16.setBound(true);
        boolean boolean19 = propertyDescriptor16.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("I", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getPropertyEditorClass();
        java.lang.Object obj27 = propertyDescriptor24.getValue("LZ;");
        boolean boolean28 = propertyDescriptor24.isHidden();
        java.lang.String str29 = propertyDescriptor24.getName();
        propertyDescriptor16.setValue("org/mockito/asm/Type", (java.lang.Object) str29);
        java.lang.String str31 = propertyDescriptor16.getShortDescription();
        java.lang.String str32 = propertyDescriptor16.getDisplayName();
        java.lang.reflect.Method method33 = null;
        propertyDescriptor16.setReadMethod(method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=boolean; propertyEditorClass=class [Ljava.beans.PropertyDescriptor;]", (java.lang.Object) propertyDescriptor16);
        org.mockito.cglib.proxy.Mixin.Generator generator38 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = generator38.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = generator38.getNamingPolicy();
        generator38.setAttemptLoad(true);
        java.lang.ClassLoader classLoader43 = null;
        generator38.setClassLoader(classLoader43);
        boolean boolean45 = generator38.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy46 = generator38.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy47 = generator38.getStrategy();
        propertyDescriptor3.setValue("booleanLZ;", (java.lang.Object) generator38);
        generator38.setAttemptLoad(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("Z(JFIF)V");
        java.lang.String[] strArray6 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray7 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray23);
        org.mockito.cglib.proxy.Mixin mixin27 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray6);
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator28.setUseCache(false);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type33, type34, type35, type36 };
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("hi!", type32, typeArray37);
        generator28.setDelegates((java.lang.Object[]) typeArray37);
        org.mockito.cglib.proxy.Mixin mixin40 = mixin27.newInstance((java.lang.Object[]) typeArray37);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("[Ljava/lang/String;", type4, typeArray37);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray37);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.cglib.proxy.Mixin.Generator generator49 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator49.setUseCache(false);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type54, type55, type56, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", type53, typeArray58);
        generator49.setDelegates((java.lang.Object[]) typeArray58);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray58);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type45, typeArray58);
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str64 = type0.getInternalName();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        int int17 = type16.getSort();
        int int18 = type16.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type16.getDimensions();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        int int4 = type2.getSize();
        java.lang.String str5 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type2.getInternalName();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type30, type31, type32, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("B", type27, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        boolean boolean39 = signature36.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = signature36.getName();
        org.mockito.asm.Type[] typeArray41 = signature36.getArgumentTypes();
        generator0.setDelegates((java.lang.Object[]) typeArray41);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator0.getStrategy();
        generator0.setUseCache(false);
        boolean boolean46 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader47 = generator0.getClassLoader();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("boolean", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getPropertyEditorClass();
        java.lang.String str20 = propertyDescriptor18.getName();
        java.lang.reflect.Method method21 = null;
        propertyDescriptor18.setWriteMethod(method21);
        propertyDescriptor18.setHidden(false);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("I", method27, method28);
        java.lang.Class<?> wildcardClass30 = propertyDescriptor29.getPropertyEditorClass();
        java.lang.Object obj32 = propertyDescriptor29.getValue("LZ;");
        propertyDescriptor29.setPreferred(true);
        propertyDescriptor29.setConstrained(true);
        java.lang.reflect.Method method37 = propertyDescriptor29.getWriteMethod();
        propertyDescriptor18.setValue("Z(JFIF)V", (java.lang.Object) propertyDescriptor29);
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean40 = generator39.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator41 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = generator41.getNamingPolicy();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean44 = namingPolicy42.equals((java.lang.Object) type43);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean47 = type45.equals((java.lang.Object) type46);
        java.lang.String str48 = type46.getDescriptor();
        boolean boolean49 = namingPolicy42.equals((java.lang.Object) str48);
        generator39.setNamingPolicy(namingPolicy42);
        org.mockito.cglib.proxy.Mixin.Generator generator51 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean52 = generator51.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = generator51.getNamingPolicy();
        generator39.setNamingPolicy(namingPolicy53);
        boolean boolean55 = generator39.getUseCache();
        java.lang.String[] strArray61 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray64 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray63, methodArray64);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray65);
        java.lang.Class[] classArray67 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray61);
        generator39.setDelegates((java.lang.Object[]) strArray61);
        java.lang.Class[] classArray69 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray61);
        java.beans.PropertyEditor propertyEditor70 = propertyDescriptor18.createPropertyEditor((java.lang.Object) classArray69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass72 = type71.getClass();
        java.lang.String str73 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass72);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass72);
        java.lang.Class[] classArray75 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray74);
        int int76 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray75);
        java.lang.Class[] classArray77 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray75);
        org.mockito.cglib.proxy.Mixin mixin78 = org.mockito.cglib.proxy.Mixin.create(classArray69, (java.lang.Object[]) classArray75);
        generator0.setClasses(classArray69);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy80 = generator0.getStrategy();
        java.lang.reflect.Method method82 = null;
        java.lang.reflect.Method method83 = null;
        java.beans.PropertyDescriptor propertyDescriptor84 = new java.beans.PropertyDescriptor("boolean", method82, method83);
        java.lang.Class<?> wildcardClass85 = propertyDescriptor84.getPropertyEditorClass();
        java.lang.String str86 = propertyDescriptor84.getName();
        propertyDescriptor84.setConstrained(false);
        java.lang.String str89 = propertyDescriptor84.getShortDescription();
        propertyDescriptor84.setConstrained(true);
        java.lang.reflect.Method method92 = null;
        propertyDescriptor84.setReadMethod(method92);
        java.lang.reflect.Method method94 = null;
        propertyDescriptor84.setWriteMethod(method94);
        java.lang.String str96 = propertyDescriptor84.getShortDescription();
        propertyDescriptor84.setBound(false);
        boolean boolean99 = generatorStrategy80.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor29 and propertyDescriptor84", propertyDescriptor29.equals(propertyDescriptor84) ? propertyDescriptor29.hashCode() == propertyDescriptor84.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy6 = generator5.getNamingPolicy();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean8 = namingPolicy6.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getDescriptor();
        boolean boolean13 = namingPolicy6.equals((java.lang.Object) str12);
        generator3.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type19, type20 };
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", type16, typeArray21);
        org.mockito.asm.Type type23 = signature22.getReturnType();
        boolean boolean24 = namingPolicy6.equals((java.lang.Object) type23);
        generator0.setNamingPolicy(namingPolicy6);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type30, type31, type32, type33 };
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type29, typeArray34);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("B", type27, typeArray34);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        boolean boolean39 = signature36.equals((java.lang.Object) (short) 1);
        java.lang.String str40 = signature36.getName();
        org.mockito.asm.Type[] typeArray41 = signature36.getArgumentTypes();
        generator0.setDelegates((java.lang.Object[]) typeArray41);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader47 = generator0.getClassLoader();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        generator0.setAttemptLoad(false);
        boolean boolean19 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator7.setUseCache(false);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type12, type13, type14, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray16);
        generator7.setDelegates((java.lang.Object[]) typeArray16);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Z", type6, typeArray16);
        java.lang.String str20 = signature19.getDescriptor();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        boolean boolean22 = generatorStrategy4.equals((java.lang.Object) type21);
        java.lang.String str23 = type21.getDescriptor();
        java.lang.String str24 = type21.getClassName();
        int int25 = type21.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type21.getElementType();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator13.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy15);
        generator0.setUseCache(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean22 = generator21.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = generator23.getNamingPolicy();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean26 = namingPolicy24.equals((java.lang.Object) type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean29 = type27.equals((java.lang.Object) type28);
        java.lang.String str30 = type28.getDescriptor();
        boolean boolean31 = namingPolicy24.equals((java.lang.Object) str30);
        generator21.setNamingPolicy(namingPolicy24);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator21.getStrategy();
        boolean boolean34 = generator21.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator21.getNamingPolicy();
        boolean boolean36 = generator21.getAttemptLoad();
        generator21.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy39 = generator21.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy39);
        boolean boolean41 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader42 = generator0.getClassLoader();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = type1.toString();
        java.lang.String str16 = type1.toString();
        java.lang.String str17 = type1.getClassName();
        java.lang.String str18 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type1.getElementType();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        java.lang.String str6 = classInfo3.toString();
        org.mockito.asm.Type[] typeArray7 = classInfo3.getInterfaces();
        int int8 = classInfo3.getModifiers();
        org.mockito.asm.Type type9 = classInfo3.getType();
        java.lang.String str10 = classInfo3.toString();
        java.lang.String str11 = classInfo3.toString();
        org.mockito.asm.Type[] typeArray12 = classInfo3.getInterfaces();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("<init>", method14, method15);
        java.lang.String str17 = propertyDescriptor16.getName();
        propertyDescriptor16.setPreferred(true);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("boolean", method21, method22);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor23.getPropertyType();
        java.lang.reflect.Method method25 = null;
        propertyDescriptor23.setWriteMethod(method25);
        boolean boolean27 = propertyDescriptor23.isHidden();
        java.lang.Object obj29 = propertyDescriptor23.getValue("java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
        java.lang.String str30 = propertyDescriptor23.getName();
        boolean boolean31 = propertyDescriptor23.isExpert();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("LZ;");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor23.createPropertyEditor((java.lang.Object) "LZ;");
        propertyDescriptor23.setExpert(true);
        propertyDescriptor23.setDisplayName("()B");
        java.lang.reflect.Method method39 = null;
        propertyDescriptor23.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor23.getPropertyType();
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor16.createPropertyEditor((java.lang.Object) propertyDescriptor23);
        boolean boolean43 = classInfo3.equals((java.lang.Object) propertyDescriptor23);
        java.lang.String str44 = classInfo3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor23", propertyDescriptor16.equals(propertyDescriptor23) ? propertyDescriptor16.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean15 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        boolean boolean17 = generator14.getAttemptLoad();
        boolean boolean18 = generator14.getAttemptLoad();
        generator14.setAttemptLoad(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray21 = generatorStrategy13.generate((org.mockito.cglib.core.ClassGenerator) generator14);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        boolean boolean16 = generator0.getUseCache();
        java.lang.String[] strArray22 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray22);
        generator0.setDelegates((java.lang.Object[]) strArray22);
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean31 = generator30.getAttemptLoad();
        boolean boolean32 = generator30.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator30.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator30.getStrategy();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str37 = type36.toString();
        boolean boolean38 = generatorStrategy34.equals((java.lang.Object) str37);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str42 = signature41.getName();
        boolean boolean43 = generatorStrategy34.equals((java.lang.Object) str42);
        generator0.setStrategy(generatorStrategy34);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean46 = generator45.getAttemptLoad();
        boolean boolean47 = generator45.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy48 = generator45.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = generator45.getStrategy();
        generator45.setStyle(2);
        generator45.setStyle(2);
        generator45.setUseCache(false);
        boolean boolean56 = generator45.getAttemptLoad();
        boolean boolean57 = generator45.getAttemptLoad();
        generator45.setUseCache(true);
        boolean boolean60 = generator45.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy61 = generator45.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray62 = generatorStrategy34.generate((org.mockito.cglib.core.ClassGenerator) generator45);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader9 = generator0.getClassLoader();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        java.lang.String str6 = classInfo3.toString();
        org.mockito.asm.Type[] typeArray7 = classInfo3.getInterfaces();
        int int8 = classInfo3.getModifiers();
        org.mockito.asm.Type type9 = classInfo3.getType();
        java.lang.String str10 = classInfo3.toString();
        java.lang.String str11 = classInfo3.toString();
        org.mockito.asm.Type[] typeArray12 = classInfo3.getInterfaces();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("<init>", method14, method15);
        java.lang.String str17 = propertyDescriptor16.getName();
        propertyDescriptor16.setPreferred(true);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("boolean", method21, method22);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor23.getPropertyType();
        java.lang.reflect.Method method25 = null;
        propertyDescriptor23.setWriteMethod(method25);
        boolean boolean27 = propertyDescriptor23.isHidden();
        java.lang.Object obj29 = propertyDescriptor23.getValue("java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
        java.lang.String str30 = propertyDescriptor23.getName();
        boolean boolean31 = propertyDescriptor23.isExpert();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("LZ;");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor23.createPropertyEditor((java.lang.Object) "LZ;");
        propertyDescriptor23.setExpert(true);
        propertyDescriptor23.setDisplayName("()B");
        java.lang.reflect.Method method39 = null;
        propertyDescriptor23.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor23.getPropertyType();
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor16.createPropertyEditor((java.lang.Object) propertyDescriptor23);
        boolean boolean43 = classInfo3.equals((java.lang.Object) propertyDescriptor23);
        java.lang.Class<?> wildcardClass44 = classInfo3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor23", propertyDescriptor16.equals(propertyDescriptor23) ? propertyDescriptor16.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        propertyDescriptor3.setBound(true);
        boolean boolean6 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("I", method9, method10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor11.getPropertyEditorClass();
        java.lang.Object obj14 = propertyDescriptor11.getValue("LZ;");
        boolean boolean15 = propertyDescriptor11.isHidden();
        java.lang.String str16 = propertyDescriptor11.getName();
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) str16);
        java.lang.String str18 = propertyDescriptor3.getShortDescription();
        java.lang.String str19 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method20 = null;
        propertyDescriptor3.setReadMethod(method20);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("boolean", method24, method25);
        propertyDescriptor26.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor26.createPropertyEditor((java.lang.Object) true);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor26.setReadMethod(method31);
        propertyDescriptor26.setValue("B", (java.lang.Object) "Z");
        java.lang.reflect.Method method36 = propertyDescriptor26.getReadMethod();
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator37.setUseCache(false);
        java.lang.String[] strArray45 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray49);
        java.lang.Class[] classArray51 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray49);
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray51);
        generator37.setClasses(classArray51);
        boolean boolean54 = generator37.getAttemptLoad();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray57 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray57);
        java.lang.Class<?> wildcardClass59 = strArray56.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass59);
        generator37.setDelegates((java.lang.Object[]) propertyDescriptorArray60);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray60, false, false);
        java.beans.PropertyEditor propertyEditor65 = propertyDescriptor26.createPropertyEditor((java.lang.Object) methodArray64);
        java.lang.Class<?> wildcardClass66 = propertyDescriptor26.getClass();
        java.lang.String str67 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo68 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.lang.String str69 = classInfo68.toString();
        org.mockito.asm.Type type70 = classInfo68.getType();
        propertyDescriptor3.setValue("Li!java.beans.PropertyDescriptor[name=boolean;", (java.lang.Object) classInfo68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor26", propertyDescriptor11.equals(propertyDescriptor26) ? propertyDescriptor11.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.toString();
        java.lang.String str16 = signature14.getDescriptor();
        org.mockito.asm.Type type17 = signature14.getReturnType();
        java.lang.String str18 = type17.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type17.getElementType();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.toString();
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = generator3.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = generator3.getNamingPolicy();
        generator3.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy8 = generator3.getNamingPolicy();
        boolean boolean9 = generator3.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator3.getStrategy();
        generator3.setStyle((int) (byte) 1);
        java.lang.String[] strArray18 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray22);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray22);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.Class[] classArray27 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        generator3.setDelegates((java.lang.Object[]) classArray28);
        boolean boolean31 = type1.equals((java.lang.Object) classArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = type1.getDimensions();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader16 = generator0.getClassLoader();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        int int5 = type4.getSize();
        int int7 = type4.getOpcode((-1));
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean9 = generator8.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = generator10.getNamingPolicy();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean13 = namingPolicy11.equals((java.lang.Object) type12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) type15);
        java.lang.String str17 = type15.getDescriptor();
        boolean boolean18 = namingPolicy11.equals((java.lang.Object) str17);
        generator8.setNamingPolicy(namingPolicy11);
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray26 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray26);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray38);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray38);
        generator8.setDelegates((java.lang.Object[]) methodArray41);
        java.lang.Class<?> wildcardClass43 = generator8.getClass();
        java.lang.Class[] classArray44 = null;
        java.lang.reflect.Constructor constructor45 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass43, classArray44);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor45);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor45, 0);
        org.mockito.asm.Type[] typeArray49 = methodInfo48.getExceptionTypes();
        org.mockito.cglib.core.ClassInfo classInfo50 = methodInfo48.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo51 = methodInfo48.getClassInfo();
        boolean boolean52 = type4.equals((java.lang.Object) methodInfo48);
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=boolean; constrained]", method54, method55);
        java.lang.reflect.Method method57 = null;
        propertyDescriptor56.setReadMethod(method57);
        java.lang.reflect.Method method60 = null;
        java.lang.reflect.Method method61 = null;
        java.beans.PropertyDescriptor propertyDescriptor62 = new java.beans.PropertyDescriptor("boolean", method60, method61);
        propertyDescriptor62.setDisplayName("Z");
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray67 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray67);
        java.beans.PropertyEditor propertyEditor69 = propertyDescriptor62.createPropertyEditor((java.lang.Object) methodArray67);
        propertyDescriptor62.setExpert(true);
        propertyDescriptor62.setHidden(false);
        java.lang.reflect.Method method74 = propertyDescriptor62.getReadMethod();
        propertyDescriptor62.setDisplayName("");
        propertyDescriptor62.setBound(false);
        propertyDescriptor62.setName("java.beans.PropertyDescriptor[name=boolean; bound]");
        java.lang.reflect.Method method81 = null;
        propertyDescriptor62.setWriteMethod(method81);
        java.beans.PropertyEditor propertyEditor83 = propertyDescriptor56.createPropertyEditor((java.lang.Object) propertyDescriptor62);
        boolean boolean84 = methodInfo48.equals((java.lang.Object) propertyEditor83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor56 and propertyDescriptor62", propertyDescriptor56.equals(propertyDescriptor62) ? propertyDescriptor56.hashCode() == propertyDescriptor62.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getName();
        java.lang.String str18 = signature14.toString();
        java.lang.String str19 = signature14.getName();
        org.mockito.asm.Type type20 = signature14.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type20.getElementType();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray30);
        generator0.setDelegates((java.lang.Object[]) methodArray33);
        generator0.setAttemptLoad(false);
        java.lang.String[] strArray42 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray45 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray45);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray46);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray46);
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray48);
        generator0.setClasses(classArray48);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator52 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator52.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator52.getNamingPolicy();
        generator52.setAttemptLoad(true);
        boolean boolean58 = generator52.getAttemptLoad();
        boolean boolean59 = generator52.getUseCache();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type64, type65, type66, type67 };
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("hi!", type63, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("B", type61, typeArray68);
        generator52.setDelegates((java.lang.Object[]) typeArray68);
        org.mockito.cglib.core.NamingPolicy namingPolicy72 = generator52.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray73 = generatorStrategy51.generate((org.mockito.cglib.core.ClassGenerator) generator52);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean14 = generator13.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator13.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy15);
        generator0.setUseCache(true);
        boolean boolean19 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader20 = generator0.getClassLoader();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        java.lang.String str3 = type0.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        int int6 = type5.getSize();
        java.lang.String str7 = type5.toString();
        int int9 = type5.getOpcode(6);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        int int17 = type15.getOpcode((int) ' ');
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("booleanLZ;", type14, typeArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type5, typeArray24);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray24);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray24);
        int int32 = type0.getOpcode(1050);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type0.getInternalName();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        generator0.setStyle(2);
        generator0.setStyle(2);
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator0.getNamingPolicy();
        boolean boolean10 = generator0.getAttemptLoad();
        generator0.setStyle(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator13.setUseCache(false);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type18, type19, type20, type21 };
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray22);
        generator13.setDelegates((java.lang.Object[]) typeArray22);
        boolean boolean25 = generator13.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy26 = generator13.getStrategy();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        int int30 = type27.getOpcode(9);
        java.lang.Class<?> wildcardClass31 = type27.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        boolean boolean33 = generatorStrategy26.equals((java.lang.Object) propertyDescriptorArray32);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, false, true);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray38 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray37);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        boolean boolean15 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean18 = generator17.getAttemptLoad();
        boolean boolean19 = generator17.getUseCache();
        generator17.setUseCache(false);
        generator17.setStyle(0);
        org.mockito.cglib.proxy.Mixin.Generator generator24 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean25 = generator24.getAttemptLoad();
        boolean boolean26 = generator24.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator24.getStrategy();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.lang.String str32 = classInfo31.toString();
        org.mockito.asm.Type type33 = classInfo31.getType();
        java.lang.String str34 = classInfo31.toString();
        boolean boolean35 = generatorStrategy27.equals((java.lang.Object) str34);
        generator17.setStrategy(generatorStrategy27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray37 = generatorStrategy16.generate((org.mockito.cglib.core.ClassGenerator) generator17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type4, type5, type6, type7 };
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", type3, typeArray8);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("B", type1, typeArray8);
        org.mockito.asm.Type type11 = signature10.getReturnType();
        org.mockito.asm.Type[] typeArray12 = signature10.getArgumentTypes();
        org.mockito.asm.Type type13 = signature10.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator14.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = generator14.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean18 = generator17.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator19.getNamingPolicy();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean22 = namingPolicy20.equals((java.lang.Object) type21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean25 = type23.equals((java.lang.Object) type24);
        java.lang.String str26 = type24.getDescriptor();
        boolean boolean27 = namingPolicy20.equals((java.lang.Object) str26);
        generator17.setNamingPolicy(namingPolicy20);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type33, type34 };
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("hi!", type30, typeArray35);
        org.mockito.asm.Type type37 = signature36.getReturnType();
        boolean boolean38 = namingPolicy20.equals((java.lang.Object) type37);
        generator14.setNamingPolicy(namingPolicy20);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type44, type45, type46, type47 };
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", type43, typeArray48);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("B", type41, typeArray48);
        org.mockito.asm.Type[] typeArray51 = signature50.getArgumentTypes();
        boolean boolean53 = signature50.equals((java.lang.Object) (short) 1);
        java.lang.String str54 = signature50.getName();
        org.mockito.asm.Type[] typeArray55 = signature50.getArgumentTypes();
        generator14.setDelegates((java.lang.Object[]) typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray55);
        java.lang.String str58 = type13.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type59 = type13.getElementType();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.String str4 = classInfo3.toString();
        org.mockito.asm.Type type5 = classInfo3.getSuperType();
        org.mockito.asm.Type[] typeArray6 = classInfo3.getInterfaces();
        org.mockito.asm.Type type7 = classInfo3.getType();
        int int8 = classInfo3.getModifiers();
        org.mockito.asm.Type type9 = classInfo3.getSuperType();
        int int10 = classInfo3.getModifiers();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("B(JFIF)V");
        boolean boolean13 = classInfo3.equals((java.lang.Object) "B(JFIF)V");
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = generator14.getNamingPolicy();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean17 = namingPolicy15.equals((java.lang.Object) type16);
        java.lang.String str18 = type16.getClassName();
        int int19 = type16.getSize();
        int int20 = type16.getSize();
        boolean boolean21 = classInfo3.equals((java.lang.Object) type16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type16.getDimensions();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("LI;", "LI;");
        org.mockito.cglib.proxy.Mixin.Generator generator3 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean4 = generator3.getAttemptLoad();
        boolean boolean5 = signature2.equals((java.lang.Object) generator3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = generator3.getStrategy();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator9.setUseCache(false);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type14, type15, type16, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray18);
        generator9.setDelegates((java.lang.Object[]) typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("Z", type8, typeArray18);
        java.lang.String str22 = signature21.getDescriptor();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        java.lang.String str24 = signature21.getName();
        java.lang.String str25 = signature21.toString();
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator26.setUseCache(false);
        generator26.setAttemptLoad(true);
        boolean boolean31 = generator26.getAttemptLoad();
        generator26.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator26.getStrategy();
        boolean boolean35 = signature21.equals((java.lang.Object) generator26);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = generator26.getNamingPolicy();
        generator26.setUseCache(true);
        boolean boolean39 = generator26.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy41 = generator40.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = generator40.getNamingPolicy();
        generator40.setAttemptLoad(true);
        generator40.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = generator40.getNamingPolicy();
        generator40.setUseCache(true);
        org.mockito.cglib.proxy.Mixin.Generator generator50 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = generator50.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = generator50.getNamingPolicy();
        generator50.setAttemptLoad(true);
        generator50.setAttemptLoad(false);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass58 = type57.getClass();
        java.lang.String str59 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass58);
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass58);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray60);
        int int62 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray61);
        java.lang.Class[] classArray63 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray61);
        generator50.setClasses(classArray61);
        java.lang.ClassLoader classLoader65 = generator50.getClassLoader();
        org.mockito.asm.Type[] typeArray67 = org.mockito.asm.Type.getArgumentTypes("(JFIF)B");
        org.mockito.cglib.proxy.Mixin mixin68 = org.mockito.cglib.proxy.Mixin.createBean(classLoader65, (java.lang.Object[]) typeArray67);
        generator40.setClassLoader(classLoader65);
        generator26.setClassLoader(classLoader65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray71 = generatorStrategy6.generate((org.mockito.cglib.core.ClassGenerator) generator26);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getAttemptLoad();
        boolean boolean20 = generator18.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator18.getStrategy();
        generator0.setStrategy(generatorStrategy21);
        org.mockito.cglib.proxy.Mixin.Generator generator23 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean24 = generator23.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator25.getNamingPolicy();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean28 = namingPolicy26.equals((java.lang.Object) type27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) type30);
        java.lang.String str32 = type30.getDescriptor();
        boolean boolean33 = namingPolicy26.equals((java.lang.Object) str32);
        generator23.setNamingPolicy(namingPolicy26);
        boolean boolean35 = generator23.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator36 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean37 = generator36.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator36.getNamingPolicy();
        generator23.setNamingPolicy(namingPolicy38);
        generator23.setUseCache(true);
        generator23.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin.Generator generator44 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean45 = generator44.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator46 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy47 = generator46.getNamingPolicy();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean49 = namingPolicy47.equals((java.lang.Object) type48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean52 = type50.equals((java.lang.Object) type51);
        java.lang.String str53 = type51.getDescriptor();
        boolean boolean54 = namingPolicy47.equals((java.lang.Object) str53);
        generator44.setNamingPolicy(namingPolicy47);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy56 = generator44.getStrategy();
        boolean boolean57 = generator44.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = generator44.getNamingPolicy();
        boolean boolean59 = generator44.getAttemptLoad();
        generator44.setUseCache(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy62 = generator44.getNamingPolicy();
        generator23.setNamingPolicy(namingPolicy62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray64 = generatorStrategy21.generate((org.mockito.cglib.core.ClassGenerator) generator23);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getName();
        java.lang.String str18 = signature14.toString();
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator19.setUseCache(false);
        generator19.setAttemptLoad(true);
        boolean boolean24 = generator19.getAttemptLoad();
        generator19.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator19.getStrategy();
        boolean boolean28 = signature14.equals((java.lang.Object) generator19);
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = generator19.getNamingPolicy();
        generator19.setUseCache(true);
        boolean boolean32 = generator19.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader33 = generator19.getClassLoader();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        generator0.setDelegates((java.lang.Object[]) methodArray6);
        generator0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy10 = generator0.getStrategy();
        java.lang.String[] strArray16 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray19 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray19);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.Class[] classArray25 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray24);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean27 = generator26.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy29 = generator28.getNamingPolicy();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean31 = namingPolicy29.equals((java.lang.Object) type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean34 = type32.equals((java.lang.Object) type33);
        java.lang.String str35 = type33.getDescriptor();
        boolean boolean36 = namingPolicy29.equals((java.lang.Object) str35);
        generator26.setNamingPolicy(namingPolicy29);
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray40 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray40);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray44 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray44);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray44);
        java.lang.String[] strArray52 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray55 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray54, methodArray55);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray56);
        java.lang.Class[] classArray58 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray56);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray56);
        generator26.setDelegates((java.lang.Object[]) methodArray59);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray59);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray59);
        generator0.setDelegates((java.lang.Object[]) strArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader64 = generator0.getClassLoader();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        java.lang.String str19 = type18.toString();
        java.lang.String str20 = type18.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type18.getDimensions();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator0.getStrategy();
        boolean boolean21 = generator0.getAttemptLoad();
        boolean boolean22 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin mixin23 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin23.equals(mixin23)", mixin23.equals(mixin23));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) type9);
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        boolean boolean13 = classInfo3.equals((java.lang.Object) type9);
        int int14 = type9.getSize();
        java.lang.String str15 = type9.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type9.getInternalName();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean13 = generator12.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator12.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy14);
        boolean boolean16 = generator0.getUseCache();
        boolean boolean17 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader22 = generator0.getClassLoader();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        boolean boolean12 = namingPolicy1.equals((java.lang.Object) signature11);
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        int int16 = type14.getOpcode(42);
        int int17 = type14.getSize();
        int int19 = type14.getOpcode((int) (byte) 10);
        java.lang.String str20 = type14.getClassName();
        java.lang.String str21 = type14.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type14.getDimensions();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getAttemptLoad();
        boolean boolean6 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator7.setUseCache(false);
        java.lang.Class class10 = null;
        java.lang.Class[] classArray11 = new java.lang.Class[] { class10 };
        generator7.setClasses(classArray11);
        generator0.setDelegates((java.lang.Object[]) classArray11);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("boolean", method15, method16);
        propertyDescriptor17.setDisplayName("Z");
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor17.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor17.setHidden(false);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor17.getPropertyEditorClass();
        propertyDescriptor17.setConstrained(false);
        java.lang.Class<?> wildcardClass27 = propertyDescriptor17.getPropertyType();
        propertyDescriptor17.setName("(JFIF)Z");
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean31 = generator30.getAttemptLoad();
        boolean boolean32 = generator30.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator30.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = generator30.getStrategy();
        generator30.setStyle(2);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor17.createPropertyEditor((java.lang.Object) generator30);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator30.getNamingPolicy();
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean40 = generator39.getAttemptLoad();
        boolean boolean41 = generator39.getUseCache();
        java.lang.ClassLoader classLoader42 = null;
        generator39.setClassLoader(classLoader42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass45);
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, true, false);
        generator39.setDelegates((java.lang.Object[]) methodArray51);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = generator39.getStrategy();
        generator30.setStrategy(generatorStrategy53);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy55 = generator30.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy56 = generator30.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy56);
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=boolean; values={[Ljava/lang/String;=false}; propertyEditorClass=class org.mockito.asm.Type]", method59, method60);
        java.lang.String str62 = propertyDescriptor61.getName();
        boolean boolean63 = propertyDescriptor61.isPreferred();
        java.lang.Class<?> wildcardClass64 = propertyDescriptor61.getPropertyType();
        boolean boolean65 = namingPolicy56.equals((java.lang.Object) wildcardClass64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor61", propertyDescriptor17.equals(propertyDescriptor61) ? propertyDescriptor17.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray3);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.cglib.proxy.Mixin.Generator generator6 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean7 = generator6.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator8 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy9 = generator8.getNamingPolicy();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean11 = namingPolicy9.equals((java.lang.Object) type10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = type12.equals((java.lang.Object) type13);
        java.lang.String str15 = type13.getDescriptor();
        boolean boolean16 = namingPolicy9.equals((java.lang.Object) str15);
        generator6.setNamingPolicy(namingPolicy9);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean19 = generator18.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator18.getNamingPolicy();
        generator6.setNamingPolicy(namingPolicy20);
        boolean boolean22 = generator6.getUseCache();
        java.lang.String[] strArray28 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray31 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray31);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray32);
        java.lang.Class[] classArray34 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray28);
        generator6.setDelegates((java.lang.Object[]) strArray28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray36, true, true);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray36, false, true);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray43);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        boolean boolean3 = generator0.getAttemptLoad();
        generator0.setUseCache(true);
        boolean boolean6 = generator0.getAttemptLoad();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator0.getStrategy();
        boolean boolean8 = generator0.getAttemptLoad();
        generator0.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader11 = generator0.getClassLoader();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy2 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = generator0.getNamingPolicy();
        generator0.setUseCache(true);
        generator0.setAttemptLoad(true);
        boolean boolean12 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader13 = generator0.getClassLoader();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) type9);
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        boolean boolean13 = classInfo3.equals((java.lang.Object) type9);
        int int14 = type9.getSize();
        int int15 = type9.getSize();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        boolean boolean23 = type9.equals((java.lang.Object) classArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type9.getDimensions();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        generator0.setAttemptLoad(true);
        boolean boolean6 = generator0.getAttemptLoad();
        boolean boolean7 = generator0.getUseCache();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type12, type13, type14, type15 };
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", type11, typeArray16);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("B", type9, typeArray16);
        generator0.setDelegates((java.lang.Object[]) typeArray16);
        org.mockito.cglib.core.NamingPolicy namingPolicy20 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator0.getStrategy();
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator22.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = generator22.getNamingPolicy();
        generator22.setAttemptLoad(true);
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray30 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray31);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray32);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray32);
        generator22.setClasses(classArray32);
        org.mockito.cglib.proxy.Mixin.Generator generator36 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = generator36.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator36.getNamingPolicy();
        generator36.setAttemptLoad(true);
        generator36.setAttemptLoad(false);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass44);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray46);
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray47);
        generator36.setClasses(classArray47);
        java.lang.ClassLoader classLoader51 = generator36.getClassLoader();
        generator22.setClassLoader(classLoader51);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = generator22.getNamingPolicy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray54 = generatorStrategy21.generate((org.mockito.cglib.core.ClassGenerator) generator22);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        generator0.setStyle(2);
        generator0.setAttemptLoad(true);
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        generator0.setAttemptLoad(false);
        org.mockito.cglib.proxy.Mixin mixin23 = generator0.create();
        org.junit.Assert.assertTrue("Contract failed: mixin23.equals(mixin23)", mixin23.equals(mixin23));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("I", method2, method3);
        java.lang.Class<?> wildcardClass5 = propertyDescriptor4.getPropertyEditorClass();
        java.lang.Object obj7 = propertyDescriptor4.getValue("LZ;");
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray15);
        java.lang.String[] strArray23 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray26 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray26);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray27);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray27);
        propertyDescriptor4.setValue("org/mockito/asm/Type", (java.lang.Object) strArray10);
        org.mockito.cglib.proxy.Mixin mixin32 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray10);
        java.lang.String[] strArray38 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray41 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray41);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.Class[] classArray50 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray49);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray49);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray51);
        org.mockito.cglib.proxy.Mixin mixin53 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) strArray10);
        boolean boolean54 = type0.equals((java.lang.Object) strArray10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, true);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, false, true);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, true);
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, true);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray67);
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Method method71 = null;
        java.beans.PropertyDescriptor propertyDescriptor72 = new java.beans.PropertyDescriptor("boolean", method70, method71);
        propertyDescriptor72.setDisplayName("Z");
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray77 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray76, methodArray77);
        java.beans.PropertyEditor propertyEditor79 = propertyDescriptor72.createPropertyEditor((java.lang.Object) methodArray77);
        java.lang.Class[] classArray80 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray77);
        java.lang.Class[] classArray81 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray77);
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor72", propertyDescriptor4.equals(propertyDescriptor72) ? propertyDescriptor4.hashCode() == propertyDescriptor72.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("boolean", method14, method15);
        propertyDescriptor16.setDisplayName("Z");
        java.lang.String[] strArray20 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor16.createPropertyEditor((java.lang.Object) methodArray21);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor16.getPropertyType();
        propertyDescriptor16.setDisplayName("I");
        boolean boolean27 = generatorStrategy12.equals((java.lang.Object) "I");
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean32 = signature30.equals((java.lang.Object) 0L);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("boolean", method34, method35);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor36.getPropertyEditorClass();
        java.lang.String str38 = propertyDescriptor36.getName();
        propertyDescriptor36.setHidden(false);
        boolean boolean41 = propertyDescriptor36.isExpert();
        boolean boolean42 = signature30.equals((java.lang.Object) propertyDescriptor36);
        java.lang.String str43 = signature30.getName();
        java.lang.String str44 = signature30.getDescriptor();
        boolean boolean45 = generatorStrategy12.equals((java.lang.Object) str44);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("boolean", method47, method48);
        propertyDescriptor49.setDisplayName("Z");
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray54 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray53, methodArray54);
        java.beans.PropertyEditor propertyEditor56 = propertyDescriptor49.createPropertyEditor((java.lang.Object) methodArray54);
        java.lang.reflect.Method method57 = null;
        propertyDescriptor49.setWriteMethod(method57);
        java.lang.reflect.Method method59 = null;
        propertyDescriptor49.setReadMethod(method59);
        propertyDescriptor49.setName("");
        propertyDescriptor49.setDisplayName("Lorg/mockito/asm/Type;");
        java.lang.String str65 = propertyDescriptor49.getName();
        propertyDescriptor49.setDisplayName("");
        boolean boolean68 = generatorStrategy12.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor49", propertyDescriptor16.equals(propertyDescriptor49) ? propertyDescriptor16.hashCode() == propertyDescriptor49.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type4, type5 };
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray6);
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = type8.getClassName();
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean11 = generator10.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator12 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = generator12.getNamingPolicy();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean15 = namingPolicy13.equals((java.lang.Object) type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) type17);
        java.lang.String str19 = type17.getDescriptor();
        boolean boolean20 = namingPolicy13.equals((java.lang.Object) str19);
        generator10.setNamingPolicy(namingPolicy13);
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray40);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray40);
        generator10.setDelegates((java.lang.Object[]) methodArray43);
        generator10.setAttemptLoad(false);
        boolean boolean47 = type8.equals((java.lang.Object) false);
        int int49 = type8.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type50 = type8.getElementType();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        boolean boolean13 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean15 = generator14.getAttemptLoad();
        boolean boolean16 = generator14.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = generator14.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy18 = generator14.getStrategy();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("I");
        java.lang.String str21 = type20.toString();
        boolean boolean22 = generatorStrategy18.equals((java.lang.Object) str21);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.String str26 = signature25.getName();
        boolean boolean27 = generatorStrategy18.equals((java.lang.Object) str26);
        generator0.setStrategy(generatorStrategy18);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = generator29.getNamingPolicy();
        generator29.setUseCache(false);
        generator29.setAttemptLoad(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray35 = generatorStrategy18.generate((org.mockito.cglib.core.ClassGenerator) generator29);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy1 = generator0.getNamingPolicy();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean3 = namingPolicy1.equals((java.lang.Object) type2);
        java.lang.String str4 = type2.getClassName();
        int int5 = type2.getSize();
        int int6 = type2.getSize();
        int int7 = type2.getSize();
        int int8 = type2.getSort();
        java.lang.String str9 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type2.getInternalName();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator0.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getUseCache();
        boolean boolean6 = generator0.getAttemptLoad();
        org.mockito.cglib.proxy.Mixin.Generator generator7 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean8 = generator7.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = generator9.getNamingPolicy();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean12 = namingPolicy10.equals((java.lang.Object) type11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) type14);
        java.lang.String str16 = type14.getDescriptor();
        boolean boolean17 = namingPolicy10.equals((java.lang.Object) str16);
        generator7.setNamingPolicy(namingPolicy10);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy19 = generator7.getStrategy();
        boolean boolean20 = generator7.getAttemptLoad();
        java.lang.String[] strArray26 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray32);
        generator7.setClasses(classArray32);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = generator7.getNamingPolicy();
        generator0.setNamingPolicy(namingPolicy35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader37 = generator0.getClassLoader();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        java.lang.String str6 = classInfo3.toString();
        org.mockito.asm.Type[] typeArray7 = classInfo3.getInterfaces();
        int int8 = classInfo3.getModifiers();
        org.mockito.asm.Type type9 = classInfo3.getType();
        java.lang.String str10 = classInfo3.toString();
        java.lang.String str11 = classInfo3.toString();
        org.mockito.asm.Type[] typeArray12 = classInfo3.getInterfaces();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("<init>", method14, method15);
        java.lang.String str17 = propertyDescriptor16.getName();
        propertyDescriptor16.setPreferred(true);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("boolean", method21, method22);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor23.getPropertyType();
        java.lang.reflect.Method method25 = null;
        propertyDescriptor23.setWriteMethod(method25);
        boolean boolean27 = propertyDescriptor23.isHidden();
        java.lang.Object obj29 = propertyDescriptor23.getValue("java.beans.PropertyDescriptor[name=I; shortDescription=java.beans.PropertyDescriptor[name=boolean]]");
        java.lang.String str30 = propertyDescriptor23.getName();
        boolean boolean31 = propertyDescriptor23.isExpert();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getReturnType("LZ;");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor23.createPropertyEditor((java.lang.Object) "LZ;");
        propertyDescriptor23.setExpert(true);
        propertyDescriptor23.setDisplayName("()B");
        java.lang.reflect.Method method39 = null;
        propertyDescriptor23.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor23.getPropertyType();
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor16.createPropertyEditor((java.lang.Object) propertyDescriptor23);
        boolean boolean43 = classInfo3.equals((java.lang.Object) propertyDescriptor23);
        org.mockito.asm.Type type44 = classInfo3.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor23", propertyDescriptor16.equals(propertyDescriptor23) ? propertyDescriptor16.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type4 = classInfo3.getType();
        int int5 = classInfo3.getModifiers();
        org.mockito.asm.Type type6 = classInfo3.getSuperType();
        org.mockito.asm.Type type7 = classInfo3.getType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) type9);
        java.lang.String str11 = type9.getClassName();
        int int12 = type9.getSort();
        boolean boolean13 = classInfo3.equals((java.lang.Object) type9);
        int int14 = type9.getSize();
        int int15 = type9.getSize();
        java.lang.String str16 = type9.getDescriptor();
        int int18 = type9.getOpcode(14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type9.getDimensions();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setUseCache(false);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type7, type8 };
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", type4, typeArray9);
        generator0.setDelegates((java.lang.Object[]) typeArray9);
        boolean boolean12 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = generator0.getStrategy();
        generator0.setAttemptLoad(true);
        boolean boolean16 = generator0.getUseCache();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("B");
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator19.setUseCache(false);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type24, type25, type26, type27 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray28);
        generator19.setDelegates((java.lang.Object[]) typeArray28);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray28);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray28);
        generator0.setDelegates((java.lang.Object[]) typeArray28);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader36 = generator0.getClassLoader();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getAttemptLoad();
        boolean boolean2 = generator0.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = generator0.getStrategy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy4 = generator0.getStrategy();
        boolean boolean5 = generator0.getAttemptLoad();
        boolean boolean6 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader7 = generator0.getClassLoader();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type8, type9 };
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", type5, typeArray10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("B", type3, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; displayName=Z; values={B=Z}]", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.cglib.proxy.Mixin.Generator generator15 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator15.setUseCache(false);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type22, type23 };
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", type19, typeArray24);
        generator15.setDelegates((java.lang.Object[]) typeArray24);
        boolean boolean27 = generator15.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator15.getStrategy();
        generator15.setAttemptLoad(true);
        generator15.setAttemptLoad(true);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean34 = generator33.getAttemptLoad();
        boolean boolean35 = generator33.getUseCache();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = generator33.getStrategy();
        generator15.setStrategy(generatorStrategy36);
        boolean boolean38 = signature13.equals((java.lang.Object) generatorStrategy36);
        java.lang.String str39 = signature13.getDescriptor();
        org.mockito.asm.Type type40 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = type40.getInternalName();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = generator0.getStrategy();
        boolean boolean13 = generator0.getAttemptLoad();
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = generator0.getNamingPolicy();
        boolean boolean15 = generator0.getAttemptLoad();
        boolean boolean16 = generator0.getUseCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader17 = generator0.getClassLoader();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = generator2.getNamingPolicy();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.DOUBLE_TYPE;
        boolean boolean5 = namingPolicy3.equals((java.lang.Object) type4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.getDescriptor();
        boolean boolean10 = namingPolicy3.equals((java.lang.Object) str9);
        generator0.setNamingPolicy(namingPolicy3);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type14, type15, type16, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", type13, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        boolean boolean21 = namingPolicy3.equals((java.lang.Object) type20);
        int int23 = type20.getOpcode((int) '4');
        java.lang.String str24 = type20.getDescriptor();
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator25.setUseCache(false);
        java.lang.String[] strArray33 = new java.lang.String[] { "boolean", "", "", "boolean", "" };
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray36 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        generator25.setClasses(classArray39);
        generator25.setAttemptLoad(true);
        boolean boolean44 = type20.equals((java.lang.Object) generator25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int45 = type20.getDimensions();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.proxy.Mixin.Generator generator2 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator2.setUseCache(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type7, type8, type9, type10 };
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", type6, typeArray11);
        generator2.setDelegates((java.lang.Object[]) typeArray11);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("Z", type1, typeArray11);
        java.lang.String str15 = signature14.getDescriptor();
        org.mockito.asm.Type type16 = signature14.getReturnType();
        java.lang.String str17 = signature14.getDescriptor();
        org.mockito.asm.Type type18 = signature14.getReturnType();
        java.lang.String str19 = type18.toString();
        boolean boolean21 = type18.equals((java.lang.Object) "(JFIF)D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type18.getElementType();
    }
}


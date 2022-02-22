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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean4 = signature2.equals((java.lang.Object) type3);
        java.lang.String str5 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type3.getElementType();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(I)LI;");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("Ljava/beans/PropertyDescriptor;", type2, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type2.getElementType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        enhancer3.setNamingPolicy(namingPolicy7);
        enhancer2.setNamingPolicy(namingPolicy7);
        boolean boolean10 = type0.equals((java.lang.Object) namingPolicy7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        java.lang.String str50 = methodInfo49.toString();
        int int51 = methodInfo49.getModifiers();
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("hi!", method53, method54);
        propertyDescriptor55.setShortDescription("J");
        java.lang.Class<?> wildcardClass58 = propertyDescriptor55.getPropertyType();
        java.lang.Class<?> wildcardClass59 = propertyDescriptor55.getClass();
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Method method63 = null;
        java.beans.PropertyDescriptor propertyDescriptor64 = new java.beans.PropertyDescriptor("hi!", method62, method63);
        java.lang.reflect.Method method65 = propertyDescriptor64.getReadMethod();
        java.lang.Class<?> wildcardClass66 = propertyDescriptor64.getPropertyEditorClass();
        propertyDescriptor64.setHidden(false);
        boolean boolean69 = propertyDescriptor64.isHidden();
        java.lang.Class<?> wildcardClass70 = propertyDescriptor64.getPropertyEditorClass();
        boolean boolean71 = classInfo60.equals((java.lang.Object) propertyDescriptor64);
        int int72 = classInfo60.getModifiers();
        org.mockito.asm.Type type73 = classInfo60.getType();
        java.lang.reflect.Method method75 = null;
        java.lang.reflect.Method method76 = null;
        java.beans.PropertyDescriptor propertyDescriptor77 = new java.beans.PropertyDescriptor("hi!", method75, method76);
        java.lang.reflect.Method method78 = propertyDescriptor77.getReadMethod();
        java.lang.Class<?> wildcardClass79 = propertyDescriptor77.getPropertyEditorClass();
        propertyDescriptor77.setHidden(false);
        boolean boolean82 = propertyDescriptor77.isHidden();
        java.lang.Class<?> wildcardClass83 = propertyDescriptor77.getPropertyEditorClass();
        propertyDescriptor77.setName("java/beans/PropertyDescriptor");
        propertyDescriptor77.setName("(I)LI;");
        propertyDescriptor77.setShortDescription("(I)LI;");
        java.lang.reflect.Method method90 = propertyDescriptor77.getReadMethod();
        boolean boolean91 = classInfo60.equals((java.lang.Object) propertyDescriptor77);
        boolean boolean92 = methodInfo49.equals((java.lang.Object) boolean91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor77", propertyDescriptor16.equals(propertyDescriptor77) ? propertyDescriptor16.hashCode() == propertyDescriptor77.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        boolean boolean4 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        propertyDescriptor10.setShortDescription("J");
        java.lang.Class<?> wildcardClass13 = propertyDescriptor10.getPropertyType();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.reflect.Method method20 = propertyDescriptor19.getReadMethod();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor19.getPropertyEditorClass();
        propertyDescriptor19.setHidden(false);
        boolean boolean24 = propertyDescriptor19.isHidden();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor19.getPropertyEditorClass();
        boolean boolean26 = classInfo15.equals((java.lang.Object) propertyDescriptor19);
        int int27 = classInfo15.getModifiers();
        org.mockito.asm.Type type28 = classInfo15.getType();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.reflect.Method method33 = propertyDescriptor32.getReadMethod();
        java.lang.Class<?> wildcardClass34 = propertyDescriptor32.getPropertyEditorClass();
        propertyDescriptor32.setHidden(false);
        boolean boolean37 = propertyDescriptor32.isHidden();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor32.getPropertyEditorClass();
        propertyDescriptor32.setName("java/beans/PropertyDescriptor");
        propertyDescriptor32.setName("(I)LI;");
        propertyDescriptor32.setShortDescription("(I)LI;");
        java.lang.reflect.Method method45 = propertyDescriptor32.getReadMethod();
        boolean boolean46 = classInfo15.equals((java.lang.Object) propertyDescriptor32);
        propertyDescriptor32.setConstrained(false);
        propertyDescriptor3.setValue("(I)I", (java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor32", propertyDescriptor10.equals(propertyDescriptor32) ? propertyDescriptor10.hashCode() == propertyDescriptor32.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter1 = null;
        enhancer0.setCallbackFilter(callbackFilter1);
        boolean boolean3 = enhancer0.getAttemptLoad();
        boolean boolean4 = enhancer0.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        enhancer5.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = null;
        enhancer5.setStrategy(generatorStrategy8);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        enhancer5.setInterfaces(classArray10);
        org.mockito.cglib.core.NamingPolicy namingPolicy14 = enhancer5.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy15 = enhancer5.getStrategy();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        boolean boolean20 = propertyDescriptor19.isHidden();
        propertyDescriptor19.setHidden(false);
        boolean boolean23 = generatorStrategy15.equals((java.lang.Object) false);
        enhancer0.setStrategy(generatorStrategy15);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer0.getNamingPolicy();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        propertyDescriptor29.setShortDescription("J");
        java.lang.Class<?> wildcardClass32 = propertyDescriptor29.getPropertyType();
        java.lang.Class<?> wildcardClass33 = propertyDescriptor29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo34 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.lang.reflect.Method method39 = propertyDescriptor38.getReadMethod();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor38.getPropertyEditorClass();
        propertyDescriptor38.setHidden(false);
        boolean boolean43 = propertyDescriptor38.isHidden();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor38.getPropertyEditorClass();
        boolean boolean45 = classInfo34.equals((java.lang.Object) propertyDescriptor38);
        int int46 = classInfo34.getModifiers();
        org.mockito.asm.Type type47 = classInfo34.getType();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        java.lang.reflect.Method method52 = propertyDescriptor51.getReadMethod();
        java.lang.Class<?> wildcardClass53 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setHidden(false);
        boolean boolean56 = propertyDescriptor51.isHidden();
        java.lang.Class<?> wildcardClass57 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setName("java/beans/PropertyDescriptor");
        propertyDescriptor51.setName("(I)LI;");
        propertyDescriptor51.setShortDescription("(I)LI;");
        java.lang.reflect.Method method64 = propertyDescriptor51.getReadMethod();
        boolean boolean65 = classInfo34.equals((java.lang.Object) propertyDescriptor51);
        java.lang.Object obj67 = propertyDescriptor51.getValue("va/beans/FeatureDescriptor");
        boolean boolean68 = namingPolicy25.equals(obj67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor51", propertyDescriptor19.equals(propertyDescriptor51) ? propertyDescriptor19.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.reflect.Method method13 = propertyDescriptor12.getReadMethod();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setHidden(false);
        boolean boolean17 = propertyDescriptor12.isHidden();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor12.getPropertyEditorClass();
        boolean boolean19 = classInfo8.equals((java.lang.Object) propertyDescriptor12);
        int int20 = classInfo8.getModifiers();
        org.mockito.asm.Type type21 = classInfo8.getType();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("hi!", method23, method24);
        java.lang.reflect.Method method26 = propertyDescriptor25.getReadMethod();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor25.getPropertyEditorClass();
        propertyDescriptor25.setHidden(false);
        boolean boolean30 = propertyDescriptor25.isHidden();
        java.lang.Class<?> wildcardClass31 = propertyDescriptor25.getPropertyEditorClass();
        propertyDescriptor25.setName("java/beans/PropertyDescriptor");
        propertyDescriptor25.setName("(I)LI;");
        propertyDescriptor25.setShortDescription("(I)LI;");
        java.lang.reflect.Method method38 = propertyDescriptor25.getReadMethod();
        boolean boolean39 = classInfo8.equals((java.lang.Object) propertyDescriptor25);
        java.lang.String str40 = classInfo8.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor25", propertyDescriptor3.equals(propertyDescriptor25) ? propertyDescriptor3.hashCode() == propertyDescriptor25.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean4 = signature2.equals((java.lang.Object) type3);
        java.lang.String str5 = type3.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type3.getInternalName();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        propertyDescriptor17.setShortDescription("J");
        java.lang.Class<?> wildcardClass20 = propertyDescriptor17.getPropertyType();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.reflect.Method method27 = propertyDescriptor26.getReadMethod();
        java.lang.Class<?> wildcardClass28 = propertyDescriptor26.getPropertyEditorClass();
        propertyDescriptor26.setHidden(false);
        boolean boolean31 = propertyDescriptor26.isHidden();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor26.getPropertyEditorClass();
        boolean boolean33 = classInfo22.equals((java.lang.Object) propertyDescriptor26);
        int int34 = classInfo22.getModifiers();
        org.mockito.asm.Type type35 = classInfo22.getType();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.reflect.Method method40 = propertyDescriptor39.getReadMethod();
        java.lang.Class<?> wildcardClass41 = propertyDescriptor39.getPropertyEditorClass();
        propertyDescriptor39.setHidden(false);
        boolean boolean44 = propertyDescriptor39.isHidden();
        java.lang.Class<?> wildcardClass45 = propertyDescriptor39.getPropertyEditorClass();
        propertyDescriptor39.setName("java/beans/PropertyDescriptor");
        propertyDescriptor39.setName("(I)LI;");
        propertyDescriptor39.setShortDescription("(I)LI;");
        java.lang.reflect.Method method52 = propertyDescriptor39.getReadMethod();
        boolean boolean53 = classInfo22.equals((java.lang.Object) propertyDescriptor39);
        java.lang.Object obj55 = propertyDescriptor39.getValue("va/beans/FeatureDescriptor");
        java.lang.reflect.Method method56 = propertyDescriptor39.getReadMethod();
        boolean boolean57 = classInfo13.equals((java.lang.Object) method56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor39", propertyDescriptor3.equals(propertyDescriptor39) ? propertyDescriptor3.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 100);
        int int51 = methodInfo50.getModifiers();
        org.mockito.asm.Type[] typeArray52 = methodInfo50.getExceptionTypes();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        java.lang.reflect.Method method57 = propertyDescriptor56.getReadMethod();
        java.lang.Class<?> wildcardClass58 = propertyDescriptor56.getPropertyEditorClass();
        propertyDescriptor56.setHidden(false);
        boolean boolean61 = propertyDescriptor56.isHidden();
        propertyDescriptor56.setName("(FIDCCJ)I");
        boolean boolean64 = methodInfo50.equals((java.lang.Object) propertyDescriptor56);
        org.mockito.asm.Type[] typeArray65 = methodInfo50.getExceptionTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor56", propertyDescriptor16.equals(propertyDescriptor56) ? propertyDescriptor16.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        enhancer3.setNamingPolicy(namingPolicy7);
        enhancer2.setNamingPolicy(namingPolicy7);
        boolean boolean10 = type0.equals((java.lang.Object) namingPolicy7);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        propertyDescriptor14.setShortDescription("J");
        java.lang.Class<?> wildcardClass17 = propertyDescriptor14.getPropertyType();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor14.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, false, true);
        boolean boolean25 = namingPolicy7.equals((java.lang.Object) false);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        enhancer27.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = enhancer27.getNamingPolicy();
        enhancer26.setNamingPolicy(namingPolicy30);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        enhancer33.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer33.getNamingPolicy();
        enhancer32.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.Callback callback38 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray39 = new org.mockito.cglib.proxy.Callback[] { callback38 };
        enhancer32.setCallbacks(callbackArray39);
        enhancer26.setCallbacks(callbackArray39);
        org.mockito.cglib.core.NamingPolicy namingPolicy42 = enhancer26.getNamingPolicy();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("(I)I", method44, method45);
        boolean boolean47 = namingPolicy42.equals((java.lang.Object) propertyDescriptor46);
        boolean boolean48 = namingPolicy7.equals((java.lang.Object) boolean47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor46", propertyDescriptor14.equals(propertyDescriptor46) ? propertyDescriptor14.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 100);
        int int51 = methodInfo50.getModifiers();
        org.mockito.asm.Type[] typeArray52 = methodInfo50.getExceptionTypes();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        java.lang.reflect.Method method57 = propertyDescriptor56.getReadMethod();
        java.lang.Class<?> wildcardClass58 = propertyDescriptor56.getPropertyEditorClass();
        propertyDescriptor56.setHidden(false);
        boolean boolean61 = propertyDescriptor56.isHidden();
        propertyDescriptor56.setName("(FIDCCJ)I");
        boolean boolean64 = methodInfo50.equals((java.lang.Object) propertyDescriptor56);
        int int65 = methodInfo50.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor56", propertyDescriptor16.equals(propertyDescriptor56) ? propertyDescriptor16.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.toString();
        int int6 = type4.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type4, type7, type8, type9, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str14 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type0.getInternalName();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean4 = signature2.equals((java.lang.Object) type3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        boolean boolean8 = signature2.equals((java.lang.Object) classArray5);
        java.lang.String str9 = signature2.toString();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        propertyDescriptor13.setShortDescription("J");
        java.lang.Class<?> wildcardClass16 = propertyDescriptor13.getPropertyType();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        boolean boolean20 = signature2.equals((java.lang.Object) classInfo18);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.reflect.Method method25 = propertyDescriptor24.getReadMethod();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor24.getPropertyEditorClass();
        propertyDescriptor24.setHidden(false);
        boolean boolean29 = propertyDescriptor24.isHidden();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor24.getPropertyEditorClass();
        propertyDescriptor24.setName("java/beans/PropertyDescriptor");
        propertyDescriptor24.setName("I");
        boolean boolean35 = classInfo18.equals((java.lang.Object) "I");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor24", propertyDescriptor13.equals(propertyDescriptor24) ? propertyDescriptor13.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)Lava.beans.PropertyDescriptor[name=hi!;");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type2.getInternalName();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str15 = type14.toString();
        boolean boolean17 = type14.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str19 = type18.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type20 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray22);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type14, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type12.getElementType();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method21 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("(I)J");
        java.lang.reflect.Method method24 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean27 = type12.equals((java.lang.Object) propertyDescriptor16);
        org.mockito.asm.Type[] typeArray29 = org.mockito.asm.Type.getArgumentTypes("()B");
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 100);
        int int51 = methodInfo50.getModifiers();
        org.mockito.asm.Type[] typeArray52 = methodInfo50.getExceptionTypes();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        java.lang.reflect.Method method57 = propertyDescriptor56.getReadMethod();
        java.lang.Class<?> wildcardClass58 = propertyDescriptor56.getPropertyEditorClass();
        propertyDescriptor56.setHidden(false);
        boolean boolean61 = propertyDescriptor56.isHidden();
        propertyDescriptor56.setName("(FIDCCJ)I");
        boolean boolean64 = methodInfo50.equals((java.lang.Object) propertyDescriptor56);
        java.lang.Class<?> wildcardClass65 = methodInfo50.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor56", propertyDescriptor16.equals(propertyDescriptor56) ? propertyDescriptor16.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (-1));
        org.mockito.cglib.core.MethodInfo methodInfo52 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        java.lang.String str53 = methodInfo52.toString();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.reflect.Method method58 = propertyDescriptor57.getReadMethod();
        java.lang.Class<?> wildcardClass59 = propertyDescriptor57.getPropertyEditorClass();
        propertyDescriptor57.setHidden(false);
        boolean boolean62 = propertyDescriptor57.isHidden();
        java.lang.Class<?> wildcardClass63 = propertyDescriptor57.getPropertyEditorClass();
        propertyDescriptor57.setName("java/beans/PropertyDescriptor");
        boolean boolean66 = methodInfo52.equals((java.lang.Object) "java/beans/PropertyDescriptor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor57", propertyDescriptor16.equals(propertyDescriptor57) ? propertyDescriptor16.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean4 = signature2.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type3.getInternalName();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        org.mockito.asm.Type type12 = signature11.getReturnType();
        int int14 = type12.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type12.getDimensions();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(I)LI;", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setShortDescription("J");
        java.lang.Class<?> wildcardClass11 = propertyDescriptor8.getPropertyType();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor8.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=java/beans/PropertyDescriptor; hidden; expert]", (java.lang.Object) wildcardClass12);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor8", propertyDescriptor3.equals(propertyDescriptor8) ? propertyDescriptor3.hashCode() == propertyDescriptor8.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        java.lang.String str12 = signature11.toString();
        org.mockito.asm.Type[] typeArray13 = signature11.getArgumentTypes();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        org.mockito.asm.Type type15 = signature11.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type15.getElementType();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(I)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 100);
        int int51 = methodInfo50.getModifiers();
        org.mockito.asm.Type[] typeArray52 = methodInfo50.getExceptionTypes();
        org.mockito.cglib.core.ClassInfo classInfo53 = methodInfo50.getClassInfo();
        org.mockito.asm.Type type54 = classInfo53.getSuperType();
        org.mockito.asm.Type[] typeArray55 = classInfo53.getInterfaces();
        org.mockito.asm.Type type56 = classInfo53.getSuperType();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        enhancer57.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy60 = null;
        enhancer57.setStrategy(generatorStrategy60);
        boolean boolean62 = enhancer57.getUseCache();
        enhancer57.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer65 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer66 = new org.mockito.cglib.proxy.Enhancer();
        enhancer66.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy69 = enhancer66.getNamingPolicy();
        enhancer65.setNamingPolicy(namingPolicy69);
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer72 = new org.mockito.cglib.proxy.Enhancer();
        enhancer72.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy75 = enhancer72.getNamingPolicy();
        enhancer71.setNamingPolicy(namingPolicy75);
        org.mockito.cglib.proxy.Callback callback77 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray78 = new org.mockito.cglib.proxy.Callback[] { callback77 };
        enhancer71.setCallbacks(callbackArray78);
        enhancer65.setCallbacks(callbackArray78);
        org.mockito.cglib.core.NamingPolicy namingPolicy81 = enhancer65.getNamingPolicy();
        java.lang.reflect.Method method83 = null;
        java.lang.reflect.Method method84 = null;
        java.beans.PropertyDescriptor propertyDescriptor85 = new java.beans.PropertyDescriptor("(I)I", method83, method84);
        boolean boolean86 = namingPolicy81.equals((java.lang.Object) propertyDescriptor85);
        enhancer57.setNamingPolicy(namingPolicy81);
        enhancer57.setAttemptLoad(true);
        org.mockito.cglib.proxy.Callback callback90 = null;
        enhancer57.setCallback(callback90);
        java.lang.Class class92 = null;
        enhancer57.setSuperclass(class92);
        boolean boolean94 = type56.equals((java.lang.Object) class92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor85", propertyDescriptor16.equals(propertyDescriptor85) ? propertyDescriptor16.hashCode() == propertyDescriptor85.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java/beans/FeatureDescriptor", "(I)I");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        java.lang.String str5 = signature2.getName();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = null;
        enhancer0.setStrategy(generatorStrategy3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        enhancer0.setInterfaces(classArray5);
        enhancer0.setUseCache(true);
        org.mockito.cglib.proxy.Callback callback11 = null;
        enhancer0.setCallback(callback11);
        java.lang.ClassLoader classLoader13 = null;
        enhancer0.setClassLoader(classLoader13);
        enhancer0.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        enhancer17.setNamingPolicy(namingPolicy21);
        org.mockito.cglib.proxy.Enhancer enhancer23 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy27 = enhancer24.getNamingPolicy();
        enhancer23.setNamingPolicy(namingPolicy27);
        org.mockito.cglib.proxy.Callback callback29 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray30 = new org.mockito.cglib.proxy.Callback[] { callback29 };
        enhancer23.setCallbacks(callbackArray30);
        enhancer17.setCallbacks(callbackArray30);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer17.getNamingPolicy();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("(I)I", method35, method36);
        boolean boolean38 = namingPolicy33.equals((java.lang.Object) propertyDescriptor37);
        enhancer0.setNamingPolicy(namingPolicy33);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        enhancer42.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer42.getNamingPolicy();
        enhancer41.setNamingPolicy(namingPolicy45);
        enhancer40.setNamingPolicy(namingPolicy45);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter48 = null;
        enhancer40.setCallbackFilter(callbackFilter48);
        enhancer40.setUseCache(false);
        java.lang.ClassLoader classLoader52 = enhancer40.getClassLoader();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        propertyDescriptor56.setShortDescription("J");
        java.lang.Class<?> wildcardClass59 = propertyDescriptor56.getPropertyType();
        java.lang.Class<?> wildcardClass60 = propertyDescriptor56.getClass();
        org.mockito.cglib.core.ClassInfo classInfo61 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        enhancer40.setSuperclass((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        java.lang.String str64 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass60);
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("hi!", method66, method67);
        propertyDescriptor68.setShortDescription("J");
        java.lang.Class<?> wildcardClass71 = propertyDescriptor68.getPropertyType();
        java.lang.Class<?> wildcardClass72 = propertyDescriptor68.getClass();
        java.lang.reflect.Method method74 = null;
        java.lang.reflect.Method method75 = null;
        java.beans.PropertyDescriptor propertyDescriptor76 = new java.beans.PropertyDescriptor("hi!", method74, method75);
        propertyDescriptor76.setShortDescription("J");
        java.lang.Class<?> wildcardClass79 = propertyDescriptor76.getPropertyType();
        java.lang.Class<?> wildcardClass80 = propertyDescriptor76.getClass();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass80);
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass80);
        org.mockito.asm.Type type83 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass80);
        java.lang.Class[] classArray84 = new java.lang.Class[] { wildcardClass72, wildcardClass80 };
        java.lang.String[] strArray85 = org.mockito.cglib.core.ReflectUtils.getNames(classArray84);
        int int86 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray84);
        java.lang.reflect.Constructor constructor87 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass60, classArray84);
        java.beans.PropertyDescriptor[] propertyDescriptorArray88 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor37 and propertyDescriptor56", propertyDescriptor37.equals(propertyDescriptor56) ? propertyDescriptor37.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 0);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 10);
        java.lang.String str54 = methodInfo53.toString();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        boolean boolean59 = propertyDescriptor58.isHidden();
        java.lang.reflect.Method method60 = propertyDescriptor58.getWriteMethod();
        java.lang.reflect.Method method61 = null;
        propertyDescriptor58.setReadMethod(method61);
        propertyDescriptor58.setDisplayName("java.beans.PropertyDescriptor[name=hi!; shortDescription=J; hidden]");
        propertyDescriptor58.setName("char");
        boolean boolean67 = methodInfo53.equals((java.lang.Object) "char");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor58", propertyDescriptor16.equals(propertyDescriptor58) ? propertyDescriptor16.hashCode() == propertyDescriptor58.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method21 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("(I)J");
        java.lang.reflect.Method method24 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean27 = type12.equals((java.lang.Object) propertyDescriptor16);
        propertyDescriptor16.setHidden(false);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer32.getNamingPolicy();
        enhancer31.setNamingPolicy(namingPolicy35);
        enhancer30.setNamingPolicy(namingPolicy35);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer30.setCallbackFilter(callbackFilter38);
        enhancer30.setUseCache(false);
        java.lang.ClassLoader classLoader42 = enhancer30.getClassLoader();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        propertyDescriptor46.setShortDescription("J");
        java.lang.Class<?> wildcardClass49 = propertyDescriptor46.getPropertyType();
        java.lang.Class<?> wildcardClass50 = propertyDescriptor46.getClass();
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        enhancer30.setSuperclass((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass50);
        java.lang.String str54 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        propertyDescriptor58.setShortDescription("J");
        java.lang.Class<?> wildcardClass61 = propertyDescriptor58.getPropertyType();
        java.lang.Class<?> wildcardClass62 = propertyDescriptor58.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("hi!", method64, method65);
        propertyDescriptor66.setShortDescription("J");
        java.lang.Class<?> wildcardClass69 = propertyDescriptor66.getPropertyType();
        java.lang.Class<?> wildcardClass70 = propertyDescriptor66.getClass();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass62, wildcardClass70 };
        java.lang.String[] strArray75 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        int int76 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        java.lang.reflect.Constructor constructor77 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass50, classArray74);
        java.lang.String str78 = org.mockito.asm.Type.getConstructorDescriptor(constructor77);
        org.mockito.cglib.core.MethodInfo methodInfo80 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor77, (int) (short) 10);
        org.mockito.cglib.core.Signature signature81 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor77);
        java.beans.PropertyEditor propertyEditor82 = propertyDescriptor16.createPropertyEditor((java.lang.Object) constructor77);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        int int6 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        java.lang.String str50 = org.mockito.asm.Type.getConstructorDescriptor(constructor47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 104);
        org.mockito.cglib.core.ClassInfo classInfo54 = methodInfo53.getClassInfo();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; preferred; values={J=0.0}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.String str57 = type56.toString();
        java.lang.String str58 = type56.getClassName();
        org.mockito.asm.Type type59 = type56.getElementType();
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("hi!", method61, method62);
        java.lang.String str64 = propertyDescriptor63.getDisplayName();
        java.lang.String str65 = propertyDescriptor63.getName();
        java.lang.String str66 = propertyDescriptor63.getName();
        boolean boolean67 = type56.equals((java.lang.Object) str66);
        boolean boolean68 = methodInfo53.equals((java.lang.Object) boolean67);
        org.mockito.cglib.core.Signature signature69 = methodInfo53.getSignature();
        java.lang.reflect.Method method71 = null;
        java.lang.reflect.Method method72 = null;
        java.beans.PropertyDescriptor propertyDescriptor73 = new java.beans.PropertyDescriptor("F", method71, method72);
        boolean boolean74 = methodInfo53.equals((java.lang.Object) method72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor73", propertyDescriptor16.equals(propertyDescriptor73) ? propertyDescriptor16.hashCode() == propertyDescriptor73.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("<init>(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method21 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("(I)J");
        java.lang.reflect.Method method24 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean27 = type12.equals((java.lang.Object) propertyDescriptor16);
        propertyDescriptor16.setHidden(false);
        org.mockito.cglib.proxy.Enhancer enhancer30 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        enhancer32.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = enhancer32.getNamingPolicy();
        enhancer31.setNamingPolicy(namingPolicy35);
        enhancer30.setNamingPolicy(namingPolicy35);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter38 = null;
        enhancer30.setCallbackFilter(callbackFilter38);
        enhancer30.setUseCache(false);
        java.lang.ClassLoader classLoader42 = enhancer30.getClassLoader();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        propertyDescriptor46.setShortDescription("J");
        java.lang.Class<?> wildcardClass49 = propertyDescriptor46.getPropertyType();
        java.lang.Class<?> wildcardClass50 = propertyDescriptor46.getClass();
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        enhancer30.setSuperclass((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass50);
        java.lang.String str54 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        propertyDescriptor58.setShortDescription("J");
        java.lang.Class<?> wildcardClass61 = propertyDescriptor58.getPropertyType();
        java.lang.Class<?> wildcardClass62 = propertyDescriptor58.getClass();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("hi!", method64, method65);
        propertyDescriptor66.setShortDescription("J");
        java.lang.Class<?> wildcardClass69 = propertyDescriptor66.getPropertyType();
        java.lang.Class<?> wildcardClass70 = propertyDescriptor66.getClass();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass62, wildcardClass70 };
        java.lang.String[] strArray75 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        int int76 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        java.lang.reflect.Constructor constructor77 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass50, classArray74);
        java.lang.String str78 = org.mockito.asm.Type.getConstructorDescriptor(constructor77);
        org.mockito.cglib.core.MethodInfo methodInfo80 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor77, (int) (short) 10);
        org.mockito.cglib.core.Signature signature81 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor77);
        java.beans.PropertyEditor propertyEditor82 = propertyDescriptor16.createPropertyEditor((java.lang.Object) constructor77);
        org.mockito.cglib.core.MethodInfo methodInfo83 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer10.getNamingPolicy();
        enhancer9.setNamingPolicy(namingPolicy13);
        enhancer8.setNamingPolicy(namingPolicy13);
        enhancer0.setNamingPolicy(namingPolicy13);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        propertyDescriptor20.setExpert(false);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor20.getPropertyEditorClass();
        boolean boolean24 = namingPolicy13.equals((java.lang.Object) propertyDescriptor20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("(I)I", method26, method27);
        boolean boolean29 = propertyDescriptor28.isExpert();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        boolean boolean31 = namingPolicy13.equals((java.lang.Object) method30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor28", propertyDescriptor20.equals(propertyDescriptor28) ? propertyDescriptor20.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        enhancer0.setUseCache(true);
        java.lang.ClassLoader classLoader5 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy6 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy8 = enhancer7.getStrategy();
        boolean boolean9 = enhancer7.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        byte[] byteArray10 = generatorStrategy6.generate((org.mockito.cglib.core.ClassGenerator) enhancer7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; values={J=I}]");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.toString();
        int int11 = type9.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type13, type16, type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type9, type23, type24, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("char", type8, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray33);
        java.lang.String str37 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = type0.getInternalName();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", method1, method2);
        boolean boolean4 = propertyDescriptor3.isHidden();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        enhancer8.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy11 = enhancer8.getNamingPolicy();
        enhancer7.setNamingPolicy(namingPolicy11);
        enhancer6.setNamingPolicy(namingPolicy11);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter14 = null;
        enhancer6.setCallbackFilter(callbackFilter14);
        enhancer6.setUseCache(false);
        java.lang.ClassLoader classLoader18 = enhancer6.getClassLoader();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        java.lang.Class<?> wildcardClass25 = propertyDescriptor22.getPropertyType();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        enhancer6.setSuperclass((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        propertyDescriptor34.setShortDescription("J");
        java.lang.Class<?> wildcardClass37 = propertyDescriptor34.getPropertyType();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor34.getClass();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        propertyDescriptor42.setShortDescription("J");
        java.lang.Class<?> wildcardClass45 = propertyDescriptor42.getPropertyType();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor42.getClass();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray50 = new java.lang.Class[] { wildcardClass38, wildcardClass46 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray50);
        int int52 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray50);
        java.lang.reflect.Constructor constructor53 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass26, classArray50);
        java.lang.String str54 = org.mockito.asm.Type.getConstructorDescriptor(constructor53);
        org.mockito.cglib.core.MethodInfo methodInfo55 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor53);
        org.mockito.cglib.core.MethodInfo methodInfo57 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor53, 57);
        org.mockito.cglib.core.MethodInfo methodInfo58 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor53);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor53);
        propertyDescriptor3.setValue("(I)Ljava/beans/FeatureDescriptor;", (java.lang.Object) constructor53);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(I)LI;", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setShortDescription("J");
        java.lang.Class<?> wildcardClass11 = propertyDescriptor8.getPropertyType();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor8.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=java/beans/PropertyDescriptor; hidden; expert]", (java.lang.Object) wildcardClass12);
        boolean boolean16 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor8", propertyDescriptor3.equals(propertyDescriptor8) ? propertyDescriptor3.hashCode() == propertyDescriptor8.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy1 = enhancer0.getStrategy();
        enhancer0.setSerialVersionUID((java.lang.Long) 1L);
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter5 = null;
        enhancer4.setCallbackFilter(callbackFilter5);
        boolean boolean7 = enhancer4.getAttemptLoad();
        enhancer4.setAttemptLoad(false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.reflect.Method method14 = propertyDescriptor13.getReadMethod();
        java.lang.Class<?> wildcardClass15 = propertyDescriptor13.getPropertyEditorClass();
        propertyDescriptor13.setHidden(false);
        java.lang.reflect.Method method18 = propertyDescriptor13.getReadMethod();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str21 = type20.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.toString();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type22 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray24);
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        enhancer26.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy29 = null;
        enhancer26.setStrategy(generatorStrategy29);
        boolean boolean31 = enhancer26.getUseCache();
        org.mockito.cglib.proxy.Callback callback32 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray33 = new org.mockito.cglib.proxy.Callback[] { callback32 };
        enhancer26.setCallbacks(callbackArray33);
        boolean boolean35 = type20.equals((java.lang.Object) enhancer26);
        propertyDescriptor13.setValue("float", (java.lang.Object) enhancer26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer26.getStrategy();
        enhancer4.setStrategy(generatorStrategy37);
        enhancer0.setStrategy(generatorStrategy37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.asm.Type.getArgumentTypes("(I)Ljava/beans/FeatureDescriptor;");
        boolean boolean42 = generatorStrategy37.equals((java.lang.Object) "(I)Ljava/beans/FeatureDescriptor;");
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.reflect.Method method47 = propertyDescriptor46.getReadMethod();
        java.lang.Class<?> wildcardClass48 = propertyDescriptor46.getPropertyEditorClass();
        propertyDescriptor46.setHidden(false);
        boolean boolean51 = propertyDescriptor46.isHidden();
        java.lang.Class<?> wildcardClass52 = propertyDescriptor46.getPropertyEditorClass();
        propertyDescriptor46.setName("java/beans/PropertyDescriptor");
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        enhancer56.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = enhancer56.getNamingPolicy();
        enhancer56.setUseFactory(false);
        propertyDescriptor46.setValue("V", (java.lang.Object) false);
        propertyDescriptor46.setShortDescription("(I)LI;");
        boolean boolean65 = generatorStrategy37.equals((java.lang.Object) "(I)LI;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor46", propertyDescriptor13.equals(propertyDescriptor46) ? propertyDescriptor13.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter1 = null;
        enhancer0.setCallbackFilter(callbackFilter1);
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer5 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        enhancer7.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = enhancer7.getNamingPolicy();
        enhancer6.setNamingPolicy(namingPolicy10);
        enhancer5.setNamingPolicy(namingPolicy10);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter13 = null;
        enhancer5.setCallbackFilter(callbackFilter13);
        enhancer5.setUseCache(false);
        java.lang.ClassLoader classLoader17 = enhancer5.getClassLoader();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        propertyDescriptor21.setShortDescription("J");
        java.lang.Class<?> wildcardClass24 = propertyDescriptor21.getPropertyType();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor21.getClass();
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        enhancer5.setSuperclass((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        propertyDescriptor33.setShortDescription("J");
        java.lang.Class<?> wildcardClass36 = propertyDescriptor33.getPropertyType();
        java.lang.Class<?> wildcardClass37 = propertyDescriptor33.getClass();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("hi!", method39, method40);
        propertyDescriptor41.setShortDescription("J");
        java.lang.Class<?> wildcardClass44 = propertyDescriptor41.getPropertyType();
        java.lang.Class<?> wildcardClass45 = propertyDescriptor41.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass37, wildcardClass45 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        int int51 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray49);
        java.lang.reflect.Constructor constructor52 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass25, classArray49);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor52);
        org.mockito.cglib.core.MethodInfo methodInfo55 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor52, (int) (short) 100);
        int int56 = methodInfo55.getModifiers();
        org.mockito.asm.Type[] typeArray57 = methodInfo55.getExceptionTypes();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("hi!", method59, method60);
        java.lang.reflect.Method method62 = propertyDescriptor61.getReadMethod();
        java.lang.Class<?> wildcardClass63 = propertyDescriptor61.getPropertyEditorClass();
        propertyDescriptor61.setHidden(false);
        boolean boolean66 = propertyDescriptor61.isHidden();
        propertyDescriptor61.setName("(FIDCCJ)I");
        boolean boolean69 = methodInfo55.equals((java.lang.Object) propertyDescriptor61);
        org.mockito.cglib.proxy.Enhancer enhancer71 = new org.mockito.cglib.proxy.Enhancer();
        enhancer71.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy74 = null;
        enhancer71.setStrategy(generatorStrategy74);
        boolean boolean76 = enhancer71.getUseCache();
        org.mockito.cglib.proxy.Callback callback77 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray78 = new org.mockito.cglib.proxy.Callback[] { callback77 };
        enhancer71.setCallbacks(callbackArray78);
        propertyDescriptor61.setValue("hi!(I)Lava.beans.PropertyDescriptor[name=hi!;", (java.lang.Object) callbackArray78);
        enhancer0.setCallbacks(callbackArray78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor21 and propertyDescriptor61", propertyDescriptor21.equals(propertyDescriptor61) ? propertyDescriptor21.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method21 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("(I)J");
        java.lang.reflect.Method method24 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean27 = type12.equals((java.lang.Object) propertyDescriptor16);
        int int28 = type12.getSort();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.toString();
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str11 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        propertyDescriptor3.setName("(FIDCCJ)I");
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        java.lang.Class<?> wildcardClass25 = propertyDescriptor22.getPropertyType();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.reflect.Method method32 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass33 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor31.setHidden(false);
        boolean boolean36 = propertyDescriptor31.isHidden();
        java.lang.Class<?> wildcardClass37 = propertyDescriptor31.getPropertyEditorClass();
        boolean boolean38 = classInfo27.equals((java.lang.Object) propertyDescriptor31);
        org.mockito.asm.Type type39 = classInfo27.getType();
        org.mockito.asm.Type type40 = classInfo27.getSuperType();
        int int41 = classInfo27.getModifiers();
        org.mockito.asm.Type type42 = classInfo27.getSuperType();
        int int44 = type42.getOpcode(53);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean49 = signature47.equals((java.lang.Object) type48);
        java.lang.String str50 = type48.getClassName();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("hi!", method52, method53);
        propertyDescriptor54.setShortDescription("J");
        java.lang.Class<?> wildcardClass57 = propertyDescriptor54.getPropertyType();
        java.lang.Class<?> wildcardClass58 = propertyDescriptor54.getClass();
        org.mockito.cglib.core.ClassInfo classInfo59 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type[] typeArray60 = classInfo59.getInterfaces();
        org.mockito.asm.Type[] typeArray61 = classInfo59.getInterfaces();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("Z", type42, typeArray61);
        java.beans.PropertyEditor propertyEditor64 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature63);
        java.lang.String str65 = signature63.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setName("(FIDCCJ)I");
        java.lang.Object obj12 = propertyDescriptor3.getValue("Lava.beans.PropertyDescriptor[name=hi!;");
        propertyDescriptor3.setDisplayName("<init>(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)V");
        java.lang.String str15 = propertyDescriptor3.getName();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer19.getNamingPolicy();
        enhancer18.setNamingPolicy(namingPolicy22);
        enhancer17.setNamingPolicy(namingPolicy22);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter25 = null;
        enhancer17.setCallbackFilter(callbackFilter25);
        enhancer17.setUseCache(false);
        java.lang.ClassLoader classLoader29 = enhancer17.getClassLoader();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        propertyDescriptor33.setShortDescription("J");
        java.lang.Class<?> wildcardClass36 = propertyDescriptor33.getPropertyType();
        java.lang.Class<?> wildcardClass37 = propertyDescriptor33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo38 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        enhancer17.setSuperclass((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        propertyDescriptor45.setShortDescription("J");
        java.lang.Class<?> wildcardClass48 = propertyDescriptor45.getPropertyType();
        java.lang.Class<?> wildcardClass49 = propertyDescriptor45.getClass();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        propertyDescriptor53.setShortDescription("J");
        java.lang.Class<?> wildcardClass56 = propertyDescriptor53.getPropertyType();
        java.lang.Class<?> wildcardClass57 = propertyDescriptor53.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass49, wildcardClass57 };
        java.lang.String[] strArray62 = org.mockito.cglib.core.ReflectUtils.getNames(classArray61);
        int int63 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray61);
        java.lang.reflect.Constructor constructor64 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass37, classArray61);
        org.mockito.cglib.core.MethodInfo methodInfo65 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor64);
        org.mockito.cglib.core.MethodInfo methodInfo67 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor64, (int) (short) 100);
        int int68 = methodInfo67.getModifiers();
        org.mockito.asm.Type[] typeArray69 = methodInfo67.getExceptionTypes();
        java.lang.String str70 = methodInfo67.toString();
        java.lang.String str71 = methodInfo67.toString();
        java.lang.String str72 = methodInfo67.toString();
        propertyDescriptor3.setValue("org.mockito.cglib.core.DefaultNamingPolicy", (java.lang.Object) methodInfo67);
        org.mockito.asm.Type[] typeArray74 = methodInfo67.getExceptionTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor33", propertyDescriptor3.equals(propertyDescriptor33) ? propertyDescriptor3.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setShortDescription("J");
        java.lang.Class<?> wildcardClass11 = propertyDescriptor8.getPropertyType();
        boolean boolean12 = propertyDescriptor8.isPreferred();
        propertyDescriptor8.setHidden(true);
        java.lang.reflect.Method method15 = null;
        propertyDescriptor8.setReadMethod(method15);
        java.lang.reflect.Method method17 = null;
        propertyDescriptor8.setWriteMethod(method17);
        propertyDescriptor8.setHidden(true);
        java.util.Enumeration<java.lang.String> strEnumeration21 = propertyDescriptor8.attributeNames();
        propertyDescriptor3.setValue("<init>(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)V", (java.lang.Object) propertyDescriptor8);
        java.lang.String str23 = propertyDescriptor8.getShortDescription();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer26 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        enhancer27.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = enhancer27.getNamingPolicy();
        enhancer26.setNamingPolicy(namingPolicy30);
        enhancer25.setNamingPolicy(namingPolicy30);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter33 = null;
        enhancer25.setCallbackFilter(callbackFilter33);
        enhancer25.setUseCache(false);
        java.lang.ClassLoader classLoader37 = enhancer25.getClassLoader();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("hi!", method39, method40);
        propertyDescriptor41.setShortDescription("J");
        java.lang.Class<?> wildcardClass44 = propertyDescriptor41.getPropertyType();
        java.lang.Class<?> wildcardClass45 = propertyDescriptor41.getClass();
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        enhancer25.setSuperclass((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        propertyDescriptor53.setShortDescription("J");
        java.lang.Class<?> wildcardClass56 = propertyDescriptor53.getPropertyType();
        java.lang.Class<?> wildcardClass57 = propertyDescriptor53.getClass();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("hi!", method59, method60);
        propertyDescriptor61.setShortDescription("J");
        java.lang.Class<?> wildcardClass64 = propertyDescriptor61.getPropertyType();
        java.lang.Class<?> wildcardClass65 = propertyDescriptor61.getClass();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        java.lang.Class[] classArray69 = new java.lang.Class[] { wildcardClass57, wildcardClass65 };
        java.lang.String[] strArray70 = org.mockito.cglib.core.ReflectUtils.getNames(classArray69);
        int int71 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray69);
        java.lang.reflect.Constructor constructor72 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass45, classArray69);
        org.mockito.cglib.core.MethodInfo methodInfo73 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor72);
        org.mockito.cglib.core.Signature signature74 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor72);
        org.mockito.cglib.core.MethodInfo methodInfo76 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor72, 0);
        org.mockito.cglib.core.MethodInfo methodInfo78 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor72, 1);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str80 = type79.toString();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str82 = type81.toString();
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] { type81 };
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type79, typeArray83);
        org.mockito.cglib.proxy.Enhancer enhancer85 = new org.mockito.cglib.proxy.Enhancer();
        enhancer85.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy88 = null;
        enhancer85.setStrategy(generatorStrategy88);
        boolean boolean90 = enhancer85.getUseCache();
        org.mockito.cglib.proxy.Callback callback91 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray92 = new org.mockito.cglib.proxy.Callback[] { callback91 };
        enhancer85.setCallbacks(callbackArray92);
        boolean boolean94 = type79.equals((java.lang.Object) enhancer85);
        boolean boolean95 = methodInfo78.equals((java.lang.Object) enhancer85);
        int int96 = methodInfo78.getModifiers();
        org.mockito.cglib.core.ClassInfo classInfo97 = methodInfo78.getClassInfo();
        propertyDescriptor8.setValue("()J", (java.lang.Object) classInfo97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor41", propertyDescriptor3.equals(propertyDescriptor41) ? propertyDescriptor3.hashCode() == propertyDescriptor41.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        java.lang.String str48 = org.mockito.asm.Type.getConstructorDescriptor(constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 10);
        org.mockito.cglib.core.Signature signature51 = methodInfo50.getSignature();
        java.lang.String str52 = signature51.getDescriptor();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!]", method54, method55);
        boolean boolean57 = propertyDescriptor56.isPreferred();
        java.lang.String str58 = propertyDescriptor56.getName();
        propertyDescriptor56.setShortDescription("java.beans.PropertyDescriptor[name=(I)I; propertyEditorClass=class org.mockito.cglib.core.DefaultNamingPolicy]");
        boolean boolean61 = signature51.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=(I)I; propertyEditorClass=class org.mockito.cglib.core.DefaultNamingPolicy]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor56", propertyDescriptor16.equals(propertyDescriptor56) ? propertyDescriptor16.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.toString();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!]", method6, method7);
        boolean boolean9 = propertyDescriptor8.isPreferred();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.reflect.Method method14 = propertyDescriptor13.getReadMethod();
        propertyDescriptor13.setExpert(false);
        java.util.Enumeration<java.lang.String> strEnumeration17 = propertyDescriptor13.attributeNames();
        java.lang.reflect.Method method18 = propertyDescriptor13.getWriteMethod();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor8.createPropertyEditor((java.lang.Object) method18);
        boolean boolean20 = type1.equals((java.lang.Object) method18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor13", propertyDescriptor8.equals(propertyDescriptor13) ? propertyDescriptor8.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method21 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("(I)J");
        java.lang.reflect.Method method24 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean27 = type12.equals((java.lang.Object) propertyDescriptor16);
        int int28 = type12.getSize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 100);
        org.mockito.cglib.core.MethodInfo methodInfo52 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 1);
        org.mockito.cglib.core.ClassInfo classInfo53 = methodInfo52.getClassInfo();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.reflect.Method method58 = propertyDescriptor57.getReadMethod();
        java.lang.Class<?> wildcardClass59 = propertyDescriptor57.getPropertyEditorClass();
        propertyDescriptor57.setHidden(false);
        java.lang.reflect.Method method62 = propertyDescriptor57.getReadMethod();
        propertyDescriptor57.setName("(I)J");
        java.lang.reflect.Method method65 = null;
        propertyDescriptor57.setWriteMethod(method65);
        boolean boolean67 = methodInfo52.equals((java.lang.Object) method65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor57", propertyDescriptor16.equals(propertyDescriptor57) ? propertyDescriptor16.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        org.mockito.cglib.proxy.Enhancer enhancer6 = new org.mockito.cglib.proxy.Enhancer();
        enhancer6.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = null;
        enhancer6.setStrategy(generatorStrategy9);
        boolean boolean11 = enhancer6.getUseCache();
        org.mockito.cglib.proxy.Callback callback12 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray13 = new org.mockito.cglib.proxy.Callback[] { callback12 };
        enhancer6.setCallbacks(callbackArray13);
        boolean boolean15 = type0.equals((java.lang.Object) enhancer6);
        enhancer6.setUseFactory(false);
        enhancer6.setInterceptDuringConstruction(false);
        org.mockito.cglib.proxy.Enhancer enhancer20 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer22 = new org.mockito.cglib.proxy.Enhancer();
        enhancer22.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = enhancer22.getNamingPolicy();
        enhancer21.setNamingPolicy(namingPolicy25);
        enhancer20.setNamingPolicy(namingPolicy25);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter28 = null;
        enhancer20.setCallbackFilter(callbackFilter28);
        enhancer20.setUseCache(false);
        java.lang.ClassLoader classLoader32 = enhancer20.getClassLoader();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        enhancer20.setSuperclass((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass40);
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        propertyDescriptor48.setShortDescription("J");
        java.lang.Class<?> wildcardClass51 = propertyDescriptor48.getPropertyType();
        java.lang.Class<?> wildcardClass52 = propertyDescriptor48.getClass();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        propertyDescriptor56.setShortDescription("J");
        java.lang.Class<?> wildcardClass59 = propertyDescriptor56.getPropertyType();
        java.lang.Class<?> wildcardClass60 = propertyDescriptor56.getClass();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass60);
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass52, wildcardClass60 };
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray64);
        int int66 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray64);
        java.lang.reflect.Constructor constructor67 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass40, classArray64);
        org.mockito.cglib.core.MethodInfo methodInfo68 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor67);
        org.mockito.cglib.core.MethodInfo methodInfo70 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor67, (int) (short) 100);
        int int71 = methodInfo70.getModifiers();
        org.mockito.asm.Type[] typeArray72 = methodInfo70.getExceptionTypes();
        java.lang.reflect.Method method74 = null;
        java.lang.reflect.Method method75 = null;
        java.beans.PropertyDescriptor propertyDescriptor76 = new java.beans.PropertyDescriptor("hi!", method74, method75);
        java.lang.reflect.Method method77 = propertyDescriptor76.getReadMethod();
        java.lang.Class<?> wildcardClass78 = propertyDescriptor76.getPropertyEditorClass();
        propertyDescriptor76.setHidden(false);
        boolean boolean81 = propertyDescriptor76.isHidden();
        propertyDescriptor76.setName("(FIDCCJ)I");
        boolean boolean84 = methodInfo70.equals((java.lang.Object) propertyDescriptor76);
        org.mockito.cglib.proxy.Enhancer enhancer86 = new org.mockito.cglib.proxy.Enhancer();
        enhancer86.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy89 = null;
        enhancer86.setStrategy(generatorStrategy89);
        boolean boolean91 = enhancer86.getUseCache();
        org.mockito.cglib.proxy.Callback callback92 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray93 = new org.mockito.cglib.proxy.Callback[] { callback92 };
        enhancer86.setCallbacks(callbackArray93);
        propertyDescriptor76.setValue("hi!(I)Lava.beans.PropertyDescriptor[name=hi!;", (java.lang.Object) callbackArray93);
        enhancer6.setCallbacks(callbackArray93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor36 and propertyDescriptor76", propertyDescriptor36.equals(propertyDescriptor76) ? propertyDescriptor36.hashCode() == propertyDescriptor76.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer3 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer4 = new org.mockito.cglib.proxy.Enhancer();
        enhancer4.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy7 = enhancer4.getNamingPolicy();
        enhancer3.setNamingPolicy(namingPolicy7);
        enhancer2.setNamingPolicy(namingPolicy7);
        boolean boolean10 = type0.equals((java.lang.Object) namingPolicy7);
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        enhancer12.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy15 = enhancer12.getNamingPolicy();
        enhancer11.setNamingPolicy(namingPolicy15);
        java.lang.ClassLoader classLoader17 = enhancer11.getClassLoader();
        boolean boolean18 = type0.equals((java.lang.Object) enhancer11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type0.getInternalName();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setName("(FIDCCJ)I");
        java.lang.Object obj12 = propertyDescriptor3.getValue("Lava.beans.PropertyDescriptor[name=hi!;");
        propertyDescriptor3.setDisplayName("<init>(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)V");
        java.lang.String str15 = propertyDescriptor3.getName();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer19.getNamingPolicy();
        enhancer18.setNamingPolicy(namingPolicy22);
        enhancer17.setNamingPolicy(namingPolicy22);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter25 = null;
        enhancer17.setCallbackFilter(callbackFilter25);
        enhancer17.setUseCache(false);
        java.lang.ClassLoader classLoader29 = enhancer17.getClassLoader();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        propertyDescriptor33.setShortDescription("J");
        java.lang.Class<?> wildcardClass36 = propertyDescriptor33.getPropertyType();
        java.lang.Class<?> wildcardClass37 = propertyDescriptor33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo38 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        enhancer17.setSuperclass((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        propertyDescriptor45.setShortDescription("J");
        java.lang.Class<?> wildcardClass48 = propertyDescriptor45.getPropertyType();
        java.lang.Class<?> wildcardClass49 = propertyDescriptor45.getClass();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        propertyDescriptor53.setShortDescription("J");
        java.lang.Class<?> wildcardClass56 = propertyDescriptor53.getPropertyType();
        java.lang.Class<?> wildcardClass57 = propertyDescriptor53.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass49, wildcardClass57 };
        java.lang.String[] strArray62 = org.mockito.cglib.core.ReflectUtils.getNames(classArray61);
        int int63 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray61);
        java.lang.reflect.Constructor constructor64 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass37, classArray61);
        org.mockito.cglib.core.MethodInfo methodInfo65 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor64);
        org.mockito.cglib.core.MethodInfo methodInfo67 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor64, (int) (short) 100);
        int int68 = methodInfo67.getModifiers();
        org.mockito.asm.Type[] typeArray69 = methodInfo67.getExceptionTypes();
        java.lang.String str70 = methodInfo67.toString();
        java.lang.String str71 = methodInfo67.toString();
        java.lang.String str72 = methodInfo67.toString();
        propertyDescriptor3.setValue("org.mockito.cglib.core.DefaultNamingPolicy", (java.lang.Object) methodInfo67);
        int int74 = methodInfo67.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor33", propertyDescriptor3.equals(propertyDescriptor33) ? propertyDescriptor3.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; values={J=I}]");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.toString();
        int int11 = type9.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type13, type16, type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type9, type23, type24, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("char", type8, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray33);
        java.lang.String str37 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = type0.getDimensions();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray9 = classInfo8.getInterfaces();
        org.mockito.asm.Type type10 = classInfo8.getType();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer13.getNamingPolicy();
        enhancer12.setNamingPolicy(namingPolicy16);
        enhancer11.setNamingPolicy(namingPolicy16);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter19 = null;
        enhancer11.setCallbackFilter(callbackFilter19);
        enhancer11.setUseCache(false);
        java.lang.ClassLoader classLoader23 = enhancer11.getClassLoader();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        propertyDescriptor27.setShortDescription("J");
        java.lang.Class<?> wildcardClass30 = propertyDescriptor27.getPropertyType();
        java.lang.Class<?> wildcardClass31 = propertyDescriptor27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        enhancer11.setSuperclass((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        propertyDescriptor39.setShortDescription("J");
        java.lang.Class<?> wildcardClass42 = propertyDescriptor39.getPropertyType();
        java.lang.Class<?> wildcardClass43 = propertyDescriptor39.getClass();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        propertyDescriptor47.setShortDescription("J");
        java.lang.Class<?> wildcardClass50 = propertyDescriptor47.getPropertyType();
        java.lang.Class<?> wildcardClass51 = propertyDescriptor47.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray55 = new java.lang.Class[] { wildcardClass43, wildcardClass51 };
        java.lang.String[] strArray56 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        int int57 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        java.lang.reflect.Constructor constructor58 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass31, classArray55);
        org.mockito.cglib.core.MethodInfo methodInfo59 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58);
        org.mockito.cglib.core.MethodInfo methodInfo61 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58, (int) (short) 100);
        org.mockito.cglib.core.MethodInfo methodInfo62 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58);
        boolean boolean63 = type10.equals((java.lang.Object) methodInfo62);
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        java.beans.PropertyDescriptor propertyDescriptor67 = new java.beans.PropertyDescriptor("hi!", method65, method66);
        java.lang.reflect.Method method68 = propertyDescriptor67.getReadMethod();
        java.lang.Class<?> wildcardClass69 = propertyDescriptor67.getPropertyEditorClass();
        propertyDescriptor67.setHidden(false);
        java.lang.reflect.Method method72 = propertyDescriptor67.getReadMethod();
        propertyDescriptor67.setName("(I)J");
        java.util.Enumeration<java.lang.String> strEnumeration75 = propertyDescriptor67.attributeNames();
        java.lang.Class<?> wildcardClass76 = propertyDescriptor67.getPropertyType();
        boolean boolean77 = methodInfo62.equals((java.lang.Object) propertyDescriptor67);
        java.lang.Object obj78 = null;
        boolean boolean79 = methodInfo62.equals(obj78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor67", propertyDescriptor3.equals(propertyDescriptor67) ? propertyDescriptor3.hashCode() == propertyDescriptor67.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        java.lang.String str12 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type1.getElementType();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) type4);
        java.lang.String str6 = type3.getClassName();
        java.lang.String str7 = type3.getDescriptor();
        boolean boolean8 = type0.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setName("(FIDCCJ)I");
        java.lang.Object obj12 = propertyDescriptor3.getValue("Lava.beans.PropertyDescriptor[name=hi!;");
        propertyDescriptor3.setDisplayName("<init>(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)V");
        java.lang.String str15 = propertyDescriptor3.getName();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer19 = new org.mockito.cglib.proxy.Enhancer();
        enhancer19.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy22 = enhancer19.getNamingPolicy();
        enhancer18.setNamingPolicy(namingPolicy22);
        enhancer17.setNamingPolicy(namingPolicy22);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter25 = null;
        enhancer17.setCallbackFilter(callbackFilter25);
        enhancer17.setUseCache(false);
        java.lang.ClassLoader classLoader29 = enhancer17.getClassLoader();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        propertyDescriptor33.setShortDescription("J");
        java.lang.Class<?> wildcardClass36 = propertyDescriptor33.getPropertyType();
        java.lang.Class<?> wildcardClass37 = propertyDescriptor33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo38 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        enhancer17.setSuperclass((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        propertyDescriptor45.setShortDescription("J");
        java.lang.Class<?> wildcardClass48 = propertyDescriptor45.getPropertyType();
        java.lang.Class<?> wildcardClass49 = propertyDescriptor45.getClass();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        propertyDescriptor53.setShortDescription("J");
        java.lang.Class<?> wildcardClass56 = propertyDescriptor53.getPropertyType();
        java.lang.Class<?> wildcardClass57 = propertyDescriptor53.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.lang.Class[] classArray61 = new java.lang.Class[] { wildcardClass49, wildcardClass57 };
        java.lang.String[] strArray62 = org.mockito.cglib.core.ReflectUtils.getNames(classArray61);
        int int63 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray61);
        java.lang.reflect.Constructor constructor64 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass37, classArray61);
        org.mockito.cglib.core.MethodInfo methodInfo65 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor64);
        org.mockito.cglib.core.MethodInfo methodInfo67 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor64, (int) (short) 100);
        int int68 = methodInfo67.getModifiers();
        org.mockito.asm.Type[] typeArray69 = methodInfo67.getExceptionTypes();
        java.lang.String str70 = methodInfo67.toString();
        java.lang.String str71 = methodInfo67.toString();
        java.lang.String str72 = methodInfo67.toString();
        propertyDescriptor3.setValue("org.mockito.cglib.core.DefaultNamingPolicy", (java.lang.Object) methodInfo67);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!]", "Ljava/beans/PropertyDescriptor;");
        org.mockito.asm.Type type77 = signature76.getReturnType();
        java.lang.String str78 = signature76.getDescriptor();
        boolean boolean79 = methodInfo67.equals((java.lang.Object) signature76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor33", propertyDescriptor3.equals(propertyDescriptor33) ? propertyDescriptor3.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type1.getDimensions();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        java.lang.String str12 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type1.getInternalName();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        propertyDescriptor4.setShortDescription("J");
        java.lang.Class<?> wildcardClass7 = propertyDescriptor4.getPropertyType();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor4.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type13 = classInfo12.getSuperType();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.reflect.Method method18 = propertyDescriptor17.getReadMethod();
        java.lang.Class<?> wildcardClass19 = propertyDescriptor17.getPropertyEditorClass();
        propertyDescriptor17.setHidden(false);
        java.lang.reflect.Method method22 = propertyDescriptor17.getReadMethod();
        propertyDescriptor17.setName("(I)J");
        java.lang.reflect.Method method25 = propertyDescriptor17.getReadMethod();
        propertyDescriptor17.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean28 = type13.equals((java.lang.Object) propertyDescriptor17);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str32 = type31.toString();
        boolean boolean34 = type31.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str36 = type35.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str38 = type37.toString();
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type37 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray39);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type31, typeArray39);
        org.mockito.asm.Type type42 = signature41.getReturnType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str44 = type43.toString();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str46 = type45.toString();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("float", type42, typeArray47);
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        enhancer50.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy53 = null;
        enhancer50.setStrategy(generatorStrategy53);
        java.lang.Class[] classArray55 = new java.lang.Class[] {};
        java.lang.String[] strArray56 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        java.lang.String[] strArray57 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        enhancer50.setInterfaces(classArray55);
        enhancer50.setUseCache(true);
        boolean boolean61 = signature49.equals((java.lang.Object) true);
        java.lang.String str62 = signature49.toString();
        java.lang.String str63 = signature49.getName();
        org.mockito.asm.Type type64 = signature49.getReturnType();
        org.mockito.asm.Type[] typeArray65 = signature49.getArgumentTypes();
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]; propertyEditorClass=class java.beans.PropertyDescriptor]", type13, typeArray65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor17", propertyDescriptor4.equals(propertyDescriptor17) ? propertyDescriptor4.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        enhancer9.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy12 = enhancer9.getNamingPolicy();
        enhancer8.setNamingPolicy(namingPolicy12);
        enhancer7.setNamingPolicy(namingPolicy12);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter15 = null;
        enhancer7.setCallbackFilter(callbackFilter15);
        enhancer7.setUseCache(false);
        java.lang.ClassLoader classLoader19 = enhancer7.getClassLoader();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        propertyDescriptor23.setShortDescription("J");
        java.lang.Class<?> wildcardClass26 = propertyDescriptor23.getPropertyType();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor23.getClass();
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        enhancer7.setSuperclass((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        propertyDescriptor35.setShortDescription("J");
        java.lang.Class<?> wildcardClass38 = propertyDescriptor35.getPropertyType();
        java.lang.Class<?> wildcardClass39 = propertyDescriptor35.getClass();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        propertyDescriptor43.setShortDescription("J");
        java.lang.Class<?> wildcardClass46 = propertyDescriptor43.getPropertyType();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor43.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass39, wildcardClass47 };
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray51);
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray51);
        java.lang.reflect.Constructor constructor54 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass27, classArray51);
        org.mockito.cglib.core.MethodInfo methodInfo55 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor54);
        org.mockito.cglib.core.MethodInfo methodInfo57 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor54, (int) (short) 100);
        org.mockito.cglib.core.MethodInfo methodInfo59 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor54, (int) (short) 1);
        org.mockito.asm.Type[] typeArray60 = methodInfo59.getExceptionTypes();
        org.mockito.cglib.core.ClassInfo classInfo61 = methodInfo59.getClassInfo();
        propertyDescriptor3.setValue("hi!", (java.lang.Object) methodInfo59);
        org.mockito.cglib.core.ClassInfo classInfo63 = methodInfo59.getClassInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setName("(FIDCCJ)I");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setWriteMethod(method13);
        propertyDescriptor3.setPreferred(false);
        boolean boolean17 = propertyDescriptor3.isHidden();
        java.lang.String str18 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        propertyDescriptor23.setShortDescription("J");
        java.lang.Class<?> wildcardClass26 = propertyDescriptor23.getPropertyType();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor23.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type32 = classInfo31.getSuperType();
        org.mockito.asm.Type[] typeArray33 = classInfo31.getInterfaces();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(I)LI;; shortDescription=(I)LI;]", (java.lang.Object) classInfo31);
        int int35 = classInfo31.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!]", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        java.lang.String str12 = propertyDescriptor11.getName();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, true);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor11.createPropertyEditor((java.lang.Object) methodArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray26);
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor11", propertyDescriptor3.equals(propertyDescriptor11) ? propertyDescriptor3.hashCode() == propertyDescriptor11.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        java.lang.String str50 = org.mockito.asm.Type.getConstructorDescriptor(constructor47);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 3);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str56 = type55.toString();
        boolean boolean58 = type55.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str60 = type59.toString();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str62 = type61.toString();
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type61 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type55, typeArray63);
        java.lang.String str66 = signature65.toString();
        org.mockito.asm.Type[] typeArray67 = signature65.getArgumentTypes();
        org.mockito.asm.Type type68 = signature65.getReturnType();
        java.lang.String str69 = signature65.getName();
        boolean boolean70 = methodInfo53.equals((java.lang.Object) str69);
        org.mockito.cglib.core.ClassInfo classInfo71 = methodInfo53.getClassInfo();
        java.lang.reflect.Method method73 = null;
        java.lang.reflect.Method method74 = null;
        java.beans.PropertyDescriptor propertyDescriptor75 = new java.beans.PropertyDescriptor("J", method73, method74);
        java.lang.String str76 = propertyDescriptor75.getName();
        boolean boolean77 = methodInfo53.equals((java.lang.Object) str76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor75", propertyDescriptor16.equals(propertyDescriptor75) ? propertyDescriptor16.hashCode() == propertyDescriptor75.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        int int4 = type0.getSize();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.getDescriptor();
        java.lang.String str5 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        java.lang.String str3 = type1.getClassName();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str11 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        propertyDescriptor3.setName("(FIDCCJ)I");
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        java.lang.Class<?> wildcardClass25 = propertyDescriptor22.getPropertyType();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.reflect.Method method32 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass33 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor31.setHidden(false);
        boolean boolean36 = propertyDescriptor31.isHidden();
        java.lang.Class<?> wildcardClass37 = propertyDescriptor31.getPropertyEditorClass();
        boolean boolean38 = classInfo27.equals((java.lang.Object) propertyDescriptor31);
        org.mockito.asm.Type type39 = classInfo27.getType();
        org.mockito.asm.Type type40 = classInfo27.getSuperType();
        int int41 = classInfo27.getModifiers();
        org.mockito.asm.Type type42 = classInfo27.getSuperType();
        int int44 = type42.getOpcode(53);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean49 = signature47.equals((java.lang.Object) type48);
        java.lang.String str50 = type48.getClassName();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("hi!", method52, method53);
        propertyDescriptor54.setShortDescription("J");
        java.lang.Class<?> wildcardClass57 = propertyDescriptor54.getPropertyType();
        java.lang.Class<?> wildcardClass58 = propertyDescriptor54.getClass();
        org.mockito.cglib.core.ClassInfo classInfo59 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type[] typeArray60 = classInfo59.getInterfaces();
        org.mockito.asm.Type[] typeArray61 = classInfo59.getInterfaces();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray61);
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("Z", type42, typeArray61);
        java.beans.PropertyEditor propertyEditor64 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature63);
        java.lang.Class<?> wildcardClass65 = propertyDescriptor3.getClass();
        boolean boolean66 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        propertyDescriptor3.setHidden(false);
        java.lang.String str14 = propertyDescriptor3.getName();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        enhancer17.setNamingPolicy(namingPolicy21);
        enhancer16.setNamingPolicy(namingPolicy21);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter24 = null;
        enhancer16.setCallbackFilter(callbackFilter24);
        enhancer16.setUseCache(false);
        java.lang.ClassLoader classLoader28 = enhancer16.getClassLoader();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        propertyDescriptor32.setShortDescription("J");
        java.lang.Class<?> wildcardClass35 = propertyDescriptor32.getPropertyType();
        java.lang.Class<?> wildcardClass36 = propertyDescriptor32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        enhancer16.setSuperclass((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("hi!", method42, method43);
        propertyDescriptor44.setShortDescription("J");
        java.lang.Class<?> wildcardClass47 = propertyDescriptor44.getPropertyType();
        java.lang.Class<?> wildcardClass48 = propertyDescriptor44.getClass();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("hi!", method50, method51);
        propertyDescriptor52.setShortDescription("J");
        java.lang.Class<?> wildcardClass55 = propertyDescriptor52.getPropertyType();
        java.lang.Class<?> wildcardClass56 = propertyDescriptor52.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.lang.Class[] classArray60 = new java.lang.Class[] { wildcardClass48, wildcardClass56 };
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray60);
        int int62 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray60);
        java.lang.reflect.Constructor constructor63 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass36, classArray60);
        org.mockito.cglib.core.MethodInfo methodInfo64 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor63);
        java.lang.String str65 = methodInfo64.toString();
        org.mockito.cglib.core.ClassInfo classInfo66 = methodInfo64.getClassInfo();
        propertyDescriptor3.setValue("", (java.lang.Object) methodInfo64);
        java.lang.reflect.Method method69 = null;
        java.lang.reflect.Method method70 = null;
        java.beans.PropertyDescriptor propertyDescriptor71 = new java.beans.PropertyDescriptor("hi!", method69, method70);
        java.lang.reflect.Method method72 = propertyDescriptor71.getReadMethod();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor71.getPropertyEditorClass();
        propertyDescriptor71.setHidden(false);
        boolean boolean76 = propertyDescriptor71.isHidden();
        java.lang.Class<?> wildcardClass77 = propertyDescriptor71.getPropertyEditorClass();
        propertyDescriptor71.setName("java/beans/PropertyDescriptor");
        propertyDescriptor71.setName("(I)LI;");
        propertyDescriptor71.setShortDescription("(I)LI;");
        java.lang.reflect.Method method84 = propertyDescriptor71.getReadMethod();
        java.lang.String str85 = propertyDescriptor71.getShortDescription();
        java.lang.Object obj86 = null;
        java.beans.PropertyEditor propertyEditor87 = propertyDescriptor71.createPropertyEditor(obj86);
        java.beans.PropertyEditor propertyEditor88 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyEditor87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor32 and propertyDescriptor71", propertyDescriptor32.equals(propertyDescriptor71) ? propertyDescriptor32.hashCode() == propertyDescriptor71.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        java.lang.reflect.Method method21 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("(I)J");
        java.lang.reflect.Method method24 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        boolean boolean27 = type12.equals((java.lang.Object) propertyDescriptor16);
        org.mockito.asm.Type[] typeArray29 = org.mockito.asm.Type.getArgumentTypes("(FIDCCJ)I");
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type1.getElementType();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean14 = signature12.equals((java.lang.Object) type13);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        boolean boolean18 = signature12.equals((java.lang.Object) classArray15);
        enhancer0.setInterfaces(classArray15);
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer0.setCallback(callback20);
        org.mockito.cglib.proxy.Callback callback22 = null;
        enhancer0.setCallback(callback22);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy24 = enhancer0.getStrategy();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.reflect.Method method38 = propertyDescriptor37.getReadMethod();
        java.lang.Class<?> wildcardClass39 = propertyDescriptor37.getPropertyEditorClass();
        propertyDescriptor37.setHidden(false);
        boolean boolean42 = propertyDescriptor37.isHidden();
        java.lang.Class<?> wildcardClass43 = propertyDescriptor37.getPropertyEditorClass();
        boolean boolean44 = classInfo33.equals((java.lang.Object) propertyDescriptor37);
        int int45 = classInfo33.getModifiers();
        org.mockito.asm.Type type46 = classInfo33.getType();
        org.mockito.asm.Type type47 = classInfo33.getType();
        boolean boolean48 = generatorStrategy24.equals((java.lang.Object) type47);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer50 = new org.mockito.cglib.proxy.Enhancer();
        enhancer50.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer50.getNamingPolicy();
        enhancer49.setNamingPolicy(namingPolicy53);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        enhancer56.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = enhancer56.getNamingPolicy();
        enhancer55.setNamingPolicy(namingPolicy59);
        org.mockito.cglib.proxy.Callback callback61 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray62 = new org.mockito.cglib.proxy.Callback[] { callback61 };
        enhancer55.setCallbacks(callbackArray62);
        enhancer49.setCallbacks(callbackArray62);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = enhancer49.getNamingPolicy();
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("(I)I", method67, method68);
        boolean boolean70 = namingPolicy65.equals((java.lang.Object) propertyDescriptor69);
        propertyDescriptor69.setConstrained(false);
        java.lang.Class<?> wildcardClass73 = propertyDescriptor69.getPropertyEditorClass();
        java.lang.reflect.Method method76 = null;
        java.lang.reflect.Method method77 = null;
        java.beans.PropertyDescriptor propertyDescriptor78 = new java.beans.PropertyDescriptor("hi!", method76, method77);
        java.lang.String str79 = propertyDescriptor78.getName();
        boolean boolean80 = propertyDescriptor78.isHidden();
        java.lang.String str81 = propertyDescriptor78.getName();
        propertyDescriptor78.setConstrained(true);
        org.mockito.cglib.proxy.Enhancer enhancer85 = new org.mockito.cglib.proxy.Enhancer();
        enhancer85.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy88 = enhancer85.getNamingPolicy();
        enhancer85.setUseFactory(false);
        enhancer85.setInterceptDuringConstruction(true);
        propertyDescriptor78.setValue("(FIDCCJ)I", (java.lang.Object) enhancer85);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy94 = enhancer85.getStrategy();
        propertyDescriptor69.setValue("(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)Lorg/mockito/cglib/core/DefaultNamingPolicy;", (java.lang.Object) enhancer85);
        boolean boolean96 = type47.equals((java.lang.Object) propertyDescriptor69);
        int int97 = type47.getSize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor28 and propertyDescriptor69", propertyDescriptor28.equals(propertyDescriptor69) ? propertyDescriptor28.hashCode() == propertyDescriptor69.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        java.lang.String str50 = org.mockito.asm.Type.getConstructorDescriptor(constructor47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 104);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor47);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo57 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) '#');
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("(I)Ljava/beans/PropertyDescriptor;", method59, method60);
        boolean boolean62 = methodInfo57.equals((java.lang.Object) propertyDescriptor61);
        org.mockito.asm.Type[] typeArray63 = methodInfo57.getExceptionTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor61", propertyDescriptor16.equals(propertyDescriptor61) ? propertyDescriptor16.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy13 = enhancer0.getStrategy();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.toString();
        int int20 = type18.getSize();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str24 = type23.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type17, type18, type21, type22, type23, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray26);
        boolean boolean28 = generatorStrategy13.equals((java.lang.Object) typeArray26);
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        propertyDescriptor32.setShortDescription("J");
        java.lang.Class<?> wildcardClass35 = propertyDescriptor32.getPropertyType();
        java.lang.Class<?> wildcardClass36 = propertyDescriptor32.getClass();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass36);
        boolean boolean39 = generatorStrategy13.equals((java.lang.Object) wildcardClass36);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        propertyDescriptor43.setShortDescription("J");
        java.lang.Class<?> wildcardClass46 = propertyDescriptor43.getPropertyType();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor43.getClass();
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("hi!", method50, method51);
        java.lang.reflect.Method method53 = propertyDescriptor52.getReadMethod();
        java.lang.Class<?> wildcardClass54 = propertyDescriptor52.getPropertyEditorClass();
        propertyDescriptor52.setHidden(false);
        boolean boolean57 = propertyDescriptor52.isHidden();
        java.lang.Class<?> wildcardClass58 = propertyDescriptor52.getPropertyEditorClass();
        boolean boolean59 = classInfo48.equals((java.lang.Object) propertyDescriptor52);
        int int60 = classInfo48.getModifiers();
        java.lang.String str61 = classInfo48.toString();
        org.mockito.asm.Type type62 = classInfo48.getType();
        org.mockito.asm.Type[] typeArray63 = classInfo48.getInterfaces();
        boolean boolean64 = generatorStrategy13.equals((java.lang.Object) classInfo48);
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; shortDescription=J]", method66, method67);
        boolean boolean69 = propertyDescriptor68.isHidden();
        boolean boolean70 = generatorStrategy13.equals((java.lang.Object) boolean69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor32 and propertyDescriptor68", propertyDescriptor32.equals(propertyDescriptor68) ? propertyDescriptor32.hashCode() == propertyDescriptor68.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=hi!; shortDescription=java.beans.PropertyDescriptor[name=hi!; displayName=(I)J]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("java/beans/PropertyDescriptor");
        propertyDescriptor3.setName("(I)LI;");
        java.lang.Class<?> wildcardClass14 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.reflect.Method method19 = propertyDescriptor18.getReadMethod();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor18.getPropertyEditorClass();
        propertyDescriptor18.setHidden(false);
        boolean boolean23 = propertyDescriptor18.isHidden();
        java.lang.Class<?> wildcardClass24 = propertyDescriptor18.getPropertyEditorClass();
        propertyDescriptor18.setName("java/beans/PropertyDescriptor");
        java.lang.Class<?> wildcardClass27 = propertyDescriptor18.getPropertyType();
        propertyDescriptor18.setExpert(true);
        propertyDescriptor18.setExpert(true);
        boolean boolean32 = propertyDescriptor18.isExpert();
        propertyDescriptor18.setBound(true);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        propertyDescriptor39.setShortDescription("J");
        java.lang.Class<?> wildcardClass42 = propertyDescriptor39.getPropertyType();
        java.lang.Class<?> wildcardClass43 = propertyDescriptor39.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray46);
        propertyDescriptor18.setValue("java.beans.PropertyDescriptor[name=hi!; shortDescription=J; expert; bound]", (java.lang.Object) classArray47);
        java.beans.PropertyEditor propertyEditor49 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor18);
        java.lang.String str50 = propertyDescriptor18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor39", propertyDescriptor3.equals(propertyDescriptor39) ? propertyDescriptor3.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean4 = signature2.equals((java.lang.Object) type3);
        java.lang.String str5 = type3.getClassName();
        java.lang.String str6 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type3.getDimensions();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = null;
        enhancer24.setStrategy(generatorStrategy27);
        boolean boolean29 = enhancer24.getUseCache();
        enhancer24.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        enhancer34.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = enhancer34.getNamingPolicy();
        enhancer33.setNamingPolicy(namingPolicy37);
        enhancer32.setNamingPolicy(namingPolicy37);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        enhancer42.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer42.getNamingPolicy();
        enhancer41.setNamingPolicy(namingPolicy45);
        enhancer40.setNamingPolicy(namingPolicy45);
        enhancer32.setNamingPolicy(namingPolicy45);
        boolean boolean50 = namingPolicy45.equals((java.lang.Object) 0.0d);
        enhancer24.setNamingPolicy(namingPolicy45);
        enhancer0.setNamingPolicy(namingPolicy45);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = enhancer0.getNamingPolicy();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("Ljava/beans/PropertyDescriptor;(I)J", method55, method56);
        boolean boolean58 = namingPolicy53.equals((java.lang.Object) method55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor57", propertyDescriptor16.equals(propertyDescriptor57) ? propertyDescriptor16.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, (int) (short) 100);
        int int51 = methodInfo50.getModifiers();
        org.mockito.asm.Type[] typeArray52 = methodInfo50.getExceptionTypes();
        java.lang.String str53 = methodInfo50.toString();
        org.mockito.cglib.core.ClassInfo classInfo54 = methodInfo50.getClassInfo();
        int int55 = classInfo54.getModifiers();
        org.mockito.asm.Type type56 = classInfo54.getType();
        java.lang.String str57 = classInfo54.toString();
        java.lang.String str58 = classInfo54.toString();
        java.lang.String str59 = classInfo54.toString();
        org.mockito.asm.Type type60 = classInfo54.getType();
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Method method63 = null;
        java.beans.PropertyDescriptor propertyDescriptor64 = new java.beans.PropertyDescriptor("hi!", method62, method63);
        java.lang.reflect.Method method65 = propertyDescriptor64.getReadMethod();
        java.lang.Class<?> wildcardClass66 = propertyDescriptor64.getPropertyEditorClass();
        propertyDescriptor64.setHidden(false);
        boolean boolean69 = propertyDescriptor64.isHidden();
        propertyDescriptor64.setName("(FIDCCJ)I");
        java.lang.Object obj73 = propertyDescriptor64.getValue("Lava.beans.PropertyDescriptor[name=hi!;");
        propertyDescriptor64.setDisplayName("<init>(Ljava/beans/PropertyDescriptor;Ljava/beans/PropertyDescriptor;)V");
        java.lang.Class<?> wildcardClass76 = propertyDescriptor64.getPropertyType();
        boolean boolean77 = type60.equals((java.lang.Object) wildcardClass76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor64", propertyDescriptor16.equals(propertyDescriptor64) ? propertyDescriptor16.hashCode() == propertyDescriptor64.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(true);
        propertyDescriptor3.setHidden(false);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.String str13 = propertyDescriptor3.getName();
        java.lang.String str14 = propertyDescriptor3.getName();
        java.lang.Object obj15 = null;
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor3.createPropertyEditor(obj15);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=java/beans/PropertyDescriptor; hidden; expert]");
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.reflect.Method method24 = propertyDescriptor23.getReadMethod();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor23.getPropertyEditorClass();
        propertyDescriptor23.setHidden(false);
        boolean boolean28 = propertyDescriptor23.isHidden();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor23.getPropertyEditorClass();
        propertyDescriptor23.setName("java/beans/PropertyDescriptor");
        propertyDescriptor23.setName("(I)LI;");
        propertyDescriptor23.setShortDescription("(I)LI;");
        java.lang.reflect.Method method36 = null;
        propertyDescriptor23.setReadMethod(method36);
        java.lang.String str38 = propertyDescriptor23.getDisplayName();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) str38);
        org.mockito.cglib.proxy.Enhancer enhancer40 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer41 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        enhancer42.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy45 = enhancer42.getNamingPolicy();
        enhancer41.setNamingPolicy(namingPolicy45);
        enhancer40.setNamingPolicy(namingPolicy45);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter48 = null;
        enhancer40.setCallbackFilter(callbackFilter48);
        enhancer40.setUseCache(false);
        java.lang.ClassLoader classLoader52 = enhancer40.getClassLoader();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        propertyDescriptor56.setShortDescription("J");
        java.lang.Class<?> wildcardClass59 = propertyDescriptor56.getPropertyType();
        java.lang.Class<?> wildcardClass60 = propertyDescriptor56.getClass();
        org.mockito.cglib.core.ClassInfo classInfo61 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        enhancer40.setSuperclass((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        java.lang.String str64 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass60);
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("hi!", method66, method67);
        propertyDescriptor68.setShortDescription("J");
        java.lang.Class<?> wildcardClass71 = propertyDescriptor68.getPropertyType();
        java.lang.Class<?> wildcardClass72 = propertyDescriptor68.getClass();
        java.lang.reflect.Method method74 = null;
        java.lang.reflect.Method method75 = null;
        java.beans.PropertyDescriptor propertyDescriptor76 = new java.beans.PropertyDescriptor("hi!", method74, method75);
        propertyDescriptor76.setShortDescription("J");
        java.lang.Class<?> wildcardClass79 = propertyDescriptor76.getPropertyType();
        java.lang.Class<?> wildcardClass80 = propertyDescriptor76.getClass();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass80);
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass80);
        org.mockito.asm.Type type83 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass80);
        java.lang.Class[] classArray84 = new java.lang.Class[] { wildcardClass72, wildcardClass80 };
        java.lang.String[] strArray85 = org.mockito.cglib.core.ReflectUtils.getNames(classArray84);
        int int86 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray84);
        java.lang.reflect.Constructor constructor87 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass60, classArray84);
        org.mockito.cglib.core.MethodInfo methodInfo88 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor87);
        org.mockito.cglib.core.MethodInfo methodInfo90 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor87, (int) (short) 100);
        org.mockito.cglib.core.MethodInfo methodInfo91 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor87);
        org.mockito.asm.Type[] typeArray92 = methodInfo91.getExceptionTypes();
        java.beans.PropertyEditor propertyEditor93 = propertyDescriptor3.createPropertyEditor((java.lang.Object) typeArray92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor23 and propertyDescriptor56", propertyDescriptor23.equals(propertyDescriptor56) ? propertyDescriptor23.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(I)LI;", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setShortDescription("J");
        java.lang.Class<?> wildcardClass11 = propertyDescriptor8.getPropertyType();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor8.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=java/beans/PropertyDescriptor; hidden; expert]", (java.lang.Object) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor8", propertyDescriptor3.equals(propertyDescriptor8) ? propertyDescriptor3.hashCode() == propertyDescriptor8.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        int int6 = type0.getSort();
        int int8 = type0.getOpcode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setName("(FIDCCJ)I");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setWriteMethod(method13);
        propertyDescriptor3.setPreferred(false);
        boolean boolean17 = propertyDescriptor3.isHidden();
        java.lang.String str18 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        propertyDescriptor23.setShortDescription("J");
        java.lang.Class<?> wildcardClass26 = propertyDescriptor23.getPropertyType();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor23.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type32 = classInfo31.getSuperType();
        org.mockito.asm.Type[] typeArray33 = classInfo31.getInterfaces();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(I)LI;; shortDescription=(I)LI;]", (java.lang.Object) classInfo31);
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer36 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer37 = new org.mockito.cglib.proxy.Enhancer();
        enhancer37.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy40 = enhancer37.getNamingPolicy();
        enhancer36.setNamingPolicy(namingPolicy40);
        enhancer35.setNamingPolicy(namingPolicy40);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter43 = null;
        enhancer35.setCallbackFilter(callbackFilter43);
        enhancer35.setUseCache(false);
        java.lang.ClassLoader classLoader47 = enhancer35.getClassLoader();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        propertyDescriptor51.setShortDescription("J");
        java.lang.Class<?> wildcardClass54 = propertyDescriptor51.getPropertyType();
        java.lang.Class<?> wildcardClass55 = propertyDescriptor51.getClass();
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass55);
        enhancer35.setSuperclass((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass55);
        java.lang.String str59 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass55);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("hi!", method61, method62);
        propertyDescriptor63.setShortDescription("J");
        java.lang.Class<?> wildcardClass66 = propertyDescriptor63.getPropertyType();
        java.lang.Class<?> wildcardClass67 = propertyDescriptor63.getClass();
        java.lang.reflect.Method method69 = null;
        java.lang.reflect.Method method70 = null;
        java.beans.PropertyDescriptor propertyDescriptor71 = new java.beans.PropertyDescriptor("hi!", method69, method70);
        propertyDescriptor71.setShortDescription("J");
        java.lang.Class<?> wildcardClass74 = propertyDescriptor71.getPropertyType();
        java.lang.Class<?> wildcardClass75 = propertyDescriptor71.getClass();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass75);
        java.beans.PropertyDescriptor[] propertyDescriptorArray77 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass75);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass75);
        java.lang.Class[] classArray79 = new java.lang.Class[] { wildcardClass67, wildcardClass75 };
        java.lang.String[] strArray80 = org.mockito.cglib.core.ReflectUtils.getNames(classArray79);
        int int81 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray79);
        java.lang.reflect.Constructor constructor82 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass55, classArray79);
        org.mockito.cglib.core.MethodInfo methodInfo83 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82);
        org.mockito.cglib.core.Signature signature84 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor82);
        java.lang.String str85 = org.mockito.asm.Type.getConstructorDescriptor(constructor82);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor82);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor82);
        org.mockito.cglib.core.MethodInfo methodInfo88 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82);
        org.mockito.cglib.core.MethodInfo methodInfo89 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82);
        boolean boolean90 = classInfo31.equals((java.lang.Object) methodInfo89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) type1);
        int int4 = type0.getOpcode(61);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        enhancer0.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = null;
        enhancer0.setStrategy(generatorStrategy3);
        boolean boolean5 = enhancer0.getUseCache();
        enhancer0.setUseFactory(true);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer10.getNamingPolicy();
        enhancer9.setNamingPolicy(namingPolicy13);
        enhancer8.setNamingPolicy(namingPolicy13);
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer18 = new org.mockito.cglib.proxy.Enhancer();
        enhancer18.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy21 = enhancer18.getNamingPolicy();
        enhancer17.setNamingPolicy(namingPolicy21);
        enhancer16.setNamingPolicy(namingPolicy21);
        enhancer8.setNamingPolicy(namingPolicy21);
        boolean boolean26 = namingPolicy21.equals((java.lang.Object) 0.0d);
        enhancer0.setNamingPolicy(namingPolicy21);
        enhancer0.setUseCache(false);
        enhancer0.setUseCache(false);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer35 = new org.mockito.cglib.proxy.Enhancer();
        enhancer35.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = enhancer35.getNamingPolicy();
        enhancer34.setNamingPolicy(namingPolicy38);
        enhancer33.setNamingPolicy(namingPolicy38);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter41 = null;
        enhancer33.setCallbackFilter(callbackFilter41);
        enhancer33.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type48 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean49 = signature47.equals((java.lang.Object) type48);
        java.lang.Class[] classArray50 = new java.lang.Class[] {};
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray50);
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray50);
        boolean boolean53 = signature47.equals((java.lang.Object) classArray50);
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray50);
        enhancer33.setInterfaces(classArray50);
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        propertyDescriptor59.setShortDescription("J");
        java.lang.Class<?> wildcardClass62 = propertyDescriptor59.getPropertyType();
        boolean boolean63 = propertyDescriptor59.isPreferred();
        propertyDescriptor59.setHidden(true);
        java.lang.reflect.Method method66 = null;
        propertyDescriptor59.setWriteMethod(method66);
        propertyDescriptor59.setHidden(false);
        java.lang.String str70 = propertyDescriptor59.getName();
        propertyDescriptor59.setExpert(false);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer75 = new org.mockito.cglib.proxy.Enhancer();
        enhancer75.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy78 = enhancer75.getNamingPolicy();
        enhancer74.setNamingPolicy(namingPolicy78);
        org.mockito.cglib.proxy.Callback callback80 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray81 = new org.mockito.cglib.proxy.Callback[] { callback80 };
        enhancer74.setCallbacks(callbackArray81);
        java.lang.ClassLoader classLoader83 = enhancer74.getClassLoader();
        propertyDescriptor59.setValue("java/beans/FeatureDescriptor(I)I", (java.lang.Object) classLoader83);
        enhancer33.setClassLoader(classLoader83);
        java.lang.ClassLoader classLoader86 = enhancer33.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy87 = enhancer33.getNamingPolicy();
        boolean boolean88 = generatorStrategy32.equals((java.lang.Object) enhancer33);
        java.lang.reflect.Method method90 = null;
        java.lang.reflect.Method method91 = null;
        java.beans.PropertyDescriptor propertyDescriptor92 = new java.beans.PropertyDescriptor("(I)Ljava/beans/FeatureDescriptor;", method90, method91);
        propertyDescriptor92.setDisplayName("ava.beans.PropertyDescriptor[name=hi!");
        boolean boolean95 = propertyDescriptor92.isPreferred();
        boolean boolean96 = generatorStrategy32.equals((java.lang.Object) boolean95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor59 and propertyDescriptor92", propertyDescriptor59.equals(propertyDescriptor92) ? propertyDescriptor59.hashCode() == propertyDescriptor92.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.asm.Type.getArgumentTypes("(I)Lava.beans.PropertyDescriptor[name=hi!;");
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray13);
        int int15 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type1.getElementType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        java.lang.String str12 = signature11.toString();
        org.mockito.asm.Type[] typeArray13 = signature11.getArgumentTypes();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type14.getElementType();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray9 = classInfo8.getInterfaces();
        org.mockito.asm.Type type10 = classInfo8.getType();
        org.mockito.cglib.proxy.Enhancer enhancer11 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer12 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        enhancer13.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy16 = enhancer13.getNamingPolicy();
        enhancer12.setNamingPolicy(namingPolicy16);
        enhancer11.setNamingPolicy(namingPolicy16);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter19 = null;
        enhancer11.setCallbackFilter(callbackFilter19);
        enhancer11.setUseCache(false);
        java.lang.ClassLoader classLoader23 = enhancer11.getClassLoader();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        propertyDescriptor27.setShortDescription("J");
        java.lang.Class<?> wildcardClass30 = propertyDescriptor27.getPropertyType();
        java.lang.Class<?> wildcardClass31 = propertyDescriptor27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        enhancer11.setSuperclass((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        propertyDescriptor39.setShortDescription("J");
        java.lang.Class<?> wildcardClass42 = propertyDescriptor39.getPropertyType();
        java.lang.Class<?> wildcardClass43 = propertyDescriptor39.getClass();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        propertyDescriptor47.setShortDescription("J");
        java.lang.Class<?> wildcardClass50 = propertyDescriptor47.getPropertyType();
        java.lang.Class<?> wildcardClass51 = propertyDescriptor47.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray55 = new java.lang.Class[] { wildcardClass43, wildcardClass51 };
        java.lang.String[] strArray56 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        int int57 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        java.lang.reflect.Constructor constructor58 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass31, classArray55);
        org.mockito.cglib.core.MethodInfo methodInfo59 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58);
        org.mockito.cglib.core.MethodInfo methodInfo61 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58, (int) (short) 100);
        org.mockito.cglib.core.MethodInfo methodInfo62 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58);
        boolean boolean63 = type10.equals((java.lang.Object) methodInfo62);
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        java.beans.PropertyDescriptor propertyDescriptor67 = new java.beans.PropertyDescriptor("hi!", method65, method66);
        java.lang.reflect.Method method68 = propertyDescriptor67.getReadMethod();
        java.lang.Class<?> wildcardClass69 = propertyDescriptor67.getPropertyEditorClass();
        propertyDescriptor67.setHidden(false);
        java.lang.reflect.Method method72 = propertyDescriptor67.getReadMethod();
        propertyDescriptor67.setName("(I)J");
        java.util.Enumeration<java.lang.String> strEnumeration75 = propertyDescriptor67.attributeNames();
        java.lang.Class<?> wildcardClass76 = propertyDescriptor67.getPropertyType();
        boolean boolean77 = methodInfo62.equals((java.lang.Object) propertyDescriptor67);
        org.mockito.cglib.core.ClassInfo classInfo78 = methodInfo62.getClassInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor67", propertyDescriptor3.equals(propertyDescriptor67) ? propertyDescriptor3.hashCode() == propertyDescriptor67.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("va.beans.PropertyDescriptor", type1, typeArray3);
        int int5 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) type4);
        java.lang.String str6 = type3.getClassName();
        java.lang.String str7 = type3.getDescriptor();
        boolean boolean8 = type0.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        int int6 = type0.getSort();
        int int8 = type0.getOpcode((int) (short) 0);
        int int10 = type0.getOpcode((int) 'a');
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(I)LI;");
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("Ljava/beans/PropertyDescriptor;", type5, typeArray8);
        java.lang.String str10 = signature9.getDescriptor();
        java.lang.String str11 = signature9.toString();
        org.mockito.asm.Type[] typeArray12 = signature9.getArgumentTypes();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=hi!]", type1, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type1.getInternalName();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; values={J=I}]");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.toString();
        int int11 = type9.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type13, type16, type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type9, type23, type24, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("char", type8, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray33);
        java.lang.String str37 = type0.getClassName();
        int int38 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type0.getInternalName();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        enhancer25.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = enhancer25.getNamingPolicy();
        enhancer24.setNamingPolicy(namingPolicy28);
        java.lang.ClassLoader classLoader30 = enhancer24.getClassLoader();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer24.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy31);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.reflect.Method method37 = propertyDescriptor36.getReadMethod();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setHidden(false);
        java.lang.reflect.Method method41 = propertyDescriptor36.getReadMethod();
        propertyDescriptor36.setName("(I)J");
        java.lang.reflect.Method method44 = propertyDescriptor36.getReadMethod();
        propertyDescriptor36.setName("java.beans.PropertyDescriptor[name=hi!; hidden; values={J=I}]");
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        enhancer49.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = enhancer49.getNamingPolicy();
        enhancer48.setNamingPolicy(namingPolicy52);
        enhancer47.setNamingPolicy(namingPolicy52);
        org.mockito.cglib.proxy.Enhancer enhancer55 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer56 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer57 = new org.mockito.cglib.proxy.Enhancer();
        enhancer57.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy60 = enhancer57.getNamingPolicy();
        enhancer56.setNamingPolicy(namingPolicy60);
        enhancer55.setNamingPolicy(namingPolicy60);
        enhancer47.setNamingPolicy(namingPolicy60);
        enhancer47.setUseFactory(false);
        enhancer47.setInterceptDuringConstruction(true);
        enhancer47.setInterceptDuringConstruction(false);
        enhancer47.setInterceptDuringConstruction(false);
        java.beans.PropertyEditor propertyEditor72 = propertyDescriptor36.createPropertyEditor((java.lang.Object) enhancer47);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy73 = enhancer47.getStrategy();
        org.mockito.cglib.proxy.Callback callback74 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray75 = new org.mockito.cglib.proxy.Callback[] { callback74 };
        enhancer47.setCallbacks(callbackArray75);
        enhancer0.setCallbacks(callbackArray75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor36", propertyDescriptor16.equals(propertyDescriptor36) ? propertyDescriptor16.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        enhancer1.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = enhancer1.getNamingPolicy();
        enhancer0.setNamingPolicy(namingPolicy4);
        org.mockito.cglib.proxy.Callback callback6 = null;
        org.mockito.cglib.proxy.Callback[] callbackArray7 = new org.mockito.cglib.proxy.Callback[] { callback6 };
        enhancer0.setCallbacks(callbackArray7);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer0.getStrategy();
        org.mockito.cglib.proxy.CallbackFilter callbackFilter10 = null;
        enhancer0.setCallbackFilter(callbackFilter10);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        org.mockito.cglib.proxy.Enhancer enhancer13 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        enhancer15.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = enhancer15.getNamingPolicy();
        enhancer14.setNamingPolicy(namingPolicy18);
        enhancer13.setNamingPolicy(namingPolicy18);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter21 = null;
        enhancer13.setCallbackFilter(callbackFilter21);
        boolean boolean23 = enhancer13.getUseCache();
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        enhancer24.setAttemptLoad(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = null;
        enhancer24.setStrategy(generatorStrategy27);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        enhancer24.setInterfaces(classArray29);
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer24.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer24.getStrategy();
        enhancer13.setStrategy(generatorStrategy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer13.getStrategy();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("hi!", method38, method39);
        java.lang.reflect.Method method41 = propertyDescriptor40.getReadMethod();
        java.lang.Class<?> wildcardClass42 = propertyDescriptor40.getPropertyEditorClass();
        propertyDescriptor40.setValue("J", (java.lang.Object) 0.0d);
        boolean boolean46 = generatorStrategy36.equals((java.lang.Object) 0.0d);
        enhancer0.setStrategy(generatorStrategy36);
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        java.lang.reflect.Method method52 = propertyDescriptor51.getReadMethod();
        java.lang.Class<?> wildcardClass53 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setHidden(false);
        boolean boolean56 = propertyDescriptor51.isHidden();
        propertyDescriptor51.setHidden(false);
        java.lang.String str59 = propertyDescriptor51.getDisplayName();
        java.lang.String str60 = propertyDescriptor51.getName();
        propertyDescriptor51.setName("float");
        java.lang.reflect.Method method63 = propertyDescriptor51.getWriteMethod();
        java.lang.String str64 = propertyDescriptor51.getShortDescription();
        java.lang.Class<?> wildcardClass65 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setShortDescription("Z()Ljava/beans/FeatureDescriptor;");
        boolean boolean68 = propertyDescriptor51.isHidden();
        java.lang.Class<?> wildcardClass69 = propertyDescriptor51.getPropertyEditorClass();
        java.lang.reflect.Method method70 = null;
        propertyDescriptor51.setWriteMethod(method70);
        boolean boolean72 = generatorStrategy36.equals((java.lang.Object) method70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor40 and propertyDescriptor51", propertyDescriptor40.equals(propertyDescriptor51) ? propertyDescriptor40.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.reflect.Method method13 = propertyDescriptor12.getReadMethod();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setHidden(false);
        boolean boolean17 = propertyDescriptor12.isHidden();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor12.getPropertyEditorClass();
        boolean boolean19 = classInfo8.equals((java.lang.Object) propertyDescriptor12);
        int int20 = classInfo8.getModifiers();
        org.mockito.asm.Type type21 = classInfo8.getType();
        int int22 = classInfo8.getModifiers();
        java.lang.String str23 = classInfo8.toString();
        org.mockito.asm.Type type24 = classInfo8.getSuperType();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("J", method26, method27);
        propertyDescriptor28.setHidden(false);
        boolean boolean31 = classInfo8.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={J=I}]java.beans.PropertyDescriptor[name=hi!; shortDescription=hi!]", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        propertyDescriptor7.setShortDescription("J");
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getPropertyType();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.reflect.Method method17 = propertyDescriptor16.getReadMethod();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor16.getPropertyEditorClass();
        propertyDescriptor16.setHidden(false);
        boolean boolean21 = propertyDescriptor16.isHidden();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor16.getPropertyEditorClass();
        boolean boolean23 = classInfo12.equals((java.lang.Object) propertyDescriptor16);
        int int24 = classInfo12.getModifiers();
        java.lang.String str25 = classInfo12.toString();
        org.mockito.asm.Type type26 = classInfo12.getType();
        java.lang.Class<?> wildcardClass27 = classInfo12.getClass();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.reflect.Method method13 = propertyDescriptor12.getReadMethod();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setHidden(false);
        boolean boolean17 = propertyDescriptor12.isHidden();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor12.getPropertyEditorClass();
        boolean boolean19 = classInfo8.equals((java.lang.Object) propertyDescriptor12);
        org.mockito.asm.Type type20 = classInfo8.getType();
        org.mockito.asm.Type type21 = classInfo8.getSuperType();
        org.mockito.asm.Type type22 = type21.getElementType();
        int int24 = type22.getOpcode(7);
        int int25 = type22.getSize();
        org.mockito.asm.Type type26 = type22.getElementType();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.reflect.Method method31 = propertyDescriptor30.getReadMethod();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor30.getPropertyEditorClass();
        propertyDescriptor30.setHidden(false);
        boolean boolean35 = propertyDescriptor30.isHidden();
        java.lang.Class<?> wildcardClass36 = propertyDescriptor30.getPropertyEditorClass();
        propertyDescriptor30.setName("java/beans/PropertyDescriptor");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor30.getPropertyType();
        propertyDescriptor30.setExpert(true);
        java.lang.String str42 = propertyDescriptor30.getName();
        propertyDescriptor30.setHidden(true);
        java.util.Enumeration<java.lang.String> strEnumeration45 = propertyDescriptor30.attributeNames();
        boolean boolean46 = type26.equals((java.lang.Object) propertyDescriptor30);
        int int47 = type26.getSort();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 7);
        org.mockito.cglib.core.ClassInfo classInfo51 = methodInfo50.getClassInfo();
        org.mockito.asm.Type type52 = classInfo51.getSuperType();
        int int53 = classInfo51.getModifiers();
        java.lang.String str54 = classInfo51.toString();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        java.lang.reflect.Method method59 = propertyDescriptor58.getReadMethod();
        java.lang.Class<?> wildcardClass60 = propertyDescriptor58.getPropertyEditorClass();
        propertyDescriptor58.setHidden(false);
        java.lang.String str63 = propertyDescriptor58.getName();
        java.lang.reflect.Method method64 = propertyDescriptor58.getReadMethod();
        java.lang.String str65 = propertyDescriptor58.getDisplayName();
        boolean boolean66 = propertyDescriptor58.isHidden();
        propertyDescriptor58.setPreferred(false);
        java.lang.reflect.Method method69 = null;
        propertyDescriptor58.setReadMethod(method69);
        java.lang.Object obj72 = propertyDescriptor58.getValue("(I)I");
        java.lang.Class<?> wildcardClass73 = propertyDescriptor58.getPropertyEditorClass();
        propertyDescriptor58.setName("java.beans.PropertyDescriptor[name=hi!; shortDescription=J; expert; bound]");
        boolean boolean76 = classInfo51.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; shortDescription=J; expert; bound]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor58", propertyDescriptor16.equals(propertyDescriptor58) ? propertyDescriptor16.hashCode() == propertyDescriptor58.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.toString();
        boolean boolean4 = type1.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str6 = type5.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.toString();
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type7 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", type1, typeArray9);
        java.lang.String str12 = signature11.toString();
        org.mockito.asm.Type[] typeArray13 = signature11.getArgumentTypes();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        org.mockito.asm.Type type15 = signature11.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type15.getInternalName();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setHidden(false);
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("java/beans/PropertyDescriptor");
        propertyDescriptor3.setName("(I)LI;");
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer16 = new org.mockito.cglib.proxy.Enhancer();
        enhancer16.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy19 = enhancer16.getNamingPolicy();
        enhancer15.setNamingPolicy(namingPolicy19);
        enhancer14.setNamingPolicy(namingPolicy19);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter22 = null;
        enhancer14.setCallbackFilter(callbackFilter22);
        enhancer14.setUseCache(false);
        java.lang.ClassLoader classLoader26 = enhancer14.getClassLoader();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        propertyDescriptor30.setShortDescription("J");
        java.lang.Class<?> wildcardClass33 = propertyDescriptor30.getPropertyType();
        java.lang.Class<?> wildcardClass34 = propertyDescriptor30.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        enhancer14.setSuperclass((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass34);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        propertyDescriptor42.setShortDescription("J");
        java.lang.Class<?> wildcardClass45 = propertyDescriptor42.getPropertyType();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor42.getClass();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        java.lang.Class<?> wildcardClass53 = propertyDescriptor50.getPropertyType();
        java.lang.Class<?> wildcardClass54 = propertyDescriptor50.getClass();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.beans.PropertyDescriptor[] propertyDescriptorArray56 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass46, wildcardClass54 };
        java.lang.String[] strArray59 = org.mockito.cglib.core.ReflectUtils.getNames(classArray58);
        int int60 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray58);
        java.lang.reflect.Constructor constructor61 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass34, classArray58);
        org.mockito.cglib.core.MethodInfo methodInfo62 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor61);
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor61);
        org.mockito.asm.Type type64 = signature63.getReturnType();
        int int66 = type64.getOpcode(57);
        java.beans.PropertyEditor propertyEditor67 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type64);
        int int68 = type64.getSize();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode((int) (byte) 0);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; values={J=I}]");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.toString();
        int int11 = type9.getSize();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.toString();
        int int15 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type13, type16, type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str25 = type24.toString();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str27 = type26.toString();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type9, type23, type24, type26 };
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("char", type8, typeArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("I");
        org.mockito.asm.Type[] typeArray33 = org.mockito.asm.Type.getArgumentTypes("(I)J");
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray33);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", type8, typeArray33);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray33);
        int int38 = type0.getOpcode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = type0.getInternalName();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        int int4 = type0.getSize();
        int int5 = type0.getSort();
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.Signature signature49 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 0);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 10);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("int", method55, method56);
        java.lang.reflect.Method method58 = propertyDescriptor57.getReadMethod();
        java.lang.Class<?> wildcardClass59 = propertyDescriptor57.getPropertyType();
        java.lang.reflect.Method method60 = propertyDescriptor57.getWriteMethod();
        java.lang.String str61 = propertyDescriptor57.getName();
        java.lang.reflect.Method method62 = propertyDescriptor57.getReadMethod();
        boolean boolean63 = methodInfo53.equals((java.lang.Object) propertyDescriptor57);
        org.mockito.asm.Type[] typeArray64 = methodInfo53.getExceptionTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor57", propertyDescriptor16.equals(propertyDescriptor57) ? propertyDescriptor16.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int2 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type[] typeArray11 = org.mockito.asm.Type.getArgumentTypes("(I)LI;");
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Ljava/beans/PropertyDescriptor;", type8, typeArray11);
        java.lang.String str13 = signature12.getDescriptor();
        java.lang.String str14 = signature12.toString();
        org.mockito.asm.Type[] typeArray15 = signature12.getArgumentTypes();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=hi!]", type4, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type1.getInternalName();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str3 = type2.toString();
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type2 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        int int6 = type0.getSort();
        int int8 = type0.getOpcode((int) (short) 0);
        int int10 = type0.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(I)I", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        propertyDescriptor12.setShortDescription("J");
        java.lang.Class<?> wildcardClass15 = propertyDescriptor12.getPropertyType();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        java.lang.reflect.Method method22 = propertyDescriptor21.getReadMethod();
        java.lang.Class<?> wildcardClass23 = propertyDescriptor21.getPropertyEditorClass();
        propertyDescriptor21.setHidden(false);
        boolean boolean26 = propertyDescriptor21.isHidden();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor21.getPropertyEditorClass();
        boolean boolean28 = classInfo17.equals((java.lang.Object) propertyDescriptor21);
        int int29 = classInfo17.getModifiers();
        org.mockito.asm.Type type30 = classInfo17.getType();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.reflect.Method method35 = propertyDescriptor34.getReadMethod();
        java.lang.Class<?> wildcardClass36 = propertyDescriptor34.getPropertyEditorClass();
        propertyDescriptor34.setHidden(false);
        boolean boolean39 = propertyDescriptor34.isHidden();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor34.getPropertyEditorClass();
        propertyDescriptor34.setName("java/beans/PropertyDescriptor");
        propertyDescriptor34.setName("(I)LI;");
        propertyDescriptor34.setShortDescription("(I)LI;");
        java.lang.reflect.Method method47 = propertyDescriptor34.getReadMethod();
        boolean boolean48 = classInfo17.equals((java.lang.Object) propertyDescriptor34);
        propertyDescriptor34.setConstrained(false);
        propertyDescriptor34.setShortDescription("java.beans.PropertyDescriptor[name=(FIDCCJ)I; preferred]");
        java.lang.reflect.Method method53 = propertyDescriptor34.getWriteMethod();
        java.lang.String str54 = propertyDescriptor34.getDisplayName();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; shortDescription=J]", (java.lang.Object) propertyDescriptor34);
        boolean boolean56 = propertyDescriptor34.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor12", propertyDescriptor3.equals(propertyDescriptor12) ? propertyDescriptor3.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.reflect.Method method13 = propertyDescriptor12.getReadMethod();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setHidden(false);
        boolean boolean17 = propertyDescriptor12.isHidden();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor12.getPropertyEditorClass();
        boolean boolean19 = classInfo8.equals((java.lang.Object) propertyDescriptor12);
        int int20 = classInfo8.getModifiers();
        org.mockito.asm.Type type21 = classInfo8.getType();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("hi!", method23, method24);
        java.lang.reflect.Method method26 = propertyDescriptor25.getReadMethod();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor25.getPropertyEditorClass();
        propertyDescriptor25.setHidden(false);
        boolean boolean30 = propertyDescriptor25.isHidden();
        java.lang.Class<?> wildcardClass31 = propertyDescriptor25.getPropertyEditorClass();
        propertyDescriptor25.setName("java/beans/PropertyDescriptor");
        propertyDescriptor25.setName("(I)LI;");
        propertyDescriptor25.setShortDescription("(I)LI;");
        java.lang.reflect.Method method38 = propertyDescriptor25.getReadMethod();
        boolean boolean39 = classInfo8.equals((java.lang.Object) propertyDescriptor25);
        propertyDescriptor25.setConstrained(false);
        propertyDescriptor25.setShortDescription("java.beans.PropertyDescriptor[name=(FIDCCJ)I; preferred]");
        propertyDescriptor25.setDisplayName("java.beans.PropertyDescriptor[name=()V]");
        java.lang.reflect.Method method46 = null;
        propertyDescriptor25.setWriteMethod(method46);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor25", propertyDescriptor3.equals(propertyDescriptor25) ? propertyDescriptor3.hashCode() == propertyDescriptor25.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.reflect.Method method13 = propertyDescriptor12.getReadMethod();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setHidden(false);
        boolean boolean17 = propertyDescriptor12.isHidden();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor12.getPropertyEditorClass();
        boolean boolean19 = classInfo8.equals((java.lang.Object) propertyDescriptor12);
        int int20 = classInfo8.getModifiers();
        org.mockito.asm.Type type21 = classInfo8.getType();
        org.mockito.asm.Type type22 = type21.getElementType();
        org.mockito.asm.Type type23 = type21.getElementType();
        org.mockito.asm.Type type24 = type23.getElementType();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("Lva/beans/FeatureDescriptor;", method26, method27);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor28.getClass();
        boolean boolean30 = type24.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter8 = null;
        enhancer0.setCallbackFilter(callbackFilter8);
        enhancer0.setUseCache(false);
        java.lang.ClassLoader classLoader12 = enhancer0.getClassLoader();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setShortDescription("J");
        java.lang.Class<?> wildcardClass19 = propertyDescriptor16.getPropertyType();
        java.lang.Class<?> wildcardClass20 = propertyDescriptor16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        enhancer0.setSuperclass((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setShortDescription("J");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor28.getPropertyType();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        propertyDescriptor36.setShortDescription("J");
        java.lang.Class<?> wildcardClass39 = propertyDescriptor36.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor36.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass32, wildcardClass40 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.reflect.Constructor constructor47 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass20, classArray44);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47);
        java.lang.String str50 = org.mockito.asm.Type.getConstructorDescriptor(constructor47);
        org.mockito.cglib.core.MethodInfo methodInfo52 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor47, 0);
        org.mockito.cglib.core.Signature signature53 = methodInfo52.getSignature();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.reflect.Method method58 = propertyDescriptor57.getReadMethod();
        java.lang.Class<?> wildcardClass59 = propertyDescriptor57.getPropertyEditorClass();
        propertyDescriptor57.setHidden(false);
        boolean boolean62 = propertyDescriptor57.isHidden();
        propertyDescriptor57.setName("(FIDCCJ)I");
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type68 = org.mockito.asm.Type.FLOAT_TYPE;
        boolean boolean69 = signature67.equals((java.lang.Object) type68);
        java.lang.String str70 = signature67.toString();
        java.lang.String str71 = signature67.toString();
        java.lang.String str72 = signature67.getDescriptor();
        java.lang.String str73 = signature67.getDescriptor();
        java.lang.String str74 = signature67.toString();
        java.beans.PropertyEditor propertyEditor75 = propertyDescriptor57.createPropertyEditor((java.lang.Object) signature67);
        java.lang.String str76 = signature67.getDescriptor();
        boolean boolean77 = methodInfo52.equals((java.lang.Object) str76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor57", propertyDescriptor16.equals(propertyDescriptor57) ? propertyDescriptor16.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Ljava/beans/PropertyDescriptor;java.beans.PropertyDescriptor[name=hi!; shortDescription=J; expert; bound]", method1, method2);
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        propertyDescriptor10.setShortDescription("J");
        java.lang.Class<?> wildcardClass13 = propertyDescriptor10.getPropertyType();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        propertyDescriptor3.setValue("(I)Lva.beans.PropertyDescriptor;", (java.lang.Object) classInfo15);
        int int18 = classInfo15.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(I)LI;");
        int int2 = type1.getDimensions();
        org.mockito.asm.Type type3 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        java.lang.Object obj8 = propertyDescriptor3.getValue("");
        propertyDescriptor3.setShortDescription("float");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("()Ljava/beans/PropertyDescriptor;");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor", (java.lang.Object) type13);
        int int15 = type13.getSize();
        java.lang.String str16 = type13.getClassName();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.lang.reflect.Method method21 = propertyDescriptor20.getReadMethod();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor20.getPropertyEditorClass();
        propertyDescriptor20.setHidden(false);
        boolean boolean25 = propertyDescriptor20.isHidden();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor20.getPropertyEditorClass();
        propertyDescriptor20.setName("java/beans/PropertyDescriptor");
        propertyDescriptor20.setName("(I)LI;");
        java.lang.Object obj32 = propertyDescriptor20.getValue("java/beans/FeatureDescriptor");
        propertyDescriptor20.setName("I(I)I");
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getPropertyType();
        boolean boolean41 = propertyDescriptor39.isExpert();
        java.lang.Object obj43 = propertyDescriptor39.getValue("java.beans.PropertyDescriptor[name=(FIDCCJ)I; preferred]");
        java.util.Enumeration<java.lang.String> strEnumeration44 = propertyDescriptor39.attributeNames();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        propertyDescriptor49.setShortDescription("J");
        java.lang.Class<?> wildcardClass52 = propertyDescriptor49.getPropertyType();
        java.lang.Class<?> wildcardClass53 = propertyDescriptor49.getClass();
        org.mockito.cglib.core.ClassInfo classInfo54 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type[] typeArray55 = classInfo54.getInterfaces();
        org.mockito.asm.Type[] typeArray56 = classInfo54.getInterfaces();
        propertyDescriptor39.setValue("java.beans.PropertyDescriptor[name=hi!; values={J=I}]", (java.lang.Object) classInfo54);
        propertyDescriptor39.setShortDescription("I(I)I");
        propertyDescriptor20.setValue("float(I)J", (java.lang.Object) propertyDescriptor39);
        propertyDescriptor20.setShortDescription("()Z");
        boolean boolean63 = type13.equals((java.lang.Object) "()Z");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor20", propertyDescriptor3.equals(propertyDescriptor20) ? propertyDescriptor3.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        int int5 = type0.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer2 = new org.mockito.cglib.proxy.Enhancer();
        enhancer2.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy5 = enhancer2.getNamingPolicy();
        enhancer1.setNamingPolicy(namingPolicy5);
        enhancer0.setNamingPolicy(namingPolicy5);
        org.mockito.cglib.proxy.Enhancer enhancer8 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer9 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer10 = new org.mockito.cglib.proxy.Enhancer();
        enhancer10.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy13 = enhancer10.getNamingPolicy();
        enhancer9.setNamingPolicy(namingPolicy13);
        enhancer8.setNamingPolicy(namingPolicy13);
        enhancer0.setNamingPolicy(namingPolicy13);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.lang.reflect.Method method21 = propertyDescriptor20.getReadMethod();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor20.getPropertyEditorClass();
        propertyDescriptor20.setHidden(false);
        java.lang.reflect.Method method25 = propertyDescriptor20.getReadMethod();
        propertyDescriptor20.setName("(I)J");
        java.lang.reflect.Method method28 = propertyDescriptor20.getReadMethod();
        boolean boolean29 = propertyDescriptor20.isHidden();
        boolean boolean30 = namingPolicy13.equals((java.lang.Object) propertyDescriptor20);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.proxy.Enhancer enhancer33 = new org.mockito.cglib.proxy.Enhancer();
        enhancer33.setAttemptLoad(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = enhancer33.getNamingPolicy();
        enhancer32.setNamingPolicy(namingPolicy36);
        enhancer31.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.proxy.CallbackFilter callbackFilter39 = null;
        enhancer31.setCallbackFilter(callbackFilter39);
        enhancer31.setUseCache(false);
        java.lang.ClassLoader classLoader43 = enhancer31.getClassLoader();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        propertyDescriptor47.setShortDescription("J");
        java.lang.Class<?> wildcardClass50 = propertyDescriptor47.getPropertyType();
        java.lang.Class<?> wildcardClass51 = propertyDescriptor47.getClass();
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        enhancer31.setSuperclass((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        propertyDescriptor59.setShortDescription("J");
        java.lang.Class<?> wildcardClass62 = propertyDescriptor59.getPropertyType();
        java.lang.Class<?> wildcardClass63 = propertyDescriptor59.getClass();
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        java.beans.PropertyDescriptor propertyDescriptor67 = new java.beans.PropertyDescriptor("hi!", method65, method66);
        propertyDescriptor67.setShortDescription("J");
        java.lang.Class<?> wildcardClass70 = propertyDescriptor67.getPropertyType();
        java.lang.Class<?> wildcardClass71 = propertyDescriptor67.getClass();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass71);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass71);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass71);
        java.lang.Class[] classArray75 = new java.lang.Class[] { wildcardClass63, wildcardClass71 };
        java.lang.String[] strArray76 = org.mockito.cglib.core.ReflectUtils.getNames(classArray75);
        int int77 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray75);
        java.lang.reflect.Constructor constructor78 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass51, classArray75);
        org.mockito.cglib.core.MethodInfo methodInfo79 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor78);
        org.mockito.cglib.core.Signature signature80 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor78);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor78, 0);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor78, 1);
        org.mockito.cglib.core.Signature signature85 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor78);
        org.mockito.asm.Type[] typeArray86 = signature85.getArgumentTypes();
        java.lang.String str87 = signature85.toString();
        java.lang.String str88 = signature85.toString();
        org.mockito.asm.Type type89 = signature85.getReturnType();
        boolean boolean90 = namingPolicy13.equals((java.lang.Object) signature85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor47", propertyDescriptor20.equals(propertyDescriptor47) ? propertyDescriptor20.hashCode() == propertyDescriptor47.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.toString();
        boolean boolean3 = type0.equals((java.lang.Object) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type14 = classInfo13.getSuperType();
        int int15 = classInfo13.getModifiers();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        propertyDescriptor19.setShortDescription("J");
        java.lang.Class<?> wildcardClass22 = propertyDescriptor19.getPropertyType();
        boolean boolean23 = propertyDescriptor19.isPreferred();
        propertyDescriptor19.setName("I");
        java.lang.reflect.Method method26 = null;
        propertyDescriptor19.setReadMethod(method26);
        propertyDescriptor19.setExpert(false);
        boolean boolean30 = classInfo13.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor19", propertyDescriptor3.equals(propertyDescriptor19) ? propertyDescriptor3.hashCode() == propertyDescriptor19.hashCode() : true);
    }
}


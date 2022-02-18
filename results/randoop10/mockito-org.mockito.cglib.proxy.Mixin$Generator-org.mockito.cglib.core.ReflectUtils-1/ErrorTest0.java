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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=int; bound]");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("int", method11, method12);
        java.lang.reflect.Method method14 = null;
        propertyDescriptor13.setReadMethod(method14);
        java.lang.reflect.Method method16 = propertyDescriptor13.getWriteMethod();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor13.setReadMethod(method17);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("int", method20, method21);
        java.lang.reflect.Method method23 = null;
        propertyDescriptor22.setReadMethod(method23);
        java.lang.reflect.Method method25 = propertyDescriptor22.getWriteMethod();
        java.lang.reflect.Method method26 = propertyDescriptor22.getWriteMethod();
        propertyDescriptor22.setName("(III)I");
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor13.createPropertyEditor((java.lang.Object) propertyDescriptor22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] { propertyDescriptor3, propertyDescriptor22 };
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor22", propertyDescriptor13.equals(propertyDescriptor22) ? propertyDescriptor13.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        int int8 = type0.getSize();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type0.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        int int8 = type0.getSize();
        int int9 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setReadMethod(method7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor12.setReadMethod(method13);
        java.lang.reflect.Method method15 = propertyDescriptor12.getWriteMethod();
        java.lang.reflect.Method method16 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setName("(III)I");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("int", method22, method23);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor24.setValue("", (java.lang.Object) generator26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator26.getStrategy();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("int", method30, method31);
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor32.setValue("", (java.lang.Object) generator34);
        org.mockito.cglib.core.NamingPolicy namingPolicy36 = generator34.getNamingPolicy();
        generator26.setNamingPolicy(namingPolicy36);
        org.mockito.cglib.core.NamingPolicy namingPolicy38 = generator26.getNamingPolicy();
        propertyDescriptor3.setValue("", (java.lang.Object) generator26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor24", propertyDescriptor12.equals(propertyDescriptor24) ? propertyDescriptor12.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.reflect.Method method9 = propertyDescriptor3.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass11 = strEnumeration10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type15, type16, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray19);
        java.lang.Class<?> wildcardClass21 = typeArray19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor31.setValue("", (java.lang.Object) generator33);
        generator33.setStyle((int) (byte) 1);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        org.mockito.cglib.proxy.Mixin.Generator generator42 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor40.setValue("", (java.lang.Object) generator42);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy44 = generator42.getStrategy();
        java.lang.Object[] objArray47 = new java.lang.Object[] { generator42, 7, 6 };
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray47);
        org.mockito.cglib.proxy.Mixin mixin49 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray48);
        generator33.setClasses(classArray48);
        java.lang.Class<?> wildcardClass51 = generator33.getClass();
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("int", method53, method54);
        org.mockito.cglib.proxy.Mixin.Generator generator57 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor55.setValue("", (java.lang.Object) generator57);
        boolean boolean59 = generator57.getUseCache();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str61 = type60.getClassName();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str64 = type63.getClassName();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type62, type63, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type60, typeArray66);
        java.lang.Class[] classArray68 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray66);
        generator57.setDelegates((java.lang.Object[]) classArray68);
        java.lang.reflect.Constructor constructor70 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass51, classArray68);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor70);
        java.lang.String str72 = org.mockito.asm.Type.getConstructorDescriptor(constructor70);
        org.mockito.cglib.core.MethodInfo methodInfo74 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor70, (int) (byte) 1);
        org.mockito.asm.Type[] typeArray75 = methodInfo74.getExceptionTypes();
        java.lang.Object obj76 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass11, classArray26, (java.lang.Object[]) typeArray75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor31", propertyDescriptor3.equals(propertyDescriptor31) ? propertyDescriptor3.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type3, type4, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        int int17 = type9.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        java.lang.Class[] classArray26 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type1, typeArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type1.getElementType();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        int int11 = type9.getOpcode(1);
        java.lang.String str12 = type9.getInternalName();
        org.mockito.asm.Type type13 = type9.getElementType();
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getReturnType("(III)I");
        boolean boolean18 = type15.equals((java.lang.Object) "(III)I");
        boolean boolean19 = type13.equals((java.lang.Object) type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type15.getInternalName();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        boolean boolean1 = generator0.getUseCache();
        boolean boolean2 = generator0.getAttemptLoad();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader3 = generator0.getClassLoader();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str14 = propertyDescriptor3.getName();
        java.lang.String str15 = propertyDescriptor3.getName();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("int", method17, method18);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor19.setValue("", (java.lang.Object) generator21);
        generator21.setStyle((int) (byte) 1);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("int", method26, method27);
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor28.setValue("", (java.lang.Object) generator30);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator30.getStrategy();
        java.lang.Object[] objArray35 = new java.lang.Object[] { generator30, 7, 6 };
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray35);
        org.mockito.cglib.proxy.Mixin mixin37 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray36);
        generator21.setClasses(classArray36);
        java.lang.Class<?> wildcardClass39 = generator21.getClass();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("int", method41, method42);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor43.setValue("", (java.lang.Object) generator45);
        boolean boolean47 = generator45.getUseCache();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type50, type51, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        java.lang.Class[] classArray56 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray54);
        generator45.setDelegates((java.lang.Object[]) classArray56);
        java.lang.reflect.Constructor constructor58 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass39, classArray56);
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor3.createPropertyEditor((java.lang.Object) constructor58);
        org.mockito.cglib.core.Signature signature60 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor19", propertyDescriptor3.equals(propertyDescriptor19) ? propertyDescriptor3.hashCode() == propertyDescriptor19.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type9.getInternalName();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setReadMethod(method7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor12.setReadMethod(method13);
        java.lang.reflect.Method method15 = propertyDescriptor12.getWriteMethod();
        java.lang.reflect.Method method16 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setName("(III)I");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        propertyDescriptor3.setShortDescription("V");
        java.lang.String str22 = propertyDescriptor3.getName();
        java.lang.Object obj24 = propertyDescriptor3.getValue("Lint;");
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("int", method27, method28);
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor29.setValue("", (java.lang.Object) generator31);
        generator31.setStyle((int) (byte) 1);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("int", method36, method37);
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor38.setValue("", (java.lang.Object) generator40);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = generator40.getStrategy();
        java.lang.Object[] objArray45 = new java.lang.Object[] { generator40, 7, 6 };
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray45);
        org.mockito.cglib.proxy.Mixin mixin47 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray46);
        generator31.setClasses(classArray46);
        java.lang.Class<?> wildcardClass49 = generator31.getClass();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        org.mockito.cglib.proxy.Mixin.Generator generator55 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor53.setValue("", (java.lang.Object) generator55);
        boolean boolean57 = generator55.getUseCache();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str62 = type61.getClassName();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type60, type61, type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray64);
        java.lang.Class[] classArray66 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray64);
        generator55.setDelegates((java.lang.Object[]) classArray66);
        java.lang.reflect.Constructor constructor68 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass49, classArray66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor68);
        java.lang.String str70 = org.mockito.asm.Type.getConstructorDescriptor(constructor68);
        org.mockito.cglib.core.MethodInfo methodInfo72 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor68, (int) (byte) 1);
        org.mockito.asm.Type[] typeArray73 = methodInfo72.getExceptionTypes();
        propertyDescriptor3.setValue("boolean", (java.lang.Object) methodInfo72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor29", propertyDescriptor12.equals(propertyDescriptor29) ? propertyDescriptor12.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        int int8 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str44 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo46 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (byte) 1);
        org.mockito.cglib.core.ClassInfo classInfo47 = methodInfo46.getClassInfo();
        org.mockito.asm.Type[] typeArray48 = classInfo47.getInterfaces();
        org.mockito.asm.Type type49 = classInfo47.getType();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        java.lang.reflect.Method method54 = null;
        propertyDescriptor53.setReadMethod(method54);
        java.lang.reflect.Method method56 = propertyDescriptor53.getWriteMethod();
        propertyDescriptor53.setName("(III)I");
        java.lang.reflect.Method method59 = propertyDescriptor53.getReadMethod();
        java.lang.Class<?> wildcardClass60 = propertyDescriptor53.getPropertyEditorClass();
        boolean boolean61 = propertyDescriptor53.isHidden();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getReturnType("(III)Lorg.mockito.asm.Type[];");
        org.mockito.asm.Type type65 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getReturnType("(III)I");
        boolean boolean68 = type65.equals((java.lang.Object) "(III)I");
        org.mockito.asm.Type[] typeArray70 = org.mockito.asm.Type.getArgumentTypes("(III)I");
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("intint", type64, typeArray70);
        java.beans.PropertyEditor propertyEditor73 = propertyDescriptor53.createPropertyEditor((java.lang.Object) type64);
        boolean boolean74 = classInfo47.equals((java.lang.Object) type64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor53", propertyDescriptor3.equals(propertyDescriptor53) ? propertyDescriptor3.hashCode() == propertyDescriptor53.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str14 = propertyDescriptor3.getName();
        java.lang.String str15 = propertyDescriptor3.getName();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("int", method17, method18);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor19.setValue("", (java.lang.Object) generator21);
        generator21.setStyle((int) (byte) 1);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("int", method26, method27);
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor28.setValue("", (java.lang.Object) generator30);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator30.getStrategy();
        java.lang.Object[] objArray35 = new java.lang.Object[] { generator30, 7, 6 };
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray35);
        org.mockito.cglib.proxy.Mixin mixin37 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray36);
        generator21.setClasses(classArray36);
        java.lang.Class<?> wildcardClass39 = generator21.getClass();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("int", method41, method42);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor43.setValue("", (java.lang.Object) generator45);
        boolean boolean47 = generator45.getUseCache();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type50, type51, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        java.lang.Class[] classArray56 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray54);
        generator45.setDelegates((java.lang.Object[]) classArray56);
        java.lang.reflect.Constructor constructor58 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass39, classArray56);
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor3.createPropertyEditor((java.lang.Object) constructor58);
        org.mockito.cglib.core.MethodInfo methodInfo60 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor19", propertyDescriptor3.equals(propertyDescriptor19) ? propertyDescriptor3.hashCode() == propertyDescriptor19.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        propertyDescriptor3.setValue("hi!", (java.lang.Object) type9);
        boolean boolean11 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setShortDescription("Lorg/mockito/cglib/proxy/Mixin$Generator;");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("int", method15, method16);
        java.lang.reflect.Method method18 = null;
        propertyDescriptor17.setReadMethod(method18);
        java.lang.reflect.Method method20 = propertyDescriptor17.getWriteMethod();
        propertyDescriptor17.setName("(III)I");
        java.lang.reflect.Method method23 = propertyDescriptor17.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor17.attributeNames();
        java.beans.PropertyEditor propertyEditor25 = propertyDescriptor3.createPropertyEditor((java.lang.Object) strEnumeration24);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("int", method27, method28);
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor29.setValue("", (java.lang.Object) generator31);
        generator31.setStyle((int) (byte) 1);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("int", method36, method37);
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor38.setValue("", (java.lang.Object) generator40);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy42 = generator40.getStrategy();
        java.lang.Object[] objArray45 = new java.lang.Object[] { generator40, 7, 6 };
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray45);
        org.mockito.cglib.proxy.Mixin mixin47 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray46);
        generator31.setClasses(classArray46);
        java.lang.Class<?> wildcardClass49 = generator31.getClass();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        org.mockito.cglib.proxy.Mixin.Generator generator55 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor53.setValue("", (java.lang.Object) generator55);
        boolean boolean57 = generator55.getUseCache();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str59 = type58.getClassName();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str62 = type61.getClassName();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type60, type61, type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray64);
        java.lang.Class[] classArray66 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray64);
        generator55.setDelegates((java.lang.Object[]) classArray66);
        java.lang.reflect.Constructor constructor68 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass49, classArray66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor68);
        java.lang.String str71 = org.mockito.asm.Type.getConstructorDescriptor(constructor68);
        org.mockito.cglib.core.MethodInfo methodInfo72 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor68);
        java.lang.String str73 = org.mockito.asm.Type.getConstructorDescriptor(constructor68);
        org.mockito.cglib.core.MethodInfo methodInfo74 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor68);
        org.mockito.cglib.core.Signature signature75 = methodInfo74.getSignature();
        java.beans.PropertyEditor propertyEditor76 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor29", propertyDescriptor17.equals(propertyDescriptor29) ? propertyDescriptor17.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = classInfo13.getSuperType();
        int int15 = classInfo13.getModifiers();
        org.mockito.asm.Type type16 = classInfo13.getType();
        java.lang.String str17 = type16.getInternalName();
        boolean boolean18 = type0.equals((java.lang.Object) type16);
        int int20 = type0.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type0.getInternalName();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        int int11 = type9.getOpcode(1);
        java.lang.String str12 = type9.getInternalName();
        java.lang.String str13 = type9.getClassName();
        int int14 = type9.getDimensions();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        int int17 = type15.getOpcode((-1));
        boolean boolean18 = type9.equals((java.lang.Object) type15);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType("Lorg/mockito/cglib/proxy/Mixin$Generator;");
        java.lang.String str21 = type20.toString();
        boolean boolean22 = type15.equals((java.lang.Object) str21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type15.getInternalName();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.String str10 = propertyDescriptor3.getName();
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("int", method13, method14);
        org.mockito.cglib.proxy.Mixin.Generator generator17 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor15.setValue("", (java.lang.Object) generator17);
        generator17.setUseCache(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("int", method22, method23);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor24.setValue("", (java.lang.Object) generator26);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy28 = generator26.getStrategy();
        generator17.setStrategy(generatorStrategy28);
        generator17.setUseCache(false);
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("int", method33, method34);
        org.mockito.cglib.proxy.Mixin.Generator generator37 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor35.setValue("", (java.lang.Object) generator37);
        generator37.setStyle((int) (byte) 1);
        generator37.setUseCache(true);
        boolean boolean43 = generator37.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = generator37.getNamingPolicy();
        generator17.setNamingPolicy(namingPolicy44);
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor3.createPropertyEditor((java.lang.Object) generator17);
        generator17.setUseCache(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor15", propertyDescriptor3.equals(propertyDescriptor15) ? propertyDescriptor3.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 1);
        int int46 = methodInfo45.getModifiers();
        org.mockito.cglib.core.Signature signature47 = methodInfo45.getSignature();
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("int", method50, method51);
        java.lang.reflect.Method method53 = null;
        propertyDescriptor52.setReadMethod(method53);
        java.lang.reflect.Method method55 = propertyDescriptor52.getWriteMethod();
        java.lang.reflect.Method method56 = propertyDescriptor52.getWriteMethod();
        propertyDescriptor52.setName("(III)I");
        java.lang.String str59 = propertyDescriptor52.getName();
        java.lang.Object obj61 = propertyDescriptor52.getValue("java.beans.PropertyDescriptor[name=<init>; values={hi!=F}]");
        propertyDescriptor52.setDisplayName("Ljava/lang/Object;");
        boolean boolean64 = signature47.equals((java.lang.Object) "Ljava/lang/Object;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor52", propertyDescriptor3.equals(propertyDescriptor52) ? propertyDescriptor3.hashCode() == propertyDescriptor52.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        int int13 = type11.getOpcode(1041);
        org.mockito.asm.Type type14 = type11.getElementType();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("int", method16, method17);
        org.mockito.cglib.proxy.Mixin.Generator generator20 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor18.setValue("", (java.lang.Object) generator20);
        generator20.setStyle((int) (byte) 1);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy31 = generator29.getStrategy();
        java.lang.Object[] objArray34 = new java.lang.Object[] { generator29, 7, 6 };
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray34);
        org.mockito.cglib.proxy.Mixin mixin36 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray35);
        generator20.setClasses(classArray35);
        java.lang.Class<?> wildcardClass38 = generator20.getClass();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("int", method40, method41);
        org.mockito.cglib.proxy.Mixin.Generator generator44 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor42.setValue("", (java.lang.Object) generator44);
        boolean boolean46 = generator44.getUseCache();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str51 = type50.getClassName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type49, type50, type52 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray53);
        java.lang.Class[] classArray55 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray53);
        generator44.setDelegates((java.lang.Object[]) classArray55);
        java.lang.reflect.Constructor constructor57 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass38, classArray55);
        java.lang.String str58 = org.mockito.asm.Type.getConstructorDescriptor(constructor57);
        org.mockito.cglib.core.MethodInfo methodInfo60 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor57, 3);
        org.mockito.cglib.core.Signature signature61 = methodInfo60.getSignature();
        org.mockito.cglib.core.Signature signature62 = methodInfo60.getSignature();
        org.mockito.asm.Type[] typeArray63 = methodInfo60.getExceptionTypes();
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray63);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str66 = type65.getClassName();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str69 = type68.getClassName();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type67, type68, type70 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type65, typeArray71);
        java.lang.Class<?> wildcardClass73 = typeArray71.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass73);
        org.mockito.cglib.core.ClassInfo classInfo75 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass73);
        java.lang.String str76 = classInfo75.toString();
        java.lang.reflect.Method method78 = null;
        java.lang.reflect.Method method79 = null;
        java.beans.PropertyDescriptor propertyDescriptor80 = new java.beans.PropertyDescriptor("int", method78, method79);
        java.lang.reflect.Method method81 = null;
        propertyDescriptor80.setReadMethod(method81);
        java.lang.reflect.Method method83 = propertyDescriptor80.getWriteMethod();
        propertyDescriptor80.setName("(III)I");
        java.lang.reflect.Method method86 = propertyDescriptor80.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration87 = propertyDescriptor80.attributeNames();
        boolean boolean88 = classInfo75.equals((java.lang.Object) strEnumeration87);
        org.mockito.asm.Type type89 = classInfo75.getSuperType();
        boolean boolean90 = type14.equals((java.lang.Object) type89);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor80", propertyDescriptor18.equals(propertyDescriptor80) ? propertyDescriptor18.hashCode() == propertyDescriptor80.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.lang.String str11 = classInfo10.toString();
        org.mockito.asm.Type type12 = classInfo10.getSuperType();
        org.mockito.asm.Type[] typeArray13 = classInfo10.getInterfaces();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type16, type17, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray20);
        java.lang.Class<?> wildcardClass22 = typeArray20.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        int int25 = type23.getOpcode(1);
        java.lang.String str26 = type23.getInternalName();
        boolean boolean27 = classInfo10.equals((java.lang.Object) str26);
        java.lang.String str28 = classInfo10.toString();
        boolean boolean30 = classInfo10.equals((java.lang.Object) "org.mockito.cglib.proxy.Mixin$Generator");
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("int", method32, method33);
        java.lang.reflect.Method method35 = null;
        propertyDescriptor34.setReadMethod(method35);
        java.lang.reflect.Method method37 = propertyDescriptor34.getWriteMethod();
        java.lang.reflect.Method method38 = null;
        propertyDescriptor34.setReadMethod(method38);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("int", method41, method42);
        java.lang.reflect.Method method44 = null;
        propertyDescriptor43.setReadMethod(method44);
        java.lang.reflect.Method method46 = propertyDescriptor43.getWriteMethod();
        java.lang.reflect.Method method47 = propertyDescriptor43.getWriteMethod();
        propertyDescriptor43.setName("(III)I");
        java.beans.PropertyEditor propertyEditor50 = propertyDescriptor34.createPropertyEditor((java.lang.Object) propertyDescriptor43);
        java.util.Enumeration<java.lang.String> strEnumeration51 = propertyDescriptor43.attributeNames();
        boolean boolean52 = classInfo10.equals((java.lang.Object) strEnumeration51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor34 and propertyDescriptor43", propertyDescriptor34.equals(propertyDescriptor43) ? propertyDescriptor34.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(III)I");
        boolean boolean3 = type0.equals((java.lang.Object) "(III)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        propertyDescriptor3.setValue("hi!", (java.lang.Object) type9);
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setShortDescription("(III)I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.lang.String str26 = classInfo25.toString();
        org.mockito.asm.Type type27 = classInfo25.getSuperType();
        propertyDescriptor3.setValue("I", (java.lang.Object) classInfo25);
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("int", method30, method31);
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor32.setValue("", (java.lang.Object) generator34);
        generator34.setStyle((int) (byte) 1);
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("int", method39, method40);
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor41.setValue("", (java.lang.Object) generator43);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator43.getStrategy();
        java.lang.Object[] objArray48 = new java.lang.Object[] { generator43, 7, 6 };
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray48);
        org.mockito.cglib.proxy.Mixin mixin50 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray49);
        generator34.setClasses(classArray49);
        java.lang.Class<?> wildcardClass52 = generator34.getClass();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("int", method54, method55);
        org.mockito.cglib.proxy.Mixin.Generator generator58 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor56.setValue("", (java.lang.Object) generator58);
        boolean boolean60 = generator58.getUseCache();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str62 = type61.getClassName();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type63, type64, type66 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray67);
        java.lang.Class[] classArray69 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray67);
        generator58.setDelegates((java.lang.Object[]) classArray69);
        java.lang.reflect.Constructor constructor71 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass52, classArray69);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor71);
        java.lang.String str74 = org.mockito.asm.Type.getConstructorDescriptor(constructor71);
        org.mockito.cglib.core.MethodInfo methodInfo75 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor71);
        java.lang.String str76 = org.mockito.asm.Type.getConstructorDescriptor(constructor71);
        org.mockito.cglib.core.MethodInfo methodInfo77 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor71);
        boolean boolean78 = classInfo25.equals((java.lang.Object) methodInfo77);
        org.mockito.asm.Type type79 = classInfo25.getSuperType();
        int int80 = classInfo25.getModifiers();
        org.mockito.asm.Type type81 = classInfo25.getType();
        java.lang.reflect.Method method83 = null;
        java.lang.reflect.Method method84 = null;
        java.beans.PropertyDescriptor propertyDescriptor85 = new java.beans.PropertyDescriptor("hi!", method83, method84);
        boolean boolean86 = classInfo25.equals((java.lang.Object) method83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor85", propertyDescriptor3.equals(propertyDescriptor85) ? propertyDescriptor3.hashCode() == propertyDescriptor85.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo47 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 12);
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(III)I]", method49, method50);
        java.util.Enumeration<java.lang.String> strEnumeration52 = propertyDescriptor51.attributeNames();
        java.lang.reflect.Method method53 = propertyDescriptor51.getWriteMethod();
        boolean boolean54 = methodInfo47.equals((java.lang.Object) method53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(III)I");
        boolean boolean3 = type0.equals((java.lang.Object) "(III)I");
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(III)I");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("I", (java.lang.Object) propertyDescriptorArray17);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj22 = propertyDescriptor3.getValue("");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String str26 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor31.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor31.getWriteMethod();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor31.setReadMethod(method35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor40.setReadMethod(method41);
        java.lang.reflect.Method method43 = propertyDescriptor40.getWriteMethod();
        java.lang.reflect.Method method44 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setName("(III)I");
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.reflect.Method method50 = null;
        propertyDescriptor3.setWriteMethod(method50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor40", propertyDescriptor31.equals(propertyDescriptor40) ? propertyDescriptor31.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.lang.String str11 = classInfo10.toString();
        org.mockito.asm.Type type12 = classInfo10.getSuperType();
        org.mockito.asm.Type[] typeArray13 = classInfo10.getInterfaces();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type16, type17, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray20);
        java.lang.Class<?> wildcardClass22 = typeArray20.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        int int25 = type23.getOpcode(1);
        java.lang.String str26 = type23.getInternalName();
        boolean boolean27 = classInfo10.equals((java.lang.Object) str26);
        org.mockito.asm.Type type28 = classInfo10.getSuperType();
        org.mockito.asm.Type type29 = classInfo10.getType();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("int", method31, method32);
        org.mockito.cglib.proxy.Mixin.Generator generator35 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor33.setValue("", (java.lang.Object) generator35);
        java.lang.reflect.Method method37 = null;
        propertyDescriptor33.setReadMethod(method37);
        boolean boolean39 = propertyDescriptor33.isHidden();
        propertyDescriptor33.setName("java.beans.PropertyDescriptor[name=int; bound]");
        boolean boolean42 = type29.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=int; bound]");
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=int; values={hi!=F}]");
        int int46 = type44.getOpcode(5);
        java.lang.String str47 = type44.getDescriptor();
        int int49 = type44.getOpcode(0);
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        org.mockito.cglib.proxy.Mixin.Generator generator55 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor53.setValue("", (java.lang.Object) generator55);
        generator55.setStyle((int) (byte) 1);
        java.lang.reflect.Method method60 = null;
        java.lang.reflect.Method method61 = null;
        java.beans.PropertyDescriptor propertyDescriptor62 = new java.beans.PropertyDescriptor("int", method60, method61);
        org.mockito.cglib.proxy.Mixin.Generator generator64 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor62.setValue("", (java.lang.Object) generator64);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = generator64.getStrategy();
        java.lang.Object[] objArray69 = new java.lang.Object[] { generator64, 7, 6 };
        java.lang.Class[] classArray70 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray69);
        org.mockito.cglib.proxy.Mixin mixin71 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray70);
        generator55.setClasses(classArray70);
        java.lang.Class<?> wildcardClass73 = generator55.getClass();
        java.lang.reflect.Method method75 = null;
        java.lang.reflect.Method method76 = null;
        java.beans.PropertyDescriptor propertyDescriptor77 = new java.beans.PropertyDescriptor("int", method75, method76);
        org.mockito.cglib.proxy.Mixin.Generator generator79 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor77.setValue("", (java.lang.Object) generator79);
        boolean boolean81 = generator79.getUseCache();
        org.mockito.asm.Type type82 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str83 = type82.getClassName();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type85 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str86 = type85.getClassName();
        org.mockito.asm.Type type87 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray88 = new org.mockito.asm.Type[] { type84, type85, type87 };
        java.lang.String str89 = org.mockito.asm.Type.getMethodDescriptor(type82, typeArray88);
        java.lang.Class[] classArray90 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray88);
        generator79.setDelegates((java.lang.Object[]) classArray90);
        java.lang.reflect.Constructor constructor92 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass73, classArray90);
        org.mockito.asm.Type[] typeArray93 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor92);
        java.lang.String str94 = org.mockito.asm.Type.getConstructorDescriptor(constructor92);
        org.mockito.cglib.core.MethodInfo methodInfo95 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor92);
        java.lang.String str96 = methodInfo95.toString();
        org.mockito.asm.Type[] typeArray97 = methodInfo95.getExceptionTypes();
        java.lang.String str98 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray97);
        java.lang.String str99 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor33 and propertyDescriptor53", propertyDescriptor33.equals(propertyDescriptor53) ? propertyDescriptor33.hashCode() == propertyDescriptor53.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setReadMethod(method7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor12.setReadMethod(method13);
        java.lang.reflect.Method method15 = propertyDescriptor12.getWriteMethod();
        java.lang.reflect.Method method16 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setName("(III)I");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        propertyDescriptor3.setShortDescription("V");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("int", method24, method25);
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor26.setValue("", (java.lang.Object) generator28);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = generator28.getNamingPolicy();
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = generator28.getNamingPolicy();
        propertyDescriptor3.setValue("()L<init>()V;", (java.lang.Object) namingPolicy31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor26", propertyDescriptor12.equals(propertyDescriptor26) ? propertyDescriptor12.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        java.lang.String str47 = signature46.getName();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("int", method49, method50);
        org.mockito.cglib.proxy.Mixin.Generator generator53 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor51.setValue("", (java.lang.Object) generator53);
        java.lang.reflect.Method method55 = null;
        propertyDescriptor51.setReadMethod(method55);
        boolean boolean57 = propertyDescriptor51.isHidden();
        propertyDescriptor51.setExpert(false);
        java.lang.String str60 = propertyDescriptor51.getShortDescription();
        propertyDescriptor51.setName("(III)I");
        java.util.Enumeration<java.lang.String> strEnumeration63 = propertyDescriptor51.attributeNames();
        propertyDescriptor51.setValue("intint", (java.lang.Object) (byte) 100);
        java.lang.String str67 = propertyDescriptor51.getShortDescription();
        boolean boolean68 = signature46.equals((java.lang.Object) str67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        int int8 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        org.mockito.asm.Type type10 = signature2.getReturnType();
        java.lang.String str11 = signature2.getDescriptor();
        java.lang.String str12 = signature2.toString();
        org.mockito.asm.Type type13 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type13.getInternalName();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        int int12 = classInfo10.getModifiers();
        org.mockito.asm.Type type13 = classInfo10.getType();
        org.mockito.asm.Type type14 = classInfo10.getType();
        org.mockito.asm.Type[] typeArray15 = classInfo10.getInterfaces();
        java.lang.String str16 = classInfo10.toString();
        int int17 = classInfo10.getModifiers();
        org.mockito.asm.Type type18 = classInfo10.getType();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("int", method20, method21);
        org.mockito.cglib.proxy.Mixin.Generator generator24 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor22.setValue("", (java.lang.Object) generator24);
        java.lang.reflect.Method method26 = null;
        propertyDescriptor22.setReadMethod(method26);
        boolean boolean28 = propertyDescriptor22.isHidden();
        propertyDescriptor22.setShortDescription("hi!");
        java.lang.String str31 = propertyDescriptor22.getShortDescription();
        java.lang.Object obj33 = propertyDescriptor22.getValue("()L<init>()V;");
        propertyDescriptor22.setName("Lava.beans.PropertyDescriptor[name=int;");
        java.lang.String str36 = propertyDescriptor22.getDisplayName();
        boolean boolean37 = classInfo10.equals((java.lang.Object) propertyDescriptor22);
        org.mockito.cglib.proxy.Mixin.Generator generator38 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator38.setAttemptLoad(false);
        generator38.setUseCache(false);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("int", method44, method45);
        org.mockito.cglib.proxy.Mixin.Generator generator48 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor46.setValue("", (java.lang.Object) generator48);
        boolean boolean50 = generator48.getUseCache();
        java.lang.ClassLoader classLoader51 = null;
        generator48.setClassLoader(classLoader51);
        generator48.setUseCache(false);
        generator48.setAttemptLoad(false);
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("int", method58, method59);
        org.mockito.cglib.proxy.Mixin.Generator generator62 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor60.setValue("", (java.lang.Object) generator62);
        generator62.setStyle((int) (byte) 1);
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("int", method67, method68);
        org.mockito.cglib.proxy.Mixin.Generator generator71 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor69.setValue("", (java.lang.Object) generator71);
        org.mockito.cglib.core.NamingPolicy namingPolicy73 = generator71.getNamingPolicy();
        generator62.setNamingPolicy(namingPolicy73);
        generator48.setNamingPolicy(namingPolicy73);
        generator38.setNamingPolicy(namingPolicy73);
        java.lang.Class[] classArray77 = new java.lang.Class[] {};
        java.lang.String[] strArray78 = org.mockito.cglib.core.ReflectUtils.getNames(classArray77);
        generator38.setClasses(classArray77);
        boolean boolean80 = generator38.getUseCache();
        boolean boolean81 = classInfo10.equals((java.lang.Object) boolean80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor46", propertyDescriptor22.equals(propertyDescriptor46) ? propertyDescriptor22.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray44 = classInfo43.getInterfaces();
        java.lang.String str45 = classInfo43.toString();
        org.mockito.asm.Type[] typeArray46 = classInfo43.getInterfaces();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("int", method48, method49);
        org.mockito.cglib.proxy.Mixin.Generator generator52 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor50.setValue("", (java.lang.Object) generator52);
        generator52.setStyle((int) (byte) 1);
        generator52.setUseCache(true);
        boolean boolean58 = generator52.getUseCache();
        org.mockito.cglib.core.NamingPolicy namingPolicy59 = generator52.getNamingPolicy();
        generator52.setAttemptLoad(true);
        boolean boolean62 = generator52.getUseCache();
        boolean boolean63 = classInfo43.equals((java.lang.Object) generator52);
        org.mockito.asm.Type type64 = classInfo43.getType();
        org.mockito.asm.Type type65 = classInfo43.getType();
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("int", method67, method68);
        org.mockito.cglib.proxy.Mixin.Generator generator71 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor69.setValue("", (java.lang.Object) generator71);
        java.lang.reflect.Method method73 = null;
        propertyDescriptor69.setReadMethod(method73);
        boolean boolean75 = propertyDescriptor69.isHidden();
        propertyDescriptor69.setShortDescription("hi!");
        java.lang.String str78 = propertyDescriptor69.getShortDescription();
        java.lang.Object obj80 = propertyDescriptor69.getValue("()L<init>()V;");
        propertyDescriptor69.setName("Lava.beans.PropertyDescriptor[name=int;");
        java.lang.String str83 = propertyDescriptor69.getDisplayName();
        boolean boolean84 = propertyDescriptor69.isHidden();
        boolean boolean85 = classInfo43.equals((java.lang.Object) boolean84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor69", propertyDescriptor3.equals(propertyDescriptor69) ? propertyDescriptor3.hashCode() == propertyDescriptor69.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()V");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (short) 1);
        org.mockito.asm.Type[] typeArray19 = classInfo16.getInterfaces();
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type1.getDimensions();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type3, type4, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        int int17 = type9.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        java.lang.Class[] classArray26 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type1, typeArray24);
        int int30 = type1.getOpcode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type1.getInternalName();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setReadMethod(method7);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        java.lang.reflect.Method method13 = null;
        propertyDescriptor12.setReadMethod(method13);
        java.lang.reflect.Method method15 = propertyDescriptor12.getWriteMethod();
        java.lang.reflect.Method method16 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setName("(III)I");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str24 = signature23.getName();
        org.mockito.asm.Type[] typeArray25 = signature23.getArgumentTypes();
        propertyDescriptor12.setValue("Lorg/mockito/cglib/proxy/Mixin$Generator;", (java.lang.Object) typeArray25);
        org.mockito.cglib.proxy.Mixin mixin27 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) typeArray25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor12", propertyDescriptor3.equals(propertyDescriptor12) ? propertyDescriptor3.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type13, type14, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray17);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray17);
        java.lang.String str21 = type10.getInternalName();
        java.lang.String str22 = type10.getInternalName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        boolean boolean24 = type10.equals((java.lang.Object) type23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type23.getDimensions();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        int int12 = classInfo10.getModifiers();
        org.mockito.asm.Type type13 = classInfo10.getType();
        org.mockito.asm.Type type14 = classInfo10.getType();
        org.mockito.asm.Type[] typeArray15 = classInfo10.getInterfaces();
        java.lang.String str16 = classInfo10.toString();
        int int17 = classInfo10.getModifiers();
        org.mockito.asm.Type type18 = classInfo10.getType();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("int", method20, method21);
        org.mockito.cglib.proxy.Mixin.Generator generator24 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor22.setValue("", (java.lang.Object) generator24);
        java.lang.reflect.Method method26 = null;
        propertyDescriptor22.setReadMethod(method26);
        boolean boolean28 = propertyDescriptor22.isHidden();
        propertyDescriptor22.setShortDescription("hi!");
        java.lang.String str31 = propertyDescriptor22.getShortDescription();
        java.lang.Object obj33 = propertyDescriptor22.getValue("()L<init>()V;");
        propertyDescriptor22.setName("Lava.beans.PropertyDescriptor[name=int;");
        java.lang.String str36 = propertyDescriptor22.getDisplayName();
        boolean boolean37 = classInfo10.equals((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("int", method39, method40);
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor41.setValue("", (java.lang.Object) generator43);
        generator43.setStyle((int) (byte) 1);
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("int", method48, method49);
        org.mockito.cglib.proxy.Mixin.Generator generator52 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor50.setValue("", (java.lang.Object) generator52);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = generator52.getStrategy();
        java.lang.Object[] objArray57 = new java.lang.Object[] { generator52, 7, 6 };
        java.lang.Class[] classArray58 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray57);
        org.mockito.cglib.proxy.Mixin mixin59 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray58);
        generator43.setClasses(classArray58);
        java.lang.Class<?> wildcardClass61 = generator43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass61);
        boolean boolean63 = classInfo10.equals((java.lang.Object) wildcardClass61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor41", propertyDescriptor22.equals(propertyDescriptor41) ? propertyDescriptor22.hashCode() == propertyDescriptor41.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        org.mockito.asm.Type type10 = signature2.getReturnType();
        java.lang.String str11 = signature2.getDescriptor();
        java.lang.String str12 = signature2.toString();
        org.mockito.asm.Type type13 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type13.getDimensions();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo46 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        java.lang.String str47 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 1);
        org.mockito.cglib.core.Signature signature50 = methodInfo49.getSignature();
        org.mockito.cglib.core.ClassInfo classInfo51 = methodInfo49.getClassInfo();
        java.lang.String str52 = classInfo51.toString();
        java.lang.String str53 = classInfo51.toString();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("int", method55, method56);
        org.mockito.cglib.proxy.Mixin.Generator generator59 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor57.setValue("", (java.lang.Object) generator59);
        java.lang.String str61 = propertyDescriptor57.getShortDescription();
        java.lang.String str62 = propertyDescriptor57.getName();
        propertyDescriptor57.setBound(false);
        propertyDescriptor57.setShortDescription("int(III)I");
        propertyDescriptor57.setDisplayName("org/mockito/cglib/proxy/Mixin$Generator");
        propertyDescriptor57.setName("org/mockito/asm/Type");
        boolean boolean71 = classInfo51.equals((java.lang.Object) "org/mockito/asm/Type");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type[] typeArray8 = signature2.getArgumentTypes();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        org.mockito.asm.Type type10 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type10.getElementType();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.lang.String str11 = classInfo10.toString();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("int", method13, method14);
        java.lang.reflect.Method method16 = null;
        propertyDescriptor15.setReadMethod(method16);
        java.lang.reflect.Method method18 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setName("(III)I");
        java.lang.reflect.Method method21 = propertyDescriptor15.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor15.attributeNames();
        boolean boolean23 = classInfo10.equals((java.lang.Object) strEnumeration22);
        org.mockito.asm.Type type24 = classInfo10.getType();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("int", method26, method27);
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor28.setValue("", (java.lang.Object) generator30);
        generator30.setStyle((int) (byte) 1);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("int", method35, method36);
        org.mockito.cglib.proxy.Mixin.Generator generator39 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor37.setValue("", (java.lang.Object) generator39);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy41 = generator39.getStrategy();
        java.lang.Object[] objArray44 = new java.lang.Object[] { generator39, 7, 6 };
        java.lang.Class[] classArray45 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray44);
        org.mockito.cglib.proxy.Mixin mixin46 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray45);
        generator30.setClasses(classArray45);
        java.lang.Class<?> wildcardClass48 = generator30.getClass();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("int", method50, method51);
        org.mockito.cglib.proxy.Mixin.Generator generator54 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor52.setValue("", (java.lang.Object) generator54);
        boolean boolean56 = generator54.getUseCache();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str61 = type60.getClassName();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type59, type60, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray63);
        java.lang.Class[] classArray65 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray63);
        generator54.setDelegates((java.lang.Object[]) classArray65);
        java.lang.reflect.Constructor constructor67 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass48, classArray65);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor67);
        java.lang.String str70 = org.mockito.asm.Type.getConstructorDescriptor(constructor67);
        org.mockito.cglib.core.Signature signature71 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor67);
        java.lang.String str72 = org.mockito.asm.Type.getConstructorDescriptor(constructor67);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor67);
        java.lang.Class[] classArray74 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor28", propertyDescriptor15.equals(propertyDescriptor28) ? propertyDescriptor15.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("I", (java.lang.Object) propertyDescriptorArray17);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj22 = propertyDescriptor3.getValue("");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String str26 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor31.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor31.getWriteMethod();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor31.setReadMethod(method35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor40.setReadMethod(method41);
        java.lang.reflect.Method method43 = propertyDescriptor40.getWriteMethod();
        java.lang.reflect.Method method44 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setName("(III)I");
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.Class<?> wildcardClass50 = propertyDescriptor31.getPropertyType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor40", propertyDescriptor3.equals(propertyDescriptor40) ? propertyDescriptor3.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(III)I]");
        int int3 = type1.getOpcode(12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("Lava.beans.PropertyDescriptor[name=int;");
        java.lang.String str3 = type2.getInternalName();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("int", method5, method6);
        org.mockito.cglib.proxy.Mixin.Generator generator9 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor7.setValue("", (java.lang.Object) generator9);
        generator9.setStyle((int) (byte) 1);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("int", method14, method15);
        org.mockito.cglib.proxy.Mixin.Generator generator18 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor16.setValue("", (java.lang.Object) generator18);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = generator18.getStrategy();
        java.lang.Object[] objArray23 = new java.lang.Object[] { generator18, 7, 6 };
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray23);
        org.mockito.cglib.proxy.Mixin mixin25 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray24);
        generator9.setClasses(classArray24);
        java.lang.Class<?> wildcardClass27 = generator9.getClass();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor31.setValue("", (java.lang.Object) generator33);
        boolean boolean35 = generator33.getUseCache();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type38, type39, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray42);
        generator33.setDelegates((java.lang.Object[]) classArray44);
        java.lang.reflect.Constructor constructor46 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass27, classArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor46);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor46, (int) (short) 1);
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor46);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor46);
        int int52 = methodInfo51.getModifiers();
        org.mockito.asm.Type[] typeArray53 = methodInfo51.getExceptionTypes();
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/ReflectUtils$3;", type2, typeArray53);
        java.lang.String str55 = signature54.getName();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("int", method57, method58);
        java.lang.reflect.Method method60 = null;
        propertyDescriptor59.setReadMethod(method60);
        java.lang.reflect.Method method62 = propertyDescriptor59.getWriteMethod();
        propertyDescriptor59.setName("(III)I");
        propertyDescriptor59.setExpert(false);
        java.lang.Object obj68 = propertyDescriptor59.getValue("Lorg/mockito/cglib/proxy/Mixin$Generator;");
        boolean boolean69 = signature54.equals(obj68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor59", propertyDescriptor7.equals(propertyDescriptor59) ? propertyDescriptor7.hashCode() == propertyDescriptor59.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        propertyDescriptor3.setExpert(true);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("org.mockito.asm.Type[]");
        java.lang.String str12 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setPreferred(true);
        boolean boolean15 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("int", method17, method18);
        java.lang.reflect.Method method20 = null;
        propertyDescriptor19.setReadMethod(method20);
        propertyDescriptor19.setExpert(false);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        propertyDescriptor19.setValue("hi!", (java.lang.Object) type25);
        boolean boolean27 = propertyDescriptor19.isPreferred();
        propertyDescriptor19.setShortDescription("Lorg/mockito/cglib/proxy/Mixin$Generator;");
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("int", method31, method32);
        java.lang.reflect.Method method34 = null;
        propertyDescriptor33.setReadMethod(method34);
        java.lang.reflect.Method method36 = propertyDescriptor33.getWriteMethod();
        propertyDescriptor33.setName("(III)I");
        java.lang.reflect.Method method39 = propertyDescriptor33.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration40 = propertyDescriptor33.attributeNames();
        java.beans.PropertyEditor propertyEditor41 = propertyDescriptor19.createPropertyEditor((java.lang.Object) strEnumeration40);
        boolean boolean42 = propertyDescriptor3.equals((java.lang.Object) strEnumeration40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor33", propertyDescriptor19.equals(propertyDescriptor33) ? propertyDescriptor19.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int6 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int3 = type1.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str44 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo47 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 3);
        org.mockito.asm.Type[] typeArray48 = methodInfo47.getExceptionTypes();
        java.lang.String str49 = methodInfo47.toString();
        org.mockito.cglib.core.Signature signature50 = methodInfo47.getSignature();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("java/util/Collections$EmptyEnumeration", method52, method53);
        java.lang.Class<?> wildcardClass55 = propertyDescriptor54.getPropertyType();
        boolean boolean56 = methodInfo47.equals((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor54", propertyDescriptor3.equals(propertyDescriptor54) ? propertyDescriptor3.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        int int11 = type9.getOpcode(1);
        java.lang.String str12 = type9.getInternalName();
        java.lang.String str13 = type9.getClassName();
        int int14 = type9.getDimensions();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        int int17 = type15.getOpcode((-1));
        boolean boolean18 = type9.equals((java.lang.Object) type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type15.getDimensions();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.String str6 = signature2.getDescriptor();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        int int8 = type7.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type7.getDimensions();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        java.lang.String str43 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 3);
        org.mockito.cglib.core.Signature signature46 = methodInfo45.getSignature();
        org.mockito.cglib.core.ClassInfo classInfo47 = methodInfo45.getClassInfo();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("int", method49, method50);
        java.lang.reflect.Method method52 = null;
        propertyDescriptor51.setReadMethod(method52);
        java.lang.reflect.Method method54 = propertyDescriptor51.getWriteMethod();
        propertyDescriptor51.setName("(III)I");
        java.lang.reflect.Method method57 = propertyDescriptor51.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration58 = propertyDescriptor51.attributeNames();
        java.lang.Class<?> wildcardClass59 = strEnumeration58.getClass();
        java.lang.String str60 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        java.lang.Object obj61 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass59);
        boolean boolean63 = methodInfo45.equals((java.lang.Object) propertyDescriptorArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(1053);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        propertyDescriptor3.setExpert(false);
        java.lang.Object obj12 = propertyDescriptor3.getValue("Lorg/mockito/cglib/proxy/Mixin$Generator;");
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method15 = null;
        propertyDescriptor3.setWriteMethod(method15);
        boolean boolean17 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("int", method20, method21);
        org.mockito.cglib.proxy.Mixin.Generator generator24 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor22.setValue("", (java.lang.Object) generator24);
        java.lang.Class<?> wildcardClass26 = generator24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass26);
        propertyDescriptor3.setValue("java.lang.reflect.Method[]", (java.lang.Object) wildcardClass26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray35);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) strArray38);
        java.lang.reflect.Constructor constructor40 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass26, classArray39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo46 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 4);
        org.mockito.cglib.core.ClassInfo classInfo49 = methodInfo48.getClassInfo();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        java.lang.reflect.Method method54 = null;
        propertyDescriptor53.setReadMethod(method54);
        java.lang.reflect.Method method56 = propertyDescriptor53.getWriteMethod();
        java.lang.reflect.Method method57 = propertyDescriptor53.getWriteMethod();
        propertyDescriptor53.setName("(III)I");
        java.lang.Class<?> wildcardClass60 = propertyDescriptor53.getPropertyEditorClass();
        propertyDescriptor53.setPreferred(true);
        java.lang.Class<?> wildcardClass63 = propertyDescriptor53.getPropertyEditorClass();
        java.lang.String str64 = propertyDescriptor53.getName();
        java.lang.String str65 = propertyDescriptor53.getName();
        boolean boolean66 = methodInfo48.equals((java.lang.Object) str65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor53", propertyDescriptor3.equals(propertyDescriptor53) ? propertyDescriptor3.hashCode() == propertyDescriptor53.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        boolean boolean7 = generator5.getUseCache();
        java.lang.ClassLoader classLoader8 = null;
        generator5.setClassLoader(classLoader8);
        generator5.setUseCache(false);
        generator5.setAttemptLoad(false);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("int", method15, method16);
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor17.setValue("", (java.lang.Object) generator19);
        generator19.setStyle((int) (byte) 1);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("int", method24, method25);
        org.mockito.cglib.proxy.Mixin.Generator generator28 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor26.setValue("", (java.lang.Object) generator28);
        org.mockito.cglib.core.NamingPolicy namingPolicy30 = generator28.getNamingPolicy();
        generator19.setNamingPolicy(namingPolicy30);
        generator5.setNamingPolicy(namingPolicy30);
        generator5.setUseCache(true);
        java.lang.ClassLoader classLoader35 = null;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str40 = type39.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type38, type39, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray42);
        org.mockito.cglib.proxy.Mixin mixin45 = org.mockito.cglib.proxy.Mixin.createBean(classLoader35, (java.lang.Object[]) typeArray42);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray42);
        generator5.setClasses(classArray46);
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("int", method49, method50);
        java.lang.reflect.Method method52 = null;
        propertyDescriptor51.setReadMethod(method52);
        java.lang.reflect.Method method54 = propertyDescriptor51.getWriteMethod();
        propertyDescriptor51.setName("(III)I");
        java.lang.reflect.Method method57 = propertyDescriptor51.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration58 = propertyDescriptor51.attributeNames();
        java.lang.Class<?> wildcardClass59 = strEnumeration58.getClass();
        java.lang.String str60 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass59);
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        java.lang.String str63 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass59);
        java.lang.Class[] classArray65 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) propertyDescriptorArray64);
        generator5.setClasses(classArray65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("I", (java.lang.Object) propertyDescriptorArray17);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj22 = propertyDescriptor3.getValue("");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String str26 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor31.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor31.getWriteMethod();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor31.setReadMethod(method35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor40.setReadMethod(method41);
        java.lang.reflect.Method method43 = propertyDescriptor40.getWriteMethod();
        java.lang.reflect.Method method44 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setName("(III)I");
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.Object obj51 = propertyDescriptor31.getValue("Lva/lang/Object;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor40", propertyDescriptor3.equals(propertyDescriptor40) ? propertyDescriptor3.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Lva/lang/Object;", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str8 = type7.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type6, type7, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        java.lang.Class<?> wildcardClass12 = typeArray10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass12);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("int", method20, method21);
        org.mockito.cglib.proxy.Mixin.Generator generator24 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor22.setValue("", (java.lang.Object) generator24);
        generator24.setStyle((int) (byte) 1);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor31.setValue("", (java.lang.Object) generator33);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator33.getStrategy();
        java.lang.Object[] objArray38 = new java.lang.Object[] { generator33, 7, 6 };
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray38);
        org.mockito.cglib.proxy.Mixin mixin40 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray39);
        generator24.setClasses(classArray39);
        java.lang.Class<?> wildcardClass42 = generator24.getClass();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("int", method44, method45);
        org.mockito.cglib.proxy.Mixin.Generator generator48 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor46.setValue("", (java.lang.Object) generator48);
        boolean boolean50 = generator48.getUseCache();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type53, type54, type56 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray57);
        java.lang.Class[] classArray59 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray57);
        generator48.setDelegates((java.lang.Object[]) classArray59);
        java.lang.reflect.Constructor constructor61 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass42, classArray59);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor61);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor61);
        java.lang.String str64 = org.mockito.asm.Type.getConstructorDescriptor(constructor61);
        org.mockito.cglib.core.MethodInfo methodInfo65 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor61);
        java.lang.String str66 = org.mockito.asm.Type.getConstructorDescriptor(constructor61);
        org.mockito.cglib.core.MethodInfo methodInfo67 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor61);
        org.mockito.cglib.core.MethodInfo methodInfo69 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor61, 5);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor61);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor61);
        java.beans.PropertyEditor propertyEditor72 = propertyDescriptor3.createPropertyEditor((java.lang.Object) constructor61);
        org.mockito.cglib.core.MethodInfo methodInfo73 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("[Lorg/mockito/asm/Type;", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method5 = propertyDescriptor3.getReadMethod();
        boolean boolean6 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("int", method9, method10);
        org.mockito.cglib.proxy.Mixin.Generator generator13 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor11.setValue("", (java.lang.Object) generator13);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("int", method16, method17);
        java.lang.reflect.Method method19 = null;
        propertyDescriptor18.setReadMethod(method19);
        java.lang.reflect.Method method21 = propertyDescriptor18.getWriteMethod();
        java.lang.reflect.Method method22 = propertyDescriptor18.getReadMethod();
        propertyDescriptor18.setShortDescription("");
        java.beans.PropertyEditor propertyEditor25 = propertyDescriptor11.createPropertyEditor((java.lang.Object) "");
        propertyDescriptor11.setConstrained(true);
        boolean boolean28 = propertyDescriptor11.isExpert();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("int", method30, method31);
        org.mockito.cglib.proxy.Mixin.Generator generator34 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor32.setValue("", (java.lang.Object) generator34);
        java.lang.ClassLoader classLoader36 = null;
        generator34.setClassLoader(classLoader36);
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("int", method39, method40);
        org.mockito.cglib.proxy.Mixin.Generator generator43 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor41.setValue("", (java.lang.Object) generator43);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy45 = generator43.getStrategy();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("int", method47, method48);
        org.mockito.cglib.proxy.Mixin.Generator generator51 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor49.setValue("", (java.lang.Object) generator51);
        org.mockito.cglib.core.NamingPolicy namingPolicy53 = generator51.getNamingPolicy();
        generator43.setNamingPolicy(namingPolicy53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator43.getNamingPolicy();
        generator34.setNamingPolicy(namingPolicy55);
        org.mockito.cglib.core.NamingPolicy namingPolicy57 = generator34.getNamingPolicy();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("int", method59, method60);
        org.mockito.cglib.proxy.Mixin.Generator generator63 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor61.setValue("", (java.lang.Object) generator63);
        org.mockito.cglib.core.NamingPolicy namingPolicy65 = generator63.getNamingPolicy();
        java.lang.ClassLoader classLoader66 = null;
        generator63.setClassLoader(classLoader66);
        java.lang.ClassLoader classLoader68 = null;
        generator63.setClassLoader(classLoader68);
        java.lang.reflect.Method method71 = null;
        java.lang.reflect.Method method72 = null;
        java.beans.PropertyDescriptor propertyDescriptor73 = new java.beans.PropertyDescriptor("int", method71, method72);
        org.mockito.cglib.proxy.Mixin.Generator generator75 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor73.setValue("", (java.lang.Object) generator75);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy77 = generator75.getStrategy();
        java.lang.reflect.Method method79 = null;
        java.lang.reflect.Method method80 = null;
        java.beans.PropertyDescriptor propertyDescriptor81 = new java.beans.PropertyDescriptor("int", method79, method80);
        org.mockito.cglib.proxy.Mixin.Generator generator83 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor81.setValue("", (java.lang.Object) generator83);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy85 = generator83.getStrategy();
        generator75.setStrategy(generatorStrategy85);
        generator63.setStrategy(generatorStrategy85);
        generator34.setStrategy(generatorStrategy85);
        java.beans.PropertyEditor propertyEditor89 = propertyDescriptor11.createPropertyEditor((java.lang.Object) generator34);
        propertyDescriptor11.setHidden(true);
        java.lang.Object obj93 = propertyDescriptor11.getValue("(III)V");
        java.util.Enumeration<java.lang.String> strEnumeration94 = propertyDescriptor11.attributeNames();
        boolean boolean95 = propertyDescriptor11.isExpert();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor11);
        boolean boolean97 = propertyDescriptor11.isExpert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor18", propertyDescriptor3.equals(propertyDescriptor18) ? propertyDescriptor3.hashCode() == propertyDescriptor18.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 1);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo47 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/proxy/Mixin$Generator;", "(III)I");
        java.lang.String str52 = signature51.getName();
        boolean boolean53 = signature48.equals((java.lang.Object) signature51);
        java.lang.String str54 = signature48.getName();
        org.mockito.asm.Type type55 = signature48.getReturnType();
        java.lang.String str56 = signature48.getDescriptor();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str61 = type60.getClassName();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type59, type60, type62 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray63);
        java.lang.Class<?> wildcardClass65 = typeArray63.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass65);
        org.mockito.cglib.core.ClassInfo classInfo67 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass65);
        java.lang.String str68 = classInfo67.toString();
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Method method71 = null;
        java.beans.PropertyDescriptor propertyDescriptor72 = new java.beans.PropertyDescriptor("int", method70, method71);
        java.lang.reflect.Method method73 = null;
        propertyDescriptor72.setReadMethod(method73);
        java.lang.reflect.Method method75 = propertyDescriptor72.getWriteMethod();
        propertyDescriptor72.setName("(III)I");
        java.lang.reflect.Method method78 = propertyDescriptor72.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration79 = propertyDescriptor72.attributeNames();
        boolean boolean80 = classInfo67.equals((java.lang.Object) strEnumeration79);
        java.lang.String str81 = classInfo67.toString();
        org.mockito.asm.Type type82 = classInfo67.getSuperType();
        boolean boolean83 = signature48.equals((java.lang.Object) type82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor72", propertyDescriptor3.equals(propertyDescriptor72) ? propertyDescriptor3.hashCode() == propertyDescriptor72.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        java.lang.String str43 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 3);
        org.mockito.cglib.core.Signature signature46 = methodInfo45.getSignature();
        org.mockito.asm.Type[] typeArray47 = methodInfo45.getExceptionTypes();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("int", method49, method50);
        org.mockito.cglib.proxy.Mixin.Generator generator53 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor51.setValue("", (java.lang.Object) generator53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator53.getNamingPolicy();
        generator53.setUseCache(true);
        boolean boolean58 = methodInfo45.equals((java.lang.Object) generator53);
        int int59 = methodInfo45.getModifiers();
        org.mockito.asm.Type[] typeArray60 = methodInfo45.getExceptionTypes();
        org.mockito.asm.Type[] typeArray61 = methodInfo45.getExceptionTypes();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str66 = type65.getClassName();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type64, type65, type67 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray68);
        java.lang.Class<?> wildcardClass70 = typeArray68.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass70);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray71, true, true);
        java.lang.Class[] classArray75 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) methodArray74);
        boolean boolean76 = methodInfo45.equals((java.lang.Object) classArray75);
        org.mockito.cglib.core.Signature signature77 = methodInfo45.getSignature();
        org.mockito.cglib.core.Signature signature78 = methodInfo45.getSignature();
        org.mockito.asm.Type type79 = signature78.getReturnType();
        java.lang.reflect.Method method81 = null;
        java.lang.reflect.Method method82 = null;
        java.beans.PropertyDescriptor propertyDescriptor83 = new java.beans.PropertyDescriptor("org/mockito/asm/Type", method81, method82);
        boolean boolean84 = signature78.equals((java.lang.Object) "org/mockito/asm/Type");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor83", propertyDescriptor3.equals(propertyDescriptor83) ? propertyDescriptor3.hashCode() == propertyDescriptor83.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("<init>()V");
        int int3 = type1.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type5, type6, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = classInfo13.getSuperType();
        int int15 = classInfo13.getModifiers();
        org.mockito.asm.Type type16 = classInfo13.getType();
        java.lang.String str17 = type16.getInternalName();
        boolean boolean18 = type0.equals((java.lang.Object) type16);
        int int20 = type0.getOpcode(104);
        java.lang.String str21 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setUseCache(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("int", method18, method19);
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor20.setValue("", (java.lang.Object) generator22);
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = generator22.getNamingPolicy();
        generator14.setNamingPolicy(namingPolicy24);
        org.mockito.cglib.core.NamingPolicy namingPolicy26 = generator14.getNamingPolicy();
        generator5.setNamingPolicy(namingPolicy26);
        boolean boolean28 = generator5.getUseCache();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray35);
        java.lang.Class<?> wildcardClass37 = typeArray35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        java.lang.String str40 = classInfo39.toString();
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("int", method42, method43);
        java.lang.reflect.Method method45 = null;
        propertyDescriptor44.setReadMethod(method45);
        java.lang.reflect.Method method47 = propertyDescriptor44.getWriteMethod();
        propertyDescriptor44.setName("(III)I");
        java.lang.reflect.Method method50 = propertyDescriptor44.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration51 = propertyDescriptor44.attributeNames();
        boolean boolean52 = classInfo39.equals((java.lang.Object) strEnumeration51);
        java.lang.String str53 = classInfo39.toString();
        org.mockito.asm.Type type54 = classInfo39.getSuperType();
        org.mockito.asm.Type[] typeArray56 = org.mockito.asm.Type.getArgumentTypes("(III)V");
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray56);
        generator5.setDelegates((java.lang.Object[]) typeArray56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor44", propertyDescriptor3.equals(propertyDescriptor44) ? propertyDescriptor3.hashCode() == propertyDescriptor44.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int6 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type5.getElementType();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy7 = generator5.getStrategy();
        java.lang.Object[] objArray10 = new java.lang.Object[] { generator5, 7, 6 };
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray10);
        org.mockito.cglib.proxy.Mixin mixin12 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        org.mockito.cglib.proxy.Mixin mixin14 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.lang.String str26 = classInfo25.toString();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("int", method28, method29);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor30.setReadMethod(method31);
        java.lang.reflect.Method method33 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor30.setName("(III)I");
        java.lang.reflect.Method method36 = propertyDescriptor30.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration37 = propertyDescriptor30.attributeNames();
        boolean boolean38 = classInfo25.equals((java.lang.Object) strEnumeration37);
        java.lang.String str39 = classInfo25.toString();
        org.mockito.asm.Type type40 = classInfo25.getSuperType();
        org.mockito.asm.Type[] typeArray42 = org.mockito.asm.Type.getArgumentTypes("(III)V");
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray42);
        org.mockito.cglib.proxy.Mixin mixin44 = mixin14.newInstance((java.lang.Object[]) typeArray42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("I", (java.lang.Object) propertyDescriptorArray17);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj22 = propertyDescriptor3.getValue("");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String str26 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor31.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor31.getWriteMethod();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor31.setReadMethod(method35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor40.setReadMethod(method41);
        java.lang.reflect.Method method43 = propertyDescriptor40.getWriteMethod();
        java.lang.reflect.Method method44 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setName("(III)I");
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.String str50 = propertyDescriptor31.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor40", propertyDescriptor3.equals(propertyDescriptor40) ? propertyDescriptor3.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(III)Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getClassName();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str4 = type3.getClassName();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type2, type3, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("I", (java.lang.Object) propertyDescriptorArray17);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj22 = propertyDescriptor3.getValue("");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String str26 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor31.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor31.getWriteMethod();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor31.setReadMethod(method35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor40.setReadMethod(method41);
        java.lang.reflect.Method method43 = propertyDescriptor40.getWriteMethod();
        java.lang.reflect.Method method44 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setName("(III)I");
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        propertyDescriptor31.setExpert(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor40", propertyDescriptor3.equals(propertyDescriptor40) ? propertyDescriptor3.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str14 = propertyDescriptor3.getName();
        java.lang.String str15 = propertyDescriptor3.getName();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("int", method17, method18);
        org.mockito.cglib.proxy.Mixin.Generator generator21 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor19.setValue("", (java.lang.Object) generator21);
        generator21.setStyle((int) (byte) 1);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("int", method26, method27);
        org.mockito.cglib.proxy.Mixin.Generator generator30 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor28.setValue("", (java.lang.Object) generator30);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = generator30.getStrategy();
        java.lang.Object[] objArray35 = new java.lang.Object[] { generator30, 7, 6 };
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray35);
        org.mockito.cglib.proxy.Mixin mixin37 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray36);
        generator21.setClasses(classArray36);
        java.lang.Class<?> wildcardClass39 = generator21.getClass();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("int", method41, method42);
        org.mockito.cglib.proxy.Mixin.Generator generator45 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor43.setValue("", (java.lang.Object) generator45);
        boolean boolean47 = generator45.getUseCache();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str49 = type48.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type50, type51, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray54);
        java.lang.Class[] classArray56 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray54);
        generator45.setDelegates((java.lang.Object[]) classArray56);
        java.lang.reflect.Constructor constructor58 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass39, classArray56);
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor3.createPropertyEditor((java.lang.Object) constructor58);
        org.mockito.cglib.core.MethodInfo methodInfo61 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor58, 60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor19", propertyDescriptor3.equals(propertyDescriptor19) ? propertyDescriptor3.hashCode() == propertyDescriptor19.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.proxy.Mixin.Generator generator0 = new org.mockito.cglib.proxy.Mixin.Generator();
        generator0.setAttemptLoad(false);
        generator0.setUseCache(true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.ClassLoader classLoader5 = generator0.getClassLoader();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature47 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        org.mockito.cglib.proxy.Mixin.Generator generator55 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor53.setValue("", (java.lang.Object) generator55);
        generator55.setStyle((int) (byte) 1);
        java.lang.reflect.Method method60 = null;
        java.lang.reflect.Method method61 = null;
        java.beans.PropertyDescriptor propertyDescriptor62 = new java.beans.PropertyDescriptor("int", method60, method61);
        org.mockito.cglib.proxy.Mixin.Generator generator64 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor62.setValue("", (java.lang.Object) generator64);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy66 = generator64.getStrategy();
        java.lang.Object[] objArray69 = new java.lang.Object[] { generator64, 7, 6 };
        java.lang.Class[] classArray70 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray69);
        org.mockito.cglib.proxy.Mixin mixin71 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray70);
        generator55.setClasses(classArray70);
        java.lang.Class<?> wildcardClass73 = generator55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass73);
        boolean boolean75 = methodInfo49.equals((java.lang.Object) wildcardClass73);
        org.mockito.cglib.core.ClassInfo classInfo76 = methodInfo49.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo77 = methodInfo49.getClassInfo();
        java.lang.reflect.Method method79 = null;
        java.lang.reflect.Method method80 = null;
        java.beans.PropertyDescriptor propertyDescriptor81 = new java.beans.PropertyDescriptor("hi!", method79, method80);
        boolean boolean82 = propertyDescriptor81.isExpert();
        java.lang.Class<?> wildcardClass83 = propertyDescriptor81.getClass();
        org.mockito.asm.Type type84 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass83);
        org.mockito.cglib.core.ClassInfo classInfo85 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass83);
        boolean boolean86 = classInfo77.equals((java.lang.Object) wildcardClass83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor81", propertyDescriptor3.equals(propertyDescriptor81) ? propertyDescriptor3.hashCode() == propertyDescriptor81.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type4, type5, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str11 = type10.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str14 = type13.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type12, type13, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray16);
        int int18 = type10.getSize();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str23 = type22.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type21, type22, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray25);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray25);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("", type2, typeArray25);
        boolean boolean30 = type0.equals((java.lang.Object) type2);
        java.lang.String str31 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type2.getElementType();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(III)I; propertyEditorClass=class org.mockito.cglib.proxy.Mixin$Generator]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.String str6 = signature2.getDescriptor();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type7.getElementType();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 1);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo47 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 2);
        org.mockito.cglib.core.MethodInfo methodInfo52 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 105);
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("int", method54, method55);
        java.lang.reflect.Method method57 = null;
        propertyDescriptor56.setReadMethod(method57);
        propertyDescriptor56.setExpert(false);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.FLOAT_TYPE;
        propertyDescriptor56.setValue("hi!", (java.lang.Object) type62);
        java.lang.reflect.Method method64 = null;
        propertyDescriptor56.setWriteMethod(method64);
        java.lang.String str66 = propertyDescriptor56.getName();
        propertyDescriptor56.setName("");
        boolean boolean69 = propertyDescriptor56.isExpert();
        propertyDescriptor56.setExpert(true);
        java.lang.Class<?> wildcardClass72 = propertyDescriptor56.getPropertyType();
        java.lang.String str73 = propertyDescriptor56.getShortDescription();
        boolean boolean74 = propertyDescriptor56.isHidden();
        boolean boolean75 = propertyDescriptor56.isHidden();
        boolean boolean76 = methodInfo52.equals((java.lang.Object) boolean75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor56", propertyDescriptor3.equals(propertyDescriptor56) ? propertyDescriptor3.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray2 = org.mockito.asm.Type.getArgumentTypes("(III)I");
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray2);
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(III)I");
        boolean boolean3 = type0.equals((java.lang.Object) "(III)I");
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("(III)I");
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setReadMethod(method7);
        boolean boolean9 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setExpert(false);
        java.lang.String str12 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setName("(III)I");
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        java.lang.String str16 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("int", method20, method21);
        org.mockito.cglib.proxy.Mixin.Generator generator24 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor22.setValue("", (java.lang.Object) generator24);
        generator24.setStyle((int) (byte) 1);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        org.mockito.cglib.proxy.Mixin.Generator generator33 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor31.setValue("", (java.lang.Object) generator33);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy35 = generator33.getStrategy();
        java.lang.Object[] objArray38 = new java.lang.Object[] { generator33, 7, 6 };
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray38);
        org.mockito.cglib.proxy.Mixin mixin40 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray39);
        generator24.setClasses(classArray39);
        java.lang.Class<?> wildcardClass42 = generator24.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        int int48 = classInfo47.getModifiers();
        java.beans.PropertyEditor propertyEditor49 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classInfo47);
        java.lang.String str50 = classInfo47.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.String str6 = propertyDescriptor3.getName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        propertyDescriptor3.setValue("I", (java.lang.Object) propertyDescriptorArray17);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj22 = propertyDescriptor3.getValue("");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setReadMethod(method24);
        java.lang.String str26 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("int", method29, method30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor31.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor31.getWriteMethod();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor31.setReadMethod(method35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("int", method38, method39);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor40.setReadMethod(method41);
        java.lang.reflect.Method method43 = propertyDescriptor40.getWriteMethod();
        java.lang.reflect.Method method44 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setName("(III)I");
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.String str50 = propertyDescriptor3.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor40", propertyDescriptor31.equals(propertyDescriptor40) ? propertyDescriptor31.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 1);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        java.lang.String str47 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature50 = methodInfo49.getSignature();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type53, type54, type56 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray57);
        java.lang.Class<?> wildcardClass59 = typeArray57.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass59);
        org.mockito.cglib.core.ClassInfo classInfo61 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        java.lang.String str62 = classInfo61.toString();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("int", method64, method65);
        java.lang.reflect.Method method67 = null;
        propertyDescriptor66.setReadMethod(method67);
        java.lang.reflect.Method method69 = propertyDescriptor66.getWriteMethod();
        propertyDescriptor66.setName("(III)I");
        java.lang.reflect.Method method72 = propertyDescriptor66.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration73 = propertyDescriptor66.attributeNames();
        boolean boolean74 = classInfo61.equals((java.lang.Object) strEnumeration73);
        java.lang.String str75 = classInfo61.toString();
        org.mockito.asm.Type type76 = classInfo61.getSuperType();
        org.mockito.asm.Type[] typeArray78 = org.mockito.asm.Type.getArgumentTypes("(III)V");
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type76, typeArray78);
        java.lang.String str80 = type76.getClassName();
        java.lang.String str81 = type76.getClassName();
        boolean boolean82 = methodInfo49.equals((java.lang.Object) str81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor66", propertyDescriptor3.equals(propertyDescriptor66) ? propertyDescriptor3.hashCode() == propertyDescriptor66.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode((int) '4');
        int int4 = type0.getOpcode(55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type31, type32, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray35);
        java.lang.Class<?> wildcardClass37 = typeArray35.getClass();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.mockito.cglib.core.ClassInfo classInfo42 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass37);
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray43);
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("int", method46, method47);
        java.lang.reflect.Method method49 = null;
        propertyDescriptor48.setReadMethod(method49);
        java.lang.reflect.Method method51 = propertyDescriptor48.getWriteMethod();
        propertyDescriptor48.setName("(III)I");
        java.lang.reflect.Method method54 = propertyDescriptor48.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor48.attributeNames();
        java.lang.Class<?> wildcardClass56 = strEnumeration55.getClass();
        java.lang.String str57 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass56);
        java.lang.Object obj58 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass56);
        java.lang.Object obj60 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass23, classArray44, (java.lang.Object[]) propertyDescriptorArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor48", propertyDescriptor3.equals(propertyDescriptor48) ? propertyDescriptor3.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo46 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        java.lang.String str47 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 2);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 22);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(III)I]", method55, method56);
        java.util.Enumeration<java.lang.String> strEnumeration58 = propertyDescriptor57.attributeNames();
        java.lang.reflect.Method method59 = propertyDescriptor57.getWriteMethod();
        boolean boolean60 = propertyDescriptor57.isExpert();
        java.lang.Class<?> wildcardClass61 = propertyDescriptor57.getPropertyEditorClass();
        boolean boolean62 = methodInfo53.equals((java.lang.Object) wildcardClass61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setUseCache(false);
        boolean boolean9 = generator5.getAttemptLoad();
        generator5.setAttemptLoad(true);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type14, type15, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        java.lang.Class<?> wildcardClass20 = typeArray18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.lang.String str23 = classInfo22.toString();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor27.setReadMethod(method28);
        java.lang.reflect.Method method30 = propertyDescriptor27.getWriteMethod();
        propertyDescriptor27.setName("(III)I");
        java.lang.reflect.Method method33 = propertyDescriptor27.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration34 = propertyDescriptor27.attributeNames();
        boolean boolean35 = classInfo22.equals((java.lang.Object) strEnumeration34);
        int int36 = classInfo22.getModifiers();
        org.mockito.asm.Type type37 = classInfo22.getType();
        org.mockito.asm.Type[] typeArray38 = classInfo22.getInterfaces();
        generator5.setDelegates((java.lang.Object[]) typeArray38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor27", propertyDescriptor3.equals(propertyDescriptor27) ? propertyDescriptor3.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type3, type4, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        java.lang.Class<?> wildcardClass9 = typeArray7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str12 = classInfo11.toString();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("int", method14, method15);
        java.lang.reflect.Method method17 = null;
        propertyDescriptor16.setReadMethod(method17);
        java.lang.reflect.Method method19 = propertyDescriptor16.getWriteMethod();
        propertyDescriptor16.setName("(III)I");
        java.lang.reflect.Method method22 = propertyDescriptor16.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration23 = propertyDescriptor16.attributeNames();
        boolean boolean24 = classInfo11.equals((java.lang.Object) strEnumeration23);
        org.mockito.asm.Type type25 = classInfo11.getType();
        org.mockito.asm.Type type26 = classInfo11.getType();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("int", method28, method29);
        org.mockito.cglib.proxy.Mixin.Generator generator32 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor30.setValue("", (java.lang.Object) generator32);
        generator32.setStyle((int) (byte) 1);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("int", method37, method38);
        org.mockito.cglib.proxy.Mixin.Generator generator41 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor39.setValue("", (java.lang.Object) generator41);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy43 = generator41.getStrategy();
        java.lang.Object[] objArray46 = new java.lang.Object[] { generator41, 7, 6 };
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray46);
        org.mockito.cglib.proxy.Mixin mixin48 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray47);
        generator32.setClasses(classArray47);
        java.lang.Class<?> wildcardClass50 = generator32.getClass();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("int", method52, method53);
        org.mockito.cglib.proxy.Mixin.Generator generator56 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor54.setValue("", (java.lang.Object) generator56);
        boolean boolean58 = generator56.getUseCache();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray65 = new org.mockito.asm.Type[] { type61, type62, type64 };
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray65);
        java.lang.Class[] classArray67 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray65);
        generator56.setDelegates((java.lang.Object[]) classArray67);
        java.lang.reflect.Constructor constructor69 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass50, classArray67);
        java.lang.String str70 = org.mockito.asm.Type.getConstructorDescriptor(constructor69);
        org.mockito.cglib.core.MethodInfo methodInfo72 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor69, 3);
        org.mockito.cglib.core.Signature signature73 = methodInfo72.getSignature();
        org.mockito.asm.Type[] typeArray74 = methodInfo72.getExceptionTypes();
        java.lang.reflect.Method method76 = null;
        java.lang.reflect.Method method77 = null;
        java.beans.PropertyDescriptor propertyDescriptor78 = new java.beans.PropertyDescriptor("int", method76, method77);
        org.mockito.cglib.proxy.Mixin.Generator generator80 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor78.setValue("", (java.lang.Object) generator80);
        org.mockito.cglib.core.NamingPolicy namingPolicy82 = generator80.getNamingPolicy();
        generator80.setUseCache(true);
        boolean boolean85 = methodInfo72.equals((java.lang.Object) generator80);
        java.lang.Class<?> wildcardClass86 = generator80.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray87 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass86);
        org.mockito.cglib.core.ClassInfo classInfo88 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass86);
        org.mockito.asm.Type type89 = classInfo88.getSuperType();
        java.lang.Object obj90 = null;
        boolean boolean91 = classInfo88.equals(obj90);
        org.mockito.asm.Type[] typeArray92 = classInfo88.getInterfaces();
        org.mockito.cglib.core.Signature signature93 = new org.mockito.cglib.core.Signature("ava.beans.PropertyDescriptor[name=int", type26, typeArray92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor30", propertyDescriptor16.equals(propertyDescriptor30) ? propertyDescriptor16.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        java.lang.String str43 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 3);
        java.lang.Object[] objArray46 = null;
        java.lang.Object obj47 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor42, objArray46);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 9);
        org.mockito.cglib.core.MethodInfo methodInfo50 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("int", method54, method55);
        java.lang.reflect.Method method57 = null;
        propertyDescriptor56.setReadMethod(method57);
        java.lang.reflect.Method method59 = propertyDescriptor56.getWriteMethod();
        java.lang.reflect.Method method60 = propertyDescriptor56.getWriteMethod();
        propertyDescriptor56.setName("(III)I");
        java.lang.Class<?> wildcardClass63 = propertyDescriptor56.getPropertyEditorClass();
        propertyDescriptor56.setPreferred(true);
        java.lang.Class<?> wildcardClass66 = propertyDescriptor56.getPropertyEditorClass();
        java.lang.String str67 = propertyDescriptor56.getName();
        boolean boolean68 = signature52.equals((java.lang.Object) propertyDescriptor56);
        org.mockito.asm.Type type69 = signature52.getReturnType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor56", propertyDescriptor3.equals(propertyDescriptor56) ? propertyDescriptor3.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Ljava.beans.PropertyDescriptor[name=(III)I; propertyEditorClass=class [Lorg.mockito.asm.Type;];");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("int", "(III)I");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        int int7 = type6.getSize();
        int int9 = type6.getOpcode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type6.getElementType();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo47 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 9);
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("int", method49, method50);
        org.mockito.cglib.proxy.Mixin.Generator generator53 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor51.setValue("", (java.lang.Object) generator53);
        java.lang.reflect.Method method55 = null;
        propertyDescriptor51.setReadMethod(method55);
        boolean boolean57 = propertyDescriptor51.isHidden();
        propertyDescriptor51.setName("java.beans.PropertyDescriptor[name=int; bound]");
        boolean boolean60 = methodInfo47.equals((java.lang.Object) propertyDescriptor51);
        int int61 = methodInfo47.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.reflect.Method method9 = propertyDescriptor3.getReadMethod();
        boolean boolean10 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("int", method12, method13);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor14.setValue("", (java.lang.Object) generator16);
        generator16.setStyle((int) (byte) 1);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("int", method21, method22);
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor23.setValue("", (java.lang.Object) generator25);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator25.getStrategy();
        java.lang.Object[] objArray30 = new java.lang.Object[] { generator25, 7, 6 };
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray30);
        org.mockito.cglib.proxy.Mixin mixin32 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray31);
        generator16.setClasses(classArray31);
        java.lang.Class<?> wildcardClass34 = generator16.getClass();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("int", method36, method37);
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor38.setValue("", (java.lang.Object) generator40);
        boolean boolean42 = generator40.getUseCache();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type45, type46, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        java.lang.Class[] classArray51 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray49);
        generator40.setDelegates((java.lang.Object[]) classArray51);
        java.lang.reflect.Constructor constructor53 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass34, classArray51);
        java.lang.String str54 = org.mockito.asm.Type.getConstructorDescriptor(constructor53);
        org.mockito.cglib.core.MethodInfo methodInfo56 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor53, 3);
        org.mockito.cglib.core.Signature signature57 = methodInfo56.getSignature();
        java.lang.String str58 = signature57.getName();
        java.lang.String str59 = signature57.getDescriptor();
        org.mockito.asm.Type type60 = signature57.getReturnType();
        java.lang.String str61 = signature57.getDescriptor();
        java.lang.String str62 = signature57.getDescriptor();
        java.lang.String str63 = signature57.toString();
        java.lang.String str64 = signature57.getDescriptor();
        java.beans.PropertyEditor propertyEditor65 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature57);
        java.lang.String str66 = signature57.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setPreferred(false);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str12 = type11.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type10, type11, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        int int19 = type18.getSort();
        int int20 = type18.getSort();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("int", method22, method23);
        org.mockito.cglib.proxy.Mixin.Generator generator26 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor24.setValue("", (java.lang.Object) generator26);
        generator26.setStyle((int) (byte) 1);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("int", method31, method32);
        org.mockito.cglib.proxy.Mixin.Generator generator35 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor33.setValue("", (java.lang.Object) generator35);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = generator35.getStrategy();
        java.lang.Object[] objArray40 = new java.lang.Object[] { generator35, 7, 6 };
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray40);
        org.mockito.cglib.proxy.Mixin mixin42 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray41);
        generator26.setClasses(classArray41);
        java.lang.Class<?> wildcardClass44 = generator26.getClass();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("int", method46, method47);
        org.mockito.cglib.proxy.Mixin.Generator generator50 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor48.setValue("", (java.lang.Object) generator50);
        boolean boolean52 = generator50.getUseCache();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str54 = type53.getClassName();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str57 = type56.getClassName();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type55, type56, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray59);
        java.lang.Class[] classArray61 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray59);
        generator50.setDelegates((java.lang.Object[]) classArray61);
        java.lang.reflect.Constructor constructor63 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass44, classArray61);
        java.lang.String str64 = org.mockito.asm.Type.getConstructorDescriptor(constructor63);
        org.mockito.cglib.core.MethodInfo methodInfo66 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor63, 3);
        org.mockito.cglib.core.Signature signature67 = methodInfo66.getSignature();
        org.mockito.asm.Type[] typeArray68 = methodInfo66.getExceptionTypes();
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("boolean", type18, typeArray68);
        int int70 = type18.getSort();
        java.beans.PropertyEditor propertyEditor71 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type18);
        java.lang.String str72 = type18.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        java.lang.String str43 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 3);
        org.mockito.cglib.core.Signature signature46 = methodInfo45.getSignature();
        java.lang.String str47 = signature46.getName();
        org.mockito.asm.Type type48 = signature46.getReturnType();
        java.lang.String str49 = signature46.toString();
        java.lang.String str50 = signature46.getName();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("int", method52, method53);
        java.lang.reflect.Method method55 = null;
        propertyDescriptor54.setReadMethod(method55);
        java.lang.reflect.Method method57 = propertyDescriptor54.getWriteMethod();
        propertyDescriptor54.setName("(III)I");
        java.lang.reflect.Method method60 = propertyDescriptor54.getReadMethod();
        java.lang.Class<?> wildcardClass61 = propertyDescriptor54.getPropertyEditorClass();
        java.lang.String str62 = propertyDescriptor54.getShortDescription();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("int", method64, method65);
        org.mockito.cglib.proxy.Mixin.Generator generator68 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor66.setValue("", (java.lang.Object) generator68);
        java.lang.String str70 = propertyDescriptor66.getShortDescription();
        propertyDescriptor66.setShortDescription("(III)I");
        propertyDescriptor66.setShortDescription("Lint;");
        java.beans.PropertyEditor propertyEditor75 = propertyDescriptor54.createPropertyEditor((java.lang.Object) "Lint;");
        boolean boolean76 = propertyDescriptor54.isHidden();
        boolean boolean77 = propertyDescriptor54.isPreferred();
        boolean boolean78 = signature46.equals((java.lang.Object) boolean77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor54", propertyDescriptor3.equals(propertyDescriptor54) ? propertyDescriptor3.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.reflect.Method method9 = propertyDescriptor3.getReadMethod();
        boolean boolean10 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("int", method12, method13);
        org.mockito.cglib.proxy.Mixin.Generator generator16 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor14.setValue("", (java.lang.Object) generator16);
        generator16.setStyle((int) (byte) 1);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("int", method21, method22);
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor23.setValue("", (java.lang.Object) generator25);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = generator25.getStrategy();
        java.lang.Object[] objArray30 = new java.lang.Object[] { generator25, 7, 6 };
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray30);
        org.mockito.cglib.proxy.Mixin mixin32 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray31);
        generator16.setClasses(classArray31);
        java.lang.Class<?> wildcardClass34 = generator16.getClass();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("int", method36, method37);
        org.mockito.cglib.proxy.Mixin.Generator generator40 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor38.setValue("", (java.lang.Object) generator40);
        boolean boolean42 = generator40.getUseCache();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type45, type46, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray49);
        java.lang.Class[] classArray51 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray49);
        generator40.setDelegates((java.lang.Object[]) classArray51);
        java.lang.reflect.Constructor constructor53 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass34, classArray51);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("int", method55, method56);
        org.mockito.cglib.proxy.Mixin.Generator generator59 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor57.setValue("", (java.lang.Object) generator59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str62 = type61.getClassName();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str65 = type64.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type63, type64, type66 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray67);
        java.lang.Class[] classArray69 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray67);
        generator59.setClasses(classArray69);
        java.lang.reflect.Constructor constructor71 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass34, classArray69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo75 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str77 = type76.getClassName();
        org.mockito.asm.Type type78 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str80 = type79.getClassName();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray82 = new org.mockito.asm.Type[] { type78, type79, type81 };
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type76, typeArray82);
        java.lang.Class[] classArray84 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray82);
        java.lang.String[] strArray85 = org.mockito.cglib.core.ReflectUtils.getNames(classArray84);
        java.lang.reflect.Constructor constructor86 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass34, classArray84);
        java.beans.PropertyEditor propertyEditor87 = propertyDescriptor3.createPropertyEditor((java.lang.Object) constructor86);
        java.lang.String str88 = org.mockito.asm.Type.getConstructorDescriptor(constructor86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        java.lang.String str45 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo46 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        java.lang.String str47 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo48 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo49 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo51 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 2);
        org.mockito.cglib.core.ClassInfo classInfo52 = methodInfo51.getClassInfo();
        java.lang.String str53 = classInfo52.toString();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("int", method55, method56);
        java.lang.reflect.Method method58 = null;
        propertyDescriptor57.setReadMethod(method58);
        java.lang.reflect.Method method60 = propertyDescriptor57.getWriteMethod();
        propertyDescriptor57.setName("(III)I");
        java.lang.String str63 = propertyDescriptor57.getShortDescription();
        boolean boolean64 = classInfo52.equals((java.lang.Object) propertyDescriptor57);
        org.mockito.asm.Type type65 = classInfo52.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        propertyDescriptor3.setValue("hi!", (java.lang.Object) type9);
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setShortDescription("(III)I");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str16 = type15.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type17, type18, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.lang.String str26 = classInfo25.toString();
        org.mockito.asm.Type type27 = classInfo25.getSuperType();
        propertyDescriptor3.setValue("I", (java.lang.Object) classInfo25);
        org.mockito.asm.Type type29 = classInfo25.getType();
        org.mockito.asm.Type[] typeArray30 = classInfo25.getInterfaces();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("V(III)Lint;", method32, method33);
        boolean boolean35 = propertyDescriptor34.isExpert();
        java.lang.Object obj37 = propertyDescriptor34.getValue("java.beans.PropertyDescriptor[name=int; bound]");
        boolean boolean38 = propertyDescriptor34.isPreferred();
        boolean boolean39 = classInfo25.equals((java.lang.Object) propertyDescriptor34);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("int", method41, method42);
        java.lang.reflect.Method method44 = null;
        propertyDescriptor43.setReadMethod(method44);
        java.lang.reflect.Method method46 = propertyDescriptor43.getWriteMethod();
        java.lang.reflect.Method method47 = propertyDescriptor43.getReadMethod();
        java.lang.reflect.Method method48 = null;
        propertyDescriptor43.setReadMethod(method48);
        propertyDescriptor43.setName("Lint;");
        propertyDescriptor43.setShortDescription("()C");
        boolean boolean54 = classInfo25.equals((java.lang.Object) "()C");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor34", propertyDescriptor3.equals(propertyDescriptor34) ? propertyDescriptor3.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        java.lang.String str43 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 3);
        org.mockito.cglib.core.Signature signature46 = methodInfo45.getSignature();
        org.mockito.asm.Type[] typeArray47 = methodInfo45.getExceptionTypes();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("int", method49, method50);
        org.mockito.cglib.proxy.Mixin.Generator generator53 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor51.setValue("", (java.lang.Object) generator53);
        org.mockito.cglib.core.NamingPolicy namingPolicy55 = generator53.getNamingPolicy();
        generator53.setUseCache(true);
        boolean boolean58 = methodInfo45.equals((java.lang.Object) generator53);
        int int59 = methodInfo45.getModifiers();
        org.mockito.asm.Type[] typeArray60 = methodInfo45.getExceptionTypes();
        java.lang.String str61 = methodInfo45.toString();
        java.lang.reflect.Method method63 = null;
        java.lang.reflect.Method method64 = null;
        java.beans.PropertyDescriptor propertyDescriptor65 = new java.beans.PropertyDescriptor("int", method63, method64);
        org.mockito.cglib.proxy.Mixin.Generator generator67 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor65.setValue("", (java.lang.Object) generator67);
        propertyDescriptor65.setExpert(true);
        java.lang.String str71 = propertyDescriptor65.getDisplayName();
        boolean boolean72 = propertyDescriptor65.isExpert();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor65.getPropertyType();
        propertyDescriptor65.setName("Z");
        java.lang.Class<?> wildcardClass76 = propertyDescriptor65.getPropertyEditorClass();
        java.lang.String str77 = propertyDescriptor65.getShortDescription();
        boolean boolean78 = methodInfo45.equals((java.lang.Object) propertyDescriptor65);
        org.mockito.asm.Type[] typeArray79 = methodInfo45.getExceptionTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor65", propertyDescriptor3.equals(propertyDescriptor65) ? propertyDescriptor3.hashCode() == propertyDescriptor65.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str5 = type4.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type3, type4, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str10 = type9.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type11, type12, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        int int17 = type9.getSize();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type20, type21, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray24);
        java.lang.Class[] classArray26 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type1, typeArray24);
        java.lang.String str29 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type1.getElementType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("C", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("int", method6, method7);
        org.mockito.cglib.proxy.Mixin.Generator generator10 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor8.setValue("", (java.lang.Object) generator10);
        generator10.setStyle((int) (byte) 1);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("int", method15, method16);
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor17.setValue("", (java.lang.Object) generator19);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy21 = generator19.getStrategy();
        java.lang.Object[] objArray24 = new java.lang.Object[] { generator19, 7, 6 };
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray24);
        org.mockito.cglib.proxy.Mixin mixin26 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray25);
        generator10.setClasses(classArray25);
        java.lang.Class<?> wildcardClass28 = generator10.getClass();
        java.lang.Object obj29 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.asm.Type.getArgumentTypes("(III)V");
        java.lang.Class[] classArray32 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray31);
        java.lang.reflect.Constructor constructor33 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass28, classArray32);
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass28);
        java.lang.Class[] classArray36 = null;
        java.lang.reflect.Constructor constructor37 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass28, classArray36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor8", propertyDescriptor3.equals(propertyDescriptor8) ? propertyDescriptor3.hashCode() == propertyDescriptor8.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setReadMethod(method7);
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setReadMethod(method9);
        propertyDescriptor3.setName("(III)I");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("int", method15, method16);
        org.mockito.cglib.proxy.Mixin.Generator generator19 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor17.setValue("", (java.lang.Object) generator19);
        propertyDescriptor17.setExpert(true);
        java.lang.String str23 = propertyDescriptor17.getDisplayName();
        propertyDescriptor17.setShortDescription("org.mockito.asm.Type[]");
        java.lang.String str26 = propertyDescriptor17.getShortDescription();
        propertyDescriptor3.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)[Lorg/mockito/asm/Type;", (java.lang.Object) propertyDescriptor17);
        propertyDescriptor17.setPreferred(false);
        boolean boolean30 = propertyDescriptor17.isExpert();
        boolean boolean31 = propertyDescriptor17.isExpert();
        propertyDescriptor17.setHidden(true);
        java.lang.String str34 = propertyDescriptor17.getDisplayName();
        java.lang.Class<?> wildcardClass35 = propertyDescriptor17.getPropertyType();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("int", method37, method38);
        org.mockito.cglib.proxy.Mixin.Generator generator41 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor39.setValue("", (java.lang.Object) generator41);
        generator41.setStyle((int) (byte) 1);
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("int", method46, method47);
        org.mockito.cglib.proxy.Mixin.Generator generator50 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor48.setValue("", (java.lang.Object) generator50);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = generator50.getStrategy();
        java.lang.Object[] objArray55 = new java.lang.Object[] { generator50, 7, 6 };
        java.lang.Class[] classArray56 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray55);
        org.mockito.cglib.proxy.Mixin mixin57 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray56);
        generator41.setClasses(classArray56);
        java.lang.Class<?> wildcardClass59 = generator41.getClass();
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("int", method61, method62);
        org.mockito.cglib.proxy.Mixin.Generator generator65 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor63.setValue("", (java.lang.Object) generator65);
        boolean boolean67 = generator65.getUseCache();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str69 = type68.getClassName();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str72 = type71.getClassName();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray74 = new org.mockito.asm.Type[] { type70, type71, type73 };
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray74);
        java.lang.Class[] classArray76 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray74);
        generator65.setDelegates((java.lang.Object[]) classArray76);
        java.lang.reflect.Constructor constructor78 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass59, classArray76);
        java.lang.String str79 = org.mockito.asm.Type.getConstructorDescriptor(constructor78);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor78, 3);
        org.mockito.cglib.core.MethodInfo methodInfo83 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor78, (int) ' ');
        org.mockito.cglib.core.MethodInfo methodInfo85 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor78, (int) (byte) 1);
        org.mockito.cglib.core.ClassInfo classInfo86 = methodInfo85.getClassInfo();
        org.mockito.asm.Type type87 = classInfo86.getSuperType();
        boolean boolean88 = propertyDescriptor17.equals((java.lang.Object) classInfo86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor39", propertyDescriptor3.equals(propertyDescriptor39) ? propertyDescriptor3.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        java.lang.reflect.Method method6 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setName("(III)I");
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(true);
        java.lang.Object obj14 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=<init>; values={hi!=F}]");
        java.lang.reflect.Method method15 = null;
        propertyDescriptor3.setWriteMethod(method15);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("int", method18, method19);
        org.mockito.cglib.proxy.Mixin.Generator generator22 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor20.setValue("", (java.lang.Object) generator22);
        generator22.setStyle((int) (byte) 1);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("int", method27, method28);
        org.mockito.cglib.proxy.Mixin.Generator generator31 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor29.setValue("", (java.lang.Object) generator31);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = generator31.getStrategy();
        java.lang.Object[] objArray36 = new java.lang.Object[] { generator31, 7, 6 };
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray36);
        org.mockito.cglib.proxy.Mixin mixin38 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray37);
        generator22.setClasses(classArray37);
        java.lang.Class<?> wildcardClass40 = generator22.getClass();
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("int", method42, method43);
        org.mockito.cglib.proxy.Mixin.Generator generator46 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor44.setValue("", (java.lang.Object) generator46);
        boolean boolean48 = generator46.getUseCache();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type51, type52, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray55);
        java.lang.Class[] classArray57 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray55);
        generator46.setDelegates((java.lang.Object[]) classArray57);
        java.lang.reflect.Constructor constructor59 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass40, classArray57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor59);
        org.mockito.cglib.core.MethodInfo methodInfo62 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor59, (int) (short) 1);
        org.mockito.cglib.core.Signature signature63 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor59);
        org.mockito.cglib.core.MethodInfo methodInfo64 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor59);
        java.beans.PropertyEditor propertyEditor65 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodInfo64);
        org.mockito.cglib.core.ClassInfo classInfo66 = methodInfo64.getClassInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor20", propertyDescriptor3.equals(propertyDescriptor20) ? propertyDescriptor3.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.cglib.core.MethodInfo methodInfo44 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 100);
        org.mockito.cglib.core.MethodInfo methodInfo46 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 0);
        org.mockito.asm.Type[] typeArray47 = methodInfo46.getExceptionTypes();
        org.mockito.cglib.core.Signature signature48 = methodInfo46.getSignature();
        int int49 = methodInfo46.getModifiers();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("int", method51, method52);
        java.lang.reflect.Method method54 = null;
        propertyDescriptor53.setReadMethod(method54);
        java.lang.reflect.Method method56 = propertyDescriptor53.getWriteMethod();
        propertyDescriptor53.setName("(III)I");
        java.lang.reflect.Method method59 = propertyDescriptor53.getReadMethod();
        java.util.Enumeration<java.lang.String> strEnumeration60 = propertyDescriptor53.attributeNames();
        java.lang.Class<?> wildcardClass61 = strEnumeration60.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass61);
        java.lang.String str64 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass61);
        boolean boolean66 = methodInfo46.equals((java.lang.Object) propertyDescriptorArray65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor53", propertyDescriptor3.equals(propertyDescriptor53) ? propertyDescriptor3.hashCode() == propertyDescriptor53.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        org.mockito.cglib.proxy.Mixin.Generator generator5 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor3.setValue("", (java.lang.Object) generator5);
        generator5.setStyle((int) (byte) 1);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("int", method10, method11);
        org.mockito.cglib.proxy.Mixin.Generator generator14 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor12.setValue("", (java.lang.Object) generator14);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = generator14.getStrategy();
        java.lang.Object[] objArray19 = new java.lang.Object[] { generator14, 7, 6 };
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray19);
        org.mockito.cglib.proxy.Mixin mixin21 = org.mockito.cglib.proxy.Mixin.createBean((java.lang.Object[]) classArray20);
        generator5.setClasses(classArray20);
        java.lang.Class<?> wildcardClass23 = generator5.getClass();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("int", method25, method26);
        org.mockito.cglib.proxy.Mixin.Generator generator29 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor27.setValue("", (java.lang.Object) generator29);
        boolean boolean31 = generator29.getUseCache();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str33 = type32.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type34, type35, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray38);
        java.lang.Class[] classArray40 = org.mockito.cglib.proxy.Mixin.getClasses((java.lang.Object[]) typeArray38);
        generator29.setDelegates((java.lang.Object[]) classArray40);
        java.lang.reflect.Constructor constructor42 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass23, classArray40);
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, (int) (short) 1);
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        java.lang.String str47 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor42);
        java.lang.String str49 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        java.lang.String str50 = org.mockito.asm.Type.getConstructorDescriptor(constructor42);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor42);
        org.mockito.cglib.core.MethodInfo methodInfo53 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor42, 36);
        org.mockito.cglib.core.ClassInfo classInfo54 = methodInfo53.getClassInfo();
        org.mockito.asm.Type type55 = classInfo54.getType();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("V(III)Lint;", method57, method58);
        java.lang.String str60 = propertyDescriptor59.getShortDescription();
        java.lang.reflect.Method method61 = null;
        propertyDescriptor59.setReadMethod(method61);
        propertyDescriptor59.setPreferred(false);
        propertyDescriptor59.setHidden(true);
        boolean boolean67 = classInfo54.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor59", propertyDescriptor3.equals(propertyDescriptor59) ? propertyDescriptor3.hashCode() == propertyDescriptor59.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("int", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setReadMethod(method4);
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        propertyDescriptor3.setValue("hi!", (java.lang.Object) type9);
        propertyDescriptor3.setBound(false);
        java.util.Enumeration<java.lang.String> strEnumeration13 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("()Ljava/lang/Object;");
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("int", method21, method22);
        org.mockito.cglib.proxy.Mixin.Generator generator25 = new org.mockito.cglib.proxy.Mixin.Generator();
        propertyDescriptor23.setValue("", (java.lang.Object) generator25);
        propertyDescriptor23.setExpert(true);
        java.lang.String str29 = propertyDescriptor23.getDisplayName();
        propertyDescriptor23.setShortDescription("org.mockito.asm.Type[]");
        propertyDescriptor23.setDisplayName("()V");
        java.lang.Object obj35 = propertyDescriptor23.getValue("java/util/Collections$EmptyEnumeration");
        java.lang.reflect.Method method36 = propertyDescriptor23.getReadMethod();
        java.lang.reflect.Method method37 = propertyDescriptor23.getWriteMethod();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor23.getClass();
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("int(III)I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }
}


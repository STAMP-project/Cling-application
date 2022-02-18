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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        boolean boolean8 = type0.equals((java.lang.Object) classArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(3);
        java.lang.String str7 = type3.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type1, type3, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type0.getInternalName();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.Class<?> wildcardClass22 = signature20.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass17, wildcardClass22 };
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.reflect.Method[] methodArray26 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.String str32 = signature30.getName();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        java.lang.String str34 = signature30.getDescriptor();
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        int int37 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray35);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        boolean boolean42 = signature30.equals((java.lang.Object) strArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type46 = signature45.getReturnType();
        java.lang.Class<?> wildcardClass47 = signature45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, true, false);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray53);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int3 = type0.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.Class<?> wildcardClass13 = signature11.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass8, wildcardClass13 };
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray18);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 0);
        int int3 = type0.getSort();
        int int5 = type0.getOpcode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 0);
        int int3 = type0.getSort();
        int int5 = type0.getOpcode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getClassName();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = signature7.getName();
        boolean boolean10 = type0.equals((java.lang.Object) signature7);
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSort();
        int int10 = type7.getOpcode(3);
        java.lang.String str11 = type7.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type7, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type4, type20, type23, type25, type26 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        int int34 = type33.getSort();
        int int36 = type33.getOpcode(3);
        java.lang.String str37 = type33.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type31, type33, type38, type40, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str47 = type3.getInternalName();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type16.getDimensions();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        java.lang.Class<?> wildcardClass10 = signature8.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass5, wildcardClass10 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type19 = signature18.getReturnType();
        java.lang.String str20 = signature18.getName();
        org.mockito.asm.Type type21 = signature18.getReturnType();
        java.lang.String str22 = signature18.getDescriptor();
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray23);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        boolean boolean30 = signature18.equals((java.lang.Object) strArray29);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type34 = signature33.getReturnType();
        java.lang.Class<?> wildcardClass35 = signature33.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray36, true, false);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        java.lang.Class<?> wildcardClass44 = type42.getClass();
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.Class<?> wildcardClass49 = signature47.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        java.lang.Class[] classArray51 = new java.lang.Class[] { wildcardClass44, wildcardClass49 };
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray51);
        java.lang.reflect.Method[] methodArray53 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray53);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray55);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int3 = type0.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        java.lang.Class<?> wildcardClass10 = signature8.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass5, wildcardClass10 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        java.lang.String str19 = signature17.getName();
        org.mockito.asm.Type type20 = signature17.getReturnType();
        java.lang.String str21 = signature17.getDescriptor();
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray22);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        boolean boolean29 = signature17.equals((java.lang.Object) strArray28);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.Class<?> wildcardClass34 = signature32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, false);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray38);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray40);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getDisplayName();
        boolean boolean9 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getClass();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getDisplayName();
        boolean boolean9 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getClass();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.String str18 = signature16.getName();
        org.mockito.asm.Type type19 = signature16.getReturnType();
        java.lang.String str20 = signature16.getDescriptor();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray21);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        boolean boolean28 = signature16.equals((java.lang.Object) strArray27);
        java.lang.String str29 = signature16.getDescriptor();
        boolean boolean30 = type12.equals((java.lang.Object) signature16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getDisplayName();
        boolean boolean9 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getClass();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method9, method10);
        boolean boolean12 = type7.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor11", propertyDescriptor3.equals(propertyDescriptor11) ? propertyDescriptor3.hashCode() == propertyDescriptor11.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.String str20 = propertyDescriptor19.getShortDescription();
        java.lang.reflect.Method method21 = propertyDescriptor19.getWriteMethod();
        propertyDescriptor19.setValue("double", (java.lang.Object) ' ');
        boolean boolean25 = propertyDescriptor19.isExpert();
        java.lang.reflect.Method method26 = null;
        propertyDescriptor19.setReadMethod(method26);
        propertyDescriptor19.setDisplayName("");
        boolean boolean30 = signature2.equals((java.lang.Object) "");
        java.lang.String str31 = signature2.getName();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        java.lang.String str36 = propertyDescriptor35.getShortDescription();
        java.lang.reflect.Method method37 = propertyDescriptor35.getWriteMethod();
        propertyDescriptor35.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor35.setName("double");
        java.lang.reflect.Method method43 = propertyDescriptor35.getReadMethod();
        boolean boolean44 = signature2.equals((java.lang.Object) method43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor35", propertyDescriptor19.equals(propertyDescriptor35) ? propertyDescriptor19.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        java.lang.String str17 = type16.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type16.getInternalName();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.toString();
        boolean boolean6 = type0.equals((java.lang.Object) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSort();
        int int13 = type10.getOpcode(3);
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        int int18 = type17.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type10, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type7, type23, type26, type28, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str35 = type34.getClassName();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        int int37 = type36.getSort();
        int int39 = type36.getOpcode(3);
        java.lang.String str40 = type36.getClassName();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BYTE_TYPE;
        int int42 = type41.getSort();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        int int44 = type43.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type34, type36, type41, type43, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray47);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray47);
        java.lang.Class[] classArray51 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray47);
        java.lang.String[] strArray52 = org.mockito.cglib.core.ReflectUtils.getNames(classArray51);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        int int54 = type53.getSort();
        java.lang.Class<?> wildcardClass55 = type53.getClass();
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type59 = signature58.getReturnType();
        java.lang.Class<?> wildcardClass60 = signature58.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass60);
        java.lang.Class[] classArray62 = new java.lang.Class[] { wildcardClass55, wildcardClass60 };
        java.lang.String[] strArray63 = org.mockito.cglib.core.ReflectUtils.getNames(classArray62);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type67 = signature66.getReturnType();
        java.lang.Class<?> wildcardClass68 = signature66.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, true, true);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray63, methodArray73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray74);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 0);
        int int3 = type0.getSort();
        int int5 = type0.getOpcode((int) (short) 100);
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        int int4 = type0.getOpcode((int) (short) -1);
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type12);
        java.lang.String str14 = type12.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        int int5 = type4.getSort();
        int int7 = type4.getOpcode(3);
        java.lang.String str8 = type4.getClassName();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        boolean boolean14 = type4.equals((java.lang.Object) signature11);
        java.lang.String str15 = type4.getClassName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        int int27 = type26.getSort();
        int int29 = type26.getOpcode(3);
        java.lang.String str30 = type26.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BYTE_TYPE;
        int int32 = type31.getSort();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        int int34 = type33.getSort();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type24, type26, type31, type33, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        int int40 = type39.getSize();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str43 = type42.getDescriptor();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str46 = type45.getClassName();
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type23, type39, type42, type44, type45 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray47);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type18, typeArray47);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray47);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type1, typeArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str52 = type1.getInternalName();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.Class<?> wildcardClass14 = signature12.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        java.lang.Class[] classArray16 = new java.lang.Class[] { wildcardClass9, wildcardClass14 };
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        int int19 = type18.getSort();
        int int21 = type18.getOpcode(3);
        java.lang.String str22 = type18.getClassName();
        java.lang.String str23 = type18.getClassName();
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        boolean boolean26 = type18.equals((java.lang.Object) classArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type34 = signature33.getReturnType();
        java.lang.Class<?> wildcardClass35 = signature33.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass30, wildcardClass35 };
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray39);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray42);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        java.lang.String str15 = signature11.getDescriptor();
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        boolean boolean23 = signature11.equals((java.lang.Object) strArray22);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.Class<?> wildcardClass28 = signature26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray29, true, false);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        java.lang.Class<?> wildcardClass37 = type35.getClass();
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type41 = signature40.getReturnType();
        java.lang.Class<?> wildcardClass42 = signature40.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        java.lang.Class[] classArray44 = new java.lang.Class[] { wildcardClass37, wildcardClass42 };
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        java.lang.reflect.Method[] methodArray46 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray46);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type51 = signature50.getReturnType();
        java.lang.String str52 = signature50.getName();
        org.mockito.asm.Type type53 = signature50.getReturnType();
        java.lang.String str54 = signature50.getDescriptor();
        java.lang.Class[] classArray55 = new java.lang.Class[] {};
        int int56 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        int int57 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        int int58 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        java.lang.Class[] classArray59 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray55);
        java.lang.String[] strArray60 = org.mockito.cglib.core.ReflectUtils.getNames(classArray59);
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray59);
        boolean boolean62 = signature50.equals((java.lang.Object) strArray61);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type66 = signature65.getReturnType();
        java.lang.Class<?> wildcardClass67 = signature65.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass67);
        java.lang.reflect.Method[] methodArray71 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray68, true, false);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray71);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray71);
        java.lang.reflect.Method[] methodArray74 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray74);
        org.mockito.cglib.core.Signature signature78 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type79 = signature78.getReturnType();
        java.lang.Class<?> wildcardClass80 = signature78.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray81 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass80);
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass80);
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray82, true, true);
        java.lang.reflect.Method[] methodArray86 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray87 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray86);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getClassName();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = signature7.getName();
        boolean boolean10 = type0.equals((java.lang.Object) signature7);
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        boolean boolean25 = classInfo18.equals((java.lang.Object) type24);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("(VBLhi!;SD)B", method27, method28);
        boolean boolean30 = classInfo18.equals((java.lang.Object) "(VBLhi!;SD)B");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor29", propertyDescriptor3.equals(propertyDescriptor29) ? propertyDescriptor3.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        boolean boolean33 = classInfo18.equals((java.lang.Object) 100.0f);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        java.lang.String str40 = propertyDescriptor37.getShortDescription();
        propertyDescriptor37.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor37.setConstrained(false);
        propertyDescriptor37.setHidden(false);
        propertyDescriptor37.setExpert(true);
        java.lang.reflect.Method method50 = propertyDescriptor37.getWriteMethod();
        boolean boolean51 = classInfo18.equals((java.lang.Object) method50);
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("hi!", method53, method54);
        java.lang.String str56 = propertyDescriptor55.getShortDescription();
        java.lang.reflect.Method method57 = propertyDescriptor55.getWriteMethod();
        propertyDescriptor55.setValue("double", (java.lang.Object) ' ');
        boolean boolean61 = propertyDescriptor55.isExpert();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("hi!", method64, method65);
        java.lang.Class<?> wildcardClass67 = propertyDescriptor66.getClass();
        java.lang.String str68 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass67);
        propertyDescriptor55.setValue("float", (java.lang.Object) wildcardClass67);
        java.lang.Class<?> wildcardClass70 = propertyDescriptor55.getPropertyEditorClass();
        java.lang.reflect.Method method71 = propertyDescriptor55.getReadMethod();
        java.lang.reflect.Method method72 = propertyDescriptor55.getWriteMethod();
        propertyDescriptor55.setPreferred(false);
        boolean boolean75 = propertyDescriptor55.isExpert();
        propertyDescriptor55.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        propertyDescriptor55.setShortDescription("Ljava/lang/Object;");
        propertyDescriptor55.setDisplayName("java.beans.PropertyDescriptor");
        boolean boolean82 = classInfo18.equals((java.lang.Object) "java.beans.PropertyDescriptor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor55", propertyDescriptor3.equals(propertyDescriptor55) ? propertyDescriptor3.hashCode() == propertyDescriptor55.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        boolean boolean24 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]", method26, method27);
        java.lang.reflect.Method method29 = null;
        propertyDescriptor28.setReadMethod(method29);
        java.lang.String str31 = propertyDescriptor28.getDisplayName();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor28.getPropertyType();
        propertyDescriptor28.setExpert(false);
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor28", propertyDescriptor14.equals(propertyDescriptor28) ? propertyDescriptor14.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setPreferred(false);
        boolean boolean22 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor26.attributeNames();
        java.lang.String str29 = propertyDescriptor26.getName();
        java.lang.String str30 = propertyDescriptor26.getName();
        propertyDescriptor26.setDisplayName("byteB");
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        propertyDescriptor36.setValue("double", (java.lang.Object) ' ');
        boolean boolean42 = propertyDescriptor36.isExpert();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor47.getClass();
        java.lang.String str49 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        propertyDescriptor36.setValue("float", (java.lang.Object) wildcardClass48);
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor26.createPropertyEditor((java.lang.Object) propertyDescriptor36);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor36.getPropertyType();
        propertyDescriptor36.setHidden(false);
        propertyDescriptor36.setBound(false);
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor26", propertyDescriptor17.equals(propertyDescriptor26) ? propertyDescriptor17.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.Class<?> wildcardClass22 = signature20.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass17, wildcardClass22 };
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.reflect.Method[] methodArray26 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.String str32 = signature30.getName();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        java.lang.String str34 = signature30.getDescriptor();
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        int int37 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray35);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        boolean boolean42 = signature30.equals((java.lang.Object) strArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type46 = signature45.getReturnType();
        java.lang.Class<?> wildcardClass47 = signature45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, true, false);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BYTE_TYPE;
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type60 = signature59.getReturnType();
        java.lang.Class<?> wildcardClass61 = signature59.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass61);
        java.lang.Class[] classArray63 = new java.lang.Class[] { wildcardClass56, wildcardClass61 };
        java.lang.String[] strArray64 = org.mockito.cglib.core.ReflectUtils.getNames(classArray63);
        java.lang.reflect.Method[] methodArray65 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray64, methodArray65);
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray67);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        java.lang.String str2 = type1.getDescriptor();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        int int4 = type0.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass2, wildcardClass7 };
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type19 = signature18.getReturnType();
        java.lang.Class<?> wildcardClass20 = signature18.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass15, wildcardClass20 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.String str30 = signature28.getName();
        org.mockito.asm.Type type31 = signature28.getReturnType();
        java.lang.String str32 = signature28.getDescriptor();
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        int int35 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray33);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        boolean boolean40 = signature28.equals((java.lang.Object) strArray39);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type44 = signature43.getReturnType();
        java.lang.Class<?> wildcardClass45 = signature43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray46, true, false);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray49);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray49);
        java.lang.reflect.Method[] methodArray52 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray52);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type57 = signature56.getReturnType();
        java.lang.Class<?> wildcardClass58 = signature56.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass58);
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass58);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray60, true, true);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray64);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DBBBD)B");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type type14 = classInfo11.getType();
        org.mockito.asm.Type type15 = classInfo11.getType();
        propertyDescriptor3.setValue("L(DBBBD)V;", (java.lang.Object) type15);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("byteB", method18, method19);
        boolean boolean21 = propertyDescriptor20.isHidden();
        java.lang.Object obj23 = propertyDescriptor20.getValue("hi!B");
        boolean boolean24 = propertyDescriptor20.isHidden();
        java.beans.PropertyEditor propertyEditor25 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor20", propertyDescriptor9.equals(propertyDescriptor20) ? propertyDescriptor9.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type3.getElementType();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.getClassName();
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        boolean boolean8 = type0.equals((java.lang.Object) classArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DBBBD)B");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type type14 = classInfo11.getType();
        org.mockito.asm.Type type15 = classInfo11.getType();
        propertyDescriptor3.setValue("L(DBBBD)V;", (java.lang.Object) type15);
        org.mockito.asm.Type type17 = type15.getElementType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("byteB");
        int int4 = type3.getSort();
        java.lang.String str5 = type3.toString();
        int int6 = type3.getSize();
        java.lang.String str7 = type3.getDescriptor();
        boolean boolean8 = type0.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getDescriptor();
        int int6 = type0.getOpcode(0);
        int int7 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type16, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type13, type29, type32, type34, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        int int45 = type42.getOpcode(3);
        java.lang.String str46 = type42.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        int int50 = type49.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type40, type42, type47, type49, type51 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray53);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray53);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type59 = type1.getElementType();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DBBBD)V");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        java.lang.String str6 = propertyDescriptor5.getShortDescription();
        java.lang.reflect.Method method7 = propertyDescriptor5.getWriteMethod();
        java.lang.String str8 = propertyDescriptor5.getShortDescription();
        propertyDescriptor5.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor5.setReadMethod(method12);
        boolean boolean14 = propertyDescriptor5.isExpert();
        propertyDescriptor5.setName("(VBLhi!;SD)B");
        boolean boolean17 = type1.equals((java.lang.Object) propertyDescriptor5);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        java.lang.String str22 = propertyDescriptor21.getShortDescription();
        java.lang.reflect.Method method23 = propertyDescriptor21.getWriteMethod();
        propertyDescriptor21.setValue("double", (java.lang.Object) ' ');
        boolean boolean27 = propertyDescriptor21.isExpert();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.Class<?> wildcardClass33 = propertyDescriptor32.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        propertyDescriptor21.setValue("float", (java.lang.Object) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type[] typeArray37 = classInfo36.getInterfaces();
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor21", propertyDescriptor5.equals(propertyDescriptor21) ? propertyDescriptor5.hashCode() == propertyDescriptor21.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        java.lang.String str18 = type17.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type17.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getDescriptor();
        int int6 = type0.getOpcode(0);
        int int7 = type0.getSize();
        int int9 = type0.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = signature3.getName();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        java.lang.String str7 = signature3.getDescriptor();
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        boolean boolean15 = signature3.equals((java.lang.Object) strArray14);
        java.lang.String str16 = signature3.getDescriptor();
        org.mockito.asm.Type type17 = signature3.getReturnType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        int int24 = type21.getOpcode(3);
        java.lang.String str25 = type21.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        int int27 = type26.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        int int29 = type28.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type19, type21, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type17, typeArray32);
        int int35 = type17.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type17.getInternalName();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        org.mockito.asm.Type type21 = classInfo19.getType();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.Class<?> wildcardClass26 = signature24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean32 = classInfo29.equals((java.lang.Object) type31);
        org.mockito.asm.Type[] typeArray33 = classInfo29.getInterfaces();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        java.lang.String str40 = propertyDescriptor37.getShortDescription();
        propertyDescriptor37.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor37.setExpert(false);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        java.lang.String str50 = propertyDescriptor49.getShortDescription();
        java.lang.reflect.Method method51 = propertyDescriptor49.getWriteMethod();
        propertyDescriptor49.setBound(false);
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor37.createPropertyEditor((java.lang.Object) propertyDescriptor49);
        propertyDescriptor37.setShortDescription("hi!");
        boolean boolean57 = classInfo29.equals((java.lang.Object) propertyDescriptor37);
        org.mockito.asm.Type type58 = classInfo29.getType();
        boolean boolean59 = classInfo19.equals((java.lang.Object) classInfo29);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("hi!", method61, method62);
        java.lang.String str64 = propertyDescriptor63.getShortDescription();
        java.lang.reflect.Method method65 = propertyDescriptor63.getWriteMethod();
        java.lang.String str66 = propertyDescriptor63.getShortDescription();
        propertyDescriptor63.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method70 = null;
        propertyDescriptor63.setReadMethod(method70);
        propertyDescriptor63.setDisplayName("double");
        java.lang.String str74 = propertyDescriptor63.getDisplayName();
        propertyDescriptor63.setConstrained(false);
        propertyDescriptor63.setName("()Ljava/lang/Object;");
        java.lang.reflect.Method method79 = propertyDescriptor63.getReadMethod();
        boolean boolean80 = classInfo29.equals((java.lang.Object) propertyDescriptor63);
        org.mockito.asm.Type type81 = classInfo29.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor63", propertyDescriptor3.equals(propertyDescriptor63) ? propertyDescriptor3.hashCode() == propertyDescriptor63.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type16, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type13, type29, type32, type34, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        int int45 = type42.getOpcode(3);
        java.lang.String str46 = type42.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        int int50 = type49.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type40, type42, type47, type49, type51 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray53);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray53);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = type1.getInternalName();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor3.setShortDescription("hi!");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        boolean boolean27 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setShortDescription("floatLLorg/mockito/cglib/core/Signature;;");
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("B", method33, method34);
        boolean boolean36 = propertyDescriptor35.isExpert();
        propertyDescriptor35.setName("(DBBBD)Ljava/beans/PropertyDescriptor;");
        java.lang.String str39 = propertyDescriptor35.getName();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        java.lang.String str44 = propertyDescriptor43.getDisplayName();
        boolean boolean45 = propertyDescriptor43.isHidden();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass46);
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        java.beans.PropertyEditor propertyEditor50 = propertyDescriptor35.createPropertyEditor((java.lang.Object) str49);
        boolean boolean51 = propertyDescriptor3.equals((java.lang.Object) propertyEditor50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor35", propertyDescriptor15.equals(propertyDescriptor35) ? propertyDescriptor15.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byteB", "Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("java.lang.Object", method5, method6);
        boolean boolean8 = signature2.equals((java.lang.Object) "java.lang.Object");
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        boolean boolean16 = propertyDescriptor12.isPreferred();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = signature20.getName();
        org.mockito.asm.Type type23 = signature20.getReturnType();
        propertyDescriptor12.setValue("B", (java.lang.Object) type23);
        propertyDescriptor12.setShortDescription("double");
        propertyDescriptor12.setHidden(true);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor12.attributeNames();
        boolean boolean30 = signature2.equals((java.lang.Object) propertyDescriptor12);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.String str35 = propertyDescriptor34.getShortDescription();
        java.lang.reflect.Method method36 = propertyDescriptor34.getWriteMethod();
        java.lang.String str37 = propertyDescriptor34.getShortDescription();
        propertyDescriptor34.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor34.setShortDescription("float");
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor34.createPropertyEditor((java.lang.Object) classArray43);
        propertyDescriptor34.setConstrained(true);
        boolean boolean50 = propertyDescriptor34.isHidden();
        java.lang.reflect.Method method51 = propertyDescriptor34.getReadMethod();
        boolean boolean52 = signature2.equals((java.lang.Object) propertyDescriptor34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor12", propertyDescriptor7.equals(propertyDescriptor12) ? propertyDescriptor7.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("va.lang.Object", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        java.lang.String str10 = signature8.getName();
        org.mockito.asm.Type type11 = signature8.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) signature8);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = classInfo21.getType();
        org.mockito.asm.Type type23 = classInfo21.getType();
        org.mockito.asm.Type type24 = classInfo21.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BYTE_TYPE;
        int int26 = type25.getSort();
        java.lang.String str27 = type25.getClassName();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        propertyDescriptor31.setValue("double", (java.lang.Object) ' ');
        boolean boolean37 = propertyDescriptor31.isExpert();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor42.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        propertyDescriptor31.setValue("float", (java.lang.Object) wildcardClass43);
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type50 = signature49.getReturnType();
        java.lang.String str51 = signature49.getName();
        org.mockito.asm.Type type52 = signature49.getReturnType();
        boolean boolean53 = classInfo46.equals((java.lang.Object) type52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.BYTE_TYPE;
        int int58 = type57.getSort();
        int int60 = type57.getOpcode(3);
        java.lang.String str61 = type57.getClassName();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.BYTE_TYPE;
        int int63 = type62.getSort();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        int int65 = type64.getSort();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str67 = type66.getClassName();
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type55, type57, type62, type64, type66 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray68);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray68);
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray68);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]]", type24, typeArray68);
        boolean boolean73 = signature8.equals((java.lang.Object) type24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        java.lang.String str16 = signature2.getDescriptor();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        org.mockito.asm.Type type18 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type18.getInternalName();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]", method5, method6);
        java.lang.Object obj9 = propertyDescriptor7.getValue("ava.beans.PropertyDescriptor[name=hi!");
        boolean boolean10 = signature2.equals((java.lang.Object) propertyDescriptor7);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        boolean boolean20 = signature2.equals((java.lang.Object) propertyDescriptorArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor14", propertyDescriptor7.equals(propertyDescriptor14) ? propertyDescriptor7.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("D", method26, method27);
        java.lang.reflect.Method method29 = propertyDescriptor28.getWriteMethod();
        propertyDescriptor28.setPreferred(false);
        boolean boolean32 = propertyDescriptor3.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor28", propertyDescriptor14.equals(propertyDescriptor28) ? propertyDescriptor14.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getClassName();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.String str9 = signature7.getName();
        boolean boolean10 = type0.equals((java.lang.Object) signature7);
        java.lang.String str11 = type0.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type18 = signature17.getReturnType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        int int23 = type22.getSort();
        int int25 = type22.getOpcode(3);
        java.lang.String str26 = type22.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSort();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type20, type22, type27, type29, type31 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSize();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str39 = type38.getDescriptor();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type19, type35, type38, type40, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type14, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type0.getElementType();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("LbyteB;", method30, method31);
        propertyDescriptor32.setHidden(false);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor32.getPropertyEditorClass();
        boolean boolean36 = propertyDescriptor13.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor32", propertyDescriptor3.equals(propertyDescriptor32) ? propertyDescriptor3.hashCode() == propertyDescriptor32.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method16, method17);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.Class<?> wildcardClass24 = signature22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type[] typeArray28 = classInfo27.getInterfaces();
        propertyDescriptor18.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo27);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.String str34 = signature32.getName();
        org.mockito.asm.Type type35 = signature32.getReturnType();
        java.lang.String str36 = signature32.getDescriptor();
        java.lang.Class[] classArray37 = new java.lang.Class[] {};
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray37);
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        boolean boolean44 = signature32.equals((java.lang.Object) strArray43);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.Class<?> wildcardClass49 = signature47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass49);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, false);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray53);
        boolean boolean55 = classInfo27.equals((java.lang.Object) methodArray53);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray53);
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("hi!", method58, method59);
        java.lang.Class<?> wildcardClass61 = propertyDescriptor60.getClass();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass61);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass61);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray65, true, false);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor60", propertyDescriptor18.equals(propertyDescriptor60) ? propertyDescriptor18.hashCode() == propertyDescriptor60.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method8 = propertyDescriptor6.getWriteMethod();
        propertyDescriptor6.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor6.setName("double");
        java.lang.Class<?> wildcardClass14 = propertyDescriptor6.getPropertyType();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type23 = classInfo22.getType();
        org.mockito.asm.Type type24 = classInfo22.getType();
        org.mockito.asm.Type[] typeArray25 = classInfo22.getInterfaces();
        org.mockito.asm.Type[] typeArray26 = classInfo22.getInterfaces();
        org.mockito.asm.Type[] typeArray27 = classInfo22.getInterfaces();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor6.createPropertyEditor((java.lang.Object) typeArray27);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=void; values={byte=0}]", type2, typeArray27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor18", propertyDescriptor6.equals(propertyDescriptor18) ? propertyDescriptor6.hashCode() == propertyDescriptor18.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(3);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("()B");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method8 = propertyDescriptor6.getWriteMethod();
        propertyDescriptor6.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor6.setName("double");
        propertyDescriptor6.setExpert(false);
        propertyDescriptor6.setShortDescription("F");
        boolean boolean18 = type2.equals((java.lang.Object) "F");
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.String str23 = propertyDescriptor22.getShortDescription();
        java.lang.reflect.Method method24 = propertyDescriptor22.getWriteMethod();
        java.lang.String str25 = propertyDescriptor22.getShortDescription();
        boolean boolean26 = propertyDescriptor22.isPreferred();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.String str32 = signature30.getName();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        propertyDescriptor22.setValue("B", (java.lang.Object) type33);
        int int35 = type33.getSize();
        int int36 = type33.getSort();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("hi!", method38, method39);
        java.lang.String str41 = propertyDescriptor40.getShortDescription();
        java.lang.reflect.Method method42 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setValue("double", (java.lang.Object) ' ');
        boolean boolean46 = propertyDescriptor40.isExpert();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor51.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        propertyDescriptor40.setValue("float", (java.lang.Object) wildcardClass52);
        org.mockito.cglib.core.ClassInfo classInfo55 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass52);
        int int56 = classInfo55.getModifiers();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("hi!", method58, method59);
        java.lang.String str61 = propertyDescriptor60.getShortDescription();
        java.lang.reflect.Method method62 = propertyDescriptor60.getWriteMethod();
        propertyDescriptor60.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean66 = classInfo55.equals((java.lang.Object) propertyDescriptor60);
        int int67 = classInfo55.getModifiers();
        org.mockito.asm.Type[] typeArray68 = classInfo55.getInterfaces();
        org.mockito.asm.Type type69 = classInfo55.getType();
        org.mockito.asm.Type[] typeArray70 = classInfo55.getInterfaces();
        java.lang.String str71 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray70);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("Ljava/beans/PropertyDescriptor;", type2, typeArray70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor22", propertyDescriptor6.equals(propertyDescriptor22) ? propertyDescriptor6.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type type31 = classInfo18.getSuperType();
        int int32 = type31.getSize();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        propertyDescriptor36.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor36.setName("double");
        java.lang.Class<?> wildcardClass44 = propertyDescriptor36.getPropertyType();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.Class<?> wildcardClass49 = propertyDescriptor48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type53 = classInfo52.getType();
        org.mockito.asm.Type type54 = classInfo52.getType();
        org.mockito.asm.Type[] typeArray55 = classInfo52.getInterfaces();
        org.mockito.asm.Type[] typeArray56 = classInfo52.getInterfaces();
        org.mockito.asm.Type[] typeArray57 = classInfo52.getInterfaces();
        java.beans.PropertyEditor propertyEditor58 = propertyDescriptor36.createPropertyEditor((java.lang.Object) typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor36", propertyDescriptor3.equals(propertyDescriptor36) ? propertyDescriptor3.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass2, wildcardClass7 };
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.Class<?> wildcardClass15 = signature13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type28 = signature27.getReturnType();
        java.lang.Class<?> wildcardClass29 = signature27.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        java.lang.Class[] classArray31 = new java.lang.Class[] { wildcardClass24, wildcardClass29 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type36 = signature35.getReturnType();
        java.lang.Class<?> wildcardClass37 = signature35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass37);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, true, true);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray43);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        int int4 = type0.getOpcode((int) (short) -1);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        boolean boolean33 = classInfo18.equals((java.lang.Object) 100.0f);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        propertyDescriptor37.setValue("double", (java.lang.Object) ' ');
        boolean boolean43 = propertyDescriptor37.isExpert();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.Class<?> wildcardClass49 = propertyDescriptor48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        propertyDescriptor37.setValue("float", (java.lang.Object) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        int int53 = classInfo52.getModifiers();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        java.lang.String str58 = propertyDescriptor57.getShortDescription();
        java.lang.reflect.Method method59 = propertyDescriptor57.getWriteMethod();
        propertyDescriptor57.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean63 = classInfo52.equals((java.lang.Object) propertyDescriptor57);
        int int64 = classInfo52.getModifiers();
        org.mockito.asm.Type type65 = classInfo52.getSuperType();
        boolean boolean66 = classInfo18.equals((java.lang.Object) type65);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getReturnType("(DBBBD)V");
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Method method71 = null;
        java.beans.PropertyDescriptor propertyDescriptor72 = new java.beans.PropertyDescriptor("hi!", method70, method71);
        java.lang.String str73 = propertyDescriptor72.getShortDescription();
        java.lang.reflect.Method method74 = propertyDescriptor72.getWriteMethod();
        java.lang.String str75 = propertyDescriptor72.getShortDescription();
        propertyDescriptor72.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method79 = null;
        propertyDescriptor72.setReadMethod(method79);
        boolean boolean81 = propertyDescriptor72.isExpert();
        propertyDescriptor72.setName("(VBLhi!;SD)B");
        boolean boolean84 = type68.equals((java.lang.Object) propertyDescriptor72);
        boolean boolean85 = classInfo18.equals((java.lang.Object) type68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor72", propertyDescriptor3.equals(propertyDescriptor72) ? propertyDescriptor3.hashCode() == propertyDescriptor72.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        java.lang.String str8 = signature2.getName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass11, wildcardClass16 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray18);
        boolean boolean23 = signature2.equals((java.lang.Object) classArray22);
        org.mockito.asm.Type type24 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type24.getInternalName();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        java.lang.reflect.Method method26 = null;
        propertyDescriptor3.setWriteMethod(method26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        propertyDescriptor31.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method38 = null;
        propertyDescriptor31.setReadMethod(method38);
        boolean boolean40 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setExpert(true);
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("long");
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(DBBBD)B");
        java.lang.String str48 = type47.getClassName();
        boolean boolean49 = type45.equals((java.lang.Object) type47);
        int int50 = type45.getSize();
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type45);
        java.lang.String str52 = type45.getInternalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getDisplayName();
        boolean boolean38 = propertyDescriptor36.isHidden();
        propertyDescriptor36.setHidden(false);
        boolean boolean41 = classInfo18.equals((java.lang.Object) propertyDescriptor36);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.String str47 = propertyDescriptor46.getShortDescription();
        java.lang.reflect.Method method48 = propertyDescriptor46.getWriteMethod();
        java.lang.String str49 = propertyDescriptor46.getShortDescription();
        propertyDescriptor46.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor46.setConstrained(false);
        propertyDescriptor46.setHidden(false);
        propertyDescriptor46.setExpert(true);
        java.lang.reflect.Method method59 = propertyDescriptor46.getWriteMethod();
        boolean boolean60 = propertyDescriptor46.isHidden();
        propertyDescriptor46.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        java.lang.reflect.Method method63 = propertyDescriptor46.getWriteMethod();
        propertyDescriptor36.setValue("char", (java.lang.Object) propertyDescriptor46);
        java.lang.reflect.Method method65 = propertyDescriptor36.getWriteMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(13);
        int int8 = type5.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type5.getElementType();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.Object obj19 = null;
        boolean boolean20 = classInfo18.equals(obj19);
        java.lang.String str21 = classInfo18.toString();
        org.mockito.asm.Type[] typeArray22 = classInfo18.getInterfaces();
        java.lang.String str23 = classInfo18.toString();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str27 = signature26.getName();
        java.lang.String str28 = signature26.toString();
        org.mockito.asm.Type type29 = signature26.getReturnType();
        boolean boolean30 = classInfo18.equals((java.lang.Object) signature26);
        java.lang.String str31 = classInfo18.toString();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method33, method34);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type40 = signature39.getReturnType();
        java.lang.Class<?> wildcardClass41 = signature39.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type[] typeArray45 = classInfo44.getInterfaces();
        propertyDescriptor35.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo44);
        boolean boolean47 = classInfo18.equals((java.lang.Object) classInfo44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor35", propertyDescriptor3.equals(propertyDescriptor35) ? propertyDescriptor3.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.String str31 = propertyDescriptor30.getDisplayName();
        propertyDescriptor30.setShortDescription("D");
        java.lang.Class<?> wildcardClass34 = propertyDescriptor30.getPropertyType();
        propertyDescriptor3.setValue("java/beans/PropertyDescriptor", (java.lang.Object) propertyDescriptor30);
        propertyDescriptor30.setHidden(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSort();
        int int10 = type7.getOpcode(3);
        java.lang.String str11 = type7.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type7, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type4, type20, type23, type25, type26 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        int int34 = type33.getSort();
        int int36 = type33.getOpcode(3);
        java.lang.String str37 = type33.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type31, type33, type38, type40, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type47 = type3.getElementType();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.beans.PropertyEditor propertyEditor9 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 10);
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.String str18 = propertyDescriptor17.getShortDescription();
        java.lang.reflect.Method method19 = propertyDescriptor17.getWriteMethod();
        propertyDescriptor17.setBound(false);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor17.getPropertyType();
        java.lang.reflect.Method method23 = null;
        propertyDescriptor17.setReadMethod(method23);
        java.beans.PropertyEditor propertyEditor25 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor17);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.String str31 = propertyDescriptor30.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration32 = propertyDescriptor30.attributeNames();
        java.lang.String str33 = propertyDescriptor30.getName();
        java.lang.String str34 = propertyDescriptor30.getName();
        propertyDescriptor30.setDisplayName("byteB");
        propertyDescriptor30.setPreferred(true);
        propertyDescriptor17.setValue("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=B]; propertyEditorClass=class java.beans.PropertyDescriptor]", (java.lang.Object) propertyDescriptor30);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        java.lang.String str44 = propertyDescriptor43.getShortDescription();
        java.lang.reflect.Method method45 = propertyDescriptor43.getWriteMethod();
        propertyDescriptor43.setValue("double", (java.lang.Object) ' ');
        boolean boolean49 = propertyDescriptor43.isExpert();
        propertyDescriptor43.setName("double");
        java.lang.String str52 = propertyDescriptor43.getName();
        propertyDescriptor43.setBound(true);
        propertyDescriptor43.setName("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        propertyDescriptor43.setConstrained(false);
        java.lang.reflect.Method method59 = propertyDescriptor43.getWriteMethod();
        propertyDescriptor43.setBound(false);
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor17.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor43", propertyDescriptor3.equals(propertyDescriptor43) ? propertyDescriptor3.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.toString();
        boolean boolean6 = type0.equals((java.lang.Object) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setValue("java.lang.Object", (java.lang.Object) 10.0d);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        int int13 = type11.getOpcode((int) (short) 10);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.String str18 = propertyDescriptor17.getShortDescription();
        java.lang.reflect.Method method19 = propertyDescriptor17.getWriteMethod();
        propertyDescriptor17.setValue("double", (java.lang.Object) ' ');
        boolean boolean23 = propertyDescriptor17.isExpert();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        propertyDescriptor17.setValue("float", (java.lang.Object) wildcardClass29);
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type36 = signature35.getReturnType();
        java.lang.String str37 = signature35.getName();
        org.mockito.asm.Type type38 = signature35.getReturnType();
        boolean boolean39 = classInfo32.equals((java.lang.Object) type38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        int int44 = type43.getSort();
        int int46 = type43.getOpcode(3);
        java.lang.String str47 = type43.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        int int49 = type48.getSort();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        int int51 = type50.getSort();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str53 = type52.getClassName();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type41, type43, type48, type50, type52 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray54);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray54);
        propertyDescriptor3.setValue("float", (java.lang.Object) str57);
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method63 = null;
        java.lang.reflect.Method method64 = null;
        java.beans.PropertyDescriptor propertyDescriptor65 = new java.beans.PropertyDescriptor("B", method63, method64);
        propertyDescriptor65.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        propertyDescriptor65.setHidden(false);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("java.lang.Object", "org.mockito.cglib.core.Signature");
        java.beans.PropertyEditor propertyEditor73 = propertyDescriptor65.createPropertyEditor((java.lang.Object) signature72);
        propertyDescriptor3.setValue("LD;", (java.lang.Object) signature72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor65", propertyDescriptor17.equals(propertyDescriptor65) ? propertyDescriptor17.hashCode() == propertyDescriptor65.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        java.lang.String str16 = signature2.getDescriptor();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        org.mockito.asm.Type type18 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type18.getDimensions();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        propertyDescriptor9.setValue("double", (java.lang.Object) ' ');
        boolean boolean15 = propertyDescriptor9.isExpert();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        propertyDescriptor9.setValue("float", (java.lang.Object) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type28 = signature27.getReturnType();
        java.lang.String str29 = signature27.getName();
        org.mockito.asm.Type type30 = signature27.getReturnType();
        boolean boolean31 = classInfo24.equals((java.lang.Object) type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(3);
        java.lang.String str39 = type35.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type33, type35, type40, type42, type44 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray46);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        java.lang.String str21 = type20.getClassName();
        int int22 = type20.getDimensions();
        int int24 = type20.getOpcode(17);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getShortDescription();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        propertyDescriptor28.setValue("double", (java.lang.Object) ' ');
        boolean boolean34 = propertyDescriptor28.isExpert();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        propertyDescriptor28.setValue("float", (java.lang.Object) wildcardClass40);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor28.getPropertyEditorClass();
        java.lang.reflect.Method method44 = propertyDescriptor28.getReadMethod();
        java.lang.reflect.Method method45 = propertyDescriptor28.getWriteMethod();
        propertyDescriptor28.setPreferred(false);
        boolean boolean48 = propertyDescriptor28.isExpert();
        propertyDescriptor28.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method51 = propertyDescriptor28.getReadMethod();
        java.lang.String str52 = propertyDescriptor28.getShortDescription();
        boolean boolean53 = type20.equals((java.lang.Object) str52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        boolean boolean13 = type5.equals((java.lang.Object) classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        propertyDescriptor3.setValue("", (java.lang.Object) strArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.Class<?> wildcardClass23 = signature21.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass18, wildcardClass23 };
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.Class<?> wildcardClass32 = propertyDescriptor31.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, false, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray37);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.String str43 = propertyDescriptor42.getShortDescription();
        java.lang.reflect.Method method44 = propertyDescriptor42.getWriteMethod();
        propertyDescriptor42.setValue("double", (java.lang.Object) ' ');
        boolean boolean48 = propertyDescriptor42.isExpert();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        java.lang.Class<?> wildcardClass54 = propertyDescriptor53.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        propertyDescriptor42.setValue("float", (java.lang.Object) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo57 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo58 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass54);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass54);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray61, true, true);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray64);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor31", propertyDescriptor3.equals(propertyDescriptor31) ? propertyDescriptor3.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()B");
        int int2 = type1.getSort();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass2, wildcardClass7 };
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type16 = signature15.getReturnType();
        java.lang.String str17 = signature15.getName();
        org.mockito.asm.Type type18 = signature15.getReturnType();
        java.lang.String str19 = signature15.getDescriptor();
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        boolean boolean27 = signature15.equals((java.lang.Object) strArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.Class<?> wildcardClass32 = signature30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, false);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        org.mockito.asm.Type type21 = classInfo19.getType();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.Class<?> wildcardClass26 = signature24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean32 = classInfo29.equals((java.lang.Object) type31);
        org.mockito.asm.Type[] typeArray33 = classInfo29.getInterfaces();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        java.lang.String str40 = propertyDescriptor37.getShortDescription();
        propertyDescriptor37.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor37.setExpert(false);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        java.lang.String str50 = propertyDescriptor49.getShortDescription();
        java.lang.reflect.Method method51 = propertyDescriptor49.getWriteMethod();
        propertyDescriptor49.setBound(false);
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor37.createPropertyEditor((java.lang.Object) propertyDescriptor49);
        propertyDescriptor37.setShortDescription("hi!");
        boolean boolean57 = classInfo29.equals((java.lang.Object) propertyDescriptor37);
        org.mockito.asm.Type type58 = classInfo29.getType();
        boolean boolean59 = classInfo19.equals((java.lang.Object) classInfo29);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("hi!", method61, method62);
        java.lang.String str64 = propertyDescriptor63.getShortDescription();
        java.lang.reflect.Method method65 = propertyDescriptor63.getWriteMethod();
        java.lang.String str66 = propertyDescriptor63.getShortDescription();
        propertyDescriptor63.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method70 = null;
        propertyDescriptor63.setReadMethod(method70);
        propertyDescriptor63.setDisplayName("double");
        java.lang.String str74 = propertyDescriptor63.getDisplayName();
        propertyDescriptor63.setConstrained(false);
        propertyDescriptor63.setName("()Ljava/lang/Object;");
        java.lang.reflect.Method method79 = propertyDescriptor63.getReadMethod();
        boolean boolean80 = classInfo29.equals((java.lang.Object) propertyDescriptor63);
        org.mockito.asm.Type type81 = classInfo29.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor63", propertyDescriptor3.equals(propertyDescriptor63) ? propertyDescriptor3.hashCode() == propertyDescriptor63.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("double", (java.lang.Object) ' ');
        boolean boolean29 = propertyDescriptor23.isExpert();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor34.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        propertyDescriptor23.setValue("float", (java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor23.getPropertyEditorClass();
        java.lang.reflect.Method method39 = propertyDescriptor23.getReadMethod();
        java.lang.reflect.Method method40 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setPreferred(false);
        boolean boolean43 = propertyDescriptor23.isExpert();
        propertyDescriptor23.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method46 = propertyDescriptor23.getReadMethod();
        propertyDescriptor23.setPreferred(true);
        java.lang.reflect.Method method49 = propertyDescriptor23.getWriteMethod();
        java.lang.String str50 = propertyDescriptor23.getShortDescription();
        boolean boolean51 = propertyDescriptor3.equals((java.lang.Object) str50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor23", propertyDescriptor17.equals(propertyDescriptor23) ? propertyDescriptor17.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(3);
        int int3 = type0.getSize();
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(VBLhi!;SD)B; values={byte=0}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DBBBD)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        java.lang.String str17 = type16.getDescriptor();
        java.lang.String str18 = type16.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type16.getDimensions();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(3);
        java.lang.String str5 = type1.getDescriptor();
        int int7 = type1.getOpcode(0);
        java.lang.String str8 = type1.getClassName();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.Class<?> wildcardClass13 = signature11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type16 = classInfo15.getSuperType();
        java.lang.String str17 = type16.getInternalName();
        java.lang.String str18 = type16.getInternalName();
        java.lang.String str19 = type16.getInternalName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(3);
        java.lang.String str39 = type35.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type33, type35, type40, type42, type44 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type32, type48, type51, type53, type54 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSort();
        int int64 = type61.getOpcode(3);
        java.lang.String str65 = type61.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BYTE_TYPE;
        int int67 = type66.getSort();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BYTE_TYPE;
        int int69 = type68.getSort();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str71 = type70.getClassName();
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type59, type61, type66, type68, type70 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray72);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type24, typeArray72);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray72);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray72);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=V]", type1, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int80 = type1.getDimensions();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byteB", "Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("java.lang.Object", method5, method6);
        boolean boolean8 = signature2.equals((java.lang.Object) "java.lang.Object");
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        boolean boolean16 = propertyDescriptor12.isPreferred();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type21 = signature20.getReturnType();
        java.lang.String str22 = signature20.getName();
        org.mockito.asm.Type type23 = signature20.getReturnType();
        propertyDescriptor12.setValue("B", (java.lang.Object) type23);
        propertyDescriptor12.setShortDescription("double");
        propertyDescriptor12.setHidden(true);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor12.attributeNames();
        boolean boolean30 = signature2.equals((java.lang.Object) propertyDescriptor12);
        java.lang.String str31 = signature2.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor12", propertyDescriptor7.equals(propertyDescriptor12) ? propertyDescriptor7.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        org.mockito.asm.Type type33 = classInfo18.getSuperType();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration39 = propertyDescriptor37.attributeNames();
        java.lang.String str40 = propertyDescriptor37.getName();
        java.lang.String str41 = propertyDescriptor37.getName();
        propertyDescriptor37.setDisplayName("byteB");
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        java.lang.String str48 = propertyDescriptor47.getShortDescription();
        java.lang.reflect.Method method49 = propertyDescriptor47.getWriteMethod();
        propertyDescriptor47.setValue("double", (java.lang.Object) ' ');
        boolean boolean53 = propertyDescriptor47.isExpert();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        java.lang.Class<?> wildcardClass59 = propertyDescriptor58.getClass();
        java.lang.String str60 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        propertyDescriptor47.setValue("float", (java.lang.Object) wildcardClass59);
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor37.createPropertyEditor((java.lang.Object) propertyDescriptor47);
        propertyDescriptor47.setShortDescription("F");
        boolean boolean65 = classInfo18.equals((java.lang.Object) propertyDescriptor47);
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("(DBBBD)F", method67, method68);
        boolean boolean70 = classInfo18.equals((java.lang.Object) method67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor69", propertyDescriptor3.equals(propertyDescriptor69) ? propertyDescriptor3.hashCode() == propertyDescriptor69.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        boolean boolean33 = classInfo18.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type34 = classInfo18.getType();
        org.mockito.asm.Type type35 = classInfo18.getType();
        int int36 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray37 = classInfo18.getInterfaces();
        org.mockito.asm.Type[] typeArray38 = classInfo18.getInterfaces();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.String str43 = propertyDescriptor42.getShortDescription();
        java.lang.reflect.Method method44 = propertyDescriptor42.getWriteMethod();
        java.lang.String str45 = propertyDescriptor42.getShortDescription();
        propertyDescriptor42.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor42.setExpert(false);
        java.lang.Class<?> wildcardClass51 = propertyDescriptor42.getPropertyEditorClass();
        java.lang.reflect.Method method52 = propertyDescriptor42.getReadMethod();
        java.lang.String str53 = propertyDescriptor42.getDisplayName();
        java.util.Enumeration<java.lang.String> strEnumeration54 = propertyDescriptor42.attributeNames();
        propertyDescriptor42.setName("");
        java.util.Enumeration<java.lang.String> strEnumeration57 = propertyDescriptor42.attributeNames();
        boolean boolean58 = classInfo18.equals((java.lang.Object) strEnumeration57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor42", propertyDescriptor3.equals(propertyDescriptor42) ? propertyDescriptor3.hashCode() == propertyDescriptor42.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setShortDescription("float");
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("B", method24, method25);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor12.createPropertyEditor((java.lang.Object) method25);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor12.attributeNames();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(DBBBD)V; displayName=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        propertyDescriptor3.setPreferred(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor26", propertyDescriptor12.equals(propertyDescriptor26) ? propertyDescriptor12.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()B");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        java.lang.String str6 = propertyDescriptor5.getShortDescription();
        java.lang.reflect.Method method7 = propertyDescriptor5.getWriteMethod();
        propertyDescriptor5.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor5.setName("double");
        propertyDescriptor5.setExpert(false);
        propertyDescriptor5.setShortDescription("F");
        boolean boolean17 = type1.equals((java.lang.Object) "F");
        int int18 = type1.getSort();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.String str23 = propertyDescriptor22.getDisplayName();
        boolean boolean24 = propertyDescriptor22.isHidden();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type31 = classInfo30.getSuperType();
        boolean boolean32 = type1.equals((java.lang.Object) type31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor22", propertyDescriptor5.equals(propertyDescriptor22) ? propertyDescriptor5.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray8);
        org.mockito.asm.Type type14 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type14.getElementType();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Zjava.beans.PropertyDescriptor[name=hi!; values={byte=0}; bound]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type12);
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setShortDescription("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getDisplayName();
        boolean boolean38 = propertyDescriptor36.isHidden();
        propertyDescriptor36.setHidden(false);
        boolean boolean41 = classInfo18.equals((java.lang.Object) propertyDescriptor36);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.String str47 = propertyDescriptor46.getShortDescription();
        java.lang.reflect.Method method48 = propertyDescriptor46.getWriteMethod();
        java.lang.String str49 = propertyDescriptor46.getShortDescription();
        propertyDescriptor46.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor46.setConstrained(false);
        propertyDescriptor46.setHidden(false);
        propertyDescriptor46.setExpert(true);
        java.lang.reflect.Method method59 = propertyDescriptor46.getWriteMethod();
        boolean boolean60 = propertyDescriptor46.isHidden();
        propertyDescriptor46.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        java.lang.reflect.Method method63 = propertyDescriptor46.getWriteMethod();
        propertyDescriptor36.setValue("char", (java.lang.Object) propertyDescriptor46);
        boolean boolean65 = propertyDescriptor36.isPreferred();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        propertyDescriptor13.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor13.setShortDescription("float");
        propertyDescriptor13.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("B", method25, method26);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor13.createPropertyEditor((java.lang.Object) method26);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor13.attributeNames();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor13.getPropertyEditorClass();
        propertyDescriptor13.setExpert(false);
        propertyDescriptor13.setShortDescription("C");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=float; bound]", (java.lang.Object) propertyDescriptor13);
        java.lang.String str36 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor27", propertyDescriptor13.equals(propertyDescriptor27) ? propertyDescriptor13.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("double");
        java.lang.String str12 = propertyDescriptor3.getName();
        propertyDescriptor3.setBound(true);
        java.lang.String str15 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("LLorg/mockito/cglib/core/Signature;;");
        propertyDescriptor3.setValue("", (java.lang.Object) type18);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        java.lang.String str26 = propertyDescriptor23.getShortDescription();
        propertyDescriptor23.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor23.setShortDescription("float");
        propertyDescriptor23.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("B", method35, method36);
        java.beans.PropertyEditor propertyEditor38 = propertyDescriptor23.createPropertyEditor((java.lang.Object) method36);
        java.util.Enumeration<java.lang.String> strEnumeration39 = propertyDescriptor23.attributeNames();
        boolean boolean40 = type18.equals((java.lang.Object) propertyDescriptor23);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.String str46 = propertyDescriptor45.getShortDescription();
        java.lang.reflect.Method method47 = propertyDescriptor45.getWriteMethod();
        propertyDescriptor45.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor45.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor45.setDisplayName("");
        java.lang.reflect.Method method55 = propertyDescriptor45.getWriteMethod();
        propertyDescriptor45.setName("org.mockito.asm.Type");
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]", (java.lang.Object) "org.mockito.asm.Type");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor37 and propertyDescriptor45", propertyDescriptor37.equals(propertyDescriptor45) ? propertyDescriptor37.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.String str25 = propertyDescriptor24.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration26 = propertyDescriptor24.attributeNames();
        java.lang.String str27 = propertyDescriptor24.getName();
        java.lang.String str28 = propertyDescriptor24.getName();
        propertyDescriptor24.setDisplayName("byteB");
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.String str35 = propertyDescriptor34.getShortDescription();
        java.lang.reflect.Method method36 = propertyDescriptor34.getWriteMethod();
        propertyDescriptor34.setValue("double", (java.lang.Object) ' ');
        boolean boolean40 = propertyDescriptor34.isExpert();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.Class<?> wildcardClass46 = propertyDescriptor45.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        propertyDescriptor34.setValue("float", (java.lang.Object) wildcardClass46);
        java.beans.PropertyEditor propertyEditor49 = propertyDescriptor24.createPropertyEditor((java.lang.Object) propertyDescriptor34);
        propertyDescriptor24.setName("(DBBBD)B");
        propertyDescriptor24.setName("java.beans.PropertyDescriptor[name=hi!; shortDescription=java.beans.PropertyDescriptor[name=hi!]; preferred; hidden; values={byte=0}]");
        boolean boolean54 = classInfo20.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; shortDescription=java.beans.PropertyDescriptor[name=hi!]; preferred; hidden; values={byte=0}]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.Class<?> wildcardClass5 = propertyDescriptor4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = classInfo6.getType();
        int int9 = type7.getOpcode(5);
        int int10 = type7.getSort();
        int int11 = type7.getDimensions();
        java.lang.String str12 = type7.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.FLOAT_TYPE;
        int int15 = type13.getOpcode((int) (byte) 0);
        int int16 = type13.getSort();
        int int18 = type13.getOpcode((int) (short) 100);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.Class<?> wildcardClass23 = signature21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type26 = classInfo25.getSuperType();
        org.mockito.asm.Type type27 = classInfo25.getType();
        org.mockito.asm.Type[] typeArray28 = classInfo25.getInterfaces();
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("byteBLorg/mockito/cglib/core/Signature;", type7, typeArray28);
        java.lang.String str31 = type7.getDescriptor();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method34, method35);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type41 = signature40.getReturnType();
        java.lang.Class<?> wildcardClass42 = signature40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type[] typeArray46 = classInfo45.getInterfaces();
        propertyDescriptor36.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo45);
        org.mockito.asm.Type type48 = classInfo45.getType();
        org.mockito.asm.Type type49 = classInfo45.getType();
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type53 = signature52.getReturnType();
        java.lang.Class<?> wildcardClass54 = signature52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo57 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type58 = classInfo57.getSuperType();
        org.mockito.asm.Type[] typeArray59 = classInfo57.getInterfaces();
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type49, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor36", propertyDescriptor4.equals(propertyDescriptor36) ? propertyDescriptor4.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass2, wildcardClass7 };
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type16 = signature15.getReturnType();
        java.lang.String str17 = signature15.getName();
        org.mockito.asm.Type type18 = signature15.getReturnType();
        java.lang.String str19 = signature15.getDescriptor();
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        boolean boolean27 = signature15.equals((java.lang.Object) strArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.Class<?> wildcardClass32 = signature30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, false);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        int int40 = type39.getSort();
        java.lang.Class<?> wildcardClass41 = type39.getClass();
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type45 = signature44.getReturnType();
        java.lang.Class<?> wildcardClass46 = signature44.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass41, wildcardClass46 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        int int54 = type53.getSort();
        java.lang.Class<?> wildcardClass55 = type53.getClass();
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type59 = signature58.getReturnType();
        java.lang.Class<?> wildcardClass60 = signature58.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass60);
        java.lang.Class[] classArray62 = new java.lang.Class[] { wildcardClass55, wildcardClass60 };
        java.lang.String[] strArray63 = org.mockito.cglib.core.ReflectUtils.getNames(classArray62);
        java.lang.Class[] classArray64 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray62);
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray62);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type69 = signature68.getReturnType();
        java.lang.Class<?> wildcardClass70 = signature68.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass70);
        java.lang.String str72 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass70);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray74, true, true);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray65, methodArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray78);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        java.lang.String str18 = type17.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type17.getElementType();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setShortDescription("float");
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("B", method24, method25);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor12.createPropertyEditor((java.lang.Object) method25);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor12.attributeNames();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(DBBBD)V; displayName=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.String str35 = propertyDescriptor12.getShortDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor26", propertyDescriptor3.equals(propertyDescriptor26) ? propertyDescriptor3.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("V", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        java.lang.String str21 = type16.getClassName();
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        boolean boolean24 = type16.equals((java.lang.Object) classArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        propertyDescriptor14.setValue("", (java.lang.Object) strArray25);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", (java.lang.Object) "");
        propertyDescriptor3.setShortDescription("F(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method30 = null;
        propertyDescriptor3.setReadMethod(method30);
        boolean boolean32 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        java.lang.String str39 = propertyDescriptor36.getShortDescription();
        java.lang.Object obj41 = propertyDescriptor36.getValue("hi!byteB");
        java.lang.String str42 = propertyDescriptor36.getName();
        java.util.Enumeration<java.lang.String> strEnumeration43 = propertyDescriptor36.attributeNames();
        java.lang.reflect.Method method44 = null;
        propertyDescriptor36.setReadMethod(method44);
        java.util.Enumeration<java.lang.String> strEnumeration46 = propertyDescriptor36.attributeNames();
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor3.createPropertyEditor((java.lang.Object) strEnumeration46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor36", propertyDescriptor14.equals(propertyDescriptor36) ? propertyDescriptor14.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setShortDescription("float");
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("B", method24, method25);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor12.createPropertyEditor((java.lang.Object) method25);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor12.attributeNames();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(DBBBD)V; displayName=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.reflect.Method method35 = null;
        propertyDescriptor12.setWriteMethod(method35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor26", propertyDescriptor3.equals(propertyDescriptor26) ? propertyDescriptor3.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor12.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setValue("byte", (java.lang.Object) propertyDescriptor12);
        boolean boolean21 = propertyDescriptor12.isExpert();
        propertyDescriptor12.setName("java/beans/PropertyDescriptor");
        java.lang.String str24 = propertyDescriptor12.getName();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor12.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor12", propertyDescriptor3.equals(propertyDescriptor12) ? propertyDescriptor3.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(3);
        java.lang.String str5 = type1.getDescriptor();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type9 = signature8.getReturnType();
        java.lang.Class<?> wildcardClass10 = signature8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean16 = classInfo13.equals((java.lang.Object) type15);
        org.mockito.asm.Type[] typeArray17 = classInfo13.getInterfaces();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!]", type1, typeArray17);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.String str23 = propertyDescriptor22.getShortDescription();
        propertyDescriptor22.setExpert(true);
        java.lang.String str26 = propertyDescriptor22.getName();
        propertyDescriptor22.setBound(false);
        boolean boolean29 = signature18.equals((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]", method31, method32);
        boolean boolean34 = signature18.equals((java.lang.Object) "org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor33", propertyDescriptor22.equals(propertyDescriptor33) ? propertyDescriptor22.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        java.lang.String str12 = propertyDescriptor9.getShortDescription();
        propertyDescriptor9.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor9.setShortDescription("float");
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("B", method21, method22);
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor9.createPropertyEditor((java.lang.Object) method22);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor9.attributeNames();
        propertyDescriptor9.setPreferred(false);
        boolean boolean28 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor9.getPropertyEditorClass();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor23", propertyDescriptor9.equals(propertyDescriptor23) ? propertyDescriptor9.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int3 = type0.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        propertyDescriptor13.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor13.setShortDescription("float");
        propertyDescriptor13.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("B", method25, method26);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor13.createPropertyEditor((java.lang.Object) method26);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor13.attributeNames();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor13.getPropertyEditorClass();
        propertyDescriptor13.setExpert(false);
        propertyDescriptor13.setShortDescription("C");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=float; bound]", (java.lang.Object) propertyDescriptor13);
        boolean boolean36 = propertyDescriptor13.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor27", propertyDescriptor3.equals(propertyDescriptor27) ? propertyDescriptor3.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        java.lang.String str33 = classInfo18.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("(DBBBD)V");
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.String str40 = propertyDescriptor39.getShortDescription();
        java.lang.reflect.Method method41 = propertyDescriptor39.getWriteMethod();
        java.lang.String str42 = propertyDescriptor39.getShortDescription();
        propertyDescriptor39.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method46 = null;
        propertyDescriptor39.setReadMethod(method46);
        boolean boolean48 = propertyDescriptor39.isExpert();
        propertyDescriptor39.setName("(VBLhi!;SD)B");
        boolean boolean51 = type35.equals((java.lang.Object) propertyDescriptor39);
        boolean boolean52 = classInfo18.equals((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor39", propertyDescriptor3.equals(propertyDescriptor39) ? propertyDescriptor3.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass11, wildcardClass16 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type26 = signature25.getReturnType();
        java.lang.Class<?> wildcardClass27 = signature25.getClass();
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray29 = new java.lang.Class[] { wildcardClass22, wildcardClass27 };
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.reflect.Method[] methodArray31 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray31);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type36 = signature35.getReturnType();
        java.lang.String str37 = signature35.getName();
        org.mockito.asm.Type type38 = signature35.getReturnType();
        java.lang.String str39 = signature35.getDescriptor();
        java.lang.Class[] classArray40 = new java.lang.Class[] {};
        int int41 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray40);
        int int42 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray40);
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray40);
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray40);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        boolean boolean47 = signature35.equals((java.lang.Object) strArray46);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type51 = signature50.getReturnType();
        java.lang.Class<?> wildcardClass52 = signature50.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass52);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray53, true, false);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray56);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BYTE_TYPE;
        int int60 = type59.getSort();
        java.lang.Class<?> wildcardClass61 = type59.getClass();
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type65 = signature64.getReturnType();
        java.lang.Class<?> wildcardClass66 = signature64.getClass();
        java.lang.String str67 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.lang.Class[] classArray68 = new java.lang.Class[] { wildcardClass61, wildcardClass66 };
        java.lang.String[] strArray69 = org.mockito.cglib.core.ReflectUtils.getNames(classArray68);
        java.lang.reflect.Method[] methodArray70 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray71 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray69, methodArray70);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray70);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray73);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("DBBBD)Lhi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        java.lang.reflect.Method method26 = null;
        propertyDescriptor3.setWriteMethod(method26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        propertyDescriptor31.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method38 = null;
        propertyDescriptor31.setReadMethod(method38);
        boolean boolean40 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setExpert(true);
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) true);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("long");
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(DBBBD)B");
        java.lang.String str48 = type47.getClassName();
        boolean boolean49 = type45.equals((java.lang.Object) type47);
        int int50 = type45.getSize();
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type45);
        int int52 = type45.getDimensions();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=D]", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getShortDescription();
        java.lang.reflect.Method method9 = propertyDescriptor7.getWriteMethod();
        propertyDescriptor7.setValue("double", (java.lang.Object) ' ');
        boolean boolean13 = propertyDescriptor7.isExpert();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        propertyDescriptor7.setValue("float", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor7.getPropertyEditorClass();
        java.lang.reflect.Method method23 = propertyDescriptor7.getReadMethod();
        java.lang.reflect.Method method24 = propertyDescriptor7.getWriteMethod();
        propertyDescriptor7.setPreferred(false);
        boolean boolean27 = propertyDescriptor7.isExpert();
        propertyDescriptor7.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        java.lang.reflect.Method method30 = null;
        propertyDescriptor7.setWriteMethod(method30);
        propertyDescriptor7.setDisplayName("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        propertyDescriptor7.setDisplayName("byteB");
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "byteB");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor18", propertyDescriptor7.equals(propertyDescriptor18) ? propertyDescriptor7.hashCode() == propertyDescriptor18.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        int int3 = type0.getOpcode((int) 'a');
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}](VBLhi!;SD)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str15 = type14.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type14, type16, type21, type23, type25 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray27);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSize();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str36 = type35.getClassName();
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type13, type29, type32, type34, type35 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str41 = type40.getClassName();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        int int45 = type42.getOpcode(3);
        java.lang.String str46 = type42.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BYTE_TYPE;
        int int50 = type49.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type40, type42, type47, type49, type51 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray53);
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray53);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray53);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type5, typeArray53);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray53);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        int int61 = type59.getOpcode((int) (byte) 0);
        int int62 = type59.getSort();
        int int64 = type59.getOpcode((int) (short) 100);
        java.lang.String str65 = type59.toString();
        boolean boolean66 = signature58.equals((java.lang.Object) str65);
        org.mockito.asm.Type type67 = signature58.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str68 = type67.getInternalName();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setShortDescription("float");
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("B", method24, method25);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor12.createPropertyEditor((java.lang.Object) method25);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor12.attributeNames();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(DBBBD)V; displayName=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.Object obj36 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor26", propertyDescriptor12.equals(propertyDescriptor26) ? propertyDescriptor12.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byteB", "Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("java.lang.Object", method5, method6);
        boolean boolean8 = signature2.equals((java.lang.Object) "java.lang.Object");
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("byteB", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getName();
        boolean boolean14 = propertyDescriptor12.isHidden();
        boolean boolean15 = signature2.equals((java.lang.Object) propertyDescriptor12);
        java.lang.String str16 = signature2.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor12", propertyDescriptor7.equals(propertyDescriptor12) ? propertyDescriptor7.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        int int4 = type0.getOpcode(14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getDisplayName();
        boolean boolean9 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getClass();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor3.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        java.lang.String str36 = propertyDescriptor35.getDisplayName();
        boolean boolean37 = propertyDescriptor35.isHidden();
        propertyDescriptor35.setHidden(false);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("hi!", method42, method43);
        java.lang.String str45 = propertyDescriptor44.getShortDescription();
        java.lang.reflect.Method method46 = propertyDescriptor44.getWriteMethod();
        propertyDescriptor44.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor44.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor35.setValue("byte", (java.lang.Object) propertyDescriptor44);
        java.lang.Class<?> wildcardClass53 = propertyDescriptor35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass53);
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass53);
        java.beans.PropertyDescriptor[] propertyDescriptorArray56 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getDescriptor();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        int int16 = type14.getSize();
        int int17 = type14.getSort();
        java.lang.String str18 = type14.getDescriptor();
        java.lang.String str19 = type14.toString();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("(DBBBD)B", method21, method22);
        propertyDescriptor23.setHidden(false);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.Class<?> wildcardClass30 = propertyDescriptor29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type32 = classInfo31.getType();
        java.beans.PropertyEditor propertyEditor33 = propertyDescriptor23.createPropertyEditor((java.lang.Object) type32);
        propertyDescriptor23.setHidden(true);
        java.lang.reflect.Method method36 = propertyDescriptor23.getWriteMethod();
        boolean boolean37 = type14.equals((java.lang.Object) method36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        int int8 = type5.getOpcode(3);
        java.lang.String str9 = type5.getClassName();
        java.lang.String str10 = type5.getClassName();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        boolean boolean13 = type5.equals((java.lang.Object) classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        propertyDescriptor3.setValue("", (java.lang.Object) strArray14);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.String str20 = propertyDescriptor19.getShortDescription();
        java.lang.reflect.Method method21 = propertyDescriptor19.getWriteMethod();
        java.lang.String str22 = propertyDescriptor19.getShortDescription();
        propertyDescriptor19.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor19.setShortDescription("float");
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.beans.PropertyEditor propertyEditor32 = propertyDescriptor19.createPropertyEditor((java.lang.Object) classArray28);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSort();
        java.lang.Class<?> wildcardClass36 = type34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, true, true);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, false, true);
        propertyDescriptor19.setValue("LbyteB;", (java.lang.Object) propertyDescriptorArray38);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, false, false);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor19", propertyDescriptor3.equals(propertyDescriptor19) ? propertyDescriptor3.hashCode() == propertyDescriptor19.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.lang.Object obj8 = propertyDescriptor3.getValue("hi!byteB");
        java.lang.String str9 = propertyDescriptor3.getName();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = null;
        propertyDescriptor3.setReadMethod(method11);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.String str17 = propertyDescriptor16.getShortDescription();
        java.lang.reflect.Method method18 = propertyDescriptor16.getWriteMethod();
        propertyDescriptor16.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor16.setName("double");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        java.lang.String str28 = propertyDescriptor27.getShortDescription();
        java.lang.reflect.Method method29 = propertyDescriptor27.getWriteMethod();
        java.lang.String str30 = propertyDescriptor27.getShortDescription();
        propertyDescriptor27.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor27.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean36 = propertyDescriptor27.isExpert();
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor16.createPropertyEditor((java.lang.Object) boolean36);
        propertyDescriptor16.setShortDescription("Lorg/mockito/cglib/core/Signature;");
        boolean boolean40 = propertyDescriptor16.isExpert();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.String str46 = propertyDescriptor45.getShortDescription();
        java.lang.reflect.Method method47 = propertyDescriptor45.getWriteMethod();
        java.lang.String str48 = propertyDescriptor45.getShortDescription();
        propertyDescriptor45.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method52 = null;
        propertyDescriptor45.setReadMethod(method52);
        java.lang.Object obj55 = propertyDescriptor45.getValue("java/beans/PropertyDescriptor");
        java.lang.String str56 = propertyDescriptor45.getDisplayName();
        java.lang.reflect.Method method57 = propertyDescriptor45.getReadMethod();
        java.lang.reflect.Method method58 = propertyDescriptor45.getReadMethod();
        boolean boolean59 = propertyDescriptor45.isExpert();
        propertyDescriptor16.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=Lhi!;; shortDescription=java.beans.PropertyDescriptor[name=hi!]; values={byte=0}]", (java.lang.Object) propertyDescriptor45);
        java.beans.PropertyEditor propertyEditor61 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; displayName=Lhi!;; shortDescription=java.beans.PropertyDescriptor[name=hi!]; values={byte=0}]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor27", propertyDescriptor16.equals(propertyDescriptor27) ? propertyDescriptor16.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setConstrained(false);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyType();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type19 = classInfo18.getSuperType();
        java.lang.String str20 = type19.getInternalName();
        java.lang.String str21 = type19.getInternalName();
        java.lang.String str22 = type19.getInternalName();
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type19);
        int int24 = type19.getDimensions();
        int int26 = type19.getOpcode(39);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        java.lang.String str32 = signature30.getName();
        org.mockito.asm.Type type33 = signature30.getReturnType();
        java.lang.String str34 = signature30.getDescriptor();
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        int int37 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray35);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        boolean boolean42 = signature30.equals((java.lang.Object) strArray41);
        java.lang.String str43 = signature30.getDescriptor();
        org.mockito.asm.Type type44 = signature30.getReturnType();
        org.mockito.asm.Type type45 = signature30.getReturnType();
        java.lang.String str46 = type45.getDescriptor();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method49, method50);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type56 = signature55.getReturnType();
        java.lang.Class<?> wildcardClass57 = signature55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        org.mockito.cglib.core.ClassInfo classInfo59 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass57);
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type[] typeArray61 = classInfo60.getInterfaces();
        propertyDescriptor51.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo60);
        org.mockito.asm.Type type63 = classInfo60.getType();
        org.mockito.asm.Type type64 = classInfo60.getType();
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type68 = signature67.getReturnType();
        java.lang.Class<?> wildcardClass69 = signature67.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        org.mockito.asm.Type type73 = classInfo72.getSuperType();
        org.mockito.asm.Type[] typeArray74 = classInfo72.getInterfaces();
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type64, typeArray74);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type45, typeArray74);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor3.setShortDescription("hi!");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method24 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("byteB", method28, method29);
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor30", propertyDescriptor15.equals(propertyDescriptor30) ? propertyDescriptor15.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type5 = signature4.getReturnType();
        java.lang.Class<?> wildcardClass6 = signature4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        org.mockito.asm.Type type10 = classInfo8.getType();
        org.mockito.asm.Type type11 = classInfo8.getSuperType();
        int int12 = classInfo8.getModifiers();
        org.mockito.asm.Type[] typeArray13 = classInfo8.getInterfaces();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("LDBBBD)Lhi!;", type1, typeArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type1.getElementType();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BYTE_TYPE;
        int int4 = type3.getSort();
        int int6 = type3.getOpcode(3);
        java.lang.String str7 = type3.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BYTE_TYPE;
        int int9 = type8.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getClassName();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type1, type3, type8, type10, type12 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        java.lang.String str16 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type0.getDimensions();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type19 = classInfo18.getSuperType();
        java.lang.String str20 = type19.getInternalName();
        java.lang.String str21 = type19.getClassName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.FLOAT_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str30 = type29.getDescriptor();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type34 = signature33.getReturnType();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        int int41 = type38.getOpcode(3);
        java.lang.String str42 = type38.getClassName();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        int int44 = type43.getSort();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str48 = type47.getClassName();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type36, type38, type43, type45, type47 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        int int52 = type51.getSize();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str55 = type54.getDescriptor();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type35, type51, type54, type56, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.BYTE_TYPE;
        int int65 = type64.getSort();
        int int67 = type64.getOpcode(3);
        java.lang.String str68 = type64.getClassName();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BYTE_TYPE;
        int int70 = type69.getSort();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BYTE_TYPE;
        int int72 = type71.getSort();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str74 = type73.getClassName();
        org.mockito.asm.Type[] typeArray75 = new org.mockito.asm.Type[] { type62, type64, type69, type71, type73 };
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray75);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray75);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray75);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type27, typeArray75);
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("hi!", type23, typeArray75);
        org.mockito.cglib.core.Signature signature81 = new org.mockito.cglib.core.Signature("F", type19, typeArray75);
        java.beans.PropertyEditor propertyEditor82 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature81);
        org.mockito.asm.Type type83 = signature81.getReturnType();
        org.mockito.asm.Type[] typeArray84 = signature81.getArgumentTypes();
        java.lang.reflect.Method method86 = null;
        java.lang.reflect.Method method87 = null;
        java.beans.PropertyDescriptor propertyDescriptor88 = new java.beans.PropertyDescriptor("B", method86, method87);
        propertyDescriptor88.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        java.util.Enumeration<java.lang.String> strEnumeration91 = propertyDescriptor88.attributeNames();
        propertyDescriptor88.setExpert(true);
        propertyDescriptor88.setShortDescription("LD;");
        propertyDescriptor88.setShortDescription("java.beans.PropertyDescriptor[name=hi!; displayName=V; constrained]");
        boolean boolean98 = signature81.equals((java.lang.Object) propertyDescriptor88);
        java.lang.String str99 = signature81.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor88", propertyDescriptor3.equals(propertyDescriptor88) ? propertyDescriptor3.hashCode() == propertyDescriptor88.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=B]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.String str3 = type2.getClassName();
        org.mockito.asm.Type[] typeArray5 = org.mockito.asm.Type.getArgumentTypes("org/mockito/asm/Type(VBLhi!;SD)B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("java/lang/Object", type2, typeArray5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 0);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        java.lang.String str28 = signature24.getDescriptor();
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray29);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        boolean boolean36 = signature24.equals((java.lang.Object) strArray35);
        java.lang.String str37 = signature24.getDescriptor();
        java.lang.String str38 = signature24.getDescriptor();
        propertyDescriptor3.setValue("J", (java.lang.Object) signature24);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.String str46 = propertyDescriptor45.getDisplayName();
        boolean boolean47 = propertyDescriptor45.isHidden();
        propertyDescriptor45.setName("(DBBBD)Lhi!;");
        java.lang.reflect.Method method50 = propertyDescriptor45.getReadMethod();
        propertyDescriptor45.setBound(false);
        propertyDescriptor45.setHidden(false);
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor45", propertyDescriptor17.equals(propertyDescriptor45) ? propertyDescriptor17.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        java.lang.String str28 = signature24.getDescriptor();
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray29);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        boolean boolean36 = signature24.equals((java.lang.Object) strArray35);
        java.lang.String str37 = signature24.getDescriptor();
        java.lang.String str38 = signature24.getDescriptor();
        propertyDescriptor3.setValue("J", (java.lang.Object) signature24);
        java.lang.String str40 = signature24.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        java.lang.Class<?> wildcardClass7 = signature5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getShortDescription();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        java.lang.String str17 = propertyDescriptor14.getDisplayName();
        boolean boolean18 = classInfo10.equals((java.lang.Object) str17);
        org.mockito.asm.Type[] typeArray19 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type2, typeArray19);
        java.lang.String str21 = signature20.getName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method28 = propertyDescriptor26.getWriteMethod();
        propertyDescriptor26.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor26.setShortDescription("");
        propertyDescriptor26.setConstrained(true);
        propertyDescriptor26.setExpert(false);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor26.getPropertyType();
        propertyDescriptor26.setDisplayName("java.beans.PropertyDescriptor[name=hi!; preferred]");
        java.lang.reflect.Method method41 = propertyDescriptor26.getWriteMethod();
        boolean boolean42 = type22.equals((java.lang.Object) propertyDescriptor26);
        boolean boolean43 = signature20.equals((java.lang.Object) propertyDescriptor26);
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        java.lang.String str48 = propertyDescriptor47.getShortDescription();
        java.lang.reflect.Method method49 = propertyDescriptor47.getWriteMethod();
        java.lang.String str50 = propertyDescriptor47.getShortDescription();
        boolean boolean51 = propertyDescriptor47.isPreferred();
        java.lang.reflect.Method method52 = null;
        propertyDescriptor47.setReadMethod(method52);
        propertyDescriptor47.setPreferred(true);
        propertyDescriptor47.setDisplayName("float");
        propertyDescriptor47.setName("B");
        java.lang.reflect.Method method60 = propertyDescriptor47.getWriteMethod();
        java.lang.reflect.Method method61 = propertyDescriptor47.getWriteMethod();
        boolean boolean62 = propertyDescriptor26.equals((java.lang.Object) method61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor47", propertyDescriptor14.equals(propertyDescriptor47) ? propertyDescriptor14.hashCode() == propertyDescriptor47.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setName("double");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getShortDescription();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        java.lang.String str17 = propertyDescriptor14.getShortDescription();
        propertyDescriptor14.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor14.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean23 = propertyDescriptor14.isExpert();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean23);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.String str30 = propertyDescriptor29.getShortDescription();
        java.lang.reflect.Method method31 = propertyDescriptor29.getWriteMethod();
        java.lang.String str32 = propertyDescriptor29.getShortDescription();
        propertyDescriptor29.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor29.setExpert(false);
        java.lang.reflect.Method method38 = null;
        propertyDescriptor29.setWriteMethod(method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor29.getPropertyEditorClass();
        propertyDescriptor29.setDisplayName("org/mockito/cglib/core/Signature");
        java.lang.Object obj44 = propertyDescriptor29.getValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        propertyDescriptor29.setBound(true);
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("(DBBBD)B", method49, method50);
        java.lang.reflect.Method method52 = null;
        propertyDescriptor51.setReadMethod(method52);
        propertyDescriptor51.setExpert(false);
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("hi!", method58, method59);
        java.lang.String str61 = propertyDescriptor60.getShortDescription();
        java.lang.reflect.Method method62 = propertyDescriptor60.getWriteMethod();
        java.lang.String str63 = propertyDescriptor60.getShortDescription();
        boolean boolean64 = propertyDescriptor60.isPreferred();
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type69 = signature68.getReturnType();
        java.lang.String str70 = signature68.getName();
        org.mockito.asm.Type type71 = signature68.getReturnType();
        propertyDescriptor60.setValue("B", (java.lang.Object) type71);
        propertyDescriptor60.setShortDescription("double");
        propertyDescriptor60.setHidden(true);
        propertyDescriptor60.setPreferred(false);
        java.lang.String str79 = propertyDescriptor60.getShortDescription();
        propertyDescriptor51.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor60);
        propertyDescriptor29.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor60);
        propertyDescriptor3.setValue("float()L!;", (java.lang.Object) "java/lang/Object");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor51", propertyDescriptor14.equals(propertyDescriptor51) ? propertyDescriptor14.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getShortDescription();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        propertyDescriptor14.setValue("double", (java.lang.Object) ' ');
        boolean boolean20 = propertyDescriptor14.isExpert();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("hi!", method23, method24);
        java.lang.Class<?> wildcardClass26 = propertyDescriptor25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        propertyDescriptor14.setValue("float", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor14.getPropertyEditorClass();
        java.lang.reflect.Method method30 = propertyDescriptor14.getReadMethod();
        java.lang.reflect.Method method31 = propertyDescriptor14.getWriteMethod();
        propertyDescriptor14.setPreferred(false);
        boolean boolean34 = propertyDescriptor14.isExpert();
        propertyDescriptor14.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        propertyDescriptor14.setShortDescription("Ljava/lang/Object;");
        java.lang.reflect.Method method39 = null;
        propertyDescriptor14.setReadMethod(method39);
        java.lang.reflect.Method method41 = propertyDescriptor14.getReadMethod();
        boolean boolean42 = propertyDescriptor14.isExpert();
        boolean boolean43 = propertyDescriptor3.equals((java.lang.Object) boolean42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor25", propertyDescriptor14.equals(propertyDescriptor25) ? propertyDescriptor14.hashCode() == propertyDescriptor25.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.toString();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.lang.String str9 = propertyDescriptor8.getShortDescription();
        java.lang.reflect.Method method10 = propertyDescriptor8.getWriteMethod();
        java.lang.String str11 = propertyDescriptor8.getShortDescription();
        propertyDescriptor8.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor8.setExpert(false);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor8.getPropertyEditorClass();
        java.lang.reflect.Method method18 = null;
        propertyDescriptor8.setWriteMethod(method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor8.getPropertyType();
        java.util.Enumeration<java.lang.String> strEnumeration21 = propertyDescriptor8.attributeNames();
        propertyDescriptor8.setName("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        boolean boolean24 = signature2.equals((java.lang.Object) propertyDescriptor8);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type30 = signature29.getReturnType();
        java.lang.Class<?> wildcardClass31 = signature29.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type36 = signature35.getReturnType();
        java.lang.Class<?> wildcardClass37 = signature35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass37);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type[] typeArray40 = classInfo39.getInterfaces();
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", type32, typeArray40);
        org.mockito.asm.Type type42 = type32.getElementType();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.Class<?> wildcardClass49 = propertyDescriptor48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type55 = signature54.getReturnType();
        java.lang.String str56 = signature54.getName();
        org.mockito.asm.Type type57 = signature54.getReturnType();
        java.lang.String str58 = signature54.getDescriptor();
        java.lang.Class[] classArray59 = new java.lang.Class[] {};
        int int60 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        int int61 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        int int62 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        java.lang.Class[] classArray63 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray59);
        java.lang.String[] strArray64 = org.mockito.cglib.core.ReflectUtils.getNames(classArray63);
        java.lang.String[] strArray65 = org.mockito.cglib.core.ReflectUtils.getNames(classArray63);
        boolean boolean66 = signature54.equals((java.lang.Object) strArray65);
        java.lang.String str67 = signature54.getDescriptor();
        org.mockito.asm.Type type68 = signature54.getReturnType();
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str71 = type70.getClassName();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BYTE_TYPE;
        int int73 = type72.getSort();
        int int75 = type72.getOpcode(3);
        java.lang.String str76 = type72.getClassName();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BYTE_TYPE;
        int int78 = type77.getSort();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        int int80 = type79.getSort();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str82 = type81.getClassName();
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] { type70, type72, type77, type79, type81 };
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray83);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type68, typeArray83);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray83);
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("java.lang.Object", type44, typeArray83);
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("Ljava/beans/PropertyDescriptor;", type42, typeArray83);
        boolean boolean89 = signature2.equals((java.lang.Object) "Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor48", propertyDescriptor8.equals(propertyDescriptor48) ? propertyDescriptor8.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(103);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type5.getInternalName();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(13);
        int int8 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type5.getInternalName();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setDisplayName("DBBBD)Lhi!");
        java.lang.String str23 = propertyDescriptor3.getShortDescription();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str27 = signature26.toString();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]", method29, method30);
        java.lang.Object obj33 = propertyDescriptor31.getValue("ava.beans.PropertyDescriptor[name=hi!");
        boolean boolean34 = signature26.equals((java.lang.Object) propertyDescriptor31);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor31.getPropertyType();
        java.lang.String str36 = propertyDescriptor31.getDisplayName();
        java.lang.reflect.Method method37 = null;
        propertyDescriptor31.setReadMethod(method37);
        boolean boolean39 = propertyDescriptor3.equals((java.lang.Object) method37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor31", propertyDescriptor17.equals(propertyDescriptor31) ? propertyDescriptor17.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        boolean boolean33 = classInfo18.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type34 = classInfo18.getSuperType();
        org.mockito.asm.Type[] typeArray35 = classInfo18.getInterfaces();
        org.mockito.asm.Type type36 = classInfo18.getSuperType();
        java.lang.String str37 = classInfo18.toString();
        org.mockito.asm.Type type38 = classInfo18.getType();
        int int39 = classInfo18.getModifiers();
        java.lang.String str40 = classInfo18.toString();
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("(DBBBD)B", method42, method43);
        propertyDescriptor44.setHidden(false);
        java.util.Enumeration<java.lang.String> strEnumeration47 = propertyDescriptor44.attributeNames();
        boolean boolean48 = classInfo18.equals((java.lang.Object) propertyDescriptor44);
        int int49 = classInfo18.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor44", propertyDescriptor3.equals(propertyDescriptor44) ? propertyDescriptor3.hashCode() == propertyDescriptor44.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        propertyDescriptor13.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor13.setShortDescription("float");
        propertyDescriptor13.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("B", method25, method26);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor13.createPropertyEditor((java.lang.Object) method26);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor13.attributeNames();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor13.getPropertyEditorClass();
        propertyDescriptor13.setExpert(false);
        propertyDescriptor13.setShortDescription("C");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=float; bound]", (java.lang.Object) propertyDescriptor13);
        boolean boolean36 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor27", propertyDescriptor13.equals(propertyDescriptor27) ? propertyDescriptor13.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        java.lang.String str16 = signature2.getDescriptor();
        java.lang.String str17 = signature2.getName();
        org.mockito.asm.Type type18 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type18.getInternalName();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Lhi!;float", method1, method2);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type7 = signature6.getReturnType();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method9, method10);
        boolean boolean12 = signature6.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        java.lang.String str13 = signature6.getName();
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature6);
        org.mockito.asm.Type type15 = signature6.getReturnType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor11", propertyDescriptor3.equals(propertyDescriptor11) ? propertyDescriptor3.hashCode() == propertyDescriptor11.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)V", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getDisplayName();
        boolean boolean9 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getClass();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor7", propertyDescriptor3.equals(propertyDescriptor7) ? propertyDescriptor3.hashCode() == propertyDescriptor7.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        java.lang.String str15 = signature11.getDescriptor();
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        boolean boolean23 = signature11.equals((java.lang.Object) strArray22);
        java.lang.String str24 = signature11.getDescriptor();
        org.mockito.asm.Type type25 = signature11.getReturnType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getClassName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BYTE_TYPE;
        int int30 = type29.getSort();
        int int32 = type29.getOpcode(3);
        java.lang.String str33 = type29.getClassName();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BYTE_TYPE;
        int int37 = type36.getSort();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type27, type29, type34, type36, type38 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type25, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray40);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("java.lang.Object", type1, typeArray40);
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("ava.beans.PropertyDescriptor[name=hi!", method46, method47);
        propertyDescriptor48.setShortDescription("Ljava.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor];");
        boolean boolean51 = signature44.equals((java.lang.Object) "Ljava.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor];");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor48", propertyDescriptor5.equals(propertyDescriptor48) ? propertyDescriptor5.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(DBBBD)V;");
        int int2 = type1.getSize();
        int int4 = type1.getOpcode(19);
        java.lang.String str5 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("double", method1, method2);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; shortDescription=floatLLorg/mockito/cglib/core/Signature;;; values={B=B}]");
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.lang.String str11 = propertyDescriptor10.getShortDescription();
        java.lang.reflect.Method method12 = propertyDescriptor10.getWriteMethod();
        java.lang.String str13 = propertyDescriptor10.getDisplayName();
        propertyDescriptor10.setHidden(true);
        propertyDescriptor10.setHidden(true);
        java.lang.Object obj19 = propertyDescriptor10.getValue("int");
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.String str25 = propertyDescriptor24.getDisplayName();
        boolean boolean26 = propertyDescriptor24.isHidden();
        propertyDescriptor24.setHidden(false);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        java.lang.String str34 = propertyDescriptor33.getShortDescription();
        java.lang.reflect.Method method35 = propertyDescriptor33.getWriteMethod();
        propertyDescriptor33.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor33.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor24.setValue("byte", (java.lang.Object) propertyDescriptor33);
        java.lang.Class<?> wildcardClass42 = propertyDescriptor24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        propertyDescriptor10.setValue("java.beans.PropertyDescriptor[name=(VBLhi!;SD)B; values={byte=0}]", (java.lang.Object) propertyDescriptorArray44);
        propertyDescriptor3.setValue("()L!;", (java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 0);
        int int3 = type0.getSort();
        int int5 = type0.getOpcode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("V", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        java.lang.String str21 = type16.getClassName();
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        boolean boolean24 = type16.equals((java.lang.Object) classArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        propertyDescriptor14.setValue("", (java.lang.Object) strArray25);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", (java.lang.Object) "");
        propertyDescriptor3.setShortDescription("F(DBBBD)Ljava/lang/Object;");
        boolean boolean30 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.String str35 = propertyDescriptor34.getShortDescription();
        java.lang.reflect.Method method36 = propertyDescriptor34.getWriteMethod();
        java.lang.String str37 = propertyDescriptor34.getShortDescription();
        boolean boolean38 = propertyDescriptor34.isPreferred();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type43 = signature42.getReturnType();
        java.lang.String str44 = signature42.getName();
        org.mockito.asm.Type type45 = signature42.getReturnType();
        propertyDescriptor34.setValue("B", (java.lang.Object) type45);
        java.lang.Object obj48 = propertyDescriptor34.getValue("double");
        java.lang.reflect.Method method49 = null;
        propertyDescriptor34.setReadMethod(method49);
        boolean boolean51 = propertyDescriptor34.isExpert();
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type56 = signature55.getReturnType();
        java.lang.Class<?> wildcardClass57 = signature55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass57);
        propertyDescriptor34.setValue("float()L!;", (java.lang.Object) propertyDescriptorArray58);
        boolean boolean60 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptorArray58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor34", propertyDescriptor14.equals(propertyDescriptor34) ? propertyDescriptor14.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str6 = classInfo5.toString();
        org.mockito.asm.Type type7 = classInfo5.getSuperType();
        org.mockito.asm.Type type8 = classInfo5.getSuperType();
        java.lang.String str9 = classInfo5.toString();
        int int10 = classInfo5.getModifiers();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getDisplayName();
        boolean boolean16 = propertyDescriptor14.isHidden();
        propertyDescriptor14.setName("(DBBBD)Lhi!;");
        java.lang.reflect.Method method19 = propertyDescriptor14.getReadMethod();
        boolean boolean20 = classInfo5.equals((java.lang.Object) method19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("V", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        java.lang.String str21 = type16.getClassName();
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        boolean boolean24 = type16.equals((java.lang.Object) classArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        propertyDescriptor14.setValue("", (java.lang.Object) strArray25);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", (java.lang.Object) "");
        propertyDescriptor3.setShortDescription("F(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method30 = null;
        propertyDescriptor3.setReadMethod(method30);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        java.lang.reflect.Method method39 = null;
        propertyDescriptor36.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor36.getPropertyType();
        propertyDescriptor36.setConstrained(false);
        boolean boolean44 = propertyDescriptor36.isExpert();
        propertyDescriptor3.setValue("()B", (java.lang.Object) propertyDescriptor36);
        propertyDescriptor3.setBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor36", propertyDescriptor14.equals(propertyDescriptor36) ? propertyDescriptor14.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("V", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        java.lang.String str21 = type16.getClassName();
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        boolean boolean24 = type16.equals((java.lang.Object) classArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        propertyDescriptor14.setValue("", (java.lang.Object) strArray25);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", (java.lang.Object) "");
        propertyDescriptor3.setShortDescription("F(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method30 = null;
        propertyDescriptor3.setReadMethod(method30);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        java.lang.reflect.Method method39 = null;
        propertyDescriptor36.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor36.getPropertyType();
        propertyDescriptor36.setConstrained(false);
        boolean boolean44 = propertyDescriptor36.isExpert();
        propertyDescriptor3.setValue("()B", (java.lang.Object) propertyDescriptor36);
        java.lang.String str46 = propertyDescriptor3.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor36", propertyDescriptor14.equals(propertyDescriptor36) ? propertyDescriptor14.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        java.lang.String str15 = propertyDescriptor12.getShortDescription();
        propertyDescriptor12.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setShortDescription("float");
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("B", method24, method25);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor12.createPropertyEditor((java.lang.Object) method25);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor12.attributeNames();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(DBBBD)V; displayName=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor12.getPropertyType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor26", propertyDescriptor3.equals(propertyDescriptor26) ? propertyDescriptor3.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(DBBBD)V;");
        int int2 = type1.getSize();
        int int4 = type1.getOpcode(19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type17.getInternalName();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type8 = signature7.getReturnType();
        java.lang.Class<?> wildcardClass9 = signature7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type[] typeArray13 = classInfo12.getInterfaces();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo12);
        org.mockito.asm.Type type15 = classInfo12.getType();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type19 = signature18.getReturnType();
        java.lang.Class<?> wildcardClass20 = signature18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean26 = classInfo23.equals((java.lang.Object) type25);
        org.mockito.asm.Type[] typeArray27 = classInfo23.getInterfaces();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        java.lang.String str34 = propertyDescriptor31.getShortDescription();
        propertyDescriptor31.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor31.setExpert(false);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        java.lang.String str44 = propertyDescriptor43.getShortDescription();
        java.lang.reflect.Method method45 = propertyDescriptor43.getWriteMethod();
        propertyDescriptor43.setBound(false);
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor43);
        propertyDescriptor31.setShortDescription("hi!");
        boolean boolean51 = classInfo23.equals((java.lang.Object) propertyDescriptor31);
        org.mockito.asm.Type type52 = classInfo23.getType();
        org.mockito.asm.Type[] typeArray53 = classInfo23.getInterfaces();
        org.mockito.asm.Type[] typeArray54 = classInfo23.getInterfaces();
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor31", propertyDescriptor3.equals(propertyDescriptor31) ? propertyDescriptor3.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        java.lang.String str8 = signature2.getName();
        java.lang.String str9 = signature2.getDescriptor();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str13 = signature12.toString();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        org.mockito.asm.Type type15 = signature12.getReturnType();
        boolean boolean16 = signature2.equals((java.lang.Object) type15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type15.getDimensions();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.Class<?> wildcardClass24 = signature22.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass19, wildcardClass24 };
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray26);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        java.lang.Class<?> wildcardClass40 = type38.getClass();
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type44 = signature43.getReturnType();
        java.lang.Class<?> wildcardClass45 = signature43.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass40, wildcardClass45 };
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        java.lang.reflect.Method[] methodArray49 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray49);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray49);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray52);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.Class[] classArray4 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.Class<?> wildcardClass13 = signature11.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass8, wildcardClass13 };
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        int int18 = type17.getSort();
        int int20 = type17.getOpcode(3);
        java.lang.String str21 = type17.getClassName();
        java.lang.String str22 = type17.getClassName();
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        boolean boolean25 = type17.equals((java.lang.Object) classArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.Class<?> wildcardClass34 = signature32.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray36 = new java.lang.Class[] { wildcardClass29, wildcardClass34 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        java.lang.reflect.Method[] methodArray38 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray38);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray38);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray38);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray38);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BYTE_TYPE;
        int int44 = type43.getSort();
        java.lang.Class<?> wildcardClass45 = type43.getClass();
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type49 = signature48.getReturnType();
        java.lang.Class<?> wildcardClass50 = signature48.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass45, wildcardClass50 };
        java.lang.String[] strArray53 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type58 = signature57.getReturnType();
        java.lang.String str59 = signature57.getName();
        org.mockito.asm.Type type60 = signature57.getReturnType();
        java.lang.String str61 = signature57.getDescriptor();
        java.lang.Class[] classArray62 = new java.lang.Class[] {};
        int int63 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray62);
        int int64 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray62);
        int int65 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray62);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray62);
        java.lang.String[] strArray67 = org.mockito.cglib.core.ReflectUtils.getNames(classArray66);
        java.lang.String[] strArray68 = org.mockito.cglib.core.ReflectUtils.getNames(classArray66);
        boolean boolean69 = signature57.equals((java.lang.Object) strArray68);
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type73 = signature72.getReturnType();
        java.lang.Class<?> wildcardClass74 = signature72.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass74);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray75, true, false);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray68, methodArray78);
        java.lang.reflect.Method[] methodArray80 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray54, methodArray79);
        java.lang.Class[] classArray81 = new java.lang.Class[] {};
        int int82 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray81);
        java.lang.String[] strArray83 = org.mockito.cglib.core.ReflectUtils.getNames(classArray81);
        org.mockito.asm.Type type84 = org.mockito.asm.Type.BYTE_TYPE;
        int int85 = type84.getSort();
        java.lang.Class<?> wildcardClass86 = type84.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray87 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass86);
        java.beans.PropertyDescriptor[] propertyDescriptorArray88 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass86);
        java.lang.reflect.Method[] methodArray91 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray88, true, true);
        java.lang.reflect.Method[] methodArray92 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray83, methodArray91);
        java.lang.Class[] classArray93 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray91);
        java.lang.reflect.Method[] methodArray94 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray54, methodArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray95 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray94);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type12);
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setShortDescription("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = type5.getDescriptor();
        int int8 = type5.getOpcode(11);
        java.lang.String str9 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type5.getElementType();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 10);
        int int4 = type0.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getDisplayName();
        boolean boolean38 = propertyDescriptor36.isHidden();
        propertyDescriptor36.setHidden(false);
        boolean boolean41 = classInfo18.equals((java.lang.Object) propertyDescriptor36);
        java.lang.String str42 = classInfo18.toString();
        java.lang.String str43 = classInfo18.toString();
        org.mockito.asm.Type type44 = classInfo18.getType();
        int int45 = classInfo18.getModifiers();
        org.mockito.asm.Type type46 = classInfo18.getType();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("D", method48, method49);
        java.lang.reflect.Method method51 = null;
        propertyDescriptor50.setWriteMethod(method51);
        boolean boolean53 = propertyDescriptor50.isExpert();
        boolean boolean54 = propertyDescriptor50.isPreferred();
        java.lang.Object obj56 = propertyDescriptor50.getValue("java.beans.PropertyDescriptor[name=(VBLhi!;SD)B; values={byte=0}]");
        boolean boolean57 = type46.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=(VBLhi!;SD)B; values={byte=0}]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor50", propertyDescriptor3.equals(propertyDescriptor50) ? propertyDescriptor3.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.String str26 = signature24.getName();
        org.mockito.asm.Type type27 = signature24.getReturnType();
        java.lang.String str28 = signature24.getDescriptor();
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray29);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        boolean boolean36 = signature24.equals((java.lang.Object) strArray35);
        java.lang.String str37 = signature24.getDescriptor();
        java.lang.String str38 = signature24.getDescriptor();
        propertyDescriptor3.setValue("J", (java.lang.Object) signature24);
        java.lang.String str40 = signature24.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        org.mockito.asm.Type type33 = classInfo18.getSuperType();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration39 = propertyDescriptor37.attributeNames();
        java.lang.String str40 = propertyDescriptor37.getName();
        java.lang.String str41 = propertyDescriptor37.getName();
        propertyDescriptor37.setDisplayName("byteB");
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        java.lang.String str48 = propertyDescriptor47.getShortDescription();
        java.lang.reflect.Method method49 = propertyDescriptor47.getWriteMethod();
        propertyDescriptor47.setValue("double", (java.lang.Object) ' ');
        boolean boolean53 = propertyDescriptor47.isExpert();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        java.lang.Class<?> wildcardClass59 = propertyDescriptor58.getClass();
        java.lang.String str60 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        propertyDescriptor47.setValue("float", (java.lang.Object) wildcardClass59);
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor37.createPropertyEditor((java.lang.Object) propertyDescriptor47);
        propertyDescriptor47.setShortDescription("F");
        boolean boolean65 = classInfo18.equals((java.lang.Object) propertyDescriptor47);
        org.mockito.asm.Type type66 = classInfo18.getSuperType();
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Method method69 = null;
        java.beans.PropertyDescriptor propertyDescriptor70 = new java.beans.PropertyDescriptor("hi!", method68, method69);
        java.lang.String str71 = propertyDescriptor70.getShortDescription();
        java.lang.reflect.Method method72 = propertyDescriptor70.getWriteMethod();
        propertyDescriptor70.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor70.setName("double");
        propertyDescriptor70.setPreferred(true);
        java.lang.reflect.Method method80 = null;
        propertyDescriptor70.setWriteMethod(method80);
        java.lang.Class<?> wildcardClass82 = propertyDescriptor70.getPropertyEditorClass();
        boolean boolean83 = classInfo18.equals((java.lang.Object) wildcardClass82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor70", propertyDescriptor3.equals(propertyDescriptor70) ? propertyDescriptor3.hashCode() == propertyDescriptor70.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        java.lang.String str8 = signature2.getName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BYTE_TYPE;
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass11, wildcardClass16 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray18);
        boolean boolean23 = signature2.equals((java.lang.Object) classArray22);
        org.mockito.asm.Type type24 = signature2.getReturnType();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getShortDescription();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        java.lang.String str31 = propertyDescriptor28.getShortDescription();
        propertyDescriptor28.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor28.setShortDescription("float");
        java.lang.Class[] classArray37 = new java.lang.Class[] {};
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        java.beans.PropertyEditor propertyEditor41 = propertyDescriptor28.createPropertyEditor((java.lang.Object) classArray37);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray37);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        boolean boolean45 = signature2.equals((java.lang.Object) classArray43);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        java.lang.String str50 = propertyDescriptor49.getShortDescription();
        java.lang.reflect.Method method51 = propertyDescriptor49.getWriteMethod();
        java.lang.reflect.Method method52 = null;
        propertyDescriptor49.setWriteMethod(method52);
        java.lang.Class<?> wildcardClass54 = propertyDescriptor49.getPropertyType();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("hi!", method56, method57);
        java.lang.String str59 = propertyDescriptor58.getShortDescription();
        java.lang.reflect.Method method60 = propertyDescriptor58.getWriteMethod();
        java.lang.String str61 = propertyDescriptor58.getShortDescription();
        propertyDescriptor58.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor58.setShortDescription("float");
        propertyDescriptor58.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Method method71 = null;
        java.beans.PropertyDescriptor propertyDescriptor72 = new java.beans.PropertyDescriptor("B", method70, method71);
        java.beans.PropertyEditor propertyEditor73 = propertyDescriptor58.createPropertyEditor((java.lang.Object) method71);
        java.util.Enumeration<java.lang.String> strEnumeration74 = propertyDescriptor58.attributeNames();
        java.lang.Class<?> wildcardClass75 = propertyDescriptor58.getPropertyEditorClass();
        propertyDescriptor58.setExpert(false);
        propertyDescriptor58.setShortDescription("java.beans.PropertyDescriptor[name=(DBBBD)V; displayName=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.beans.PropertyEditor propertyEditor80 = propertyDescriptor49.createPropertyEditor((java.lang.Object) propertyDescriptor58);
        boolean boolean81 = signature2.equals((java.lang.Object) propertyDescriptor58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor28 and propertyDescriptor72", propertyDescriptor28.equals(propertyDescriptor72) ? propertyDescriptor28.hashCode() == propertyDescriptor72.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setWriteMethod(method5);
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        propertyDescriptor13.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor13.setConstrained(false);
        propertyDescriptor13.setHidden(false);
        java.lang.String str24 = propertyDescriptor13.getDisplayName();
        propertyDescriptor13.setDisplayName("java.beans.PropertyDescriptor");
        java.lang.Class<?> wildcardClass27 = propertyDescriptor13.getPropertyType();
        java.lang.reflect.Method method28 = propertyDescriptor13.getWriteMethod();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.Class<?> wildcardClass34 = signature32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type37 = classInfo36.getSuperType();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type44 = signature43.getReturnType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        int int49 = type48.getSort();
        int int51 = type48.getOpcode(3);
        java.lang.String str52 = type48.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        int int54 = type53.getSort();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BYTE_TYPE;
        int int56 = type55.getSort();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str58 = type57.getClassName();
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type46, type48, type53, type55, type57 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSize();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str65 = type64.getDescriptor();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str68 = type67.getClassName();
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type45, type61, type64, type66, type67 };
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray69);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str73 = type72.getClassName();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.BYTE_TYPE;
        int int75 = type74.getSort();
        int int77 = type74.getOpcode(3);
        java.lang.String str78 = type74.getClassName();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        int int80 = type79.getSort();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.BYTE_TYPE;
        int int82 = type81.getSort();
        org.mockito.asm.Type type83 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str84 = type83.getClassName();
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] { type72, type74, type79, type81, type83 };
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type71, typeArray85);
        java.lang.String str87 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray85);
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray85);
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("", type37, typeArray85);
        java.lang.String str90 = signature89.getName();
        java.beans.PropertyEditor propertyEditor91 = propertyDescriptor13.createPropertyEditor((java.lang.Object) signature89);
        java.lang.String str92 = signature89.getName();
        propertyDescriptor3.setValue("int", (java.lang.Object) signature89);
        org.mockito.asm.Type type94 = signature89.getReturnType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(DBBBD)B]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.String str7 = signature2.toString();
        org.mockito.asm.Type type8 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()Lhi!;");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        java.lang.String str6 = propertyDescriptor5.getShortDescription();
        java.lang.reflect.Method method7 = propertyDescriptor5.getWriteMethod();
        propertyDescriptor5.setValue("double", (java.lang.Object) ' ');
        boolean boolean11 = propertyDescriptor5.isExpert();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        propertyDescriptor5.setValue("float", (java.lang.Object) wildcardClass17);
        propertyDescriptor5.setHidden(true);
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor5.attributeNames();
        propertyDescriptor5.setName("java.beans.PropertyDescriptor[name=hi!; expert; bound]");
        boolean boolean25 = type1.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; expert; bound]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor16", propertyDescriptor5.equals(propertyDescriptor16) ? propertyDescriptor5.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        java.lang.String str17 = type16.getDescriptor();
        java.lang.String str18 = type16.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type16.getInternalName();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type5 = signature4.getReturnType();
        java.lang.Class<?> wildcardClass6 = signature4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        boolean boolean9 = type0.equals((java.lang.Object) wildcardClass6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type5 = signature4.getReturnType();
        java.lang.Class<?> wildcardClass6 = signature4.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type11 = signature10.getReturnType();
        java.lang.Class<?> wildcardClass12 = signature10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray15 = classInfo14.getInterfaces();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", type7, typeArray15);
        org.mockito.asm.Type type17 = type7.getElementType();
        int int18 = type7.getSize();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor22.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.String str30 = signature28.getName();
        org.mockito.asm.Type type31 = signature28.getReturnType();
        java.lang.String str32 = signature28.getDescriptor();
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        int int35 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray33);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        boolean boolean40 = signature28.equals((java.lang.Object) strArray39);
        java.lang.String str41 = signature28.getDescriptor();
        org.mockito.asm.Type type42 = signature28.getReturnType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        int int47 = type46.getSort();
        int int49 = type46.getOpcode(3);
        java.lang.String str50 = type46.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        int int52 = type51.getSort();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        int int54 = type53.getSort();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type44, type46, type51, type53, type55 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray57);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type42, typeArray57);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray57);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("C", type7, typeArray57);
        java.lang.String str62 = signature61.toString();
        java.lang.String str63 = signature61.getDescriptor();
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        java.beans.PropertyDescriptor propertyDescriptor67 = new java.beans.PropertyDescriptor("hi!", method65, method66);
        java.lang.String str68 = propertyDescriptor67.getShortDescription();
        java.lang.reflect.Method method69 = propertyDescriptor67.getWriteMethod();
        propertyDescriptor67.setValue("double", (java.lang.Object) ' ');
        boolean boolean73 = propertyDescriptor67.isExpert();
        propertyDescriptor67.setName("double");
        java.lang.String str76 = propertyDescriptor67.getName();
        propertyDescriptor67.setBound(true);
        java.lang.String str79 = propertyDescriptor67.getDisplayName();
        propertyDescriptor67.setBound(false);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type86 = signature85.getReturnType();
        java.lang.Class<?> wildcardClass87 = signature85.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray88 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass87);
        java.beans.PropertyDescriptor[] propertyDescriptorArray89 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass87);
        java.beans.PropertyDescriptor[] propertyDescriptorArray90 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass87);
        java.beans.PropertyDescriptor[] propertyDescriptorArray91 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass87);
        java.lang.String str92 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass87);
        propertyDescriptor67.setValue("Lhi!;float", (java.lang.Object) wildcardClass87);
        java.beans.PropertyDescriptor[] propertyDescriptorArray94 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass87);
        boolean boolean95 = signature61.equals((java.lang.Object) wildcardClass87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor67", propertyDescriptor22.equals(propertyDescriptor67) ? propertyDescriptor22.hashCode() == propertyDescriptor67.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.String str5 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method6 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor4.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor4.setDisplayName("");
        java.lang.reflect.Method method14 = propertyDescriptor4.getWriteMethod();
        propertyDescriptor4.setName("org.mockito.asm.Type");
        java.lang.Class<?> wildcardClass17 = propertyDescriptor4.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        int int19 = type18.getSort();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type24 = signature23.getReturnType();
        java.lang.Class<?> wildcardClass25 = signature23.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.lang.String str32 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method33 = propertyDescriptor31.getWriteMethod();
        propertyDescriptor31.setBound(false);
        java.lang.reflect.Method method36 = propertyDescriptor31.getWriteMethod();
        propertyDescriptor31.setShortDescription("java/beans/PropertyDescriptor");
        boolean boolean39 = type27.equals((java.lang.Object) propertyDescriptor31);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        java.lang.String str44 = propertyDescriptor43.getShortDescription();
        java.lang.reflect.Method method45 = propertyDescriptor43.getWriteMethod();
        java.lang.String str46 = propertyDescriptor43.getShortDescription();
        boolean boolean47 = propertyDescriptor43.isPreferred();
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type52 = signature51.getReturnType();
        java.lang.String str53 = signature51.getName();
        org.mockito.asm.Type type54 = signature51.getReturnType();
        propertyDescriptor43.setValue("B", (java.lang.Object) type54);
        propertyDescriptor43.setShortDescription("byte");
        java.lang.Class<?> wildcardClass58 = propertyDescriptor43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass58);
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type61 = classInfo60.getType();
        org.mockito.asm.Type type62 = classInfo60.getSuperType();
        org.mockito.asm.Type type63 = classInfo60.getSuperType();
        org.mockito.asm.Type[] typeArray64 = classInfo60.getInterfaces();
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/cglib/core/Signature;; values={byte=0}]", type27, typeArray64);
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={double= }; constrained]", type18, typeArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor31", propertyDescriptor4.equals(propertyDescriptor31) ? propertyDescriptor4.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.Class<?> wildcardClass5 = signature3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = classInfo7.getSuperType();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getClassName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BYTE_TYPE;
        int int20 = type19.getSort();
        int int22 = type19.getOpcode(3);
        java.lang.String str23 = type19.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BYTE_TYPE;
        int int25 = type24.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        int int27 = type26.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str29 = type28.getClassName();
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type17, type19, type24, type26, type28 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str36 = type35.getDescriptor();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type16, type32, type35, type37, type38 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str44 = type43.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        int int48 = type45.getOpcode(3);
        java.lang.String str49 = type45.getClassName();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        int int51 = type50.getSort();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BYTE_TYPE;
        int int53 = type52.getSort();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type43, type45, type50, type52, type54 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray56);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray56);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray56);
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("", type8, typeArray56);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSort();
        int int64 = type61.getOpcode(3);
        java.lang.String str65 = type61.getClassName();
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type69 = signature68.getReturnType();
        java.lang.String str70 = signature68.getName();
        boolean boolean71 = type61.equals((java.lang.Object) signature68);
        boolean boolean72 = signature60.equals((java.lang.Object) signature68);
        java.lang.String str73 = signature68.getName();
        java.lang.String str74 = signature68.getDescriptor();
        org.mockito.asm.Type type75 = signature68.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str76 = type75.getInternalName();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        int int21 = classInfo19.getModifiers();
        org.mockito.asm.Type type22 = classInfo19.getSuperType();
        int int23 = type22.getDimensions();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        java.lang.String str28 = propertyDescriptor27.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor27.attributeNames();
        java.lang.String str30 = propertyDescriptor27.getName();
        java.lang.String str31 = propertyDescriptor27.getName();
        propertyDescriptor27.setDisplayName("byteB");
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        propertyDescriptor37.setValue("double", (java.lang.Object) ' ');
        boolean boolean43 = propertyDescriptor37.isExpert();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.Class<?> wildcardClass49 = propertyDescriptor48.getClass();
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        propertyDescriptor37.setValue("float", (java.lang.Object) wildcardClass49);
        java.beans.PropertyEditor propertyEditor52 = propertyDescriptor27.createPropertyEditor((java.lang.Object) propertyDescriptor37);
        propertyDescriptor27.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor27.attributeNames();
        boolean boolean56 = propertyDescriptor27.isExpert();
        propertyDescriptor27.setDisplayName("(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method59 = null;
        propertyDescriptor27.setWriteMethod(method59);
        propertyDescriptor27.setExpert(true);
        boolean boolean63 = propertyDescriptor27.isPreferred();
        boolean boolean64 = type22.equals((java.lang.Object) boolean63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor27", propertyDescriptor3.equals(propertyDescriptor27) ? propertyDescriptor3.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]]");
        int int3 = type1.getOpcode(43);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("()V", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getName();
        boolean boolean9 = type1.equals((java.lang.Object) propertyDescriptor7);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        propertyDescriptor13.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor13.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean22 = propertyDescriptor13.isPreferred();
        propertyDescriptor13.setBound(true);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getDisplayName();
        boolean boolean30 = propertyDescriptor28.isHidden();
        propertyDescriptor28.setHidden(false);
        java.lang.Class<?> wildcardClass33 = propertyDescriptor28.getClass();
        java.lang.String str34 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor13.createPropertyEditor((java.lang.Object) wildcardClass33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        boolean boolean40 = type1.equals((java.lang.Object) wildcardClass33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor28", propertyDescriptor7.equals(propertyDescriptor28) ? propertyDescriptor7.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(DBBBD)V;");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method10 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setConstrained(true);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str16 = signature15.toString();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Lhi!;", "float");
        java.lang.String str20 = signature19.getName();
        boolean boolean21 = signature15.equals((java.lang.Object) signature19);
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("B", method23, method24);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.Class<?> wildcardClass30 = propertyDescriptor29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        java.beans.PropertyEditor propertyEditor32 = propertyDescriptor25.createPropertyEditor((java.lang.Object) wildcardClass30);
        boolean boolean33 = signature15.equals((java.lang.Object) propertyDescriptor25);
        java.lang.String str34 = propertyDescriptor25.getName();
        java.lang.Object obj36 = propertyDescriptor25.getValue("()Lorg/mockito/cglib/core/Signature;");
        boolean boolean37 = propertyDescriptor3.equals((java.lang.Object) "()Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor25 and propertyDescriptor29", propertyDescriptor25.equals(propertyDescriptor29) ? propertyDescriptor25.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        boolean boolean5 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor", method9, method10);
        java.beans.PropertyEditor propertyEditor12 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method9);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean14 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("()J", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getPropertyType();
        boolean boolean20 = propertyDescriptor3.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor18", propertyDescriptor11.equals(propertyDescriptor18) ? propertyDescriptor11.hashCode() == propertyDescriptor18.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("Lava.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor;", method8, method9);
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("byteB", method15, method16);
        propertyDescriptor17.setBound(false);
        boolean boolean20 = propertyDescriptor3.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor17", propertyDescriptor10.equals(propertyDescriptor17) ? propertyDescriptor10.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "(DBBBD)V");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor8.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.String str16 = signature14.getName();
        org.mockito.asm.Type type17 = signature14.getReturnType();
        java.lang.String str18 = signature14.getDescriptor();
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray19);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        boolean boolean26 = signature14.equals((java.lang.Object) strArray25);
        java.lang.String str27 = signature14.getDescriptor();
        org.mockito.asm.Type type28 = signature14.getReturnType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(3);
        java.lang.String str36 = type32.getClassName();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BYTE_TYPE;
        int int38 = type37.getSort();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BYTE_TYPE;
        int int40 = type39.getSort();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str42 = type41.getClassName();
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type30, type32, type37, type39, type41 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray43);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type28, typeArray43);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray43);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("java.lang.Object", type4, typeArray43);
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.String str49 = signature47.toString();
        boolean boolean50 = signature2.equals((java.lang.Object) str49);
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("hi!", method52, method53);
        java.lang.String str55 = propertyDescriptor54.getDisplayName();
        boolean boolean56 = propertyDescriptor54.isHidden();
        propertyDescriptor54.setHidden(false);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("hi!", method61, method62);
        java.lang.String str64 = propertyDescriptor63.getShortDescription();
        java.lang.reflect.Method method65 = propertyDescriptor63.getWriteMethod();
        propertyDescriptor63.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor63.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor54.setValue("byte", (java.lang.Object) propertyDescriptor63);
        boolean boolean72 = propertyDescriptor63.isExpert();
        propertyDescriptor63.setName("java/beans/PropertyDescriptor");
        java.lang.String str75 = propertyDescriptor63.getName();
        java.util.Enumeration<java.lang.String> strEnumeration76 = propertyDescriptor63.attributeNames();
        java.lang.Class<?> wildcardClass77 = propertyDescriptor63.getPropertyType();
        propertyDescriptor63.setDisplayName("()B");
        boolean boolean80 = signature2.equals((java.lang.Object) "()B");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor63", propertyDescriptor8.equals(propertyDescriptor63) ? propertyDescriptor8.hashCode() == propertyDescriptor63.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.Class<?> wildcardClass14 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setDisplayName("org/mockito/cglib/core/Signature");
        java.lang.Object obj18 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("(DBBBD)B", method23, method24);
        java.lang.reflect.Method method26 = null;
        propertyDescriptor25.setReadMethod(method26);
        propertyDescriptor25.setExpert(false);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.String str35 = propertyDescriptor34.getShortDescription();
        java.lang.reflect.Method method36 = propertyDescriptor34.getWriteMethod();
        java.lang.String str37 = propertyDescriptor34.getShortDescription();
        boolean boolean38 = propertyDescriptor34.isPreferred();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type43 = signature42.getReturnType();
        java.lang.String str44 = signature42.getName();
        org.mockito.asm.Type type45 = signature42.getReturnType();
        propertyDescriptor34.setValue("B", (java.lang.Object) type45);
        propertyDescriptor34.setShortDescription("double");
        propertyDescriptor34.setHidden(true);
        propertyDescriptor34.setPreferred(false);
        java.lang.String str53 = propertyDescriptor34.getShortDescription();
        propertyDescriptor25.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor34);
        propertyDescriptor3.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor34);
        java.lang.Class<?> wildcardClass56 = propertyDescriptor3.getPropertyType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor25 and propertyDescriptor34", propertyDescriptor25.equals(propertyDescriptor34) ? propertyDescriptor25.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor13.setShortDescription("F");
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("B", method32, method33);
        boolean boolean35 = propertyDescriptor34.isExpert();
        propertyDescriptor34.setShortDescription("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        boolean boolean38 = propertyDescriptor34.isPreferred();
        boolean boolean39 = propertyDescriptor13.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor34", propertyDescriptor3.equals(propertyDescriptor34) ? propertyDescriptor3.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        int int3 = type1.getOpcode((int) (short) 10);
        java.lang.String str4 = type1.getDescriptor();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.lang.String str9 = propertyDescriptor8.getShortDescription();
        java.lang.reflect.Method method10 = propertyDescriptor8.getWriteMethod();
        propertyDescriptor8.setValue("double", (java.lang.Object) ' ');
        boolean boolean14 = propertyDescriptor8.isExpert();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        propertyDescriptor8.setValue("float", (java.lang.Object) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.String str28 = signature26.getName();
        org.mockito.asm.Type type29 = signature26.getReturnType();
        boolean boolean30 = classInfo23.equals((java.lang.Object) type29);
        java.lang.String str31 = classInfo23.toString();
        org.mockito.asm.Type type32 = classInfo23.getSuperType();
        org.mockito.asm.Type[] typeArray33 = classInfo23.getInterfaces();
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("java/beans/FeatureDescriptor", type1, typeArray33);
        java.lang.String str35 = signature34.getDescriptor();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.String str40 = propertyDescriptor39.getShortDescription();
        java.lang.reflect.Method method41 = propertyDescriptor39.getWriteMethod();
        propertyDescriptor39.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor39.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor39.setDisplayName("");
        propertyDescriptor39.setExpert(true);
        java.lang.Class<?> wildcardClass51 = propertyDescriptor39.getPropertyType();
        java.lang.String str52 = propertyDescriptor39.getShortDescription();
        propertyDescriptor39.setName("java.beans.PropertyDescriptor[name=hi!; expert]()Ljava/beans/PropertyDescriptor;");
        java.lang.String str55 = propertyDescriptor39.getShortDescription();
        propertyDescriptor39.setShortDescription("()LLorg/mockito/cglib/core/Signature;");
        boolean boolean58 = signature34.equals((java.lang.Object) "()LLorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor39", propertyDescriptor8.equals(propertyDescriptor39) ? propertyDescriptor8.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(DBBBD)V;");
        int int2 = type1.getSize();
        java.lang.String str3 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("V", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        int int17 = type16.getSort();
        int int19 = type16.getOpcode(3);
        java.lang.String str20 = type16.getClassName();
        java.lang.String str21 = type16.getClassName();
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        boolean boolean24 = type16.equals((java.lang.Object) classArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        propertyDescriptor14.setValue("", (java.lang.Object) strArray25);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", (java.lang.Object) "");
        propertyDescriptor3.setShortDescription("F(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method30 = null;
        propertyDescriptor3.setReadMethod(method30);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getShortDescription();
        java.lang.reflect.Method method38 = propertyDescriptor36.getWriteMethod();
        java.lang.reflect.Method method39 = null;
        propertyDescriptor36.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor36.getPropertyType();
        propertyDescriptor36.setConstrained(false);
        boolean boolean44 = propertyDescriptor36.isExpert();
        propertyDescriptor3.setValue("()B", (java.lang.Object) propertyDescriptor36);
        java.lang.reflect.Method method46 = propertyDescriptor3.getWriteMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor36", propertyDescriptor14.equals(propertyDescriptor36) ? propertyDescriptor14.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        int int21 = classInfo19.getModifiers();
        org.mockito.asm.Type type22 = classInfo19.getSuperType();
        java.lang.Object obj23 = new java.lang.Object();
        boolean boolean24 = classInfo19.equals(obj23);
        org.mockito.asm.Type type25 = classInfo19.getType();
        org.mockito.asm.Type[] typeArray26 = classInfo19.getInterfaces();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("B", method28, method29);
        boolean boolean31 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setShortDescription("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        boolean boolean34 = classInfo19.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.Class<?> wildcardClass5 = signature3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = classInfo7.getSuperType();
        java.lang.String str9 = type8.getInternalName();
        java.lang.String str10 = type8.getClassName();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getShortDescription();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        propertyDescriptor14.setValue("double", (java.lang.Object) ' ');
        boolean boolean20 = propertyDescriptor14.isExpert();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("hi!", method23, method24);
        java.lang.Class<?> wildcardClass26 = propertyDescriptor25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        propertyDescriptor14.setValue("float", (java.lang.Object) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.String str34 = signature32.getName();
        org.mockito.asm.Type type35 = signature32.getReturnType();
        boolean boolean36 = classInfo29.equals((java.lang.Object) type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str39 = type38.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        int int43 = type40.getOpcode(3);
        java.lang.String str44 = type40.getClassName();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BYTE_TYPE;
        int int48 = type47.getSort();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.getClassName();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type38, type40, type45, type47, type49 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray51);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("org.mockito.cglib.core.Signature", type8, typeArray51);
        java.lang.String str55 = signature54.getDescriptor();
        java.lang.String str56 = signature54.getName();
        java.lang.Object obj57 = null;
        boolean boolean58 = signature54.equals(obj57);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getReturnType("(DBBBD)B");
        java.lang.String str61 = type60.getClassName();
        int int63 = type60.getOpcode(5);
        boolean boolean64 = signature54.equals((java.lang.Object) type60);
        org.mockito.asm.Type type65 = signature54.getReturnType();
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("hi!", method67, method68);
        java.lang.String str70 = propertyDescriptor69.getShortDescription();
        java.lang.reflect.Method method71 = propertyDescriptor69.getWriteMethod();
        propertyDescriptor69.setValue("double", (java.lang.Object) ' ');
        boolean boolean75 = propertyDescriptor69.isExpert();
        java.lang.reflect.Method method78 = null;
        java.lang.reflect.Method method79 = null;
        java.beans.PropertyDescriptor propertyDescriptor80 = new java.beans.PropertyDescriptor("hi!", method78, method79);
        java.lang.Class<?> wildcardClass81 = propertyDescriptor80.getClass();
        java.lang.String str82 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass81);
        propertyDescriptor69.setValue("float", (java.lang.Object) wildcardClass81);
        java.lang.Class<?> wildcardClass84 = propertyDescriptor69.getPropertyEditorClass();
        java.lang.reflect.Method method85 = propertyDescriptor69.getReadMethod();
        java.lang.reflect.Method method86 = propertyDescriptor69.getWriteMethod();
        propertyDescriptor69.setPreferred(false);
        boolean boolean89 = propertyDescriptor69.isExpert();
        propertyDescriptor69.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method92 = propertyDescriptor69.getReadMethod();
        java.lang.String str93 = propertyDescriptor69.getShortDescription();
        java.lang.reflect.Method method94 = propertyDescriptor69.getReadMethod();
        boolean boolean95 = signature54.equals((java.lang.Object) method94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor69", propertyDescriptor14.equals(propertyDescriptor69) ? propertyDescriptor14.hashCode() == propertyDescriptor69.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = type5.getDescriptor();
        java.lang.String str7 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type5.getElementType();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", method1, method2);
        java.lang.Object obj4 = null;
        java.beans.PropertyEditor propertyEditor5 = propertyDescriptor3.createPropertyEditor(obj4);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        propertyDescriptor9.setValue("double", (java.lang.Object) ' ');
        boolean boolean15 = propertyDescriptor9.isExpert();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        propertyDescriptor9.setValue("float", (java.lang.Object) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        int int25 = classInfo24.getModifiers();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.String str30 = propertyDescriptor29.getShortDescription();
        java.lang.reflect.Method method31 = propertyDescriptor29.getWriteMethod();
        propertyDescriptor29.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean35 = classInfo24.equals((java.lang.Object) propertyDescriptor29);
        int int36 = classInfo24.getModifiers();
        org.mockito.asm.Type[] typeArray37 = classInfo24.getInterfaces();
        boolean boolean39 = classInfo24.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type40 = classInfo24.getSuperType();
        org.mockito.asm.Type[] typeArray41 = classInfo24.getInterfaces();
        org.mockito.asm.Type type42 = classInfo24.getSuperType();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.String str47 = propertyDescriptor46.getShortDescription();
        java.lang.reflect.Method method48 = propertyDescriptor46.getWriteMethod();
        java.lang.String str49 = propertyDescriptor46.getShortDescription();
        boolean boolean50 = propertyDescriptor46.isPreferred();
        java.lang.reflect.Method method51 = null;
        propertyDescriptor46.setReadMethod(method51);
        java.lang.reflect.Method method53 = null;
        propertyDescriptor46.setReadMethod(method53);
        boolean boolean55 = type42.equals((java.lang.Object) propertyDescriptor46);
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.String str60 = propertyDescriptor59.getShortDescription();
        java.lang.reflect.Method method61 = propertyDescriptor59.getWriteMethod();
        propertyDescriptor59.setValue("double", (java.lang.Object) ' ');
        boolean boolean65 = propertyDescriptor59.isExpert();
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Method method69 = null;
        java.beans.PropertyDescriptor propertyDescriptor70 = new java.beans.PropertyDescriptor("hi!", method68, method69);
        java.lang.Class<?> wildcardClass71 = propertyDescriptor70.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass71);
        propertyDescriptor59.setValue("float", (java.lang.Object) wildcardClass71);
        org.mockito.cglib.core.ClassInfo classInfo74 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass71);
        int int75 = classInfo74.getModifiers();
        java.lang.reflect.Method method77 = null;
        java.lang.reflect.Method method78 = null;
        java.beans.PropertyDescriptor propertyDescriptor79 = new java.beans.PropertyDescriptor("hi!", method77, method78);
        java.lang.String str80 = propertyDescriptor79.getShortDescription();
        java.lang.reflect.Method method81 = propertyDescriptor79.getWriteMethod();
        propertyDescriptor79.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean85 = classInfo74.equals((java.lang.Object) propertyDescriptor79);
        int int86 = classInfo74.getModifiers();
        org.mockito.asm.Type type87 = classInfo74.getSuperType();
        int int88 = classInfo74.getModifiers();
        org.mockito.asm.Type[] typeArray89 = classInfo74.getInterfaces();
        boolean boolean90 = type42.equals((java.lang.Object) classInfo74);
        org.mockito.asm.Type type91 = classInfo74.getSuperType();
        java.lang.String str92 = type91.getInternalName();
        java.beans.PropertyEditor propertyEditor93 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type91);
        org.mockito.asm.Type type94 = type91.getElementType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        java.lang.Object obj27 = propertyDescriptor3.getValue("L(DBBBD)V;");
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.String str33 = propertyDescriptor32.getDisplayName();
        boolean boolean34 = propertyDescriptor32.isHidden();
        propertyDescriptor32.setHidden(false);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor32.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        propertyDescriptor3.setValue("(DBBBD)B", (java.lang.Object) wildcardClass37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.Class<?> wildcardClass14 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setDisplayName("org/mockito/cglib/core/Signature");
        java.lang.Object obj18 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("(DBBBD)B", method23, method24);
        java.lang.reflect.Method method26 = null;
        propertyDescriptor25.setReadMethod(method26);
        propertyDescriptor25.setExpert(false);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        java.lang.String str35 = propertyDescriptor34.getShortDescription();
        java.lang.reflect.Method method36 = propertyDescriptor34.getWriteMethod();
        java.lang.String str37 = propertyDescriptor34.getShortDescription();
        boolean boolean38 = propertyDescriptor34.isPreferred();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type43 = signature42.getReturnType();
        java.lang.String str44 = signature42.getName();
        org.mockito.asm.Type type45 = signature42.getReturnType();
        propertyDescriptor34.setValue("B", (java.lang.Object) type45);
        propertyDescriptor34.setShortDescription("double");
        propertyDescriptor34.setHidden(true);
        propertyDescriptor34.setPreferred(false);
        java.lang.String str53 = propertyDescriptor34.getShortDescription();
        propertyDescriptor25.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor34);
        propertyDescriptor3.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor34);
        propertyDescriptor3.setName("Li!LLorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor25 and propertyDescriptor34", propertyDescriptor25.equals(propertyDescriptor34) ? propertyDescriptor25.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor3.setName("(DBBBD)B");
        java.lang.Class<?> wildcardClass31 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setDisplayName("float()L!;");
        java.lang.reflect.Method method34 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass40);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, true, true);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, false, true);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, true, true);
        java.lang.Class[] classArray54 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray44);
        java.lang.String[] strArray55 = org.mockito.cglib.core.ReflectUtils.getNames(classArray54);
        java.lang.String[] strArray56 = org.mockito.cglib.core.ReflectUtils.getNames(classArray54);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; shortDescription=java/beans/PropertyDescriptor]](DBBBD)Ljava/beans/PropertyDescriptor;", (java.lang.Object) strArray56);
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("hi!", method59, method60);
        java.lang.String str62 = propertyDescriptor61.getDisplayName();
        boolean boolean63 = propertyDescriptor61.isHidden();
        java.lang.Class<?> wildcardClass64 = propertyDescriptor61.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass64);
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass64);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass64);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass64);
        java.lang.reflect.Method[] methodArray71 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray68, false, true);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray68, false, false);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("org.mockito.cglib.core.Signature", method1, method2);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor");
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]", method7, method8);
        java.lang.Object obj11 = propertyDescriptor9.getValue("ava.beans.PropertyDescriptor[name=hi!");
        java.beans.PropertyEditor propertyEditor12 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "ava.beans.PropertyDescriptor[name=hi!");
        java.lang.String str13 = propertyDescriptor3.getShortDescription();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type17 = signature16.getReturnType();
        java.lang.Class<?> wildcardClass18 = signature16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean24 = classInfo21.equals((java.lang.Object) type23);
        org.mockito.asm.Type[] typeArray25 = classInfo21.getInterfaces();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.String str30 = propertyDescriptor29.getShortDescription();
        java.lang.reflect.Method method31 = propertyDescriptor29.getWriteMethod();
        java.lang.String str32 = propertyDescriptor29.getShortDescription();
        propertyDescriptor29.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor29.setExpert(false);
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("hi!", method39, method40);
        java.lang.String str42 = propertyDescriptor41.getShortDescription();
        java.lang.reflect.Method method43 = propertyDescriptor41.getWriteMethod();
        propertyDescriptor41.setBound(false);
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor29.createPropertyEditor((java.lang.Object) propertyDescriptor41);
        propertyDescriptor29.setShortDescription("hi!");
        boolean boolean49 = classInfo21.equals((java.lang.Object) propertyDescriptor29);
        org.mockito.asm.Type type50 = classInfo21.getType();
        org.mockito.asm.Type type51 = classInfo21.getType();
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        java.beans.PropertyEditor propertyEditor53 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor29", propertyDescriptor9.equals(propertyDescriptor29) ? propertyDescriptor9.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.lang.String str22 = classInfo21.toString();
        org.mockito.asm.Type type23 = classInfo21.getType();
        java.lang.String str24 = type23.toString();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("byteB", method26, method27);
        boolean boolean29 = type23.equals((java.lang.Object) propertyDescriptor28);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        java.lang.String str34 = propertyDescriptor33.getShortDescription();
        java.lang.reflect.Method method35 = propertyDescriptor33.getWriteMethod();
        propertyDescriptor33.setValue("double", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass39 = propertyDescriptor33.getPropertyType();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor33.getPropertyEditorClass();
        java.lang.String str41 = propertyDescriptor33.getShortDescription();
        propertyDescriptor33.setPreferred(false);
        java.lang.String str44 = propertyDescriptor33.getName();
        boolean boolean45 = type23.equals((java.lang.Object) propertyDescriptor33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.Class<?> wildcardClass4 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        java.lang.String str13 = propertyDescriptor12.getShortDescription();
        java.lang.reflect.Method method14 = propertyDescriptor12.getWriteMethod();
        propertyDescriptor12.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor12.setName("double");
        java.lang.reflect.Method method20 = propertyDescriptor12.getReadMethod();
        java.lang.String str21 = propertyDescriptor12.getName();
        boolean boolean22 = propertyDescriptor12.isHidden();
        boolean boolean23 = propertyDescriptor12.isExpert();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor12.setReadMethod(method24);
        boolean boolean26 = classInfo8.equals((java.lang.Object) method24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor12", propertyDescriptor3.equals(propertyDescriptor12) ? propertyDescriptor3.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        java.lang.String str16 = propertyDescriptor13.getShortDescription();
        propertyDescriptor13.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor13.setShortDescription("float");
        propertyDescriptor13.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("B", method25, method26);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor13.createPropertyEditor((java.lang.Object) method26);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor13.attributeNames();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor13.getPropertyEditorClass();
        propertyDescriptor13.setExpert(false);
        propertyDescriptor13.setShortDescription("C");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=float; bound]", (java.lang.Object) propertyDescriptor13);
        java.lang.Class<?> wildcardClass36 = propertyDescriptor3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor27", propertyDescriptor13.equals(propertyDescriptor27) ? propertyDescriptor13.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.toString();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        java.lang.String str17 = type16.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type16.getElementType();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor3.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor3.attributeNames();
        boolean boolean32 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setDisplayName("(DBBBD)Ljava/lang/Object;");
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("Ljava/beans/PropertyDescriptor;");
        java.lang.String str39 = type38.getClassName();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getInternalName();
        int int42 = type38.getSize();
        org.mockito.asm.Type type43 = type38.getElementType();
        org.mockito.asm.Type type44 = type38.getElementType();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.String str49 = propertyDescriptor48.getShortDescription();
        java.lang.reflect.Method method50 = propertyDescriptor48.getWriteMethod();
        propertyDescriptor48.setValue("double", (java.lang.Object) ' ');
        boolean boolean54 = propertyDescriptor48.isExpert();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor59.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        propertyDescriptor48.setValue("float", (java.lang.Object) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type type65 = classInfo64.getType();
        int int66 = classInfo64.getModifiers();
        int int67 = classInfo64.getModifiers();
        org.mockito.asm.Type type68 = classInfo64.getSuperType();
        org.mockito.asm.Type type69 = classInfo64.getType();
        int int70 = classInfo64.getModifiers();
        org.mockito.asm.Type type71 = classInfo64.getSuperType();
        org.mockito.asm.Type[] typeArray72 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!LLorg/mockito/cglib/core/Signature;;", type44, typeArray72);
        propertyDescriptor3.setValue("()Lorg/mockito/asm/Type;", (java.lang.Object) signature73);
        java.lang.reflect.Method method76 = null;
        java.lang.reflect.Method method77 = null;
        java.beans.PropertyDescriptor propertyDescriptor78 = new java.beans.PropertyDescriptor("hi!", method76, method77);
        java.lang.String str79 = propertyDescriptor78.getShortDescription();
        java.lang.reflect.Method method80 = propertyDescriptor78.getWriteMethod();
        java.lang.String str81 = propertyDescriptor78.getShortDescription();
        propertyDescriptor78.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor78.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean87 = propertyDescriptor78.isExpert();
        propertyDescriptor78.setBound(false);
        boolean boolean90 = propertyDescriptor78.isExpert();
        propertyDescriptor78.setBound(true);
        java.util.Enumeration<java.lang.String> strEnumeration93 = propertyDescriptor78.attributeNames();
        boolean boolean94 = signature73.equals((java.lang.Object) strEnumeration93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.toString();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.lang.String str9 = propertyDescriptor8.getShortDescription();
        java.lang.reflect.Method method10 = propertyDescriptor8.getWriteMethod();
        java.lang.String str11 = propertyDescriptor8.getShortDescription();
        propertyDescriptor8.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor8.setExpert(false);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor8.getPropertyEditorClass();
        java.lang.reflect.Method method18 = null;
        propertyDescriptor8.setWriteMethod(method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor8.getPropertyType();
        java.util.Enumeration<java.lang.String> strEnumeration21 = propertyDescriptor8.attributeNames();
        propertyDescriptor8.setName("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        boolean boolean24 = signature2.equals((java.lang.Object) propertyDescriptor8);
        java.lang.String str25 = signature2.getName();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        java.lang.Class<?> wildcardClass30 = signature28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass30);
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        boolean boolean36 = signature2.equals((java.lang.Object) type35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("hi!", method38, method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor40.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass41);
        java.lang.Class[] classArray50 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray49);
        boolean boolean51 = signature2.equals((java.lang.Object) propertyDescriptorArray49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor40", propertyDescriptor8.equals(propertyDescriptor40) ? propertyDescriptor8.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSort();
        int int10 = type7.getOpcode(3);
        java.lang.String str11 = type7.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type7, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type4, type20, type23, type25, type26 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = type3.getInternalName();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        org.mockito.asm.Type type21 = classInfo19.getType();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type25 = signature24.getReturnType();
        java.lang.Class<?> wildcardClass26 = signature24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean32 = classInfo29.equals((java.lang.Object) type31);
        org.mockito.asm.Type[] typeArray33 = classInfo29.getInterfaces();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        java.lang.String str40 = propertyDescriptor37.getShortDescription();
        propertyDescriptor37.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor37.setExpert(false);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        java.lang.String str50 = propertyDescriptor49.getShortDescription();
        java.lang.reflect.Method method51 = propertyDescriptor49.getWriteMethod();
        propertyDescriptor49.setBound(false);
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor37.createPropertyEditor((java.lang.Object) propertyDescriptor49);
        propertyDescriptor37.setShortDescription("hi!");
        boolean boolean57 = classInfo29.equals((java.lang.Object) propertyDescriptor37);
        org.mockito.asm.Type type58 = classInfo29.getType();
        boolean boolean59 = classInfo19.equals((java.lang.Object) classInfo29);
        java.lang.reflect.Method method61 = null;
        java.lang.reflect.Method method62 = null;
        java.beans.PropertyDescriptor propertyDescriptor63 = new java.beans.PropertyDescriptor("hi!", method61, method62);
        java.lang.String str64 = propertyDescriptor63.getShortDescription();
        java.lang.reflect.Method method65 = propertyDescriptor63.getWriteMethod();
        java.lang.String str66 = propertyDescriptor63.getShortDescription();
        propertyDescriptor63.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method70 = null;
        propertyDescriptor63.setReadMethod(method70);
        propertyDescriptor63.setDisplayName("double");
        java.lang.String str74 = propertyDescriptor63.getDisplayName();
        propertyDescriptor63.setConstrained(false);
        propertyDescriptor63.setName("()Ljava/lang/Object;");
        java.lang.reflect.Method method79 = propertyDescriptor63.getReadMethod();
        boolean boolean80 = classInfo29.equals((java.lang.Object) propertyDescriptor63);
        org.mockito.asm.Type[] typeArray81 = classInfo29.getInterfaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor63", propertyDescriptor3.equals(propertyDescriptor63) ? propertyDescriptor3.hashCode() == propertyDescriptor63.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getDisplayName();
        boolean boolean28 = propertyDescriptor26.isHidden();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor26.getPropertyType();
        java.lang.reflect.Method method30 = propertyDescriptor26.getReadMethod();
        java.lang.String str31 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method32 = propertyDescriptor26.getWriteMethod();
        java.lang.Object obj34 = propertyDescriptor26.getValue("S");
        java.util.Enumeration<java.lang.String> strEnumeration35 = propertyDescriptor26.attributeNames();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.String str40 = propertyDescriptor39.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration41 = propertyDescriptor39.attributeNames();
        java.lang.String str42 = propertyDescriptor39.getName();
        java.lang.String str43 = propertyDescriptor39.getName();
        propertyDescriptor39.setDisplayName("byteB");
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        java.lang.String str50 = propertyDescriptor49.getShortDescription();
        java.lang.reflect.Method method51 = propertyDescriptor49.getWriteMethod();
        propertyDescriptor49.setValue("double", (java.lang.Object) ' ');
        boolean boolean55 = propertyDescriptor49.isExpert();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("hi!", method58, method59);
        java.lang.Class<?> wildcardClass61 = propertyDescriptor60.getClass();
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        propertyDescriptor49.setValue("float", (java.lang.Object) wildcardClass61);
        java.beans.PropertyEditor propertyEditor64 = propertyDescriptor39.createPropertyEditor((java.lang.Object) propertyDescriptor49);
        propertyDescriptor39.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration67 = propertyDescriptor39.attributeNames();
        boolean boolean68 = propertyDescriptor39.isExpert();
        java.lang.reflect.Method method69 = propertyDescriptor39.getWriteMethod();
        boolean boolean70 = propertyDescriptor39.isHidden();
        propertyDescriptor39.setConstrained(false);
        java.lang.String str73 = propertyDescriptor39.getDisplayName();
        java.beans.PropertyEditor propertyEditor74 = propertyDescriptor26.createPropertyEditor((java.lang.Object) propertyDescriptor39);
        boolean boolean75 = classInfo22.equals((java.lang.Object) propertyDescriptor26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor39", propertyDescriptor3.equals(propertyDescriptor39) ? propertyDescriptor3.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor3.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor3.attributeNames();
        boolean boolean32 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setDisplayName("(DBBBD)Ljava/lang/Object;");
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("Ljava/beans/PropertyDescriptor;");
        java.lang.String str39 = type38.getClassName();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getInternalName();
        int int42 = type38.getSize();
        org.mockito.asm.Type type43 = type38.getElementType();
        org.mockito.asm.Type type44 = type38.getElementType();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.String str49 = propertyDescriptor48.getShortDescription();
        java.lang.reflect.Method method50 = propertyDescriptor48.getWriteMethod();
        propertyDescriptor48.setValue("double", (java.lang.Object) ' ');
        boolean boolean54 = propertyDescriptor48.isExpert();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor59.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        propertyDescriptor48.setValue("float", (java.lang.Object) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type type65 = classInfo64.getType();
        int int66 = classInfo64.getModifiers();
        int int67 = classInfo64.getModifiers();
        org.mockito.asm.Type type68 = classInfo64.getSuperType();
        org.mockito.asm.Type type69 = classInfo64.getType();
        int int70 = classInfo64.getModifiers();
        org.mockito.asm.Type type71 = classInfo64.getSuperType();
        org.mockito.asm.Type[] typeArray72 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!LLorg/mockito/cglib/core/Signature;;", type44, typeArray72);
        propertyDescriptor3.setValue("()Lorg/mockito/asm/Type;", (java.lang.Object) signature73);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=hi!; shortDescription=(DBBBD)V; values={byte=0}]");
        java.lang.String str77 = type76.getClassName();
        boolean boolean78 = signature73.equals((java.lang.Object) type76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=B]", "double");
        java.lang.String str3 = signature2.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getShortDescription();
        java.lang.reflect.Method method9 = propertyDescriptor7.getWriteMethod();
        java.lang.String str10 = propertyDescriptor7.getShortDescription();
        propertyDescriptor7.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor7.setConstrained(false);
        propertyDescriptor7.setHidden(false);
        propertyDescriptor7.setExpert(true);
        boolean boolean20 = propertyDescriptor7.isPreferred();
        boolean boolean21 = signature2.equals((java.lang.Object) propertyDescriptor7);
        java.lang.String str22 = signature2.toString();
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method28 = propertyDescriptor26.getWriteMethod();
        java.lang.String str29 = propertyDescriptor26.getShortDescription();
        boolean boolean30 = propertyDescriptor26.isPreferred();
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type35 = signature34.getReturnType();
        java.lang.String str36 = signature34.getName();
        org.mockito.asm.Type type37 = signature34.getReturnType();
        propertyDescriptor26.setValue("B", (java.lang.Object) type37);
        propertyDescriptor26.setShortDescription("byte");
        java.lang.Class<?> wildcardClass41 = propertyDescriptor26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor47.getClass();
        org.mockito.cglib.core.ClassInfo classInfo49 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        java.lang.String str50 = classInfo49.toString();
        org.mockito.asm.Type type51 = classInfo49.getSuperType();
        boolean boolean52 = classInfo43.equals((java.lang.Object) classInfo49);
        org.mockito.asm.Type type53 = classInfo49.getType();
        org.mockito.asm.Type type54 = classInfo49.getSuperType();
        int int55 = type54.getSize();
        boolean boolean56 = signature2.equals((java.lang.Object) type54);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str60 = signature59.toString();
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Method method63 = null;
        java.beans.PropertyDescriptor propertyDescriptor64 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]", method62, method63);
        java.lang.Object obj66 = propertyDescriptor64.getValue("ava.beans.PropertyDescriptor[name=hi!");
        boolean boolean67 = signature59.equals((java.lang.Object) propertyDescriptor64);
        boolean boolean68 = propertyDescriptor64.isHidden();
        propertyDescriptor64.setPreferred(true);
        propertyDescriptor64.setName("(DBBBD)LLva/lang/Object;;");
        boolean boolean73 = type54.equals((java.lang.Object) "(DBBBD)LLva/lang/Object;;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor64", propertyDescriptor7.equals(propertyDescriptor64) ? propertyDescriptor7.hashCode() == propertyDescriptor64.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        java.lang.String str12 = propertyDescriptor9.getShortDescription();
        propertyDescriptor9.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor9.setExpert(false);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        java.lang.String str22 = propertyDescriptor21.getShortDescription();
        java.lang.reflect.Method method23 = propertyDescriptor21.getWriteMethod();
        propertyDescriptor21.setBound(false);
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor9.createPropertyEditor((java.lang.Object) propertyDescriptor21);
        propertyDescriptor9.setShortDescription("hi!");
        boolean boolean29 = signature2.equals((java.lang.Object) "hi!");
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        java.lang.String str34 = propertyDescriptor33.getShortDescription();
        java.lang.reflect.Method method35 = propertyDescriptor33.getWriteMethod();
        java.lang.String str36 = propertyDescriptor33.getShortDescription();
        propertyDescriptor33.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor33.setShortDescription("float");
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor33.createPropertyEditor((java.lang.Object) classArray42);
        propertyDescriptor33.setConstrained(true);
        boolean boolean49 = propertyDescriptor33.isHidden();
        java.lang.reflect.Method method50 = propertyDescriptor33.getReadMethod();
        java.lang.String str51 = propertyDescriptor33.getName();
        java.lang.reflect.Method method52 = propertyDescriptor33.getWriteMethod();
        propertyDescriptor33.setPreferred(true);
        boolean boolean55 = signature2.equals((java.lang.Object) propertyDescriptor33);
        java.lang.String str56 = signature2.getDescriptor();
        java.lang.String str57 = signature2.getName();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=B]", method59, method60);
        propertyDescriptor61.setDisplayName("()B");
        boolean boolean64 = signature2.equals((java.lang.Object) "()B");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor61", propertyDescriptor9.equals(propertyDescriptor61) ? propertyDescriptor9.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.String str25 = propertyDescriptor24.getShortDescription();
        java.lang.reflect.Method method26 = propertyDescriptor24.getWriteMethod();
        java.lang.String str27 = propertyDescriptor24.getShortDescription();
        boolean boolean28 = propertyDescriptor24.isPreferred();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.String str34 = signature32.getName();
        org.mockito.asm.Type type35 = signature32.getReturnType();
        propertyDescriptor24.setValue("B", (java.lang.Object) type35);
        propertyDescriptor24.setShortDescription("byte");
        java.lang.String str39 = propertyDescriptor24.getName();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor24.getPropertyType();
        propertyDescriptor24.setName("(DBBBD)B");
        boolean boolean43 = classInfo20.equals((java.lang.Object) propertyDescriptor24);
        org.mockito.asm.Type type44 = classInfo20.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.String str18 = propertyDescriptor3.getName();
        boolean boolean19 = propertyDescriptor3.isPreferred();
        boolean boolean20 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("B", method22, method23);
        propertyDescriptor24.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        propertyDescriptor24.setHidden(false);
        java.lang.reflect.Method method29 = propertyDescriptor24.getWriteMethod();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method31, method32);
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor24.createPropertyEditor((java.lang.Object) method32);
        boolean boolean35 = propertyDescriptor3.equals((java.lang.Object) method32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor24 and propertyDescriptor33", propertyDescriptor24.equals(propertyDescriptor33) ? propertyDescriptor24.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type7.getDimensions();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor3.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor3.attributeNames();
        boolean boolean32 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setDisplayName("(DBBBD)Ljava/lang/Object;");
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("Ljava/beans/PropertyDescriptor;");
        java.lang.String str39 = type38.getClassName();
        int int40 = type38.getSize();
        java.lang.String str41 = type38.getInternalName();
        int int42 = type38.getSize();
        org.mockito.asm.Type type43 = type38.getElementType();
        org.mockito.asm.Type type44 = type38.getElementType();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.String str49 = propertyDescriptor48.getShortDescription();
        java.lang.reflect.Method method50 = propertyDescriptor48.getWriteMethod();
        propertyDescriptor48.setValue("double", (java.lang.Object) ' ');
        boolean boolean54 = propertyDescriptor48.isExpert();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor59.getClass();
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        propertyDescriptor48.setValue("float", (java.lang.Object) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type type65 = classInfo64.getType();
        int int66 = classInfo64.getModifiers();
        int int67 = classInfo64.getModifiers();
        org.mockito.asm.Type type68 = classInfo64.getSuperType();
        org.mockito.asm.Type type69 = classInfo64.getType();
        int int70 = classInfo64.getModifiers();
        org.mockito.asm.Type type71 = classInfo64.getSuperType();
        org.mockito.asm.Type[] typeArray72 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature73 = new org.mockito.cglib.core.Signature("hi!LLorg/mockito/cglib/core/Signature;;", type44, typeArray72);
        propertyDescriptor3.setValue("()Lorg/mockito/asm/Type;", (java.lang.Object) signature73);
        org.mockito.asm.Type type75 = signature73.getReturnType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.String str7 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("byteB");
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.lang.Class<?> wildcardClass25 = propertyDescriptor24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        propertyDescriptor13.setValue("float", (java.lang.Object) wildcardClass25);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor3.setName("(DBBBD)B");
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=float; bound]");
        java.beans.PropertyEditor propertyEditor33 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type32);
        int int34 = type32.getSort();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        org.mockito.asm.Type type32 = classInfo18.getType();
        org.mockito.asm.Type type33 = classInfo18.getSuperType();
        java.lang.String str34 = type33.getInternalName();
        int int36 = type33.getOpcode(37);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type41 = signature40.getReturnType();
        java.lang.String str42 = signature40.getName();
        org.mockito.asm.Type type43 = signature40.getReturnType();
        java.lang.String str44 = signature40.getDescriptor();
        java.lang.Class[] classArray45 = new java.lang.Class[] {};
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray45);
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        boolean boolean52 = signature40.equals((java.lang.Object) strArray51);
        java.lang.String str53 = signature40.getDescriptor();
        org.mockito.asm.Type type54 = signature40.getReturnType();
        org.mockito.asm.Type type55 = signature40.getReturnType();
        java.lang.String str56 = type55.getDescriptor();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method59, method60);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type66 = signature65.getReturnType();
        java.lang.Class<?> wildcardClass67 = signature65.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass67);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass67);
        org.mockito.cglib.core.ClassInfo classInfo70 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass67);
        org.mockito.asm.Type[] typeArray71 = classInfo70.getInterfaces();
        propertyDescriptor61.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo70);
        org.mockito.asm.Type type73 = classInfo70.getType();
        org.mockito.asm.Type type74 = classInfo70.getType();
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type78 = signature77.getReturnType();
        java.lang.Class<?> wildcardClass79 = signature77.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray80 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass79);
        org.mockito.cglib.core.ClassInfo classInfo81 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass79);
        org.mockito.cglib.core.ClassInfo classInfo82 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass79);
        org.mockito.asm.Type type83 = classInfo82.getSuperType();
        org.mockito.asm.Type[] typeArray84 = classInfo82.getInterfaces();
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type74, typeArray84);
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type55, typeArray84);
        java.lang.String str87 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor61", propertyDescriptor3.equals(propertyDescriptor61) ? propertyDescriptor3.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        int int23 = classInfo22.getModifiers();
        org.mockito.asm.Type type24 = classInfo22.getSuperType();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getShortDescription();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        java.lang.String str31 = propertyDescriptor28.getShortDescription();
        propertyDescriptor28.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method35 = null;
        propertyDescriptor28.setReadMethod(method35);
        boolean boolean37 = propertyDescriptor28.isExpert();
        java.lang.String str38 = propertyDescriptor28.getDisplayName();
        propertyDescriptor28.setName("(DBBBD)Ljava/beans/PropertyDescriptor;");
        java.lang.String str41 = propertyDescriptor28.getName();
        propertyDescriptor28.setPreferred(false);
        boolean boolean44 = classInfo22.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BYTE_TYPE;
        int int8 = type7.getSort();
        int int10 = type7.getOpcode(3);
        java.lang.String str11 = type7.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BYTE_TYPE;
        int int15 = type14.getSort();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getClassName();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type5, type7, type12, type14, type16 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BYTE_TYPE;
        int int21 = type20.getSize();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str24 = type23.getDescriptor();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getClassName();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type4, type20, type23, type25, type26 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str32 = type31.getClassName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        int int34 = type33.getSort();
        int int36 = type33.getOpcode(3);
        java.lang.String str37 = type33.getClassName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BYTE_TYPE;
        int int39 = type38.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type31, type33, type38, type40, type42 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray44);
        int int48 = type3.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = type3.getDimensions();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]", "F(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        java.lang.String str7 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method8 = propertyDescriptor6.getWriteMethod();
        java.lang.String str9 = propertyDescriptor6.getShortDescription();
        propertyDescriptor6.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor6.setShortDescription("float");
        propertyDescriptor6.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("B", method18, method19);
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor6.createPropertyEditor((java.lang.Object) method19);
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor6.attributeNames();
        java.lang.Class<?> wildcardClass23 = propertyDescriptor6.getPropertyEditorClass();
        boolean boolean24 = propertyDescriptor6.isPreferred();
        boolean boolean25 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.String str26 = signature2.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor20", propertyDescriptor6.equals(propertyDescriptor20) ? propertyDescriptor6.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 0);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byteB", "Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("java.lang.Object", method5, method6);
        boolean boolean8 = signature2.equals((java.lang.Object) "java.lang.Object");
        org.mockito.asm.Type type9 = signature2.getReturnType();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.lang.String str14 = propertyDescriptor13.getShortDescription();
        java.lang.reflect.Method method15 = propertyDescriptor13.getWriteMethod();
        propertyDescriptor13.setValue("double", (java.lang.Object) ' ');
        boolean boolean19 = propertyDescriptor13.isExpert();
        propertyDescriptor13.setName("double");
        java.lang.String str22 = propertyDescriptor13.getName();
        propertyDescriptor13.setHidden(true);
        java.lang.String str25 = propertyDescriptor13.getDisplayName();
        boolean boolean26 = propertyDescriptor13.isHidden();
        boolean boolean27 = propertyDescriptor13.isExpert();
        propertyDescriptor13.setConstrained(false);
        boolean boolean30 = signature2.equals((java.lang.Object) propertyDescriptor13);
        java.lang.String str31 = signature2.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor13", propertyDescriptor7.equals(propertyDescriptor13) ? propertyDescriptor7.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor3.setShortDescription("hi!");
        java.lang.reflect.Method method23 = null;
        propertyDescriptor3.setReadMethod(method23);
        boolean boolean25 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("V", method28, method29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSort();
        int int35 = type32.getOpcode(3);
        java.lang.String str36 = type32.getClassName();
        java.lang.String str37 = type32.getClassName();
        java.lang.Class[] classArray38 = new java.lang.Class[] {};
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray38);
        boolean boolean40 = type32.equals((java.lang.Object) classArray38);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray38);
        propertyDescriptor30.setValue("", (java.lang.Object) strArray41);
        java.lang.Object obj44 = propertyDescriptor30.getValue("float");
        java.lang.Object obj46 = propertyDescriptor30.getValue("Ljava/lang/Object;");
        java.lang.reflect.Method method47 = null;
        propertyDescriptor30.setWriteMethod(method47);
        java.lang.String str49 = propertyDescriptor30.getShortDescription();
        propertyDescriptor30.setDisplayName("L(DBBBD)Ljava/lang/Object;;");
        boolean boolean52 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setDisplayName("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]java.beans.PropertyDescriptor[name=(DBBBD)B]");
        boolean boolean55 = propertyDescriptor3.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]java.beans.PropertyDescriptor[name=(DBBBD)B]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor30", propertyDescriptor15.equals(propertyDescriptor30) ? propertyDescriptor15.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("double");
        java.lang.reflect.Method method18 = propertyDescriptor3.getWriteMethod();
        boolean boolean19 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]");
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method24 = null;
        propertyDescriptor3.setWriteMethod(method24);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.String str30 = propertyDescriptor29.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor29.attributeNames();
        java.lang.String str32 = propertyDescriptor29.getName();
        java.lang.String str33 = propertyDescriptor29.getName();
        propertyDescriptor29.setDisplayName("byteB");
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.String str40 = propertyDescriptor39.getShortDescription();
        java.lang.reflect.Method method41 = propertyDescriptor39.getWriteMethod();
        propertyDescriptor39.setValue("double", (java.lang.Object) ' ');
        boolean boolean45 = propertyDescriptor39.isExpert();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        java.lang.Class<?> wildcardClass51 = propertyDescriptor50.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        propertyDescriptor39.setValue("float", (java.lang.Object) wildcardClass51);
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor29.createPropertyEditor((java.lang.Object) propertyDescriptor39);
        propertyDescriptor29.setName("(DBBBD)B");
        java.util.Enumeration<java.lang.String> strEnumeration57 = propertyDescriptor29.attributeNames();
        boolean boolean58 = propertyDescriptor29.isExpert();
        propertyDescriptor29.setDisplayName("(DBBBD)Ljava/lang/Object;");
        java.lang.reflect.Method method61 = null;
        propertyDescriptor29.setWriteMethod(method61);
        propertyDescriptor29.setExpert(true);
        java.beans.PropertyEditor propertyEditor65 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor29);
        java.lang.reflect.Method method66 = propertyDescriptor3.getWriteMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor29 and propertyDescriptor39", propertyDescriptor29.equals(propertyDescriptor39) ? propertyDescriptor29.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lhi!;", "float");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        propertyDescriptor9.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor9.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor9.setDisplayName("");
        boolean boolean19 = propertyDescriptor9.isExpert();
        propertyDescriptor9.setShortDescription("(DBBBD)Ljava/beans/PropertyDescriptor;");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getDisplayName();
        boolean boolean28 = propertyDescriptor26.isHidden();
        propertyDescriptor26.setName("(DBBBD)Lhi!;");
        java.lang.reflect.Method method31 = null;
        propertyDescriptor26.setReadMethod(method31);
        java.util.Enumeration<java.lang.String> strEnumeration33 = propertyDescriptor26.attributeNames();
        propertyDescriptor9.setValue("", (java.lang.Object) strEnumeration33);
        propertyDescriptor9.setPreferred(false);
        boolean boolean37 = signature2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor26", propertyDescriptor9.equals(propertyDescriptor26) ? propertyDescriptor9.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classArray12);
        propertyDescriptor3.setConstrained(true);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; preferred]", "Lorg/mockito/asm/Type;");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(DBBBD)B]", (java.lang.Object) signature22);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        java.lang.String str28 = propertyDescriptor27.getShortDescription();
        java.lang.reflect.Method method29 = propertyDescriptor27.getWriteMethod();
        propertyDescriptor27.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor27.setName("double");
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.lang.String str39 = propertyDescriptor38.getShortDescription();
        java.lang.reflect.Method method40 = propertyDescriptor38.getWriteMethod();
        java.lang.String str41 = propertyDescriptor38.getShortDescription();
        propertyDescriptor38.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor38.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean47 = propertyDescriptor38.isExpert();
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor27.createPropertyEditor((java.lang.Object) boolean47);
        propertyDescriptor27.setShortDescription("Lorg/mockito/cglib/core/Signature;");
        boolean boolean51 = propertyDescriptor27.isExpert();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("hi!", method54, method55);
        java.lang.String str57 = propertyDescriptor56.getShortDescription();
        java.lang.reflect.Method method58 = propertyDescriptor56.getWriteMethod();
        java.lang.String str59 = propertyDescriptor56.getShortDescription();
        propertyDescriptor56.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method63 = null;
        propertyDescriptor56.setReadMethod(method63);
        java.lang.Object obj66 = propertyDescriptor56.getValue("java/beans/PropertyDescriptor");
        java.lang.String str67 = propertyDescriptor56.getDisplayName();
        java.lang.reflect.Method method68 = propertyDescriptor56.getReadMethod();
        java.lang.reflect.Method method69 = propertyDescriptor56.getReadMethod();
        boolean boolean70 = propertyDescriptor56.isExpert();
        propertyDescriptor27.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=Lhi!;; shortDescription=java.beans.PropertyDescriptor[name=hi!]; values={byte=0}]", (java.lang.Object) propertyDescriptor56);
        boolean boolean72 = signature22.equals((java.lang.Object) propertyDescriptor27);
        java.lang.String str73 = signature22.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor27 and propertyDescriptor38", propertyDescriptor27.equals(propertyDescriptor38) ? propertyDescriptor27.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        java.lang.String str8 = signature2.toString();
        org.mockito.asm.Type type9 = signature2.getReturnType();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("Z");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str19 = type18.getDescriptor();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        int int28 = type27.getSort();
        int int30 = type27.getOpcode(3);
        java.lang.String str31 = type27.getClassName();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BYTE_TYPE;
        int int33 = type32.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BYTE_TYPE;
        int int35 = type34.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str37 = type36.getClassName();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type25, type27, type32, type34, type36 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSize();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str44 = type43.getDescriptor();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str47 = type46.getClassName();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type24, type40, type43, type45, type46 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str52 = type51.getClassName();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        int int54 = type53.getSort();
        int int56 = type53.getOpcode(3);
        java.lang.String str57 = type53.getClassName();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BYTE_TYPE;
        int int59 = type58.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BYTE_TYPE;
        int int61 = type60.getSort();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str63 = type62.getClassName();
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type51, type53, type58, type60, type62 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray64);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray64);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type16, typeArray64);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray64);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray64);
        boolean boolean71 = type9.equals((java.lang.Object) str70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int72 = type9.getDimensions();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.Class<?> wildcardClass5 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.lang.String str11 = propertyDescriptor10.getDisplayName();
        boolean boolean12 = propertyDescriptor10.isHidden();
        propertyDescriptor10.setName("(DBBBD)Lhi!;");
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.String str20 = propertyDescriptor19.getShortDescription();
        java.lang.reflect.Method method21 = propertyDescriptor19.getWriteMethod();
        propertyDescriptor19.setValue("double", (java.lang.Object) ' ');
        boolean boolean25 = propertyDescriptor19.isExpert();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.Class<?> wildcardClass31 = propertyDescriptor30.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        propertyDescriptor19.setValue("float", (java.lang.Object) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo34 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type38 = signature37.getReturnType();
        java.lang.String str39 = signature37.getName();
        org.mockito.asm.Type type40 = signature37.getReturnType();
        boolean boolean41 = classInfo34.equals((java.lang.Object) type40);
        java.lang.String str42 = classInfo34.toString();
        org.mockito.asm.Type type43 = classInfo34.getSuperType();
        org.mockito.asm.Type type44 = classInfo34.getSuperType();
        int int46 = type44.getOpcode(4);
        propertyDescriptor10.setValue("LD;", (java.lang.Object) 4);
        boolean boolean48 = propertyDescriptor10.isExpert();
        java.lang.Class<?> wildcardClass49 = propertyDescriptor10.getPropertyType();
        propertyDescriptor10.setHidden(false);
        java.lang.String str52 = propertyDescriptor10.getShortDescription();
        propertyDescriptor10.setShortDescription("hi!B");
        propertyDescriptor3.setValue("(DBBBD)Lorg/mockito/asm/Type;", (java.lang.Object) "hi!B");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor19", propertyDescriptor10.equals(propertyDescriptor19) ? propertyDescriptor10.hashCode() == propertyDescriptor19.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("LD;", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.String str8 = propertyDescriptor7.getShortDescription();
        java.lang.reflect.Method method9 = propertyDescriptor7.getWriteMethod();
        propertyDescriptor7.setValue("double", (java.lang.Object) ' ');
        boolean boolean13 = propertyDescriptor7.isExpert();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        propertyDescriptor7.setValue("float", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor7.getPropertyEditorClass();
        java.lang.reflect.Method method23 = propertyDescriptor7.getReadMethod();
        java.lang.reflect.Method method24 = propertyDescriptor7.getWriteMethod();
        propertyDescriptor7.setPreferred(false);
        boolean boolean27 = propertyDescriptor7.isExpert();
        propertyDescriptor7.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method30 = propertyDescriptor7.getReadMethod();
        java.lang.String str31 = propertyDescriptor7.getShortDescription();
        propertyDescriptor7.setConstrained(false);
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor18", propertyDescriptor7.equals(propertyDescriptor18) ? propertyDescriptor7.hashCode() == propertyDescriptor18.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type12);
        propertyDescriptor3.setHidden(true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.String str23 = propertyDescriptor22.getShortDescription();
        java.lang.reflect.Method method24 = propertyDescriptor22.getWriteMethod();
        propertyDescriptor22.setValue("double", (java.lang.Object) ' ');
        boolean boolean28 = propertyDescriptor22.isExpert();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        propertyDescriptor22.setValue("float", (java.lang.Object) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        int int38 = classInfo37.getModifiers();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.String str43 = propertyDescriptor42.getShortDescription();
        java.lang.reflect.Method method44 = propertyDescriptor42.getWriteMethod();
        propertyDescriptor42.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean48 = classInfo37.equals((java.lang.Object) propertyDescriptor42);
        int int49 = classInfo37.getModifiers();
        org.mockito.asm.Type[] typeArray50 = classInfo37.getInterfaces();
        boolean boolean52 = classInfo37.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type53 = classInfo37.getType();
        java.lang.String str54 = type53.getInternalName();
        org.mockito.asm.Type type55 = type53.getElementType();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.String str60 = propertyDescriptor59.getShortDescription();
        java.lang.reflect.Method method61 = propertyDescriptor59.getWriteMethod();
        java.lang.String str62 = propertyDescriptor59.getShortDescription();
        propertyDescriptor59.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method66 = null;
        propertyDescriptor59.setReadMethod(method66);
        boolean boolean68 = propertyDescriptor59.isExpert();
        propertyDescriptor59.setName("(VBLhi!;SD)B");
        propertyDescriptor59.setPreferred(false);
        propertyDescriptor59.setHidden(false);
        boolean boolean75 = type53.equals((java.lang.Object) propertyDescriptor59);
        java.lang.Object obj77 = propertyDescriptor59.getValue("java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/cglib/core/Signature;; values={byte=0}; bound]");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=C]", (java.lang.Object) propertyDescriptor59);
        boolean boolean79 = propertyDescriptor59.isPreferred();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.String str19 = propertyDescriptor18.getShortDescription();
        java.lang.reflect.Method method20 = propertyDescriptor18.getWriteMethod();
        java.lang.String str21 = propertyDescriptor18.getShortDescription();
        boolean boolean22 = propertyDescriptor18.isPreferred();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.String str28 = signature26.getName();
        org.mockito.asm.Type type29 = signature26.getReturnType();
        propertyDescriptor18.setValue("B", (java.lang.Object) type29);
        propertyDescriptor18.setShortDescription("byte");
        java.lang.Class<?> wildcardClass33 = propertyDescriptor18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        java.lang.String str42 = classInfo41.toString();
        org.mockito.asm.Type type43 = classInfo41.getSuperType();
        boolean boolean44 = classInfo35.equals((java.lang.Object) classInfo41);
        org.mockito.asm.Type type45 = classInfo41.getType();
        org.mockito.asm.Type type46 = classInfo41.getSuperType();
        propertyDescriptor3.setValue("LLorg.mockito.cglib.core.Signature;;", (java.lang.Object) classInfo41);
        propertyDescriptor3.setHidden(true);
        java.lang.String str50 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("(VBLhi!;SD)B");
        int int54 = type52.getOpcode((int) '4');
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor3.createPropertyEditor((java.lang.Object) '4');
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("B", method58, method59);
        propertyDescriptor60.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        java.util.Enumeration<java.lang.String> strEnumeration63 = propertyDescriptor60.attributeNames();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=byteB; constrained]", (java.lang.Object) propertyDescriptor60);
        boolean boolean65 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor60", propertyDescriptor18.equals(propertyDescriptor60) ? propertyDescriptor18.hashCode() == propertyDescriptor60.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = classInfo7.getSuperType();
        org.mockito.asm.Type type9 = type8.getElementType();
        java.lang.String str10 = type9.getClassName();
        java.lang.String str11 = type9.toString();
        int int12 = type9.getSort();
        int int13 = type9.getSort();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor21.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor17.createPropertyEditor((java.lang.Object) wildcardClass22);
        boolean boolean25 = propertyDescriptor17.isPreferred();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.String str31 = propertyDescriptor30.getShortDescription();
        java.lang.reflect.Method method32 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor30.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor30.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor30.setDisplayName("");
        propertyDescriptor30.setPreferred(true);
        java.lang.Class<?> wildcardClass42 = propertyDescriptor30.getPropertyEditorClass();
        java.lang.String str43 = propertyDescriptor30.getName();
        propertyDescriptor17.setValue("java.beans.PropertyDescriptor[name=double; shortDescription=()Ljava/beans/PropertyDescriptor;; values={java.beans.PropertyDescriptor[name=hi!]=0}]", (java.lang.Object) str43);
        boolean boolean45 = type9.equals((java.lang.Object) str43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor21", propertyDescriptor17.equals(propertyDescriptor21) ? propertyDescriptor17.hashCode() == propertyDescriptor21.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method15, method16);
        boolean boolean18 = signature12.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setDisplayName("float()L!;");
        java.lang.Class<?> wildcardClass22 = propertyDescriptor3.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setName("double");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getShortDescription();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        java.lang.String str17 = propertyDescriptor14.getShortDescription();
        propertyDescriptor14.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor14.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean23 = propertyDescriptor14.isExpert();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean23);
        propertyDescriptor3.setShortDescription("Lorg/mockito/cglib/core/Signature;");
        boolean boolean27 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.String str33 = propertyDescriptor32.getShortDescription();
        java.lang.reflect.Method method34 = propertyDescriptor32.getWriteMethod();
        java.lang.String str35 = propertyDescriptor32.getShortDescription();
        propertyDescriptor32.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method39 = null;
        propertyDescriptor32.setReadMethod(method39);
        java.lang.Object obj42 = propertyDescriptor32.getValue("java/beans/PropertyDescriptor");
        java.lang.String str43 = propertyDescriptor32.getDisplayName();
        java.lang.reflect.Method method44 = propertyDescriptor32.getReadMethod();
        java.lang.reflect.Method method45 = propertyDescriptor32.getReadMethod();
        boolean boolean46 = propertyDescriptor32.isExpert();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=Lhi!;; shortDescription=java.beans.PropertyDescriptor[name=hi!]; values={byte=0}]", (java.lang.Object) propertyDescriptor32);
        propertyDescriptor32.setPreferred(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("J", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.lang.String str9 = propertyDescriptor8.getShortDescription();
        java.lang.reflect.Method method10 = propertyDescriptor8.getWriteMethod();
        propertyDescriptor8.setValue("double", (java.lang.Object) ' ');
        boolean boolean14 = propertyDescriptor8.isExpert();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        propertyDescriptor8.setValue("float", (java.lang.Object) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.lang.String str25 = classInfo24.toString();
        org.mockito.asm.Type type26 = classInfo24.getSuperType();
        org.mockito.asm.Type type27 = classInfo24.getSuperType();
        org.mockito.asm.Type type28 = classInfo24.getType();
        org.mockito.asm.Type type29 = classInfo24.getType();
        java.lang.String str30 = classInfo24.toString();
        org.mockito.asm.Type type31 = classInfo24.getSuperType();
        int int32 = classInfo24.getModifiers();
        org.mockito.asm.Type type33 = classInfo24.getType();
        propertyDescriptor3.setValue("", (java.lang.Object) classInfo24);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.FLOAT_TYPE;
        int int37 = type35.getOpcode(15);
        java.lang.String str38 = type35.getDescriptor();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.String str43 = propertyDescriptor42.getShortDescription();
        java.lang.reflect.Method method44 = propertyDescriptor42.getWriteMethod();
        java.lang.String str45 = propertyDescriptor42.getDisplayName();
        java.lang.String str46 = propertyDescriptor42.getShortDescription();
        java.lang.String str47 = propertyDescriptor42.getName();
        boolean boolean48 = type35.equals((java.lang.Object) propertyDescriptor42);
        java.lang.reflect.Method method49 = propertyDescriptor42.getWriteMethod();
        boolean boolean50 = classInfo24.equals((java.lang.Object) propertyDescriptor42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor8", propertyDescriptor3.equals(propertyDescriptor8) ? propertyDescriptor3.hashCode() == propertyDescriptor8.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method15, method16);
        boolean boolean18 = signature12.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method21 = null;
        propertyDescriptor3.setWriteMethod(method21);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method28 = propertyDescriptor26.getWriteMethod();
        propertyDescriptor26.setValue("double", (java.lang.Object) ' ');
        boolean boolean32 = propertyDescriptor26.isExpert();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor37.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        propertyDescriptor26.setValue("float", (java.lang.Object) wildcardClass38);
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        int int42 = classInfo41.getModifiers();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.String str47 = propertyDescriptor46.getShortDescription();
        java.lang.reflect.Method method48 = propertyDescriptor46.getWriteMethod();
        propertyDescriptor46.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean52 = classInfo41.equals((java.lang.Object) propertyDescriptor46);
        int int53 = classInfo41.getModifiers();
        org.mockito.asm.Type[] typeArray54 = classInfo41.getInterfaces();
        boolean boolean56 = classInfo41.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type57 = classInfo41.getSuperType();
        org.mockito.asm.Type type58 = classInfo41.getSuperType();
        org.mockito.asm.Type type59 = classInfo41.getSuperType();
        org.mockito.asm.Type type60 = classInfo41.getType();
        org.mockito.asm.Type type61 = classInfo41.getType();
        int int62 = classInfo41.getModifiers();
        org.mockito.asm.Type type63 = classInfo41.getSuperType();
        java.beans.PropertyEditor propertyEditor64 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classInfo41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor26", propertyDescriptor17.equals(propertyDescriptor26) ? propertyDescriptor17.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        boolean boolean7 = signature2.equals((java.lang.Object) 10.0d);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray8);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BYTE_TYPE;
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type24 = signature23.getReturnType();
        java.lang.Class<?> wildcardClass25 = signature23.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass20, wildcardClass25 };
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type33 = signature32.getReturnType();
        java.lang.String str34 = signature32.getName();
        org.mockito.asm.Type type35 = signature32.getReturnType();
        java.lang.String str36 = signature32.getDescriptor();
        java.lang.Class[] classArray37 = new java.lang.Class[] {};
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray37);
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        boolean boolean44 = signature32.equals((java.lang.Object) strArray43);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type48 = signature47.getReturnType();
        java.lang.Class<?> wildcardClass49 = signature47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass49);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, false);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray53);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray55);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type22 = signature21.getReturnType();
        java.lang.String str23 = signature21.getName();
        org.mockito.asm.Type type24 = signature21.getReturnType();
        boolean boolean25 = classInfo18.equals((java.lang.Object) type24);
        java.lang.String str26 = classInfo18.toString();
        org.mockito.asm.Type type27 = classInfo18.getSuperType();
        org.mockito.asm.Type type28 = classInfo18.getSuperType();
        org.mockito.asm.Type type29 = classInfo18.getType();
        java.lang.String str30 = classInfo18.toString();
        org.mockito.asm.Type type31 = classInfo18.getSuperType();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        java.lang.String str36 = propertyDescriptor35.getShortDescription();
        java.lang.reflect.Method method37 = propertyDescriptor35.getWriteMethod();
        java.lang.String str38 = propertyDescriptor35.getShortDescription();
        propertyDescriptor35.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method42 = null;
        propertyDescriptor35.setReadMethod(method42);
        boolean boolean44 = propertyDescriptor35.isExpert();
        propertyDescriptor35.setName("(VBLhi!;SD)B");
        propertyDescriptor35.setPreferred(false);
        java.lang.Class<?> wildcardClass49 = propertyDescriptor35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass49);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass49);
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass49);
        boolean boolean53 = classInfo18.equals((java.lang.Object) str52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor35", propertyDescriptor3.equals(propertyDescriptor35) ? propertyDescriptor3.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("B", method1, method2);
        boolean boolean4 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type type14 = classInfo11.getType();
        org.mockito.asm.Type type15 = classInfo11.getType();
        propertyDescriptor3.setValue("L(DBBBD)V;", (java.lang.Object) type15);
        int int17 = type15.getSort();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type20 = classInfo19.getType();
        int int21 = classInfo19.getModifiers();
        int int22 = classInfo19.getModifiers();
        org.mockito.asm.Type type23 = classInfo19.getSuperType();
        int int24 = classInfo19.getModifiers();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getShortDescription();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        propertyDescriptor28.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor28.setName("double");
        propertyDescriptor28.setExpert(false);
        propertyDescriptor28.setShortDescription("F");
        propertyDescriptor28.setName("java.beans.PropertyDescriptor[name=hi!; expert]");
        boolean boolean42 = propertyDescriptor28.isHidden();
        propertyDescriptor28.setConstrained(false);
        boolean boolean45 = classInfo19.equals((java.lang.Object) propertyDescriptor28);
        org.mockito.asm.Type type46 = classInfo19.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method16 = propertyDescriptor3.getWriteMethod();
        boolean boolean17 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method18 = null;
        propertyDescriptor3.setReadMethod(method18);
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method21 = null;
        propertyDescriptor3.setReadMethod(method21);
        java.lang.String str23 = propertyDescriptor3.getName();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        java.lang.String str28 = propertyDescriptor27.getShortDescription();
        java.lang.reflect.Method method29 = propertyDescriptor27.getWriteMethod();
        propertyDescriptor27.setValue("double", (java.lang.Object) ' ');
        boolean boolean33 = propertyDescriptor27.isExpert();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.lang.Class<?> wildcardClass39 = propertyDescriptor38.getClass();
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass39);
        propertyDescriptor27.setValue("float", (java.lang.Object) wildcardClass39);
        java.lang.Class<?> wildcardClass42 = propertyDescriptor27.getPropertyEditorClass();
        java.lang.reflect.Method method43 = propertyDescriptor27.getReadMethod();
        java.lang.reflect.Method method44 = propertyDescriptor27.getWriteMethod();
        propertyDescriptor27.setPreferred(false);
        boolean boolean47 = propertyDescriptor27.isExpert();
        propertyDescriptor27.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method50 = propertyDescriptor27.getReadMethod();
        propertyDescriptor27.setExpert(false);
        propertyDescriptor27.setExpert(false);
        propertyDescriptor27.setPreferred(false);
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor27 and propertyDescriptor38", propertyDescriptor27.equals(propertyDescriptor38) ? propertyDescriptor27.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.Object obj19 = null;
        boolean boolean20 = classInfo18.equals(obj19);
        org.mockito.asm.Type[] typeArray21 = classInfo18.getInterfaces();
        int int22 = classInfo18.getModifiers();
        java.lang.String str23 = classInfo18.toString();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.Class<?> wildcardClass28 = signature26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray32 = classInfo31.getInterfaces();
        boolean boolean33 = classInfo18.equals((java.lang.Object) typeArray32);
        org.mockito.asm.Type[] typeArray34 = classInfo18.getInterfaces();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("(DBBBD)B", method36, method37);
        propertyDescriptor38.setHidden(false);
        java.util.Enumeration<java.lang.String> strEnumeration41 = propertyDescriptor38.attributeNames();
        propertyDescriptor38.setExpert(true);
        java.lang.Class<?> wildcardClass44 = propertyDescriptor38.getPropertyType();
        propertyDescriptor38.setName("()J");
        propertyDescriptor38.setPreferred(false);
        java.lang.reflect.Method method49 = propertyDescriptor38.getReadMethod();
        boolean boolean50 = classInfo18.equals((java.lang.Object) method49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor38", propertyDescriptor3.equals(propertyDescriptor38) ? propertyDescriptor3.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.toString();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DBBBD)B", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type12);
        propertyDescriptor3.setHidden(true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.String str23 = propertyDescriptor22.getShortDescription();
        java.lang.reflect.Method method24 = propertyDescriptor22.getWriteMethod();
        propertyDescriptor22.setValue("double", (java.lang.Object) ' ');
        boolean boolean28 = propertyDescriptor22.isExpert();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass34);
        propertyDescriptor22.setValue("float", (java.lang.Object) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        int int38 = classInfo37.getModifiers();
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        java.lang.String str43 = propertyDescriptor42.getShortDescription();
        java.lang.reflect.Method method44 = propertyDescriptor42.getWriteMethod();
        propertyDescriptor42.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean48 = classInfo37.equals((java.lang.Object) propertyDescriptor42);
        int int49 = classInfo37.getModifiers();
        org.mockito.asm.Type[] typeArray50 = classInfo37.getInterfaces();
        boolean boolean52 = classInfo37.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type53 = classInfo37.getType();
        java.lang.String str54 = type53.getInternalName();
        org.mockito.asm.Type type55 = type53.getElementType();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.String str60 = propertyDescriptor59.getShortDescription();
        java.lang.reflect.Method method61 = propertyDescriptor59.getWriteMethod();
        java.lang.String str62 = propertyDescriptor59.getShortDescription();
        propertyDescriptor59.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method66 = null;
        propertyDescriptor59.setReadMethod(method66);
        boolean boolean68 = propertyDescriptor59.isExpert();
        propertyDescriptor59.setName("(VBLhi!;SD)B");
        propertyDescriptor59.setPreferred(false);
        propertyDescriptor59.setHidden(false);
        boolean boolean75 = type53.equals((java.lang.Object) propertyDescriptor59);
        java.lang.Object obj77 = propertyDescriptor59.getValue("java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/cglib/core/Signature;; values={byte=0}; bound]");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=C]", (java.lang.Object) propertyDescriptor59);
        boolean boolean79 = propertyDescriptor59.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type4 = signature3.getReturnType();
        java.lang.String str5 = signature3.getName();
        org.mockito.asm.Type type6 = signature3.getReturnType();
        java.lang.String str7 = signature3.getDescriptor();
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray8);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        boolean boolean15 = signature3.equals((java.lang.Object) strArray14);
        java.lang.String str16 = signature3.getDescriptor();
        org.mockito.asm.Type type17 = signature3.getReturnType();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        int int22 = type21.getSort();
        int int24 = type21.getOpcode(3);
        java.lang.String str25 = type21.getClassName();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BYTE_TYPE;
        int int27 = type26.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BYTE_TYPE;
        int int29 = type28.getSort();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str31 = type30.getClassName();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type19, type21, type26, type28, type30 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray32);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type17, typeArray32);
        org.mockito.asm.Type[] typeArray35 = signature34.getArgumentTypes();
        org.mockito.asm.Type[] typeArray36 = signature34.getArgumentTypes();
        org.mockito.asm.Type type37 = signature34.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = type37.getDimensions();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str23 = signature22.toString();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={double= ; float=class java.beans.PropertyDescriptor}]", method25, method26);
        java.lang.Object obj29 = propertyDescriptor27.getValue("ava.beans.PropertyDescriptor[name=hi!");
        boolean boolean30 = signature22.equals((java.lang.Object) propertyDescriptor27);
        boolean boolean31 = propertyDescriptor27.isHidden();
        propertyDescriptor27.setPreferred(true);
        java.lang.reflect.Method method34 = propertyDescriptor27.getReadMethod();
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor27);
        java.lang.Class<?> wildcardClass36 = propertyDescriptor3.getPropertyEditorClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor27", propertyDescriptor14.equals(propertyDescriptor27) ? propertyDescriptor14.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(4);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.String str13 = signature11.getName();
        org.mockito.asm.Type type14 = signature11.getReturnType();
        propertyDescriptor3.setValue("B", (java.lang.Object) type14);
        propertyDescriptor3.setShortDescription("byte");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        int int23 = classInfo22.getModifiers();
        org.mockito.asm.Type type24 = classInfo22.getSuperType();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getShortDescription();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        propertyDescriptor28.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor28.setName("double");
        java.lang.reflect.Method method36 = propertyDescriptor28.getReadMethod();
        java.lang.String str37 = propertyDescriptor28.getName();
        propertyDescriptor28.setPreferred(true);
        java.lang.reflect.Method method40 = null;
        propertyDescriptor28.setWriteMethod(method40);
        boolean boolean42 = classInfo22.equals((java.lang.Object) method40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("()Lva.beans.PropertyDescriptor[name=hi!;", method1, method2);
        propertyDescriptor3.setShortDescription("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        java.lang.String str12 = propertyDescriptor11.getShortDescription();
        java.lang.reflect.Method method13 = propertyDescriptor11.getWriteMethod();
        java.lang.String str14 = propertyDescriptor11.getShortDescription();
        propertyDescriptor11.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration18 = propertyDescriptor11.attributeNames();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type23 = signature22.getReturnType();
        java.lang.Class<?> wildcardClass24 = signature22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type27 = classInfo26.getSuperType();
        java.lang.String str28 = type27.getInternalName();
        java.lang.String str29 = type27.getClassName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.FLOAT_TYPE;
        int int32 = type31.getSize();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type42 = signature41.getReturnType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BYTE_TYPE;
        int int47 = type46.getSort();
        int int49 = type46.getOpcode(3);
        java.lang.String str50 = type46.getClassName();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BYTE_TYPE;
        int int52 = type51.getSort();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BYTE_TYPE;
        int int54 = type53.getSort();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str56 = type55.getClassName();
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type44, type46, type51, type53, type55 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BYTE_TYPE;
        int int60 = type59.getSize();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str63 = type62.getDescriptor();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str66 = type65.getClassName();
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type43, type59, type62, type64, type65 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str71 = type70.getClassName();
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BYTE_TYPE;
        int int73 = type72.getSort();
        int int75 = type72.getOpcode(3);
        java.lang.String str76 = type72.getClassName();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.BYTE_TYPE;
        int int78 = type77.getSort();
        org.mockito.asm.Type type79 = org.mockito.asm.Type.BYTE_TYPE;
        int int80 = type79.getSort();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str82 = type81.getClassName();
        org.mockito.asm.Type[] typeArray83 = new org.mockito.asm.Type[] { type70, type72, type77, type79, type81 };
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray83);
        java.lang.String str85 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray83);
        java.lang.String str86 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray83);
        org.mockito.cglib.core.Signature signature87 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type35, typeArray83);
        org.mockito.cglib.core.Signature signature88 = new org.mockito.cglib.core.Signature("hi!", type31, typeArray83);
        org.mockito.cglib.core.Signature signature89 = new org.mockito.cglib.core.Signature("F", type27, typeArray83);
        java.beans.PropertyEditor propertyEditor90 = propertyDescriptor11.createPropertyEditor((java.lang.Object) signature89);
        org.mockito.asm.Type[] typeArray91 = signature89.getArgumentTypes();
        org.mockito.asm.Type[] typeArray92 = signature89.getArgumentTypes();
        org.mockito.asm.Type type93 = signature89.getReturnType();
        java.beans.PropertyEditor propertyEditor94 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type93);
        java.lang.String str95 = type93.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor11", propertyDescriptor3.equals(propertyDescriptor11) ? propertyDescriptor3.hashCode() == propertyDescriptor11.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("B", method15, method16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method16);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor3.attributeNames();
        java.lang.Object obj21 = propertyDescriptor3.getValue("hi!LLorg/mockito/cglib/core/Signature;;");
        propertyDescriptor3.setConstrained(false);
        java.lang.Object obj25 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=B]double");
        java.lang.reflect.Method method26 = null;
        propertyDescriptor3.setReadMethod(method26);
        java.lang.Class<?> wildcardClass28 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(VBLhi!;SD)B");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor10.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = classInfo14.getType();
        boolean boolean16 = signature2.equals((java.lang.Object) classInfo14);
        java.lang.Object obj17 = null;
        boolean boolean18 = classInfo14.equals(obj17);
        org.mockito.asm.Type type19 = classInfo14.getType();
        int int20 = type19.getDimensions();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getReturnType("()B");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method28 = propertyDescriptor26.getWriteMethod();
        propertyDescriptor26.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor26.setName("double");
        propertyDescriptor26.setExpert(false);
        propertyDescriptor26.setShortDescription("F");
        boolean boolean38 = type22.equals((java.lang.Object) "F");
        int int39 = type22.getSort();
        int int40 = type22.getSort();
        boolean boolean41 = type19.equals((java.lang.Object) int40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor26", propertyDescriptor10.equals(propertyDescriptor26) ? propertyDescriptor10.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int2 = type0.getOpcode(15);
        java.lang.String str3 = type0.getClassName();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = null;
        propertyDescriptor3.setReadMethod(method11);
        propertyDescriptor3.setShortDescription("(DBBBD)V");
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = classInfo16.getType();
        org.mockito.asm.Type type18 = classInfo16.getType();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("D", method20, method21);
        java.lang.reflect.Method method23 = propertyDescriptor22.getWriteMethod();
        java.lang.reflect.Method method24 = null;
        propertyDescriptor22.setReadMethod(method24);
        java.util.Enumeration<java.lang.String> strEnumeration26 = propertyDescriptor22.attributeNames();
        boolean boolean27 = classInfo16.equals((java.lang.Object) propertyDescriptor22);
        int int28 = classInfo16.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method5, method6);
        boolean boolean8 = signature2.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        java.lang.String str9 = signature2.getName();
        org.mockito.asm.Type type10 = signature2.getReturnType();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.String str15 = propertyDescriptor14.getShortDescription();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        java.lang.String str17 = propertyDescriptor14.getShortDescription();
        propertyDescriptor14.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor14.setShortDescription("float");
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.beans.PropertyEditor propertyEditor27 = propertyDescriptor14.createPropertyEditor((java.lang.Object) classArray23);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor14.setWriteMethod(method28);
        propertyDescriptor14.setShortDescription("(DBBBD)Ljava/beans/PropertyDescriptor;");
        boolean boolean32 = propertyDescriptor14.isHidden();
        java.lang.String str33 = propertyDescriptor14.getName();
        java.util.Enumeration<java.lang.String> strEnumeration34 = propertyDescriptor14.attributeNames();
        java.lang.Class<?> wildcardClass35 = propertyDescriptor14.getPropertyEditorClass();
        boolean boolean36 = signature2.equals((java.lang.Object) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor14", propertyDescriptor7.equals(propertyDescriptor14) ? propertyDescriptor7.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class<?> wildcardClass4 = signature2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        boolean boolean14 = type5.equals((java.lang.Object) wildcardClass12);
        org.mockito.asm.Type type15 = type5.getElementType();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.lang.String str20 = propertyDescriptor19.getShortDescription();
        java.lang.reflect.Method method21 = propertyDescriptor19.getWriteMethod();
        propertyDescriptor19.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor19.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor19.setDisplayName("");
        boolean boolean29 = propertyDescriptor19.isExpert();
        propertyDescriptor19.setDisplayName("va.lang.Object");
        boolean boolean32 = propertyDescriptor19.isExpert();
        boolean boolean33 = type5.equals((java.lang.Object) propertyDescriptor19);
        propertyDescriptor19.setBound(false);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = classInfo41.getType();
        java.lang.String str43 = classInfo41.toString();
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor19.createPropertyEditor((java.lang.Object) str43);
        java.lang.reflect.Method method45 = null;
        propertyDescriptor19.setWriteMethod(method45);
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        java.lang.String str51 = propertyDescriptor50.getShortDescription();
        java.lang.reflect.Method method52 = propertyDescriptor50.getWriteMethod();
        propertyDescriptor50.setValue("double", (java.lang.Object) ' ');
        boolean boolean56 = propertyDescriptor50.isExpert();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("hi!", method59, method60);
        java.lang.Class<?> wildcardClass62 = propertyDescriptor61.getClass();
        java.lang.String str63 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass62);
        propertyDescriptor50.setValue("float", (java.lang.Object) wildcardClass62);
        java.lang.Class<?> wildcardClass65 = propertyDescriptor50.getPropertyEditorClass();
        java.lang.reflect.Method method66 = propertyDescriptor50.getReadMethod();
        java.lang.reflect.Method method67 = propertyDescriptor50.getWriteMethod();
        propertyDescriptor50.setPreferred(false);
        boolean boolean70 = propertyDescriptor50.isExpert();
        propertyDescriptor50.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        propertyDescriptor50.setShortDescription("Ljava/lang/Object;");
        propertyDescriptor50.setDisplayName("java.beans.PropertyDescriptor");
        java.util.Enumeration<java.lang.String> strEnumeration77 = propertyDescriptor50.attributeNames();
        propertyDescriptor50.setPreferred(false);
        boolean boolean80 = propertyDescriptor19.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor50", propertyDescriptor9.equals(propertyDescriptor50) ? propertyDescriptor9.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getName();
        java.lang.String str6 = signature2.getName();
        java.lang.String str7 = signature2.getDescriptor();
        org.mockito.asm.Type type8 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type8.getDimensions();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setShortDescription("float");
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        java.lang.String str19 = propertyDescriptor18.getShortDescription();
        java.lang.reflect.Method method20 = propertyDescriptor18.getWriteMethod();
        java.lang.String str21 = propertyDescriptor18.getShortDescription();
        boolean boolean22 = propertyDescriptor18.isPreferred();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type27 = signature26.getReturnType();
        java.lang.String str28 = signature26.getName();
        org.mockito.asm.Type type29 = signature26.getReturnType();
        propertyDescriptor18.setValue("B", (java.lang.Object) type29);
        propertyDescriptor18.setShortDescription("byte");
        java.lang.Class<?> wildcardClass33 = propertyDescriptor18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        java.lang.String str42 = classInfo41.toString();
        org.mockito.asm.Type type43 = classInfo41.getSuperType();
        boolean boolean44 = classInfo35.equals((java.lang.Object) classInfo41);
        org.mockito.asm.Type type45 = classInfo41.getType();
        org.mockito.asm.Type type46 = classInfo41.getSuperType();
        propertyDescriptor3.setValue("LLorg.mockito.cglib.core.Signature;;", (java.lang.Object) classInfo41);
        propertyDescriptor3.setHidden(true);
        java.lang.String str50 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("(VBLhi!;SD)B");
        int int54 = type52.getOpcode((int) '4');
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor3.createPropertyEditor((java.lang.Object) '4');
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("B", method58, method59);
        propertyDescriptor60.setName("Ljava.beans.PropertyDescriptor[name=hi!; values={byte=0}];");
        java.util.Enumeration<java.lang.String> strEnumeration63 = propertyDescriptor60.attributeNames();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=byteB; constrained]", (java.lang.Object) propertyDescriptor60);
        propertyDescriptor3.setExpert(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor60", propertyDescriptor18.equals(propertyDescriptor60) ? propertyDescriptor18.hashCode() == propertyDescriptor60.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]", method1, method2);
        java.lang.Object obj4 = null;
        java.beans.PropertyEditor propertyEditor5 = propertyDescriptor3.createPropertyEditor(obj4);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        java.lang.String str10 = propertyDescriptor9.getShortDescription();
        java.lang.reflect.Method method11 = propertyDescriptor9.getWriteMethod();
        propertyDescriptor9.setValue("double", (java.lang.Object) ' ');
        boolean boolean15 = propertyDescriptor9.isExpert();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        propertyDescriptor9.setValue("float", (java.lang.Object) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        int int25 = classInfo24.getModifiers();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        java.lang.String str30 = propertyDescriptor29.getShortDescription();
        java.lang.reflect.Method method31 = propertyDescriptor29.getWriteMethod();
        propertyDescriptor29.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean35 = classInfo24.equals((java.lang.Object) propertyDescriptor29);
        int int36 = classInfo24.getModifiers();
        org.mockito.asm.Type[] typeArray37 = classInfo24.getInterfaces();
        boolean boolean39 = classInfo24.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type40 = classInfo24.getSuperType();
        org.mockito.asm.Type[] typeArray41 = classInfo24.getInterfaces();
        org.mockito.asm.Type type42 = classInfo24.getSuperType();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.String str47 = propertyDescriptor46.getShortDescription();
        java.lang.reflect.Method method48 = propertyDescriptor46.getWriteMethod();
        java.lang.String str49 = propertyDescriptor46.getShortDescription();
        boolean boolean50 = propertyDescriptor46.isPreferred();
        java.lang.reflect.Method method51 = null;
        propertyDescriptor46.setReadMethod(method51);
        java.lang.reflect.Method method53 = null;
        propertyDescriptor46.setReadMethod(method53);
        boolean boolean55 = type42.equals((java.lang.Object) propertyDescriptor46);
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        java.lang.String str60 = propertyDescriptor59.getShortDescription();
        java.lang.reflect.Method method61 = propertyDescriptor59.getWriteMethod();
        propertyDescriptor59.setValue("double", (java.lang.Object) ' ');
        boolean boolean65 = propertyDescriptor59.isExpert();
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Method method69 = null;
        java.beans.PropertyDescriptor propertyDescriptor70 = new java.beans.PropertyDescriptor("hi!", method68, method69);
        java.lang.Class<?> wildcardClass71 = propertyDescriptor70.getClass();
        java.lang.String str72 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass71);
        propertyDescriptor59.setValue("float", (java.lang.Object) wildcardClass71);
        org.mockito.cglib.core.ClassInfo classInfo74 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass71);
        int int75 = classInfo74.getModifiers();
        java.lang.reflect.Method method77 = null;
        java.lang.reflect.Method method78 = null;
        java.beans.PropertyDescriptor propertyDescriptor79 = new java.beans.PropertyDescriptor("hi!", method77, method78);
        java.lang.String str80 = propertyDescriptor79.getShortDescription();
        java.lang.reflect.Method method81 = propertyDescriptor79.getWriteMethod();
        propertyDescriptor79.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean85 = classInfo74.equals((java.lang.Object) propertyDescriptor79);
        int int86 = classInfo74.getModifiers();
        org.mockito.asm.Type type87 = classInfo74.getSuperType();
        int int88 = classInfo74.getModifiers();
        org.mockito.asm.Type[] typeArray89 = classInfo74.getInterfaces();
        boolean boolean90 = type42.equals((java.lang.Object) classInfo74);
        org.mockito.asm.Type type91 = classInfo74.getSuperType();
        java.lang.String str92 = type91.getInternalName();
        java.beans.PropertyEditor propertyEditor93 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type91);
        java.lang.String str94 = type91.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        java.lang.String str20 = classInfo19.toString();
        org.mockito.asm.Type type21 = classInfo19.getSuperType();
        org.mockito.asm.Type type22 = type21.getElementType();
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        java.lang.String str27 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method28 = propertyDescriptor26.getWriteMethod();
        java.lang.String str29 = propertyDescriptor26.getShortDescription();
        propertyDescriptor26.setValue("byte", (java.lang.Object) (byte) 0);
        java.lang.reflect.Method method33 = null;
        propertyDescriptor26.setReadMethod(method33);
        propertyDescriptor26.setDisplayName("double");
        propertyDescriptor26.setPreferred(true);
        propertyDescriptor26.setConstrained(true);
        boolean boolean41 = type21.equals((java.lang.Object) propertyDescriptor26);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        java.lang.String str47 = propertyDescriptor46.getShortDescription();
        java.lang.reflect.Method method48 = propertyDescriptor46.getWriteMethod();
        java.lang.String str49 = propertyDescriptor46.getShortDescription();
        propertyDescriptor46.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor46.setShortDescription("float");
        propertyDescriptor46.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("B", method58, method59);
        java.beans.PropertyEditor propertyEditor61 = propertyDescriptor46.createPropertyEditor((java.lang.Object) method59);
        java.util.Enumeration<java.lang.String> strEnumeration62 = propertyDescriptor46.attributeNames();
        java.lang.String str63 = propertyDescriptor46.getDisplayName();
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type68 = signature67.getReturnType();
        java.lang.String str69 = signature67.getName();
        org.mockito.asm.Type type70 = signature67.getReturnType();
        java.lang.String str71 = signature67.getDescriptor();
        java.lang.Class[] classArray72 = new java.lang.Class[] {};
        int int73 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray72);
        int int74 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray72);
        int int75 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray72);
        java.lang.Class[] classArray76 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray72);
        java.lang.String[] strArray77 = org.mockito.cglib.core.ReflectUtils.getNames(classArray76);
        java.lang.String[] strArray78 = org.mockito.cglib.core.ReflectUtils.getNames(classArray76);
        boolean boolean79 = signature67.equals((java.lang.Object) strArray78);
        java.lang.String str80 = signature67.getDescriptor();
        java.lang.String str81 = signature67.getDescriptor();
        propertyDescriptor46.setValue("J", (java.lang.Object) signature67);
        java.lang.String str83 = propertyDescriptor46.getName();
        propertyDescriptor26.setValue("F(DBBBD)Ljava/lang/Object;", (java.lang.Object) propertyDescriptor46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor60", propertyDescriptor3.equals(propertyDescriptor60) ? propertyDescriptor3.hashCode() == propertyDescriptor60.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        propertyDescriptor3.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setDisplayName("");
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(true);
        java.lang.String str18 = propertyDescriptor3.getName();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        java.lang.String str23 = propertyDescriptor22.getShortDescription();
        java.lang.reflect.Method method24 = propertyDescriptor22.getWriteMethod();
        java.lang.String str25 = propertyDescriptor22.getShortDescription();
        propertyDescriptor22.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor22.setDisplayName("Lorg/mockito/cglib/core/Signature;");
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor22);
        boolean boolean32 = propertyDescriptor22.isExpert();
        boolean boolean33 = propertyDescriptor22.isPreferred();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("double", method35, method36);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type41 = signature40.getReturnType();
        java.lang.Class<?> wildcardClass42 = signature40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("byteB");
        boolean boolean48 = classInfo45.equals((java.lang.Object) type47);
        org.mockito.asm.Type type49 = classInfo45.getType();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        java.lang.String str54 = propertyDescriptor53.getShortDescription();
        java.lang.reflect.Method method55 = propertyDescriptor53.getWriteMethod();
        java.lang.String str56 = propertyDescriptor53.getShortDescription();
        boolean boolean57 = propertyDescriptor53.isPreferred();
        boolean boolean58 = propertyDescriptor53.isExpert();
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type62 = signature61.getReturnType();
        java.lang.Class<?> wildcardClass63 = signature61.getClass();
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        java.beans.PropertyDescriptor propertyDescriptor67 = new java.beans.PropertyDescriptor("hi!", method65, method66);
        java.lang.Class<?> wildcardClass68 = propertyDescriptor67.getClass();
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type72 = signature71.getReturnType();
        java.lang.Class<?> wildcardClass73 = signature71.getClass();
        java.lang.Class[] classArray74 = new java.lang.Class[] { wildcardClass63, wildcardClass68, wildcardClass73 };
        int int75 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        java.beans.PropertyEditor propertyEditor76 = propertyDescriptor53.createPropertyEditor((java.lang.Object) classArray74);
        int int77 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray74);
        java.lang.Class[] classArray78 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray74);
        java.lang.String[] strArray79 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        boolean boolean80 = classInfo45.equals((java.lang.Object) classArray74);
        java.lang.String[] strArray81 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        java.lang.String[] strArray82 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        java.lang.reflect.Method method84 = null;
        java.lang.reflect.Method method85 = null;
        java.beans.PropertyDescriptor propertyDescriptor86 = new java.beans.PropertyDescriptor("hi!", method84, method85);
        java.lang.Class<?> wildcardClass87 = propertyDescriptor86.getClass();
        org.mockito.cglib.core.ClassInfo classInfo88 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass87);
        java.beans.PropertyDescriptor[] propertyDescriptorArray89 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass87);
        java.lang.reflect.Method[] methodArray92 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray89, false, true);
        java.lang.Class[] classArray93 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray92);
        java.lang.reflect.Method[] methodArray94 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray82, methodArray92);
        java.beans.PropertyEditor propertyEditor95 = propertyDescriptor37.createPropertyEditor((java.lang.Object) strArray82);
        boolean boolean96 = propertyDescriptor22.equals((java.lang.Object) propertyEditor95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor37", propertyDescriptor3.equals(propertyDescriptor37) ? propertyDescriptor3.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        int int3 = type0.getOpcode(3);
        java.lang.String str4 = type0.getDescriptor();
        int int6 = type0.getOpcode(0);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type10 = signature9.getReturnType();
        java.lang.String str11 = signature9.toString();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        java.lang.String str18 = propertyDescriptor15.getShortDescription();
        propertyDescriptor15.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor15.setExpert(false);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor15.getPropertyEditorClass();
        java.lang.reflect.Method method25 = null;
        propertyDescriptor15.setWriteMethod(method25);
        java.lang.Class<?> wildcardClass27 = propertyDescriptor15.getPropertyType();
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor15.attributeNames();
        propertyDescriptor15.setName("(DBBBD)Lava.beans.PropertyDescriptor[name=hi!;");
        boolean boolean31 = signature9.equals((java.lang.Object) propertyDescriptor15);
        boolean boolean32 = type0.equals((java.lang.Object) signature9);
        org.mockito.asm.Type type33 = signature9.getReturnType();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.String str38 = propertyDescriptor37.getShortDescription();
        java.lang.reflect.Method method39 = propertyDescriptor37.getWriteMethod();
        propertyDescriptor37.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        propertyDescriptor37.setName("double");
        propertyDescriptor37.setExpert(false);
        propertyDescriptor37.setConstrained(true);
        java.lang.reflect.Method method49 = null;
        propertyDescriptor37.setWriteMethod(method49);
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("hi!", method52, method53);
        java.lang.String str55 = propertyDescriptor54.getShortDescription();
        java.lang.reflect.Method method56 = propertyDescriptor54.getWriteMethod();
        propertyDescriptor54.setValue("double", (java.lang.Object) ' ');
        boolean boolean60 = propertyDescriptor54.isExpert();
        java.lang.reflect.Method method63 = null;
        java.lang.reflect.Method method64 = null;
        java.beans.PropertyDescriptor propertyDescriptor65 = new java.beans.PropertyDescriptor("hi!", method63, method64);
        java.lang.Class<?> wildcardClass66 = propertyDescriptor65.getClass();
        java.lang.String str67 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass66);
        propertyDescriptor54.setValue("float", (java.lang.Object) wildcardClass66);
        java.lang.Class<?> wildcardClass69 = propertyDescriptor54.getPropertyEditorClass();
        java.lang.reflect.Method method70 = propertyDescriptor54.getReadMethod();
        java.lang.reflect.Method method71 = propertyDescriptor54.getWriteMethod();
        boolean boolean72 = propertyDescriptor54.isHidden();
        java.lang.Object obj74 = propertyDescriptor54.getValue("java.beans.PropertyDescriptor[name=V]");
        java.beans.PropertyEditor propertyEditor75 = propertyDescriptor37.createPropertyEditor((java.lang.Object) propertyDescriptor54);
        boolean boolean76 = signature9.equals((java.lang.Object) propertyDescriptor37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor54", propertyDescriptor15.equals(propertyDescriptor54) ? propertyDescriptor15.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        boolean boolean7 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setReadMethod(method8);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type13 = signature12.getReturnType();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method15, method16);
        boolean boolean18 = signature12.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        propertyDescriptor3.setDisplayName("float()L!;");
        java.lang.Class<?> wildcardClass22 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BYTE_TYPE;
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(3);
        java.lang.String str5 = type1.getDescriptor();
        int int7 = type1.getOpcode(0);
        java.lang.String str8 = type1.getClassName();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type12 = signature11.getReturnType();
        java.lang.Class<?> wildcardClass13 = signature11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type16 = classInfo15.getSuperType();
        java.lang.String str17 = type16.getInternalName();
        java.lang.String str18 = type16.getInternalName();
        java.lang.String str19 = type16.getInternalName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=hi!; values={java.beans.PropertyDescriptor[name=hi!]=0}]");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getReturnType("Lhi!;");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type31 = signature30.getReturnType();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        int int36 = type35.getSort();
        int int38 = type35.getOpcode(3);
        java.lang.String str39 = type35.getClassName();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BYTE_TYPE;
        int int41 = type40.getSort();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSort();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str45 = type44.getClassName();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type33, type35, type40, type42, type44 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.BYTE_TYPE;
        int int49 = type48.getSize();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str52 = type51.getDescriptor();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str55 = type54.getClassName();
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type32, type48, type51, type53, type54 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str60 = type59.getClassName();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSort();
        int int64 = type61.getOpcode(3);
        java.lang.String str65 = type61.getClassName();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.BYTE_TYPE;
        int int67 = type66.getSort();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BYTE_TYPE;
        int int69 = type68.getSort();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str71 = type70.getClassName();
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type59, type61, type66, type68, type70 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray72);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type24, typeArray72);
        java.lang.String str77 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray72);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray72);
        org.mockito.cglib.core.Signature signature79 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=V]", type1, typeArray72);
        org.mockito.asm.Type type80 = signature79.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str81 = type80.getInternalName();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("V");
        int int2 = type1.getSize();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]]");
        java.lang.Object obj27 = propertyDescriptor3.getValue("L(DBBBD)V;");
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.String str33 = propertyDescriptor32.getDisplayName();
        boolean boolean34 = propertyDescriptor32.isHidden();
        propertyDescriptor32.setHidden(false);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor32.getClass();
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        propertyDescriptor3.setValue("(DBBBD)B", (java.lang.Object) wildcardClass37);
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type6 = signature5.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BYTE_TYPE;
        int int11 = type10.getSort();
        int int13 = type10.getOpcode(3);
        java.lang.String str14 = type10.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BYTE_TYPE;
        int int16 = type15.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BYTE_TYPE;
        int int18 = type17.getSort();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getClassName();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type8, type10, type15, type17, type19 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BYTE_TYPE;
        int int24 = type23.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str30 = type29.getClassName();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type7, type23, type26, type28, type29 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray31);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type2, typeArray31);
        java.lang.String str34 = signature33.getName();
        java.lang.String str35 = signature33.toString();
        java.lang.String str36 = signature33.toString();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("hi!", method38, method39);
        java.lang.String str41 = propertyDescriptor40.getShortDescription();
        java.lang.reflect.Method method42 = propertyDescriptor40.getWriteMethod();
        propertyDescriptor40.setValue("double", (java.lang.Object) ' ');
        boolean boolean46 = propertyDescriptor40.isExpert();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor51.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        propertyDescriptor40.setValue("float", (java.lang.Object) wildcardClass52);
        org.mockito.cglib.core.ClassInfo classInfo55 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass52);
        int int56 = classInfo55.getModifiers();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("hi!", method58, method59);
        java.lang.String str61 = propertyDescriptor60.getShortDescription();
        java.lang.reflect.Method method62 = propertyDescriptor60.getWriteMethod();
        propertyDescriptor60.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean66 = classInfo55.equals((java.lang.Object) propertyDescriptor60);
        int int67 = classInfo55.getModifiers();
        org.mockito.asm.Type[] typeArray68 = classInfo55.getInterfaces();
        boolean boolean70 = classInfo55.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type71 = classInfo55.getType();
        org.mockito.asm.Type type72 = classInfo55.getType();
        int int73 = classInfo55.getModifiers();
        org.mockito.asm.Type[] typeArray74 = classInfo55.getInterfaces();
        org.mockito.asm.Type type75 = classInfo55.getType();
        boolean boolean76 = signature33.equals((java.lang.Object) type75);
        java.lang.reflect.Method method78 = null;
        java.lang.reflect.Method method79 = null;
        java.beans.PropertyDescriptor propertyDescriptor80 = new java.beans.PropertyDescriptor("LDBBBD)Lvoid;", method78, method79);
        boolean boolean81 = signature33.equals((java.lang.Object) "LDBBBD)Lvoid;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor40 and propertyDescriptor80", propertyDescriptor40.equals(propertyDescriptor80) ? propertyDescriptor40.hashCode() == propertyDescriptor80.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj20 = propertyDescriptor3.getValue("LLorg/mockito/cglib/core/Signature;;");
        java.lang.String str21 = propertyDescriptor3.getShortDescription();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        int int24 = classInfo23.getModifiers();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        java.lang.String str29 = propertyDescriptor28.getShortDescription();
        java.lang.reflect.Method method30 = propertyDescriptor28.getWriteMethod();
        propertyDescriptor28.setValue("double", (java.lang.Object) ' ');
        boolean boolean34 = propertyDescriptor28.isExpert();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        propertyDescriptor28.setValue("float", (java.lang.Object) wildcardClass40);
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        int int44 = classInfo43.getModifiers();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        java.lang.String str49 = propertyDescriptor48.getShortDescription();
        java.lang.reflect.Method method50 = propertyDescriptor48.getWriteMethod();
        propertyDescriptor48.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean54 = classInfo43.equals((java.lang.Object) propertyDescriptor48);
        int int55 = classInfo43.getModifiers();
        org.mockito.asm.Type[] typeArray56 = classInfo43.getInterfaces();
        boolean boolean58 = classInfo43.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type59 = classInfo43.getSuperType();
        org.mockito.asm.Type type60 = classInfo43.getSuperType();
        org.mockito.asm.Type type61 = classInfo43.getSuperType();
        org.mockito.asm.Type type62 = classInfo43.getType();
        org.mockito.asm.Type type63 = classInfo43.getType();
        int int64 = classInfo43.getModifiers();
        org.mockito.asm.Type type65 = classInfo43.getSuperType();
        boolean boolean66 = classInfo23.equals((java.lang.Object) classInfo43);
        java.lang.reflect.Method method68 = null;
        java.lang.reflect.Method method69 = null;
        java.beans.PropertyDescriptor propertyDescriptor70 = new java.beans.PropertyDescriptor("hi!", method68, method69);
        java.lang.String str71 = propertyDescriptor70.getShortDescription();
        java.lang.reflect.Method method72 = propertyDescriptor70.getWriteMethod();
        propertyDescriptor70.setValue("double", (java.lang.Object) ' ');
        java.util.Enumeration<java.lang.String> strEnumeration76 = propertyDescriptor70.attributeNames();
        propertyDescriptor70.setName("java.beans.PropertyDescriptor[name=g.mockito.cglib.core.Signature]");
        boolean boolean79 = classInfo43.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=g.mockito.cglib.core.Signature]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor70", propertyDescriptor3.equals(propertyDescriptor70) ? propertyDescriptor3.hashCode() == propertyDescriptor70.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("byte", "B");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        boolean boolean6 = signature2.equals((java.lang.Object) false);
        java.lang.String str7 = signature2.getDescriptor();
        org.mockito.asm.Type type8 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type8.getInternalName();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method19 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setPreferred(false);
        boolean boolean23 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method26 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(true);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!B", method33, method34);
        java.lang.reflect.Method method36 = null;
        propertyDescriptor35.setReadMethod(method36);
        java.beans.PropertyEditor propertyEditor38 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor35);
        java.lang.reflect.Method method39 = propertyDescriptor3.getReadMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor35", propertyDescriptor14.equals(propertyDescriptor35) ? propertyDescriptor14.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setValue("byte", (java.lang.Object) (byte) 0);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.lang.String str16 = propertyDescriptor15.getShortDescription();
        java.lang.reflect.Method method17 = propertyDescriptor15.getWriteMethod();
        propertyDescriptor15.setBound(false);
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor3.setShortDescription("hi!");
        java.lang.reflect.Method method23 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; values={byte=0}]");
        propertyDescriptor3.setConstrained(false);
        boolean boolean29 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("Ljava/beans/FeatureDescriptor;", method34, method35);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type41 = signature40.getReturnType();
        java.lang.Class<?> wildcardClass42 = signature40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type[] typeArray46 = classInfo45.getInterfaces();
        propertyDescriptor36.setValue("java.beans.PropertyDescriptor[name=hi!; preferred]", (java.lang.Object) classInfo45);
        org.mockito.asm.Type type48 = classInfo45.getType();
        org.mockito.asm.Type type49 = classInfo45.getType();
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type53 = signature52.getReturnType();
        java.lang.Class<?> wildcardClass54 = signature52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo57 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type58 = classInfo57.getSuperType();
        org.mockito.asm.Type[] typeArray59 = classInfo57.getInterfaces();
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type49, typeArray59);
        java.lang.String str61 = signature60.getDescriptor();
        org.mockito.asm.Type type62 = signature60.getReturnType();
        boolean boolean63 = propertyDescriptor3.equals((java.lang.Object) signature60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor36", propertyDescriptor15.equals(propertyDescriptor36) ? propertyDescriptor15.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setConstrained(false);
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyType();
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type15 = signature14.getReturnType();
        java.lang.Class<?> wildcardClass16 = signature14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type19 = classInfo18.getSuperType();
        java.lang.String str20 = type19.getInternalName();
        java.lang.String str21 = type19.getInternalName();
        java.lang.String str22 = type19.getInternalName();
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type19);
        int int24 = type19.getDimensions();
        int int26 = type19.getOpcode(39);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.String str31 = propertyDescriptor30.getShortDescription();
        java.lang.reflect.Method method32 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor30.setValue("double", (java.lang.Object) ' ');
        boolean boolean36 = propertyDescriptor30.isExpert();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("hi!", method39, method40);
        java.lang.Class<?> wildcardClass42 = propertyDescriptor41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        propertyDescriptor30.setValue("float", (java.lang.Object) wildcardClass42);
        java.lang.Class<?> wildcardClass45 = propertyDescriptor30.getPropertyEditorClass();
        java.lang.reflect.Method method46 = propertyDescriptor30.getReadMethod();
        java.lang.reflect.Method method47 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor30.setPreferred(false);
        boolean boolean50 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setName("LLorg/mockito/cglib/core/Signature;;");
        java.lang.reflect.Method method53 = propertyDescriptor30.getReadMethod();
        java.lang.String str54 = propertyDescriptor30.getShortDescription();
        boolean boolean55 = type19.equals((java.lang.Object) propertyDescriptor30);
        int int57 = type19.getOpcode(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        boolean boolean14 = signature2.equals((java.lang.Object) strArray13);
        java.lang.String str15 = signature2.getDescriptor();
        org.mockito.asm.Type type16 = signature2.getReturnType();
        java.lang.String str17 = signature2.toString();
        org.mockito.asm.Type type18 = signature2.getReturnType();
        org.mockito.asm.Type type19 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type19.getDimensions();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method5 = propertyDescriptor3.getWriteMethod();
        propertyDescriptor3.setValue("double", (java.lang.Object) ' ');
        boolean boolean9 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        propertyDescriptor3.setValue("float", (java.lang.Object) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int19 = classInfo18.getModifiers();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        java.lang.String str24 = propertyDescriptor23.getShortDescription();
        java.lang.reflect.Method method25 = propertyDescriptor23.getWriteMethod();
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) (byte) 0);
        boolean boolean29 = classInfo18.equals((java.lang.Object) propertyDescriptor23);
        int int30 = classInfo18.getModifiers();
        org.mockito.asm.Type[] typeArray31 = classInfo18.getInterfaces();
        boolean boolean33 = classInfo18.equals((java.lang.Object) 100.0f);
        org.mockito.asm.Type type34 = classInfo18.getSuperType();
        org.mockito.asm.Type[] typeArray35 = classInfo18.getInterfaces();
        org.mockito.asm.Type type36 = classInfo18.getSuperType();
        java.lang.String str37 = classInfo18.toString();
        org.mockito.asm.Type type38 = classInfo18.getType();
        int int39 = classInfo18.getModifiers();
        java.lang.String str40 = classInfo18.toString();
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("(DBBBD)B", method42, method43);
        propertyDescriptor44.setHidden(false);
        java.util.Enumeration<java.lang.String> strEnumeration47 = propertyDescriptor44.attributeNames();
        boolean boolean48 = classInfo18.equals((java.lang.Object) propertyDescriptor44);
        java.lang.String str49 = classInfo18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor44", propertyDescriptor3.equals(propertyDescriptor44) ? propertyDescriptor3.hashCode() == propertyDescriptor44.hashCode() : true);
    }
}


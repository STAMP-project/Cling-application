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
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type12, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray14);
        int int17 = type9.getSort();
        propertyDescriptor7.setValue("V", (java.lang.Object) type9);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor7.getPropertyEditorClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("(JJV)J", method21, method22);
        propertyDescriptor23.setShortDescription("J");
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = new java.beans.PropertyDescriptor[] { propertyDescriptor3, propertyDescriptor7, propertyDescriptor23 };
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray26, false, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.String[] strArray4 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, false);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray13);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, true);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray26);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray28);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.Object obj6 = propertyDescriptor3.getValue("(JJV)V");
        propertyDescriptor3.setDisplayName("J");
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray19);
        int int22 = type14.getSort();
        propertyDescriptor12.setValue("V", (java.lang.Object) type14);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor12.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor12.getPropertyType();
        boolean boolean26 = propertyDescriptor12.isPreferred();
        propertyDescriptor12.setBound(true);
        propertyDescriptor12.setShortDescription("");
        propertyDescriptor12.setExpert(false);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray43);
        int int46 = type38.getSort();
        propertyDescriptor36.setValue("V", (java.lang.Object) type38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = new java.beans.PropertyDescriptor[] { propertyDescriptor3, propertyDescriptor12, propertyDescriptor36 };
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, false, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor36", propertyDescriptor3.equals(propertyDescriptor36) ? propertyDescriptor3.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.String[] strArray4 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, false);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, false);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray27, false, false);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray31);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.String[] strArray2 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, false);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type0.getDimensions();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, false);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray12);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray15, true, false);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray0, methodArray20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        boolean boolean9 = type0.equals((java.lang.Object) classArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, true, false);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray32);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray23);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        java.lang.String str20 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type12, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray14);
        int int17 = type9.getSort();
        propertyDescriptor7.setValue("V", (java.lang.Object) type9);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor7.getPropertyEditorClass();
        propertyDescriptor7.setValue("V", (java.lang.Object) 9);
        boolean boolean23 = type3.equals((java.lang.Object) propertyDescriptor7);
        java.lang.String str24 = propertyDescriptor7.getName();
        boolean boolean25 = propertyDescriptor7.isExpert();
        propertyDescriptor7.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean28 = type1.equals((java.lang.Object) propertyDescriptor7);
        java.lang.String str29 = type1.getDescriptor();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type37, type38, type39 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray40);
        int int43 = type35.getSort();
        propertyDescriptor33.setValue("V", (java.lang.Object) type35);
        java.lang.reflect.Method method45 = propertyDescriptor33.getReadMethod();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor33.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor33.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        org.mockito.cglib.core.ClassInfo classInfo49 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        boolean boolean52 = type1.equals((java.lang.Object) wildcardClass47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor33", propertyDescriptor7.equals(propertyDescriptor33) ? propertyDescriptor7.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str25 = type24.getDescriptor();
        int int27 = type24.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("S", type24, typeArray33);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature36);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor3.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.Class<?> wildcardClass41 = type40.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("hi!", method50, method51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type56, type57, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray59);
        int int62 = type54.getSort();
        propertyDescriptor52.setValue("V", (java.lang.Object) type54);
        java.lang.Class<?> wildcardClass64 = propertyDescriptor52.getPropertyEditorClass();
        propertyDescriptor52.setValue("V", (java.lang.Object) 9);
        boolean boolean68 = type48.equals((java.lang.Object) propertyDescriptor52);
        java.lang.String str69 = propertyDescriptor52.getName();
        boolean boolean70 = propertyDescriptor52.isExpert();
        propertyDescriptor52.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean73 = type46.equals((java.lang.Object) propertyDescriptor52);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str75 = type74.getDescriptor();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type77 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type78 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type79 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray80 = new org.mockito.asm.Type[] { type77, type78, type79 };
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type76, typeArray80);
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type74, typeArray80);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type46, typeArray80);
        java.lang.String str84 = signature83.toString();
        java.lang.String str85 = signature83.getDescriptor();
        boolean boolean87 = signature83.equals((java.lang.Object) 11);
        boolean boolean88 = classInfo43.equals((java.lang.Object) signature83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor52", propertyDescriptor3.equals(propertyDescriptor52) ? propertyDescriptor3.hashCode() == propertyDescriptor52.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray9);
        java.lang.String[] strArray20 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, false);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray27);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray27);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray30);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.String[] strArray2 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, false);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray6);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray25);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("S");
        int int21 = type20.getSort();
        java.lang.String str22 = type20.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type36, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray38);
        int int41 = type33.getSort();
        propertyDescriptor31.setValue("V", (java.lang.Object) type33);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor31.getPropertyEditorClass();
        propertyDescriptor31.setValue("V", (java.lang.Object) 9);
        boolean boolean47 = type27.equals((java.lang.Object) propertyDescriptor31);
        java.lang.String str48 = propertyDescriptor31.getName();
        boolean boolean49 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean52 = type25.equals((java.lang.Object) propertyDescriptor31);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str54 = type53.getDescriptor();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type56, type57, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type25, typeArray59);
        org.mockito.asm.Type[] typeArray63 = signature62.getArgumentTypes();
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray63);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor31", propertyDescriptor3.equals(propertyDescriptor31) ? propertyDescriptor3.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        int int20 = type0.getOpcode((int) (byte) 10);
        int int21 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        propertyDescriptor3.setBound(false);
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.reflect.Method method38 = null;
        propertyDescriptor37.setWriteMethod(method38);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor37.getPropertyEditorClass();
        propertyDescriptor37.setPreferred(false);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor37.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass43);
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor37", propertyDescriptor22.equals(propertyDescriptor37) ? propertyDescriptor22.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        int int18 = type10.getSort();
        propertyDescriptor8.setValue("V", (java.lang.Object) type10);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor8.getPropertyEditorClass();
        propertyDescriptor8.setValue("V", (java.lang.Object) 9);
        boolean boolean24 = type4.equals((java.lang.Object) propertyDescriptor8);
        java.lang.String str25 = propertyDescriptor8.getName();
        boolean boolean26 = propertyDescriptor8.isExpert();
        propertyDescriptor8.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean29 = type2.equals((java.lang.Object) propertyDescriptor8);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray36);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type2, typeArray36);
        java.lang.String str40 = signature39.toString();
        java.lang.String str41 = signature39.getDescriptor();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.lang.reflect.Method method46 = null;
        propertyDescriptor45.setWriteMethod(method46);
        java.lang.Class<?> wildcardClass48 = propertyDescriptor45.getPropertyEditorClass();
        propertyDescriptor45.setPreferred(false);
        java.lang.Class<?> wildcardClass51 = propertyDescriptor45.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        boolean boolean54 = signature39.equals((java.lang.Object) wildcardClass51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor45", propertyDescriptor8.equals(propertyDescriptor45) ? propertyDescriptor8.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.String[] strArray2 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, false);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, false);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, false, false);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean26 = propertyDescriptor3.isExpert();
        java.lang.String str27 = propertyDescriptor3.getShortDescription();
        java.lang.String str28 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str17 = signature16.getName();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        java.lang.String str19 = type18.getDescriptor();
        boolean boolean20 = signature2.equals((java.lang.Object) type18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type18.getDimensions();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray9);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, false, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray9);
        boolean boolean13 = signature2.equals((java.lang.Object) type3);
        java.lang.String str14 = type3.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type3.getDimensions();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.String[] strArray4 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, false);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray5, true, true);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray16);
        java.lang.String[] strArray22 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, false);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, true);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, false);
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray37);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray9);
        boolean boolean13 = signature2.equals((java.lang.Object) type3);
        java.lang.String str14 = type3.getDescriptor();
        int int15 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type3.getDimensions();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray26);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type0.getElementType();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        int int9 = type1.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray16);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]", type1, typeArray16);
        java.lang.String str21 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type1.getDimensions();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray17 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray18, true, true);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        int int29 = type27.getOpcode((int) (byte) 10);
        java.lang.String str30 = type27.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, false);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
        boolean boolean39 = type27.equals((java.lang.Object) methodArray37);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray41);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setName("S");
        boolean boolean19 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("Llong;", method21, method22);
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method22);
        propertyDescriptor3.setShortDescription("SS");
        java.lang.Class<?> wildcardClass27 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type36, type37, type38 };
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray39);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray39);
        int int42 = type34.getSort();
        propertyDescriptor32.setValue("V", (java.lang.Object) type34);
        java.lang.Class<?> wildcardClass44 = propertyDescriptor32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass44);
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass44);
        propertyDescriptor3.setValue("Lorg/mockito/cglib/core/Signature;", (java.lang.Object) classInfo47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor23 and propertyDescriptor32", propertyDescriptor23.equals(propertyDescriptor32) ? propertyDescriptor23.hashCode() == propertyDescriptor32.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        int int18 = type10.getSort();
        propertyDescriptor8.setValue("V", (java.lang.Object) type10);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor8.getPropertyEditorClass();
        propertyDescriptor8.setValue("V", (java.lang.Object) 9);
        boolean boolean24 = type4.equals((java.lang.Object) propertyDescriptor8);
        java.lang.String str25 = propertyDescriptor8.getName();
        boolean boolean26 = propertyDescriptor8.isExpert();
        propertyDescriptor8.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean29 = type2.equals((java.lang.Object) propertyDescriptor8);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str31 = type30.getDescriptor();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray36);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type2, typeArray36);
        java.lang.String str40 = signature39.toString();
        java.lang.String str41 = signature39.getDescriptor();
        boolean boolean43 = signature39.equals((java.lang.Object) 11);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getType("Llong;");
        java.lang.String str46 = type45.getInternalName();
        java.lang.String str47 = type45.toString();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        java.lang.reflect.Method method52 = null;
        propertyDescriptor51.setWriteMethod(method52);
        java.lang.Class<?> wildcardClass54 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setPreferred(false);
        java.lang.Class<?> wildcardClass57 = propertyDescriptor51.getClass();
        java.lang.String str58 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass57);
        org.mockito.cglib.core.ClassInfo classInfo59 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass57);
        int int60 = classInfo59.getModifiers();
        org.mockito.asm.Type[] typeArray61 = classInfo59.getInterfaces();
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray61);
        boolean boolean63 = signature39.equals((java.lang.Object) typeArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor51", propertyDescriptor8.equals(propertyDescriptor51) ? propertyDescriptor8.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str4 = signature3.getName();
        java.lang.String str5 = signature3.getName();
        java.lang.String str6 = signature3.toString();
        org.mockito.asm.Type type7 = signature3.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type7.getDimensions();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setName("S");
        boolean boolean19 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("Llong;", method21, method22);
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method22);
        propertyDescriptor3.setPreferred(true);
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(false);
        java.lang.String str30 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type39, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray41);
        int int44 = type36.getSort();
        propertyDescriptor34.setValue("V", (java.lang.Object) type36);
        java.lang.reflect.Method method46 = propertyDescriptor34.getReadMethod();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor34.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass48 = propertyDescriptor34.getClass();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.lang.String str53 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptorArray54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor23 and propertyDescriptor34", propertyDescriptor23.equals(propertyDescriptor34) ? propertyDescriptor23.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type12, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Llong;", method1, method2);
        propertyDescriptor3.setConstrained(false);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        int int9 = type7.getOpcode((int) (byte) 10);
        java.lang.String str10 = type7.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, false);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        boolean boolean19 = type7.equals((java.lang.Object) methodArray17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        propertyDescriptor3.setValue("J", (java.lang.Object) strArray21);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("hi!", method24, method25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        int int36 = type28.getSort();
        propertyDescriptor26.setValue("V", (java.lang.Object) type28);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass38);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray41, false, true);
        java.lang.Class[] classArray45 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray41);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray41, false, false);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor26", propertyDescriptor3.equals(propertyDescriptor26) ? propertyDescriptor3.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.getClassName();
        int int11 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray31);
        int int34 = type26.getSort();
        propertyDescriptor24.setValue("V", (java.lang.Object) type26);
        java.lang.reflect.Method method36 = propertyDescriptor24.getReadMethod();
        propertyDescriptor24.setExpert(false);
        propertyDescriptor24.setName("hi!");
        java.lang.Object obj42 = propertyDescriptor24.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration43 = propertyDescriptor24.attributeNames();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor24.getPropertyEditorClass();
        propertyDescriptor24.setName("(JJV)J");
        propertyDescriptor24.setConstrained(false);
        java.lang.Class<?> wildcardClass49 = propertyDescriptor24.getPropertyType();
        java.util.Enumeration<java.lang.String> strEnumeration50 = propertyDescriptor24.attributeNames();
        boolean boolean51 = classInfo20.equals((java.lang.Object) strEnumeration50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, false);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        propertyDescriptor3.setValue("Jhi!", (java.lang.Object) methodArray10);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type21, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray23);
        int int26 = type18.getSort();
        propertyDescriptor16.setValue("V", (java.lang.Object) type18);
        java.lang.Class<?> wildcardClass28 = propertyDescriptor16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass28);
        propertyDescriptor3.setDisplayName("");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("hi!", method38, method39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type44, type45, type46 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray47);
        int int50 = type42.getSort();
        propertyDescriptor40.setValue("V", (java.lang.Object) type42);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor40.getPropertyEditorClass();
        propertyDescriptor40.setValue("V", (java.lang.Object) 9);
        boolean boolean56 = type36.equals((java.lang.Object) propertyDescriptor40);
        java.lang.String str57 = propertyDescriptor40.getName();
        boolean boolean58 = propertyDescriptor40.isExpert();
        propertyDescriptor40.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean61 = type34.equals((java.lang.Object) propertyDescriptor40);
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor40", propertyDescriptor16.equals(propertyDescriptor40) ? propertyDescriptor16.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        int int12 = type10.getOpcode((int) (byte) 10);
        java.lang.String str13 = type10.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray20);
        boolean boolean22 = type10.equals((java.lang.Object) methodArray20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray20);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=V; shortDescription=long]", (java.lang.Object) classArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str30 = signature29.getName();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray35);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray37);
        boolean boolean40 = signature29.equals((java.lang.Object) classArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type52, type53, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray55);
        int int58 = type50.getSort();
        propertyDescriptor48.setValue("V", (java.lang.Object) type50);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor48.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass60);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray63, false, true);
        java.lang.Class[] classArray67 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray63);
        int int68 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray67);
        java.lang.String[] strArray69 = org.mockito.cglib.core.ReflectUtils.getNames(classArray67);
        java.lang.String[] strArray72 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray72, methodArray76);
        java.beans.PropertyDescriptor[] propertyDescriptorArray78 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray81 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray78, true, false);
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray72, methodArray81);
        java.beans.PropertyDescriptor[] propertyDescriptorArray83 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray86 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray83, false, false);
        java.lang.reflect.Method[] methodArray87 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray72, methodArray86);
        java.lang.reflect.Method[] methodArray88 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray69, methodArray86);
        java.lang.reflect.Method[] methodArray89 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray86);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray86);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor48", propertyDescriptor3.equals(propertyDescriptor48) ? propertyDescriptor3.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray23 = classInfo22.getInterfaces();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        java.lang.String str28 = propertyDescriptor27.getDisplayName();
        propertyDescriptor27.setShortDescription("SS");
        propertyDescriptor27.setConstrained(true);
        propertyDescriptor27.setConstrained(false);
        java.lang.reflect.Method method35 = propertyDescriptor27.getWriteMethod();
        java.lang.reflect.Method method36 = null;
        propertyDescriptor27.setReadMethod(method36);
        java.lang.String str38 = propertyDescriptor27.getName();
        boolean boolean39 = propertyDescriptor27.isHidden();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("Llong;", method41, method42);
        propertyDescriptor43.setName("S");
        java.lang.String str46 = propertyDescriptor43.getDisplayName();
        java.lang.reflect.Method method47 = null;
        propertyDescriptor43.setReadMethod(method47);
        boolean boolean49 = propertyDescriptor43.isExpert();
        java.beans.PropertyEditor propertyEditor50 = propertyDescriptor27.createPropertyEditor((java.lang.Object) propertyDescriptor43);
        propertyDescriptor27.setBound(false);
        boolean boolean53 = classInfo22.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor43", propertyDescriptor3.equals(propertyDescriptor43) ? propertyDescriptor3.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean26 = propertyDescriptor3.isExpert();
        java.lang.String str27 = propertyDescriptor3.getShortDescription();
        java.lang.String str28 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        boolean boolean22 = classInfo20.equals((java.lang.Object) 33);
        int int23 = classInfo20.getModifiers();
        org.mockito.asm.Type type24 = classInfo20.getType();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getReturnType("Z");
        int int28 = type26.getOpcode(60);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getReturnType("J");
        int int32 = type30.getOpcode(33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("LS;");
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("hi!", method42, method43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type48, type49, type50 };
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray51);
        int int54 = type46.getSort();
        propertyDescriptor44.setValue("V", (java.lang.Object) type46);
        java.lang.Class<?> wildcardClass56 = propertyDescriptor44.getPropertyEditorClass();
        propertyDescriptor44.setValue("V", (java.lang.Object) 9);
        boolean boolean60 = type40.equals((java.lang.Object) propertyDescriptor44);
        java.lang.String str61 = propertyDescriptor44.getName();
        boolean boolean62 = propertyDescriptor44.isExpert();
        propertyDescriptor44.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean65 = type38.equals((java.lang.Object) propertyDescriptor44);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str67 = type66.getDescriptor();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray72 = new org.mockito.asm.Type[] { type69, type70, type71 };
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray72);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray72);
        org.mockito.cglib.core.Signature signature75 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type38, typeArray72);
        org.mockito.asm.Type[] typeArray76 = signature75.getArgumentTypes();
        org.mockito.cglib.core.Signature signature77 = new org.mockito.cglib.core.Signature("java/beans/FeatureDescriptor", type35, typeArray76);
        java.lang.String str78 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray76);
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray76);
        boolean boolean80 = type24.equals((java.lang.Object) type26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor44", propertyDescriptor3.equals(propertyDescriptor44) ? propertyDescriptor3.hashCode() == propertyDescriptor44.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Jhi!", "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.getName();
        java.lang.String str6 = signature2.toString();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type15, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray17);
        int int20 = type12.getSort();
        propertyDescriptor10.setValue("V", (java.lang.Object) type12);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        boolean boolean28 = signature2.equals((java.lang.Object) wildcardClass22);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("(JJV)J", method31, method32);
        propertyDescriptor33.setShortDescription("J");
        java.lang.reflect.Method method36 = propertyDescriptor33.getReadMethod();
        java.lang.Object obj38 = propertyDescriptor33.getValue("Llong;");
        java.lang.reflect.Method method39 = propertyDescriptor33.getWriteMethod();
        propertyDescriptor33.setName("java.beans.FeatureDescriptor");
        boolean boolean42 = type29.equals((java.lang.Object) "java.beans.FeatureDescriptor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor33", propertyDescriptor10.equals(propertyDescriptor33) ? propertyDescriptor10.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        int int11 = type0.getOpcode(37);
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
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray31);
        int int34 = type26.getSort();
        propertyDescriptor24.setValue("V", (java.lang.Object) type26);
        java.lang.Class<?> wildcardClass36 = propertyDescriptor24.getPropertyEditorClass();
        propertyDescriptor24.setValue("V", (java.lang.Object) 9);
        java.lang.reflect.Method method40 = propertyDescriptor24.getReadMethod();
        propertyDescriptor24.setName("java.beans.PropertyDescriptor[name=longLlong;]");
        propertyDescriptor24.setShortDescription("java.beans.PropertyDescriptor[name=longLlong;]");
        boolean boolean45 = classInfo19.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=longLlong;]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        java.lang.String str20 = type0.toString();
        int int21 = type0.getSort();
        int int23 = type0.getOpcode(54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type0.getInternalName();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int3 = type1.getOpcode(33);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("LS;");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray22);
        int int25 = type17.getSort();
        propertyDescriptor15.setValue("V", (java.lang.Object) type17);
        java.lang.Class<?> wildcardClass27 = propertyDescriptor15.getPropertyEditorClass();
        propertyDescriptor15.setValue("V", (java.lang.Object) 9);
        boolean boolean31 = type11.equals((java.lang.Object) propertyDescriptor15);
        java.lang.String str32 = propertyDescriptor15.getName();
        boolean boolean33 = propertyDescriptor15.isExpert();
        propertyDescriptor15.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean36 = type9.equals((java.lang.Object) propertyDescriptor15);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str38 = type37.getDescriptor();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray43);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type9, typeArray43);
        org.mockito.asm.Type[] typeArray47 = signature46.getArgumentTypes();
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("java/beans/FeatureDescriptor", type6, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray47);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("Jhi!", "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.String str53 = signature52.getDescriptor();
        org.mockito.asm.Type type54 = signature52.getReturnType();
        java.lang.String str55 = signature52.getName();
        java.lang.String str56 = signature52.toString();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("hi!", method58, method59);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type64, type65, type66 };
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray67);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray67);
        int int70 = type62.getSort();
        propertyDescriptor60.setValue("V", (java.lang.Object) type62);
        java.lang.Class<?> wildcardClass72 = propertyDescriptor60.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass72);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass72);
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass72);
        java.lang.String str76 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass72);
        java.lang.String str77 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass72);
        boolean boolean78 = signature52.equals((java.lang.Object) wildcardClass72);
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass72);
        boolean boolean80 = type1.equals((java.lang.Object) propertyDescriptorArray79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor15 and propertyDescriptor60", propertyDescriptor15.equals(propertyDescriptor60) ? propertyDescriptor15.hashCode() == propertyDescriptor60.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        boolean boolean9 = type0.equals((java.lang.Object) classArray7);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("Jhi!", "(JJV)S");
        boolean boolean13 = type0.equals((java.lang.Object) "(JJV)S");
        java.lang.String str14 = type0.getClassName();
        java.lang.String str15 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type0.getElementType();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        java.lang.Class<?> wildcardClass30 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setShortDescription("(JJV)LS;");
        boolean boolean33 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.lang.reflect.Method method39 = null;
        propertyDescriptor38.setWriteMethod(method39);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor38.getPropertyType();
        boolean boolean42 = propertyDescriptor38.isHidden();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type51, type52, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray54);
        int int57 = type49.getSort();
        propertyDescriptor47.setValue("V", (java.lang.Object) type49);
        java.lang.reflect.Method method59 = propertyDescriptor47.getReadMethod();
        java.lang.Class<?> wildcardClass60 = propertyDescriptor47.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass61 = propertyDescriptor47.getClass();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass61);
        propertyDescriptor38.setValue("(JJV)LV;", (java.lang.Object) wildcardClass61);
        java.lang.Class<?> wildcardClass65 = propertyDescriptor38.getPropertyType();
        java.lang.reflect.Method method66 = null;
        propertyDescriptor38.setWriteMethod(method66);
        propertyDescriptor38.setBound(false);
        propertyDescriptor3.setValue("()LJhi!;", (java.lang.Object) propertyDescriptor38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor47", propertyDescriptor22.equals(propertyDescriptor47) ? propertyDescriptor22.hashCode() == propertyDescriptor47.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        propertyDescriptor5.setShortDescription("long");
        propertyDescriptor5.setPreferred(false);
        java.lang.String str28 = propertyDescriptor5.getDisplayName();
        boolean boolean29 = propertyDescriptor5.isPreferred();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type39, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray41);
        int int44 = type36.getSort();
        propertyDescriptor34.setValue("V", (java.lang.Object) type36);
        java.lang.reflect.Method method46 = propertyDescriptor34.getReadMethod();
        propertyDescriptor34.setExpert(false);
        propertyDescriptor34.setDisplayName("V");
        propertyDescriptor34.setDisplayName("Jhi!");
        propertyDescriptor34.setShortDescription("(JJV)V");
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor34.attributeNames();
        propertyDescriptor5.setValue("long", (java.lang.Object) propertyDescriptor34);
        java.lang.reflect.Method method57 = null;
        propertyDescriptor34.setWriteMethod(method57);
        boolean boolean59 = propertyDescriptor34.isPreferred();
        java.lang.String str60 = propertyDescriptor34.getDisplayName();
        boolean boolean61 = propertyDescriptor34.isExpert();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("hi!", method64, method65);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type71 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type72 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type70, type71, type72 };
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type69, typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray73);
        int int76 = type68.getSort();
        propertyDescriptor66.setValue("V", (java.lang.Object) type68);
        java.lang.reflect.Method method78 = propertyDescriptor66.getReadMethod();
        java.lang.Class<?> wildcardClass79 = propertyDescriptor66.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass80 = propertyDescriptor66.getClass();
        org.mockito.asm.Type type81 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass80);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass80);
        java.lang.Class<?> wildcardClass83 = type82.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray84 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass83);
        java.lang.String str85 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass83);
        java.lang.Class[] classArray87 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray86);
        java.lang.String[] strArray88 = org.mockito.cglib.core.ReflectUtils.getNames(classArray87);
        java.beans.PropertyDescriptor[] propertyDescriptorArray89 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray92 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray89, true, false);
        java.lang.reflect.Method[] methodArray93 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray88, methodArray92);
        propertyDescriptor34.setValue("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", (java.lang.Object) methodArray93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor66", propertyDescriptor5.equals(propertyDescriptor66) ? propertyDescriptor5.hashCode() == propertyDescriptor66.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        java.lang.reflect.Method method8 = null;
        propertyDescriptor7.setWriteMethod(method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor7.getPropertyEditorClass();
        boolean boolean11 = signature2.equals((java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = signature2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        org.mockito.asm.Type type15 = classInfo13.getType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray28);
        int int31 = type23.getSort();
        propertyDescriptor21.setValue("V", (java.lang.Object) type23);
        java.lang.Class<?> wildcardClass33 = propertyDescriptor21.getPropertyEditorClass();
        propertyDescriptor21.setValue("V", (java.lang.Object) 9);
        boolean boolean37 = type17.equals((java.lang.Object) propertyDescriptor21);
        propertyDescriptor21.setName("long");
        propertyDescriptor21.setShortDescription("long");
        propertyDescriptor21.setPreferred(false);
        java.lang.String str44 = propertyDescriptor21.getDisplayName();
        boolean boolean45 = propertyDescriptor21.isPreferred();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type54, type55, type56 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray57);
        int int60 = type52.getSort();
        propertyDescriptor50.setValue("V", (java.lang.Object) type52);
        java.lang.reflect.Method method62 = propertyDescriptor50.getReadMethod();
        propertyDescriptor50.setExpert(false);
        propertyDescriptor50.setDisplayName("V");
        propertyDescriptor50.setDisplayName("Jhi!");
        propertyDescriptor50.setShortDescription("(JJV)V");
        java.util.Enumeration<java.lang.String> strEnumeration71 = propertyDescriptor50.attributeNames();
        propertyDescriptor21.setValue("long", (java.lang.Object) propertyDescriptor50);
        boolean boolean73 = propertyDescriptor50.isPreferred();
        boolean boolean74 = type15.equals((java.lang.Object) boolean73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor7 and propertyDescriptor21", propertyDescriptor7.equals(propertyDescriptor21) ? propertyDescriptor7.hashCode() == propertyDescriptor21.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean26 = propertyDescriptor3.isExpert();
        java.lang.String str27 = propertyDescriptor3.getShortDescription();
        java.lang.String str28 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray26);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type0.getInternalName();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("LJhi!;", method25, method26);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "Ljava/beans/FeatureDescriptor;");
        java.lang.String str32 = signature31.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type35, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray37);
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        boolean boolean46 = signature31.equals((java.lang.Object) classArray42);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray42);
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        propertyDescriptor27.setValue("Ljava/beans/FeatureDescriptor;", (java.lang.Object) classArray42);
        boolean boolean50 = classInfo23.equals((java.lang.Object) propertyDescriptor27);
        org.mockito.asm.Type[] typeArray51 = classInfo23.getInterfaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor27", propertyDescriptor3.equals(propertyDescriptor27) ? propertyDescriptor3.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        propertyDescriptor5.setShortDescription("long");
        propertyDescriptor5.setPreferred(false);
        java.lang.String str28 = propertyDescriptor5.getDisplayName();
        java.lang.String str29 = propertyDescriptor5.getShortDescription();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("(JJV)J", method32, method33);
        propertyDescriptor34.setShortDescription("J");
        java.lang.reflect.Method method37 = propertyDescriptor34.getReadMethod();
        java.lang.Object obj39 = propertyDescriptor34.getValue("Llong;");
        propertyDescriptor34.setDisplayName("Llong;");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str44 = type43.getDescriptor();
        java.lang.String str45 = type43.getDescriptor();
        propertyDescriptor34.setValue("", (java.lang.Object) str45);
        propertyDescriptor5.setValue("java/beans/FeatureDescriptor", (java.lang.Object) "");
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type55, type56, type57 };
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray58);
        int int61 = type53.getSort();
        propertyDescriptor51.setValue("V", (java.lang.Object) type53);
        java.lang.Class<?> wildcardClass63 = propertyDescriptor51.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass63);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass63);
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass63);
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass63);
        java.lang.reflect.Method[] methodArray70 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray67, false, true);
        boolean boolean71 = propertyDescriptor5.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor34 and propertyDescriptor51", propertyDescriptor34.equals(propertyDescriptor51) ? propertyDescriptor34.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "Llong;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray13);
        java.lang.String str17 = type7.getDescriptor();
        int int18 = type7.getSize();
        boolean boolean19 = signature2.equals((java.lang.Object) type7);
        java.lang.String str20 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type7.getElementType();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = classInfo18.getSuperType();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; hidden; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", method21, method22);
        java.lang.reflect.Method method24 = propertyDescriptor23.getReadMethod();
        propertyDescriptor23.setDisplayName("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]");
        java.lang.reflect.Method method27 = propertyDescriptor23.getWriteMethod();
        java.lang.Object obj29 = propertyDescriptor23.getValue("org.mockito.asm.Type[]");
        boolean boolean30 = propertyDescriptor23.isExpert();
        boolean boolean31 = classInfo18.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method11 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setReadMethod(method12);
        java.lang.String str14 = propertyDescriptor3.getName();
        boolean boolean15 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("Llong;", method17, method18);
        propertyDescriptor19.setName("S");
        java.lang.String str22 = propertyDescriptor19.getDisplayName();
        java.lang.reflect.Method method23 = null;
        propertyDescriptor19.setReadMethod(method23);
        boolean boolean25 = propertyDescriptor19.isExpert();
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor19);
        propertyDescriptor3.setBound(false);
        propertyDescriptor3.setDisplayName("");
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type39, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray41);
        int int44 = type36.getSort();
        propertyDescriptor34.setValue("V", (java.lang.Object) type36);
        java.lang.reflect.Method method46 = propertyDescriptor34.getReadMethod();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor34.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass48 = propertyDescriptor34.getClass();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass48);
        java.beans.PropertyEditor propertyEditor52 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor34", propertyDescriptor19.equals(propertyDescriptor34) ? propertyDescriptor19.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("hi!Ljava/beans/FeatureDescriptor;()S");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        int int15 = type7.getSort();
        propertyDescriptor5.setValue("V", (java.lang.Object) type7);
        java.lang.Class<?> wildcardClass17 = propertyDescriptor5.getPropertyEditorClass();
        propertyDescriptor5.setValue("V", (java.lang.Object) 9);
        boolean boolean21 = type1.equals((java.lang.Object) propertyDescriptor5);
        propertyDescriptor5.setName("long");
        propertyDescriptor5.setShortDescription("long");
        propertyDescriptor5.setPreferred(false);
        java.lang.String str28 = propertyDescriptor5.getDisplayName();
        boolean boolean29 = propertyDescriptor5.isPreferred();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type39, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray41);
        int int44 = type36.getSort();
        propertyDescriptor34.setValue("V", (java.lang.Object) type36);
        java.lang.reflect.Method method46 = propertyDescriptor34.getReadMethod();
        propertyDescriptor34.setExpert(false);
        propertyDescriptor34.setDisplayName("V");
        propertyDescriptor34.setDisplayName("Jhi!");
        propertyDescriptor34.setShortDescription("(JJV)V");
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor34.attributeNames();
        propertyDescriptor5.setValue("long", (java.lang.Object) propertyDescriptor34);
        java.lang.reflect.Method method57 = null;
        propertyDescriptor34.setWriteMethod(method57);
        boolean boolean59 = propertyDescriptor34.isPreferred();
        boolean boolean60 = propertyDescriptor34.isExpert();
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Method method63 = null;
        java.beans.PropertyDescriptor propertyDescriptor64 = new java.beans.PropertyDescriptor("hi!", method62, method63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type69 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type70 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type68, type69, type70 };
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type67, typeArray71);
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type66, typeArray71);
        int int74 = type66.getSort();
        propertyDescriptor64.setValue("V", (java.lang.Object) type66);
        java.lang.Class<?> wildcardClass76 = propertyDescriptor64.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray77 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass76);
        java.beans.PropertyDescriptor[] propertyDescriptorArray78 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass76);
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass76);
        boolean boolean80 = propertyDescriptor34.equals((java.lang.Object) wildcardClass76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor64", propertyDescriptor5.equals(propertyDescriptor64) ? propertyDescriptor5.hashCode() == propertyDescriptor64.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        int int14 = type12.getOpcode((int) (byte) 10);
        java.lang.String str15 = type12.toString();
        int int16 = type12.getSize();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        int int19 = type17.getOpcode((int) '4');
        java.lang.String str20 = type17.getDescriptor();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray26);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray26);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type12, typeArray26);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray26);
        int int33 = type0.getOpcode(37);
        int int34 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type0.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        java.lang.String str20 = type0.toString();
        int int21 = type0.getSort();
        int int23 = type0.getOpcode(54);
        java.lang.String str24 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type0.getInternalName();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method18 = null;
        propertyDescriptor3.setWriteMethod(method18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        int int22 = type20.getOpcode((int) (byte) 10);
        java.lang.String str23 = type20.toString();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type20);
        java.lang.String str25 = propertyDescriptor3.getName();
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setExpert(false);
        java.util.Enumeration<java.lang.String> strEnumeration30 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method31 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray43);
        int int46 = type38.getSort();
        propertyDescriptor36.setValue("V", (java.lang.Object) type38);
        java.lang.reflect.Method method48 = propertyDescriptor36.getReadMethod();
        propertyDescriptor36.setExpert(false);
        propertyDescriptor36.setName("hi!");
        java.lang.Object obj54 = propertyDescriptor36.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor36.attributeNames();
        java.lang.Class<?> wildcardClass56 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setName("(JJV)J");
        java.lang.String str59 = propertyDescriptor36.getDisplayName();
        propertyDescriptor36.setName("");
        java.lang.Class<?> wildcardClass62 = propertyDescriptor36.getClass();
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass62);
        propertyDescriptor3.setValue("Ljava/lang/Object;", (java.lang.Object) classInfo63);
        int int65 = classInfo63.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor36", propertyDescriptor3.equals(propertyDescriptor36) ? propertyDescriptor3.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str26 = type25.getDescriptor();
        java.lang.String str27 = type25.getClassName();
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("V", method29, method30);
        propertyDescriptor31.setExpert(false);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor31.getPropertyType();
        boolean boolean35 = propertyDescriptor31.isExpert();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        java.util.Enumeration<java.lang.String> strEnumeration40 = propertyDescriptor39.attributeNames();
        propertyDescriptor39.setExpert(false);
        propertyDescriptor39.setValue("SS", (java.lang.Object) "hi!");
        java.lang.String str46 = propertyDescriptor39.getName();
        propertyDescriptor39.setDisplayName("Jhi!");
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("hi!", method50, method51);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] { type56, type57, type58 };
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray59);
        int int62 = type54.getSort();
        propertyDescriptor52.setValue("V", (java.lang.Object) type54);
        java.lang.reflect.Method method64 = propertyDescriptor52.getReadMethod();
        java.lang.Class<?> wildcardClass65 = propertyDescriptor52.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass66 = propertyDescriptor52.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        java.lang.String str70 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.lang.String str71 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.beans.PropertyEditor propertyEditor72 = propertyDescriptor39.createPropertyEditor((java.lang.Object) wildcardClass66);
        java.lang.reflect.Method method73 = null;
        propertyDescriptor39.setReadMethod(method73);
        java.beans.PropertyEditor propertyEditor75 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor39);
        java.util.Enumeration<java.lang.String> strEnumeration76 = propertyDescriptor31.attributeNames();
        boolean boolean77 = type25.equals((java.lang.Object) strEnumeration76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor31", propertyDescriptor3.equals(propertyDescriptor31) ? propertyDescriptor3.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setDisplayName("V");
        propertyDescriptor3.setName("Z");
        boolean boolean22 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean28 = signature26.equals((java.lang.Object) true);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type31, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray33);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        int int37 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        boolean boolean38 = signature26.equals((java.lang.Object) int37);
        java.lang.String str39 = signature26.toString();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("hi!", method41, method42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type47, type48, type49 };
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray50);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray50);
        int int53 = type45.getSort();
        propertyDescriptor43.setValue("V", (java.lang.Object) type45);
        java.lang.reflect.Method method55 = propertyDescriptor43.getReadMethod();
        java.lang.Class<?> wildcardClass56 = propertyDescriptor43.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass57 = propertyDescriptor43.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        java.lang.Class[] classArray60 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray59);
        boolean boolean61 = signature26.equals((java.lang.Object) classArray60);
        java.lang.Class[] classArray62 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray60);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; constrained]", (java.lang.Object) classArray62);
        java.lang.String[] strArray64 = org.mockito.cglib.core.ReflectUtils.getNames(classArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor43", propertyDescriptor3.equals(propertyDescriptor43) ? propertyDescriptor3.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        java.lang.String str20 = type0.toString();
        int int21 = type0.getSort();
        int int23 = type0.getOpcode(54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type0.getDimensions();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        propertyDescriptor3.setBound(false);
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type42, type43, type44 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray45);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray45);
        int int48 = type40.getSort();
        propertyDescriptor38.setValue("V", (java.lang.Object) type40);
        java.lang.reflect.Method method50 = propertyDescriptor38.getReadMethod();
        java.lang.Class<?> wildcardClass51 = propertyDescriptor38.getPropertyEditorClass();
        boolean boolean52 = propertyDescriptor38.isExpert();
        propertyDescriptor3.setValue("Ljava/beans/FeatureDescriptor;", (java.lang.Object) propertyDescriptor38);
        java.lang.String str54 = propertyDescriptor38.getDisplayName();
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("hi!", method57, method58);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray66 = new org.mockito.asm.Type[] { type63, type64, type65 };
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray66);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray66);
        int int69 = type61.getSort();
        propertyDescriptor59.setValue("V", (java.lang.Object) type61);
        java.lang.reflect.Method method71 = propertyDescriptor59.getReadMethod();
        java.lang.Class<?> wildcardClass72 = propertyDescriptor59.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor59.getClass();
        org.mockito.asm.Type type74 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass73);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass73);
        java.lang.Class<?> wildcardClass76 = type75.getClass();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass76);
        java.lang.String str78 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass76);
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass76);
        java.lang.String str80 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass76);
        propertyDescriptor38.setValue("()S", (java.lang.Object) str80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor59", propertyDescriptor22.equals(propertyDescriptor59) ? propertyDescriptor22.hashCode() == propertyDescriptor59.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java/beans/PropertyDescriptor", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        int int18 = type10.getSort();
        propertyDescriptor8.setValue("V", (java.lang.Object) type10);
        java.lang.reflect.Method method20 = propertyDescriptor8.getReadMethod();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor8.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor8.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        propertyDescriptor3.setValue("LJhi!;", (java.lang.Object) wildcardClass22);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor8", propertyDescriptor3.equals(propertyDescriptor8) ? propertyDescriptor3.hashCode() == propertyDescriptor8.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("long", "Llong;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray13);
        java.lang.String str17 = type7.getDescriptor();
        int int18 = type7.getSize();
        boolean boolean19 = signature2.equals((java.lang.Object) type7);
        int int20 = type7.getSize();
        int int22 = type7.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type7.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        java.lang.String str20 = type0.toString();
        int int21 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.toString();
        int int11 = type0.getSort();
        java.lang.String str12 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type0.getElementType();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("Llong;", method1, method2);
        propertyDescriptor3.setConstrained(false);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        int int9 = type7.getOpcode((int) (byte) 10);
        java.lang.String str10 = type7.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, false);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        boolean boolean19 = type7.equals((java.lang.Object) methodArray17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        propertyDescriptor3.setValue("J", (java.lang.Object) strArray21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, false);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, true);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type39, type40, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray42);
        int int45 = type37.getSort();
        propertyDescriptor35.setValue("V", (java.lang.Object) type37);
        java.lang.Class<?> wildcardClass47 = propertyDescriptor35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray52, true, true);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray55);
        java.lang.Class[] classArray57 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray55);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor35", propertyDescriptor3.equals(propertyDescriptor35) ? propertyDescriptor3.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str17 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(JJV)J", method20, method21);
        propertyDescriptor22.setShortDescription("J");
        propertyDescriptor3.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean26 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setPreferred(true);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; values={SS=hi!}]LS;", "");
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        propertyDescriptor35.setConstrained(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, true, false);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray42);
        propertyDescriptor35.setValue("Jhi!", (java.lang.Object) methodArray42);
        propertyDescriptor35.setName("java.beans.PropertyDescriptor[name=hi!; displayName=; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type54, type55, type56 };
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray57);
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray57);
        int int60 = type52.getSort();
        propertyDescriptor50.setValue("V", (java.lang.Object) type52);
        java.lang.reflect.Method method62 = propertyDescriptor50.getReadMethod();
        propertyDescriptor50.setExpert(false);
        propertyDescriptor50.setName("hi!");
        propertyDescriptor50.setBound(false);
        java.lang.String str69 = propertyDescriptor50.getDisplayName();
        propertyDescriptor50.setPreferred(true);
        propertyDescriptor50.setHidden(false);
        java.beans.PropertyEditor propertyEditor74 = propertyDescriptor35.createPropertyEditor((java.lang.Object) propertyDescriptor50);
        java.lang.reflect.Method method75 = propertyDescriptor50.getReadMethod();
        boolean boolean76 = signature31.equals((java.lang.Object) propertyDescriptor50);
        boolean boolean77 = propertyDescriptor3.equals((java.lang.Object) boolean76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor50", propertyDescriptor22.equals(propertyDescriptor50) ? propertyDescriptor22.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.toString();
        int int12 = type0.getOpcode(56);
        boolean boolean14 = type0.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=longLlong;]; shortDescription=java/beans/PropertyDescriptor; values={V=J}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type0.getDimensions();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str24 = type23.getDescriptor();
        int int25 = type23.getDimensions();
        int int26 = type23.getSize();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor30.attributeNames();
        propertyDescriptor30.setHidden(false);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor30.getPropertyEditorClass();
        propertyDescriptor30.setName("V");
        java.util.Enumeration<java.lang.String> strEnumeration37 = propertyDescriptor30.attributeNames();
        java.lang.String str38 = propertyDescriptor30.getDisplayName();
        java.lang.Class<?> wildcardClass39 = propertyDescriptor30.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass39);
        boolean boolean41 = type23.equals((java.lang.Object) propertyDescriptorArray40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(JJV)J", method1, method2);
        propertyDescriptor3.setShortDescription("J");
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        int int12 = type10.getOpcode((int) (byte) 10);
        java.lang.String str13 = type10.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray20);
        boolean boolean22 = type10.equals((java.lang.Object) methodArray20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray20);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=V; shortDescription=long]", (java.lang.Object) classArray23);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("hi!", method30, method31);
        java.lang.reflect.Method method33 = null;
        propertyDescriptor32.setWriteMethod(method33);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor32.getPropertyEditorClass();
        propertyDescriptor32.setPreferred(false);
        java.lang.Class<?> wildcardClass38 = propertyDescriptor32.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass38);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, true, false);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, false, true);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, true, true);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, false, true);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor32", propertyDescriptor3.equals(propertyDescriptor32) ? propertyDescriptor3.hashCode() == propertyDescriptor32.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass23 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("(JJV)J");
        java.lang.String str26 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setName("");
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = classInfo30.getSuperType();
        org.mockito.asm.Type type32 = classInfo30.getType();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        java.lang.String str37 = propertyDescriptor36.getDisplayName();
        propertyDescriptor36.setShortDescription("SS");
        propertyDescriptor36.setConstrained(true);
        propertyDescriptor36.setConstrained(false);
        java.lang.reflect.Method method44 = propertyDescriptor36.getWriteMethod();
        java.lang.Class<?> wildcardClass45 = propertyDescriptor36.getPropertyEditorClass();
        java.lang.reflect.Method method46 = propertyDescriptor36.getWriteMethod();
        propertyDescriptor36.setBound(false);
        boolean boolean49 = classInfo30.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor36", propertyDescriptor3.equals(propertyDescriptor36) ? propertyDescriptor3.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        int int23 = type22.getDimensions();
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("java/beans/PropertyDescriptor(JJV)J", method25, method26);
        java.lang.String str28 = propertyDescriptor27.getName();
        boolean boolean29 = type22.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor27", propertyDescriptor3.equals(propertyDescriptor27) ? propertyDescriptor3.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.toString();
        int int11 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str4 = signature3.getName();
        java.lang.String str5 = signature3.getName();
        java.lang.String str6 = signature3.toString();
        org.mockito.asm.Type type7 = signature3.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type7, typeArray16);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type22.getInternalName();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        java.lang.String str19 = type0.getDescriptor();
        java.lang.String str20 = type0.toString();
        int int21 = type0.getSort();
        int int22 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type0.getDimensions();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setReadMethod(method6);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray19);
        int int22 = type14.getSort();
        propertyDescriptor12.setValue("V", (java.lang.Object) type14);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        propertyDescriptor3.setValue("(JJV)V", (java.lang.Object) wildcardClass24);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor12", propertyDescriptor3.equals(propertyDescriptor12) ? propertyDescriptor3.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method18 = null;
        propertyDescriptor3.setWriteMethod(method18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        int int22 = type20.getOpcode((int) (byte) 10);
        java.lang.String str23 = type20.toString();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type20);
        java.lang.String str25 = propertyDescriptor3.getName();
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setExpert(false);
        java.util.Enumeration<java.lang.String> strEnumeration30 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method31 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("hi!", method34, method35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray43);
        int int46 = type38.getSort();
        propertyDescriptor36.setValue("V", (java.lang.Object) type38);
        java.lang.reflect.Method method48 = propertyDescriptor36.getReadMethod();
        propertyDescriptor36.setExpert(false);
        propertyDescriptor36.setName("hi!");
        java.lang.Object obj54 = propertyDescriptor36.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor36.attributeNames();
        java.lang.Class<?> wildcardClass56 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setName("(JJV)J");
        java.lang.String str59 = propertyDescriptor36.getDisplayName();
        propertyDescriptor36.setName("");
        java.lang.Class<?> wildcardClass62 = propertyDescriptor36.getClass();
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass62);
        propertyDescriptor3.setValue("Ljava/lang/Object;", (java.lang.Object) classInfo63);
        org.mockito.asm.Type type65 = classInfo63.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor36", propertyDescriptor3.equals(propertyDescriptor36) ? propertyDescriptor3.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, false);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray4, true, true);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        boolean boolean12 = type0.equals((java.lang.Object) methodArray10);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray10);
        java.lang.Class<?> wildcardClass14 = classArray13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray26);
        int int29 = type21.getSort();
        propertyDescriptor19.setValue("V", (java.lang.Object) type21);
        java.lang.reflect.Method method31 = propertyDescriptor19.getReadMethod();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor19.getPropertyEditorClass();
        java.lang.String str33 = propertyDescriptor19.getShortDescription();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("(JJV)J", method36, method37);
        propertyDescriptor38.setShortDescription("J");
        propertyDescriptor19.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor19.setPreferred(true);
        java.lang.reflect.Method method44 = null;
        propertyDescriptor19.setReadMethod(method44);
        propertyDescriptor19.setBound(false);
        propertyDescriptor19.setName("(JJV)V");
        java.lang.Object obj50 = null;
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor19.createPropertyEditor(obj50);
        propertyDescriptor19.setHidden(false);
        propertyDescriptor19.setDisplayName("org/mockito/cglib/core/ReflectUtils$4");
        java.lang.reflect.Method method56 = propertyDescriptor19.getReadMethod();
        boolean boolean57 = classInfo15.equals((java.lang.Object) method56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor38", propertyDescriptor19.equals(propertyDescriptor38) ? propertyDescriptor19.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("hi!");
        java.lang.Object obj21 = propertyDescriptor3.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass23 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("(JJV)J");
        java.lang.String str26 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setName("");
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.lang.String str31 = classInfo30.toString();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("hi!", method33, method34);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type39, type40, type41 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray42);
        int int45 = type37.getSort();
        propertyDescriptor35.setValue("V", (java.lang.Object) type37);
        java.lang.reflect.Method method47 = propertyDescriptor35.getReadMethod();
        propertyDescriptor35.setExpert(false);
        propertyDescriptor35.setName("hi!");
        java.lang.Object obj53 = propertyDescriptor35.getValue("SS");
        boolean boolean54 = propertyDescriptor35.isPreferred();
        java.lang.String str55 = propertyDescriptor35.getDisplayName();
        boolean boolean56 = propertyDescriptor35.isHidden();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("hi!", method59, method60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type65, type66, type67 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray68);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray68);
        int int71 = type63.getSort();
        propertyDescriptor61.setValue("V", (java.lang.Object) type63);
        java.lang.reflect.Method method73 = propertyDescriptor61.getReadMethod();
        propertyDescriptor61.setExpert(false);
        propertyDescriptor61.setDisplayName("V");
        boolean boolean78 = propertyDescriptor61.isHidden();
        java.lang.reflect.Method method79 = null;
        propertyDescriptor61.setReadMethod(method79);
        propertyDescriptor61.setShortDescription("C");
        propertyDescriptor35.setValue("()Z", (java.lang.Object) propertyDescriptor61);
        java.lang.reflect.Method method84 = null;
        propertyDescriptor35.setWriteMethod(method84);
        boolean boolean86 = propertyDescriptor35.isExpert();
        java.lang.reflect.Method method87 = propertyDescriptor35.getWriteMethod();
        boolean boolean88 = propertyDescriptor35.isPreferred();
        boolean boolean89 = classInfo30.equals((java.lang.Object) boolean88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor35", propertyDescriptor3.equals(propertyDescriptor35) ? propertyDescriptor3.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        boolean boolean7 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        java.lang.String str12 = propertyDescriptor3.getName();
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj15 = propertyDescriptor3.getValue("(JJV)Lava.beans.PropertyDescriptor[name=hi!;");
        java.lang.String str16 = propertyDescriptor3.getShortDescription();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("hi!", method19, method20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray28);
        int int31 = type23.getSort();
        propertyDescriptor21.setValue("V", (java.lang.Object) type23);
        java.lang.reflect.Method method33 = propertyDescriptor21.getReadMethod();
        propertyDescriptor21.setExpert(false);
        propertyDescriptor21.setName("hi!");
        java.lang.Object obj39 = propertyDescriptor21.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration40 = propertyDescriptor21.attributeNames();
        java.lang.Class<?> wildcardClass41 = propertyDescriptor21.getPropertyEditorClass();
        propertyDescriptor21.setName("(JJV)J");
        java.lang.String str44 = propertyDescriptor21.getDisplayName();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("hi!", method46, method47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type52, type53, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray55);
        int int58 = type50.getSort();
        propertyDescriptor48.setValue("V", (java.lang.Object) type50);
        java.lang.reflect.Method method60 = propertyDescriptor48.getReadMethod();
        java.lang.Class<?> wildcardClass61 = propertyDescriptor48.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass62 = propertyDescriptor48.getClass();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass62);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass62);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass62);
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass62);
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass62);
        java.lang.reflect.Method[] methodArray70 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray67, true, true);
        java.beans.PropertyEditor propertyEditor71 = propertyDescriptor21.createPropertyEditor((java.lang.Object) methodArray70);
        propertyDescriptor3.setValue("()LS(JJV)J;", (java.lang.Object) methodArray70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor21 and propertyDescriptor48", propertyDescriptor21.equals(propertyDescriptor48) ? propertyDescriptor21.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        int int4 = type1.getOpcode((int) (byte) -1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("S", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type25, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray27);
        int int30 = type22.getSort();
        propertyDescriptor20.setValue("V", (java.lang.Object) type22);
        java.lang.reflect.Method method32 = propertyDescriptor20.getReadMethod();
        java.lang.Class<?> wildcardClass33 = propertyDescriptor20.getPropertyEditorClass();
        java.lang.String str34 = propertyDescriptor20.getShortDescription();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("(JJV)J", method37, method38);
        propertyDescriptor39.setShortDescription("J");
        propertyDescriptor20.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean43 = propertyDescriptor20.isExpert();
        boolean boolean44 = propertyDescriptor20.isHidden();
        propertyDescriptor20.setDisplayName("S");
        java.util.Enumeration<java.lang.String> strEnumeration47 = propertyDescriptor20.attributeNames();
        propertyDescriptor20.setName("(JJV)Z");
        propertyDescriptor20.setHidden(false);
        propertyDescriptor20.setConstrained(false);
        java.lang.String[] strArray58 = new java.lang.String[] { "V", "hi!", "hi!", "Llong;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, false);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray65);
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray71 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray68, true, false);
        java.lang.Class[] classArray72 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray71);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray71);
        java.beans.PropertyEditor propertyEditor74 = propertyDescriptor20.createPropertyEditor((java.lang.Object) methodArray73);
        java.lang.reflect.Method method75 = null;
        propertyDescriptor20.setWriteMethod(method75);
        boolean boolean77 = signature13.equals((java.lang.Object) propertyDescriptor20);
        java.lang.String str78 = signature13.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor39", propertyDescriptor20.equals(propertyDescriptor39) ? propertyDescriptor20.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str17 = signature16.getName();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        java.lang.String str19 = type18.getDescriptor();
        boolean boolean20 = signature2.equals((java.lang.Object) type18);
        java.lang.String str21 = type18.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type18.getDimensions();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        propertyDescriptor3.setConstrained(true);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray19);
        int int22 = type14.getSort();
        propertyDescriptor12.setValue("V", (java.lang.Object) type14);
        java.lang.reflect.Method method24 = propertyDescriptor12.getReadMethod();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor12.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass26 = propertyDescriptor12.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptorArray30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor3.setReadMethod(method32);
        boolean boolean34 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(true);
        boolean boolean37 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method40 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type51, type52, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray54);
        int int57 = type49.getSort();
        propertyDescriptor47.setValue("V", (java.lang.Object) type49);
        java.lang.Class<?> wildcardClass59 = propertyDescriptor47.getPropertyEditorClass();
        propertyDescriptor47.setValue("V", (java.lang.Object) 9);
        boolean boolean63 = type43.equals((java.lang.Object) propertyDescriptor47);
        java.lang.String str64 = propertyDescriptor47.getName();
        boolean boolean65 = propertyDescriptor47.isExpert();
        propertyDescriptor47.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        propertyDescriptor47.setBound(false);
        boolean boolean70 = propertyDescriptor47.isPreferred();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; shortDescription=SS(JJV)Ljava/beans/PropertyDescriptor;; values={V=J}]", (java.lang.Object) propertyDescriptor47);
        propertyDescriptor3.setPreferred(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor47", propertyDescriptor12.equals(propertyDescriptor47) ? propertyDescriptor12.hashCode() == propertyDescriptor47.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.Class<?> wildcardClass15 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method17 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setName("char");
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("hi!", method21, method22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type28, type29 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray30);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray30);
        int int33 = type25.getSort();
        propertyDescriptor23.setValue("V", (java.lang.Object) type25);
        java.lang.Class<?> wildcardClass35 = propertyDescriptor23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass35);
        java.lang.String str44 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; constrained]", method1, method2);
        propertyDescriptor3.setDisplayName("SS(JJV)Ljava/beans/PropertyDescriptor;");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray19);
        int int22 = type14.getSort();
        propertyDescriptor12.setValue("V", (java.lang.Object) type14);
        java.lang.Class<?> wildcardClass24 = propertyDescriptor12.getPropertyEditorClass();
        propertyDescriptor12.setValue("V", (java.lang.Object) 9);
        boolean boolean28 = type8.equals((java.lang.Object) propertyDescriptor12);
        propertyDescriptor12.setName("long");
        propertyDescriptor12.setShortDescription("long");
        propertyDescriptor3.setValue("(JJV)Z", (java.lang.Object) "long");
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type41, type42, type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray44);
        int int47 = type39.getSort();
        propertyDescriptor37.setValue("V", (java.lang.Object) type39);
        java.lang.reflect.Method method49 = propertyDescriptor37.getReadMethod();
        java.lang.Class<?> wildcardClass50 = propertyDescriptor37.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass51 = propertyDescriptor37.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        int int54 = classInfo53.getModifiers();
        org.mockito.asm.Type type55 = classInfo53.getSuperType();
        java.lang.String str56 = type55.toString();
        int int57 = type55.getDimensions();
        java.lang.String str58 = type55.toString();
        boolean boolean59 = propertyDescriptor3.equals((java.lang.Object) type55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor37", propertyDescriptor12.equals(propertyDescriptor37) ? propertyDescriptor12.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("J", "hi!");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray8 = new org.mockito.asm.Type[] { type5, type6, type7 };
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        boolean boolean13 = signature2.equals((java.lang.Object) classArray12);
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str17 = signature16.getName();
        org.mockito.asm.Type type18 = signature16.getReturnType();
        java.lang.String str19 = type18.getDescriptor();
        boolean boolean20 = signature2.equals((java.lang.Object) type18);
        int int21 = type18.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type18.getInternalName();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray7);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray7);
        boolean boolean12 = type1.equals((java.lang.Object) "()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type1.getElementType();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        org.mockito.asm.Type[] typeArray22 = classInfo20.getInterfaces();
        org.mockito.asm.Type type23 = classInfo20.getSuperType();
        org.mockito.asm.Type type24 = classInfo20.getSuperType();
        org.mockito.asm.Type[] typeArray25 = classInfo20.getInterfaces();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type34, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray36);
        int int39 = type31.getSort();
        propertyDescriptor29.setValue("V", (java.lang.Object) type31);
        java.lang.Class<?> wildcardClass41 = propertyDescriptor29.getPropertyEditorClass();
        propertyDescriptor29.setDisplayName("");
        propertyDescriptor29.setName("long");
        boolean boolean46 = propertyDescriptor29.isHidden();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor29.getPropertyType();
        boolean boolean48 = propertyDescriptor29.isPreferred();
        boolean boolean49 = propertyDescriptor29.isHidden();
        boolean boolean50 = propertyDescriptor29.isHidden();
        java.lang.String str51 = propertyDescriptor29.getShortDescription();
        boolean boolean52 = classInfo20.equals((java.lang.Object) propertyDescriptor29);
        org.mockito.asm.Type type53 = classInfo20.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor29", propertyDescriptor3.equals(propertyDescriptor29) ? propertyDescriptor3.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        int int13 = type5.getSort();
        propertyDescriptor3.setValue("V", (java.lang.Object) type5);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass16 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        org.mockito.asm.Type type22 = classInfo20.getType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        int int25 = type23.getOpcode((int) (byte) 10);
        java.lang.String str26 = type23.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray27, true, false);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray27, true, true);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray33);
        boolean boolean35 = type23.equals((java.lang.Object) methodArray33);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean40 = signature38.equals((java.lang.Object) true);
        boolean boolean41 = type23.equals((java.lang.Object) signature38);
        java.lang.String str42 = signature38.toString();
        java.lang.String str43 = signature38.getDescriptor();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type51, type52, type53 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray54);
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray54);
        int int57 = type49.getSort();
        propertyDescriptor47.setValue("V", (java.lang.Object) type49);
        java.lang.reflect.Method method59 = propertyDescriptor47.getReadMethod();
        propertyDescriptor47.setExpert(false);
        propertyDescriptor47.setName("hi!");
        propertyDescriptor47.setHidden(false);
        java.lang.reflect.Method method66 = propertyDescriptor47.getReadMethod();
        propertyDescriptor47.setPreferred(false);
        propertyDescriptor47.setName("J");
        propertyDescriptor47.setDisplayName("LS;");
        boolean boolean73 = propertyDescriptor47.isPreferred();
        propertyDescriptor47.setPreferred(false);
        java.lang.reflect.Method method76 = null;
        propertyDescriptor47.setReadMethod(method76);
        java.lang.String str78 = propertyDescriptor47.getShortDescription();
        boolean boolean79 = propertyDescriptor47.isExpert();
        boolean boolean80 = signature38.equals((java.lang.Object) boolean79);
        boolean boolean81 = classInfo20.equals((java.lang.Object) boolean80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor47", propertyDescriptor3.equals(propertyDescriptor47) ? propertyDescriptor3.hashCode() == propertyDescriptor47.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray6);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        java.lang.String str10 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type0.getDimensions();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray4);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray12);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.lang.reflect.Method method18 = null;
        propertyDescriptor17.setWriteMethod(method18);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor17.getPropertyEditorClass();
        propertyDescriptor17.setPreferred(false);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray25);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, true, true);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray29);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("hi!", method32, method33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type39, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray41);
        int int44 = type36.getSort();
        propertyDescriptor34.setValue("V", (java.lang.Object) type36);
        java.lang.reflect.Method method46 = propertyDescriptor34.getReadMethod();
        propertyDescriptor34.setExpert(false);
        propertyDescriptor34.setName("hi!");
        java.lang.Object obj52 = propertyDescriptor34.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration53 = propertyDescriptor34.attributeNames();
        java.lang.Class<?> wildcardClass54 = propertyDescriptor34.getPropertyEditorClass();
        propertyDescriptor34.setName("(JJV)J");
        java.lang.String str57 = propertyDescriptor34.getDisplayName();
        java.lang.reflect.Method method59 = null;
        java.lang.reflect.Method method60 = null;
        java.beans.PropertyDescriptor propertyDescriptor61 = new java.beans.PropertyDescriptor("hi!", method59, method60);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type64 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type65 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type66 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type67 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray68 = new org.mockito.asm.Type[] { type65, type66, type67 };
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type64, typeArray68);
        java.lang.String str70 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray68);
        int int71 = type63.getSort();
        propertyDescriptor61.setValue("V", (java.lang.Object) type63);
        java.lang.reflect.Method method73 = propertyDescriptor61.getReadMethod();
        java.lang.Class<?> wildcardClass74 = propertyDescriptor61.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass75 = propertyDescriptor61.getClass();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass75);
        org.mockito.cglib.core.ClassInfo classInfo77 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass75);
        java.beans.PropertyDescriptor[] propertyDescriptorArray78 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass75);
        java.lang.String str79 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass75);
        java.beans.PropertyDescriptor[] propertyDescriptorArray80 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass75);
        java.lang.reflect.Method[] methodArray83 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray80, true, true);
        java.beans.PropertyEditor propertyEditor84 = propertyDescriptor34.createPropertyEditor((java.lang.Object) methodArray83);
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor34", propertyDescriptor17.equals(propertyDescriptor34) ? propertyDescriptor17.hashCode() == propertyDescriptor34.hashCode() : true);
    }
}


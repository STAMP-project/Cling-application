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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type1.getElementType();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        int int8 = type0.getSort();
        java.lang.String str9 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type0.getElementType();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        java.lang.String str31 = propertyDescriptor30.getDisplayName();
        propertyDescriptor30.setShortDescription("SS");
        boolean boolean34 = propertyDescriptor30.isPreferred();
        propertyDescriptor3.setValue("LS;", (java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor30", propertyDescriptor22.equals(propertyDescriptor30) ? propertyDescriptor22.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getClassName();
        int int10 = type0.getOpcode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.String[] strArray2 = new java.lang.String[] { "Llong;", "(JJV)J" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray3, true, false);
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray8 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("V");
        boolean boolean9 = type6.equals((java.lang.Object) "V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type6.getDimensions();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type9, type10 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray11);
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray11);
        int int14 = type6.getSort();
        propertyDescriptor4.setValue("V", (java.lang.Object) type6);
        java.lang.reflect.Method method16 = propertyDescriptor4.getReadMethod();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor4.getPropertyEditorClass();
        java.lang.String str18 = propertyDescriptor4.getShortDescription();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("(JJV)J", method21, method22);
        propertyDescriptor23.setShortDescription("J");
        propertyDescriptor4.setValue("(JJV)J", (java.lang.Object) "J");
        java.lang.String str27 = propertyDescriptor4.getName();
        boolean boolean28 = type0.equals((java.lang.Object) str27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor23", propertyDescriptor4.equals(propertyDescriptor23) ? propertyDescriptor4.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type1.getElementType();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        java.lang.reflect.Method method54 = propertyDescriptor3.getReadMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor38", propertyDescriptor22.equals(propertyDescriptor38) ? propertyDescriptor22.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("J");
        int int3 = type2.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray19);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type5, typeArray19);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Jhi!", type2, typeArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type2.getElementType();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Jhi!", "java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        java.util.Enumeration<java.lang.String> strEnumeration9 = propertyDescriptor8.attributeNames();
        java.lang.reflect.Method method10 = null;
        propertyDescriptor8.setReadMethod(method10);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        propertyDescriptor15.setHidden(false);
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor8.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor8.attributeNames();
        propertyDescriptor8.setName("(JJV)V");
        java.lang.reflect.Method method23 = propertyDescriptor8.getReadMethod();
        boolean boolean24 = signature2.equals((java.lang.Object) method23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor15", propertyDescriptor8.equals(propertyDescriptor15) ? propertyDescriptor8.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType("V");
        boolean boolean9 = type6.equals((java.lang.Object) "V");
        int int11 = type6.getOpcode(11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type6.getInternalName();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        int int17 = type15.getOpcode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type15.getDimensions();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int19 = type0.getOpcode(32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type0.getDimensions();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str21 = signature20.getName();
        java.lang.String str22 = signature20.getName();
        java.lang.String str23 = signature20.toString();
        propertyDescriptor3.setValue("()J", (java.lang.Object) signature20);
        java.lang.String str25 = signature20.getDescriptor();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("Llong;", method27, method28);
        boolean boolean30 = propertyDescriptor29.isExpert();
        boolean boolean31 = signature20.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor29", propertyDescriptor3.equals(propertyDescriptor29) ? propertyDescriptor3.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode((int) (byte) -1);
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int18 = type0.getSize();
        org.mockito.asm.Type[] typeArray20 = org.mockito.asm.Type.getArgumentTypes("()J");
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        boolean boolean22 = propertyDescriptor3.isPreferred();
        java.lang.String str23 = propertyDescriptor3.getDisplayName();
        boolean boolean24 = propertyDescriptor3.isHidden();
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
        java.lang.reflect.Method method41 = propertyDescriptor29.getReadMethod();
        propertyDescriptor29.setExpert(false);
        propertyDescriptor29.setDisplayName("V");
        boolean boolean46 = propertyDescriptor29.isHidden();
        java.lang.reflect.Method method47 = null;
        propertyDescriptor29.setReadMethod(method47);
        propertyDescriptor29.setShortDescription("C");
        propertyDescriptor3.setValue("()Z", (java.lang.Object) propertyDescriptor29);
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("hi!", method53, method54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type59, type60, type61 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray62);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray62);
        int int65 = type57.getSort();
        propertyDescriptor55.setValue("V", (java.lang.Object) type57);
        java.lang.reflect.Method method67 = propertyDescriptor55.getReadMethod();
        propertyDescriptor55.setExpert(false);
        propertyDescriptor55.setName("hi!");
        java.lang.Object obj73 = propertyDescriptor55.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration74 = propertyDescriptor55.attributeNames();
        java.lang.String str75 = propertyDescriptor55.getName();
        propertyDescriptor55.setName("java.beans.PropertyDescriptor[name=Llong;]");
        boolean boolean78 = propertyDescriptor3.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=Llong;]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor29 and propertyDescriptor55", propertyDescriptor29.equals(propertyDescriptor55) ? propertyDescriptor29.hashCode() == propertyDescriptor55.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type14.getElementType();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass9 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean15 = signature13.equals((java.lang.Object) true);
        java.lang.String str16 = signature13.getDescriptor();
        java.lang.String str17 = signature13.toString();
        java.lang.String str18 = signature13.getDescriptor();
        boolean boolean19 = type10.equals((java.lang.Object) str18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray35);
        int int38 = type30.getSort();
        propertyDescriptor28.setValue("V", (java.lang.Object) type30);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor28.getPropertyEditorClass();
        propertyDescriptor28.setValue("V", (java.lang.Object) 9);
        boolean boolean44 = type24.equals((java.lang.Object) propertyDescriptor28);
        java.lang.String str45 = propertyDescriptor28.getName();
        boolean boolean46 = propertyDescriptor28.isExpert();
        propertyDescriptor28.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean49 = type22.equals((java.lang.Object) propertyDescriptor28);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str51 = type50.getDescriptor();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type53, type54, type55 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray56);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray56);
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type22, typeArray56);
        java.lang.String str60 = signature59.toString();
        java.lang.String str61 = signature59.getDescriptor();
        boolean boolean62 = type10.equals((java.lang.Object) signature59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor28", propertyDescriptor3.equals(propertyDescriptor28) ? propertyDescriptor3.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        int int4 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int3 = type1.getOpcode(33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type[] typeArray3 = org.mockito.asm.Type.getArgumentTypes("()J");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("V", type1, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int2 = type1.getSort();
        int int4 = type1.getOpcode(5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode((int) (byte) -1);
        int int5 = type2.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        int int8 = type6.getOpcode((int) '4');
        java.lang.String str9 = type6.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray15);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("short", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type1.getElementType();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        int int15 = type1.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type1.getElementType();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type1.getOpcode((int) (byte) 10);
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        int int8 = type6.getOpcode((int) '4');
        java.lang.String str9 = type6.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type1.getDimensions();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int4 = type0.getOpcode(32);
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int19 = type0.getOpcode(32);
        int int20 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type0.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JJV)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
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
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean17 = signature15.equals((java.lang.Object) true);
        boolean boolean18 = type0.equals((java.lang.Object) signature15);
        int int20 = type0.getOpcode((int) (byte) 10);
        int int21 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int18 = type0.getSize();
        int int19 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type0.getDimensions();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JJV)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type1, typeArray15);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        int int21 = type19.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type19.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type1.getDimensions();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getDescriptor();
        int int10 = type0.getOpcode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type1.getOpcode((int) (byte) 10);
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        int int11 = type9.getOpcode(1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray18);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Llong;", type1, typeArray24);
        java.lang.String str26 = signature25.toString();
        org.mockito.asm.Type[] typeArray27 = signature25.getArgumentTypes();
        org.mockito.asm.Type type28 = signature25.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = type28.getDimensions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        int int15 = type1.getOpcode(6);
        int int16 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type1.getInternalName();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray21);
        int int24 = type16.getSort();
        propertyDescriptor14.setValue("V", (java.lang.Object) type16);
        java.lang.Class<?> wildcardClass26 = propertyDescriptor14.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor14.getPropertyType();
        propertyDescriptor14.setName("S");
        boolean boolean30 = propertyDescriptor14.isExpert();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("Llong;", method32, method33);
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor14.createPropertyEditor((java.lang.Object) method33);
        propertyDescriptor14.setPreferred(true);
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor14.attributeNames();
        boolean boolean39 = propertyDescriptor3.equals((java.lang.Object) strEnumeration38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor34", propertyDescriptor14.equals(propertyDescriptor34) ? propertyDescriptor14.hashCode() == propertyDescriptor34.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        int int8 = type0.getSort();
        int int9 = type0.getSize();
        int int10 = type0.getSort();
        java.lang.String str11 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        java.lang.String str18 = type17.getDescriptor();
        java.lang.String str19 = type17.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type17.getInternalName();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type16.getDimensions();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(JJV)V]");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getDescriptor();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSort();
        int int7 = type1.getOpcode(56);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        int int11 = type9.getOpcode((int) (byte) 10);
        java.lang.String str12 = type9.toString();
        java.lang.String str13 = type9.getDescriptor();
        int int14 = type9.getSort();
        java.lang.String str15 = type9.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        int int19 = type17.getOpcode(1);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type23, type24, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", type17, typeArray26);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        org.mockito.asm.Type type31 = signature29.getReturnType();
        org.mockito.asm.Type[] typeArray32 = signature29.getArgumentTypes();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("Llong;", type9, typeArray32);
        java.lang.String str34 = signature33.toString();
        org.mockito.asm.Type[] typeArray35 = signature33.getArgumentTypes();
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={Llong;=53}]", type1, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type37 = type1.getElementType();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JJV)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.mockito.asm.Type[] typeArray15 = signature13.getArgumentTypes();
        java.lang.String str16 = signature13.getDescriptor();
        org.mockito.asm.Type type17 = signature13.getReturnType();
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
        java.lang.reflect.Method method36 = null;
        propertyDescriptor21.setWriteMethod(method36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        int int40 = type38.getOpcode((int) (byte) 10);
        java.lang.String str41 = type38.toString();
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor21.createPropertyEditor((java.lang.Object) type38);
        java.lang.String str43 = propertyDescriptor21.getDisplayName();
        propertyDescriptor21.setPreferred(false);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("hi!", method47, method48);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type55 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type53, type54, type55 };
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray56);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray56);
        int int59 = type51.getSort();
        propertyDescriptor49.setValue("V", (java.lang.Object) type51);
        java.lang.reflect.Method method61 = propertyDescriptor49.getReadMethod();
        java.lang.Class<?> wildcardClass62 = propertyDescriptor49.getPropertyEditorClass();
        java.lang.String str63 = propertyDescriptor49.getShortDescription();
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("(JJV)J", method66, method67);
        propertyDescriptor68.setShortDescription("J");
        propertyDescriptor49.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean72 = propertyDescriptor49.isExpert();
        propertyDescriptor49.setName("");
        java.beans.PropertyEditor propertyEditor75 = propertyDescriptor21.createPropertyEditor((java.lang.Object) propertyDescriptor49);
        boolean boolean76 = signature13.equals((java.lang.Object) propertyDescriptor49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor21 and propertyDescriptor68", propertyDescriptor21.equals(propertyDescriptor68) ? propertyDescriptor21.hashCode() == propertyDescriptor68.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        int int4 = type0.getOpcode(32);
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.toString();
        java.lang.String str9 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type1.getOpcode((int) (byte) 10);
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        int int11 = type9.getOpcode(1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray18);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Llong;", type1, typeArray24);
        java.lang.String str26 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type27 = type1.getElementType();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        java.lang.reflect.Method method54 = null;
        propertyDescriptor3.setWriteMethod(method54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor38", propertyDescriptor22.equals(propertyDescriptor38) ? propertyDescriptor22.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setExpert(false);
        propertyDescriptor11.setValue("SS", (java.lang.Object) "hi!");
        java.lang.String str18 = propertyDescriptor11.getName();
        propertyDescriptor11.setDisplayName("Jhi!");
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
        java.lang.Class<?> wildcardClass37 = propertyDescriptor24.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor24.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor11.createPropertyEditor((java.lang.Object) wildcardClass38);
        java.lang.reflect.Method method45 = null;
        propertyDescriptor11.setReadMethod(method45);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor11);
        java.lang.reflect.Method method48 = propertyDescriptor11.getWriteMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        int int14 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        int int4 = type2.getOpcode((int) (byte) 10);
        java.lang.String str5 = type2.toString();
        int int6 = type2.getSize();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        int int9 = type7.getOpcode((int) '4');
        java.lang.String str10 = type7.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray16);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type2, typeArray16);
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type0.getElementType();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("J", type1, typeArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        boolean boolean54 = propertyDescriptor3.isPreferred();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor38", propertyDescriptor22.equals(propertyDescriptor38) ? propertyDescriptor22.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        boolean boolean15 = propertyDescriptor3.isPreferred();
        java.lang.String str16 = propertyDescriptor3.getName();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor3.setWriteMethod(method17);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("Z", method20, method21);
        java.lang.Class<?> wildcardClass23 = propertyDescriptor22.getPropertyEditorClass();
        boolean boolean24 = propertyDescriptor3.equals((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor22", propertyDescriptor10.equals(propertyDescriptor22) ? propertyDescriptor10.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        int int6 = type0.getOpcode(1041);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        org.mockito.asm.Type type18 = signature13.getReturnType();
        java.lang.String str19 = type18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type18.getElementType();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        java.lang.String str26 = propertyDescriptor3.getName();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type35, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray37);
        int int40 = type32.getSort();
        propertyDescriptor30.setValue("V", (java.lang.Object) type32);
        java.lang.reflect.Method method42 = propertyDescriptor30.getReadMethod();
        boolean boolean43 = propertyDescriptor30.isHidden();
        propertyDescriptor30.setDisplayName("Llong;");
        propertyDescriptor30.setShortDescription("java/beans/PropertyDescriptor");
        java.lang.String str48 = propertyDescriptor30.getDisplayName();
        boolean boolean49 = propertyDescriptor3.equals((java.lang.Object) str48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor30", propertyDescriptor22.equals(propertyDescriptor30) ? propertyDescriptor22.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        java.lang.String str41 = type40.getClassName();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("java/beans/PropertyDescriptor", method43, method44);
        propertyDescriptor45.setPreferred(false);
        boolean boolean48 = propertyDescriptor45.isPreferred();
        java.lang.Object obj50 = propertyDescriptor45.getValue("Ljava/beans/FeatureDescriptor;()LSS;");
        java.lang.Object obj52 = propertyDescriptor45.getValue("Ljava.beans.PropertyDescriptor[name=V; shortDescription=long];");
        boolean boolean53 = type40.equals(obj52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor45", propertyDescriptor3.equals(propertyDescriptor45) ? propertyDescriptor3.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        boolean boolean58 = propertyDescriptor3.isHidden();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor50", propertyDescriptor31.equals(propertyDescriptor50) ? propertyDescriptor31.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        int int5 = type1.getOpcode(103);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type17.getInternalName();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type4.getDimensions();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!(JJV)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("C");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        int int15 = type1.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type1.getInternalName();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        java.lang.String str34 = propertyDescriptor3.getDisplayName();
        java.lang.String str35 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type39 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type40, type41, type42 };
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type49, type50, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray52);
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray52);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type38, typeArray52);
        org.mockito.asm.Type type56 = signature55.getReturnType();
        org.mockito.asm.Type[] typeArray57 = signature55.getArgumentTypes();
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
        boolean boolean74 = propertyDescriptor61.isHidden();
        propertyDescriptor61.setDisplayName("Llong;");
        boolean boolean77 = signature55.equals((java.lang.Object) propertyDescriptor61);
        propertyDescriptor3.setValue("(JJV)Ljava.beans.PropertyDescriptor[name=V; shortDescription=long];", (java.lang.Object) signature55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor61", propertyDescriptor22.equals(propertyDescriptor61) ? propertyDescriptor22.hashCode() == propertyDescriptor61.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        java.lang.String str14 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type1.getInternalName();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("J", type1, typeArray7);
        boolean boolean12 = signature10.equals((java.lang.Object) "V");
        java.lang.String str13 = signature10.getName();
        org.mockito.asm.Type type14 = signature10.getReturnType();
        java.lang.String str15 = type14.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type14.getDimensions();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("S");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getDescriptor();
        java.lang.String str6 = type4.toString();
        int int7 = type4.getSize();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray18);
        int int21 = type13.getSort();
        propertyDescriptor11.setValue("V", (java.lang.Object) type13);
        java.lang.reflect.Method method23 = propertyDescriptor11.getReadMethod();
        java.lang.Class<?> wildcardClass24 = propertyDescriptor11.getPropertyEditorClass();
        java.lang.String str25 = propertyDescriptor11.getShortDescription();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("(JJV)J", method28, method29);
        propertyDescriptor30.setShortDescription("J");
        propertyDescriptor11.setValue("(JJV)J", (java.lang.Object) "J");
        java.lang.String str34 = propertyDescriptor11.getName();
        boolean boolean35 = type4.equals((java.lang.Object) str34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor30", propertyDescriptor11.equals(propertyDescriptor30) ? propertyDescriptor11.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setExpert(false);
        propertyDescriptor11.setValue("SS", (java.lang.Object) "hi!");
        java.lang.String str18 = propertyDescriptor11.getName();
        propertyDescriptor11.setDisplayName("Jhi!");
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
        java.lang.Class<?> wildcardClass37 = propertyDescriptor24.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor24.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor11.createPropertyEditor((java.lang.Object) wildcardClass38);
        java.lang.reflect.Method method45 = null;
        propertyDescriptor11.setReadMethod(method45);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor11);
        java.util.Enumeration<java.lang.String> strEnumeration48 = propertyDescriptor11.attributeNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        int int8 = type0.getSort();
        int int9 = type0.getSize();
        int int10 = type0.getSort();
        java.lang.String str11 = type0.getDescriptor();
        java.lang.String str12 = type0.getDescriptor();
        java.lang.String str13 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        java.lang.String str14 = signature13.getDescriptor();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.asm.Type type16 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type16.getInternalName();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("J", type1, typeArray7);
        java.lang.String str11 = signature10.getDescriptor();
        org.mockito.asm.Type type12 = signature10.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type12.getElementType();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("SS");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JJV)Z");
        int int3 = type1.getOpcode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type4.getDimensions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; expert; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", "S(JJV)J");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("hi!", method4, method5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        int int16 = type8.getSort();
        propertyDescriptor6.setValue("V", (java.lang.Object) type8);
        java.lang.reflect.Method method18 = propertyDescriptor6.getReadMethod();
        java.lang.Class<?> wildcardClass19 = propertyDescriptor6.getPropertyEditorClass();
        java.lang.String str20 = propertyDescriptor6.getShortDescription();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("(JJV)J", method23, method24);
        propertyDescriptor25.setShortDescription("J");
        propertyDescriptor6.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean29 = propertyDescriptor6.isExpert();
        boolean boolean30 = propertyDescriptor6.isHidden();
        propertyDescriptor6.setDisplayName("S");
        java.util.Enumeration<java.lang.String> strEnumeration33 = propertyDescriptor6.attributeNames();
        propertyDescriptor6.setName("(JJV)Z");
        propertyDescriptor6.setHidden(false);
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor6.attributeNames();
        boolean boolean39 = signature2.equals((java.lang.Object) strEnumeration38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor25", propertyDescriptor6.equals(propertyDescriptor25) ? propertyDescriptor6.hashCode() == propertyDescriptor25.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        java.lang.Object obj55 = propertyDescriptor3.getValue("()LLjava/beans/FeatureDescriptor;()LSS;;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor38", propertyDescriptor22.equals(propertyDescriptor38) ? propertyDescriptor22.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=S; displayName=Jhi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
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
        java.lang.Class<?> wildcardClass28 = propertyDescriptor15.getPropertyType();
        propertyDescriptor15.setHidden(false);
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
        java.lang.reflect.Method method50 = null;
        propertyDescriptor35.setWriteMethod(method50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        int int54 = type52.getOpcode((int) (byte) 10);
        java.lang.String str55 = type52.toString();
        java.beans.PropertyEditor propertyEditor56 = propertyDescriptor35.createPropertyEditor((java.lang.Object) type52);
        java.lang.String str57 = propertyDescriptor35.getName();
        propertyDescriptor35.setExpert(true);
        java.lang.Object obj61 = propertyDescriptor35.getValue("(JJV)V");
        propertyDescriptor15.setValue("java.beans.PropertyDescriptor[name=Llong;]", (java.lang.Object) "(JJV)V");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=S; displayName=(JJV)C; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", (java.lang.Object) propertyDescriptor15);
        java.lang.reflect.Method method64 = null;
        propertyDescriptor15.setWriteMethod(method64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor35", propertyDescriptor3.equals(propertyDescriptor35) ? propertyDescriptor3.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        org.mockito.asm.Type type7 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type7.getInternalName();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        propertyDescriptor3.setBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor50", propertyDescriptor31.equals(propertyDescriptor50) ? propertyDescriptor31.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        java.lang.String str58 = propertyDescriptor31.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor50", propertyDescriptor3.equals(propertyDescriptor50) ? propertyDescriptor3.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setValue("SS", (java.lang.Object) "hi!");
        java.lang.String str10 = propertyDescriptor3.getName();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        boolean boolean14 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("hi!", method17, method18);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor19.attributeNames();
        java.lang.reflect.Method method21 = null;
        propertyDescriptor19.setReadMethod(method21);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        java.lang.reflect.Method method28 = null;
        propertyDescriptor27.setWriteMethod(method28);
        propertyDescriptor27.setBound(false);
        propertyDescriptor19.setValue("hi!", (java.lang.Object) propertyDescriptor27);
        propertyDescriptor3.setValue("(JJV)V", (java.lang.Object) propertyDescriptor27);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("char", method35, method36);
        boolean boolean38 = propertyDescriptor3.equals((java.lang.Object) method35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor37", propertyDescriptor19.equals(propertyDescriptor37) ? propertyDescriptor19.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("longLlong;", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        int int6 = type4.getOpcode((int) (byte) 10);
        java.lang.String str7 = type4.toString();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        propertyDescriptor11.setConstrained(true);
        boolean boolean14 = type4.equals((java.lang.Object) true);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("S");
        boolean boolean17 = type4.equals((java.lang.Object) type16);
        java.lang.String str18 = type16.toString();
        int int19 = type16.getSize();
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type16);
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
        java.lang.String str36 = type26.toString();
        java.lang.String str37 = type26.getClassName();
        int int38 = type26.getSort();
        int int39 = type26.getSort();
        boolean boolean40 = type16.equals((java.lang.Object) type26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode((int) (byte) -1);
        int int5 = type2.getSize();
        java.lang.String str6 = type2.getClassName();
        boolean boolean7 = type1.equals((java.lang.Object) str6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type1.getDimensions();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("SS");
        boolean boolean7 = propertyDescriptor3.isPreferred();
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
        java.lang.reflect.Method method26 = null;
        propertyDescriptor12.setReadMethod(method26);
        propertyDescriptor12.setExpert(false);
        boolean boolean30 = propertyDescriptor12.isPreferred();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) propertyDescriptor12);
        java.lang.String str32 = propertyDescriptor12.getName();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        java.lang.reflect.Method method38 = null;
        propertyDescriptor37.setWriteMethod(method38);
        java.lang.reflect.Method method40 = propertyDescriptor37.getReadMethod();
        propertyDescriptor37.setShortDescription("()Ljava.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor];");
        propertyDescriptor12.setValue("(JJV)Ljava/beans/FeatureDescriptor;", (java.lang.Object) propertyDescriptor37);
        java.lang.reflect.Method method44 = null;
        propertyDescriptor37.setWriteMethod(method44);
        propertyDescriptor37.setDisplayName("java.beans.PropertyDescriptor[name=hi!; hidden]");
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
        java.lang.Class<?> wildcardClass63 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setDisplayName("");
        propertyDescriptor51.setName("long");
        java.lang.String str68 = propertyDescriptor51.getDisplayName();
        java.util.Enumeration<java.lang.String> strEnumeration69 = propertyDescriptor51.attributeNames();
        java.beans.PropertyEditor propertyEditor70 = propertyDescriptor37.createPropertyEditor((java.lang.Object) strEnumeration69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor51", propertyDescriptor3.equals(propertyDescriptor51) ? propertyDescriptor3.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        boolean boolean27 = propertyDescriptor3.isHidden();
        java.lang.String str28 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor3.setWriteMethod(method32);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        java.util.Enumeration<java.lang.String> strEnumeration39 = propertyDescriptor38.attributeNames();
        java.lang.reflect.Method method40 = null;
        propertyDescriptor38.setReadMethod(method40);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("hi!", method43, method44);
        java.util.Enumeration<java.lang.String> strEnumeration46 = propertyDescriptor45.attributeNames();
        propertyDescriptor45.setHidden(false);
        java.beans.PropertyEditor propertyEditor49 = propertyDescriptor38.createPropertyEditor((java.lang.Object) false);
        boolean boolean50 = propertyDescriptor38.isPreferred();
        java.lang.reflect.Method method51 = propertyDescriptor38.getWriteMethod();
        propertyDescriptor38.setConstrained(true);
        boolean boolean54 = propertyDescriptor3.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor45", propertyDescriptor22.equals(propertyDescriptor45) ? propertyDescriptor22.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        java.util.Enumeration<java.lang.String> strEnumeration58 = propertyDescriptor3.attributeNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor50", propertyDescriptor31.equals(propertyDescriptor50) ? propertyDescriptor31.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        org.mockito.asm.Type[] typeArray15 = signature13.getArgumentTypes();
        java.lang.String str16 = signature13.getDescriptor();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        java.lang.reflect.Method method58 = propertyDescriptor3.getWriteMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor50", propertyDescriptor31.equals(propertyDescriptor50) ? propertyDescriptor31.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type1, typeArray15);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        org.mockito.asm.Type type20 = signature18.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type20.getInternalName();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int3 = type1.getOpcode(33);
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.toString();
        int int6 = type0.getSort();
        java.lang.String str7 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; shortDescription=java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]; values={V=J}]", "J(JJV)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=V; shortDescription=long](JJV)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("hi!", method2, method3);
        java.lang.reflect.Method method5 = null;
        propertyDescriptor4.setWriteMethod(method5);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor4.getPropertyEditorClass();
        propertyDescriptor4.setPreferred(false);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor4.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getReturnType("J");
        int int15 = type13.getOpcode(33);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("LS;");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("S");
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("long");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("hi!", method25, method26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type32, type33 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray34);
        int int37 = type29.getSort();
        propertyDescriptor27.setValue("V", (java.lang.Object) type29);
        java.lang.Class<?> wildcardClass39 = propertyDescriptor27.getPropertyEditorClass();
        propertyDescriptor27.setValue("V", (java.lang.Object) 9);
        boolean boolean43 = type23.equals((java.lang.Object) propertyDescriptor27);
        java.lang.String str44 = propertyDescriptor27.getName();
        boolean boolean45 = propertyDescriptor27.isExpert();
        propertyDescriptor27.setName("java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        boolean boolean48 = type21.equals((java.lang.Object) propertyDescriptor27);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type53 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type54 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type52, type53, type54 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray55);
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=V; shortDescription=long]", type21, typeArray55);
        org.mockito.asm.Type[] typeArray59 = signature58.getArgumentTypes();
        org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("java/beans/FeatureDescriptor", type18, typeArray59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray59);
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; values={Llong;=53}]java.beans.PropertyDescriptor[name=hi!; values={V=J}; bound]; expert]", type11, typeArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor27", propertyDescriptor4.equals(propertyDescriptor27) ? propertyDescriptor4.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        boolean boolean16 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setDisplayName("Llong;");
        propertyDescriptor3.setShortDescription("java/beans/PropertyDescriptor");
        java.lang.String str21 = propertyDescriptor3.getDisplayName();
        java.lang.String str22 = propertyDescriptor3.getDisplayName();
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
        java.lang.reflect.Method method38 = propertyDescriptor26.getReadMethod();
        java.lang.Class<?> wildcardClass39 = propertyDescriptor26.getPropertyEditorClass();
        java.lang.String str40 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("(JJV)J", method43, method44);
        propertyDescriptor45.setShortDescription("J");
        propertyDescriptor26.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor26.setPreferred(true);
        java.lang.reflect.Method method51 = null;
        propertyDescriptor26.setReadMethod(method51);
        propertyDescriptor26.setBound(false);
        propertyDescriptor26.setName("(JJV)V");
        propertyDescriptor26.setDisplayName("java/beans/PropertyDescriptor");
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "java/beans/PropertyDescriptor");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor26 and propertyDescriptor45", propertyDescriptor26.equals(propertyDescriptor45) ? propertyDescriptor26.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!(JJV)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        int int3 = type1.getOpcode(33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        int int8 = type6.getOpcode(36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type6.getDimensions();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        java.lang.Object obj19 = propertyDescriptor3.getValue("hi!");
        java.lang.String str20 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setName("ava.beans.PropertyDescriptor[name=Llong");
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type34, type35, type36 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray37);
        int int40 = type32.getSort();
        propertyDescriptor30.setValue("V", (java.lang.Object) type32);
        java.lang.reflect.Method method42 = propertyDescriptor30.getReadMethod();
        java.lang.Class<?> wildcardClass43 = propertyDescriptor30.getPropertyEditorClass();
        java.lang.String str44 = propertyDescriptor30.getShortDescription();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("(JJV)J", method47, method48);
        propertyDescriptor49.setShortDescription("J");
        propertyDescriptor30.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean53 = propertyDescriptor30.isExpert();
        boolean boolean54 = propertyDescriptor30.isHidden();
        java.lang.String str55 = propertyDescriptor30.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration56 = propertyDescriptor30.attributeNames();
        propertyDescriptor30.setExpert(true);
        java.lang.Class<?> wildcardClass59 = propertyDescriptor30.getClass();
        boolean boolean60 = propertyDescriptor3.equals((java.lang.Object) wildcardClass59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor30 and propertyDescriptor49", propertyDescriptor30.equals(propertyDescriptor49) ? propertyDescriptor30.hashCode() == propertyDescriptor49.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        int int15 = type1.getOpcode(6);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type19, type20, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray31);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type17, typeArray31);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type1.getElementType();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        java.lang.Class<?> wildcardClass48 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setDisplayName("");
        java.lang.reflect.Method method51 = null;
        propertyDescriptor36.setWriteMethod(method51);
        java.lang.String str53 = propertyDescriptor36.getName();
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor36);
        boolean boolean55 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor36", propertyDescriptor22.equals(propertyDescriptor36) ? propertyDescriptor22.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("LS;(JJV)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("SS");
        int int3 = type1.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        boolean boolean20 = signature13.equals((java.lang.Object) type19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type19.getDimensions();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str13 = type0.toString();
        java.lang.String str14 = type0.getDescriptor();
        java.lang.String str15 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type0.getDimensions();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.mockito.asm.Type[] typeArray14 = signature13.getArgumentTypes();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str18 = signature17.getName();
        org.mockito.asm.Type type19 = signature17.getReturnType();
        boolean boolean20 = signature13.equals((java.lang.Object) type19);
        int int21 = type19.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type19.getDimensions();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str13 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setName("V");
        java.lang.reflect.Method method10 = propertyDescriptor3.getWriteMethod();
        java.lang.String str11 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setDisplayName("LJ;");
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        java.util.Enumeration<java.lang.String> strEnumeration18 = propertyDescriptor17.attributeNames();
        java.lang.reflect.Method method19 = null;
        propertyDescriptor17.setReadMethod(method19);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        propertyDescriptor24.setHidden(false);
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor17.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor17.attributeNames();
        propertyDescriptor17.setName("(JJV)V");
        java.lang.String str32 = propertyDescriptor17.getName();
        java.lang.reflect.Method method33 = propertyDescriptor17.getReadMethod();
        boolean boolean34 = propertyDescriptor3.equals((java.lang.Object) method33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor24", propertyDescriptor17.equals(propertyDescriptor24) ? propertyDescriptor17.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        propertyDescriptor3.setDisplayName("");
        propertyDescriptor3.setName("long");
        boolean boolean20 = propertyDescriptor3.isHidden();
        boolean boolean21 = propertyDescriptor3.isExpert();
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
        java.lang.reflect.Method method38 = propertyDescriptor26.getReadMethod();
        java.lang.Class<?> wildcardClass39 = propertyDescriptor26.getPropertyEditorClass();
        java.lang.String str40 = propertyDescriptor26.getShortDescription();
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("(JJV)J", method43, method44);
        propertyDescriptor45.setShortDescription("J");
        propertyDescriptor26.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor26.setPreferred(true);
        java.lang.reflect.Method method51 = null;
        propertyDescriptor26.setReadMethod(method51);
        propertyDescriptor26.setBound(false);
        propertyDescriptor26.setConstrained(false);
        propertyDescriptor26.setHidden(false);
        propertyDescriptor3.setValue("Jhi!(JJV)J", (java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor26 and propertyDescriptor45", propertyDescriptor26.equals(propertyDescriptor45) ? propertyDescriptor26.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.getDescriptor();
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        java.lang.Class<?> wildcardClass48 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setDisplayName("");
        java.lang.reflect.Method method51 = null;
        propertyDescriptor36.setWriteMethod(method51);
        java.lang.String str53 = propertyDescriptor36.getName();
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor36);
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor3.attributeNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor36", propertyDescriptor22.equals(propertyDescriptor36) ? propertyDescriptor22.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("J");
        int int3 = type2.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type17, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray19);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type5, typeArray19);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Jhi!", type2, typeArray19);
        org.mockito.asm.Type[] typeArray24 = signature23.getArgumentTypes();
        java.lang.String str25 = signature23.getName();
        org.mockito.asm.Type type26 = signature23.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type26.getDimensions();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("SS");
        int int3 = type1.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str10 = type9.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type12, type13, type14 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray15);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type1, typeArray15);
        org.mockito.asm.Type type19 = signature18.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type19.getElementType();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getDescriptor();
        java.lang.String str6 = type4.getClassName();
        int int7 = type4.getSize();
        int int8 = type4.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type4.getDimensions();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "java.beans.PropertyDescriptor[name=V; shortDescription=long](JJV)S");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method5 = null;
        propertyDescriptor3.setReadMethod(method5);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        java.util.Enumeration<java.lang.String> strEnumeration11 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(false);
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        boolean boolean15 = propertyDescriptor3.isPreferred();
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor3.setReadMethod(method17);
        boolean boolean19 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("hi!", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        java.lang.reflect.Method method26 = null;
        propertyDescriptor24.setReadMethod(method26);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        java.util.Enumeration<java.lang.String> strEnumeration32 = propertyDescriptor31.attributeNames();
        propertyDescriptor31.setHidden(false);
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor24.createPropertyEditor((java.lang.Object) false);
        boolean boolean36 = propertyDescriptor24.isPreferred();
        propertyDescriptor24.setName("C");
        boolean boolean39 = propertyDescriptor24.isHidden();
        boolean boolean40 = propertyDescriptor24.isHidden();
        propertyDescriptor3.setValue("Lorg/mockito/asm/Type;", (java.lang.Object) boolean40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor24", propertyDescriptor10.equals(propertyDescriptor24) ? propertyDescriptor10.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]");
        boolean boolean27 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        propertyDescriptor3.setBound(false);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; shortDescription=va/beans/FeatureDescriptor; values={V=J}; bound]");
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
        java.lang.String str52 = propertyDescriptor38.getShortDescription();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(JJV)J", method55, method56);
        propertyDescriptor57.setShortDescription("J");
        propertyDescriptor38.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor38.setPreferred(true);
        java.lang.reflect.Method method63 = null;
        propertyDescriptor38.setReadMethod(method63);
        propertyDescriptor38.setBound(false);
        java.lang.reflect.Method method67 = null;
        propertyDescriptor38.setReadMethod(method67);
        java.lang.reflect.Method method69 = null;
        propertyDescriptor38.setReadMethod(method69);
        propertyDescriptor38.setExpert(true);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; values={SS=hi!}]", (java.lang.Object) propertyDescriptor38);
        propertyDescriptor38.setName("Jhi!java.beans.PropertyDescriptor[name=hi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean5 = signature3.equals((java.lang.Object) true);
        boolean boolean6 = type0.equals((java.lang.Object) signature3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int19 = type0.getOpcode(32);
        int int20 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type0.getInternalName();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("J", type1, typeArray7);
        boolean boolean12 = signature10.equals((java.lang.Object) "V");
        java.lang.String str13 = signature10.getName();
        org.mockito.asm.Type type14 = signature10.getReturnType();
        java.lang.String str15 = type14.toString();
        int int16 = type14.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type14.getDimensions();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=S; displayName=Jhi!; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]");
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
        java.lang.Class<?> wildcardClass28 = propertyDescriptor15.getPropertyType();
        propertyDescriptor15.setHidden(false);
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
        java.lang.reflect.Method method50 = null;
        propertyDescriptor35.setWriteMethod(method50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        int int54 = type52.getOpcode((int) (byte) 10);
        java.lang.String str55 = type52.toString();
        java.beans.PropertyEditor propertyEditor56 = propertyDescriptor35.createPropertyEditor((java.lang.Object) type52);
        java.lang.String str57 = propertyDescriptor35.getName();
        propertyDescriptor35.setExpert(true);
        java.lang.Object obj61 = propertyDescriptor35.getValue("(JJV)V");
        propertyDescriptor15.setValue("java.beans.PropertyDescriptor[name=Llong;]", (java.lang.Object) "(JJV)V");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=S; displayName=(JJV)C; values={V=J}; propertyEditorClass=class java.beans.PropertyDescriptor]", (java.lang.Object) propertyDescriptor15);
        java.lang.Class<?> wildcardClass64 = propertyDescriptor15.getPropertyType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor35", propertyDescriptor3.equals(propertyDescriptor35) ? propertyDescriptor3.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type4, type5 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor];", "java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound](JJV)J");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getClassName();
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
        propertyDescriptor8.setExpert(false);
        propertyDescriptor8.setName("hi!");
        java.lang.Object obj26 = propertyDescriptor8.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor8.attributeNames();
        java.lang.Class<?> wildcardClass28 = propertyDescriptor8.getPropertyEditorClass();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("J", "hi!");
        boolean boolean33 = signature31.equals((java.lang.Object) true);
        java.lang.String str34 = signature31.getName();
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor8.createPropertyEditor((java.lang.Object) signature31);
        boolean boolean36 = type0.equals((java.lang.Object) propertyDescriptor8);
        int int37 = type0.getSort();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("hi!", method39, method40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type46 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type45, type46, type47 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray48);
        int int51 = type43.getSort();
        propertyDescriptor41.setValue("V", (java.lang.Object) type43);
        java.lang.reflect.Method method53 = propertyDescriptor41.getReadMethod();
        java.lang.Class<?> wildcardClass54 = propertyDescriptor41.getPropertyEditorClass();
        java.lang.String str55 = propertyDescriptor41.getShortDescription();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("(JJV)J", method58, method59);
        propertyDescriptor60.setShortDescription("J");
        propertyDescriptor41.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor41.setPreferred(true);
        java.lang.reflect.Method method66 = null;
        propertyDescriptor41.setReadMethod(method66);
        propertyDescriptor41.setBound(false);
        propertyDescriptor41.setBound(true);
        java.lang.String str72 = propertyDescriptor41.getDisplayName();
        propertyDescriptor41.setExpert(true);
        propertyDescriptor41.setHidden(false);
        propertyDescriptor41.setBound(false);
        boolean boolean79 = type0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor60", propertyDescriptor8.equals(propertyDescriptor60) ? propertyDescriptor8.hashCode() == propertyDescriptor60.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("long");
        java.lang.String str3 = type2.getDescriptor();
        java.lang.String str4 = type2.toString();
        java.lang.String str5 = type2.getDescriptor();
        int int6 = type2.getSize();
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JJV)S");
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; values={V=J}; bound]", type2, typeArray8);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        java.util.Enumeration<java.lang.String> strEnumeration14 = propertyDescriptor13.attributeNames();
        java.lang.reflect.Method method15 = null;
        propertyDescriptor13.setReadMethod(method15);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("hi!", method18, method19);
        java.util.Enumeration<java.lang.String> strEnumeration21 = propertyDescriptor20.attributeNames();
        propertyDescriptor20.setHidden(false);
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor13.createPropertyEditor((java.lang.Object) false);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor13.attributeNames();
        propertyDescriptor13.setName("(JJV)V");
        boolean boolean28 = propertyDescriptor13.isPreferred();
        propertyDescriptor13.setBound(false);
        boolean boolean31 = type2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor20", propertyDescriptor13.equals(propertyDescriptor20) ? propertyDescriptor13.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str21 = signature20.getName();
        java.lang.String str22 = signature20.getName();
        java.lang.String str23 = signature20.toString();
        propertyDescriptor3.setValue("()J", (java.lang.Object) signature20);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type34 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type33, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray35);
        int int38 = type30.getSort();
        propertyDescriptor28.setValue("V", (java.lang.Object) type30);
        java.lang.reflect.Method method40 = propertyDescriptor28.getReadMethod();
        propertyDescriptor28.setExpert(false);
        propertyDescriptor28.setName("hi!");
        java.lang.Object obj46 = propertyDescriptor28.getValue("SS");
        java.util.Enumeration<java.lang.String> strEnumeration47 = propertyDescriptor28.attributeNames();
        java.lang.Class<?> wildcardClass48 = propertyDescriptor28.getPropertyEditorClass();
        boolean boolean49 = signature20.equals((java.lang.Object) propertyDescriptor28);
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("hi!", method51, method52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type56 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type57 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray60 = new org.mockito.asm.Type[] { type57, type58, type59 };
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray60);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray60);
        int int63 = type55.getSort();
        propertyDescriptor53.setValue("V", (java.lang.Object) type55);
        java.lang.reflect.Method method65 = propertyDescriptor53.getReadMethod();
        propertyDescriptor53.setExpert(false);
        propertyDescriptor53.setName("hi!");
        boolean boolean70 = signature20.equals((java.lang.Object) propertyDescriptor53);
        java.lang.String str71 = signature20.toString();
        org.mockito.asm.Type type72 = signature20.getReturnType();
        java.lang.reflect.Method method74 = null;
        java.lang.reflect.Method method75 = null;
        java.beans.PropertyDescriptor propertyDescriptor76 = new java.beans.PropertyDescriptor("(JJV)S", method74, method75);
        boolean boolean77 = signature20.equals((java.lang.Object) method75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor76", propertyDescriptor3.equals(propertyDescriptor76) ? propertyDescriptor3.hashCode() == propertyDescriptor76.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        int int3 = type1.getOpcode((int) (byte) 10);
        java.lang.String str4 = type1.toString();
        java.lang.String str5 = type1.getDescriptor();
        int int6 = type1.getSort();
        java.lang.String str7 = type1.toString();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        int int11 = type9.getOpcode(1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type16, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray18);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", type9, typeArray18);
        org.mockito.asm.Type type22 = signature21.getReturnType();
        org.mockito.asm.Type type23 = signature21.getReturnType();
        org.mockito.asm.Type[] typeArray24 = signature21.getArgumentTypes();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Llong;", type1, typeArray24);
        java.lang.String str26 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type1.getInternalName();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int18 = type0.getSize();
        int int19 = type0.getSize();
        int int21 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        boolean boolean27 = propertyDescriptor3.isHidden();
        java.lang.String str28 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor3.setWriteMethod(method32);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("hi!", method37, method38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type43, type44, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray46);
        int int49 = type41.getSort();
        propertyDescriptor39.setValue("V", (java.lang.Object) type41);
        java.lang.reflect.Method method51 = propertyDescriptor39.getReadMethod();
        java.lang.Class<?> wildcardClass52 = propertyDescriptor39.getPropertyEditorClass();
        java.lang.String str53 = propertyDescriptor39.getShortDescription();
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("(JJV)J", method56, method57);
        propertyDescriptor58.setShortDescription("J");
        propertyDescriptor39.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!; values={V=J}]; shortDescription=Ljava/beans/PropertyDescriptor;; hidden]", (java.lang.Object) propertyDescriptor39);
        boolean boolean63 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor39", propertyDescriptor22.equals(propertyDescriptor39) ? propertyDescriptor22.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int18 = type0.getSize();
        java.lang.String str19 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Llong;(JJV)S");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        boolean boolean27 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("()LSS;", method34, method35);
        propertyDescriptor3.setValue("Z", (java.lang.Object) propertyDescriptor36);
        propertyDescriptor3.setPreferred(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor36", propertyDescriptor22.equals(propertyDescriptor36) ? propertyDescriptor22.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        org.mockito.asm.Type type14 = signature13.getReturnType();
        org.mockito.asm.Type type15 = signature13.getReturnType();
        org.mockito.asm.Type[] typeArray16 = signature13.getArgumentTypes();
        org.mockito.asm.Type type17 = signature13.getReturnType();
        java.lang.String str18 = type17.getDescriptor();
        java.lang.String str19 = type17.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type17.getElementType();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("V", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setExpert(false);
        propertyDescriptor11.setValue("SS", (java.lang.Object) "hi!");
        java.lang.String str18 = propertyDescriptor11.getName();
        propertyDescriptor11.setDisplayName("Jhi!");
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
        java.lang.Class<?> wildcardClass37 = propertyDescriptor24.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass38 = propertyDescriptor24.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor11.createPropertyEditor((java.lang.Object) wildcardClass38);
        java.lang.reflect.Method method45 = null;
        propertyDescriptor11.setReadMethod(method45);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor11);
        java.lang.reflect.Method method48 = propertyDescriptor11.getReadMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor24", propertyDescriptor3.equals(propertyDescriptor24) ? propertyDescriptor3.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getReturnType("J");
        int int5 = type4.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str16 = type15.getDescriptor();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type19, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray21);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java/beans/PropertyDescriptor; values={V=J}; bound]", type7, typeArray21);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("Jhi!", type4, typeArray21);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        int int27 = type0.getSort();
        int int28 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type0.getElementType();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        java.lang.reflect.Method method4 = null;
        propertyDescriptor3.setWriteMethod(method4);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.Object obj9 = propertyDescriptor3.getValue("J");
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method28 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setExpert(false);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor16.setWriteMethod(method31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        int int35 = type33.getOpcode((int) (byte) 10);
        java.lang.String str36 = type33.toString();
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor16.createPropertyEditor((java.lang.Object) type33);
        propertyDescriptor16.setShortDescription("java.beans.PropertyDescriptor[name=hi!]");
        propertyDescriptor16.setDisplayName("SS");
        boolean boolean42 = propertyDescriptor16.isHidden();
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean42);
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setDisplayName("");
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!]; values={V=J}]", method49, method50);
        boolean boolean52 = propertyDescriptor3.equals((java.lang.Object) method49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor51", propertyDescriptor16.equals(propertyDescriptor51) ? propertyDescriptor16.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        java.lang.String str58 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor50", propertyDescriptor31.equals(propertyDescriptor50) ? propertyDescriptor31.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        java.lang.reflect.Method method72 = propertyDescriptor60.getReadMethod();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor60.getPropertyEditorClass();
        java.lang.String str74 = propertyDescriptor60.getShortDescription();
        java.lang.reflect.Method method77 = null;
        java.lang.reflect.Method method78 = null;
        java.beans.PropertyDescriptor propertyDescriptor79 = new java.beans.PropertyDescriptor("(JJV)J", method77, method78);
        propertyDescriptor79.setShortDescription("J");
        propertyDescriptor60.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean83 = propertyDescriptor60.isExpert();
        propertyDescriptor60.setPreferred(true);
        boolean boolean86 = propertyDescriptor5.equals((java.lang.Object) propertyDescriptor60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor34 and propertyDescriptor79", propertyDescriptor34.equals(propertyDescriptor79) ? propertyDescriptor34.hashCode() == propertyDescriptor79.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        java.lang.String str2 = type0.getDescriptor();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Jhi!", "(JJV)S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type3.getInternalName();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        java.lang.reflect.Method method28 = propertyDescriptor3.getWriteMethod();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor3.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor22", propertyDescriptor3.equals(propertyDescriptor22) ? propertyDescriptor3.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getReturnType("C");
        org.mockito.asm.Type[] typeArray8 = org.mockito.asm.Type.getArgumentTypes("(JJV)V");
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray8);
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type4.getElementType();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(3);
        int int4 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int6 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type0.getOpcode((int) '4');
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        int int14 = type0.getOpcode(8);
        int int16 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type0.getDimensions();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        java.lang.String str25 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
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
        java.lang.reflect.Method method43 = propertyDescriptor31.getReadMethod();
        java.lang.Class<?> wildcardClass44 = propertyDescriptor31.getPropertyEditorClass();
        java.lang.String str45 = propertyDescriptor31.getShortDescription();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("(JJV)J", method48, method49);
        propertyDescriptor50.setShortDescription("J");
        propertyDescriptor31.setValue("(JJV)J", (java.lang.Object) "J");
        boolean boolean54 = propertyDescriptor31.isExpert();
        propertyDescriptor31.setName("");
        java.beans.PropertyEditor propertyEditor57 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor31);
        java.lang.String str58 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor50", propertyDescriptor31.equals(propertyDescriptor50) ? propertyDescriptor31.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("J", type1, typeArray7);
        java.lang.String str11 = signature10.getDescriptor();
        org.mockito.asm.Type type12 = signature10.getReturnType();
        java.lang.String str13 = type12.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type12.getDimensions();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        boolean boolean27 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("()LSS;", method34, method35);
        propertyDescriptor3.setValue("Z", (java.lang.Object) propertyDescriptor36);
        propertyDescriptor3.setHidden(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor36", propertyDescriptor22.equals(propertyDescriptor36) ? propertyDescriptor22.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=hi!](JJV)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getClassName();
        int int10 = type0.getOpcode((int) (byte) 10);
        java.lang.String str11 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int3 = type0.getOpcode(8);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z()J");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        java.lang.String str14 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type1.getDimensions();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(JJV)Z");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] { type4, type5, type6 };
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray7);
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray7);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("J", type1, typeArray7);
        boolean boolean12 = signature10.equals((java.lang.Object) "V");
        java.lang.String str13 = signature10.getName();
        org.mockito.asm.Type type14 = signature10.getReturnType();
        java.lang.String str15 = signature10.getName();
        org.mockito.asm.Type type16 = signature10.getReturnType();
        org.mockito.asm.Type type17 = signature10.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("S(JJV)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type1.getDimensions();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.toString();
        java.lang.String str9 = type0.toString();
        int int10 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type0.getDimensions();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]");
        boolean boolean27 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method28 = null;
        propertyDescriptor3.setReadMethod(method28);
        propertyDescriptor3.setBound(false);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; shortDescription=va/beans/FeatureDescriptor; values={V=J}; bound]");
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
        java.lang.String str52 = propertyDescriptor38.getShortDescription();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(JJV)J", method55, method56);
        propertyDescriptor57.setShortDescription("J");
        propertyDescriptor38.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor38.setPreferred(true);
        java.lang.reflect.Method method63 = null;
        propertyDescriptor38.setReadMethod(method63);
        propertyDescriptor38.setBound(false);
        java.lang.reflect.Method method67 = null;
        propertyDescriptor38.setReadMethod(method67);
        java.lang.reflect.Method method69 = null;
        propertyDescriptor38.setReadMethod(method69);
        propertyDescriptor38.setExpert(true);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=Jhi!; values={SS=hi!}]", (java.lang.Object) propertyDescriptor38);
        boolean boolean74 = propertyDescriptor3.isPreferred();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor38 and propertyDescriptor57", propertyDescriptor38.equals(propertyDescriptor57) ? propertyDescriptor38.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method18 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("hi!", method20, method21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray29);
        int int32 = type24.getSort();
        propertyDescriptor22.setValue("V", (java.lang.Object) type24);
        java.lang.Class<?> wildcardClass34 = propertyDescriptor22.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass35 = propertyDescriptor22.getPropertyType();
        boolean boolean36 = propertyDescriptor22.isPreferred();
        propertyDescriptor22.setBound(true);
        propertyDescriptor22.setShortDescription("");
        java.lang.reflect.Method method41 = null;
        propertyDescriptor22.setReadMethod(method41);
        propertyDescriptor22.setConstrained(false);
        java.beans.PropertyEditor propertyEditor45 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("java.beans.FeatureDescriptor", method47, method48);
        java.beans.PropertyEditor propertyEditor50 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method48);
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("ava.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!]", method52, method53);
        boolean boolean55 = propertyDescriptor3.equals((java.lang.Object) "ava.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor49 and propertyDescriptor54", propertyDescriptor49.equals(propertyDescriptor54) ? propertyDescriptor49.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        int int16 = type14.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type14.getElementType();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int4 = type0.getOpcode(103);
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode((int) (byte) 10);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        int int5 = type0.getSort();
        int int7 = type0.getOpcode(47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type0.getElementType();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!Ljava/beans/FeatureDescriptor;", "(JJV)S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        int int3 = type1.getOpcode(3);
        int int4 = type1.getSort();
        int int5 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type1.getInternalName();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int3 = type1.getOpcode(1);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str5 = type4.getDescriptor();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type8, type9 };
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray10);
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray10);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", type1, typeArray10);
        int int15 = type1.getOpcode(6);
        int int16 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type1.getElementType();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=hi!; shortDescription=; values={V=J}; bound]");
        java.lang.String str27 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(true);
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
        java.lang.Class<?> wildcardClass45 = propertyDescriptor33.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor33.getPropertyType();
        propertyDescriptor33.setName("S");
        boolean boolean49 = propertyDescriptor33.isExpert();
        java.lang.reflect.Method method50 = null;
        propertyDescriptor33.setWriteMethod(method50);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor33.getPropertyType();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type62 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type63 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type61, type62, type63 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type60, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type59, typeArray64);
        int int67 = type59.getSort();
        propertyDescriptor57.setValue("V", (java.lang.Object) type59);
        java.lang.reflect.Method method69 = propertyDescriptor57.getReadMethod();
        java.lang.Class<?> wildcardClass70 = propertyDescriptor57.getPropertyEditorClass();
        java.lang.String str71 = propertyDescriptor57.getShortDescription();
        java.lang.reflect.Method method74 = null;
        java.lang.reflect.Method method75 = null;
        java.beans.PropertyDescriptor propertyDescriptor76 = new java.beans.PropertyDescriptor("(JJV)J", method74, method75);
        propertyDescriptor76.setShortDescription("J");
        propertyDescriptor57.setValue("(JJV)J", (java.lang.Object) "J");
        propertyDescriptor57.setPreferred(true);
        java.lang.reflect.Method method82 = null;
        propertyDescriptor57.setReadMethod(method82);
        propertyDescriptor57.setBound(false);
        propertyDescriptor57.setConstrained(false);
        java.lang.Class<?> wildcardClass88 = propertyDescriptor57.getPropertyType();
        propertyDescriptor57.setConstrained(true);
        propertyDescriptor33.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=V; values={V=J}; bound; propertyEditorClass=class java.beans.PropertyDescriptor]", (java.lang.Object) true);
        boolean boolean92 = propertyDescriptor3.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor33 and propertyDescriptor76", propertyDescriptor33.equals(propertyDescriptor76) ? propertyDescriptor33.hashCode() == propertyDescriptor76.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        int int5 = type1.getSort();
        java.lang.String str6 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type1.getInternalName();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode((int) (byte) -1);
        int int3 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.LONG_TYPE;
        int int6 = type4.getOpcode((int) '4');
        java.lang.String str7 = type4.getDescriptor();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type11, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray13);
        int int19 = type0.getOpcode(32);
        int int20 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type0.getDimensions();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(LS;Ljava/beans/PropertyDescriptor;)J");
        int int2 = type1.getDimensions();
        java.lang.String str3 = type1.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("S");
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type14, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray16);
        int int19 = type11.getSort();
        propertyDescriptor9.setValue("V", (java.lang.Object) type11);
        java.lang.Class<?> wildcardClass21 = propertyDescriptor9.getPropertyEditorClass();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor9.getPropertyType();
        propertyDescriptor9.setName("S");
        boolean boolean25 = propertyDescriptor9.isExpert();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("Llong;", method27, method28);
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor9.createPropertyEditor((java.lang.Object) method28);
        propertyDescriptor9.setPreferred(true);
        boolean boolean33 = type5.equals((java.lang.Object) propertyDescriptor9);
        boolean boolean34 = type1.equals((java.lang.Object) boolean33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor29", propertyDescriptor9.equals(propertyDescriptor29) ? propertyDescriptor9.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Z()J");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type4 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] { type2, type3, type4 };
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray5);
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray5);
        java.lang.String str8 = type0.getClassName();
        int int10 = type0.getOpcode((int) (byte) 10);
        java.lang.String str11 = type0.toString();
        java.lang.String str12 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "java.beans.PropertyDescriptor[name=Llong;]");
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
        java.lang.reflect.Method method26 = null;
        propertyDescriptor12.setReadMethod(method26);
        propertyDescriptor12.setExpert(false);
        java.lang.reflect.Method method30 = propertyDescriptor12.getReadMethod();
        java.lang.reflect.Method method31 = null;
        propertyDescriptor12.setReadMethod(method31);
        boolean boolean33 = signature8.equals((java.lang.Object) propertyDescriptor12);
        boolean boolean34 = signature2.equals((java.lang.Object) signature8);
        java.lang.String str35 = signature2.getName();
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
        java.lang.String str76 = signature75.toString();
        java.lang.String str77 = signature75.getDescriptor();
        boolean boolean79 = signature75.equals((java.lang.Object) 11);
        java.lang.String str80 = signature75.getDescriptor();
        java.lang.String str81 = signature75.getName();
        boolean boolean82 = signature2.equals((java.lang.Object) signature75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor44", propertyDescriptor12.equals(propertyDescriptor44) ? propertyDescriptor12.hashCode() == propertyDescriptor44.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Jhi!");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        java.lang.String str4 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }
}


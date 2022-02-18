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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        java.util.Enumeration<java.lang.String> strEnumeration30 = propertyDescriptor3.attributeNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str15 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type0.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        java.lang.Class[] classArray39 = new java.lang.Class[] {};
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        java.lang.String str45 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass44);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray47, true, true);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray50);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.toString();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray8);
        boolean boolean10 = type0.equals((java.lang.Object) classArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode((int) (byte) 1);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        propertyDescriptor3.setExpert(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type52 };
        java.lang.String str56 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray55);
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("(Z)C", method41, method42);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor43.setValue("org/mockito/asm/Type", (java.lang.Object) signature47);
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C]", (java.lang.Object) signature47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor43", propertyDescriptor3.equals(propertyDescriptor43) ? propertyDescriptor3.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type0.getElementType();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, true);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray11);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.lang.String str18 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, true);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray23);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray34);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass39 = type38.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass41 = type40.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass39, wildcardClass41, wildcardClass45 };
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray52, false, true);
        java.lang.Class[] classArray56 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray55);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray57);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        org.mockito.asm.Type type51 = type47.getElementType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(128);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass17, wildcardClass19, wildcardClass23 };
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, false, true);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray33);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray35);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        int int2 = type1.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) (byte) 0);
        int int7 = type3.getOpcode(100);
        int int8 = type3.getSize();
        int int10 = type3.getOpcode(4);
        int int12 = type3.getOpcode((int) ' ');
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str14 = type13.getDescriptor();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] {};
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray15);
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray15);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type1.getInternalName();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        java.lang.String str10 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("(Z)C", method11, method12);
        propertyDescriptor13.setBound(true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor13.getPropertyType();
        java.lang.Object obj18 = propertyDescriptor13.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method19 = null;
        propertyDescriptor13.setWriteMethod(method19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray27 = classInfo26.getInterfaces();
        boolean boolean29 = classInfo26.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray30 = classInfo26.getInterfaces();
        org.mockito.asm.Type type31 = classInfo26.getSuperType();
        propertyDescriptor13.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        boolean boolean37 = classInfo26.equals((java.lang.Object) type33);
        propertyDescriptor3.setValue("F", (java.lang.Object) classInfo26);
        org.mockito.asm.Type type39 = classInfo26.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method7, method8);
        propertyDescriptor9.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        boolean boolean17 = propertyDescriptor15.isPreferred();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor15.getPropertyType();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor9.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        java.lang.String str20 = propertyDescriptor15.getShortDescription();
        boolean boolean21 = signature2.equals((java.lang.Object) propertyDescriptor15);
        java.lang.String str22 = signature2.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor15", propertyDescriptor9.equals(propertyDescriptor15) ? propertyDescriptor9.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        java.lang.reflect.Method method30 = null;
        propertyDescriptor3.setWriteMethod(method30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method7, method8);
        propertyDescriptor9.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        boolean boolean17 = propertyDescriptor15.isPreferred();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor15.getPropertyType();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor9.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        java.lang.String str20 = propertyDescriptor15.getShortDescription();
        boolean boolean21 = signature2.equals((java.lang.Object) propertyDescriptor15);
        org.mockito.asm.Type type22 = signature2.getReturnType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor15", propertyDescriptor9.equals(propertyDescriptor15) ? propertyDescriptor9.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        propertyDescriptor9.setBound(false);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode((int) (byte) 1);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray8);
        boolean boolean10 = type0.equals((java.lang.Object) classArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type0.getInternalName();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type1.getDimensions();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        int int13 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type1.getInternalName();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode(9);
        int int11 = type0.getOpcode(7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        propertyDescriptor9.setBound(false);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor9.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("double", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        int int5 = type3.getSort();
        boolean boolean6 = signature2.equals((java.lang.Object) type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type3.getElementType();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = classInfo7.getSuperType();
        org.mockito.asm.Type type9 = classInfo7.getSuperType();
        org.mockito.asm.Type[] typeArray10 = classInfo7.getInterfaces();
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("B", type1, typeArray14);
        java.lang.String str16 = signature15.toString();
        java.lang.String str17 = signature15.getDescriptor();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method19, method20);
        propertyDescriptor21.setExpert(false);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("(Z)C", method25, method26);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor27.attributeNames();
        boolean boolean29 = propertyDescriptor27.isPreferred();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor27.getPropertyType();
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor21.createPropertyEditor((java.lang.Object) propertyDescriptor27);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.lang.String str37 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, true, true);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray42);
        java.lang.Class[] classArray44 = new java.lang.Class[] {};
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass47 = type46.getClass();
        java.lang.String str48 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, true);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray53);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray53);
        propertyDescriptor27.setValue("Ljava/lang/Object;", (java.lang.Object) strArray34);
        propertyDescriptor27.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method59 = propertyDescriptor27.getReadMethod();
        propertyDescriptor27.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor27.setName("org.mockito.asm.Type");
        propertyDescriptor27.setExpert(true);
        boolean boolean66 = signature15.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor21 and propertyDescriptor27", propertyDescriptor21.equals(propertyDescriptor27) ? propertyDescriptor21.hashCode() == propertyDescriptor27.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor57.setValue("org/mockito/asm/Type", (java.lang.Object) signature61);
        java.lang.String str63 = propertyDescriptor57.getDisplayName();
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setName("org/mockito/asm/Type");
        propertyDescriptor57.setDisplayName("long");
        boolean boolean72 = propertyDescriptor57.isPreferred();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor57.getPropertyType();
        java.lang.String str74 = propertyDescriptor57.getDisplayName();
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", (java.lang.Object) propertyDescriptor57);
        boolean boolean76 = propertyDescriptor57.isConstrained();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor57.setValue("org/mockito/asm/Type", (java.lang.Object) signature61);
        java.lang.String str63 = propertyDescriptor57.getDisplayName();
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setName("org/mockito/asm/Type");
        propertyDescriptor57.setDisplayName("long");
        boolean boolean72 = propertyDescriptor57.isPreferred();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor57.getPropertyType();
        java.lang.String str74 = propertyDescriptor57.getDisplayName();
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", (java.lang.Object) propertyDescriptor57);
        java.lang.String str76 = propertyDescriptor9.getShortDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int5 = type0.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method6 = null;
        propertyDescriptor3.setWriteMethod(method6);
        java.util.Enumeration<java.lang.String> strEnumeration8 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", (java.lang.Object) "java/beans/PropertyDescriptor");
        boolean boolean12 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method13 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        propertyDescriptor17.setBound(true);
        boolean boolean20 = propertyDescriptor17.isExpert();
        propertyDescriptor17.setName("boolean");
        boolean boolean23 = propertyDescriptor17.isExpert();
        boolean boolean24 = propertyDescriptor17.isPreferred();
        boolean boolean25 = propertyDescriptor17.isPreferred();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("(Z)C", method28, method29);
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor30.attributeNames();
        boolean boolean32 = propertyDescriptor30.isPreferred();
        java.lang.String str33 = propertyDescriptor30.getName();
        boolean boolean34 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setBound(true);
        propertyDescriptor30.setShortDescription("Z");
        boolean boolean39 = propertyDescriptor30.isHidden();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor30.getPropertyEditorClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str45 = type44.toString();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor30.createPropertyEditor((java.lang.Object) type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass48 = type47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        int int57 = type55.getOpcode(0);
        int int58 = type55.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass60 = type59.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type[] typeArray65 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type55, typeArray65);
        boolean boolean67 = type53.equals((java.lang.Object) typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray65);
        propertyDescriptor17.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray65);
        java.beans.PropertyEditor propertyEditor70 = propertyDescriptor3.createPropertyEditor((java.lang.Object) typeArray65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor30", propertyDescriptor17.equals(propertyDescriptor30) ? propertyDescriptor17.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean9 = classInfo5.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type7.getInternalName();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getClassName();
        int int6 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.Class<?> wildcardClass53 = propertyDescriptor9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = classInfo15.getType();
        org.mockito.asm.Type type17 = type16.getElementType();
        java.lang.String str18 = type17.toString();
        boolean boolean19 = type0.equals((java.lang.Object) str18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type0.getInternalName();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = type1.getClassName();
        int int14 = type1.getSize();
        java.lang.String str15 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type1.getInternalName();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        int int5 = type0.getOpcode((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("(Z)C", method11, method12);
        propertyDescriptor13.setBound(true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor13.getPropertyType();
        java.lang.Object obj18 = propertyDescriptor13.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method19 = null;
        propertyDescriptor13.setWriteMethod(method19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray27 = classInfo26.getInterfaces();
        boolean boolean29 = classInfo26.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray30 = classInfo26.getInterfaces();
        org.mockito.asm.Type type31 = classInfo26.getSuperType();
        propertyDescriptor13.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        boolean boolean37 = classInfo26.equals((java.lang.Object) type33);
        propertyDescriptor3.setValue("F", (java.lang.Object) classInfo26);
        int int39 = classInfo26.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("(Z)C", method11, method12);
        propertyDescriptor13.setBound(true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor13.getPropertyType();
        java.lang.Object obj18 = propertyDescriptor13.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method19 = null;
        propertyDescriptor13.setWriteMethod(method19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray27 = classInfo26.getInterfaces();
        boolean boolean29 = classInfo26.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray30 = classInfo26.getInterfaces();
        org.mockito.asm.Type type31 = classInfo26.getSuperType();
        propertyDescriptor13.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        boolean boolean37 = classInfo26.equals((java.lang.Object) type33);
        propertyDescriptor3.setValue("F", (java.lang.Object) classInfo26);
        org.mockito.asm.Type type39 = classInfo26.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("(Z)C", method14, method15);
        propertyDescriptor16.setBound(true);
        boolean boolean19 = propertyDescriptor16.isExpert();
        propertyDescriptor16.setName("boolean");
        boolean boolean22 = propertyDescriptor16.isExpert();
        boolean boolean23 = propertyDescriptor16.isPreferred();
        boolean boolean24 = propertyDescriptor16.isPreferred();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("(Z)C", method27, method28);
        java.util.Enumeration<java.lang.String> strEnumeration30 = propertyDescriptor29.attributeNames();
        boolean boolean31 = propertyDescriptor29.isPreferred();
        java.lang.String str32 = propertyDescriptor29.getName();
        boolean boolean33 = propertyDescriptor29.isExpert();
        propertyDescriptor29.setBound(true);
        propertyDescriptor29.setShortDescription("Z");
        boolean boolean38 = propertyDescriptor29.isHidden();
        java.lang.Class<?> wildcardClass39 = propertyDescriptor29.getPropertyEditorClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass41 = type40.getClass();
        java.lang.String str42 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        java.lang.String str44 = type43.toString();
        java.beans.PropertyEditor propertyEditor45 = propertyDescriptor29.createPropertyEditor((java.lang.Object) type43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass47 = type46.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass47);
        java.lang.String str49 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass47);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.CHAR_TYPE;
        int int56 = type54.getOpcode(0);
        int int57 = type54.getSort();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass59 = type58.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass59);
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass59);
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type[] typeArray64 = classInfo63.getInterfaces();
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type54, typeArray64);
        boolean boolean66 = type52.equals((java.lang.Object) typeArray64);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray64);
        propertyDescriptor16.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray64);
        java.beans.PropertyEditor propertyEditor69 = propertyDescriptor3.createPropertyEditor((java.lang.Object) typeArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor29", propertyDescriptor16.equals(propertyDescriptor29) ? propertyDescriptor16.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = type1.getClassName();
        int int14 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type1.getDimensions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method41 = propertyDescriptor9.getReadMethod();
        propertyDescriptor9.setHidden(false);
        java.lang.String str44 = propertyDescriptor9.getName();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("(Z)C", method46, method47);
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor48.setValue("org/mockito/asm/Type", (java.lang.Object) signature52);
        java.lang.String str54 = propertyDescriptor48.getDisplayName();
        boolean boolean55 = propertyDescriptor48.isHidden();
        propertyDescriptor48.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration58 = propertyDescriptor48.attributeNames();
        java.lang.String str59 = propertyDescriptor48.getDisplayName();
        java.lang.String str60 = propertyDescriptor48.getName();
        propertyDescriptor48.setHidden(false);
        java.lang.Class<?> wildcardClass63 = propertyDescriptor48.getClass();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass65 = type64.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass65);
        java.lang.String str67 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass65);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        java.lang.String str71 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass65);
        java.lang.String str72 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass76 = type75.getClass();
        java.lang.String str77 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass76);
        org.mockito.asm.Type type78 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass76);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass76);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass81 = type80.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray82 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass81);
        java.lang.String str83 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass81);
        java.beans.PropertyDescriptor[] propertyDescriptorArray84 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass81);
        java.lang.String str85 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass81);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass81);
        java.lang.Class[] classArray87 = new java.lang.Class[] { wildcardClass63, wildcardClass65, wildcardClass76, wildcardClass81 };
        int int88 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray87);
        boolean boolean89 = propertyDescriptor9.equals((java.lang.Object) int88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor48", propertyDescriptor3.equals(propertyDescriptor48) ? propertyDescriptor3.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.Class<?> wildcardClass53 = propertyDescriptor9.getClass();
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int4 = type2.getOpcode(0);
        int int5 = type2.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type2, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType("D");
        int int16 = type15.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        int int21 = type17.getOpcode(100);
        int int22 = type17.getSize();
        int int24 = type17.getOpcode(4);
        int int26 = type17.getOpcode((int) ' ');
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", type2, typeArray29);
        java.lang.String str34 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type2.getDimensions();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.Object obj14 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]");
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("(Z)C", method16, method17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type25 = classInfo24.getType();
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor18.createPropertyEditor((java.lang.Object) type25);
        java.lang.String str27 = type25.toString();
        org.mockito.asm.Type type28 = type25.getElementType();
        org.mockito.asm.Type type29 = type28.getElementType();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type28);
        propertyDescriptor3.setExpert(true);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method34, method35);
        boolean boolean37 = propertyDescriptor3.equals((java.lang.Object) method35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor36", propertyDescriptor18.equals(propertyDescriptor36) ? propertyDescriptor18.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.toString();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray9 = classInfo8.getInterfaces();
        boolean boolean10 = type1.equals((java.lang.Object) typeArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = type1.getInternalName();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("char", "");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor6.setValue("org/mockito/asm/Type", (java.lang.Object) signature10);
        java.lang.String str12 = propertyDescriptor6.getDisplayName();
        boolean boolean13 = propertyDescriptor6.isHidden();
        propertyDescriptor6.setShortDescription("Z");
        java.lang.Object obj17 = propertyDescriptor6.getValue("org.mockito.asm.Type");
        boolean boolean18 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("(Z)C", method20, method21);
        java.util.Enumeration<java.lang.String> strEnumeration23 = propertyDescriptor22.attributeNames();
        boolean boolean24 = propertyDescriptor22.isPreferred();
        java.lang.String str25 = propertyDescriptor22.getName();
        boolean boolean26 = propertyDescriptor22.isExpert();
        propertyDescriptor22.setBound(true);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor22.getPropertyType();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor22.getPropertyType();
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor6.createPropertyEditor((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method32 = propertyDescriptor22.getWriteMethod();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("(Z)C", method34, method35);
        java.util.Enumeration<java.lang.String> strEnumeration37 = propertyDescriptor36.attributeNames();
        boolean boolean38 = propertyDescriptor36.isPreferred();
        java.lang.reflect.Method method39 = null;
        propertyDescriptor36.setWriteMethod(method39);
        java.util.Enumeration<java.lang.String> strEnumeration41 = propertyDescriptor36.attributeNames();
        propertyDescriptor36.setName("S");
        boolean boolean44 = propertyDescriptor36.isExpert();
        boolean boolean45 = propertyDescriptor22.equals((java.lang.Object) boolean44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor36", propertyDescriptor6.equals(propertyDescriptor36) ? propertyDescriptor6.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("B", type1, typeArray14);
        int int17 = type1.getOpcode((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type1.getInternalName();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        java.lang.String str3 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        org.mockito.asm.Type type7 = classInfo5.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo5.getInterfaces();
        org.mockito.asm.Type[] typeArray9 = classInfo5.getInterfaces();
        org.mockito.asm.Type type10 = classInfo5.getType();
        int int11 = type10.getSort();
        int int13 = type10.getOpcode(6);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = classInfo18.getSuperType();
        org.mockito.asm.Type type20 = classInfo18.getSuperType();
        org.mockito.asm.Type[] typeArray21 = classInfo18.getInterfaces();
        org.mockito.asm.Type[] typeArray22 = classInfo18.getInterfaces();
        org.mockito.asm.Type type23 = classInfo18.getType();
        int int24 = type23.getSort();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = classInfo29.getSuperType();
        org.mockito.asm.Type type31 = classInfo29.getSuperType();
        org.mockito.asm.Type[] typeArray32 = classInfo29.getInterfaces();
        org.mockito.asm.Type[] typeArray33 = classInfo29.getInterfaces();
        org.mockito.asm.Type type34 = classInfo29.getType();
        java.lang.String str35 = classInfo29.toString();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("(Z)C", method37, method38);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor39.setValue("org/mockito/asm/Type", (java.lang.Object) signature43);
        java.lang.String str45 = propertyDescriptor39.getDisplayName();
        boolean boolean46 = propertyDescriptor39.isHidden();
        propertyDescriptor39.setDisplayName("org.mockito.asm.Type");
        propertyDescriptor39.setConstrained(true);
        boolean boolean51 = classInfo29.equals((java.lang.Object) propertyDescriptor39);
        org.mockito.asm.Type[] typeArray52 = classInfo29.getInterfaces();
        org.mockito.asm.Type[] typeArray53 = classInfo29.getInterfaces();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray53);
        org.mockito.cglib.core.Signature signature55 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=boolean; bound]", type10, typeArray53);
        java.lang.String str56 = signature55.toString();
        java.lang.reflect.Method method58 = null;
        java.lang.reflect.Method method59 = null;
        java.beans.PropertyDescriptor propertyDescriptor60 = new java.beans.PropertyDescriptor("(Z)C", method58, method59);
        boolean boolean61 = propertyDescriptor60.isPreferred();
        java.lang.reflect.Method method62 = propertyDescriptor60.getWriteMethod();
        boolean boolean63 = propertyDescriptor60.isPreferred();
        java.lang.reflect.Method method66 = null;
        java.lang.reflect.Method method67 = null;
        java.beans.PropertyDescriptor propertyDescriptor68 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method66, method67);
        propertyDescriptor68.setExpert(false);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass73 = type72.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass73);
        propertyDescriptor68.setValue("java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]", (java.lang.Object) wildcardClass73);
        propertyDescriptor60.setValue("long", (java.lang.Object) propertyDescriptor68);
        propertyDescriptor60.setExpert(true);
        boolean boolean79 = signature55.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor60 and propertyDescriptor68", propertyDescriptor60.equals(propertyDescriptor68) ? propertyDescriptor60.hashCode() == propertyDescriptor68.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str7 = signature6.getName();
        java.lang.String str8 = signature6.getDescriptor();
        org.mockito.asm.Type type9 = signature6.getReturnType();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method11, method12);
        propertyDescriptor13.setExpert(false);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("(Z)C", method17, method18);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor19.attributeNames();
        boolean boolean21 = propertyDescriptor19.isPreferred();
        java.lang.Class<?> wildcardClass22 = propertyDescriptor19.getPropertyType();
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor13.createPropertyEditor((java.lang.Object) propertyDescriptor19);
        java.lang.String str24 = propertyDescriptor19.getShortDescription();
        boolean boolean25 = signature6.equals((java.lang.Object) propertyDescriptor19);
        boolean boolean26 = type3.equals((java.lang.Object) signature6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor19", propertyDescriptor13.equals(propertyDescriptor19) ? propertyDescriptor13.hashCode() == propertyDescriptor19.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("()Lchar;");
        java.lang.String str4 = type3.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray12);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass19 = type16.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, false, false);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray27);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray34);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass41 = type38.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass41);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, true, true);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, false, true);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, true, false);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray51);
        boolean boolean54 = type1.equals((java.lang.Object) strArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int55 = type1.getDimensions();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode((int) (byte) 1);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        propertyDescriptor3.setBound(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass12, wildcardClass14, wildcardClass18 };
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, false, true);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray30);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; org/mockito/asm/TypeD=(Z)C; F=Ljava/lang/Object;; org/mockito/asm/TypeLorg/mockito/asm/Type;=double}]");
        int int3 = type1.getOpcode(13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str9 = propertyDescriptor3.getName();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setPreferred(false);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method18, method19);
        propertyDescriptor20.setExpert(false);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor26.attributeNames();
        boolean boolean28 = propertyDescriptor26.isPreferred();
        java.lang.Class<?> wildcardClass29 = propertyDescriptor26.getPropertyType();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor20.createPropertyEditor((java.lang.Object) propertyDescriptor26);
        propertyDescriptor20.setValue("B", (java.lang.Object) 100.0d);
        boolean boolean34 = propertyDescriptor20.isExpert();
        propertyDescriptor3.setValue("LC;", (java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor26", propertyDescriptor20.equals(propertyDescriptor26) ? propertyDescriptor20.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode(130);
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, false, true);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method1, method2);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=boolean; bound]");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type[] typeArray13 = classInfo12.getInterfaces();
        org.mockito.asm.Type type14 = classInfo12.getType();
        org.mockito.asm.Type type15 = classInfo12.getSuperType();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]", (java.lang.Object) classInfo12);
        int int17 = classInfo12.getModifiers();
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("(Z)C", method19, method20);
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor21.setValue("org/mockito/asm/Type", (java.lang.Object) signature25);
        java.lang.String str27 = signature25.getName();
        java.lang.String str28 = signature25.getDescriptor();
        boolean boolean29 = classInfo12.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor21", propertyDescriptor3.equals(propertyDescriptor21) ? propertyDescriptor3.hashCode() == propertyDescriptor21.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("B", type1, typeArray14);
        java.lang.String str16 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type1.getDimensions();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        boolean boolean8 = signature5.equals((java.lang.Object) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = type9.getElementType();
        int int11 = type10.getSort();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        int int15 = type13.getOpcode(0);
        int int16 = type13.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray23 = classInfo22.getInterfaces();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", type13, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray23);
        int int27 = type10.getOpcode(112);
        java.lang.String str28 = type10.getInternalName();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str32 = signature31.getDescriptor();
        boolean boolean33 = type10.equals((java.lang.Object) signature31);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("(Z)C", method35, method36);
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor37.setValue("org/mockito/asm/Type", (java.lang.Object) signature41);
        java.lang.String str43 = propertyDescriptor37.getDisplayName();
        propertyDescriptor37.setHidden(false);
        propertyDescriptor37.setHidden(false);
        propertyDescriptor37.setName("org/mockito/asm/Type");
        boolean boolean50 = signature31.equals((java.lang.Object) propertyDescriptor37);
        boolean boolean51 = signature2.equals((java.lang.Object) propertyDescriptor37);
        org.mockito.asm.Type type52 = signature2.getReturnType();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("(Z)C", method54, method55);
        java.util.Enumeration<java.lang.String> strEnumeration57 = propertyDescriptor56.attributeNames();
        boolean boolean58 = propertyDescriptor56.isPreferred();
        java.lang.String str59 = propertyDescriptor56.getName();
        boolean boolean60 = propertyDescriptor56.isHidden();
        java.lang.Class<?> wildcardClass61 = propertyDescriptor56.getClass();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        java.lang.String str63 = type62.getDescriptor();
        boolean boolean64 = signature2.equals((java.lang.Object) str63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor37 and propertyDescriptor56", propertyDescriptor37.equals(propertyDescriptor56) ? propertyDescriptor37.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor57.setValue("org/mockito/asm/Type", (java.lang.Object) signature61);
        java.lang.String str63 = propertyDescriptor57.getDisplayName();
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setName("org/mockito/asm/Type");
        propertyDescriptor57.setDisplayName("long");
        boolean boolean72 = propertyDescriptor57.isPreferred();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor57.getPropertyType();
        java.lang.String str74 = propertyDescriptor57.getDisplayName();
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", (java.lang.Object) propertyDescriptor57);
        boolean boolean76 = propertyDescriptor57.isExpert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; constrained]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method7, method8);
        propertyDescriptor9.setExpert(false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        boolean boolean17 = propertyDescriptor15.isPreferred();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor15.getPropertyType();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor9.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        java.lang.String str20 = propertyDescriptor15.getShortDescription();
        boolean boolean21 = signature2.equals((java.lang.Object) propertyDescriptor15);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type27 = classInfo26.getSuperType();
        org.mockito.asm.Type type28 = classInfo26.getSuperType();
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        boolean boolean32 = signature2.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor15", propertyDescriptor9.equals(propertyDescriptor15) ? propertyDescriptor9.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType("D");
        int int5 = type4.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = type6.equals((java.lang.Object) (byte) 0);
        int int10 = type6.getOpcode(100);
        int int11 = type6.getSize();
        int int13 = type6.getOpcode(4);
        int int15 = type6.getOpcode((int) ' ');
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getDescriptor();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] {};
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray18);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type0.getDimensions();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        java.lang.Object obj31 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=boolean; bound; propertyEditorClass=class [Ljava.lang.Class;]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; hidden; bound]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        propertyDescriptor9.setBound(false);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        boolean boolean19 = classInfo16.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray20 = classInfo16.getInterfaces();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        propertyDescriptor3.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo16);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        propertyDescriptor26.setBound(true);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor26.getPropertyType();
        java.lang.Object obj31 = propertyDescriptor26.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method32 = null;
        propertyDescriptor26.setWriteMethod(method32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type[] typeArray40 = classInfo39.getInterfaces();
        boolean boolean42 = classInfo39.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray43 = classInfo39.getInterfaces();
        org.mockito.asm.Type type44 = classInfo39.getSuperType();
        propertyDescriptor26.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo39);
        boolean boolean46 = classInfo16.equals((java.lang.Object) propertyDescriptor26);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType("B");
        boolean boolean49 = classInfo16.equals((java.lang.Object) type48);
        java.lang.String str50 = classInfo16.toString();
        org.mockito.asm.Type type51 = classInfo16.getSuperType();
        org.mockito.asm.Type[] typeArray52 = classInfo16.getInterfaces();
        org.mockito.asm.Type type53 = classInfo16.getSuperType();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        propertyDescriptor57.setBound(true);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor57.getPropertyType();
        boolean boolean61 = propertyDescriptor57.isExpert();
        propertyDescriptor57.setValue("org/mockito/asm/TypeLorg/mockito/asm/Type;", (java.lang.Object) 10.0d);
        java.lang.reflect.Method method65 = null;
        propertyDescriptor57.setWriteMethod(method65);
        java.lang.String str67 = propertyDescriptor57.getName();
        propertyDescriptor57.setName("org.mockito.asm.Type");
        java.lang.reflect.Method method70 = null;
        propertyDescriptor57.setWriteMethod(method70);
        propertyDescriptor57.setShortDescription("java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]");
        boolean boolean74 = classInfo16.equals((java.lang.Object) propertyDescriptor57);
        java.lang.String str75 = classInfo16.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(131);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        propertyDescriptor3.setValue("B", (java.lang.Object) 100.0d);
        boolean boolean17 = propertyDescriptor3.isExpert();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("D");
        int int20 = type19.getSort();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.String str27 = propertyDescriptor24.getName();
        boolean boolean28 = propertyDescriptor24.isExpert();
        propertyDescriptor24.setBound(true);
        propertyDescriptor24.setPreferred(true);
        boolean boolean33 = type19.equals((java.lang.Object) true);
        java.lang.String str34 = type19.getDescriptor();
        java.lang.String str35 = type19.toString();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("(Z)C", method37, method38);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor39.setValue("org/mockito/asm/Type", (java.lang.Object) signature43);
        java.lang.String str45 = propertyDescriptor39.getDisplayName();
        boolean boolean46 = propertyDescriptor39.isHidden();
        propertyDescriptor39.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration49 = propertyDescriptor39.attributeNames();
        java.lang.String str50 = propertyDescriptor39.getDisplayName();
        propertyDescriptor39.setName(")Lchar");
        java.lang.reflect.Method method53 = propertyDescriptor39.getReadMethod();
        boolean boolean54 = type19.equals((java.lang.Object) propertyDescriptor39);
        boolean boolean55 = propertyDescriptor3.equals((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor39", propertyDescriptor9.equals(propertyDescriptor39) ? propertyDescriptor9.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        java.lang.String str10 = type0.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = classInfo15.getSuperType();
        org.mockito.asm.Type type17 = classInfo15.getSuperType();
        org.mockito.asm.Type[] typeArray18 = classInfo15.getInterfaces();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        int int21 = type0.getOpcode(105);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("double");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor14.setValue("org/mockito/asm/Type", (java.lang.Object) signature18);
        java.lang.String str20 = signature18.getName();
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature18);
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("(Z)C", method23, method24);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor25.setValue("org/mockito/asm/Type", (java.lang.Object) signature29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type[] typeArray38 = classInfo37.getInterfaces();
        int int39 = classInfo37.getModifiers();
        propertyDescriptor25.setValue("()D", (java.lang.Object) int39);
        propertyDescriptor25.setBound(false);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor25.getClass();
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        boolean boolean45 = signature18.equals((java.lang.Object) classInfo44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type4.getElementType();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        int int6 = type4.getOpcode(0);
        int int7 = type4.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        int int16 = type4.getSort();
        java.lang.String str17 = type4.getDescriptor();
        java.lang.String str18 = type4.toString();
        boolean boolean19 = type0.equals((java.lang.Object) str18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type0.getDimensions();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("Z");
        java.lang.reflect.Method method12 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("(Z)C", method14, method15);
        propertyDescriptor16.setBound(true);
        boolean boolean19 = propertyDescriptor16.isExpert();
        propertyDescriptor16.setName("boolean");
        java.lang.Object obj23 = propertyDescriptor16.getValue("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass27 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor16.createPropertyEditor((java.lang.Object) propertyDescriptorArray28);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, true, false);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray32);
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; org/mockito/asm/TypeD=(Z)C; F=Ljava/lang/Object;; org/mockito/asm/TypeLorg/mockito/asm/Type;=double}]");
        int int3 = type1.getOpcode(13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        org.mockito.asm.Type type9 = classInfo4.getType();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("(Z)C", method11, method12);
        propertyDescriptor13.setBound(true);
        boolean boolean16 = propertyDescriptor13.isExpert();
        propertyDescriptor13.setName("boolean");
        boolean boolean19 = propertyDescriptor13.isExpert();
        boolean boolean20 = propertyDescriptor13.isPreferred();
        boolean boolean21 = propertyDescriptor13.isPreferred();
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor26.attributeNames();
        boolean boolean28 = propertyDescriptor26.isPreferred();
        java.lang.String str29 = propertyDescriptor26.getName();
        boolean boolean30 = propertyDescriptor26.isExpert();
        propertyDescriptor26.setBound(true);
        propertyDescriptor26.setShortDescription("Z");
        boolean boolean35 = propertyDescriptor26.isHidden();
        java.lang.Class<?> wildcardClass36 = propertyDescriptor26.getPropertyEditorClass();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass38 = type37.getClass();
        java.lang.String str39 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.lang.String str41 = type40.toString();
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor26.createPropertyEditor((java.lang.Object) type40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass44);
        java.lang.String str46 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass44);
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.CHAR_TYPE;
        int int53 = type51.getOpcode(0);
        int int54 = type51.getSort();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass56 = type55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.String str58 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass56);
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass56);
        org.mockito.asm.Type[] typeArray61 = classInfo60.getInterfaces();
        org.mockito.cglib.core.Signature signature62 = new org.mockito.cglib.core.Signature("", type51, typeArray61);
        boolean boolean63 = type49.equals((java.lang.Object) typeArray61);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray61);
        propertyDescriptor13.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray61);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor26", propertyDescriptor13.equals(propertyDescriptor26) ? propertyDescriptor13.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        boolean boolean13 = classInfo11.equals((java.lang.Object) "boolean");
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray14);
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type0.getInternalName();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("()Lchar;");
        java.lang.String str4 = type3.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        java.lang.String str10 = type0.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = classInfo15.getSuperType();
        org.mockito.asm.Type type17 = classInfo15.getSuperType();
        org.mockito.asm.Type[] typeArray18 = classInfo15.getInterfaces();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray18);
        int int21 = type0.getOpcode(105);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type0.getInternalName();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean17 = type15.equals((java.lang.Object) (byte) 0);
        int int19 = type15.getOpcode(100);
        int int20 = type15.getSize();
        int int22 = type15.getOpcode(4);
        int int24 = type15.getOpcode((int) ' ');
        org.mockito.asm.Type type25 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str26 = type25.getDescriptor();
        boolean boolean28 = type25.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass29 = type25.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        boolean boolean32 = type15.equals((java.lang.Object) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, false);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray36);
        java.lang.Object[] objArray43 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray43);
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean49 = type47.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass50 = type47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass50);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray51, true, true);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray51, false, true);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray51, true, false);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray60);
        java.lang.Object[] objArray67 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray68 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray67);
        int int69 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray68);
        java.lang.String[] strArray70 = org.mockito.cglib.core.ReflectUtils.getNames(classArray68);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean73 = type71.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass74 = type71.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass74);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray75, true, true);
        java.lang.reflect.Method[] methodArray81 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray75, false, true);
        java.lang.reflect.Method[] methodArray84 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray75, true, false);
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray70, methodArray84);
        java.lang.reflect.Method[] methodArray86 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray87 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray86);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        int int6 = type4.getOpcode(0);
        int int7 = type4.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        java.lang.String str16 = signature15.getName();
        java.lang.String str17 = signature15.getName();
        org.mockito.asm.Type[] typeArray18 = signature15.getArgumentTypes();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray18);
        org.mockito.asm.Type type20 = signature19.getReturnType();
        org.mockito.asm.Type type21 = signature19.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type21.getElementType();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("g.mockito.asm.Type");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method3, method4);
        propertyDescriptor5.setExpert(false);
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("(Z)C", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        boolean boolean13 = propertyDescriptor11.isPreferred();
        java.lang.Class<?> wildcardClass14 = propertyDescriptor11.getPropertyType();
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor5.createPropertyEditor((java.lang.Object) propertyDescriptor11);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, true);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray26);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass31 = type30.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass31);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, true);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray37);
        propertyDescriptor11.setValue("Ljava/lang/Object;", (java.lang.Object) strArray18);
        java.util.Enumeration<java.lang.String> strEnumeration41 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setHidden(true);
        boolean boolean44 = type1.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor11", propertyDescriptor5.equals(propertyDescriptor11) ? propertyDescriptor5.hashCode() == propertyDescriptor11.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = classInfo7.getSuperType();
        org.mockito.asm.Type type9 = classInfo7.getSuperType();
        org.mockito.asm.Type[] typeArray10 = classInfo7.getInterfaces();
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray10);
        java.lang.String str12 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type0.getDimensions();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type8.equals((java.lang.Object) (byte) 0);
        int int12 = type8.getOpcode(100);
        int int13 = type8.getSize();
        java.lang.String str14 = type8.getDescriptor();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        boolean boolean20 = signature17.equals((java.lang.Object) wildcardClass19);
        java.lang.String str21 = signature17.getName();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 4, boolean6, '#', type8, signature17 };
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.Object[] objArray32 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray32);
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass39 = type36.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass39);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, true, true);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, false, true);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, true, false);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray49);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray53 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray53);
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray57 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray57);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray57);
        java.lang.Class[] classArray60 = new java.lang.Class[] {};
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray60);
        java.lang.reflect.Method[] methodArray62 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray62);
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray67 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray67);
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray71 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray70, methodArray71);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray71);
        java.lang.Class[] classArray74 = new java.lang.Class[] {};
        java.lang.String[] strArray75 = org.mockito.cglib.core.ReflectUtils.getNames(classArray74);
        java.lang.reflect.Method[] methodArray76 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray75, methodArray76);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray76);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray76);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean82 = type80.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass83 = type80.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray84 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass83);
        java.lang.reflect.Method[] methodArray87 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray84, true, true);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray84, false, true);
        java.lang.Class[] classArray91 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray90);
        java.lang.reflect.Method[] methodArray92 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray90);
        java.lang.reflect.Method[] methodArray93 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray94 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray93);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass1, wildcardClass3, wildcardClass7 };
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass22);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, true, true);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray16);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray33);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray38);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method4, method5);
        propertyDescriptor6.setDisplayName("java.beans.PropertyDescriptor[name=boolean; bound]");
        propertyDescriptor6.setBound(false);
        boolean boolean11 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        boolean boolean17 = propertyDescriptor15.isPreferred();
        java.lang.reflect.Method method18 = null;
        propertyDescriptor15.setWriteMethod(method18);
        propertyDescriptor15.setHidden(true);
        propertyDescriptor15.setExpert(false);
        propertyDescriptor15.setBound(true);
        propertyDescriptor15.setShortDescription("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        propertyDescriptor15.setBound(false);
        boolean boolean30 = signature2.equals((java.lang.Object) propertyDescriptor15);
        java.lang.String str31 = signature2.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor15", propertyDescriptor6.equals(propertyDescriptor15) ? propertyDescriptor6.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        org.mockito.asm.Type type6 = classInfo4.getType();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type12 = classInfo11.getSuperType();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        org.mockito.asm.Type[] typeArray15 = classInfo11.getInterfaces();
        java.lang.Class<?> wildcardClass16 = typeArray15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray18);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        boolean boolean22 = classInfo4.equals((java.lang.Object) strArray21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass30 = type29.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        java.lang.Class[] classArray32 = new java.lang.Class[] { wildcardClass24, wildcardClass26, wildcardClass30 };
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray32);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, false, true);
        java.lang.Class[] classArray41 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray40);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass47 = type46.getClass();
        java.lang.String str48 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.lang.String str52 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        java.lang.Class[] classArray53 = new java.lang.Class[] { wildcardClass45, wildcardClass47, wildcardClass51 };
        int int54 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray53);
        java.lang.String[] strArray55 = org.mockito.cglib.core.ReflectUtils.getNames(classArray53);
        java.lang.Class[] classArray56 = new java.lang.Class[] {};
        java.lang.String[] strArray57 = org.mockito.cglib.core.ReflectUtils.getNames(classArray56);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass59 = type58.getClass();
        java.lang.String str60 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass59);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, true, true);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray57, methodArray65);
        java.lang.Class[] classArray67 = new java.lang.Class[] {};
        java.lang.String[] strArray68 = org.mockito.cglib.core.ReflectUtils.getNames(classArray67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass70 = type69.getClass();
        java.lang.String str71 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass70);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, true);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray68, methodArray76);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray57, methodArray76);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray80 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray79);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray6);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray25);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass32 = type29.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, true);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, false, true);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray39);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str45 = signature44.getName();
        java.lang.String str46 = signature44.getDescriptor();
        java.lang.String str47 = signature44.toString();
        org.mockito.asm.Type type48 = signature44.getReturnType();
        java.lang.String str49 = signature44.toString();
        java.lang.String str50 = signature44.getName();
        java.lang.Object[] objArray56 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray57 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray56);
        int int58 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray57);
        int int59 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray57);
        java.lang.String[] strArray60 = org.mockito.cglib.core.ReflectUtils.getNames(classArray57);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray60);
        org.mockito.cglib.core.Signature signature64 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass66 = type65.getClass();
        boolean boolean67 = signature64.equals((java.lang.Object) wildcardClass66);
        java.lang.String str68 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass66);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray69, true, true);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray72);
        boolean boolean74 = signature44.equals((java.lang.Object) methodArray73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray73);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean10 = type7.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass11 = type7.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        int int22 = type20.getOpcode(0);
        int int23 = type20.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type20, typeArray30);
        java.lang.String str32 = type20.getClassName();
        int int33 = type20.getSize();
        boolean boolean34 = type0.equals((java.lang.Object) int33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = type0.getDimensions();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()Z=D}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type1.getDimensions();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray1);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass26);
        java.lang.Class[] classArray28 = new java.lang.Class[] { wildcardClass20, wildcardClass22, wildcardClass26 };
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, true);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.lang.String str46 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, true, true);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray51);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray51);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass59 = type58.getClass();
        boolean boolean60 = signature57.equals((java.lang.Object) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass59);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, false, true);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, true, true);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray70 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray69);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.String str12 = type10.toString();
        org.mockito.asm.Type type13 = type10.getElementType();
        int int14 = type10.getSize();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        java.lang.reflect.Method method19 = propertyDescriptor18.getReadMethod();
        propertyDescriptor18.setShortDescription("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]; displayName=()Lg/mockito/asm/Type;]");
        propertyDescriptor18.setName("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
        propertyDescriptor18.setPreferred(true);
        propertyDescriptor18.setHidden(false);
        java.lang.reflect.Method method28 = propertyDescriptor18.getWriteMethod();
        boolean boolean29 = type10.equals((java.lang.Object) method28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor18", propertyDescriptor3.equals(propertyDescriptor18) ? propertyDescriptor3.hashCode() == propertyDescriptor18.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor6.attributeNames();
        boolean boolean8 = propertyDescriptor6.isPreferred();
        java.lang.String str9 = propertyDescriptor6.getName();
        boolean boolean10 = propertyDescriptor6.isExpert();
        propertyDescriptor6.setBound(true);
        propertyDescriptor6.setPreferred(true);
        boolean boolean15 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("(Z)C", method17, method18);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor19.attributeNames();
        boolean boolean21 = propertyDescriptor19.isPreferred();
        java.lang.String str22 = propertyDescriptor19.getName();
        boolean boolean23 = propertyDescriptor19.isExpert();
        propertyDescriptor19.setBound(true);
        propertyDescriptor19.setPreferred(true);
        java.lang.String str28 = propertyDescriptor19.getDisplayName();
        java.lang.reflect.Method method29 = null;
        propertyDescriptor19.setReadMethod(method29);
        propertyDescriptor19.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str33 = propertyDescriptor19.getDisplayName();
        boolean boolean34 = propertyDescriptor19.isExpert();
        propertyDescriptor19.setExpert(true);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor6.createPropertyEditor((java.lang.Object) true);
        java.lang.Object obj39 = propertyDescriptor6.getValue("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor6.setHidden(true);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("(Z)C", method43, method44);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor45.setValue("org/mockito/asm/Type", (java.lang.Object) signature49);
        java.lang.String str51 = propertyDescriptor45.getDisplayName();
        boolean boolean52 = propertyDescriptor45.isHidden();
        propertyDescriptor45.setShortDescription("Z");
        java.lang.Object obj56 = propertyDescriptor45.getValue("org.mockito.asm.Type");
        boolean boolean57 = propertyDescriptor45.isPreferred();
        propertyDescriptor45.setBound(true);
        java.lang.Class<?> wildcardClass60 = propertyDescriptor45.getPropertyType();
        java.lang.Class<?> wildcardClass61 = propertyDescriptor45.getPropertyType();
        propertyDescriptor45.setPreferred(false);
        java.beans.PropertyEditor propertyEditor64 = propertyDescriptor6.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor45", propertyDescriptor19.equals(propertyDescriptor45) ? propertyDescriptor19.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type4.getElementType();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("double", type18, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        java.lang.String str25 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type0.getDimensions();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F()Lg/mockito/asm/Type;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setDisplayName("org.mockito.asm.Type");
        java.lang.reflect.Method method13 = propertyDescriptor3.getReadMethod();
        boolean boolean14 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("(Z)C", method16, method17);
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor18.attributeNames();
        boolean boolean20 = propertyDescriptor18.isPreferred();
        java.lang.String str21 = propertyDescriptor18.getName();
        boolean boolean22 = propertyDescriptor18.isExpert();
        propertyDescriptor18.setBound(true);
        propertyDescriptor18.setPreferred(true);
        java.lang.String str27 = propertyDescriptor18.getDisplayName();
        java.lang.reflect.Method method28 = null;
        propertyDescriptor18.setReadMethod(method28);
        propertyDescriptor18.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str32 = propertyDescriptor18.getDisplayName();
        boolean boolean33 = propertyDescriptor18.isExpert();
        propertyDescriptor18.setExpert(false);
        propertyDescriptor18.setHidden(false);
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("(Z)C", method39, method40);
        java.util.Enumeration<java.lang.String> strEnumeration42 = propertyDescriptor41.attributeNames();
        boolean boolean43 = propertyDescriptor41.isPreferred();
        java.lang.String str44 = propertyDescriptor41.getName();
        boolean boolean45 = propertyDescriptor41.isExpert();
        propertyDescriptor41.setBound(true);
        propertyDescriptor41.setShortDescription("Z");
        propertyDescriptor41.setShortDescription("C");
        java.lang.reflect.Method method52 = propertyDescriptor41.getWriteMethod();
        java.beans.PropertyEditor propertyEditor53 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor41);
        propertyDescriptor41.setExpert(true);
        java.lang.reflect.Method method56 = null;
        propertyDescriptor41.setWriteMethod(method56);
        java.beans.PropertyEditor propertyEditor58 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor41);
        java.lang.reflect.Method method59 = null;
        propertyDescriptor3.setWriteMethod(method59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor41", propertyDescriptor18.equals(propertyDescriptor41) ? propertyDescriptor18.hashCode() == propertyDescriptor41.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray9 = classInfo4.getInterfaces();
        org.mockito.asm.Type type10 = classInfo4.getSuperType();
        org.mockito.asm.Type type11 = classInfo4.getSuperType();
        java.lang.Object obj12 = null;
        boolean boolean13 = classInfo4.equals(obj12);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        propertyDescriptor17.setBound(true);
        boolean boolean20 = propertyDescriptor17.isExpert();
        propertyDescriptor17.setName("boolean");
        boolean boolean23 = propertyDescriptor17.isExpert();
        boolean boolean24 = propertyDescriptor17.isPreferred();
        boolean boolean25 = propertyDescriptor17.isPreferred();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("(Z)C", method28, method29);
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor30.attributeNames();
        boolean boolean32 = propertyDescriptor30.isPreferred();
        java.lang.String str33 = propertyDescriptor30.getName();
        boolean boolean34 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setBound(true);
        propertyDescriptor30.setShortDescription("Z");
        boolean boolean39 = propertyDescriptor30.isHidden();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor30.getPropertyEditorClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str45 = type44.toString();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor30.createPropertyEditor((java.lang.Object) type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass48 = type47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        int int57 = type55.getOpcode(0);
        int int58 = type55.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass60 = type59.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type[] typeArray65 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type55, typeArray65);
        boolean boolean67 = type53.equals((java.lang.Object) typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray65);
        propertyDescriptor17.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray65);
        boolean boolean70 = classInfo4.equals((java.lang.Object) propertyDescriptor17);
        java.lang.String str71 = classInfo4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor30", propertyDescriptor17.equals(propertyDescriptor30) ? propertyDescriptor17.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        int int13 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type1.getDimensions();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode(130);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("double");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor14.setValue("org/mockito/asm/Type", (java.lang.Object) signature18);
        java.lang.String str20 = signature18.getName();
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature18);
        java.lang.String str22 = signature18.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray6 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray7 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray6);
        java.lang.reflect.Method[] methodArray8 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray6);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray20);
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray25);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray25);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray34);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass40 = type39.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass40);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, false, false);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, true, true);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass52);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray54, true, false);
        java.lang.Class[] classArray58 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray57);
        java.lang.Class[] classArray59 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray57);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray60);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str15 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type0.getElementType();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("()Lchar;");
        java.lang.String str4 = type3.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        int int6 = type1.getSort();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray12);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass19 = type16.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, false, false);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray27);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray34);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean40 = type38.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass41 = type38.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass41);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, true, true);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, false, true);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, true, false);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray51);
        boolean boolean54 = type1.equals((java.lang.Object) strArray15);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass56 = type55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray57, true, true);
        java.lang.Class[] classArray61 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray57);
        java.lang.Class[] classArray62 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray61);
        int int63 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray62);
        java.lang.String[] strArray64 = org.mockito.cglib.core.ReflectUtils.getNames(classArray62);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type68 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass69 = type68.getClass();
        boolean boolean70 = signature67.equals((java.lang.Object) wildcardClass69);
        java.lang.String str71 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass69);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass69);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray72, true, true);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray64, methodArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray76);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean10 = type7.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass11 = type7.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.CHAR_TYPE;
        int int22 = type20.getOpcode(0);
        int int23 = type20.getSort();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type20, typeArray30);
        java.lang.String str32 = type20.getClassName();
        int int33 = type20.getSize();
        boolean boolean34 = type0.equals((java.lang.Object) int33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type0.getElementType();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("(Z)C", method11, method12);
        propertyDescriptor13.setBound(true);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor13.getPropertyType();
        java.lang.Object obj18 = propertyDescriptor13.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method19 = null;
        propertyDescriptor13.setWriteMethod(method19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type[] typeArray27 = classInfo26.getInterfaces();
        boolean boolean29 = classInfo26.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray30 = classInfo26.getInterfaces();
        org.mockito.asm.Type type31 = classInfo26.getSuperType();
        propertyDescriptor13.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo26);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str34 = type33.getDescriptor();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] {};
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray35);
        boolean boolean37 = classInfo26.equals((java.lang.Object) type33);
        propertyDescriptor3.setValue("F", (java.lang.Object) classInfo26);
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("(Z)C", method40, method41);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor42.setValue("org/mockito/asm/Type", (java.lang.Object) signature46);
        java.lang.String str48 = propertyDescriptor42.getDisplayName();
        propertyDescriptor42.setHidden(false);
        org.mockito.cglib.core.Signature signature54 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.String str55 = signature54.getName();
        propertyDescriptor42.setValue("F", (java.lang.Object) str55);
        boolean boolean57 = propertyDescriptor42.isPreferred();
        boolean boolean58 = propertyDescriptor42.isExpert();
        propertyDescriptor42.setValue("()LLjava/lang/Object;", (java.lang.Object) "org/mockito/asm/TypeD");
        boolean boolean62 = classInfo26.equals((java.lang.Object) "org/mockito/asm/TypeD");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("(Z)C", method2, method3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type11 = classInfo10.getType();
        java.beans.PropertyEditor propertyEditor12 = propertyDescriptor4.createPropertyEditor((java.lang.Object) type11);
        java.lang.String str13 = type11.toString();
        org.mockito.asm.Type type14 = type11.getElementType();
        org.mockito.asm.Type type15 = type14.getElementType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean18 = type16.equals((java.lang.Object) (byte) 0);
        int int20 = type16.getOpcode(100);
        int int21 = type16.getSize();
        int int23 = type16.getOpcode(4);
        int int25 = type16.getOpcode((int) ' ');
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str27 = type26.getDescriptor();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] {};
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray28);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("F", type14, typeArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType("D");
        int int34 = type33.getSort();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("(Z)C", method36, method37);
        java.util.Enumeration<java.lang.String> strEnumeration39 = propertyDescriptor38.attributeNames();
        boolean boolean40 = propertyDescriptor38.isPreferred();
        java.lang.String str41 = propertyDescriptor38.getName();
        boolean boolean42 = propertyDescriptor38.isExpert();
        propertyDescriptor38.setBound(true);
        propertyDescriptor38.setPreferred(true);
        boolean boolean47 = type33.equals((java.lang.Object) true);
        java.lang.String str48 = type33.getDescriptor();
        java.lang.String str49 = type33.toString();
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("(Z)C", method51, method52);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor53.setValue("org/mockito/asm/Type", (java.lang.Object) signature57);
        java.lang.String str59 = propertyDescriptor53.getDisplayName();
        boolean boolean60 = propertyDescriptor53.isHidden();
        propertyDescriptor53.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration63 = propertyDescriptor53.attributeNames();
        java.lang.String str64 = propertyDescriptor53.getDisplayName();
        propertyDescriptor53.setName(")Lchar");
        java.lang.reflect.Method method67 = propertyDescriptor53.getReadMethod();
        boolean boolean68 = type33.equals((java.lang.Object) propertyDescriptor53);
        boolean boolean69 = signature31.equals((java.lang.Object) type33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor53", propertyDescriptor4.equals(propertyDescriptor53) ? propertyDescriptor4.hashCode() == propertyDescriptor53.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray3);
        java.lang.String str5 = type1.toString();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.String str13 = classInfo11.toString();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("B", type1, typeArray14);
        java.lang.String str16 = signature15.getDescriptor();
        org.mockito.asm.Type type17 = signature15.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        int int52 = type47.getOpcode(105);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = signature12.getName();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        java.lang.String str15 = type14.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type14.getDimensions();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int3 = type0.getSort();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        propertyDescriptor3.setValue("B", (java.lang.Object) 100.0d);
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.reflect.Method method19 = null;
        propertyDescriptor3.setReadMethod(method19);
        java.lang.reflect.Method method21 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=org.mockito.asm.Type]", method23, method24);
        propertyDescriptor25.setName("(Z)Lchar;");
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "(Z)Lchar;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor25", propertyDescriptor9.equals(propertyDescriptor25) ? propertyDescriptor9.hashCode() == propertyDescriptor25.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method41 = propertyDescriptor9.getReadMethod();
        propertyDescriptor9.setHidden(false);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type[] typeArray49 = classInfo48.getInterfaces();
        boolean boolean51 = classInfo48.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray52 = classInfo48.getInterfaces();
        org.mockito.asm.Type type53 = classInfo48.getSuperType();
        org.mockito.asm.Type type54 = classInfo48.getSuperType();
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor9.createPropertyEditor((java.lang.Object) type54);
        java.lang.String str56 = type54.getInternalName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("B");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("ava.beans.PropertyDescriptor[name=(Z)C");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        boolean boolean19 = classInfo16.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray20 = classInfo16.getInterfaces();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        propertyDescriptor3.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo16);
        java.lang.String str23 = propertyDescriptor3.getName();
        propertyDescriptor3.setDisplayName("S");
        propertyDescriptor3.setPreferred(true);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]", method29, method30);
        java.lang.reflect.Method method32 = propertyDescriptor31.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration33 = propertyDescriptor31.attributeNames();
        java.lang.reflect.Method method34 = propertyDescriptor31.getReadMethod();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("(Z)C", method36, method37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass40 = type39.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass40);
        java.lang.String str42 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass40);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type45 = classInfo44.getType();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor38.createPropertyEditor((java.lang.Object) type45);
        java.lang.String str47 = type45.toString();
        int int48 = type45.getSort();
        java.lang.String str49 = type45.getClassName();
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray53 = signature52.getArgumentTypes();
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type45, typeArray53);
        int int55 = type45.getSort();
        int int57 = type45.getOpcode(40);
        int int58 = type45.getDimensions();
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor31.createPropertyEditor((java.lang.Object) type45);
        boolean boolean60 = propertyDescriptor3.equals((java.lang.Object) propertyEditor59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor31 and propertyDescriptor38", propertyDescriptor31.equals(propertyDescriptor38) ? propertyDescriptor31.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str20 = type19.getDescriptor();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] {};
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray21);
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("double", type18, typeArray21);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type0.getElementType();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        java.lang.String str8 = classInfo4.toString();
        org.mockito.asm.Type type9 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str13 = signature12.getName();
        java.lang.String str14 = signature12.getDescriptor();
        org.mockito.asm.Type type15 = signature12.getReturnType();
        java.lang.String str16 = signature12.getName();
        java.lang.String str17 = signature12.getDescriptor();
        org.mockito.asm.Type type18 = signature12.getReturnType();
        org.mockito.asm.Type type19 = signature12.getReturnType();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("(Z)C", method21, method22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type30 = classInfo29.getType();
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor23.createPropertyEditor((java.lang.Object) type30);
        java.lang.reflect.Method method32 = null;
        propertyDescriptor23.setWriteMethod(method32);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method36, method37);
        propertyDescriptor38.setExpert(false);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("(Z)C", method42, method43);
        java.util.Enumeration<java.lang.String> strEnumeration45 = propertyDescriptor44.attributeNames();
        boolean boolean46 = propertyDescriptor44.isPreferred();
        java.lang.Class<?> wildcardClass47 = propertyDescriptor44.getPropertyType();
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor38.createPropertyEditor((java.lang.Object) propertyDescriptor44);
        propertyDescriptor23.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor38);
        propertyDescriptor38.setPreferred(true);
        boolean boolean52 = signature12.equals((java.lang.Object) propertyDescriptor38);
        boolean boolean53 = classInfo4.equals((java.lang.Object) boolean52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor23 and propertyDescriptor38", propertyDescriptor23.equals(propertyDescriptor38) ? propertyDescriptor23.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray8);
        boolean boolean10 = type0.equals((java.lang.Object) classArray9);
        int int11 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type0.getElementType();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        int int3 = type0.getOpcode(131);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]; bound]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.Class<?> wildcardClass53 = propertyDescriptor9.getClass();
        java.lang.String str54 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor15.setValue("org/mockito/asm/Type", (java.lang.Object) signature19);
        java.lang.String str21 = propertyDescriptor15.getDisplayName();
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setName("org/mockito/asm/Type");
        propertyDescriptor15.setDisplayName("long");
        boolean boolean30 = propertyDescriptor15.isPreferred();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("(Z)C", method32, method33);
        propertyDescriptor34.setBound(true);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor34.getPropertyType();
        boolean boolean38 = propertyDescriptor34.isExpert();
        propertyDescriptor34.setValue("org/mockito/asm/TypeLorg/mockito/asm/Type;", (java.lang.Object) 10.0d);
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor15.createPropertyEditor((java.lang.Object) propertyDescriptor34);
        boolean boolean43 = type11.equals((java.lang.Object) propertyDescriptor15);
        int int44 = type11.getDimensions();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor15", propertyDescriptor3.equals(propertyDescriptor15) ? propertyDescriptor3.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode((int) (byte) 1);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = null;
        java.beans.PropertyDescriptor propertyDescriptor4 = new java.beans.PropertyDescriptor("(Z)C", method2, method3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type11 = classInfo10.getType();
        java.beans.PropertyEditor propertyEditor12 = propertyDescriptor4.createPropertyEditor((java.lang.Object) type11);
        java.lang.String str13 = type11.toString();
        int int14 = type11.getSort();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("(Z)C", method16, method17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type25 = classInfo24.getType();
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor18.createPropertyEditor((java.lang.Object) type25);
        java.lang.String str27 = type25.toString();
        org.mockito.asm.Type type28 = type25.getElementType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.CHAR_TYPE;
        int int32 = type30.getOpcode(0);
        int int33 = type30.getSort();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass35 = type34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.String str37 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass35);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type[] typeArray40 = classInfo39.getInterfaces();
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type30, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray40);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]", type11, typeArray40);
        java.lang.String str44 = signature43.getName();
        java.lang.String str45 = signature43.getName();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("Lg/mockito/asm/Type;", method47, method48);
        java.lang.Object obj51 = propertyDescriptor49.getValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; bound]");
        java.lang.String str52 = propertyDescriptor49.getName();
        boolean boolean53 = signature43.equals((java.lang.Object) str52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor4 and propertyDescriptor49", propertyDescriptor4.equals(propertyDescriptor49) ? propertyDescriptor4.hashCode() == propertyDescriptor49.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method41 = propertyDescriptor9.getReadMethod();
        propertyDescriptor9.setHidden(false);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type[] typeArray49 = classInfo48.getInterfaces();
        boolean boolean51 = classInfo48.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray52 = classInfo48.getInterfaces();
        org.mockito.asm.Type type53 = classInfo48.getSuperType();
        org.mockito.asm.Type type54 = classInfo48.getSuperType();
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor9.createPropertyEditor((java.lang.Object) type54);
        int int56 = type54.getSort();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        java.lang.String str2 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=mockito/asm/Type; bound]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray9 = classInfo4.getInterfaces();
        org.mockito.asm.Type type10 = classInfo4.getSuperType();
        org.mockito.asm.Type type11 = classInfo4.getSuperType();
        java.lang.Object obj12 = null;
        boolean boolean13 = classInfo4.equals(obj12);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        propertyDescriptor17.setBound(true);
        boolean boolean20 = propertyDescriptor17.isExpert();
        propertyDescriptor17.setName("boolean");
        boolean boolean23 = propertyDescriptor17.isExpert();
        boolean boolean24 = propertyDescriptor17.isPreferred();
        boolean boolean25 = propertyDescriptor17.isPreferred();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("(Z)C", method28, method29);
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor30.attributeNames();
        boolean boolean32 = propertyDescriptor30.isPreferred();
        java.lang.String str33 = propertyDescriptor30.getName();
        boolean boolean34 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setBound(true);
        propertyDescriptor30.setShortDescription("Z");
        boolean boolean39 = propertyDescriptor30.isHidden();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor30.getPropertyEditorClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str45 = type44.toString();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor30.createPropertyEditor((java.lang.Object) type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass48 = type47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        int int57 = type55.getOpcode(0);
        int int58 = type55.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass60 = type59.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type[] typeArray65 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type55, typeArray65);
        boolean boolean67 = type53.equals((java.lang.Object) typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray65);
        propertyDescriptor17.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray65);
        boolean boolean70 = classInfo4.equals((java.lang.Object) propertyDescriptor17);
        org.mockito.asm.Type type71 = classInfo4.getType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor30", propertyDescriptor17.equals(propertyDescriptor30) ? propertyDescriptor17.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.lang.String str9 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = classInfo20.getSuperType();
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        boolean boolean27 = signature24.equals((java.lang.Object) wildcardClass26);
        java.lang.String str28 = signature24.getName();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean32 = type30.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        boolean boolean39 = type36.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray41 = new java.lang.Object[] { classInfo20, signature24, str34, (byte) 1, (-1), 3 };
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass45);
        org.mockito.cglib.core.ClassInfo classInfo49 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray51, true, true);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray55);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = signature2.getDescriptor();
        java.lang.Class<?> wildcardClass9 = signature2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = classInfo10.getType();
        org.mockito.asm.Type[] typeArray12 = classInfo10.getInterfaces();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("(Z)C", method14, method15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type23 = classInfo22.getType();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor16.createPropertyEditor((java.lang.Object) type23);
        java.lang.reflect.Method method25 = null;
        propertyDescriptor16.setWriteMethod(method25);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method29, method30);
        propertyDescriptor31.setExpert(false);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("(Z)C", method35, method36);
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor37.attributeNames();
        boolean boolean39 = propertyDescriptor37.isPreferred();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor37.getPropertyType();
        java.beans.PropertyEditor propertyEditor41 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor37);
        propertyDescriptor16.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor31);
        propertyDescriptor31.setPreferred(true);
        boolean boolean45 = classInfo10.equals((java.lang.Object) propertyDescriptor31);
        java.lang.String str46 = classInfo10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor31", propertyDescriptor16.equals(propertyDescriptor31) ? propertyDescriptor16.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]; values={java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]=class org.mockito.asm.Type}; constrained]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lmockito/asm/Type;", "(Z)C");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray9 = classInfo8.getInterfaces();
        boolean boolean10 = signature2.equals((java.lang.Object) typeArray9);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method12, method13);
        propertyDescriptor14.setExpert(false);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("(Z)C", method18, method19);
        java.util.Enumeration<java.lang.String> strEnumeration21 = propertyDescriptor20.attributeNames();
        boolean boolean22 = propertyDescriptor20.isPreferred();
        java.lang.Class<?> wildcardClass23 = propertyDescriptor20.getPropertyType();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor14.createPropertyEditor((java.lang.Object) propertyDescriptor20);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.Class[] classArray37 = new java.lang.Class[] {};
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass40 = type39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass40);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray43, true, true);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray46);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray46);
        propertyDescriptor20.setValue("Ljava/lang/Object;", (java.lang.Object) strArray27);
        java.util.Enumeration<java.lang.String> strEnumeration50 = propertyDescriptor20.attributeNames();
        propertyDescriptor20.setHidden(true);
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("(Z)C", method54, method55);
        java.util.Enumeration<java.lang.String> strEnumeration57 = propertyDescriptor56.attributeNames();
        boolean boolean58 = propertyDescriptor56.isPreferred();
        java.lang.String str59 = propertyDescriptor56.getName();
        boolean boolean60 = propertyDescriptor56.isExpert();
        propertyDescriptor56.setBound(true);
        propertyDescriptor56.setPreferred(true);
        java.lang.String str65 = propertyDescriptor56.getDisplayName();
        java.lang.reflect.Method method66 = null;
        propertyDescriptor56.setReadMethod(method66);
        java.lang.reflect.Method method68 = propertyDescriptor56.getReadMethod();
        java.lang.reflect.Method method71 = null;
        java.lang.reflect.Method method72 = null;
        java.beans.PropertyDescriptor propertyDescriptor73 = new java.beans.PropertyDescriptor("(Z)C", method71, method72);
        java.util.Enumeration<java.lang.String> strEnumeration74 = propertyDescriptor73.attributeNames();
        boolean boolean75 = propertyDescriptor73.isPreferred();
        java.lang.String str76 = propertyDescriptor73.getName();
        boolean boolean77 = propertyDescriptor73.isExpert();
        propertyDescriptor73.setBound(true);
        propertyDescriptor73.setShortDescription("Z");
        boolean boolean82 = propertyDescriptor73.isHidden();
        java.lang.Class<?> wildcardClass83 = propertyDescriptor73.getPropertyEditorClass();
        propertyDescriptor73.setShortDescription("g.mockito.asm.Type");
        propertyDescriptor56.setValue("[Lorg/mockito/asm/Type;", (java.lang.Object) "g.mockito.asm.Type");
        java.beans.PropertyEditor propertyEditor87 = propertyDescriptor20.createPropertyEditor((java.lang.Object) "[Lorg/mockito/asm/Type;");
        boolean boolean88 = signature2.equals((java.lang.Object) propertyEditor87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor20", propertyDescriptor14.equals(propertyDescriptor20) ? propertyDescriptor14.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.reflect.Method[] methodArray2 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray2);
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray14);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray1);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray16);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray33 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray33);
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray37 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray37);
        java.lang.Class[] classArray40 = new java.lang.Class[] {};
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray40);
        java.lang.reflect.Method[] methodArray42 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray42);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray42);
        java.lang.Class[] classArray45 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray44);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray44);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray46);
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass50 = type49.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass50);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray51, true, false);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray54);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray56);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray9 = classInfo4.getInterfaces();
        org.mockito.asm.Type type10 = classInfo4.getSuperType();
        org.mockito.asm.Type type11 = classInfo4.getSuperType();
        java.lang.Object obj12 = null;
        boolean boolean13 = classInfo4.equals(obj12);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        propertyDescriptor17.setBound(true);
        boolean boolean20 = propertyDescriptor17.isExpert();
        propertyDescriptor17.setName("boolean");
        boolean boolean23 = propertyDescriptor17.isExpert();
        boolean boolean24 = propertyDescriptor17.isPreferred();
        boolean boolean25 = propertyDescriptor17.isPreferred();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("(Z)C", method28, method29);
        java.util.Enumeration<java.lang.String> strEnumeration31 = propertyDescriptor30.attributeNames();
        boolean boolean32 = propertyDescriptor30.isPreferred();
        java.lang.String str33 = propertyDescriptor30.getName();
        boolean boolean34 = propertyDescriptor30.isExpert();
        propertyDescriptor30.setBound(true);
        propertyDescriptor30.setShortDescription("Z");
        boolean boolean39 = propertyDescriptor30.isHidden();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor30.getPropertyEditorClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        java.lang.String str43 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.lang.String str45 = type44.toString();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor30.createPropertyEditor((java.lang.Object) type44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass48 = type47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.ClassInfo classInfo52 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.CHAR_TYPE;
        int int57 = type55.getOpcode(0);
        int int58 = type55.getSort();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass60 = type59.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass60);
        java.lang.String str62 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass60);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass60);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass60);
        org.mockito.asm.Type[] typeArray65 = classInfo64.getInterfaces();
        org.mockito.cglib.core.Signature signature66 = new org.mockito.cglib.core.Signature("", type55, typeArray65);
        boolean boolean67 = type53.equals((java.lang.Object) typeArray65);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray65);
        propertyDescriptor17.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray65);
        boolean boolean70 = classInfo4.equals((java.lang.Object) propertyDescriptor17);
        int int71 = classInfo4.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor30", propertyDescriptor17.equals(propertyDescriptor30) ? propertyDescriptor17.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setShortDescription("Lchar;");
        java.lang.reflect.Method method13 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setName("[Lorg/mockito/asm/Type;");
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("(Z)C", method19, method20);
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor21.attributeNames();
        boolean boolean23 = propertyDescriptor21.isPreferred();
        java.lang.String str24 = propertyDescriptor21.getName();
        boolean boolean25 = propertyDescriptor21.isExpert();
        propertyDescriptor21.setBound(true);
        propertyDescriptor21.setPreferred(true);
        java.lang.String str30 = propertyDescriptor21.getDisplayName();
        java.lang.reflect.Method method31 = null;
        propertyDescriptor21.setReadMethod(method31);
        propertyDescriptor21.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str35 = propertyDescriptor21.getName();
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str35);
        propertyDescriptor3.setDisplayName("g/mockito/asm/Type");
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("(Z)C", method41, method42);
        propertyDescriptor43.setBound(true);
        java.lang.Class<?> wildcardClass46 = propertyDescriptor43.getPropertyType();
        java.lang.Object obj48 = propertyDescriptor43.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method49 = null;
        propertyDescriptor43.setWriteMethod(method49);
        propertyDescriptor43.setDisplayName("org/mockito/asm/Type");
        propertyDescriptor43.setDisplayName("()L)Lchar;");
        propertyDescriptor43.setPreferred(true);
        propertyDescriptor43.setName("java.beans.PropertyDescriptor[name=(Z)C; bound; propertyEditorClass=class org.mockito.asm.Type]");
        propertyDescriptor3.setValue("Z)Lorg/mockito/asm/Type", (java.lang.Object) "java.beans.PropertyDescriptor[name=(Z)C; bound; propertyEditorClass=class org.mockito.asm.Type]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor21 and propertyDescriptor43", propertyDescriptor21.equals(propertyDescriptor43) ? propertyDescriptor21.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("(Z)C", method8, method9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type17 = classInfo16.getType();
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor10.createPropertyEditor((java.lang.Object) type17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor10.getPropertyEditorClass();
        propertyDescriptor10.setPreferred(true);
        propertyDescriptor10.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor10.setConstrained(true);
        propertyDescriptor10.setShortDescription("");
        boolean boolean28 = signature2.equals((java.lang.Object) propertyDescriptor10);
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("(Z)C", method30, method31);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor32.setValue("org/mockito/asm/Type", (java.lang.Object) signature36);
        java.lang.String str38 = propertyDescriptor32.getDisplayName();
        propertyDescriptor32.setHidden(false);
        propertyDescriptor32.setHidden(false);
        propertyDescriptor32.setName("org/mockito/asm/Type");
        propertyDescriptor32.setDisplayName("long");
        boolean boolean47 = propertyDescriptor32.isPreferred();
        propertyDescriptor32.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.beans.PropertyEditor propertyEditor52 = propertyDescriptor32.createPropertyEditor((java.lang.Object) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass51);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, false);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, false);
        boolean boolean62 = signature2.equals((java.lang.Object) propertyDescriptorArray55);
        java.lang.String str63 = signature2.getName();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass65 = type64.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass65);
        java.lang.String str67 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass65);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type[] typeArray70 = classInfo69.getInterfaces();
        org.mockito.asm.Type type71 = classInfo69.getType();
        org.mockito.asm.Type type72 = classInfo69.getSuperType();
        org.mockito.asm.Type[] typeArray73 = classInfo69.getInterfaces();
        java.lang.reflect.Method method75 = null;
        java.lang.reflect.Method method76 = null;
        java.beans.PropertyDescriptor propertyDescriptor77 = new java.beans.PropertyDescriptor("(Z)C", method75, method76);
        propertyDescriptor77.setBound(true);
        boolean boolean80 = propertyDescriptor77.isExpert();
        propertyDescriptor77.setBound(false);
        java.lang.reflect.Method method83 = null;
        propertyDescriptor77.setReadMethod(method83);
        boolean boolean85 = classInfo69.equals((java.lang.Object) propertyDescriptor77);
        propertyDescriptor77.setPreferred(true);
        boolean boolean88 = signature2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor32 and propertyDescriptor77", propertyDescriptor32.equals(propertyDescriptor77) ? propertyDescriptor32.hashCode() == propertyDescriptor77.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        boolean boolean11 = signature8.equals((java.lang.Object) wildcardClass10);
        java.lang.String str12 = signature8.getName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean16 = type14.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray17);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str21 = type20.getDescriptor();
        boolean boolean23 = type20.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray25 = new java.lang.Object[] { classInfo4, signature8, str18, (byte) 1, (-1), 3 };
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass31 = type30.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass35 = type34.getClass();
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass35);
        java.lang.Class[] classArray37 = new java.lang.Class[] { wildcardClass29, wildcardClass31, wildcardClass35 };
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass42);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, true, false);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray49);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor57.setValue("org/mockito/asm/Type", (java.lang.Object) signature61);
        java.lang.String str63 = propertyDescriptor57.getDisplayName();
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setName("org/mockito/asm/Type");
        propertyDescriptor57.setDisplayName("long");
        boolean boolean72 = propertyDescriptor57.isPreferred();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor57.getPropertyType();
        java.lang.String str74 = propertyDescriptor57.getDisplayName();
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", (java.lang.Object) propertyDescriptor57);
        propertyDescriptor57.setPreferred(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int3 = type1.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        propertyDescriptor3.setHidden(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(Z)Lorg/mockito/asm/Type;");
        int int3 = type1.getOpcode(36);
        java.lang.String str4 = type1.getClassName();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("org/mockito/asm/Type", method6, method7);
        java.lang.Object obj10 = propertyDescriptor8.getValue("double()Lg/mockito/asm/Type;");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method12, method13);
        java.lang.reflect.Method method15 = propertyDescriptor14.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor14.attributeNames();
        propertyDescriptor14.setDisplayName("()Lg/mockito/asm/Type;");
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor14.attributeNames();
        java.lang.reflect.Method method20 = null;
        propertyDescriptor14.setReadMethod(method20);
        java.beans.PropertyEditor propertyEditor22 = propertyDescriptor8.createPropertyEditor((java.lang.Object) method20);
        boolean boolean23 = type1.equals((java.lang.Object) propertyEditor22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor14", propertyDescriptor8.equals(propertyDescriptor14) ? propertyDescriptor8.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L()D;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        int int13 = type1.getSort();
        java.lang.String str14 = type1.getDescriptor();
        int int15 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type1.getInternalName();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("D");
        int int6 = type5.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        int int11 = type7.getOpcode(100);
        int int12 = type7.getSize();
        int int14 = type7.getOpcode(4);
        int int16 = type7.getOpcode((int) ' ');
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("mockito/asm/Type", type25, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type1, typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = type1.getInternalName();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("mockito/asm/Type", "java.beans.PropertyDescriptor[name=(Z)C; shortDescription=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; constrained]");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getDescriptor();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type6.getElementType();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray2, true, true);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray2);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Object[] objArray14 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean20 = type18.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass21 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, false, true);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, false);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray32);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Ljava.beans.PropertyDescriptor[name=(Z)C; shortDescription=Lorg/mockito/asm/Type;; values={()Lg/mockito/asm/Type;=org.mockito.asm.Type}; bound];");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(128);
        java.lang.String str5 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Object[] objArray23 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass29);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, false, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray39);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=()Z; bound]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        boolean boolean7 = signature2.equals((java.lang.Object) (short) 1);
        java.lang.String str8 = signature2.getDescriptor();
        java.lang.Class<?> wildcardClass9 = signature2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = classInfo10.getType();
        org.mockito.asm.Type[] typeArray12 = classInfo10.getInterfaces();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("(Z)C", method14, method15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type23 = classInfo22.getType();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor16.createPropertyEditor((java.lang.Object) type23);
        java.lang.reflect.Method method25 = null;
        propertyDescriptor16.setWriteMethod(method25);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method29, method30);
        propertyDescriptor31.setExpert(false);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("(Z)C", method35, method36);
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor37.attributeNames();
        boolean boolean39 = propertyDescriptor37.isPreferred();
        java.lang.Class<?> wildcardClass40 = propertyDescriptor37.getPropertyType();
        java.beans.PropertyEditor propertyEditor41 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor37);
        propertyDescriptor16.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor31);
        propertyDescriptor31.setPreferred(true);
        boolean boolean45 = classInfo10.equals((java.lang.Object) propertyDescriptor31);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("(Z)C", method47, method48);
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor49.setValue("org/mockito/asm/Type", (java.lang.Object) signature53);
        java.lang.String str55 = propertyDescriptor49.getDisplayName();
        propertyDescriptor49.setHidden(false);
        propertyDescriptor49.setHidden(false);
        propertyDescriptor49.setName("org/mockito/asm/Type");
        propertyDescriptor49.setDisplayName("long");
        boolean boolean64 = propertyDescriptor49.isPreferred();
        propertyDescriptor49.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type67 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass68 = type67.getClass();
        java.beans.PropertyEditor propertyEditor69 = propertyDescriptor49.createPropertyEditor((java.lang.Object) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass68);
        java.lang.String str71 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.Class<?> wildcardClass74 = propertyDescriptorArray73.getClass();
        boolean boolean75 = classInfo10.equals((java.lang.Object) wildcardClass74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor31", propertyDescriptor16.equals(propertyDescriptor31) ? propertyDescriptor16.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = signature2.toString();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("(Z)C", method8, method9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type17 = classInfo16.getType();
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor10.createPropertyEditor((java.lang.Object) type17);
        java.lang.Class<?> wildcardClass19 = propertyDescriptor10.getPropertyEditorClass();
        propertyDescriptor10.setPreferred(true);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor26.setValue("org/mockito/asm/Type", (java.lang.Object) signature30);
        java.lang.String str32 = propertyDescriptor26.getDisplayName();
        propertyDescriptor26.setHidden(false);
        propertyDescriptor26.setHidden(false);
        propertyDescriptor26.setName("org/mockito/asm/Type");
        propertyDescriptor26.setDisplayName("long");
        boolean boolean41 = propertyDescriptor26.isPreferred();
        propertyDescriptor26.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass45 = type44.getClass();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor26.createPropertyEditor((java.lang.Object) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass45);
        propertyDescriptor10.setValue("Lva.beans.PropertyDescriptor[name=(Z)C;", (java.lang.Object) wildcardClass45);
        boolean boolean52 = signature2.equals((java.lang.Object) "Lva.beans.PropertyDescriptor[name=(Z)C;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor26", propertyDescriptor10.equals(propertyDescriptor26) ? propertyDescriptor10.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, true);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray22);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray34);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass39 = type38.getClass();
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass39);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, true, true);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray45);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray45);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass50 = type49.getClass();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        java.lang.String str53 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass56 = type55.getClass();
        java.lang.String str57 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass56);
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass50, wildcardClass52, wildcardClass56 };
        int int59 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray58);
        java.lang.String[] strArray60 = org.mockito.cglib.core.ReflectUtils.getNames(classArray58);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass62 = type61.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass62);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray63, false, true);
        java.lang.Class[] classArray67 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray66);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray66);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray66);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass71 = type70.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass71);
        java.lang.String str73 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass71);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass71);
        org.mockito.cglib.core.ClassInfo classInfo75 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass71);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass71);
        java.lang.Class<?> wildcardClass77 = type76.getClass();
        java.lang.String str78 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass77);
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass77);
        java.beans.PropertyDescriptor[] propertyDescriptorArray80 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass77);
        java.beans.PropertyDescriptor[] propertyDescriptorArray81 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass77);
        java.lang.reflect.Method[] methodArray84 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray81, false, false);
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray84);
        java.lang.reflect.Method[] methodArray86 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray87 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray86);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method4, method5);
        propertyDescriptor6.setDisplayName("java.beans.PropertyDescriptor[name=boolean; bound]");
        propertyDescriptor6.setBound(false);
        boolean boolean11 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        boolean boolean17 = propertyDescriptor15.isPreferred();
        java.lang.reflect.Method method18 = null;
        propertyDescriptor15.setWriteMethod(method18);
        propertyDescriptor15.setHidden(true);
        propertyDescriptor15.setExpert(false);
        propertyDescriptor15.setBound(true);
        propertyDescriptor15.setShortDescription("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        propertyDescriptor15.setBound(false);
        boolean boolean30 = signature2.equals((java.lang.Object) propertyDescriptor15);
        java.lang.String str31 = signature2.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor15", propertyDescriptor6.equals(propertyDescriptor15) ? propertyDescriptor6.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, false, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray26);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj15 = propertyDescriptor3.getValue("()D");
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("()D", method18, method19);
        propertyDescriptor3.setValue("Lchar;", (java.lang.Object) propertyDescriptor20);
        java.lang.String str22 = propertyDescriptor3.getName();
        propertyDescriptor3.setExpert(true);
        boolean boolean25 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setHidden(true);
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("(Z)C", method29, method30);
        org.mockito.cglib.core.Signature signature35 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor31.setValue("org/mockito/asm/Type", (java.lang.Object) signature35);
        java.lang.String str37 = propertyDescriptor31.getDisplayName();
        propertyDescriptor31.setHidden(false);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass42 = type41.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass42);
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type[] typeArray47 = classInfo46.getInterfaces();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str49 = type48.getDescriptor();
        boolean boolean50 = classInfo46.equals((java.lang.Object) type48);
        propertyDescriptor31.setValue("()Z", (java.lang.Object) type48);
        java.util.Enumeration<java.lang.String> strEnumeration52 = propertyDescriptor31.attributeNames();
        propertyDescriptor31.setExpert(true);
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("(Z)C", method56, method57);
        java.util.Enumeration<java.lang.String> strEnumeration59 = propertyDescriptor58.attributeNames();
        boolean boolean60 = propertyDescriptor58.isPreferred();
        java.lang.String str61 = propertyDescriptor58.getName();
        boolean boolean62 = propertyDescriptor58.isExpert();
        propertyDescriptor58.setBound(true);
        java.lang.reflect.Method method65 = null;
        propertyDescriptor58.setWriteMethod(method65);
        java.lang.Class<?> wildcardClass67 = propertyDescriptor58.getPropertyEditorClass();
        propertyDescriptor58.setExpert(false);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass71 = type70.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass71);
        java.beans.PropertyEditor propertyEditor73 = propertyDescriptor58.createPropertyEditor((java.lang.Object) wildcardClass71);
        java.beans.PropertyEditor propertyEditor74 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor58);
        propertyDescriptor58.setExpert(false);
        java.beans.PropertyEditor propertyEditor77 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor31", propertyDescriptor20.equals(propertyDescriptor31) ? propertyDescriptor20.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("D");
        int int6 = type5.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        int int11 = type7.getOpcode(100);
        int int12 = type7.getSize();
        int int14 = type7.getOpcode(4);
        int int16 = type7.getOpcode((int) ' ');
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("mockito/asm/Type", type25, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type1, typeArray29);
        org.mockito.asm.Type type32 = signature31.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type32.getElementType();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setPreferred(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method14, method15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        int int21 = type17.getOpcode(100);
        int int22 = type17.getSize();
        int int24 = type17.getOpcode(4);
        int int26 = type17.getOpcode((int) ' ');
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        boolean boolean30 = type27.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass31 = type27.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass31);
        boolean boolean34 = type17.equals((java.lang.Object) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor16.createPropertyEditor((java.lang.Object) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        propertyDescriptor3.setValue("L)Lchar;", (java.lang.Object) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, true);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, false, true);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray13, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean26 = type24.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass27 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, true, true);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, false, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray34);
        java.lang.Object[] objArray41 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray41);
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean47 = type45.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass48 = type45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass48);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray49, true, true);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray49, false, true);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray49, true, false);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray58);
        java.lang.Object[] objArray65 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray65);
        int int67 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray66);
        java.lang.String[] strArray68 = org.mockito.cglib.core.ReflectUtils.getNames(classArray66);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean71 = type69.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass72 = type69.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass72);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, true);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, false, true);
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray83 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray68, methodArray82);
        java.lang.reflect.Method[] methodArray84 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray84);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method41 = propertyDescriptor9.getReadMethod();
        propertyDescriptor9.setHidden(false);
        java.lang.String str44 = propertyDescriptor9.getName();
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("(Z)C", method47, method48);
        propertyDescriptor49.setBound(true);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor49.getPropertyType();
        java.lang.Object obj54 = propertyDescriptor49.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method55 = null;
        propertyDescriptor49.setWriteMethod(method55);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass59 = type58.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass59);
        java.lang.String str61 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass59);
        org.mockito.cglib.core.ClassInfo classInfo62 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type[] typeArray63 = classInfo62.getInterfaces();
        boolean boolean65 = classInfo62.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray66 = classInfo62.getInterfaces();
        org.mockito.asm.Type type67 = classInfo62.getSuperType();
        propertyDescriptor49.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo62);
        java.lang.reflect.Method method70 = null;
        java.lang.reflect.Method method71 = null;
        java.beans.PropertyDescriptor propertyDescriptor72 = new java.beans.PropertyDescriptor("(Z)C", method70, method71);
        propertyDescriptor72.setBound(true);
        java.lang.Class<?> wildcardClass75 = propertyDescriptor72.getPropertyType();
        java.lang.Object obj77 = propertyDescriptor72.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method78 = null;
        propertyDescriptor72.setWriteMethod(method78);
        org.mockito.asm.Type type81 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass82 = type81.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray83 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass82);
        java.lang.String str84 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass82);
        org.mockito.cglib.core.ClassInfo classInfo85 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass82);
        org.mockito.asm.Type[] typeArray86 = classInfo85.getInterfaces();
        boolean boolean88 = classInfo85.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray89 = classInfo85.getInterfaces();
        org.mockito.asm.Type type90 = classInfo85.getSuperType();
        propertyDescriptor72.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo85);
        boolean boolean92 = classInfo62.equals((java.lang.Object) propertyDescriptor72);
        org.mockito.asm.Type type94 = org.mockito.asm.Type.getType("B");
        boolean boolean95 = classInfo62.equals((java.lang.Object) type94);
        java.lang.String str96 = classInfo62.toString();
        org.mockito.asm.Type type97 = classInfo62.getSuperType();
        propertyDescriptor9.setValue("", (java.lang.Object) type97);
        java.lang.String str99 = type97.getClassName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        java.lang.String str6 = classInfo4.toString();
        int int7 = classInfo4.getModifiers();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("(Z)C", method9, method10);
        propertyDescriptor11.setBound(true);
        java.lang.Class<?> wildcardClass14 = propertyDescriptor11.getPropertyType();
        java.lang.Object obj16 = propertyDescriptor11.getValue("org.mockito.asm.Type");
        propertyDescriptor11.setShortDescription("D");
        propertyDescriptor11.setExpert(false);
        propertyDescriptor11.setDisplayName("Ljava/lang/Object;");
        boolean boolean23 = classInfo4.equals((java.lang.Object) "Ljava/lang/Object;");
        int int24 = classInfo4.getModifiers();
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        boolean boolean30 = signature27.equals((java.lang.Object) wildcardClass29);
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        boolean boolean35 = classInfo4.equals((java.lang.Object) wildcardClass29);
        org.mockito.asm.Type[] typeArray36 = classInfo4.getInterfaces();
        int int37 = classInfo4.getModifiers();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method39, method40);
        java.lang.reflect.Method method42 = propertyDescriptor41.getReadMethod();
        propertyDescriptor41.setShortDescription("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]; displayName=()Lg/mockito/asm/Type;]");
        propertyDescriptor41.setName("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
        propertyDescriptor41.setPreferred(true);
        java.lang.reflect.Method method49 = propertyDescriptor41.getWriteMethod();
        java.lang.Class<?> wildcardClass50 = propertyDescriptor41.getPropertyType();
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("(Z)C", method53, method54);
        java.util.Enumeration<java.lang.String> strEnumeration56 = propertyDescriptor55.attributeNames();
        boolean boolean57 = propertyDescriptor55.isPreferred();
        java.lang.String str58 = propertyDescriptor55.getName();
        boolean boolean59 = propertyDescriptor55.isExpert();
        propertyDescriptor55.setBound(true);
        propertyDescriptor55.setPreferred(true);
        java.lang.String str64 = propertyDescriptor55.getDisplayName();
        java.lang.reflect.Method method65 = null;
        propertyDescriptor55.setReadMethod(method65);
        propertyDescriptor55.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str69 = propertyDescriptor55.getDisplayName();
        boolean boolean70 = propertyDescriptor55.isExpert();
        propertyDescriptor55.setExpert(false);
        java.lang.String str73 = propertyDescriptor55.getDisplayName();
        propertyDescriptor41.setValue("Ljava.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound];", (java.lang.Object) str73);
        boolean boolean75 = classInfo4.equals((java.lang.Object) "Ljava.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound];");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor55", propertyDescriptor11.equals(propertyDescriptor55) ? propertyDescriptor11.hashCode() == propertyDescriptor55.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode(9);
        int int10 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type0.getElementType();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(157);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]; shortDescription=J; values={org/mockito/asm/Type=char}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]; displayName=()Lg/mockito/asm/Type;]");
        int int2 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = classInfo5.getType();
        int int7 = classInfo5.getModifiers();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("(Z)C", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setHidden(true);
        propertyDescriptor11.setExpert(false);
        boolean boolean17 = classInfo5.equals((java.lang.Object) propertyDescriptor11);
        org.mockito.asm.Type[] typeArray18 = classInfo5.getInterfaces();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=boolean; bound]", method20, method21);
        boolean boolean23 = propertyDescriptor22.isHidden();
        propertyDescriptor22.setShortDescription("()Ljava/lang/Object;");
        boolean boolean26 = classInfo5.equals((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("org.mockito.asm.Type", method28, method29);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor30.setReadMethod(method31);
        boolean boolean33 = propertyDescriptor30.isHidden();
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor22.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        java.lang.String[] strArray37 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass39 = type38.getClass();
        java.lang.String str40 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass39);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, true, true);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray45);
        java.lang.Class[] classArray47 = new java.lang.Class[] {};
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass50 = type49.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass50);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray53, true, true);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray56);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray56);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean61 = type59.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass62 = type59.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass62);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray63, true, true);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray63, false, true);
        java.lang.Class[] classArray70 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray69);
        java.lang.reflect.Method[] methodArray71 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray37, methodArray69);
        java.lang.Class[] classArray72 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray69);
        propertyDescriptor22.setValue("boolean", (java.lang.Object) methodArray69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor30", propertyDescriptor11.equals(propertyDescriptor30) ? propertyDescriptor11.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; org/mockito/asm/TypeD=(Z)C; F=Ljava/lang/Object;; org/mockito/asm/TypeLorg/mockito/asm/Type;=double}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        boolean boolean9 = signature6.equals((java.lang.Object) wildcardClass8);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = type10.getElementType();
        int int12 = type11.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        int int16 = type14.getOpcode(0);
        int int17 = type14.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray24 = classInfo23.getInterfaces();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", type14, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray24);
        int int28 = type11.getOpcode(112);
        java.lang.String str29 = type11.getInternalName();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str33 = signature32.getDescriptor();
        boolean boolean34 = type11.equals((java.lang.Object) signature32);
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("(Z)C", method36, method37);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor38.setValue("org/mockito/asm/Type", (java.lang.Object) signature42);
        java.lang.String str44 = propertyDescriptor38.getDisplayName();
        propertyDescriptor38.setHidden(false);
        propertyDescriptor38.setHidden(false);
        propertyDescriptor38.setName("org/mockito/asm/Type");
        boolean boolean51 = signature32.equals((java.lang.Object) propertyDescriptor38);
        boolean boolean52 = signature3.equals((java.lang.Object) propertyDescriptor38);
        org.mockito.asm.Type type53 = signature3.getReturnType();
        org.mockito.asm.Type type54 = type53.getElementType();
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("double", "");
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str59 = type58.getClassName();
        int int60 = type58.getSort();
        boolean boolean61 = signature57.equals((java.lang.Object) type58);
        java.lang.String str62 = type58.getClassName();
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("(Z)C", method64, method65);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass68 = type67.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass68);
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type73 = classInfo72.getType();
        java.beans.PropertyEditor propertyEditor74 = propertyDescriptor66.createPropertyEditor((java.lang.Object) type73);
        java.lang.String str75 = type73.toString();
        int int76 = type73.getSort();
        java.lang.String str77 = type73.getClassName();
        org.mockito.cglib.core.Signature signature80 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray81 = signature80.getArgumentTypes();
        java.lang.String str82 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray81);
        java.lang.String str83 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray81);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("float", type54, typeArray81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor38 and propertyDescriptor66", propertyDescriptor38.equals(propertyDescriptor66) ? propertyDescriptor38.hashCode() == propertyDescriptor66.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass12 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor26.attributeNames();
        boolean boolean28 = propertyDescriptor26.isPreferred();
        java.lang.String str29 = propertyDescriptor26.getName();
        boolean boolean30 = propertyDescriptor26.isHidden();
        java.lang.Class<?> wildcardClass31 = propertyDescriptor26.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str39 = signature38.toString();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean42 = type40.equals((java.lang.Object) (byte) 0);
        java.lang.String str43 = type40.toString();
        java.lang.String str44 = type40.toString();
        java.lang.String str45 = type40.getClassName();
        boolean boolean46 = signature38.equals((java.lang.Object) str45);
        org.mockito.asm.Type type47 = signature38.getReturnType();
        org.mockito.asm.Type type48 = signature38.getReturnType();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method50, method51);
        propertyDescriptor52.setExpert(false);
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor52.attributeNames();
        java.lang.Class<?> wildcardClass56 = propertyDescriptor52.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        boolean boolean58 = type48.equals((java.lang.Object) wildcardClass56);
        java.lang.Class[] classArray59 = new java.lang.Class[] { wildcardClass1, wildcardClass6, wildcardClass12, wildcardClass31, wildcardClass56 };
        int int60 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor26 and propertyDescriptor52", propertyDescriptor26.equals(propertyDescriptor52) ? propertyDescriptor26.hashCode() == propertyDescriptor52.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; constrained]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("B");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("()Lchar;");
        java.lang.String str4 = type3.getDescriptor();
        boolean boolean5 = type1.equals((java.lang.Object) str4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type1.getDimensions();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.beans.PropertyEditor propertyEditor8 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 104);
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setDisplayName("Z");
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor17.setValue("org/mockito/asm/Type", (java.lang.Object) signature21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        int int31 = classInfo29.getModifiers();
        propertyDescriptor17.setValue("()D", (java.lang.Object) int31);
        propertyDescriptor17.setBound(false);
        java.lang.String str35 = propertyDescriptor17.getShortDescription();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("Ljava/lang/Object;", method38, method39);
        propertyDescriptor40.setBound(true);
        propertyDescriptor40.setExpert(false);
        propertyDescriptor40.setExpert(false);
        propertyDescriptor17.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=()D; expert; bound]", (java.lang.Object) propertyDescriptor40);
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor17);
        boolean boolean49 = propertyDescriptor17.isPreferred();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor40", propertyDescriptor3.equals(propertyDescriptor40) ? propertyDescriptor3.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("org.mockito.asm.Type[]", method1, method2);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method6, method7);
        propertyDescriptor8.setExpert(false);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor14.attributeNames();
        boolean boolean16 = propertyDescriptor14.isPreferred();
        java.lang.Class<?> wildcardClass17 = propertyDescriptor14.getPropertyType();
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor8.createPropertyEditor((java.lang.Object) propertyDescriptor14);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray26, true, true);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray29);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        java.lang.String str35 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, true);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray40);
        propertyDescriptor14.setValue("Ljava/lang/Object;", (java.lang.Object) strArray21);
        propertyDescriptor14.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method46 = propertyDescriptor14.getReadMethod();
        propertyDescriptor14.setHidden(false);
        propertyDescriptor14.setHidden(true);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass52 = type51.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass52);
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass52);
        org.mockito.cglib.core.ClassInfo classInfo55 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass52);
        org.mockito.asm.Type type56 = classInfo55.getSuperType();
        org.mockito.asm.Type type57 = classInfo55.getSuperType();
        org.mockito.asm.Type[] typeArray58 = classInfo55.getInterfaces();
        org.mockito.asm.Type[] typeArray59 = classInfo55.getInterfaces();
        org.mockito.asm.Type type60 = classInfo55.getType();
        java.lang.String str61 = classInfo55.toString();
        java.lang.reflect.Method method63 = null;
        java.lang.reflect.Method method64 = null;
        java.beans.PropertyDescriptor propertyDescriptor65 = new java.beans.PropertyDescriptor("(Z)C", method63, method64);
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor65.setValue("org/mockito/asm/Type", (java.lang.Object) signature69);
        java.lang.String str71 = propertyDescriptor65.getDisplayName();
        boolean boolean72 = propertyDescriptor65.isHidden();
        propertyDescriptor65.setDisplayName("org.mockito.asm.Type");
        propertyDescriptor65.setConstrained(true);
        boolean boolean77 = classInfo55.equals((java.lang.Object) propertyDescriptor65);
        int int78 = classInfo55.getModifiers();
        org.mockito.asm.Type[] typeArray79 = classInfo55.getInterfaces();
        java.beans.PropertyEditor propertyEditor80 = propertyDescriptor14.createPropertyEditor((java.lang.Object) classInfo55);
        propertyDescriptor3.setValue("", (java.lang.Object) classInfo55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor14", propertyDescriptor8.equals(propertyDescriptor14) ? propertyDescriptor8.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Ljava.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; constrained];");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean9 = classInfo5.equals((java.lang.Object) type7);
        int int10 = type7.getSize();
        java.lang.String str11 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type7.getElementType();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        boolean boolean8 = type1.equals((java.lang.Object) type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        int int13 = type11.getOpcode(5);
        java.lang.String str14 = type11.getInternalName();
        java.lang.Class<?> wildcardClass15 = type11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int17 = classInfo16.getModifiers();
        java.lang.String str18 = classInfo16.toString();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method20, method21);
        propertyDescriptor22.setPreferred(false);
        java.lang.String str25 = propertyDescriptor22.getName();
        propertyDescriptor22.setBound(true);
        propertyDescriptor22.setBound(false);
        java.lang.reflect.Method method30 = propertyDescriptor22.getReadMethod();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method33, method34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 0);
        int int40 = type36.getOpcode(100);
        int int41 = type36.getSize();
        int int43 = type36.getOpcode(4);
        int int45 = type36.getOpcode((int) ' ');
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        boolean boolean49 = type46.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass50 = type46.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass50);
        boolean boolean53 = type36.equals((java.lang.Object) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass50);
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor35.createPropertyEditor((java.lang.Object) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        propertyDescriptor22.setValue("L)Lchar;", (java.lang.Object) wildcardClass50);
        java.lang.Class<?> wildcardClass58 = propertyDescriptor22.getPropertyEditorClass();
        java.lang.reflect.Method method59 = propertyDescriptor22.getReadMethod();
        boolean boolean60 = classInfo16.equals((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Method method63 = null;
        java.beans.PropertyDescriptor propertyDescriptor64 = new java.beans.PropertyDescriptor("(Z)C", method62, method63);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor64.setValue("org/mockito/asm/Type", (java.lang.Object) signature68);
        java.lang.String str70 = propertyDescriptor64.getDisplayName();
        propertyDescriptor64.setHidden(false);
        propertyDescriptor64.setHidden(false);
        propertyDescriptor64.setName("org/mockito/asm/Type");
        propertyDescriptor64.setDisplayName("long");
        boolean boolean79 = propertyDescriptor64.isPreferred();
        propertyDescriptor64.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type82 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass83 = type82.getClass();
        java.beans.PropertyEditor propertyEditor84 = propertyDescriptor64.createPropertyEditor((java.lang.Object) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray85 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray87 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass83);
        boolean boolean88 = classInfo16.equals((java.lang.Object) propertyDescriptorArray87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor35", propertyDescriptor22.equals(propertyDescriptor35) ? propertyDescriptor22.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.getClassName();
        java.lang.String str8 = type0.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type11.getOpcode(0);
        int int14 = type11.getSort();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("", type11, typeArray21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType("D");
        int int25 = type24.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean28 = type26.equals((java.lang.Object) (byte) 0);
        int int30 = type26.getOpcode(100);
        int int31 = type26.getSize();
        int int33 = type26.getOpcode(4);
        int int35 = type26.getOpcode((int) ' ');
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] {};
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray38);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray38);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", type11, typeArray38);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = type0.getInternalName();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.Class<?> wildcardClass53 = propertyDescriptor9.getClass();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type1.getSize();
        int int3 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray10 = classInfo9.getInterfaces();
        java.lang.String str11 = classInfo9.toString();
        org.mockito.asm.Type[] typeArray12 = classInfo9.getInterfaces();
        int int13 = classInfo9.getModifiers();
        int int14 = classInfo9.getModifiers();
        int int15 = classInfo9.getModifiers();
        org.mockito.asm.Type[] typeArray16 = classInfo9.getInterfaces();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("java/lang/Object", type1, typeArray16);
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray21 = signature20.getArgumentTypes();
        org.mockito.asm.Type[] typeArray22 = signature20.getArgumentTypes();
        boolean boolean23 = type1.equals((java.lang.Object) typeArray22);
        int int25 = type1.getOpcode(46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type1.getDimensions();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        boolean boolean11 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]");
        java.lang.String str14 = propertyDescriptor3.getShortDescription();
        boolean boolean15 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("(Z)C", method19, method20);
        boolean boolean22 = propertyDescriptor21.isPreferred();
        java.lang.reflect.Method method23 = propertyDescriptor21.getWriteMethod();
        boolean boolean24 = propertyDescriptor21.isPreferred();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method27, method28);
        propertyDescriptor29.setExpert(false);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass34 = type33.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass34);
        propertyDescriptor29.setValue("java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]", (java.lang.Object) wildcardClass34);
        propertyDescriptor21.setValue("long", (java.lang.Object) propertyDescriptor29);
        boolean boolean38 = propertyDescriptor21.isExpert();
        java.beans.PropertyEditor propertyEditor39 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor21 and propertyDescriptor29", propertyDescriptor21.equals(propertyDescriptor29) ? propertyDescriptor21.hashCode() == propertyDescriptor29.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int6 = type0.getOpcode(23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(128);
        int int5 = type0.getSize();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.lang.String str12 = classInfo11.toString();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        org.mockito.asm.Type[] typeArray14 = classInfo11.getInterfaces();
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type0.getElementType();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSort();
        java.lang.String str2 = type0.toString();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int4 = type0.getOpcode((int) (byte) 1);
        int int5 = type0.getSort();
        java.lang.String str6 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int2 = type0.getOpcode(157);
        int int4 = type0.getOpcode(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("mockito/asm/Type", "java.beans.PropertyDescriptor[name=(Z)C; shortDescription=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; constrained]");
        java.lang.String str4 = signature3.getName();
        java.lang.String str5 = signature3.getDescriptor();
        java.lang.String str6 = signature3.toString();
        org.mockito.asm.Type type7 = signature3.getReturnType();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; hidden; bound]");
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        boolean boolean15 = signature12.equals((java.lang.Object) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.lang.String str19 = type18.getClassName();
        org.mockito.asm.Type type20 = type18.getElementType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean23 = type21.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type29 = classInfo28.getSuperType();
        org.mockito.asm.Type type30 = classInfo28.getSuperType();
        org.mockito.asm.Type[] typeArray31 = classInfo28.getInterfaces();
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray31);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray31);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray31);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/TypeD;", type7, typeArray31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type7.getDimensions();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.getClassName();
        java.lang.String str8 = type0.getDescriptor();
        java.lang.String str9 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("[Lorg/mockito/asm/Type;", "LC;");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.String str10 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type13 = classInfo12.getType();
        java.beans.PropertyEditor propertyEditor14 = propertyDescriptor6.createPropertyEditor((java.lang.Object) type13);
        java.lang.reflect.Method method15 = null;
        propertyDescriptor6.setWriteMethod(method15);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method19, method20);
        propertyDescriptor21.setExpert(false);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("(Z)C", method25, method26);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor27.attributeNames();
        boolean boolean29 = propertyDescriptor27.isPreferred();
        java.lang.Class<?> wildcardClass30 = propertyDescriptor27.getPropertyType();
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor21.createPropertyEditor((java.lang.Object) propertyDescriptor27);
        propertyDescriptor6.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor21);
        propertyDescriptor21.setExpert(false);
        boolean boolean35 = signature2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor21", propertyDescriptor6.equals(propertyDescriptor21) ? propertyDescriptor6.hashCode() == propertyDescriptor21.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        org.mockito.asm.Type type9 = classInfo4.getType();
        java.lang.String str10 = classInfo4.toString();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        boolean boolean15 = propertyDescriptor14.isPreferred();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        boolean boolean17 = classInfo4.equals((java.lang.Object) method16);
        boolean boolean19 = classInfo4.equals((java.lang.Object) 0.0d);
        org.mockito.asm.Type type20 = classInfo4.getType();
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor24.setValue("org/mockito/asm/Type", (java.lang.Object) signature28);
        java.lang.String str30 = propertyDescriptor24.getDisplayName();
        propertyDescriptor24.setHidden(false);
        propertyDescriptor24.setHidden(false);
        propertyDescriptor24.setName("org/mockito/asm/Type");
        propertyDescriptor24.setDisplayName("long");
        boolean boolean39 = propertyDescriptor24.isPreferred();
        propertyDescriptor24.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        java.lang.Class<?> wildcardClass42 = propertyDescriptor24.getPropertyType();
        java.lang.Object obj43 = null;
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor24.createPropertyEditor(obj43);
        propertyDescriptor24.setName("java.beans.PropertyDescriptor[name=(Z)C; displayName=java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]; bound; propertyEditorClass=class org.mockito.asm.Type]");
        propertyDescriptor24.setName("java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]org/mockito/asm/TypeD");
        boolean boolean49 = type20.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; values={org/mockito/asm/Type=char}]org/mockito/asm/TypeD");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor24", propertyDescriptor14.equals(propertyDescriptor24) ? propertyDescriptor14.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getDescriptor();
        boolean boolean4 = type1.equals((java.lang.Object) (-1));
        java.lang.String str5 = type1.getClassName();
        int int7 = type1.getOpcode(10);
        int int9 = type1.getOpcode((int) ' ');
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        boolean boolean15 = signature12.equals((java.lang.Object) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type17 = type16.getElementType();
        boolean boolean19 = type16.equals((java.lang.Object) 128);
        org.mockito.asm.Type[] typeArray21 = org.mockito.asm.Type.getArgumentTypes("()C");
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray21);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray21);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("Lava/lang/Object;", type1, typeArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = type1.getInternalName();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getClassName();
        boolean boolean4 = type0.equals((java.lang.Object) type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type1.getInternalName();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Lrg.mockito.asm.Type[]java.beans.PropertyDescriptor[name=(Z)C;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = signature12.getName();
        java.lang.String str14 = signature12.getName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type20 = classInfo19.getSuperType();
        org.mockito.asm.Type type21 = classInfo19.getSuperType();
        org.mockito.asm.Type[] typeArray22 = classInfo19.getInterfaces();
        org.mockito.asm.Type[] typeArray23 = classInfo19.getInterfaces();
        java.lang.Class<?> wildcardClass24 = typeArray23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray26);
        boolean boolean28 = signature12.equals((java.lang.Object) classArray27);
        java.lang.String str29 = signature12.toString();
        org.mockito.asm.Type type30 = signature12.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = type30.getInternalName();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor57.setValue("org/mockito/asm/Type", (java.lang.Object) signature61);
        java.lang.String str63 = propertyDescriptor57.getDisplayName();
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setName("org/mockito/asm/Type");
        propertyDescriptor57.setDisplayName("long");
        boolean boolean72 = propertyDescriptor57.isPreferred();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor57.getPropertyType();
        java.lang.String str74 = propertyDescriptor57.getDisplayName();
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", (java.lang.Object) propertyDescriptor57);
        propertyDescriptor57.setExpert(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Ljava.beans.PropertyDescriptor[name=(Z)C; shortDescription=Lorg/mockito/asm/Type;; values={()Lg/mockito/asm/Type;=org.mockito.asm.Type}; bound];");
        int int3 = type1.getOpcode(140);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(96);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type[] typeArray10 = signature8.getArgumentTypes();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("double", type1, typeArray10);
        java.lang.String str12 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type1.getElementType();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setShortDescription("Lchar;");
        java.lang.reflect.Method method13 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setName("[Lorg/mockito/asm/Type;");
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor3.setDisplayName("C");
        java.lang.Object obj21 = propertyDescriptor3.getValue("()L)Lchar;");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor26.attributeNames();
        boolean boolean28 = propertyDescriptor26.isPreferred();
        java.lang.String str29 = propertyDescriptor26.getName();
        boolean boolean30 = propertyDescriptor26.isExpert();
        propertyDescriptor26.setBound(true);
        propertyDescriptor26.setShortDescription("Z");
        java.lang.reflect.Method method35 = null;
        propertyDescriptor26.setWriteMethod(method35);
        propertyDescriptor26.setShortDescription("Ljava/lang/Object;");
        java.lang.reflect.Method method39 = null;
        propertyDescriptor26.setReadMethod(method39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass43 = type42.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass43);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type47 = classInfo46.getSuperType();
        org.mockito.asm.Type type48 = classInfo46.getSuperType();
        java.lang.Class<?> wildcardClass49 = type48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass49);
        propertyDescriptor26.setValue("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; constrained]; values={char=java.beans.PropertyDescriptor[name=(Z)C; bound]; org/mockito/asm/TypeLorg/mockito/asm/Type;=10.0}; bound]", (java.lang.Object) wildcardClass49);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; hidden; values={()D=org.mockito.asm.Type; org/mockito/asm/TypeLorg/mockito/asm/Type;=10.0}; bound]", (java.lang.Object) wildcardClass49);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor26", propertyDescriptor3.equals(propertyDescriptor26) ? propertyDescriptor3.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, true);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray10);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray22);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray22);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray25);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(0);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = classInfo5.getType();
        int int7 = classInfo5.getModifiers();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("(Z)C", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setHidden(true);
        propertyDescriptor11.setExpert(false);
        boolean boolean17 = classInfo5.equals((java.lang.Object) propertyDescriptor11);
        org.mockito.asm.Type[] typeArray18 = classInfo5.getInterfaces();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=boolean; bound]", method20, method21);
        boolean boolean23 = propertyDescriptor22.isHidden();
        propertyDescriptor22.setShortDescription("()Ljava/lang/Object;");
        boolean boolean26 = classInfo5.equals((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("org.mockito.asm.Type", method28, method29);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor30.setReadMethod(method31);
        boolean boolean33 = propertyDescriptor30.isHidden();
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor22.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        propertyDescriptor30.setName("va.beans.PropertyDescriptor[name=(Z)C");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor22", propertyDescriptor11.equals(propertyDescriptor22) ? propertyDescriptor11.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setExpert(false);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass16);
        java.lang.String str19 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method22 = null;
        propertyDescriptor3.setReadMethod(method22);
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("(Z)C", method25, method26);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor27.attributeNames();
        propertyDescriptor27.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor27.setBound(true);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("(Z)C", method35, method36);
        propertyDescriptor37.setBound(true);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor37.getPropertyType();
        java.lang.Object obj42 = propertyDescriptor37.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method43 = null;
        propertyDescriptor37.setWriteMethod(method43);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass47 = type46.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass47);
        java.lang.String str49 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass47);
        org.mockito.cglib.core.ClassInfo classInfo50 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type[] typeArray51 = classInfo50.getInterfaces();
        boolean boolean53 = classInfo50.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray54 = classInfo50.getInterfaces();
        org.mockito.asm.Type type55 = classInfo50.getSuperType();
        propertyDescriptor37.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo50);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str58 = type57.getDescriptor();
        org.mockito.asm.Type[] typeArray59 = new org.mockito.asm.Type[] {};
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type57, typeArray59);
        boolean boolean61 = classInfo50.equals((java.lang.Object) type57);
        propertyDescriptor27.setValue("F", (java.lang.Object) classInfo50);
        propertyDescriptor27.setConstrained(false);
        boolean boolean65 = propertyDescriptor3.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor27 and propertyDescriptor37", propertyDescriptor27.equals(propertyDescriptor37) ? propertyDescriptor27.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        org.mockito.asm.Type type9 = classInfo4.getType();
        java.lang.String str10 = classInfo4.toString();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        boolean boolean15 = propertyDescriptor14.isPreferred();
        java.lang.reflect.Method method16 = propertyDescriptor14.getWriteMethod();
        boolean boolean17 = classInfo4.equals((java.lang.Object) method16);
        boolean boolean19 = classInfo4.equals((java.lang.Object) 0.0d);
        org.mockito.asm.Type type20 = classInfo4.getType();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = null;
        java.beans.PropertyDescriptor propertyDescriptor27 = new java.beans.PropertyDescriptor("(Z)C", method25, method26);
        java.util.Enumeration<java.lang.String> strEnumeration28 = propertyDescriptor27.attributeNames();
        boolean boolean29 = propertyDescriptor27.isPreferred();
        java.lang.String str30 = propertyDescriptor27.getName();
        boolean boolean31 = propertyDescriptor27.isExpert();
        propertyDescriptor27.setBound(true);
        propertyDescriptor27.setPreferred(true);
        boolean boolean36 = signature23.equals((java.lang.Object) propertyDescriptor27);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("(Z)C", method38, method39);
        java.util.Enumeration<java.lang.String> strEnumeration41 = propertyDescriptor40.attributeNames();
        boolean boolean42 = propertyDescriptor40.isPreferred();
        java.lang.String str43 = propertyDescriptor40.getName();
        boolean boolean44 = propertyDescriptor40.isExpert();
        propertyDescriptor40.setBound(true);
        propertyDescriptor40.setPreferred(true);
        java.lang.String str49 = propertyDescriptor40.getDisplayName();
        java.lang.reflect.Method method50 = null;
        propertyDescriptor40.setReadMethod(method50);
        propertyDescriptor40.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str54 = propertyDescriptor40.getDisplayName();
        boolean boolean55 = propertyDescriptor40.isExpert();
        propertyDescriptor40.setExpert(true);
        java.beans.PropertyEditor propertyEditor58 = propertyDescriptor27.createPropertyEditor((java.lang.Object) true);
        java.lang.Object obj60 = propertyDescriptor27.getValue("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor27.setHidden(true);
        boolean boolean63 = classInfo4.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor27 and propertyDescriptor40", propertyDescriptor27.equals(propertyDescriptor40) ? propertyDescriptor27.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Lchar;; hidden; bound]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor15.setValue("org/mockito/asm/Type", (java.lang.Object) signature19);
        java.lang.String str21 = propertyDescriptor15.getDisplayName();
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setName("org/mockito/asm/Type");
        propertyDescriptor15.setDisplayName("long");
        boolean boolean30 = propertyDescriptor15.isPreferred();
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("(Z)C", method32, method33);
        propertyDescriptor34.setBound(true);
        java.lang.Class<?> wildcardClass37 = propertyDescriptor34.getPropertyType();
        boolean boolean38 = propertyDescriptor34.isExpert();
        propertyDescriptor34.setValue("org/mockito/asm/TypeLorg/mockito/asm/Type;", (java.lang.Object) 10.0d);
        java.beans.PropertyEditor propertyEditor42 = propertyDescriptor15.createPropertyEditor((java.lang.Object) propertyDescriptor34);
        boolean boolean43 = type11.equals((java.lang.Object) propertyDescriptor15);
        java.lang.String str44 = type11.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor15", propertyDescriptor3.equals(propertyDescriptor15) ? propertyDescriptor3.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean9 = classInfo5.equals((java.lang.Object) type7);
        java.lang.String str10 = type7.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = type7.getElementType();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType("D");
        int int6 = type5.getSort();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean9 = type7.equals((java.lang.Object) (byte) 0);
        int int11 = type7.getOpcode(100);
        int int12 = type7.getSize();
        int int14 = type7.getOpcode(4);
        int int16 = type7.getOpcode((int) ' ');
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] {};
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray19);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray19);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray29 = signature28.getArgumentTypes();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("mockito/asm/Type", type25, typeArray29);
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("", type1, typeArray29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type32 = type1.getElementType();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setWriteMethod(method12);
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method16, method17);
        propertyDescriptor18.setExpert(false);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("(Z)C", method22, method23);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor24.attributeNames();
        boolean boolean26 = propertyDescriptor24.isPreferred();
        java.lang.Class<?> wildcardClass27 = propertyDescriptor24.getPropertyType();
        java.beans.PropertyEditor propertyEditor28 = propertyDescriptor18.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", (java.lang.Object) propertyDescriptor18);
        boolean boolean30 = propertyDescriptor3.isExpert();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor24", propertyDescriptor18.equals(propertyDescriptor24) ? propertyDescriptor18.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray2);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass13 = type12.getClass();
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray15 = new java.lang.Class[] { wildcardClass7, wildcardClass9, wildcardClass13 };
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.Class[] classArray25 = new java.lang.Class[] {};
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray35);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray22);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray39);
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray43 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray43);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray44);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray46);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        propertyDescriptor9.setShortDescription("()D");
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("(Z)C", method55, method56);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor57.setValue("org/mockito/asm/Type", (java.lang.Object) signature61);
        java.lang.String str63 = propertyDescriptor57.getDisplayName();
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setHidden(false);
        propertyDescriptor57.setName("org/mockito/asm/Type");
        propertyDescriptor57.setDisplayName("long");
        boolean boolean72 = propertyDescriptor57.isPreferred();
        java.lang.Class<?> wildcardClass73 = propertyDescriptor57.getPropertyType();
        java.lang.String str74 = propertyDescriptor57.getDisplayName();
        propertyDescriptor9.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", (java.lang.Object) propertyDescriptor57);
        boolean boolean76 = propertyDescriptor9.isHidden();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor57", propertyDescriptor3.equals(propertyDescriptor57) ? propertyDescriptor3.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        int int17 = classInfo15.getModifiers();
        propertyDescriptor3.setValue("()D", (java.lang.Object) int17);
        java.lang.Object obj20 = propertyDescriptor3.getValue("(Z)C");
        java.lang.reflect.Method method21 = null;
        propertyDescriptor3.setWriteMethod(method21);
        propertyDescriptor3.setName("C");
        boolean boolean25 = propertyDescriptor3.isHidden();
        boolean boolean26 = propertyDescriptor3.isPreferred();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str31 = signature30.getName();
        java.lang.String str32 = signature30.getDescriptor();
        java.lang.String str33 = signature30.toString();
        org.mockito.asm.Type type34 = signature30.getReturnType();
        java.lang.String str35 = signature30.toString();
        java.lang.String str36 = signature30.getName();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; bound]", (java.lang.Object) signature30);
        java.lang.String str38 = signature30.toString();
        org.mockito.asm.Type type39 = signature30.getReturnType();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]", method41, method42);
        java.lang.reflect.Method method44 = propertyDescriptor43.getWriteMethod();
        propertyDescriptor43.setExpert(true);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass48 = type47.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.String str50 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass48);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type52 = classInfo51.getSuperType();
        org.mockito.asm.Type type53 = classInfo51.getSuperType();
        java.lang.Class<?> wildcardClass54 = type53.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass54);
        java.beans.PropertyEditor propertyEditor58 = propertyDescriptor43.createPropertyEditor((java.lang.Object) propertyDescriptorArray57);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
        propertyDescriptor43.setValue("", (java.lang.Object) type61);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type66 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass67 = type66.getClass();
        boolean boolean68 = signature65.equals((java.lang.Object) wildcardClass67);
        java.lang.String str69 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass67);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass67);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass67);
        java.lang.String str72 = type71.getClassName();
        org.mockito.asm.Type type73 = type71.getElementType();
        int int75 = type73.getOpcode((int) '4');
        org.mockito.asm.Type type76 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass77 = type76.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray78 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass77);
        java.lang.String str79 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass77);
        org.mockito.cglib.core.ClassInfo classInfo80 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass77);
        org.mockito.asm.Type[] typeArray81 = classInfo80.getInterfaces();
        boolean boolean83 = classInfo80.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray84 = classInfo80.getInterfaces();
        org.mockito.asm.Type type85 = classInfo80.getSuperType();
        java.lang.String str86 = classInfo80.toString();
        org.mockito.asm.Type[] typeArray87 = classInfo80.getInterfaces();
        java.lang.String str88 = org.mockito.asm.Type.getMethodDescriptor(type73, typeArray87);
        java.lang.String str89 = org.mockito.asm.Type.getMethodDescriptor(type61, typeArray87);
        java.lang.String str90 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor43", propertyDescriptor3.equals(propertyDescriptor43) ? propertyDescriptor3.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; displayName=java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]; bound; propertyEditorClass=class org.mockito.asm.Type]");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int4 = type2.getOpcode(0);
        int int5 = type2.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type2, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType("D");
        int int16 = type15.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        int int21 = type17.getOpcode(100);
        int int22 = type17.getSize();
        int int24 = type17.getOpcode(4);
        int int26 = type17.getOpcode((int) ' ');
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", type2, typeArray29);
        java.lang.String str34 = type2.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = type2.getElementType();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = signature2.toString();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor9.setValue("org/mockito/asm/Type", (java.lang.Object) signature13);
        java.lang.String str15 = propertyDescriptor9.getDisplayName();
        propertyDescriptor9.setHidden(false);
        propertyDescriptor9.setHidden(false);
        propertyDescriptor9.setName("org/mockito/asm/Type");
        propertyDescriptor9.setDisplayName("long");
        boolean boolean24 = propertyDescriptor9.isPreferred();
        propertyDescriptor9.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass28 = type27.getClass();
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor9.createPropertyEditor((java.lang.Object) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, false, true);
        boolean boolean35 = signature2.equals((java.lang.Object) methodArray34);
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("(Z)C", method37, method38);
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor39.setValue("org/mockito/asm/Type", (java.lang.Object) signature43);
        java.lang.String str45 = propertyDescriptor39.getDisplayName();
        boolean boolean46 = propertyDescriptor39.isHidden();
        propertyDescriptor39.setDisplayName("org.mockito.asm.Type");
        java.util.Enumeration<java.lang.String> strEnumeration49 = propertyDescriptor39.attributeNames();
        propertyDescriptor39.setExpert(true);
        java.lang.reflect.Method method52 = propertyDescriptor39.getReadMethod();
        java.lang.reflect.Method method53 = null;
        propertyDescriptor39.setReadMethod(method53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str56 = type55.getClassName();
        int int57 = type55.getSort();
        java.lang.Class<?> wildcardClass58 = type55.getClass();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type61 = type60.getElementType();
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor39.createPropertyEditor((java.lang.Object) type61);
        boolean boolean63 = signature2.equals((java.lang.Object) propertyEditor62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor39", propertyDescriptor9.equals(propertyDescriptor39) ? propertyDescriptor9.hashCode() == propertyDescriptor39.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, false, true);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray24);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj15 = propertyDescriptor3.getValue("()D");
        java.lang.String str16 = propertyDescriptor3.getDisplayName();
        java.lang.String str17 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=org/mockito/asm/Type; displayName=long; hidden; values={org/mockito/asm/Type=char}]");
        propertyDescriptor3.setName("");
        java.lang.reflect.Method method23 = null;
        java.lang.reflect.Method method24 = null;
        java.beans.PropertyDescriptor propertyDescriptor25 = new java.beans.PropertyDescriptor("(Z)C", method23, method24);
        java.util.Enumeration<java.lang.String> strEnumeration26 = propertyDescriptor25.attributeNames();
        boolean boolean27 = propertyDescriptor25.isPreferred();
        java.lang.String str28 = propertyDescriptor25.getName();
        boolean boolean29 = propertyDescriptor25.isExpert();
        propertyDescriptor25.setBound(true);
        propertyDescriptor25.setShortDescription("Z");
        boolean boolean34 = propertyDescriptor25.isHidden();
        propertyDescriptor25.setBound(false);
        java.lang.reflect.Method method37 = null;
        propertyDescriptor25.setReadMethod(method37);
        java.lang.Class<?> wildcardClass39 = propertyDescriptor25.getPropertyType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass41 = type40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass41);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type[] typeArray45 = classInfo44.getInterfaces();
        boolean boolean47 = classInfo44.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray48 = classInfo44.getInterfaces();
        org.mockito.asm.Type type49 = classInfo44.getSuperType();
        org.mockito.asm.Type type50 = classInfo44.getType();
        int int51 = classInfo44.getModifiers();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass53 = type52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass53);
        java.lang.String str55 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass53);
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type type57 = classInfo56.getSuperType();
        org.mockito.asm.Type type58 = classInfo56.getSuperType();
        org.mockito.asm.Type[] typeArray59 = classInfo56.getInterfaces();
        org.mockito.asm.Type[] typeArray60 = classInfo56.getInterfaces();
        java.lang.Class<?> wildcardClass61 = typeArray60.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass61);
        boolean boolean64 = classInfo44.equals((java.lang.Object) wildcardClass61);
        org.mockito.asm.Type type65 = classInfo44.getType();
        java.beans.PropertyEditor propertyEditor66 = propertyDescriptor25.createPropertyEditor((java.lang.Object) type65);
        org.mockito.asm.Type type67 = type65.getElementType();
        java.beans.PropertyEditor propertyEditor68 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type67);
        java.lang.String str69 = type67.getClassName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor25", propertyDescriptor3.equals(propertyDescriptor25) ? propertyDescriptor3.hashCode() == propertyDescriptor25.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setExpert(false);
        propertyDescriptor3.setName("double");
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor14.setValue("org/mockito/asm/Type", (java.lang.Object) signature18);
        java.lang.String str20 = signature18.getName();
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature18);
        java.lang.String str22 = signature18.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor14", propertyDescriptor3.equals(propertyDescriptor14) ? propertyDescriptor3.hashCode() == propertyDescriptor14.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = type1.getClassName();
        int int14 = type1.getSize();
        java.lang.String str15 = type1.toString();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("()Lg/mockito/asm/Type;");
        java.lang.String str21 = type20.getInternalName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type27 = classInfo26.getSuperType();
        org.mockito.asm.Type type28 = classInfo26.getSuperType();
        org.mockito.asm.Type type29 = classInfo26.getSuperType();
        org.mockito.asm.Type[] typeArray30 = classInfo26.getInterfaces();
        org.mockito.asm.Type[] typeArray31 = classInfo26.getInterfaces();
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", type20, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray31);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray31);
        java.lang.String str35 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = type1.getInternalName();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        int int13 = type1.getSort();
        java.lang.String str14 = type1.getDescriptor();
        java.lang.String str15 = type1.toString();
        int int16 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type1.getInternalName();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        boolean boolean10 = classInfo5.equals((java.lang.Object) wildcardClass8);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        int int13 = type11.getOpcode(5);
        java.lang.String str14 = type11.getInternalName();
        java.lang.Class<?> wildcardClass15 = type11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int17 = classInfo16.getModifiers();
        java.lang.String str18 = classInfo16.toString();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method20, method21);
        propertyDescriptor22.setPreferred(false);
        java.lang.String str25 = propertyDescriptor22.getName();
        propertyDescriptor22.setBound(true);
        propertyDescriptor22.setBound(false);
        java.lang.reflect.Method method30 = propertyDescriptor22.getReadMethod();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method33, method34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean38 = type36.equals((java.lang.Object) (byte) 0);
        int int40 = type36.getOpcode(100);
        int int41 = type36.getSize();
        int int43 = type36.getOpcode(4);
        int int45 = type36.getOpcode((int) ' ');
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        boolean boolean49 = type46.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass50 = type46.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass50);
        boolean boolean53 = type36.equals((java.lang.Object) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass50);
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor35.createPropertyEditor((java.lang.Object) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        propertyDescriptor22.setValue("L)Lchar;", (java.lang.Object) wildcardClass50);
        java.lang.Class<?> wildcardClass58 = propertyDescriptor22.getPropertyEditorClass();
        java.lang.reflect.Method method59 = propertyDescriptor22.getReadMethod();
        boolean boolean60 = classInfo16.equals((java.lang.Object) propertyDescriptor22);
        org.mockito.asm.Type type61 = classInfo16.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor22 and propertyDescriptor35", propertyDescriptor22.equals(propertyDescriptor35) ? propertyDescriptor22.hashCode() == propertyDescriptor35.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("Ljava/beans/PropertyDescriptor;");
        java.util.Enumeration<java.lang.String> strEnumeration8 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method11, method12);
        propertyDescriptor13.setDisplayName("java.beans.PropertyDescriptor[name=boolean; bound]");
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.String str20 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray23 = classInfo22.getInterfaces();
        org.mockito.asm.Type type24 = classInfo22.getType();
        org.mockito.asm.Type type25 = classInfo22.getSuperType();
        propertyDescriptor13.setValue("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]", (java.lang.Object) classInfo22);
        int int27 = classInfo22.getModifiers();
        org.mockito.asm.Type type28 = classInfo22.getSuperType();
        propertyDescriptor3.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo22);
        org.mockito.asm.Type type30 = classInfo22.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor13", propertyDescriptor3.equals(propertyDescriptor13) ? propertyDescriptor3.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setExpert(false);
        java.lang.Object obj14 = propertyDescriptor3.getValue("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]");
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("(Z)C", method16, method17);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type25 = classInfo24.getType();
        java.beans.PropertyEditor propertyEditor26 = propertyDescriptor18.createPropertyEditor((java.lang.Object) type25);
        java.lang.String str27 = type25.toString();
        org.mockito.asm.Type type28 = type25.getElementType();
        org.mockito.asm.Type type29 = type28.getElementType();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type28);
        int int32 = type28.getOpcode(100);
        int int33 = type28.getDimensions();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]]", method35, method36);
        java.lang.reflect.Method method38 = propertyDescriptor37.getWriteMethod();
        propertyDescriptor37.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()Z=D}; propertyEditorClass=class org.mockito.asm.Type]");
        propertyDescriptor37.setName("Lg/mockito/asm/Type;");
        boolean boolean43 = type28.equals((java.lang.Object) propertyDescriptor37);
        org.mockito.asm.Type type44 = type28.getElementType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor18 and propertyDescriptor37", propertyDescriptor18.equals(propertyDescriptor37) ? propertyDescriptor18.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = classInfo9.getType();
        java.beans.PropertyEditor propertyEditor11 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type10);
        java.lang.String str12 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("(Z)C", method17, method18);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor19.attributeNames();
        boolean boolean21 = propertyDescriptor19.isPreferred();
        java.lang.reflect.Method method22 = null;
        propertyDescriptor19.setWriteMethod(method22);
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor19.attributeNames();
        propertyDescriptor19.setValue("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", (java.lang.Object) "java/beans/PropertyDescriptor");
        boolean boolean28 = propertyDescriptor19.isPreferred();
        propertyDescriptor19.setDisplayName("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; constrained]; preferred; expert; bound]");
        propertyDescriptor19.setExpert(false);
        propertyDescriptor3.setValue("org.mockito.cglib.core.Signature", (java.lang.Object) propertyDescriptor19);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str37 = signature36.getName();
        java.lang.String str38 = signature36.getName();
        java.lang.String str39 = signature36.toString();
        java.lang.String str40 = signature36.toString();
        java.lang.String str41 = signature36.toString();
        java.lang.String str42 = signature36.toString();
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass50 = type49.getClass();
        boolean boolean51 = signature48.equals((java.lang.Object) wildcardClass50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type53 = type52.getElementType();
        int int54 = type53.getSort();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.CHAR_TYPE;
        int int58 = type56.getOpcode(0);
        int int59 = type56.getSort();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass61 = type60.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass61);
        java.lang.String str63 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass61);
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass61);
        org.mockito.cglib.core.ClassInfo classInfo65 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass61);
        org.mockito.asm.Type[] typeArray66 = classInfo65.getInterfaces();
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("", type56, typeArray66);
        java.lang.String str68 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray66);
        int int70 = type53.getOpcode(112);
        java.lang.String str71 = type53.getInternalName();
        org.mockito.cglib.core.Signature signature74 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str75 = signature74.getDescriptor();
        boolean boolean76 = type53.equals((java.lang.Object) signature74);
        java.lang.reflect.Method method78 = null;
        java.lang.reflect.Method method79 = null;
        java.beans.PropertyDescriptor propertyDescriptor80 = new java.beans.PropertyDescriptor("(Z)C", method78, method79);
        org.mockito.cglib.core.Signature signature84 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor80.setValue("org/mockito/asm/Type", (java.lang.Object) signature84);
        java.lang.String str86 = propertyDescriptor80.getDisplayName();
        propertyDescriptor80.setHidden(false);
        propertyDescriptor80.setHidden(false);
        propertyDescriptor80.setName("org/mockito/asm/Type");
        boolean boolean93 = signature74.equals((java.lang.Object) propertyDescriptor80);
        boolean boolean94 = signature45.equals((java.lang.Object) propertyDescriptor80);
        java.lang.String str95 = signature45.getName();
        boolean boolean96 = signature36.equals((java.lang.Object) signature45);
        java.lang.String str97 = signature45.toString();
        java.lang.String str98 = signature45.getName();
        java.beans.PropertyEditor propertyEditor99 = propertyDescriptor19.createPropertyEditor((java.lang.Object) str98);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor80", propertyDescriptor3.equals(propertyDescriptor80) ? propertyDescriptor3.hashCode() == propertyDescriptor80.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setExpert(true);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("(Z)C", method18, method19);
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor20.setValue("org/mockito/asm/Type", (java.lang.Object) signature24);
        java.lang.String str26 = propertyDescriptor20.getDisplayName();
        propertyDescriptor20.setHidden(false);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.String str33 = signature32.getName();
        propertyDescriptor20.setValue("F", (java.lang.Object) str33);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("double", "");
        java.lang.String str39 = signature38.toString();
        propertyDescriptor20.setValue("org/mockito/asm/TypeLorg/mockito/asm/Type;", (java.lang.Object) signature38);
        java.lang.reflect.Method method43 = null;
        java.lang.reflect.Method method44 = null;
        java.beans.PropertyDescriptor propertyDescriptor45 = new java.beans.PropertyDescriptor("(Z)C", method43, method44);
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor45.setValue("org/mockito/asm/Type", (java.lang.Object) signature49);
        java.lang.String str51 = propertyDescriptor45.getDisplayName();
        boolean boolean52 = propertyDescriptor45.isHidden();
        propertyDescriptor45.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor45.attributeNames();
        java.lang.String str56 = propertyDescriptor45.getDisplayName();
        propertyDescriptor20.setValue("org/mockito/asm/TypeD", (java.lang.Object) str56);
        java.lang.reflect.Method method58 = null;
        propertyDescriptor20.setWriteMethod(method58);
        propertyDescriptor20.setName("Lmockito/asm/Type;");
        propertyDescriptor20.setHidden(true);
        propertyDescriptor20.setName("");
        propertyDescriptor20.setBound(false);
        java.beans.PropertyEditor propertyEditor68 = propertyDescriptor3.createPropertyEditor((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor20 and propertyDescriptor45", propertyDescriptor20.equals(propertyDescriptor45) ? propertyDescriptor20.hashCode() == propertyDescriptor45.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        int int18 = classInfo17.getModifiers();
        java.lang.String str19 = classInfo17.toString();
        org.mockito.asm.Type type20 = classInfo17.getSuperType();
        org.mockito.asm.Type type21 = classInfo17.getSuperType();
        org.mockito.asm.Type[] typeArray22 = classInfo17.getInterfaces();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray31 = classInfo30.getInterfaces();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass33);
        boolean boolean35 = classInfo30.equals((java.lang.Object) wildcardClass33);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        int int38 = type36.getOpcode(2);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str41 = type40.getClassName();
        int int42 = type40.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType("D");
        int int45 = type44.getSort();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean48 = type46.equals((java.lang.Object) (byte) 0);
        int int50 = type46.getOpcode(100);
        int int51 = type46.getSize();
        int int53 = type46.getOpcode(4);
        int int55 = type46.getOpcode((int) ' ');
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str57 = type56.getDescriptor();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] {};
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type56, typeArray58);
        java.lang.String str60 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray58);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray58);
        java.lang.String str62 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray58);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray68 = signature67.getArgumentTypes();
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("mockito/asm/Type", type64, typeArray68);
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", type40, typeArray68);
        org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("[Ljava/beans/PropertyDescriptor;", type36, typeArray68);
        java.lang.String str72 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int73 = type1.getDimensions();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = signature12.getName();
        java.lang.String str14 = signature12.getDescriptor();
        org.mockito.asm.Type type15 = signature12.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type15.getElementType();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(true);
        boolean boolean7 = propertyDescriptor3.isExpert();
        boolean boolean8 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("(Z)C", method14, method15);
        java.util.Enumeration<java.lang.String> strEnumeration17 = propertyDescriptor16.attributeNames();
        propertyDescriptor16.setName("Lorg/mockito/asm/Type;");
        propertyDescriptor16.setBound(true);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        propertyDescriptor26.setBound(true);
        java.lang.Class<?> wildcardClass29 = propertyDescriptor26.getPropertyType();
        java.lang.Object obj31 = propertyDescriptor26.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method32 = null;
        propertyDescriptor26.setWriteMethod(method32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.String str38 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass36);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type[] typeArray40 = classInfo39.getInterfaces();
        boolean boolean42 = classInfo39.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray43 = classInfo39.getInterfaces();
        org.mockito.asm.Type type44 = classInfo39.getSuperType();
        propertyDescriptor26.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo39);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str47 = type46.getDescriptor();
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] {};
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type46, typeArray48);
        boolean boolean50 = classInfo39.equals((java.lang.Object) type46);
        propertyDescriptor16.setValue("F", (java.lang.Object) classInfo39);
        java.beans.PropertyEditor propertyEditor52 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "F");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor26", propertyDescriptor16.equals(propertyDescriptor26) ? propertyDescriptor16.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("D", method1, method2);
        propertyDescriptor3.setConstrained(false);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = classInfo10.getSuperType();
        org.mockito.asm.Type type12 = classInfo10.getSuperType();
        org.mockito.asm.Type type13 = classInfo10.getSuperType();
        org.mockito.asm.Type[] typeArray14 = classInfo10.getInterfaces();
        org.mockito.asm.Type[] typeArray15 = classInfo10.getInterfaces();
        org.mockito.asm.Type type16 = classInfo10.getSuperType();
        org.mockito.asm.Type type17 = classInfo10.getSuperType();
        java.lang.Object obj18 = null;
        boolean boolean19 = classInfo10.equals(obj18);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("(Z)C", method21, method22);
        propertyDescriptor23.setBound(true);
        boolean boolean26 = propertyDescriptor23.isExpert();
        propertyDescriptor23.setName("boolean");
        boolean boolean29 = propertyDescriptor23.isExpert();
        boolean boolean30 = propertyDescriptor23.isPreferred();
        boolean boolean31 = propertyDescriptor23.isPreferred();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("(Z)C", method34, method35);
        java.util.Enumeration<java.lang.String> strEnumeration37 = propertyDescriptor36.attributeNames();
        boolean boolean38 = propertyDescriptor36.isPreferred();
        java.lang.String str39 = propertyDescriptor36.getName();
        boolean boolean40 = propertyDescriptor36.isExpert();
        propertyDescriptor36.setBound(true);
        propertyDescriptor36.setShortDescription("Z");
        boolean boolean45 = propertyDescriptor36.isHidden();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor36.getPropertyEditorClass();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass48 = type47.getClass();
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass48);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        java.lang.String str51 = type50.toString();
        java.beans.PropertyEditor propertyEditor52 = propertyDescriptor36.createPropertyEditor((java.lang.Object) type50);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass54 = type53.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass54);
        java.lang.String str56 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass54);
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo58 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.CHAR_TYPE;
        int int63 = type61.getOpcode(0);
        int int64 = type61.getSort();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass66 = type65.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass66);
        java.lang.String str68 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo70 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        org.mockito.asm.Type[] typeArray71 = classInfo70.getInterfaces();
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("", type61, typeArray71);
        boolean boolean73 = type59.equals((java.lang.Object) typeArray71);
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray71);
        propertyDescriptor23.setValue("Lmockito/asm/Type;", (java.lang.Object) typeArray71);
        boolean boolean76 = classInfo10.equals((java.lang.Object) propertyDescriptor23);
        propertyDescriptor23.setName("Z)Lorg.mockito.asm.Type");
        java.lang.Object obj80 = propertyDescriptor23.getValue("Ljava/lang/Object;()D");
        boolean boolean81 = propertyDescriptor3.equals(obj80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor23 and propertyDescriptor36", propertyDescriptor23.equals(propertyDescriptor36) ? propertyDescriptor23.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method4, method5);
        propertyDescriptor6.setDisplayName("java.beans.PropertyDescriptor[name=boolean; bound]");
        propertyDescriptor6.setBound(false);
        boolean boolean11 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("(Z)C", method13, method14);
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor15.attributeNames();
        boolean boolean17 = propertyDescriptor15.isPreferred();
        java.lang.reflect.Method method18 = null;
        propertyDescriptor15.setWriteMethod(method18);
        propertyDescriptor15.setHidden(true);
        propertyDescriptor15.setExpert(false);
        propertyDescriptor15.setBound(true);
        propertyDescriptor15.setShortDescription("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        propertyDescriptor15.setBound(false);
        boolean boolean30 = signature2.equals((java.lang.Object) propertyDescriptor15);
        java.lang.String str31 = propertyDescriptor15.getName();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("(Z)C", method34, method35);
        java.util.Enumeration<java.lang.String> strEnumeration37 = propertyDescriptor36.attributeNames();
        boolean boolean38 = propertyDescriptor36.isPreferred();
        java.lang.String str39 = propertyDescriptor36.getName();
        boolean boolean40 = propertyDescriptor36.isExpert();
        propertyDescriptor36.setBound(true);
        java.lang.Class<?> wildcardClass43 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setConstrained(true);
        propertyDescriptor36.setPreferred(false);
        propertyDescriptor15.setValue("()L()Lg/mockito/asm/Type;;", (java.lang.Object) propertyDescriptor36);
        propertyDescriptor36.setName("I");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor15", propertyDescriptor6.equals(propertyDescriptor15) ? propertyDescriptor6.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(11);
        java.lang.String str8 = type5.getDescriptor();
        java.lang.String str9 = type5.getClassName();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = type10.toString();
        int int15 = type10.getSize();
        java.lang.String str16 = type10.getClassName();
        java.lang.String str17 = type10.getClassName();
        int int19 = type10.getOpcode((-1));
        java.lang.String str20 = type10.toString();
        java.lang.String str21 = type10.getClassName();
        boolean boolean22 = type5.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = type10.getInternalName();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        java.lang.String str7 = type0.getClassName();
        java.lang.String str8 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type0.getDimensions();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, false, false);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray20);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray27);
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass34 = type31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, true);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, false, true);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, false);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray44);
        java.lang.Object[] objArray51 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray52 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray51);
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean57 = type55.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass58 = type55.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass58);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, false, true);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, false);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray54, methodArray68);
        java.lang.reflect.Method[] methodArray70 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray68);
        java.lang.Object[] objArray76 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray77 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray76);
        int int78 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray77);
        java.lang.String[] strArray79 = org.mockito.cglib.core.ReflectUtils.getNames(classArray77);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean82 = type80.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass83 = type80.getClass();
        java.lang.String str84 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray85 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass83);
        java.lang.String str87 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray88 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass83);
        java.lang.reflect.Method[] methodArray91 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray88, false, false);
        java.lang.reflect.Method[] methodArray92 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray79, methodArray91);
        java.lang.reflect.Method[] methodArray93 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray94 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray93);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type10 = classInfo9.getSuperType();
        int int11 = classInfo9.getModifiers();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method13, method14);
        propertyDescriptor15.setPreferred(false);
        java.lang.String str18 = propertyDescriptor15.getName();
        propertyDescriptor15.setBound(true);
        propertyDescriptor15.setBound(false);
        propertyDescriptor15.setPreferred(false);
        boolean boolean25 = classInfo9.equals((java.lang.Object) propertyDescriptor15);
        org.mockito.asm.Type type26 = classInfo9.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor15", propertyDescriptor3.equals(propertyDescriptor15) ? propertyDescriptor3.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(11);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        boolean boolean21 = type5.equals((java.lang.Object) strArray20);
        java.lang.Object[] objArray27 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray27);
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean33 = type31.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass34 = type31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, true);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, false, true);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, false);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray44);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray48 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray48);
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray52 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray52);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray52);
        java.lang.Class[] classArray55 = new java.lang.Class[] {};
        java.lang.String[] strArray56 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        java.lang.reflect.Method[] methodArray57 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray56, methodArray57);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray57);
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray62 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray62);
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray66 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray65, methodArray66);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray66);
        java.lang.Class[] classArray69 = new java.lang.Class[] {};
        java.lang.String[] strArray70 = org.mockito.cglib.core.ReflectUtils.getNames(classArray69);
        java.lang.reflect.Method[] methodArray71 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray70, methodArray71);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray71);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray71);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean77 = type75.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass78 = type75.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray79 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass78);
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray79, true, true);
        java.lang.reflect.Method[] methodArray85 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray79, false, true);
        java.lang.Class[] classArray86 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray85);
        java.lang.reflect.Method[] methodArray87 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray85);
        java.lang.reflect.Method[] methodArray88 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray87);
        org.mockito.asm.Type type89 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass90 = type89.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray91 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass90);
        java.lang.reflect.Method[] methodArray94 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray91, true, true);
        java.lang.reflect.Method[] methodArray95 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray96 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray95);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("F");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method41 = propertyDescriptor9.getReadMethod();
        propertyDescriptor9.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor9.setName("org.mockito.asm.Type");
        propertyDescriptor9.setExpert(true);
        propertyDescriptor9.setExpert(true);
        java.lang.reflect.Method method51 = null;
        java.lang.reflect.Method method52 = null;
        java.beans.PropertyDescriptor propertyDescriptor53 = new java.beans.PropertyDescriptor("(Z)C", method51, method52);
        java.util.Enumeration<java.lang.String> strEnumeration54 = propertyDescriptor53.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor53.attributeNames();
        java.lang.Object obj57 = propertyDescriptor53.getValue("()Lchar;");
        boolean boolean58 = propertyDescriptor9.equals(obj57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor53", propertyDescriptor3.equals(propertyDescriptor53) ? propertyDescriptor3.hashCode() == propertyDescriptor53.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; displayName=D; values={org/mockito/asm/Type=char}]");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("double", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str4 = type3.getClassName();
        int int5 = type3.getSort();
        boolean boolean6 = signature2.equals((java.lang.Object) type3);
        int int8 = type3.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type3.getDimensions();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type[] typeArray2 = new org.mockito.asm.Type[] {};
        java.lang.String str3 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray2);
        java.lang.String str4 = type0.toString();
        int int5 = type0.getSize();
        java.lang.String str6 = type0.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getDescriptor();
        boolean boolean10 = type7.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass11 = type7.getClass();
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type0.getInternalName();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray7 = classInfo4.getInterfaces();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray20);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.String str28 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray29, false, false);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray29, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray36);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str15 = type0.toString();
        java.lang.String str16 = type0.toString();
        int int17 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type0.getDimensions();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("org/mockito/asm/Type");
        propertyDescriptor3.setDisplayName("long");
        boolean boolean18 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        java.lang.Class<?> wildcardClass21 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj22 = null;
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor(obj22);
        java.lang.reflect.Method method24 = propertyDescriptor3.getReadMethod();
        java.lang.Class<?> wildcardClass25 = propertyDescriptor3.getPropertyType();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str29 = signature28.getName();
        java.lang.String str30 = signature28.getName();
        java.lang.String str31 = signature28.toString();
        org.mockito.asm.Type type32 = signature28.getReturnType();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("(Z)C", method34, method35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass38 = type37.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass38);
        java.lang.String str40 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass38);
        org.mockito.cglib.core.ClassInfo classInfo42 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type43 = classInfo42.getType();
        java.beans.PropertyEditor propertyEditor44 = propertyDescriptor36.createPropertyEditor((java.lang.Object) type43);
        java.lang.Class<?> wildcardClass45 = propertyDescriptor36.getPropertyEditorClass();
        propertyDescriptor36.setPreferred(true);
        propertyDescriptor36.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor36.setConstrained(true);
        propertyDescriptor36.setShortDescription("");
        boolean boolean54 = signature28.equals((java.lang.Object) propertyDescriptor36);
        java.lang.reflect.Method method57 = null;
        java.lang.reflect.Method method58 = null;
        java.beans.PropertyDescriptor propertyDescriptor59 = new java.beans.PropertyDescriptor("(Z)C", method57, method58);
        propertyDescriptor59.setBound(true);
        java.lang.Class<?> wildcardClass62 = propertyDescriptor59.getPropertyType();
        java.lang.Object obj64 = propertyDescriptor59.getValue("org.mockito.asm.Type");
        propertyDescriptor59.setShortDescription("D");
        boolean boolean67 = propertyDescriptor59.isPreferred();
        propertyDescriptor59.setName("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]");
        java.lang.String str70 = propertyDescriptor59.getShortDescription();
        boolean boolean71 = propertyDescriptor59.isHidden();
        propertyDescriptor59.setBound(false);
        propertyDescriptor59.setExpert(true);
        propertyDescriptor36.setValue("java.beans.PropertyDescriptor[name=(Z)C; displayName=java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]; bound; propertyEditorClass=class org.mockito.asm.Type]", (java.lang.Object) propertyDescriptor59);
        java.beans.PropertyEditor propertyEditor77 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor36);
        propertyDescriptor36.setShortDescription("D");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor59", propertyDescriptor3.equals(propertyDescriptor59) ? propertyDescriptor3.hashCode() == propertyDescriptor59.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("(Z)C", method4, method5);
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor6.attributeNames();
        boolean boolean8 = propertyDescriptor6.isPreferred();
        java.lang.String str9 = propertyDescriptor6.getName();
        boolean boolean10 = propertyDescriptor6.isExpert();
        propertyDescriptor6.setBound(true);
        propertyDescriptor6.setPreferred(true);
        boolean boolean15 = signature2.equals((java.lang.Object) propertyDescriptor6);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("(Z)C", method17, method18);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor19.attributeNames();
        boolean boolean21 = propertyDescriptor19.isPreferred();
        java.lang.String str22 = propertyDescriptor19.getName();
        boolean boolean23 = propertyDescriptor19.isExpert();
        propertyDescriptor19.setBound(true);
        propertyDescriptor19.setPreferred(true);
        java.lang.String str28 = propertyDescriptor19.getDisplayName();
        java.lang.reflect.Method method29 = null;
        propertyDescriptor19.setReadMethod(method29);
        propertyDescriptor19.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str33 = propertyDescriptor19.getDisplayName();
        boolean boolean34 = propertyDescriptor19.isExpert();
        propertyDescriptor19.setExpert(true);
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor6.createPropertyEditor((java.lang.Object) true);
        propertyDescriptor6.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; propertyEditorClass=class org.mockito.asm.Type]");
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("(Z)C", method41, method42);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor43.setValue("org/mockito/asm/Type", (java.lang.Object) signature47);
        java.lang.String str49 = propertyDescriptor43.getDisplayName();
        propertyDescriptor43.setHidden(false);
        propertyDescriptor43.setHidden(false);
        java.lang.Object obj55 = propertyDescriptor43.getValue("()D");
        propertyDescriptor43.setName("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor43.setShortDescription("J");
        java.lang.Object obj61 = propertyDescriptor43.getValue("Ljava/lang/Object;()D");
        java.lang.reflect.Method method62 = propertyDescriptor43.getWriteMethod();
        propertyDescriptor43.setBound(false);
        propertyDescriptor43.setBound(true);
        java.beans.PropertyEditor propertyEditor67 = propertyDescriptor6.createPropertyEditor((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor43", propertyDescriptor19.equals(propertyDescriptor43) ? propertyDescriptor19.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        int int8 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(0);
        int int13 = type10.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type10, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        int int24 = type7.getOpcode(112);
        java.lang.String str25 = type7.getInternalName();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str29 = signature28.getDescriptor();
        boolean boolean30 = type7.equals((java.lang.Object) signature28);
        java.lang.reflect.Method method32 = null;
        java.lang.reflect.Method method33 = null;
        java.beans.PropertyDescriptor propertyDescriptor34 = new java.beans.PropertyDescriptor("(Z)C", method32, method33);
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor34.setValue("org/mockito/asm/Type", (java.lang.Object) signature38);
        java.lang.String str40 = propertyDescriptor34.getDisplayName();
        propertyDescriptor34.setHidden(false);
        propertyDescriptor34.setHidden(false);
        propertyDescriptor34.setName("org/mockito/asm/Type");
        boolean boolean47 = signature28.equals((java.lang.Object) propertyDescriptor34);
        java.lang.String str48 = signature28.getName();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method50, method51);
        propertyDescriptor52.setExpert(false);
        java.util.Enumeration<java.lang.String> strEnumeration55 = propertyDescriptor52.attributeNames();
        java.lang.Class<?> wildcardClass56 = propertyDescriptor52.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray57, false, false);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray57, true, false);
        boolean boolean64 = signature28.equals((java.lang.Object) methodArray63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor34 and propertyDescriptor52", propertyDescriptor34.equals(propertyDescriptor52) ? propertyDescriptor34.hashCode() == propertyDescriptor52.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lmockito/asm/Type;", "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method4, method5);
        propertyDescriptor6.setExpert(false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("(Z)C", method10, method11);
        java.util.Enumeration<java.lang.String> strEnumeration13 = propertyDescriptor12.attributeNames();
        boolean boolean14 = propertyDescriptor12.isPreferred();
        java.lang.Class<?> wildcardClass15 = propertyDescriptor12.getPropertyType();
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor6.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass21);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, true);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray27);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass32 = type31.getClass();
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, true);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray38);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray38);
        propertyDescriptor12.setValue("Ljava/lang/Object;", (java.lang.Object) strArray19);
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound]");
        java.lang.reflect.Method method44 = propertyDescriptor12.getReadMethod();
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str47 = propertyDescriptor12.getName();
        java.util.Enumeration<java.lang.String> strEnumeration48 = propertyDescriptor12.attributeNames();
        java.lang.String str49 = propertyDescriptor12.getDisplayName();
        boolean boolean50 = signature2.equals((java.lang.Object) str49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor12", propertyDescriptor6.equals(propertyDescriptor12) ? propertyDescriptor6.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setPreferred(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("org/mockito/asm/TypeLorg/mockito/asm/Type;", method14, method15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        int int21 = type17.getOpcode(100);
        int int22 = type17.getSize();
        int int24 = type17.getOpcode(4);
        int int26 = type17.getOpcode((int) ' ');
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        boolean boolean30 = type27.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass31 = type27.getClass();
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass31);
        boolean boolean34 = type17.equals((java.lang.Object) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass31);
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor16.createPropertyEditor((java.lang.Object) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        propertyDescriptor3.setValue("L)Lchar;", (java.lang.Object) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor16", propertyDescriptor3.equals(propertyDescriptor16) ? propertyDescriptor3.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        java.lang.String str6 = signature2.getName();
        java.lang.String str7 = signature2.getName();
        java.lang.String str8 = signature2.getDescriptor();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean11 = type9.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass12 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        boolean boolean14 = signature2.equals((java.lang.Object) propertyDescriptorArray13);
        java.lang.String str15 = signature2.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = classInfo20.getSuperType();
        org.mockito.asm.Type type22 = classInfo20.getSuperType();
        org.mockito.asm.Type type23 = classInfo20.getSuperType();
        org.mockito.asm.Type[] typeArray24 = classInfo20.getInterfaces();
        int int25 = classInfo20.getModifiers();
        java.lang.String str26 = classInfo20.toString();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("(Z)C", method28, method29);
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor30.setValue("org/mockito/asm/Type", (java.lang.Object) signature34);
        java.lang.String str36 = propertyDescriptor30.getDisplayName();
        propertyDescriptor30.setHidden(false);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass41 = type40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass41);
        java.lang.String str43 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass41);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type[] typeArray46 = classInfo45.getInterfaces();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str48 = type47.getDescriptor();
        boolean boolean49 = classInfo45.equals((java.lang.Object) type47);
        propertyDescriptor30.setValue("()Z", (java.lang.Object) type47);
        java.lang.reflect.Method method51 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor30.setPreferred(true);
        java.lang.reflect.Method method54 = null;
        propertyDescriptor30.setReadMethod(method54);
        java.lang.Object obj57 = propertyDescriptor30.getValue("F");
        boolean boolean58 = classInfo20.equals((java.lang.Object) propertyDescriptor30);
        boolean boolean59 = signature2.equals((java.lang.Object) classInfo20);
        int int60 = classInfo20.getModifiers();
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        java.lang.String str64 = signature63.getName();
        java.lang.String str65 = signature63.getName();
        java.lang.String str66 = signature63.toString();
        java.lang.String str67 = signature63.getName();
        org.mockito.cglib.core.Signature signature70 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type71 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass72 = type71.getClass();
        boolean boolean73 = signature70.equals((java.lang.Object) wildcardClass72);
        boolean boolean75 = signature70.equals((java.lang.Object) (short) 1);
        java.lang.String str76 = signature70.getDescriptor();
        java.lang.Class<?> wildcardClass77 = signature70.getClass();
        org.mockito.cglib.core.ClassInfo classInfo78 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass77);
        org.mockito.asm.Type type79 = classInfo78.getType();
        boolean boolean80 = signature63.equals((java.lang.Object) classInfo78);
        org.mockito.asm.Type type81 = classInfo78.getType();
        java.lang.reflect.Method method83 = null;
        java.lang.reflect.Method method84 = null;
        java.beans.PropertyDescriptor propertyDescriptor85 = new java.beans.PropertyDescriptor("LLorg/mockito/asm/Type;;", method83, method84);
        org.mockito.asm.Type type87 = org.mockito.asm.Type.getObjectType("()LLjava/lang/Object;");
        java.beans.PropertyEditor propertyEditor88 = propertyDescriptor85.createPropertyEditor((java.lang.Object) type87);
        java.lang.String str89 = type87.getClassName();
        boolean boolean90 = type81.equals((java.lang.Object) type87);
        boolean boolean91 = classInfo20.equals((java.lang.Object) boolean90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor30 and propertyDescriptor85", propertyDescriptor30.equals(propertyDescriptor85) ? propertyDescriptor30.hashCode() == propertyDescriptor85.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()Z=D}]");
        int int3 = type1.getOpcode(13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.beans.PropertyEditor propertyEditor8 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 104);
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setDisplayName("Z");
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor17.setValue("org/mockito/asm/Type", (java.lang.Object) signature21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass25 = type24.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        int int31 = classInfo29.getModifiers();
        propertyDescriptor17.setValue("()D", (java.lang.Object) int31);
        propertyDescriptor17.setBound(false);
        java.lang.String str35 = propertyDescriptor17.getShortDescription();
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("Ljava/lang/Object;", method38, method39);
        propertyDescriptor40.setBound(true);
        propertyDescriptor40.setExpert(false);
        propertyDescriptor40.setExpert(false);
        propertyDescriptor17.setValue("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=()D; expert; bound]", (java.lang.Object) propertyDescriptor40);
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor17);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass51 = type50.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.lang.String str53 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass51);
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        int int57 = type56.getSort();
        java.lang.String str58 = type56.toString();
        java.lang.String str59 = type56.getDescriptor();
        org.mockito.asm.Type type60 = type56.getElementType();
        propertyDescriptor17.setValue("java.beans.PropertyDescriptor[name=(Z)C; preferred; bound; propertyEditorClass=class org.mockito.cglib.core.Signature]", (java.lang.Object) type56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor40", propertyDescriptor3.equals(propertyDescriptor40) ? propertyDescriptor3.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(0);
        int int4 = type1.getSort();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type[] typeArray11 = classInfo10.getInterfaces();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type1, typeArray11);
        java.lang.String str13 = signature12.getName();
        java.lang.String str14 = signature12.getName();
        java.lang.String str15 = signature12.getDescriptor();
        org.mockito.asm.Type type16 = signature12.getReturnType();
        int int18 = type16.getOpcode(136);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = type16.getInternalName();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.CHAR_TYPE;
        int int6 = type4.getOpcode(0);
        int int7 = type4.getSort();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", type4, typeArray14);
        java.lang.String str16 = signature15.getName();
        java.lang.String str17 = signature15.getName();
        org.mockito.asm.Type[] typeArray18 = signature15.getArgumentTypes();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("boolean", type1, typeArray18);
        int int20 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean4 = type2.equals((java.lang.Object) (byte) 0);
        int int6 = type2.getOpcode(100);
        int int7 = type2.getSize();
        int int9 = type2.getOpcode(4);
        int int11 = type2.getOpcode((int) ' ');
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str13 = type12.getDescriptor();
        boolean boolean15 = type12.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass16 = type12.getClass();
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        boolean boolean19 = type2.equals((java.lang.Object) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray23, true, false);
        boolean boolean27 = type0.equals((java.lang.Object) methodArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type0.getDimensions();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        boolean boolean5 = signature2.equals((java.lang.Object) wildcardClass4);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type7 = type6.getElementType();
        int int8 = type7.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(0);
        int int13 = type10.getSort();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.String str17 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type10, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray20);
        int int24 = type7.getOpcode(112);
        java.lang.String str25 = type7.getInternalName();
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "");
        java.lang.String str29 = signature28.getDescriptor();
        boolean boolean30 = type7.equals((java.lang.Object) signature28);
        java.lang.String str31 = type7.toString();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("(Z)C", method33, method34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass37 = type36.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        java.lang.String str39 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass37);
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        org.mockito.asm.Type type42 = classInfo41.getType();
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor35.createPropertyEditor((java.lang.Object) type42);
        java.lang.reflect.Method method44 = null;
        propertyDescriptor35.setWriteMethod(method44);
        java.lang.reflect.Method method46 = propertyDescriptor35.getReadMethod();
        boolean boolean47 = type7.equals((java.lang.Object) propertyDescriptor35);
        org.mockito.asm.Type type48 = type7.getElementType();
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("(Z)C", method50, method51);
        java.util.Enumeration<java.lang.String> strEnumeration53 = propertyDescriptor52.attributeNames();
        boolean boolean54 = propertyDescriptor52.isPreferred();
        java.lang.String str55 = propertyDescriptor52.getName();
        boolean boolean56 = propertyDescriptor52.isExpert();
        propertyDescriptor52.setBound(true);
        propertyDescriptor52.setPreferred(true);
        java.lang.String str61 = propertyDescriptor52.getDisplayName();
        java.lang.reflect.Method method62 = null;
        propertyDescriptor52.setReadMethod(method62);
        propertyDescriptor52.setName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        java.lang.String str66 = propertyDescriptor52.getDisplayName();
        boolean boolean67 = propertyDescriptor52.isExpert();
        propertyDescriptor52.setExpert(false);
        propertyDescriptor52.setHidden(false);
        java.lang.reflect.Method method73 = null;
        java.lang.reflect.Method method74 = null;
        java.beans.PropertyDescriptor propertyDescriptor75 = new java.beans.PropertyDescriptor("(Z)C", method73, method74);
        java.util.Enumeration<java.lang.String> strEnumeration76 = propertyDescriptor75.attributeNames();
        boolean boolean77 = propertyDescriptor75.isPreferred();
        java.lang.String str78 = propertyDescriptor75.getName();
        boolean boolean79 = propertyDescriptor75.isExpert();
        propertyDescriptor75.setBound(true);
        propertyDescriptor75.setShortDescription("Z");
        propertyDescriptor75.setShortDescription("C");
        java.lang.reflect.Method method86 = propertyDescriptor75.getWriteMethod();
        java.beans.PropertyEditor propertyEditor87 = propertyDescriptor52.createPropertyEditor((java.lang.Object) propertyDescriptor75);
        java.lang.reflect.Method method88 = null;
        propertyDescriptor52.setReadMethod(method88);
        boolean boolean90 = type7.equals((java.lang.Object) method88);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor52 and propertyDescriptor75", propertyDescriptor52.equals(propertyDescriptor75) ? propertyDescriptor52.hashCode() == propertyDescriptor75.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("F");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean5 = type3.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3 };
        java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray6);
        boolean boolean8 = type1.equals((java.lang.Object) type2);
        java.lang.String str9 = type1.getDescriptor();
        int int10 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = type1.getDimensions();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        int int8 = type0.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        java.lang.String str17 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean7 = type5.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass8 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, true);
        boolean boolean13 = signature2.equals((java.lang.Object) true);
        org.mockito.asm.Type[] typeArray14 = signature2.getArgumentTypes();
        java.lang.String str15 = signature2.toString();
        java.lang.String str16 = signature2.toString();
        org.mockito.asm.Type[] typeArray17 = signature2.getArgumentTypes();
        org.mockito.asm.Type type18 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type18.getDimensions();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("D", "java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; org/mockito/asm/TypeD=(Z)C; F=Ljava/lang/Object;; org/mockito/asm/TypeLorg/mockito/asm/Type;=double}]");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int5 = type4.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type4.getDimensions();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray15);
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.lang.reflect.Method[] methodArray29 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray28, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray29);
        java.lang.Class[] classArray32 = new java.lang.Class[] {};
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        java.lang.reflect.Method[] methodArray34 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray34);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray34);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray39 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray38);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = classInfo5.getType();
        int int7 = classInfo5.getModifiers();
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("(Z)C", method9, method10);
        java.util.Enumeration<java.lang.String> strEnumeration12 = propertyDescriptor11.attributeNames();
        propertyDescriptor11.setHidden(true);
        propertyDescriptor11.setExpert(false);
        boolean boolean17 = classInfo5.equals((java.lang.Object) propertyDescriptor11);
        org.mockito.asm.Type[] typeArray18 = classInfo5.getInterfaces();
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=boolean; bound]", method20, method21);
        boolean boolean23 = propertyDescriptor22.isHidden();
        propertyDescriptor22.setShortDescription("()Ljava/lang/Object;");
        boolean boolean26 = classInfo5.equals((java.lang.Object) propertyDescriptor22);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("org.mockito.asm.Type", method28, method29);
        java.lang.reflect.Method method31 = null;
        propertyDescriptor30.setReadMethod(method31);
        boolean boolean33 = propertyDescriptor30.isHidden();
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor22.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        propertyDescriptor30.setHidden(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor11 and propertyDescriptor22", propertyDescriptor11.equals(propertyDescriptor22) ? propertyDescriptor11.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg.mockito.asm.Type;}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        boolean boolean13 = type10.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass14 = type10.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass14);
        boolean boolean17 = type0.equals((java.lang.Object) wildcardClass14);
        int int18 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type19 = type0.getElementType();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int4 = type2.getOpcode(0);
        int int5 = type2.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass7 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("", type2, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType("D");
        int int16 = type15.getSort();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean19 = type17.equals((java.lang.Object) (byte) 0);
        int int21 = type17.getOpcode(100);
        int int22 = type17.getSize();
        int int24 = type17.getOpcode(4);
        int int26 = type17.getOpcode((int) ' ');
        org.mockito.asm.Type type27 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str28 = type27.getDescriptor();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] {};
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray29);
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray29);
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", type2, typeArray29);
        java.lang.String str34 = type2.toString();
        java.lang.String str35 = type2.toString();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str37 = type36.getDescriptor();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] {};
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type41 = type2.getElementType();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        int int4 = type0.getOpcode(100);
        int int5 = type0.getSize();
        int int7 = type0.getOpcode(4);
        int int9 = type0.getOpcode((int) ' ');
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str15 = type0.toString();
        int int16 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type0.getElementType();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        boolean boolean9 = classInfo6.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray10 = classInfo6.getInterfaces();
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
        java.lang.String str6 = signature2.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        boolean boolean8 = signature2.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type7.getElementType();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.Object obj8 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        propertyDescriptor3.setShortDescription("D");
        propertyDescriptor3.setShortDescription("Lchar;");
        java.lang.reflect.Method method13 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setName("[Lorg/mockito/asm/Type;");
        propertyDescriptor3.setDisplayName("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        propertyDescriptor3.setDisplayName("C");
        java.lang.Object obj21 = propertyDescriptor3.getValue("()L)Lchar;");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        java.util.Enumeration<java.lang.String> strEnumeration27 = propertyDescriptor26.attributeNames();
        boolean boolean28 = propertyDescriptor26.isPreferred();
        java.lang.String str29 = propertyDescriptor26.getName();
        boolean boolean30 = propertyDescriptor26.isExpert();
        propertyDescriptor26.setBound(true);
        propertyDescriptor26.setShortDescription("Z");
        java.lang.reflect.Method method35 = null;
        propertyDescriptor26.setWriteMethod(method35);
        propertyDescriptor26.setShortDescription("Ljava/lang/Object;");
        java.lang.reflect.Method method39 = null;
        propertyDescriptor26.setReadMethod(method39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass43 = type42.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass43);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type47 = classInfo46.getSuperType();
        org.mockito.asm.Type type48 = classInfo46.getSuperType();
        java.lang.Class<?> wildcardClass49 = type48.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass49);
        propertyDescriptor26.setValue("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; constrained]; values={char=java.beans.PropertyDescriptor[name=(Z)C; bound]; org/mockito/asm/TypeLorg/mockito/asm/Type;=10.0}; bound]", (java.lang.Object) wildcardClass49);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=(Z)C; hidden; values={()D=org.mockito.asm.Type; org/mockito/asm/TypeLorg/mockito/asm/Type;=10.0}; bound]", (java.lang.Object) wildcardClass49);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor26", propertyDescriptor3.equals(propertyDescriptor26) ? propertyDescriptor3.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method7 = null;
        propertyDescriptor3.setWriteMethod(method7);
        boolean boolean9 = propertyDescriptor3.isHidden();
        boolean boolean10 = propertyDescriptor3.isPreferred();
        boolean boolean11 = propertyDescriptor3.isHidden();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("()D", method15, method16);
        propertyDescriptor17.setPreferred(false);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor17.attributeNames();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        java.lang.String str32 = type31.toString();
        boolean boolean33 = classInfo22.equals((java.lang.Object) type31);
        int int34 = classInfo22.getModifiers();
        org.mockito.asm.Type type35 = classInfo22.getType();
        org.mockito.asm.Type type36 = classInfo22.getType();
        org.mockito.asm.Type type37 = type36.getElementType();
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=S]", (java.lang.Object) type37);
        java.lang.String str39 = type37.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor17", propertyDescriptor3.equals(propertyDescriptor17) ? propertyDescriptor3.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.String str3 = type0.toString();
        java.lang.String str4 = type0.getDescriptor();
        java.lang.String str5 = type0.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; displayName=char; shortDescription=D; bound]");
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray11 = signature10.getArgumentTypes();
        org.mockito.asm.Type type12 = signature10.getReturnType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean15 = type13.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass16 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        boolean boolean21 = signature10.equals((java.lang.Object) true);
        org.mockito.asm.Type[] typeArray22 = signature10.getArgumentTypes();
        java.lang.String str23 = signature10.toString();
        java.lang.String str24 = signature10.toString();
        org.mockito.asm.Type[] typeArray25 = signature10.getArgumentTypes();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type0.getInternalName();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        int int17 = classInfo15.getModifiers();
        propertyDescriptor3.setValue("()D", (java.lang.Object) int17);
        java.lang.Object obj20 = propertyDescriptor3.getValue("(Z)C");
        propertyDescriptor3.setBound(false);
        propertyDescriptor3.setConstrained(false);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("Lg/mockito/asm/Type;", method27, method28);
        boolean boolean30 = propertyDescriptor29.isExpert();
        java.lang.String str31 = propertyDescriptor29.getDisplayName();
        java.lang.Class<?> wildcardClass32 = propertyDescriptor29.getPropertyEditorClass();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("(Z)C", method34, method35);
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor36.setValue("org/mockito/asm/Type", (java.lang.Object) signature40);
        java.lang.String str42 = propertyDescriptor36.getDisplayName();
        boolean boolean43 = propertyDescriptor36.isHidden();
        propertyDescriptor36.setDisplayName("org.mockito.asm.Type");
        propertyDescriptor36.setDisplayName("()I");
        java.lang.reflect.Method method48 = null;
        propertyDescriptor36.setWriteMethod(method48);
        java.lang.String str50 = propertyDescriptor36.getShortDescription();
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor29.createPropertyEditor((java.lang.Object) propertyDescriptor36);
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor29);
        propertyDescriptor3.setName("java.beans.PropertyDescriptorLorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor29 and propertyDescriptor36", propertyDescriptor29.equals(propertyDescriptor36) ? propertyDescriptor29.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type6.getInternalName();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        propertyDescriptor3.setExpert(false);
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("(Z)C", method7, method8);
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor9.attributeNames();
        boolean boolean11 = propertyDescriptor9.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor9.getPropertyType();
        java.beans.PropertyEditor propertyEditor13 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor9);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass18 = type17.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, true);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray24);
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass29 = type28.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray35);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray35);
        propertyDescriptor9.setValue("Ljava/lang/Object;", (java.lang.Object) strArray16);
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        boolean boolean45 = signature42.equals((java.lang.Object) wildcardClass44);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type type47 = type46.getElementType();
        java.lang.String str48 = type47.getClassName();
        int int49 = type47.getSize();
        propertyDescriptor9.setValue("org/mockito/asm/TypeD", (java.lang.Object) type47);
        java.lang.String str51 = type47.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=(Z)C; constrained]");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass4 = type3.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type9 = classInfo8.getType();
        int int10 = classInfo8.getModifiers();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("(Z)C", method12, method13);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor14.attributeNames();
        propertyDescriptor14.setHidden(true);
        propertyDescriptor14.setExpert(false);
        boolean boolean20 = classInfo8.equals((java.lang.Object) propertyDescriptor14);
        org.mockito.asm.Type[] typeArray21 = classInfo8.getInterfaces();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=org/mockito/asm/TypeLorg/mockito/asm/Type;; displayName=long; values={org/mockito/asm/Type=char}]", type2, typeArray21);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor26.setValue("org/mockito/asm/Type", (java.lang.Object) signature30);
        java.lang.String str32 = propertyDescriptor26.getDisplayName();
        propertyDescriptor26.setHidden(false);
        propertyDescriptor26.setHidden(false);
        java.lang.Object obj38 = propertyDescriptor26.getValue("()D");
        propertyDescriptor26.setName("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor26.setShortDescription("J");
        java.lang.Object obj44 = propertyDescriptor26.getValue("g.mockito.asm.Type");
        java.lang.Class<?> wildcardClass45 = propertyDescriptor26.getPropertyEditorClass();
        boolean boolean46 = signature22.equals((java.lang.Object) propertyDescriptor26);
        org.mockito.asm.Type[] typeArray47 = signature22.getArgumentTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor26", propertyDescriptor14.equals(propertyDescriptor26) ? propertyDescriptor14.hashCode() == propertyDescriptor26.hashCode() : true);
    }
}


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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type0.getInternalName();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SSS)S");
        int int2 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type1.getElementType();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SSS)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(SSS)S");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type10.getDimensions();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode((-1));
        java.lang.String str4 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type10.getElementType();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type10.getInternalName();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type10.getInternalName();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int8 = type0.getSort();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        boolean boolean15 = classInfo13.equals((java.lang.Object) (-1.0f));
        java.lang.String str16 = classInfo13.toString();
        int int17 = classInfo13.getModifiers();
        org.mockito.asm.Type type18 = classInfo13.getSuperType();
        org.mockito.asm.Type type19 = classInfo13.getType();
        org.mockito.asm.Type[] typeArray20 = classInfo13.getInterfaces();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type0.getElementType();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type1.getElementType();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        java.lang.String str25 = signature2.toString();
        org.mockito.asm.Type type26 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type26.getInternalName();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        java.lang.Class<?> wildcardClass7 = classArray6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        java.lang.String str10 = classInfo8.toString();
        org.mockito.asm.Type type11 = classInfo8.getSuperType();
        boolean boolean12 = signature2.equals((java.lang.Object) classInfo8);
        org.mockito.asm.Type type13 = signature2.getReturnType();
        org.mockito.asm.Type type14 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type14.getElementType();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.proxy.Enhancer enhancer1 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader2 = enhancer1.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy3 = enhancer1.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy4 = null;
        enhancer1.setNamingPolicy(namingPolicy4);
        enhancer1.setSerialVersionUID((java.lang.Long) 10L);
        enhancer1.setAttemptLoad(false);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        java.lang.Class<?> wildcardClass13 = classArray12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        enhancer1.setSuperclass((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("void", method21, method22);
        propertyDescriptor23.setExpert(true);
        java.lang.String str26 = propertyDescriptor23.getName();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("void", method28, method29);
        propertyDescriptor30.setExpert(false);
        propertyDescriptor30.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor23.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        propertyDescriptor30.setName("Z");
        java.lang.Class<?> wildcardClass38 = propertyDescriptor30.getPropertyEditorClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type43, type44, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray46);
        org.mockito.cglib.proxy.Enhancer enhancer49 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader50 = enhancer49.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy51 = enhancer49.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy52 = null;
        enhancer49.setNamingPolicy(namingPolicy52);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy54 = enhancer49.getStrategy();
        java.lang.Class<?> wildcardClass55 = enhancer49.getClass();
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass55);
        java.lang.String str57 = classInfo56.toString();
        org.mockito.asm.Type[] typeArray58 = classInfo56.getInterfaces();
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray58);
        propertyDescriptor30.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", (java.lang.Object) typeArray58);
        org.mockito.cglib.core.Signature signature61 = new org.mockito.cglib.core.Signature("LV;", type19, typeArray58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor23 and propertyDescriptor30", propertyDescriptor23.equals(propertyDescriptor30) ? propertyDescriptor23.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int8 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type0.getElementType();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        int int13 = type11.getSort();
        int int14 = type11.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type11.getInternalName();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        boolean boolean6 = classInfo4.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = classInfo4.toString();
        java.lang.String str8 = classInfo4.toString();
        java.lang.String str9 = classInfo4.toString();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("void", method11, method12);
        propertyDescriptor13.setExpert(true);
        java.lang.String str16 = propertyDescriptor13.getName();
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("void", method18, method19);
        propertyDescriptor20.setExpert(false);
        propertyDescriptor20.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor25 = propertyDescriptor13.createPropertyEditor((java.lang.Object) propertyDescriptor20);
        propertyDescriptor20.setName("Z");
        java.lang.reflect.Method method28 = null;
        propertyDescriptor20.setWriteMethod(method28);
        boolean boolean30 = propertyDescriptor20.isPreferred();
        boolean boolean31 = classInfo4.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor20", propertyDescriptor13.equals(propertyDescriptor20) ? propertyDescriptor13.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getDescriptor();
        org.mockito.asm.Type type25 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type26 = type25.getElementType();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        int int13 = type11.getSort();
        int int14 = type11.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type11.getDimensions();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        int int13 = type11.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type11.getElementType();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        java.lang.Object obj35 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor29, (java.lang.Object[]) propertyDescriptorArray30);
        org.mockito.cglib.core.MethodInfo methodInfo37 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, 4);
        int int38 = methodInfo37.getModifiers();
        int int39 = methodInfo37.getModifiers();
        org.mockito.cglib.core.ClassInfo classInfo40 = methodInfo37.getClassInfo();
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("void", method42, method43);
        propertyDescriptor44.setExpert(true);
        java.lang.String str47 = propertyDescriptor44.getName();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("void", method49, method50);
        propertyDescriptor51.setExpert(false);
        propertyDescriptor51.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor56 = propertyDescriptor44.createPropertyEditor((java.lang.Object) propertyDescriptor51);
        java.lang.reflect.Method method57 = propertyDescriptor51.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration58 = propertyDescriptor51.attributeNames();
        propertyDescriptor51.setBound(false);
        java.util.Enumeration<java.lang.String> strEnumeration61 = propertyDescriptor51.attributeNames();
        boolean boolean62 = classInfo40.equals((java.lang.Object) strEnumeration61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor44 and propertyDescriptor51", propertyDescriptor44.equals(propertyDescriptor51) ? propertyDescriptor44.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        int int13 = type11.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type11.getDimensions();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        org.mockito.asm.Type type11 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type11.getDimensions();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        int int3 = type0.getSort();
        boolean boolean5 = type0.equals((java.lang.Object) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("Z");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("void", method21, method22);
        propertyDescriptor23.setExpert(true);
        java.lang.String str26 = propertyDescriptor23.getName();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("void", method28, method29);
        propertyDescriptor30.setExpert(false);
        propertyDescriptor30.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor23.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        java.lang.reflect.Method method36 = propertyDescriptor30.getWriteMethod();
        java.lang.reflect.Method method37 = propertyDescriptor30.getReadMethod();
        boolean boolean38 = propertyDescriptor30.isPreferred();
        java.lang.reflect.Method method39 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor10.setValue("", (java.lang.Object) propertyDescriptor30);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray42);
        java.lang.Class<?> wildcardClass45 = classArray44.getClass();
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        boolean boolean48 = classInfo46.equals((java.lang.Object) (-1.0f));
        java.lang.String str49 = classInfo46.toString();
        java.lang.String str50 = classInfo46.toString();
        int int51 = classInfo46.getModifiers();
        org.mockito.cglib.proxy.Enhancer enhancer52 = new org.mockito.cglib.proxy.Enhancer();
        enhancer52.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback55 = null;
        enhancer52.setCallback(callback55);
        java.lang.Class[] classArray57 = new java.lang.Class[] {};
        java.lang.String[] strArray58 = org.mockito.cglib.core.ReflectUtils.getNames(classArray57);
        java.lang.Class[] classArray59 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray57);
        java.lang.Class<?> wildcardClass60 = classArray59.getClass();
        enhancer52.setSuperclass((java.lang.Class) wildcardClass60);
        boolean boolean62 = classInfo46.equals((java.lang.Object) wildcardClass60);
        org.mockito.asm.Type type63 = classInfo46.getType();
        propertyDescriptor30.setValue("(SSS)S", (java.lang.Object) classInfo46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        java.lang.Class<?> wildcardClass7 = classArray6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        boolean boolean10 = classInfo8.equals((java.lang.Object) (-1.0f));
        org.mockito.asm.Type type11 = classInfo8.getSuperType();
        org.mockito.asm.Type[] typeArray12 = classInfo8.getInterfaces();
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type3.getDimensions();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        org.mockito.asm.Type type11 = signature2.getReturnType();
        int int12 = type11.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type11.getDimensions();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int9 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = type0.getDimensions();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type4.getDimensions();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        java.lang.Class<?> wildcardClass7 = classArray6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        java.lang.String str10 = classInfo8.toString();
        org.mockito.asm.Type type11 = classInfo8.getSuperType();
        boolean boolean12 = signature2.equals((java.lang.Object) classInfo8);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str16 = signature15.getName();
        org.mockito.asm.Type type17 = signature15.getReturnType();
        org.mockito.asm.Type type18 = signature15.getReturnType();
        java.lang.String str19 = signature15.getDescriptor();
        boolean boolean20 = signature2.equals((java.lang.Object) str19);
        org.mockito.asm.Type[] typeArray21 = signature2.getArgumentTypes();
        org.mockito.asm.Type type22 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type22.getElementType();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("()S");
        int int3 = type1.getOpcode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode((-1));
        boolean boolean4 = type0.equals((java.lang.Object) 57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("V");
        java.lang.String str4 = type3.getClassName();
        int int5 = type3.getSize();
        org.mockito.asm.Type[] typeArray7 = org.mockito.asm.Type.getArgumentTypes("()S");
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("java.lang.Object", type3, typeArray7);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray18 = classInfo17.getInterfaces();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", type3, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type3.getInternalName();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        java.lang.reflect.Method method16 = propertyDescriptor10.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration17 = propertyDescriptor10.attributeNames();
        propertyDescriptor10.setHidden(true);
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray20);
        java.lang.Class<?> wildcardClass23 = classArray22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        boolean boolean26 = classInfo24.equals((java.lang.Object) (-1.0f));
        java.lang.String str27 = classInfo24.toString();
        org.mockito.asm.Type type28 = classInfo24.getSuperType();
        int int29 = type28.getSize();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor10.createPropertyEditor((java.lang.Object) type28);
        int int31 = type28.getDimensions();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int5 = type3.getOpcode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type3.getDimensions();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str6 = type5.toString();
        java.lang.String str7 = type5.getInternalName();
        int int8 = type5.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type5.equals((java.lang.Object) type9);
        int int11 = type9.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type9.getElementType();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode((-1));
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str7 = signature6.getName();
        org.mockito.asm.Type[] typeArray8 = signature6.getArgumentTypes();
        java.lang.String str9 = signature6.toString();
        org.mockito.asm.Type type10 = signature6.getReturnType();
        java.lang.String str11 = type10.getDescriptor();
        boolean boolean12 = type0.equals((java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type0.getElementType();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy12 = enhancer7.getStrategy();
        java.lang.Class<?> wildcardClass13 = enhancer7.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer14 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader15 = enhancer14.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy16 = enhancer14.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy17 = null;
        enhancer14.setNamingPolicy(namingPolicy17);
        boolean boolean19 = enhancer14.getAttemptLoad();
        enhancer14.setInterceptDuringConstruction(false);
        enhancer14.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer24 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy25 = null;
        enhancer24.setNamingPolicy(namingPolicy25);
        enhancer24.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray29, true, true);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray29);
        enhancer24.setInterfaces(classArray33);
        enhancer14.setInterfaces(classArray33);
        java.lang.reflect.Constructor constructor36 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass13, classArray33);
        java.lang.String str37 = org.mockito.asm.Type.getConstructorDescriptor(constructor36);
        org.mockito.cglib.core.MethodInfo methodInfo39 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor36, (int) (byte) 10);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor36);
        boolean boolean41 = type6.equals((java.lang.Object) constructor36);
        org.mockito.cglib.core.MethodInfo methodInfo43 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor36, (int) ' ');
        org.mockito.cglib.core.MethodInfo methodInfo44 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor36);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor36);
        java.lang.reflect.Method method47 = null;
        java.lang.reflect.Method method48 = null;
        java.beans.PropertyDescriptor propertyDescriptor49 = new java.beans.PropertyDescriptor("void", method47, method48);
        propertyDescriptor49.setExpert(true);
        java.lang.String str52 = propertyDescriptor49.getName();
        java.lang.reflect.Method method54 = null;
        java.lang.reflect.Method method55 = null;
        java.beans.PropertyDescriptor propertyDescriptor56 = new java.beans.PropertyDescriptor("void", method54, method55);
        propertyDescriptor56.setExpert(false);
        propertyDescriptor56.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor61 = propertyDescriptor49.createPropertyEditor((java.lang.Object) propertyDescriptor56);
        java.lang.reflect.Method method62 = propertyDescriptor56.getWriteMethod();
        java.lang.reflect.Method method63 = propertyDescriptor56.getReadMethod();
        boolean boolean64 = methodInfo45.equals((java.lang.Object) method63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor49 and propertyDescriptor56", propertyDescriptor49.equals(propertyDescriptor56) ? propertyDescriptor49.hashCode() == propertyDescriptor56.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(true);
        java.lang.String str13 = propertyDescriptor10.getName();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("void", method15, method16);
        propertyDescriptor17.setExpert(false);
        propertyDescriptor17.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor22 = propertyDescriptor10.createPropertyEditor((java.lang.Object) propertyDescriptor17);
        java.lang.reflect.Method method23 = propertyDescriptor17.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor17.attributeNames();
        propertyDescriptor17.setBound(false);
        java.lang.String str27 = propertyDescriptor17.getShortDescription();
        boolean boolean28 = classInfo5.equals((java.lang.Object) str27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor17", propertyDescriptor10.equals(propertyDescriptor17) ? propertyDescriptor10.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type0.getDimensions();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("LZ;");
        int int2 = type1.getSort();
        java.lang.reflect.Method method4 = null;
        java.lang.reflect.Method method5 = null;
        java.beans.PropertyDescriptor propertyDescriptor6 = new java.beans.PropertyDescriptor("void", method4, method5);
        propertyDescriptor6.setExpert(true);
        java.lang.String str9 = propertyDescriptor6.getName();
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("void", method11, method12);
        propertyDescriptor13.setExpert(false);
        propertyDescriptor13.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor6.createPropertyEditor((java.lang.Object) propertyDescriptor13);
        propertyDescriptor13.setName("Z");
        java.lang.Class<?> wildcardClass21 = propertyDescriptor13.getPropertyEditorClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type27, type28 };
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray29);
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray29);
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader33 = enhancer32.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer32.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer32.setNamingPolicy(namingPolicy35);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy37 = enhancer32.getStrategy();
        java.lang.Class<?> wildcardClass38 = enhancer32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        java.lang.String str40 = classInfo39.toString();
        org.mockito.asm.Type[] typeArray41 = classInfo39.getInterfaces();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray41);
        propertyDescriptor13.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", (java.lang.Object) typeArray41);
        boolean boolean44 = type1.equals((java.lang.Object) typeArray41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor6 and propertyDescriptor13", propertyDescriptor6.equals(propertyDescriptor13) ? propertyDescriptor6.hashCode() == propertyDescriptor13.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        java.lang.String str5 = signature2.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptorArray6.getClass();
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str13 = type12.getInternalName();
        boolean boolean14 = signature2.equals((java.lang.Object) str13);
        org.mockito.asm.Type type15 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type15.getElementType();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        org.mockito.asm.Type type24 = signature2.getReturnType();
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type24.getDimensions();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("double", method1, method2);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("void", method5, method6);
        propertyDescriptor7.setExpert(true);
        java.lang.reflect.Method method10 = propertyDescriptor7.getReadMethod();
        propertyDescriptor7.setBound(true);
        java.lang.Class<?> wildcardClass13 = propertyDescriptor7.getPropertyType();
        propertyDescriptor7.setPreferred(true);
        java.beans.PropertyEditor propertyEditor16 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor7);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = null;
        java.beans.PropertyDescriptor propertyDescriptor20 = new java.beans.PropertyDescriptor("void", method18, method19);
        propertyDescriptor20.setExpert(false);
        java.lang.String str23 = propertyDescriptor20.getName();
        java.lang.String str24 = propertyDescriptor20.getName();
        boolean boolean25 = propertyDescriptor20.isExpert();
        propertyDescriptor20.setValue("char", (java.lang.Object) "char");
        java.util.Enumeration<java.lang.String> strEnumeration29 = propertyDescriptor20.attributeNames();
        java.lang.reflect.Method method30 = propertyDescriptor20.getWriteMethod();
        java.lang.reflect.Method method31 = null;
        propertyDescriptor20.setWriteMethod(method31);
        java.beans.PropertyEditor propertyEditor33 = propertyDescriptor7.createPropertyEditor((java.lang.Object) method31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor20", propertyDescriptor3.equals(propertyDescriptor20) ? propertyDescriptor3.hashCode() == propertyDescriptor20.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("Z");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("void", method21, method22);
        propertyDescriptor23.setExpert(true);
        java.lang.String str26 = propertyDescriptor23.getName();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("void", method28, method29);
        propertyDescriptor30.setExpert(false);
        propertyDescriptor30.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor23.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        java.lang.reflect.Method method36 = propertyDescriptor30.getWriteMethod();
        java.lang.reflect.Method method37 = propertyDescriptor30.getReadMethod();
        boolean boolean38 = propertyDescriptor30.isPreferred();
        java.lang.reflect.Method method39 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor10.setValue("", (java.lang.Object) propertyDescriptor30);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor10.setReadMethod(method41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        java.lang.String str25 = signature2.toString();
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray26);
        java.lang.Class<?> wildcardClass29 = classArray28.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        boolean boolean32 = classInfo30.equals((java.lang.Object) (-1.0f));
        java.lang.String str33 = classInfo30.toString();
        java.lang.String str34 = classInfo30.toString();
        org.mockito.asm.Type type35 = classInfo30.getSuperType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        int int38 = type36.getOpcode((int) (short) 1);
        java.lang.String str39 = type36.getDescriptor();
        int int41 = type36.getOpcode((int) (byte) 100);
        boolean boolean42 = classInfo30.equals((java.lang.Object) int41);
        int int43 = classInfo30.getModifiers();
        int int44 = classInfo30.getModifiers();
        boolean boolean45 = signature2.equals((java.lang.Object) int44);
        java.lang.String str46 = signature2.toString();
        org.mockito.asm.Type type47 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type47.getInternalName();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("Z");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("void", method21, method22);
        propertyDescriptor23.setExpert(true);
        java.lang.String str26 = propertyDescriptor23.getName();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("void", method28, method29);
        propertyDescriptor30.setExpert(false);
        propertyDescriptor30.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor23.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        java.lang.reflect.Method method36 = propertyDescriptor30.getWriteMethod();
        java.lang.reflect.Method method37 = propertyDescriptor30.getReadMethod();
        boolean boolean38 = propertyDescriptor30.isPreferred();
        java.lang.reflect.Method method39 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor10.setValue("", (java.lang.Object) propertyDescriptor30);
        boolean boolean41 = propertyDescriptor10.isBound();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor30", propertyDescriptor3.equals(propertyDescriptor30) ? propertyDescriptor3.hashCode() == propertyDescriptor30.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        java.lang.String[] strArray5 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray4);
        java.lang.Class<?> wildcardClass7 = classArray6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = classInfo8.getSuperType();
        java.lang.String str10 = classInfo8.toString();
        org.mockito.asm.Type type11 = classInfo8.getSuperType();
        boolean boolean12 = signature2.equals((java.lang.Object) classInfo8);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str16 = signature15.getName();
        org.mockito.asm.Type type17 = signature15.getReturnType();
        org.mockito.asm.Type type18 = signature15.getReturnType();
        java.lang.String str19 = signature15.getDescriptor();
        boolean boolean20 = signature2.equals((java.lang.Object) str19);
        org.mockito.asm.Type[] typeArray21 = signature2.getArgumentTypes();
        org.mockito.asm.Type type22 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = type22.getDimensions();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type0.getInternalName();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("org/mockito/cglib/core/DefaultNamingPolicy");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("void", method3, method4);
        propertyDescriptor5.setExpert(true);
        java.lang.String str8 = propertyDescriptor5.getName();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("void", method10, method11);
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor17 = propertyDescriptor5.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        propertyDescriptor12.setName("Z");
        java.lang.Class<?> wildcardClass20 = propertyDescriptor12.getPropertyEditorClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type24 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type26, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray28);
        org.mockito.cglib.proxy.Enhancer enhancer31 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader32 = enhancer31.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy33 = enhancer31.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy34 = null;
        enhancer31.setNamingPolicy(namingPolicy34);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer31.getStrategy();
        java.lang.Class<?> wildcardClass37 = enhancer31.getClass();
        org.mockito.cglib.core.ClassInfo classInfo38 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        java.lang.String str39 = classInfo38.toString();
        org.mockito.asm.Type[] typeArray40 = classInfo38.getInterfaces();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray40);
        propertyDescriptor12.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", (java.lang.Object) typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor12", propertyDescriptor5.equals(propertyDescriptor12) ? propertyDescriptor5.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        int int6 = classInfo4.getModifiers();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(true);
        java.lang.String str13 = propertyDescriptor10.getName();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("void", method15, method16);
        propertyDescriptor17.setExpert(false);
        propertyDescriptor17.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor22 = propertyDescriptor10.createPropertyEditor((java.lang.Object) propertyDescriptor17);
        java.lang.reflect.Method method23 = propertyDescriptor17.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration24 = propertyDescriptor17.attributeNames();
        propertyDescriptor17.setHidden(true);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray27);
        java.lang.Class<?> wildcardClass30 = classArray29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        boolean boolean33 = classInfo31.equals((java.lang.Object) (-1.0f));
        java.lang.String str34 = classInfo31.toString();
        org.mockito.asm.Type type35 = classInfo31.getSuperType();
        int int36 = type35.getSize();
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor17.createPropertyEditor((java.lang.Object) type35);
        boolean boolean38 = classInfo4.equals((java.lang.Object) type35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor17", propertyDescriptor10.equals(propertyDescriptor17) ? propertyDescriptor10.hashCode() == propertyDescriptor17.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.String[] strArray5 = new java.lang.String[] { "[Ljava/beans/PropertyDescriptor;", "java/lang/Object", "LV;", "LZ;", "Lorg/mockito/cglib/core/AbstractClassGenerator;" };
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class[] classArray10 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, false, true);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, false, true);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, false, false);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray29);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray31);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        org.mockito.asm.Type type11 = signature2.getReturnType();
        int int12 = type11.getSize();
        int int14 = type11.getOpcode(1045);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = type11.getInternalName();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int8 = type0.getSort();
        int int10 = type0.getOpcode((int) '4');
        int int11 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        java.lang.String str12 = type4.getDescriptor();
        java.lang.String str13 = type4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type4.getElementType();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, true);
        java.lang.Class<?> wildcardClass5 = propertyDescriptorArray1.getClass();
        boolean boolean6 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        boolean boolean9 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass5);
        boolean boolean13 = type0.equals((java.lang.Object) propertyDescriptorArray12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, true);
        java.lang.Class<?> wildcardClass18 = methodArray17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        int int20 = classInfo19.getModifiers();
        int int21 = classInfo19.getModifiers();
        org.mockito.asm.Type[] typeArray22 = classInfo19.getInterfaces();
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type0.getElementType();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.getClassName();
        java.lang.String str2 = type0.toString();
        int int4 = type0.getOpcode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int8 = type0.getSort();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        boolean boolean15 = classInfo13.equals((java.lang.Object) (-1.0f));
        java.lang.String str16 = classInfo13.toString();
        int int17 = classInfo13.getModifiers();
        org.mockito.asm.Type type18 = classInfo13.getSuperType();
        org.mockito.asm.Type type19 = classInfo13.getType();
        org.mockito.asm.Type[] typeArray20 = classInfo13.getInterfaces();
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        java.lang.String str22 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type0.getElementType();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("Z");
        java.lang.reflect.Method method18 = null;
        propertyDescriptor10.setWriteMethod(method18);
        boolean boolean20 = propertyDescriptor10.isPreferred();
        java.lang.Class<?> wildcardClass21 = propertyDescriptor10.getPropertyEditorClass();
        boolean boolean22 = propertyDescriptor10.isPreferred();
        java.lang.reflect.Method method23 = null;
        propertyDescriptor10.setReadMethod(method23);
        boolean boolean25 = propertyDescriptor10.isHidden();
        propertyDescriptor10.setPreferred(true);
        java.lang.Class<?> wildcardClass28 = propertyDescriptor10.getClass();
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        org.mockito.asm.Type type24 = signature2.getReturnType();
        java.lang.String str25 = type24.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type24.getDimensions();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        java.lang.String str13 = signature2.toString();
        org.mockito.asm.Type[] typeArray14 = signature2.getArgumentTypes();
        java.lang.String str15 = signature2.toString();
        java.lang.String str16 = signature2.getName();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type17.getDimensions();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type2, type3 };
        java.lang.String str5 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray4);
        int int6 = type0.getSize();
        int int8 = type0.getOpcode(103);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = type0.getInternalName();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        java.lang.Object obj35 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor29, (java.lang.Object[]) propertyDescriptorArray30);
        org.mockito.cglib.core.MethodInfo methodInfo37 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, 4);
        java.lang.String str38 = org.mockito.asm.Type.getConstructorDescriptor(constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo40 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, (int) (byte) 100);
        org.mockito.cglib.core.MethodInfo methodInfo42 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, (int) (byte) -1);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, 1041);
        org.mockito.cglib.core.ClassInfo classInfo46 = methodInfo45.getClassInfo();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("void", method48, method49);
        propertyDescriptor50.setExpert(true);
        java.lang.String str53 = propertyDescriptor50.getName();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("void", method55, method56);
        propertyDescriptor57.setExpert(false);
        propertyDescriptor57.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor50.createPropertyEditor((java.lang.Object) propertyDescriptor57);
        java.lang.reflect.Method method63 = propertyDescriptor57.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration64 = propertyDescriptor57.attributeNames();
        propertyDescriptor57.setPreferred(true);
        boolean boolean67 = propertyDescriptor57.isPreferred();
        propertyDescriptor57.setConstrained(false);
        propertyDescriptor57.setHidden(false);
        boolean boolean72 = methodInfo45.equals((java.lang.Object) propertyDescriptor57);
        java.lang.String str73 = methodInfo45.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor50 and propertyDescriptor57", propertyDescriptor50.equals(propertyDescriptor57) ? propertyDescriptor50.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("LZ;");
        int int2 = type1.getSize();
        org.mockito.asm.Type type3 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type3.getElementType();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        java.lang.String str25 = signature2.toString();
        java.lang.Class[] classArray26 = new java.lang.Class[] {};
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray26);
        java.lang.Class<?> wildcardClass29 = classArray28.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        boolean boolean32 = classInfo30.equals((java.lang.Object) (-1.0f));
        java.lang.String str33 = classInfo30.toString();
        java.lang.String str34 = classInfo30.toString();
        org.mockito.asm.Type type35 = classInfo30.getSuperType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.VOID_TYPE;
        int int38 = type36.getOpcode((int) (short) 1);
        java.lang.String str39 = type36.getDescriptor();
        int int41 = type36.getOpcode((int) (byte) 100);
        boolean boolean42 = classInfo30.equals((java.lang.Object) int41);
        int int43 = classInfo30.getModifiers();
        int int44 = classInfo30.getModifiers();
        boolean boolean45 = signature2.equals((java.lang.Object) int44);
        java.lang.String str46 = signature2.toString();
        org.mockito.asm.Type type47 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int48 = type47.getDimensions();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        java.lang.Class<?> wildcardClass16 = propertyDescriptor10.getPropertyType();
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        enhancer17.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback20 = null;
        enhancer17.setCallback(callback20);
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray22);
        java.lang.Class<?> wildcardClass25 = classArray24.getClass();
        enhancer17.setSuperclass((java.lang.Class) wildcardClass25);
        org.mockito.cglib.proxy.Enhancer enhancer27 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer27.setNamingPolicy(namingPolicy28);
        enhancer27.setAttemptLoad(false);
        enhancer27.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader35 = enhancer34.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer34.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer34.setNamingPolicy(namingPolicy37);
        boolean boolean39 = enhancer34.getAttemptLoad();
        enhancer34.setInterceptDuringConstruction(false);
        enhancer34.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy44 = enhancer34.getNamingPolicy();
        enhancer27.setNamingPolicy(namingPolicy44);
        enhancer17.setNamingPolicy(namingPolicy44);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor10.createPropertyEditor((java.lang.Object) enhancer17);
        org.mockito.cglib.proxy.Enhancer enhancer48 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader49 = enhancer48.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy50 = enhancer48.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy51 = null;
        enhancer48.setNamingPolicy(namingPolicy51);
        boolean boolean53 = enhancer48.getAttemptLoad();
        enhancer48.setInterceptDuringConstruction(false);
        enhancer48.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy58 = enhancer48.getNamingPolicy();
        boolean boolean59 = enhancer48.getAttemptLoad();
        org.mockito.cglib.proxy.Enhancer enhancer60 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy61 = null;
        enhancer60.setNamingPolicy(namingPolicy61);
        boolean boolean63 = enhancer60.getAttemptLoad();
        java.lang.ClassLoader classLoader64 = enhancer60.getClassLoader();
        enhancer48.setClassLoader(classLoader64);
        enhancer48.setAttemptLoad(true);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass69 = type68.getClass();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        enhancer48.setSuperclass((java.lang.Class) wildcardClass69);
        enhancer48.setUseCache(false);
        org.mockito.cglib.proxy.Enhancer enhancer74 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader75 = enhancer74.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy76 = enhancer74.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy77 = null;
        enhancer74.setNamingPolicy(namingPolicy77);
        boolean boolean79 = enhancer74.getAttemptLoad();
        enhancer74.setInterceptDuringConstruction(false);
        enhancer74.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy84 = enhancer74.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy85 = enhancer74.getNamingPolicy();
        enhancer48.setNamingPolicy(namingPolicy85);
        enhancer17.setNamingPolicy(namingPolicy85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str9 = signature8.getName();
        org.mockito.asm.Type type10 = signature8.getReturnType();
        boolean boolean11 = classInfo4.equals((java.lang.Object) type10);
        java.lang.String str12 = type10.getClassName();
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type16 = signature15.getReturnType();
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        java.lang.Class<?> wildcardClass20 = classArray19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        boolean boolean23 = classInfo21.equals((java.lang.Object) (-1.0f));
        org.mockito.asm.Type type24 = classInfo21.getSuperType();
        org.mockito.asm.Type[] typeArray25 = classInfo21.getInterfaces();
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type10.getElementType();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        org.mockito.asm.Type type11 = signature2.getReturnType();
        int int12 = type11.getSize();
        int int14 = type11.getOpcode(1045);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type11.getElementType();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.Class[] classArray3 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        java.lang.Class<?> wildcardClass4 = classArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str10 = signature9.getName();
        org.mockito.asm.Type type11 = signature9.getReturnType();
        boolean boolean12 = classInfo5.equals((java.lang.Object) type11);
        java.lang.String str13 = type11.getClassName();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str17 = signature16.getName();
        org.mockito.asm.Type[] typeArray18 = signature16.getArgumentTypes();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("I", type11, typeArray18);
        java.lang.String str20 = type11.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = type11.getDimensions();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.String str1 = type0.toString();
        int int3 = type0.getOpcode(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("Lorg/mockito/asm/Type;");
        int int3 = type2.getDimensions();
        org.mockito.asm.Type type4 = type2.getElementType();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("void", method6, method7);
        propertyDescriptor8.setExpert(true);
        java.lang.String str11 = propertyDescriptor8.getName();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("void", method13, method14);
        propertyDescriptor15.setExpert(false);
        propertyDescriptor15.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor8.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor15.setName("Z");
        java.lang.Class<?> wildcardClass23 = propertyDescriptor15.getPropertyEditorClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray31);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader35 = enhancer34.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer34.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer34.setNamingPolicy(namingPolicy37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass40 = enhancer34.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        java.lang.String str42 = classInfo41.toString();
        org.mockito.asm.Type[] typeArray43 = classInfo41.getInterfaces();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray43);
        propertyDescriptor15.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", (java.lang.Object) typeArray43);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type4, typeArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor15", propertyDescriptor8.equals(propertyDescriptor15) ? propertyDescriptor8.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        int int6 = classInfo5.getModifiers();
        int int7 = classInfo5.getModifiers();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        int int9 = type8.getSort();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str13 = signature12.getName();
        org.mockito.asm.Type type14 = signature12.getReturnType();
        org.mockito.asm.Type type15 = signature12.getReturnType();
        org.mockito.asm.Type[] typeArray16 = signature12.getArgumentTypes();
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray16);
        boolean boolean18 = classInfo5.equals((java.lang.Object) type8);
        int int20 = type8.getOpcode(65);
        java.lang.String str21 = type8.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type22 = type8.getElementType();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=Lorg/mockito/cglib/proxy/Enhancer;; shortDescription=void]", method1, method2);
        propertyDescriptor3.setName("(Ljava/lang/Cloneable;Ljava/io/Serializable;)LZ;");
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("void", method7, method8);
        propertyDescriptor9.setExpert(true);
        java.lang.String str12 = propertyDescriptor9.getName();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("void", method14, method15);
        propertyDescriptor16.setExpert(false);
        propertyDescriptor16.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor9.createPropertyEditor((java.lang.Object) propertyDescriptor16);
        java.lang.reflect.Method method22 = propertyDescriptor16.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration23 = propertyDescriptor16.attributeNames();
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor3.createPropertyEditor((java.lang.Object) strEnumeration23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor16", propertyDescriptor9.equals(propertyDescriptor16) ? propertyDescriptor9.hashCode() == propertyDescriptor16.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        java.lang.String str5 = signature2.toString();
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptorArray6.getClass();
        boolean boolean11 = org.mockito.cglib.proxy.Enhancer.isEnhanced((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str13 = type12.getInternalName();
        boolean boolean14 = signature2.equals((java.lang.Object) str13);
        java.lang.String str15 = signature2.getDescriptor();
        java.lang.String str16 = signature2.getDescriptor();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type17.getElementType();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=void; shortDescription=()D; values={char=char}]");
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = null;
        java.beans.PropertyDescriptor propertyDescriptor21 = new java.beans.PropertyDescriptor("void", method19, method20);
        propertyDescriptor21.setExpert(true);
        java.lang.String str24 = propertyDescriptor21.getName();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("void", method26, method27);
        propertyDescriptor28.setExpert(false);
        propertyDescriptor28.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor33 = propertyDescriptor21.createPropertyEditor((java.lang.Object) propertyDescriptor28);
        propertyDescriptor28.setName("Z");
        java.lang.Class<?> wildcardClass36 = propertyDescriptor28.getPropertyEditorClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type40 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type41, type42, type43 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray44);
        org.mockito.cglib.proxy.Enhancer enhancer47 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader48 = enhancer47.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy49 = enhancer47.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy50 = null;
        enhancer47.setNamingPolicy(namingPolicy50);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy52 = enhancer47.getStrategy();
        java.lang.Class<?> wildcardClass53 = enhancer47.getClass();
        org.mockito.cglib.core.ClassInfo classInfo54 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass53);
        java.lang.String str55 = classInfo54.toString();
        org.mockito.asm.Type[] typeArray56 = classInfo54.getInterfaces();
        java.lang.String str57 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray56);
        propertyDescriptor28.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", (java.lang.Object) typeArray56);
        propertyDescriptor28.setConstrained(true);
        propertyDescriptor28.setName("java.beans.PropertyDescriptor[name=short; displayName=org.mockito.cglib.proxy.Enhancer]");
        java.beans.PropertyEditor propertyEditor63 = propertyDescriptor3.createPropertyEditor((java.lang.Object) "java.beans.PropertyDescriptor[name=short; displayName=org.mockito.cglib.proxy.Enhancer]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor21", propertyDescriptor10.equals(propertyDescriptor21) ? propertyDescriptor10.hashCode() == propertyDescriptor21.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int5 = type3.getOpcode(8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type3.getInternalName();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        boolean boolean6 = propertyDescriptor3.isPreferred();
        java.lang.String str7 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setName("void");
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray11, true, true);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray17);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, true);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, false, false);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray30);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray30);
        propertyDescriptor3.setValue("LV;", (java.lang.Object) methodArray33);
        java.lang.reflect.Method method35 = null;
        propertyDescriptor3.setWriteMethod(method35);
        java.lang.reflect.Method method37 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("void", method39, method40);
        propertyDescriptor41.setExpert(true);
        java.lang.String str44 = propertyDescriptor41.getName();
        java.lang.reflect.Method method46 = null;
        java.lang.reflect.Method method47 = null;
        java.beans.PropertyDescriptor propertyDescriptor48 = new java.beans.PropertyDescriptor("void", method46, method47);
        propertyDescriptor48.setExpert(false);
        propertyDescriptor48.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor53 = propertyDescriptor41.createPropertyEditor((java.lang.Object) propertyDescriptor48);
        java.lang.reflect.Method method54 = propertyDescriptor48.getWriteMethod();
        java.lang.reflect.Method method55 = propertyDescriptor48.getReadMethod();
        boolean boolean56 = propertyDescriptor48.isPreferred();
        java.lang.reflect.Method method57 = propertyDescriptor48.getWriteMethod();
        java.beans.PropertyEditor propertyEditor58 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor41 and propertyDescriptor48", propertyDescriptor41.equals(propertyDescriptor48) ? propertyDescriptor41.hashCode() == propertyDescriptor48.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        propertyDescriptor10.setName("Z");
        java.lang.Class<?> wildcardClass18 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("void", method21, method22);
        propertyDescriptor23.setExpert(true);
        java.lang.String str26 = propertyDescriptor23.getName();
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("void", method28, method29);
        propertyDescriptor30.setExpert(false);
        propertyDescriptor30.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor35 = propertyDescriptor23.createPropertyEditor((java.lang.Object) propertyDescriptor30);
        java.lang.reflect.Method method36 = propertyDescriptor30.getWriteMethod();
        java.lang.reflect.Method method37 = propertyDescriptor30.getReadMethod();
        boolean boolean38 = propertyDescriptor30.isPreferred();
        java.lang.reflect.Method method39 = propertyDescriptor30.getWriteMethod();
        propertyDescriptor10.setValue("", (java.lang.Object) propertyDescriptor30);
        propertyDescriptor30.setHidden(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        java.lang.String str25 = signature2.toString();
        org.mockito.asm.Type type26 = signature2.getReturnType();
        org.mockito.asm.Type type27 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type27.getElementType();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int5 = type0.getOpcode((int) (byte) 100);
        boolean boolean7 = type0.equals((java.lang.Object) 'a');
        int int8 = type0.getSort();
        java.lang.String str9 = type0.toString();
        int int10 = type0.getSort();
        java.lang.String str11 = type0.getDescriptor();
        int int12 = type0.getSort();
        int int14 = type0.getOpcode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = type0.getDimensions();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str7 = signature6.getName();
        org.mockito.asm.Type type8 = signature6.getReturnType();
        org.mockito.asm.Type type9 = signature6.getReturnType();
        java.lang.String str10 = signature6.getDescriptor();
        org.mockito.asm.Type[] typeArray11 = signature6.getArgumentTypes();
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type0.getInternalName();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        org.mockito.asm.Type type24 = signature2.getReturnType();
        org.mockito.cglib.proxy.Enhancer enhancer25 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader26 = enhancer25.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy27 = enhancer25.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy28 = null;
        enhancer25.setNamingPolicy(namingPolicy28);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy30 = enhancer25.getStrategy();
        java.lang.Class<?> wildcardClass31 = enhancer25.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer32 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader33 = enhancer32.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy34 = enhancer32.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy35 = null;
        enhancer32.setNamingPolicy(namingPolicy35);
        boolean boolean37 = enhancer32.getAttemptLoad();
        enhancer32.setInterceptDuringConstruction(false);
        enhancer32.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer42 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy43 = null;
        enhancer42.setNamingPolicy(namingPolicy43);
        enhancer42.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray47, true, true);
        java.lang.Class[] classArray51 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray47);
        enhancer42.setInterfaces(classArray51);
        enhancer32.setInterfaces(classArray51);
        java.lang.reflect.Constructor constructor54 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass31, classArray51);
        java.lang.String str55 = org.mockito.asm.Type.getConstructorDescriptor(constructor54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor54);
        org.mockito.cglib.core.MethodInfo methodInfo58 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor54, (int) (short) 10);
        java.lang.String str59 = org.mockito.asm.Type.getConstructorDescriptor(constructor54);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor54);
        org.mockito.cglib.core.MethodInfo methodInfo61 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor54);
        java.lang.reflect.Method method63 = null;
        java.lang.reflect.Method method64 = null;
        java.beans.PropertyDescriptor propertyDescriptor65 = new java.beans.PropertyDescriptor("void", method63, method64);
        propertyDescriptor65.setExpert(true);
        java.util.Enumeration<java.lang.String> strEnumeration68 = propertyDescriptor65.attributeNames();
        java.lang.reflect.Method method71 = null;
        java.lang.reflect.Method method72 = null;
        java.beans.PropertyDescriptor propertyDescriptor73 = new java.beans.PropertyDescriptor("void", method71, method72);
        propertyDescriptor73.setExpert(false);
        java.lang.String str76 = propertyDescriptor73.getName();
        java.lang.String str77 = propertyDescriptor73.getName();
        boolean boolean78 = propertyDescriptor73.isExpert();
        java.lang.String str79 = propertyDescriptor73.getName();
        propertyDescriptor73.setDisplayName("(SSS)S");
        boolean boolean82 = propertyDescriptor73.isExpert();
        propertyDescriptor65.setValue("Lhi!;", (java.lang.Object) boolean82);
        boolean boolean84 = methodInfo61.equals((java.lang.Object) "Lhi!;");
        int int85 = methodInfo61.getModifiers();
        boolean boolean86 = signature2.equals((java.lang.Object) methodInfo61);
        java.lang.String str87 = methodInfo61.toString();
        java.lang.reflect.Method method89 = null;
        java.lang.reflect.Method method90 = null;
        java.beans.PropertyDescriptor propertyDescriptor91 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=void]", method89, method90);
        propertyDescriptor91.setConstrained(false);
        java.lang.Class<?> wildcardClass94 = propertyDescriptor91.getPropertyEditorClass();
        boolean boolean95 = methodInfo61.equals((java.lang.Object) wildcardClass94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor65 and propertyDescriptor91", propertyDescriptor65.equals(propertyDescriptor91) ? propertyDescriptor65.hashCode() == propertyDescriptor91.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        java.lang.String str3 = type0.getDescriptor();
        int int4 = type0.getSort();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.VOID_TYPE;
        int int10 = type8.getOpcode((int) (short) 1);
        java.lang.String str11 = type8.getDescriptor();
        int int13 = type8.getOpcode((int) (byte) 100);
        boolean boolean14 = signature7.equals((java.lang.Object) int13);
        java.lang.String str15 = signature7.getDescriptor();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean17 = signature7.equals((java.lang.Object) type16);
        java.lang.String str18 = signature7.toString();
        org.mockito.asm.Type[] typeArray19 = signature7.getArgumentTypes();
        org.mockito.asm.Type[] typeArray20 = signature7.getArgumentTypes();
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type23 = type0.getElementType();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        int int5 = type3.getOpcode(8);
        java.lang.String str6 = type3.getClassName();
        int int7 = type3.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type3.getElementType();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        org.mockito.asm.Type type24 = signature2.getReturnType();
        java.lang.String str25 = type24.getClassName();
        java.lang.String str26 = type24.toString();
        int int28 = type24.getOpcode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type29 = type24.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        int int3 = type0.getSort();
        boolean boolean5 = type0.equals((java.lang.Object) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L(SSS)S;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int1 = type0.getSize();
        int int2 = type0.getSize();
        int int3 = type0.getSize();
        int int5 = type0.getOpcode(1045);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("S", "java.lang.Object()B");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V");
        java.lang.String str2 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("V");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; expert]");
        int int3 = type2.getSort();
        int int4 = type2.getDimensions();
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("void", method6, method7);
        propertyDescriptor8.setExpert(true);
        java.lang.String str11 = propertyDescriptor8.getName();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("void", method13, method14);
        propertyDescriptor15.setExpert(false);
        propertyDescriptor15.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor8.createPropertyEditor((java.lang.Object) propertyDescriptor15);
        propertyDescriptor15.setName("Z");
        java.lang.Class<?> wildcardClass23 = propertyDescriptor15.getPropertyEditorClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("V");
        org.mockito.asm.Type type27 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type28, type29, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray31);
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray31);
        org.mockito.cglib.proxy.Enhancer enhancer34 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader35 = enhancer34.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy36 = enhancer34.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy37 = null;
        enhancer34.setNamingPolicy(namingPolicy37);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy39 = enhancer34.getStrategy();
        java.lang.Class<?> wildcardClass40 = enhancer34.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        java.lang.String str42 = classInfo41.toString();
        org.mockito.asm.Type[] typeArray43 = classInfo41.getInterfaces();
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray43);
        propertyDescriptor15.setValue("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V", (java.lang.Object) typeArray43);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=org.mockito.cglib.proxy.Enhancer]]", type2, typeArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor8 and propertyDescriptor15", propertyDescriptor8.equals(propertyDescriptor15) ? propertyDescriptor8.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        java.lang.String str6 = signature2.getDescriptor();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        java.lang.Class<?> wildcardClass8 = type7.getClass();
        boolean boolean9 = signature2.equals((java.lang.Object) type7);
        java.lang.String str10 = signature2.getName();
        org.mockito.asm.Type type11 = signature2.getReturnType();
        int int12 = type11.getSort();
        int int13 = type11.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type11.getElementType();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getDescriptor();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        org.mockito.asm.Type type25 = signature2.getReturnType();
        org.mockito.asm.Type[] typeArray27 = org.mockito.asm.Type.getArgumentTypes("(SSS)Lorg/mockito/asm/Type;");
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray27);
        java.lang.String str29 = type25.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type25.getDimensions();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray2 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray0);
        java.lang.Class<?> wildcardClass3 = classArray2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str6 = type5.toString();
        java.lang.String str7 = type5.getInternalName();
        int int8 = type5.getSort();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean10 = type5.equals((java.lang.Object) type9);
        int int11 = type9.getSize();
        java.lang.String str12 = type9.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = type9.getInternalName();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int2 = type0.getOpcode((int) (short) 1);
        int int3 = type0.getSort();
        java.lang.String str4 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("()Lava.beans.PropertyDescriptor[name=void;");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("void", method3, method4);
        propertyDescriptor5.setExpert(true);
        java.lang.String str8 = propertyDescriptor5.getName();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("void", method10, method11);
        propertyDescriptor12.setExpert(false);
        propertyDescriptor12.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor17 = propertyDescriptor5.createPropertyEditor((java.lang.Object) propertyDescriptor12);
        java.lang.reflect.Method method18 = propertyDescriptor12.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration19 = propertyDescriptor12.attributeNames();
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=short]");
        java.lang.Class<?> wildcardClass22 = propertyDescriptor12.getPropertyEditorClass();
        boolean boolean23 = type1.equals((java.lang.Object) wildcardClass22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor12", propertyDescriptor5.equals(propertyDescriptor12) ? propertyDescriptor5.hashCode() == propertyDescriptor12.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        java.lang.String str25 = signature2.toString();
        org.mockito.asm.Type type26 = signature2.getReturnType();
        org.mockito.asm.Type type27 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = type27.getInternalName();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(103);
        java.lang.String str8 = type5.getDescriptor();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        java.lang.Class<?> wildcardClass12 = classArray11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        boolean boolean15 = classInfo13.equals((java.lang.Object) (-1.0f));
        int int16 = classInfo13.getModifiers();
        org.mockito.asm.Type[] typeArray17 = classInfo13.getInterfaces();
        org.mockito.asm.Type[] typeArray18 = classInfo13.getInterfaces();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type5.getInternalName();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        java.lang.reflect.Method method16 = propertyDescriptor10.getWriteMethod();
        boolean boolean17 = propertyDescriptor10.isHidden();
        java.lang.Class<?> wildcardClass18 = propertyDescriptor10.getPropertyEditorClass();
        java.lang.String str19 = propertyDescriptor10.getDisplayName();
        org.mockito.cglib.proxy.Enhancer enhancer21 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader22 = enhancer21.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy23 = enhancer21.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy24 = null;
        enhancer21.setNamingPolicy(namingPolicy24);
        boolean boolean26 = enhancer21.getAttemptLoad();
        enhancer21.setInterceptDuringConstruction(false);
        enhancer21.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy31 = enhancer21.getNamingPolicy();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy32 = enhancer21.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy33 = enhancer21.getNamingPolicy();
        enhancer21.setUseFactory(false);
        propertyDescriptor10.setValue("java.beans.PropertyDescriptor[name=void; shortDescription=()D; values={char=char}]", (java.lang.Object) false);
        boolean boolean37 = propertyDescriptor10.isPreferred();
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("org/mockito/cglib/core/AbstractClassGenerator", "org/mockito/cglib/proxy/Enhancer");
        java.beans.PropertyEditor propertyEditor41 = propertyDescriptor10.createPropertyEditor((java.lang.Object) signature40);
        java.lang.String str42 = signature40.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("(SSS)S");
        java.lang.String str2 = type1.toString();
        java.lang.String str3 = type1.getInternalName();
        int int4 = type1.getSize();
        java.lang.String str5 = type1.getInternalName();
        org.mockito.asm.Type type6 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type0.getElementType();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=Z]", method1, method2);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        java.lang.reflect.Method method13 = propertyDescriptor10.getReadMethod();
        java.lang.String str14 = propertyDescriptor10.getName();
        java.lang.reflect.Method method15 = propertyDescriptor10.getWriteMethod();
        boolean boolean16 = propertyDescriptor10.isExpert();
        propertyDescriptor10.setShortDescription("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; shortDescription=java.beans.PropertyDescriptor[name=I]]");
        propertyDescriptor10.setName("java/beans/PropertyDescriptor");
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("void", method22, method23);
        propertyDescriptor24.setExpert(false);
        propertyDescriptor24.setBound(false);
        java.lang.String str29 = propertyDescriptor24.getDisplayName();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor10.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("short", (java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setExpert(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor24", propertyDescriptor10.equals(propertyDescriptor24) ? propertyDescriptor10.hashCode() == propertyDescriptor24.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type0.getInternalName();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        java.lang.String str30 = org.mockito.asm.Type.getConstructorDescriptor(constructor29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        java.lang.String str33 = org.mockito.asm.Type.getConstructorDescriptor(constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo35 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, 10);
        org.mockito.cglib.core.MethodInfo methodInfo36 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo38 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, (int) ' ');
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("void", method40, method41);
        propertyDescriptor42.setExpert(false);
        propertyDescriptor42.setDisplayName("()LV;");
        java.lang.Class<?> wildcardClass47 = propertyDescriptor42.getPropertyType();
        java.lang.Class[] classArray49 = new java.lang.Class[] {};
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        java.lang.Class[] classArray51 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray49);
        java.lang.Class<?> wildcardClass52 = classArray51.getClass();
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass52);
        boolean boolean55 = classInfo53.equals((java.lang.Object) (-1.0f));
        java.lang.String str56 = classInfo53.toString();
        org.mockito.asm.Type type57 = classInfo53.getSuperType();
        propertyDescriptor42.setValue("Z", (java.lang.Object) type57);
        java.lang.String str59 = type57.getDescriptor();
        boolean boolean60 = methodInfo38.equals((java.lang.Object) str59);
        java.lang.reflect.Method method62 = null;
        java.lang.reflect.Method method63 = null;
        java.beans.PropertyDescriptor propertyDescriptor64 = new java.beans.PropertyDescriptor("void", method62, method63);
        propertyDescriptor64.setExpert(false);
        propertyDescriptor64.setName("(SSS)[Ljava/lang/Class;");
        propertyDescriptor64.setHidden(true);
        java.lang.Object obj72 = propertyDescriptor64.getValue("org/mockito/asm/Type");
        propertyDescriptor64.setName("Ljava/lang/Class;");
        java.lang.reflect.Method method75 = propertyDescriptor64.getReadMethod();
        boolean boolean76 = methodInfo38.equals((java.lang.Object) method75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor42 and propertyDescriptor64", propertyDescriptor42.equals(propertyDescriptor64) ? propertyDescriptor42.hashCode() == propertyDescriptor64.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str11 = signature10.getName();
        org.mockito.asm.Type type12 = signature10.getReturnType();
        org.mockito.asm.Type type13 = signature10.getReturnType();
        boolean boolean14 = classInfo7.equals((java.lang.Object) signature10);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer15.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer15.setNamingPolicy(namingPolicy18);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass21 = enhancer15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.lang.String str23 = classInfo22.toString();
        org.mockito.asm.Type[] typeArray24 = classInfo22.getInterfaces();
        boolean boolean25 = signature10.equals((java.lang.Object) classInfo22);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        int int30 = type29.getSize();
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.Class<?> wildcardClass34 = classArray33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = classInfo35.getSuperType();
        java.lang.String str37 = classInfo35.toString();
        int int38 = classInfo35.getModifiers();
        boolean boolean39 = type29.equals((java.lang.Object) classInfo35);
        boolean boolean40 = signature10.equals((java.lang.Object) classInfo35);
        org.mockito.asm.Type type41 = classInfo35.getType();
        org.mockito.asm.Type type42 = classInfo35.getSuperType();
        int int43 = classInfo35.getModifiers();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("void", method45, method46);
        propertyDescriptor47.setExpert(true);
        java.lang.String str50 = propertyDescriptor47.getName();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("void", method52, method53);
        propertyDescriptor54.setExpert(false);
        propertyDescriptor54.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor47.createPropertyEditor((java.lang.Object) propertyDescriptor54);
        propertyDescriptor54.setName("Z");
        java.lang.reflect.Method method62 = null;
        propertyDescriptor54.setWriteMethod(method62);
        boolean boolean64 = propertyDescriptor54.isPreferred();
        java.util.Enumeration<java.lang.String> strEnumeration65 = propertyDescriptor54.attributeNames();
        java.lang.reflect.Method method66 = propertyDescriptor54.getReadMethod();
        boolean boolean67 = classInfo35.equals((java.lang.Object) propertyDescriptor54);
        java.lang.reflect.Method method69 = null;
        java.lang.reflect.Method method70 = null;
        java.beans.PropertyDescriptor propertyDescriptor71 = new java.beans.PropertyDescriptor("short", method69, method70);
        java.lang.reflect.Method method72 = null;
        propertyDescriptor71.setReadMethod(method72);
        propertyDescriptor71.setPreferred(false);
        boolean boolean76 = classInfo35.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor47 and propertyDescriptor54", propertyDescriptor47.equals(propertyDescriptor54) ? propertyDescriptor47.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=Z]", method1, method2);
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        java.lang.reflect.Method method13 = propertyDescriptor10.getReadMethod();
        java.lang.String str14 = propertyDescriptor10.getName();
        java.lang.reflect.Method method15 = propertyDescriptor10.getWriteMethod();
        boolean boolean16 = propertyDescriptor10.isExpert();
        propertyDescriptor10.setShortDescription("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; shortDescription=java.beans.PropertyDescriptor[name=I]]");
        propertyDescriptor10.setName("java/beans/PropertyDescriptor");
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = null;
        java.beans.PropertyDescriptor propertyDescriptor24 = new java.beans.PropertyDescriptor("void", method22, method23);
        propertyDescriptor24.setExpert(false);
        propertyDescriptor24.setBound(false);
        java.lang.String str29 = propertyDescriptor24.getDisplayName();
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor10.createPropertyEditor((java.lang.Object) propertyDescriptor24);
        propertyDescriptor3.setValue("short", (java.lang.Object) propertyDescriptor24);
        propertyDescriptor24.setExpert(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor10", propertyDescriptor3.equals(propertyDescriptor10) ? propertyDescriptor3.hashCode() == propertyDescriptor10.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        java.lang.String str30 = org.mockito.asm.Type.getConstructorDescriptor(constructor29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo33 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, (int) (byte) 100);
        int int34 = methodInfo33.getModifiers();
        org.mockito.cglib.core.ClassInfo classInfo35 = methodInfo33.getClassInfo();
        java.lang.reflect.Method method37 = null;
        java.lang.reflect.Method method38 = null;
        java.beans.PropertyDescriptor propertyDescriptor39 = new java.beans.PropertyDescriptor("void", method37, method38);
        propertyDescriptor39.setExpert(true);
        java.lang.String str42 = propertyDescriptor39.getName();
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("void", method44, method45);
        propertyDescriptor46.setExpert(false);
        propertyDescriptor46.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor51 = propertyDescriptor39.createPropertyEditor((java.lang.Object) propertyDescriptor46);
        java.lang.Class<?> wildcardClass52 = propertyDescriptor46.getPropertyType();
        org.mockito.cglib.proxy.Enhancer enhancer53 = new org.mockito.cglib.proxy.Enhancer();
        enhancer53.setUseFactory(true);
        org.mockito.cglib.proxy.Callback callback56 = null;
        enhancer53.setCallback(callback56);
        java.lang.Class[] classArray58 = new java.lang.Class[] {};
        java.lang.String[] strArray59 = org.mockito.cglib.core.ReflectUtils.getNames(classArray58);
        java.lang.Class[] classArray60 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray58);
        java.lang.Class<?> wildcardClass61 = classArray60.getClass();
        enhancer53.setSuperclass((java.lang.Class) wildcardClass61);
        org.mockito.cglib.proxy.Enhancer enhancer63 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy64 = null;
        enhancer63.setNamingPolicy(namingPolicy64);
        enhancer63.setAttemptLoad(false);
        enhancer63.setAttemptLoad(true);
        org.mockito.cglib.proxy.Enhancer enhancer70 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader71 = enhancer70.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy72 = enhancer70.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy73 = null;
        enhancer70.setNamingPolicy(namingPolicy73);
        boolean boolean75 = enhancer70.getAttemptLoad();
        enhancer70.setInterceptDuringConstruction(false);
        enhancer70.setInterceptDuringConstruction(true);
        org.mockito.cglib.core.NamingPolicy namingPolicy80 = enhancer70.getNamingPolicy();
        enhancer63.setNamingPolicy(namingPolicy80);
        enhancer53.setNamingPolicy(namingPolicy80);
        java.beans.PropertyEditor propertyEditor83 = propertyDescriptor46.createPropertyEditor((java.lang.Object) enhancer53);
        boolean boolean84 = methodInfo33.equals((java.lang.Object) propertyEditor83);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor39 and propertyDescriptor46", propertyDescriptor39.equals(propertyDescriptor46) ? propertyDescriptor39.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.lang.String str8 = classInfo7.toString();
        org.mockito.asm.Type[] typeArray9 = classInfo7.getInterfaces();
        org.mockito.asm.Type type10 = classInfo7.getSuperType();
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type13 = classInfo12.getType();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("void", method15, method16);
        propertyDescriptor17.setExpert(false);
        propertyDescriptor17.setName("(SSS)[Ljava/lang/Class;");
        boolean boolean22 = propertyDescriptor17.isPreferred();
        boolean boolean23 = propertyDescriptor17.isHidden();
        java.lang.reflect.Method method24 = propertyDescriptor17.getWriteMethod();
        propertyDescriptor17.setBound(false);
        propertyDescriptor17.setName("[Ljava/lang/Class;");
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("void", method31, method32);
        propertyDescriptor33.setExpert(false);
        propertyDescriptor33.setName("(SSS)[Ljava/lang/Class;");
        boolean boolean38 = propertyDescriptor33.isPreferred();
        boolean boolean39 = propertyDescriptor33.isHidden();
        java.lang.reflect.Method method40 = null;
        propertyDescriptor33.setReadMethod(method40);
        java.lang.reflect.Method method42 = propertyDescriptor33.getReadMethod();
        propertyDescriptor33.setExpert(true);
        propertyDescriptor17.setValue("java.beans.PropertyDescriptor[name=void; values={=[Ljava/lang/Class;}]", (java.lang.Object) propertyDescriptor33);
        propertyDescriptor33.setExpert(true);
        boolean boolean48 = classInfo12.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor33", propertyDescriptor17.equals(propertyDescriptor33) ? propertyDescriptor17.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = signature2.getReturnType();
        int int7 = type5.getOpcode(103);
        int int8 = type5.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type5.getDimensions();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type7, type8 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray9);
        int int12 = type4.getSort();
        java.lang.String str13 = type4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = type4.getDimensions();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
        java.lang.String str5 = signature2.toString();
        org.mockito.asm.Type type6 = signature2.getReturnType();
        int int7 = type6.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type6.getElementType();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        java.lang.String str13 = signature2.getDescriptor();
        java.lang.String str14 = signature2.getName();
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer15.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer15.setNamingPolicy(namingPolicy18);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass21 = enhancer15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.lang.String str23 = classInfo22.toString();
        org.mockito.asm.Type type24 = classInfo22.getSuperType();
        boolean boolean25 = signature2.equals((java.lang.Object) classInfo22);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("char", method27, method28);
        boolean boolean30 = classInfo22.equals((java.lang.Object) propertyDescriptor29);
        java.lang.reflect.Method method31 = propertyDescriptor29.getReadMethod();
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = null;
        java.beans.PropertyDescriptor propertyDescriptor36 = new java.beans.PropertyDescriptor("void", method34, method35);
        propertyDescriptor36.setExpert(true);
        java.lang.String str39 = propertyDescriptor36.getName();
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("void", method41, method42);
        propertyDescriptor43.setExpert(false);
        propertyDescriptor43.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor36.createPropertyEditor((java.lang.Object) propertyDescriptor43);
        java.lang.reflect.Method method49 = propertyDescriptor43.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration50 = propertyDescriptor43.attributeNames();
        propertyDescriptor43.setPreferred(true);
        boolean boolean53 = propertyDescriptor43.isPreferred();
        propertyDescriptor29.setValue("org/mockito/cglib/core/ReflectUtils$3", (java.lang.Object) propertyDescriptor43);
        java.lang.Object obj56 = propertyDescriptor43.getValue("java.beans.PropertyDescriptor[name=(Ljava/lang/Cloneable;Ljava/io/Serializable;)[Ljava/lang/Class;]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor29 and propertyDescriptor36", propertyDescriptor29.equals(propertyDescriptor36) ? propertyDescriptor29.hashCode() == propertyDescriptor36.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = propertyDescriptorArray0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type10, type11 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray12);
        int int14 = type8.getSize();
        int int16 = type8.getOpcode(103);
        boolean boolean17 = classInfo7.equals((java.lang.Object) type8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = type8.getDimensions();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str11 = signature10.getName();
        org.mockito.asm.Type type12 = signature10.getReturnType();
        org.mockito.asm.Type type13 = signature10.getReturnType();
        boolean boolean14 = classInfo7.equals((java.lang.Object) signature10);
        org.mockito.cglib.proxy.Enhancer enhancer15 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader16 = enhancer15.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy17 = enhancer15.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer15.setNamingPolicy(namingPolicy18);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy20 = enhancer15.getStrategy();
        java.lang.Class<?> wildcardClass21 = enhancer15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.lang.String str23 = classInfo22.toString();
        org.mockito.asm.Type[] typeArray24 = classInfo22.getInterfaces();
        boolean boolean25 = signature10.equals((java.lang.Object) classInfo22);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type29 = signature28.getReturnType();
        int int30 = type29.getSize();
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray33 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray31);
        java.lang.Class<?> wildcardClass34 = classArray33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type36 = classInfo35.getSuperType();
        java.lang.String str37 = classInfo35.toString();
        int int38 = classInfo35.getModifiers();
        boolean boolean39 = type29.equals((java.lang.Object) classInfo35);
        boolean boolean40 = signature10.equals((java.lang.Object) classInfo35);
        org.mockito.asm.Type type41 = classInfo35.getType();
        org.mockito.asm.Type type42 = classInfo35.getSuperType();
        int int43 = classInfo35.getModifiers();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("void", method45, method46);
        propertyDescriptor47.setExpert(true);
        java.lang.String str50 = propertyDescriptor47.getName();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("void", method52, method53);
        propertyDescriptor54.setExpert(false);
        propertyDescriptor54.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor59 = propertyDescriptor47.createPropertyEditor((java.lang.Object) propertyDescriptor54);
        propertyDescriptor54.setName("Z");
        java.lang.reflect.Method method62 = null;
        propertyDescriptor54.setWriteMethod(method62);
        boolean boolean64 = propertyDescriptor54.isPreferred();
        java.util.Enumeration<java.lang.String> strEnumeration65 = propertyDescriptor54.attributeNames();
        java.lang.reflect.Method method66 = propertyDescriptor54.getReadMethod();
        boolean boolean67 = classInfo35.equals((java.lang.Object) propertyDescriptor54);
        org.mockito.asm.Type[] typeArray68 = classInfo35.getInterfaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor47 and propertyDescriptor54", propertyDescriptor47.equals(propertyDescriptor54) ? propertyDescriptor47.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
        java.lang.Class<?> wildcardClass4 = methodArray3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        int int6 = classInfo5.getModifiers();
        int int7 = classInfo5.getModifiers();
        org.mockito.asm.Type[] typeArray8 = classInfo5.getInterfaces();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("void", method10, method11);
        propertyDescriptor12.setExpert(false);
        java.lang.reflect.Method method15 = propertyDescriptor12.getReadMethod();
        java.lang.String str16 = propertyDescriptor12.getName();
        java.lang.reflect.Method method17 = propertyDescriptor12.getWriteMethod();
        boolean boolean18 = propertyDescriptor12.isExpert();
        propertyDescriptor12.setShortDescription("java.beans.PropertyDescriptor[name=(SSS)[Ljava/lang/Class;; shortDescription=java.beans.PropertyDescriptor[name=I]]");
        propertyDescriptor12.setName("java/beans/PropertyDescriptor");
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("void", method24, method25);
        propertyDescriptor26.setExpert(false);
        propertyDescriptor26.setBound(false);
        java.lang.String str31 = propertyDescriptor26.getDisplayName();
        java.beans.PropertyEditor propertyEditor32 = propertyDescriptor12.createPropertyEditor((java.lang.Object) propertyDescriptor26);
        boolean boolean33 = classInfo5.equals((java.lang.Object) propertyDescriptor26);
        org.mockito.asm.Type type34 = classInfo5.getSuperType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor26", propertyDescriptor12.equals(propertyDescriptor26) ? propertyDescriptor12.hashCode() == propertyDescriptor26.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        int int2 = type0.getOpcode(100);
        org.mockito.asm.Type[] typeArray3 = new org.mockito.asm.Type[] {};
        java.lang.String str4 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray3);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Ljava/lang/Class;", "(SSS)V");
        org.mockito.asm.Type type3 = signature2.getReturnType();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        java.lang.String str5 = type4.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type4.getInternalName();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("I");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        java.lang.String str10 = signature2.getDescriptor();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.SHORT_TYPE;
        boolean boolean12 = signature2.equals((java.lang.Object) type11);
        java.lang.String str13 = signature2.toString();
        org.mockito.asm.Type[] typeArray14 = signature2.getArgumentTypes();
        java.lang.String str15 = signature2.toString();
        java.lang.String str16 = signature2.getName();
        org.mockito.asm.Type type17 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type17.getInternalName();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.VOID_TYPE;
        int int5 = type3.getOpcode((int) (short) 1);
        java.lang.String str6 = type3.getDescriptor();
        int int8 = type3.getOpcode((int) (byte) 100);
        boolean boolean9 = signature2.equals((java.lang.Object) int8);
        org.mockito.asm.Type[] typeArray10 = signature2.getArgumentTypes();
        java.lang.String str11 = signature2.toString();
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.Class<?> wildcardClass15 = classArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        boolean boolean18 = classInfo16.equals((java.lang.Object) (-1.0f));
        java.lang.String str19 = classInfo16.toString();
        java.lang.String str20 = classInfo16.toString();
        org.mockito.asm.Type type21 = classInfo16.getSuperType();
        java.lang.String str22 = classInfo16.toString();
        boolean boolean23 = signature2.equals((java.lang.Object) classInfo16);
        java.lang.String str24 = signature2.getName();
        org.mockito.asm.Type type25 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = type25.getInternalName();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        int int1 = type0.getSort();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "(SSS)S");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type6 = signature4.getReturnType();
        org.mockito.asm.Type type7 = signature4.getReturnType();
        org.mockito.asm.Type[] typeArray8 = signature4.getArgumentTypes();
        java.lang.String str9 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type0.getInternalName();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("void", method1, method2);
        propertyDescriptor3.setExpert(true);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("void", method8, method9);
        propertyDescriptor10.setExpert(false);
        propertyDescriptor10.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor15 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor10);
        java.lang.reflect.Method method16 = propertyDescriptor10.getWriteMethod();
        propertyDescriptor10.setShortDescription("java.beans.PropertyDescriptor[name=I; propertyEditorClass=class [Ljava.lang.Class;]");
        java.lang.String str19 = propertyDescriptor10.getShortDescription();
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = null;
        java.beans.PropertyDescriptor propertyDescriptor23 = new java.beans.PropertyDescriptor("void", method21, method22);
        propertyDescriptor23.setExpert(false);
        java.lang.String str26 = propertyDescriptor23.getName();
        java.lang.String str27 = propertyDescriptor23.getName();
        boolean boolean28 = propertyDescriptor23.isExpert();
        propertyDescriptor23.setShortDescription("void");
        propertyDescriptor23.setName("Lorg/mockito/cglib/proxy/Enhancer;");
        java.util.Enumeration<java.lang.String> strEnumeration33 = propertyDescriptor23.attributeNames();
        java.lang.Object obj35 = propertyDescriptor23.getValue("");
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor10.createPropertyEditor((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor23", propertyDescriptor3.equals(propertyDescriptor23) ? propertyDescriptor3.hashCode() == propertyDescriptor23.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(Ljava/lang/Cloneable;Ljava/io/Serializable;)V");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.proxy.Enhancer enhancer0 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader1 = enhancer0.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy2 = enhancer0.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy3 = null;
        enhancer0.setNamingPolicy(namingPolicy3);
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy5 = enhancer0.getStrategy();
        java.lang.Class<?> wildcardClass6 = enhancer0.getClass();
        org.mockito.cglib.proxy.Enhancer enhancer7 = new org.mockito.cglib.proxy.Enhancer();
        java.lang.ClassLoader classLoader8 = enhancer7.getClassLoader();
        org.mockito.cglib.core.GeneratorStrategy generatorStrategy9 = enhancer7.getStrategy();
        org.mockito.cglib.core.NamingPolicy namingPolicy10 = null;
        enhancer7.setNamingPolicy(namingPolicy10);
        boolean boolean12 = enhancer7.getAttemptLoad();
        enhancer7.setInterceptDuringConstruction(false);
        enhancer7.setInterceptDuringConstruction(true);
        org.mockito.cglib.proxy.Enhancer enhancer17 = new org.mockito.cglib.proxy.Enhancer();
        org.mockito.cglib.core.NamingPolicy namingPolicy18 = null;
        enhancer17.setNamingPolicy(namingPolicy18);
        enhancer17.setUseCache(true);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        enhancer17.setInterfaces(classArray26);
        enhancer7.setInterfaces(classArray26);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass6, classArray26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = new java.beans.PropertyDescriptor[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        java.lang.Object obj35 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor29, (java.lang.Object[]) propertyDescriptorArray30);
        org.mockito.cglib.core.MethodInfo methodInfo37 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, 4);
        java.lang.String str38 = org.mockito.asm.Type.getConstructorDescriptor(constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo40 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, (int) (byte) 100);
        org.mockito.cglib.core.MethodInfo methodInfo42 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, (int) (byte) -1);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor29);
        org.mockito.cglib.core.MethodInfo methodInfo45 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor29, 1041);
        org.mockito.cglib.core.ClassInfo classInfo46 = methodInfo45.getClassInfo();
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("void", method48, method49);
        propertyDescriptor50.setExpert(true);
        java.lang.String str53 = propertyDescriptor50.getName();
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("void", method55, method56);
        propertyDescriptor57.setExpert(false);
        propertyDescriptor57.setName("(SSS)[Ljava/lang/Class;");
        java.beans.PropertyEditor propertyEditor62 = propertyDescriptor50.createPropertyEditor((java.lang.Object) propertyDescriptor57);
        java.lang.reflect.Method method63 = propertyDescriptor57.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration64 = propertyDescriptor57.attributeNames();
        propertyDescriptor57.setPreferred(true);
        boolean boolean67 = propertyDescriptor57.isPreferred();
        propertyDescriptor57.setConstrained(false);
        propertyDescriptor57.setHidden(false);
        boolean boolean72 = methodInfo45.equals((java.lang.Object) propertyDescriptor57);
        int int73 = methodInfo45.getModifiers();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor50 and propertyDescriptor57", propertyDescriptor50.equals(propertyDescriptor57) ? propertyDescriptor50.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("java.beans.PropertyDescriptor[name=void; shortDescription=()D; values={char=char}]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }
}


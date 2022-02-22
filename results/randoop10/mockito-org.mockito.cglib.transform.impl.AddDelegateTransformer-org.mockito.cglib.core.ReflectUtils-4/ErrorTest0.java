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
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray4 = new java.lang.Class[] {};
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.Class<?> wildcardClass13 = classInfo11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray15, true, false);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray19);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray26);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(153, 112, "L319431409", "org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!; constrained]", strArray16);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray22);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray25);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray16 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray16);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(8, 128, "(IZ)Lhi!;", "char", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", strArray11);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, false, true);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(7, 116, "org.mockito.asm.Type", "(IZ)C", "L1619796034", strArray12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("L546622177");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean16 = classInfo13.equals((java.lang.Object) type15);
        org.mockito.asm.Type[] typeArray17 = classInfo13.getInterfaces();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(157, 0, "boolean", type7, typeArray17, "S");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = classInfo6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type7.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean9 = classInfo6.equals((java.lang.Object) type8);
        org.mockito.asm.Type type10 = classInfo6.getSuperType();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean24 = classInfo22.equals((java.lang.Object) type23);
        java.lang.String str25 = type23.toString();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type10, type12, type14, type15, type23 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type28 = type0.getElementType();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = classInfo6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.toString();
        boolean boolean11 = type7.equals((java.lang.Object) "L284401382");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type7.getElementType();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean15 = classInfo12.equals((java.lang.Object) type14);
        int int16 = classInfo12.getModifiers();
        org.mockito.asm.Type type17 = classInfo12.getType();
        org.mockito.asm.Type type18 = type17.getElementType();
        int int20 = type17.getOpcode(2);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        int int32 = type31.getSort();
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean38 = classInfo35.equals((java.lang.Object) type37);
        int int39 = classInfo35.getModifiers();
        org.mockito.asm.Type[] typeArray40 = classInfo35.getInterfaces();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field((int) (short) 1, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]", type17, (java.lang.Object) type29);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type1.getDimensions();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(10);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.String str8 = type6.getInternalName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray17);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray27 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray28);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        java.lang.String str16 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type1.getInternalName();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(158, (int) '#', "L1596763117", "C", "Z", strArray12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type15 = local14.getType();
        java.lang.String str16 = type15.toString();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = propertyDescriptorArray23.getClass();
        java.lang.String str25 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type34.getOpcode(5);
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local((-1), type34);
        org.mockito.asm.Type type38 = local37.getType();
        java.lang.String str39 = type38.toString();
        java.lang.Class<?> wildcardClass40 = type38.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        int int44 = type43.getSort();
        java.lang.Class<?> wildcardClass45 = type43.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.Class[] classArray48 = new java.lang.Class[] { wildcardClass17, wildcardClass24, wildcardClass29, wildcardClass40, wildcardClass45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(154, 7, "S", "double", "org/mockito/asm/Type", strArray49);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean14 = classInfo11.equals((java.lang.Object) type13);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        int int21 = classInfo20.getModifiers();
        org.mockito.asm.Type[] typeArray22 = classInfo20.getInterfaces();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(7, (int) (byte) 0, "", type13, typeArray22, "L60891335");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        java.lang.Class<?> wildcardClass17 = classInfo15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray24);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        boolean boolean11 = type1.equals((java.lang.Object) propertyDescriptorArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type1.getInternalName();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type12 = classInfo11.getType();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        org.mockito.asm.Type[] typeArray15 = org.mockito.asm.Type.getArgumentTypes("(IZ)Lhi!;");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.begin_class(0, 100, "char", type13, typeArray15, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        int int7 = classInfo6.getModifiers();
        org.mockito.asm.Type type8 = classInfo6.getSuperType();
        org.mockito.asm.Type type9 = classInfo6.getSuperType();
        org.mockito.asm.Type[] typeArray10 = classInfo6.getInterfaces();
        boolean boolean11 = type0.equals((java.lang.Object) classInfo6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = type0.getInternalName();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type9, type11 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray15);
        boolean boolean18 = signature4.equals((java.lang.Object) typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        int int21 = type0.getOpcode((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = type0.getInternalName();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        int int16 = classInfo15.getModifiers();
        org.mockito.asm.Type type17 = classInfo15.getSuperType();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        int int24 = classInfo23.getModifiers();
        int int25 = classInfo23.getModifiers();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        boolean boolean31 = classInfo23.equals((java.lang.Object) wildcardClass29);
        org.mockito.asm.Type[] typeArray32 = classInfo23.getInterfaces();
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.begin_class((int) '#', (int) (byte) 100, "L26868905", type9, typeArray32, "()Ljava/lang/Object;");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(10);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.String str18 = type16.getInternalName();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type22.getOpcode(5);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type26 = local25.getType();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type20, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray27);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        int int38 = type37.getSort();
        java.lang.Class<?> wildcardClass39 = type37.getClass();
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type[] typeArray41 = classInfo40.getInterfaces();
        java.lang.Class<?> wildcardClass42 = classInfo40.getClass();
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray44, true, false);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray35, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(2, 0, "", "L746262037", "org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]", strArray32);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type9, type11 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray15);
        boolean boolean18 = signature4.equals((java.lang.Object) typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type0.getDimensions();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        java.lang.Class<?> wildcardClass20 = classInfo18.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray27);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L746262037");
        java.lang.String str9 = type8.getClassName();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean18 = classInfo15.equals((java.lang.Object) type17);
        org.mockito.asm.Type[] typeArray19 = classInfo15.getInterfaces();
        org.mockito.asm.Type type20 = classInfo15.getSuperType();
        org.mockito.asm.Type type21 = classInfo15.getType();
        org.mockito.asm.Type type22 = classInfo15.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(96, "Ljava/lang/Object;", type8, (java.lang.Object) type22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type type14 = local13.getType();
        java.lang.String str15 = type14.toString();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = propertyDescriptorArray22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode(5);
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((-1), type33);
        org.mockito.asm.Type type37 = local36.getType();
        java.lang.String str38 = type37.toString();
        java.lang.Class<?> wildcardClass39 = type37.getClass();
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        int int43 = type42.getSort();
        java.lang.Class<?> wildcardClass44 = type42.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass44);
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass16, wildcardClass23, wildcardClass28, wildcardClass39, wildcardClass44 };
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(128, 9, "L1619796034", "J", "hi!", strArray48);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray18 = classInfo17.getInterfaces();
        java.lang.Class<?> wildcardClass19 = classInfo17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray21, true, false);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit((int) (short) 100, 14, "L863364317", "(DZ)Lorg/mockito/asm/Type;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]", strArray12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        int int13 = classInfo11.getModifiers();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        boolean boolean19 = classInfo11.equals((java.lang.Object) wildcardClass17);
        org.mockito.asm.Type[] typeArray20 = classInfo11.getInterfaces();
        org.mockito.asm.Type type21 = classInfo11.getType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType("Lhi!;");
        boolean boolean24 = type21.equals((java.lang.Object) "Lhi!;");
        int int25 = type21.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type31 = classInfo30.getType();
        java.lang.String str32 = classInfo30.toString();
        org.mockito.asm.Type type33 = classInfo30.getSuperType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field((int) 'a', "java.beans.PropertyDescriptor[]", type21, (java.lang.Object) type33);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(130);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        org.mockito.asm.Type type13 = classInfo11.getType();
        java.lang.String str14 = classInfo11.toString();
        org.mockito.asm.Type[] typeArray15 = classInfo11.getInterfaces();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]", type1, typeArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = type1.getDimensions();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, true, false);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(128, 126, "D", "Lorg/mockito/asm/Type;", "L854805362", strArray18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        int int12 = type11.getDimensions();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(108, "L1637605831", type11, (java.lang.Object) str19);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) '4', 1, "L1973065432", "(DZ)J", "L1637605831", strArray14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("Lhi!;");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        int int20 = type18.getOpcode(10);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.String str26 = type24.getInternalName();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type30.getOpcode(5);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((-1), type30);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type28, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        boolean boolean38 = type17.equals((java.lang.Object) type18);
        int int39 = type18.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field((int) ' ', "S", type9, (java.lang.Object) type18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray12);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray41 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray42);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        java.lang.Class<?> wildcardClass17 = classInfo15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((int) (byte) 1, 157, "org/mockito/cglib/core/ReflectUtils$4", "java.beans.PropertyDescriptor[name=Lorg/mockito/cglib/core/Signature;]", "", strArray10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray23 = new java.lang.Class[] { wildcardClass12, wildcardClass16, wildcardClass20 };
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(158, 104, "L199842597", "C", "Ljava/lang/Object;", strArray26);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray12 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray21);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray24);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, false);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        boolean boolean12 = type0.equals((java.lang.Object) propertyDescriptorArray7);
        java.lang.String str13 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getInternalName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type15, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray22);
        boolean boolean25 = type11.equals((java.lang.Object) 10L);
        int int26 = type11.getSort();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(9, type11);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        int int30 = type29.getSort();
        java.lang.Class<?> wildcardClass31 = type29.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean36 = classInfo33.equals((java.lang.Object) type35);
        int int37 = classInfo33.getModifiers();
        org.mockito.asm.Type[] typeArray38 = classInfo33.getInterfaces();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L1619796034hi!", type11, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor41 = classEmitter2.visitField(0, "L1420775656", "(DZ)Lhi!;", "L319431409", (java.lang.Object) signature39);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        boolean boolean14 = type2.equals((java.lang.Object) propertyDescriptorArray9);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(4, type2);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = classInfo20.getType();
        org.mockito.asm.Type[] typeArray22 = classInfo20.getInterfaces();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type2, typeArray22);
        java.lang.String str24 = type2.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = type2.getDimensions();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        java.lang.String str16 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type1.getElementType();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        java.lang.Class<?> wildcardClass18 = classInfo16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray25);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.CHAR_TYPE;
        int int23 = type21.getOpcode(10);
        java.lang.String str24 = type21.getClassName();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.String str29 = type27.getInternalName();
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(0, type27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode(5);
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((-1), type33);
        org.mockito.asm.Type type37 = local36.getType();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type31, type37 };
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray38);
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray38);
        boolean boolean41 = type20.equals((java.lang.Object) type21);
        int int42 = type21.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        int int45 = type44.getSort();
        java.lang.Class<?> wildcardClass46 = type44.getClass();
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass46);
        java.lang.String str49 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass46);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.declare_field(14, "S", type21, (java.lang.Object) methodArray53);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type15.getOpcode(5);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type18, type20 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray24);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray24);
        int int29 = type10.getOpcode(0);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        int int32 = type31.getSort();
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean38 = classInfo35.equals((java.lang.Object) type37);
        org.mockito.asm.Type[] typeArray39 = classInfo35.getInterfaces();
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L546622177", type10, typeArray39);
        org.mockito.asm.Type type41 = signature40.getReturnType();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        int int44 = type43.getSort();
        java.lang.Class<?> wildcardClass45 = type43.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean50 = classInfo47.equals((java.lang.Object) type49);
        int int51 = classInfo47.getModifiers();
        org.mockito.asm.Type type52 = classInfo47.getType();
        org.mockito.asm.Type type53 = type52.getElementType();
        int int55 = type52.getOpcode(2);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        int int58 = type57.getSort();
        java.lang.Class<?> wildcardClass59 = type57.getClass();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        org.mockito.cglib.core.ClassInfo classInfo61 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        int int62 = classInfo61.getModifiers();
        org.mockito.asm.Type type63 = classInfo61.getSuperType();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getObjectType("hi!");
        int int66 = type65.getSort();
        java.lang.Class<?> wildcardClass67 = type65.getClass();
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass67);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass67);
        int int70 = classInfo69.getModifiers();
        int int71 = classInfo69.getModifiers();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getObjectType("hi!");
        int int74 = type73.getSort();
        java.lang.Class<?> wildcardClass75 = type73.getClass();
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass75);
        boolean boolean77 = classInfo69.equals((java.lang.Object) wildcardClass75);
        org.mockito.asm.Type[] typeArray78 = classInfo69.getInterfaces();
        java.lang.String str79 = org.mockito.asm.Type.getMethodDescriptor(type63, typeArray78);
        java.lang.Class[] classArray80 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray78);
        java.lang.String str81 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class((int) 'a', 0, "D(IZ)Z", type41, typeArray78, "L191230559");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = classInfo6.equals((java.lang.Object) type7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = type7.getElementType();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        boolean boolean14 = type2.equals((java.lang.Object) propertyDescriptorArray9);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(4, type2);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(116, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type17 = type2.getElementType();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getInternalName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type6, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L1096978147]", "L319431409" };
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass38);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray42 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass38);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray42, false, false);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray45);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray46);
        java.lang.Class[] classArray48 = new java.lang.Class[] {};
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray48);
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray56 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray56);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray56);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray58);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray64 = new java.lang.Class[] {};
        int int65 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray64);
        java.lang.String[] strArray66 = org.mockito.cglib.core.ReflectUtils.getNames(classArray64);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("hi!");
        int int69 = type68.getSort();
        java.lang.Class<?> wildcardClass70 = type68.getClass();
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type[] typeArray72 = classInfo71.getInterfaces();
        java.lang.Class<?> wildcardClass73 = classInfo71.getClass();
        org.mockito.cglib.core.ClassInfo classInfo74 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass73);
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass73);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray75, true, false);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray66, methodArray78);
        java.lang.reflect.Method[] methodArray80 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray63, methodArray79);
        java.lang.reflect.Method[] methodArray81 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray82 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray81);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, false, true);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 96, "L1683403049", "L1227623958", "L1300733389", strArray13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        label8.info = classArray10;
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray10);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray23 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray23);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray23);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(153, (-1), "L367643536", "java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/cglib/core/ReflectUtils$4;; constrained]", "L402185072", strArray14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, false, true);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L1096978147]", "L319431409" };
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray25);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        int int32 = type31.getSort();
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, false, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray41);
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray51 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray50, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray51);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray59 = new java.lang.Class[] {};
        int int60 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray59);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("hi!");
        int int64 = type63.getSort();
        java.lang.Class<?> wildcardClass65 = type63.getClass();
        org.mockito.cglib.core.ClassInfo classInfo66 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type[] typeArray67 = classInfo66.getInterfaces();
        java.lang.Class<?> wildcardClass68 = classInfo66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, true, false);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray73);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray74);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray76);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter25 = classEmitter20.getStaticHook();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        int int9 = classInfo8.getModifiers();
        org.mockito.asm.Type type10 = classInfo8.getSuperType();
        int int11 = type10.getDimensions();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        boolean boolean29 = type15.equals((java.lang.Object) 10L);
        int int30 = type15.getSort();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(9, type15);
        java.lang.String str32 = type15.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(162, "org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]", type10, (java.lang.Object) str32);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.String[] strArray4 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray13);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean12 = type2.equals((java.lang.Object) propertyDescriptorArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type2, typeArray26);
        org.mockito.asm.Type type30 = signature29.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type30.getElementType();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean24 = classInfo21.equals((java.lang.Object) type23);
        int int25 = classInfo21.getModifiers();
        org.mockito.asm.Type type26 = classInfo21.getType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        int int31 = type30.getSort();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type34, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray41);
        boolean boolean44 = type30.equals((java.lang.Object) 10L);
        int int45 = type30.getSort();
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(9, type30);
        org.mockito.asm.Type type47 = local46.getType();
        boolean boolean48 = classInfo21.equals((java.lang.Object) local46);
        boolean boolean50 = classInfo21.equals((java.lang.Object) 100.0d);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        int int53 = type52.getSort();
        java.lang.Class<?> wildcardClass54 = type52.getClass();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass54);
        org.mockito.cglib.core.ClassInfo classInfo56 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean59 = classInfo56.equals((java.lang.Object) type58);
        int int60 = classInfo56.getModifiers();
        org.mockito.asm.Type type61 = classInfo56.getType();
        java.lang.Class<?> wildcardClass62 = type61.getClass();
        boolean boolean63 = classInfo21.equals((java.lang.Object) type61);
        org.mockito.asm.Type type64 = classInfo21.getType();
        java.lang.String str65 = type64.toString();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("hi!");
        int int68 = type67.getSort();
        java.lang.Class<?> wildcardClass69 = type67.getClass();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        int int72 = classInfo71.getModifiers();
        int int73 = classInfo71.getModifiers();
        org.mockito.asm.Type[] typeArray74 = classInfo71.getInterfaces();
        org.mockito.asm.Type type75 = classInfo71.getSuperType();
        org.mockito.asm.Type[] typeArray76 = classInfo71.getInterfaces();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.begin_class(116, 134, "L218313208", type64, typeArray76, "L1318580193");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = classInfo7.getType();
        int int9 = classInfo7.getModifiers();
        org.mockito.asm.Type type10 = classInfo7.getType();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = type10.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitSource("L1088218826", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)Ljava/lang/Object;");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        int int6 = classInfo5.getModifiers();
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method8, method9);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str14 = signature13.getName();
        java.lang.String str15 = signature13.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSort();
        int int20 = type16.getOpcode(104);
        boolean boolean21 = signature13.equals((java.lang.Object) 104);
        boolean boolean23 = signature13.equals((java.lang.Object) "Lhi!;");
        java.beans.PropertyEditor propertyEditor24 = propertyDescriptor10.createPropertyEditor((java.lang.Object) signature13);
        java.util.Enumeration<java.lang.String> strEnumeration25 = propertyDescriptor10.attributeNames();
        java.lang.reflect.Method method26 = propertyDescriptor10.getWriteMethod();
        java.lang.reflect.Method method27 = propertyDescriptor10.getWriteMethod();
        java.lang.reflect.Method method28 = propertyDescriptor10.getReadMethod();
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        propertyDescriptor33.setHidden(false);
        propertyDescriptor33.setDisplayName("boolean");
        propertyDescriptor33.setExpert(false);
        java.lang.String str40 = propertyDescriptor33.getName();
        java.lang.String str41 = propertyDescriptor33.getShortDescription();
        propertyDescriptor10.setValue("L342994418", (java.lang.Object) propertyDescriptor33);
        boolean boolean43 = propertyDescriptor10.isExpert();
        propertyDescriptor10.setShortDescription("L503209764");
        boolean boolean46 = classInfo5.equals((java.lang.Object) "L503209764");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor33", propertyDescriptor10.equals(propertyDescriptor33) ? propertyDescriptor10.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray2);
        label0.info = classArray2;
        int int5 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray2);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass11, wildcardClass15, wildcardClass19 };
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.Class[] classArray27 = new java.lang.Class[] {};
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        int int33 = type32.getSort();
        java.lang.Class<?> wildcardClass34 = type32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray36, true, false);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray39);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        int int42 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray49 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray49);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        int int54 = type53.getSort();
        java.lang.Class<?> wildcardClass55 = type53.getClass();
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass55);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray58, true, true);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray61);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray62);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getObjectType("hi!");
        int int66 = type65.getSort();
        java.lang.Class<?> wildcardClass67 = type65.getClass();
        org.mockito.cglib.core.ClassInfo classInfo68 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass67);
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass67);
        org.mockito.cglib.core.ClassInfo classInfo70 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass67);
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass67);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass67);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray72, true, false);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray75);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray75);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray77);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getInternalName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type6, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L1096978147]", "L319431409" };
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray25);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        int int32 = type31.getSort();
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        java.lang.String str36 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass33);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, false, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray40);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray41);
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray51 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray50, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray51);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray53);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray59 = new java.lang.Class[] {};
        int int60 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray59);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("hi!");
        int int64 = type63.getSort();
        java.lang.Class<?> wildcardClass65 = type63.getClass();
        org.mockito.cglib.core.ClassInfo classInfo66 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type[] typeArray67 = classInfo66.getInterfaces();
        java.lang.Class<?> wildcardClass68 = classInfo66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, true, false);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray61, methodArray73);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray74);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray76);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str10 = type9.toString();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        propertyDescriptor14.setHidden(false);
        java.lang.reflect.Method method17 = propertyDescriptor14.getReadMethod();
        java.lang.reflect.Method method18 = propertyDescriptor14.getReadMethod();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.String str23 = type21.getInternalName();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type27.getOpcode(5);
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type25, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray32);
        java.beans.PropertyEditor propertyEditor34 = propertyDescriptor14.createPropertyEditor((java.lang.Object) str33);
        propertyDescriptor14.setValue("L284401382", (java.lang.Object) "char");
        java.lang.reflect.Method method40 = null;
        java.lang.reflect.Method method41 = null;
        java.beans.PropertyDescriptor propertyDescriptor42 = new java.beans.PropertyDescriptor("hi!", method40, method41);
        propertyDescriptor42.setHidden(false);
        propertyDescriptor42.setDisplayName("boolean");
        propertyDescriptor42.setExpert(false);
        propertyDescriptor42.setHidden(true);
        java.lang.Class<?> wildcardClass51 = propertyDescriptor42.getPropertyEditorClass();
        boolean boolean52 = propertyDescriptor42.isExpert();
        propertyDescriptor14.setValue("", (java.lang.Object) propertyDescriptor42);
        java.lang.reflect.Method method55 = null;
        java.lang.reflect.Method method56 = null;
        java.beans.PropertyDescriptor propertyDescriptor57 = new java.beans.PropertyDescriptor("hi!", method55, method56);
        propertyDescriptor57.setHidden(false);
        java.lang.String str60 = propertyDescriptor57.getName();
        java.lang.Object obj62 = propertyDescriptor57.getValue("C");
        propertyDescriptor57.setName("L2099078913");
        java.beans.PropertyEditor propertyEditor65 = propertyDescriptor42.createPropertyEditor((java.lang.Object) propertyDescriptor57);
        propertyDescriptor57.setShortDescription("L652808446");
        java.util.Enumeration<java.lang.String> strEnumeration68 = propertyDescriptor57.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration69 = propertyDescriptor57.attributeNames();
        boolean boolean70 = type9.equals((java.lang.Object) strEnumeration69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor57", propertyDescriptor14.equals(propertyDescriptor57) ? propertyDescriptor14.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        int int16 = classInfo15.getModifiers();
        int int17 = classInfo15.getModifiers();
        org.mockito.asm.Type[] typeArray18 = classInfo15.getInterfaces();
        boolean boolean20 = classInfo15.equals((java.lang.Object) (byte) 100);
        org.mockito.asm.Type[] typeArray21 = classInfo15.getInterfaces();
        org.mockito.asm.Type type22 = classInfo15.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean32 = classInfo29.equals((java.lang.Object) type31);
        int int33 = classInfo29.getModifiers();
        org.mockito.asm.Type type34 = classInfo29.getType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSort();
        java.lang.String str40 = type38.getInternalName();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type44.getOpcode(5);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type44);
        org.mockito.asm.Type type48 = local47.getType();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type42, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray49);
        boolean boolean52 = type38.equals((java.lang.Object) 10L);
        int int53 = type38.getSort();
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(9, type38);
        org.mockito.asm.Type type55 = local54.getType();
        boolean boolean56 = classInfo29.equals((java.lang.Object) local54);
        org.mockito.asm.Type type57 = local54.getType();
        org.mockito.asm.Type type58 = local54.getType();
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(128, type58);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        int int63 = type62.getSort();
        java.lang.String str64 = type62.getInternalName();
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(0, type62);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int70 = type68.getOpcode(5);
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((-1), type68);
        org.mockito.asm.Type type72 = local71.getType();
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type66, type72 };
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.begin_class(116, 42, "L621957885", type22, typeArray73, "L240686698");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        boolean boolean10 = propertyDescriptor3.isHidden();
        java.lang.String str11 = propertyDescriptor3.getDisplayName();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        boolean boolean13 = propertyDescriptor3.isPreferred();
        java.util.Enumeration<java.lang.String> strEnumeration14 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.String str22 = type20.getInternalName();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type26.getOpcode(5);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type30 = local29.getType();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type24, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray31);
        boolean boolean34 = type20.equals((java.lang.Object) 10L);
        int int35 = type20.getSort();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(9, type20);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSort();
        java.lang.Class<?> wildcardClass40 = type38.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.cglib.core.ClassInfo classInfo42 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean45 = classInfo42.equals((java.lang.Object) type44);
        int int46 = classInfo42.getModifiers();
        org.mockito.asm.Type[] typeArray47 = classInfo42.getInterfaces();
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("L1619796034hi!", type20, typeArray47);
        propertyDescriptor3.setValue("java.beans.PropertyDescriptor[name=hi!]", (java.lang.Object) signature48);
        java.lang.String str50 = signature48.getName();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method52, method53);
        org.mockito.cglib.core.Signature signature57 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str58 = signature57.getName();
        java.lang.String str59 = signature57.toString();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str61 = type60.getClassName();
        int int62 = type60.getSort();
        int int64 = type60.getOpcode(104);
        boolean boolean65 = signature57.equals((java.lang.Object) 104);
        boolean boolean67 = signature57.equals((java.lang.Object) "Lhi!;");
        java.beans.PropertyEditor propertyEditor68 = propertyDescriptor54.createPropertyEditor((java.lang.Object) signature57);
        boolean boolean69 = signature48.equals((java.lang.Object) propertyEditor68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor54", propertyDescriptor3.equals(propertyDescriptor54) ? propertyDescriptor3.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(DZ)Lhi!;", method1, method2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType("Lhi!;");
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        int int13 = classInfo12.getModifiers();
        org.mockito.asm.Type type14 = classInfo12.getSuperType();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        int int21 = classInfo20.getModifiers();
        int int22 = classInfo20.getModifiers();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        boolean boolean28 = classInfo20.equals((java.lang.Object) wildcardClass26);
        org.mockito.asm.Type[] typeArray29 = classInfo20.getInterfaces();
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray29);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray29);
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("L546622177", type6, typeArray29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        int int35 = type34.getSort();
        java.lang.Class<?> wildcardClass36 = type34.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass36);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean41 = classInfo39.equals((java.lang.Object) type40);
        org.mockito.asm.Type type42 = classInfo39.getSuperType();
        java.lang.String str43 = type42.toString();
        boolean boolean44 = signature32.equals((java.lang.Object) type42);
        java.lang.String str45 = signature32.getName();
        java.beans.PropertyEditor propertyEditor46 = propertyDescriptor3.createPropertyEditor((java.lang.Object) signature32);
        java.lang.reflect.Method method48 = null;
        java.lang.reflect.Method method49 = null;
        java.beans.PropertyDescriptor propertyDescriptor50 = new java.beans.PropertyDescriptor("hi!", method48, method49);
        propertyDescriptor50.setHidden(false);
        boolean boolean53 = propertyDescriptor50.isHidden();
        boolean boolean54 = propertyDescriptor50.isHidden();
        propertyDescriptor50.setPreferred(false);
        java.lang.String str57 = propertyDescriptor50.getShortDescription();
        boolean boolean58 = signature32.equals((java.lang.Object) str57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor50", propertyDescriptor3.equals(propertyDescriptor50) ? propertyDescriptor3.hashCode() == propertyDescriptor50.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        java.lang.Class[] classArray30 = new java.lang.Class[] {};
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        int int36 = type35.getSort();
        java.lang.Class<?> wildcardClass37 = type35.getClass();
        org.mockito.cglib.core.ClassInfo classInfo38 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass37);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray39, true, false);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray42);
        java.lang.Class[] classArray44 = new java.lang.Class[] {};
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        java.lang.String[] strArray47 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray52 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray51, methodArray52);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray52);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getObjectType("hi!");
        int int57 = type56.getSort();
        java.lang.Class<?> wildcardClass58 = type56.getClass();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass58);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass58);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray61, true, true);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray64);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray65);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getObjectType("hi!");
        int int69 = type68.getSort();
        java.lang.Class<?> wildcardClass70 = type68.getClass();
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass70);
        org.mockito.cglib.core.ClassInfo classInfo73 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass70);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray75 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass70);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray75, true, false);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visit(133, (int) (short) 0, "L957924963", "L161627105", "L652364896", strArray33);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L1096978147]", "L319431409" };
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray18);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, false, false);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray33);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray34);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        int int37 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray36);
        java.lang.String[] strArray38 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        java.lang.String[] strArray39 = org.mockito.cglib.core.ReflectUtils.getNames(classArray36);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray44 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray44);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray44);
        java.lang.reflect.Method[] methodArray47 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor48 = classEmitter1.visitField(154, "L387846413", "(DZ)L!;", "()J", (java.lang.Object) methodArray47);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter10.getClassInfo();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        org.mockito.asm.Type type22 = classInfo20.getType();
        org.mockito.asm.Type type23 = type22.getElementType();
        int int24 = type23.getDimensions();
        int int25 = type23.getSize();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type[] typeArray32 = classInfo31.getInterfaces();
        org.mockito.asm.Type type33 = classInfo31.getType();
        java.lang.String str34 = classInfo31.toString();
        org.mockito.asm.Type[] typeArray35 = classInfo31.getInterfaces();
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.declare_field(39, "L1922051318", type23, (java.lang.Object) classArray36);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, false, true);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray13);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        java.lang.Class[] classArray22 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray19);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, true, false);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, false, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray2, methodArray35);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        int int16 = type1.getSort();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type[] typeArray23 = classInfo22.getInterfaces();
        org.mockito.asm.Type type24 = classInfo22.getType();
        java.lang.String str25 = classInfo22.toString();
        org.mockito.asm.Type[] typeArray26 = classInfo22.getInterfaces();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray26);
        int int28 = type1.getSort();
        int int30 = type1.getOpcode(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type1.getElementType();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray10);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, false, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray25);
        java.lang.String[] strArray32 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray41 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray41);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray41);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray44);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        int int24 = type1.getOpcode(0);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) -1, type1);
        org.mockito.asm.Type type26 = local25.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = type26.getDimensions();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass25);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, false);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit((int) '4', 130, "L1346880301", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", "L451413226", strArray19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type9.getOpcode(10);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        boolean boolean29 = type8.equals((java.lang.Object) type9);
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(100, type9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type31 = type9.getElementType();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        java.lang.String str23 = type1.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode(5);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray40);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1770165165", type1, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = type1.getElementType();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean14 = classInfo12.equals((java.lang.Object) type13);
        org.mockito.asm.Type type15 = classInfo12.getSuperType();
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType("Lhi!;");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        int int26 = classInfo25.getModifiers();
        org.mockito.asm.Type type27 = classInfo25.getSuperType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        int int30 = type29.getSort();
        java.lang.Class<?> wildcardClass31 = type29.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        int int34 = classInfo33.getModifiers();
        int int35 = classInfo33.getModifiers();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        int int38 = type37.getSort();
        java.lang.Class<?> wildcardClass39 = type37.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        boolean boolean41 = classInfo33.equals((java.lang.Object) wildcardClass39);
        org.mockito.asm.Type[] typeArray42 = classInfo33.getInterfaces();
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L546622177", type19, typeArray42);
        org.mockito.asm.Type[] typeArray46 = signature45.getArgumentTypes();
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("hi!");
        int int51 = type50.getSort();
        java.lang.Class<?> wildcardClass52 = type50.getClass();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass52);
        org.mockito.cglib.core.ClassInfo classInfo54 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass52);
        int int55 = classInfo54.getModifiers();
        org.mockito.asm.Type type56 = classInfo54.getSuperType();
        org.mockito.asm.Type type57 = classInfo54.getSuperType();
        org.mockito.asm.Type[] typeArray58 = classInfo54.getInterfaces();
        boolean boolean59 = type48.equals((java.lang.Object) classInfo54);
        int int60 = classInfo54.getModifiers();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        int int63 = type62.getSort();
        java.lang.Class<?> wildcardClass64 = type62.getClass();
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass64);
        org.mockito.cglib.core.ClassInfo classInfo66 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass64);
        org.mockito.asm.Type[] typeArray67 = classInfo66.getInterfaces();
        org.mockito.asm.Type[] typeArray68 = classInfo66.getInterfaces();
        boolean boolean69 = classInfo54.equals((java.lang.Object) classInfo66);
        org.mockito.asm.Type[] typeArray70 = classInfo54.getInterfaces();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(103, 126, "", type15, typeArray70, "L436930601");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        label9.info = 130;
        java.lang.String str14 = label9.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type20 = classInfo19.getType();
        org.mockito.asm.Type type21 = classInfo19.getType();
        label9.info = type21;
        org.mockito.asm.Type type23 = type21.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter0.visitField(14, "<init>", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]()LL546622177;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]", (java.lang.Object) type21);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, true);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray25);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        int int31 = type30.getSort();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type34, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray41);
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.lang.String[] strArray47 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("hi!");
        int int51 = type50.getSort();
        java.lang.Class<?> wildcardClass52 = type50.getClass();
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass52);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass52);
        java.lang.Class[] classArray55 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray54);
        int int56 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        int int57 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        java.lang.String[] strArray58 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        java.lang.Class[] classArray59 = new java.lang.Class[] {};
        int int60 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray59);
        java.lang.String[] strArray61 = org.mockito.cglib.core.ReflectUtils.getNames(classArray59);
        java.lang.String[] strArray62 = org.mockito.cglib.core.ReflectUtils.getNames(classArray59);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("hi!");
        int int65 = type64.getSort();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass66);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray70, false, true);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray73);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray74);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray76);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray6, methodArray12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray22);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray41 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass38);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray41, true, true);
        java.lang.reflect.Method[] methodArray45 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray44);
        java.lang.reflect.Method[] methodArray46 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray45);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        int int49 = type48.getSort();
        java.lang.Class<?> wildcardClass50 = type48.getClass();
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass50);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, true, false);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(9, 0, "L343803455", "L1181039320", "L2034064564", strArray13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = classInfo7.getType();
        int int9 = classInfo7.getModifiers();
        org.mockito.asm.Type type10 = classInfo7.getType();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = type10.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitEnd();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        java.lang.String str23 = type1.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode(5);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray40);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1770165165", type1, typeArray40);
        org.mockito.asm.Type type46 = signature45.getReturnType();
        java.lang.String str47 = type46.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type46.getInternalName();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter20.visitEnd();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        label10.info = classArray12;
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray12);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(162, 116, "L621957885", "C(DZ)Z", "()Lorg.mockito.asm.Type;", strArray16);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        org.mockito.asm.Type[] typeArray17 = classInfo15.getInterfaces();
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray17);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(10, 161, "L933903703", "", "L1427405832", strArray20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray23);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray33);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, false, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray37);
        java.lang.Class[] classArray39 = new java.lang.Class[] {};
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray47 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray47);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray47);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit((-1), 0, "()Lva/lang/Object;", "C", "L1973065432", strArray14);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(134, 60, "L2083133304", "org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]()D", "L99684707", strArray14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        boolean boolean11 = type1.equals((java.lang.Object) propertyDescriptorArray10);
        int int12 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = type1.getElementType();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        boolean boolean14 = type2.equals((java.lang.Object) propertyDescriptorArray9);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(4, type2);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = classInfo20.getType();
        org.mockito.asm.Type[] typeArray22 = classInfo20.getInterfaces();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type2, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type2.getDimensions();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type1.getSize();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass6);
        java.lang.reflect.Method[] methodArray11 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray8, true, false);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray8);
        boolean boolean13 = type1.equals((java.lang.Object) propertyDescriptorArray8);
        java.lang.String str14 = type1.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        java.lang.Class<?> wildcardClass21 = classInfo19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type24 = classInfo23.getType();
        org.mockito.asm.Type[] typeArray25 = classInfo23.getInterfaces();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("", type1, typeArray25);
        org.mockito.asm.Type type27 = signature26.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type27.getDimensions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        int int5 = type2.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) '4', type2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(2, type2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        boolean boolean15 = type2.equals((java.lang.Object) wildcardClass11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = type2.getDimensions();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(2, 141, "java.beans.PropertyDescriptor[name=Lorg/mockito/cglib/core/Signature;]", "L482411962", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; preferred; hidden]", strArray17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        int int24 = type1.getOpcode(0);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) -1, type1);
        java.lang.String str26 = type1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = type1.getInternalName();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getInternalName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type6, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass30);
        boolean boolean33 = type23.equals((java.lang.Object) propertyDescriptorArray32);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, false, true);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray36);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray42 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray43);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getInternalName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type type12 = local11.getType();
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type6, type12 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass30);
        boolean boolean33 = type23.equals((java.lang.Object) propertyDescriptorArray32);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, false, true);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type type14 = local12.getType();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(14, type14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        java.lang.Class<?> wildcardClass22 = classInfo20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type type25 = classInfo24.getType();
        boolean boolean26 = type14.equals((java.lang.Object) type25);
        org.mockito.asm.Type type27 = type25.getElementType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        int int31 = type30.getSort();
        java.lang.Class<?> wildcardClass32 = type30.getClass();
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass32);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        java.lang.String str36 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        int int41 = type40.getSort();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type[] typeArray44 = classInfo43.getInterfaces();
        org.mockito.asm.Type[] typeArray45 = classInfo43.getInterfaces();
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray45);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1137930343", type38, typeArray45);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(59, (int) (short) -1, "L1864889057", type25, typeArray45, "L2142284");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        label9.info = classArray11;
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray11);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray24);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(59, 8, "java.beans.PropertyDescriptor[name=[Ljava/beans/PropertyDescriptor;; values={L1095004678=L1414930140}]", "LL546622177;", "L1786763972", strArray15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getInternalName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray21);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str22);
        propertyDescriptor3.setValue("L284401382", (java.lang.Object) "char");
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        propertyDescriptor31.setHidden(false);
        propertyDescriptor31.setDisplayName("boolean");
        propertyDescriptor31.setExpert(false);
        propertyDescriptor31.setHidden(true);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor31.getPropertyEditorClass();
        boolean boolean41 = propertyDescriptor31.isExpert();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        propertyDescriptor46.setHidden(false);
        java.lang.String str49 = propertyDescriptor46.getName();
        java.lang.Object obj51 = propertyDescriptor46.getValue("C");
        propertyDescriptor46.setName("L2099078913");
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor46);
        propertyDescriptor46.setShortDescription("L652808446");
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type58.getOpcode(5);
        int int61 = type58.getSize();
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) '4', type58);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("hi!");
        int int65 = type64.getSort();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.cglib.core.ClassInfo classInfo67 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.lang.String str70 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        boolean boolean72 = type58.equals((java.lang.Object) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo73 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.lang.String str74 = classInfo73.toString();
        org.mockito.asm.Type type75 = classInfo73.getType();
        java.beans.PropertyEditor propertyEditor76 = propertyDescriptor46.createPropertyEditor((java.lang.Object) type75);
        java.lang.String str77 = type75.getDescriptor();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        int int24 = type1.getOpcode(0);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((int) (short) -1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = type1.getDimensions();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = classInfo10.getType();
        org.mockito.asm.Type type12 = classInfo10.getType();
        label0.info = type12;
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        propertyDescriptor17.setConstrained(false);
        propertyDescriptor17.setPreferred(true);
        label0.info = true;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("[Ljava/beans/PropertyDescriptor;");
        org.mockito.asm.Type type25 = type24.getElementType();
        label0.info = type24;
        java.lang.Object obj27 = label0.info;
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        propertyDescriptor31.setHidden(false);
        propertyDescriptor31.setDisplayName("boolean");
        boolean boolean36 = propertyDescriptor31.isHidden();
        java.lang.String str37 = propertyDescriptor31.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration38 = propertyDescriptor31.attributeNames();
        propertyDescriptor31.setName("L1957154767");
        boolean boolean41 = propertyDescriptor31.isPreferred();
        label0.info = boolean41;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor31", propertyDescriptor17.equals(propertyDescriptor31) ? propertyDescriptor17.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        java.lang.String str83 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature85 = methodInfo84.getSignature();
        org.mockito.asm.Type type86 = signature85.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int87 = type86.getDimensions();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, false);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        boolean boolean12 = type0.equals((java.lang.Object) propertyDescriptorArray7);
        java.lang.String str13 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = type0.getInternalName();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.reflect.Method method3 = null;
        java.lang.reflect.Method method4 = null;
        java.beans.PropertyDescriptor propertyDescriptor5 = new java.beans.PropertyDescriptor("hi!", method3, method4);
        propertyDescriptor5.setHidden(false);
        propertyDescriptor5.setDisplayName("boolean");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.String str15 = type13.getInternalName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode(5);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type17, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray24);
        boolean boolean27 = type13.equals((java.lang.Object) 10L);
        propertyDescriptor5.setValue("Lhi!;", (java.lang.Object) type13);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.CHAR_TYPE;
        int int31 = type29.getOpcode(10);
        java.lang.String str32 = type29.getClassName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        int int36 = type35.getSort();
        java.lang.String str37 = type35.getInternalName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(0, type35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type41.getOpcode(5);
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((-1), type41);
        org.mockito.asm.Type type45 = local44.getType();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type39, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray46);
        java.lang.Class[] classArray49 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray46);
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("Z", type13, typeArray46);
        org.mockito.cglib.core.Local local51 = new org.mockito.cglib.core.Local((-1), type13);
        java.lang.reflect.Method method53 = null;
        java.lang.reflect.Method method54 = null;
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("L191230559", method53, method54);
        boolean boolean56 = type13.equals((java.lang.Object) method54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor55", propertyDescriptor5.equals(propertyDescriptor55) ? propertyDescriptor5.hashCode() == propertyDescriptor55.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        int int7 = classInfo6.getModifiers();
        int int8 = classInfo6.getModifiers();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        boolean boolean14 = classInfo6.equals((java.lang.Object) wildcardClass12);
        org.mockito.asm.Type type15 = classInfo6.getSuperType();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((int) (short) -1, type15);
        org.mockito.asm.Type type17 = local16.getType();
        int int18 = local16.getIndex();
        org.mockito.asm.Type type19 = local16.getType();
        int int20 = type19.getSize();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str23 = type22.getClassName();
        int int24 = type22.getSort();
        int int26 = type22.getOpcode(130);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type[] typeArray33 = classInfo32.getInterfaces();
        org.mockito.asm.Type type34 = classInfo32.getType();
        java.lang.String str35 = classInfo32.toString();
        org.mockito.asm.Type[] typeArray36 = classInfo32.getInterfaces();
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]", type22, typeArray36);
        java.lang.String str38 = signature37.getDescriptor();
        org.mockito.asm.Type[] typeArray39 = signature37.getArgumentTypes();
        java.lang.String str40 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray39);
        java.lang.reflect.Method method42 = null;
        java.lang.reflect.Method method43 = null;
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("L652808446", method42, method43);
        java.util.Enumeration<java.lang.String> strEnumeration45 = propertyDescriptor44.attributeNames();
        boolean boolean46 = type19.equals((java.lang.Object) strEnumeration45);
        java.lang.String str47 = type19.getClassName();
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("hi!", method49, method50);
        propertyDescriptor51.setHidden(false);
        propertyDescriptor51.setDisplayName("boolean");
        propertyDescriptor51.setExpert(false);
        java.lang.reflect.Method method58 = propertyDescriptor51.getReadMethod();
        propertyDescriptor51.setDisplayName("L1096978147");
        boolean boolean61 = propertyDescriptor51.isHidden();
        java.lang.String str62 = propertyDescriptor51.getName();
        propertyDescriptor51.setBound(false);
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("(DZ)C", method67, method68);
        propertyDescriptor69.setBound(false);
        boolean boolean72 = propertyDescriptor69.isExpert();
        propertyDescriptor51.setValue("L1790767559", (java.lang.Object) boolean72);
        java.lang.Class<?> wildcardClass74 = propertyDescriptor51.getPropertyType();
        boolean boolean75 = type19.equals((java.lang.Object) wildcardClass74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor44 and propertyDescriptor51", propertyDescriptor44.equals(propertyDescriptor51) ? propertyDescriptor44.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        boolean boolean14 = type2.equals((java.lang.Object) propertyDescriptorArray9);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(4, type2);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(116, type2);
        int int17 = type2.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type18 = type2.getElementType();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        int int16 = type1.getSort();
        int int18 = type1.getOpcode(14);
        java.lang.String str19 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = type1.getInternalName();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11 };
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, true, false);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray31);
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        int int34 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray33);
        java.lang.String[] strArray35 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray41 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray41);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        int int46 = type45.getSort();
        java.lang.Class<?> wildcardClass47 = type45.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, true);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray53);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray54);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        int int58 = type57.getSort();
        java.lang.Class<?> wildcardClass59 = type57.getClass();
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass59);
        org.mockito.cglib.core.ClassInfo classInfo62 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass59);
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass59);
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray64, true, false);
        java.lang.reflect.Method[] methodArray68 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray67);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray70 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray69);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.toString();
        label1.info = str6;
        java.lang.Object obj8 = label1.info;
        java.lang.String str9 = label1.toString();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass13);
        label1.info = wildcardClass13;
        java.lang.Object obj17 = label1.info;
        java.lang.String str18 = label1.toString();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType("Z");
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local(153, type21);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        label1.info = type24;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.lang.String str33 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass29);
        org.mockito.cglib.core.ClassInfo classInfo34 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        int int41 = type40.getSort();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        int int50 = type49.getSort();
        java.lang.Class<?> wildcardClass51 = type49.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean56 = classInfo53.equals((java.lang.Object) type55);
        int int57 = classInfo53.getModifiers();
        org.mockito.asm.Type type58 = classInfo53.getType();
        org.mockito.asm.Type type59 = type58.getElementType();
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getObjectType("hi!");
        int int62 = type61.getSort();
        java.lang.Class<?> wildcardClass63 = type61.getClass();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass63);
        java.lang.String str66 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass63);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        org.mockito.asm.Type type68 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getObjectType("hi!");
        int int71 = type70.getSort();
        java.lang.Class<?> wildcardClass72 = type70.getClass();
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass72);
        org.mockito.cglib.core.ClassInfo classInfo74 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass72);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean77 = classInfo74.equals((java.lang.Object) type76);
        int int78 = classInfo74.getModifiers();
        org.mockito.asm.Type[] typeArray79 = classInfo74.getInterfaces();
        java.lang.String str80 = org.mockito.asm.Type.getMethodDescriptor(type68, typeArray79);
        boolean boolean81 = type59.equals((java.lang.Object) typeArray79);
        java.lang.Class[] classArray82 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray79);
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L1619796034hi!", type47, typeArray79);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray79);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("L284401382C", type24, typeArray79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = type24.getElementType();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        int int14 = classInfo13.getModifiers();
        int int15 = classInfo13.getModifiers();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        boolean boolean21 = classInfo13.equals((java.lang.Object) wildcardClass19);
        org.mockito.asm.Type[] typeArray22 = classInfo13.getInterfaces();
        org.mockito.asm.Type type23 = classInfo13.getType();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        int int31 = classInfo29.getModifiers();
        org.mockito.asm.Type type32 = classInfo29.getType();
        int int33 = classInfo29.getModifiers();
        org.mockito.asm.Type[] typeArray34 = classInfo29.getInterfaces();
        org.mockito.asm.Type[] typeArray35 = classInfo29.getInterfaces();
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("L1147169644", type23, typeArray35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSort();
        java.lang.Class<?> wildcardClass40 = type38.getClass();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass40);
        org.mockito.cglib.core.ClassInfo classInfo42 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type[] typeArray43 = classInfo42.getInterfaces();
        org.mockito.asm.Type type44 = classInfo42.getType();
        java.lang.String str45 = classInfo42.toString();
        org.mockito.asm.Type[] typeArray46 = classInfo42.getInterfaces();
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(2, "L1329882382java.beans.PropertyDescriptor[name=hi!; constrained]", type23, (java.lang.Object) typeArray46);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        java.lang.String str83 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature85 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo88 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 0);
        org.mockito.cglib.core.MethodInfo methodInfo90 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 104);
        org.mockito.cglib.core.Signature signature91 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature92 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type type93 = signature92.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int94 = type93.getDimensions();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        int int7 = classInfo6.getModifiers();
        org.mockito.asm.Type type8 = classInfo6.getSuperType();
        org.mockito.asm.Type type9 = classInfo6.getSuperType();
        org.mockito.asm.Type[] typeArray10 = classInfo6.getInterfaces();
        boolean boolean11 = type0.equals((java.lang.Object) classInfo6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L817227646");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(8, "java.beans.PropertyDescriptor[name=hi!; displayName=D]", type9, (java.lang.Object) propertyDescriptorArray18);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter18.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        int int35 = type34.getSort();
        java.lang.Class<?> wildcardClass36 = type34.getClass();
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, true, false);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        int int45 = type44.getSort();
        java.lang.Class<?> wildcardClass46 = type44.getClass();
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass46);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, true, false);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visit(36, 50, "L1346880301", "L1653021010", "L1864889057", strArray32);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(100, 137, "Lorg/mockito/cglib/core/Signature;()C", "L897428444", "L2112791225", strArray13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("J");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type14.getOpcode(5);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type12, type14 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray18);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray18);
        int int23 = type4.getOpcode(0);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean32 = classInfo29.equals((java.lang.Object) type31);
        org.mockito.asm.Type[] typeArray33 = classInfo29.getInterfaces();
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("L546622177", type4, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type1.getElementType();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = classInfo7.getType();
        int int9 = classInfo7.getModifiers();
        org.mockito.asm.Type type10 = classInfo7.getType();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = type10.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitInnerClass("", "L1346037268", "", 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type[] typeArray10 = classInfo9.getInterfaces();
        java.lang.Class<?> wildcardClass11 = classInfo9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean21 = classInfo18.equals((java.lang.Object) type20);
        int int22 = classInfo18.getModifiers();
        org.mockito.asm.Type type23 = classInfo18.getType();
        boolean boolean24 = classInfo12.equals((java.lang.Object) type23);
        org.mockito.asm.Type type25 = classInfo12.getType();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(3, type25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        int int30 = type29.getSort();
        java.lang.String str31 = type29.getInternalName();
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local(0, type29);
        int int34 = type29.getOpcode((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.declare_field(16, "java.lang.Object", type25, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        int int18 = type16.getOpcode(10);
        java.lang.String str19 = type16.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.String str24 = type22.getInternalName();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((-1), type28);
        org.mockito.asm.Type type32 = local31.getType();
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type26, type32 };
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray33);
        boolean boolean36 = type15.equals((java.lang.Object) type16);
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(100, type16);
        org.mockito.asm.Type type38 = local37.getType();
        org.mockito.asm.Type type39 = local37.getType();
        org.mockito.asm.Type type40 = local37.getType();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BYTE_TYPE;
        int int43 = type42.getSize();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type44.getOpcode(5);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int51 = type49.getOpcode(5);
        org.mockito.cglib.core.Local local52 = new org.mockito.cglib.core.Local((-1), type49);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type47, type49 };
        java.lang.String str54 = org.mockito.asm.Type.getMethodDescriptor(type44, typeArray53);
        java.lang.Class[] classArray55 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray53);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type42, typeArray53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(19, 15, "L149492836", type40, typeArray53, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("L546622177");
        int int18 = type16.getOpcode((int) (byte) -1);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(133, type16);
        java.lang.String str20 = type16.getClassName();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type22.getOpcode(5);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type26 = local25.getType();
        java.lang.String str27 = type26.toString();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray31 = classInfo30.getInterfaces();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.begin_class(60, 8, "L2058117412", type16, typeArray31, "L503209764");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean9 = classInfo6.equals((java.lang.Object) type8);
        int int10 = classInfo6.getModifiers();
        org.mockito.asm.Type type11 = classInfo6.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.String str16 = type14.getInternalName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("C", type11, typeArray25);
        java.lang.String str28 = signature27.getName();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        java.lang.String str30 = signature27.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean34 = signature27.equals((java.lang.Object) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter31.visitOuterClass("L560606416", "L550590305", "L1348610381");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getInternalName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray21);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str22);
        propertyDescriptor3.setValue("L284401382", (java.lang.Object) "char");
        java.lang.reflect.Method method29 = null;
        java.lang.reflect.Method method30 = null;
        java.beans.PropertyDescriptor propertyDescriptor31 = new java.beans.PropertyDescriptor("hi!", method29, method30);
        propertyDescriptor31.setHidden(false);
        propertyDescriptor31.setDisplayName("boolean");
        propertyDescriptor31.setExpert(false);
        propertyDescriptor31.setHidden(true);
        java.lang.Class<?> wildcardClass40 = propertyDescriptor31.getPropertyEditorClass();
        boolean boolean41 = propertyDescriptor31.isExpert();
        propertyDescriptor3.setValue("", (java.lang.Object) propertyDescriptor31);
        java.lang.reflect.Method method44 = null;
        java.lang.reflect.Method method45 = null;
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("hi!", method44, method45);
        propertyDescriptor46.setHidden(false);
        java.lang.String str49 = propertyDescriptor46.getName();
        java.lang.Object obj51 = propertyDescriptor46.getValue("C");
        propertyDescriptor46.setName("L2099078913");
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor46);
        propertyDescriptor46.setShortDescription("L652808446");
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type58.getOpcode(5);
        int int61 = type58.getSize();
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((int) '4', type58);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("hi!");
        int int65 = type64.getSort();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.cglib.core.ClassInfo classInfo67 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.lang.String str70 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        boolean boolean72 = type58.equals((java.lang.Object) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo73 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.lang.String str74 = classInfo73.toString();
        org.mockito.asm.Type type75 = classInfo73.getType();
        java.beans.PropertyEditor propertyEditor76 = propertyDescriptor46.createPropertyEditor((java.lang.Object) type75);
        int int77 = type75.getSort();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        org.mockito.asm.Type[] typeArray24 = classInfo23.getInterfaces();
        org.mockito.asm.Type[] typeArray25 = classInfo23.getInterfaces();
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1137930343", type18, typeArray25);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        java.lang.reflect.Constructor constructor29 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray28);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        int int33 = type32.getSort();
        java.lang.Class<?> wildcardClass34 = type32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass34);
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        int int42 = type41.getSort();
        java.lang.Class<?> wildcardClass43 = type41.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray46 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray47 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray46);
        boolean boolean48 = classInfo39.equals((java.lang.Object) classArray47);
        java.lang.Object obj49 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor29, (java.lang.Object[]) classArray47);
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        java.lang.String[] strArray51 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        java.lang.Class[] classArray52 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(5, 154, "L751231323", "L1014117789", "L923909875", strArray51);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray19 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray19);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray27, false, true);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(116, 3, "L1996825514", "L991197699", "L1640928041", strArray14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature83 = methodInfo82.getSignature();
        org.mockito.cglib.core.ClassInfo classInfo84 = methodInfo82.getClassInfo();
        org.mockito.cglib.core.Signature signature85 = methodInfo82.getSignature();
        org.mockito.asm.Type type86 = signature85.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type87 = type86.getElementType();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getInternalName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray21);
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str22);
        propertyDescriptor3.setValue("L284401382", (java.lang.Object) "char");
        java.lang.Object obj28 = propertyDescriptor3.getValue("()Lorg/mockito/asm/Type;");
        propertyDescriptor3.setShortDescription("()Ljava/lang/Object;");
        propertyDescriptor3.setShortDescription("[Ljava/beans/PropertyDescriptor;");
        org.mockito.asm.Label label33 = new org.mockito.asm.Label();
        java.lang.Object obj34 = label33.info;
        java.lang.Class[] classArray35 = new java.lang.Class[] {};
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray35);
        label33.info = classArray35;
        java.beans.PropertyEditor propertyEditor38 = propertyDescriptor3.createPropertyEditor((java.lang.Object) label33);
        java.lang.Object obj39 = label33.info;
        java.lang.reflect.Method method41 = null;
        java.lang.reflect.Method method42 = null;
        java.beans.PropertyDescriptor propertyDescriptor43 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=hi!; constrained]", method41, method42);
        propertyDescriptor43.setExpert(false);
        propertyDescriptor43.setExpert(true);
        label33.info = true;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor43", propertyDescriptor3.equals(propertyDescriptor43) ? propertyDescriptor3.hashCode() == propertyDescriptor43.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.String str14 = type12.getInternalName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type16, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray23);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray23);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        int int33 = type32.getSort();
        java.lang.Class<?> wildcardClass34 = type32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray36);
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        java.lang.String[] strArray40 = org.mockito.cglib.core.ReflectUtils.getNames(classArray37);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        int int42 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getObjectType("hi!");
        int int47 = type46.getSort();
        java.lang.Class<?> wildcardClass48 = type46.getClass();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray52, false, true);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray55);
        java.lang.reflect.Method[] methodArray57 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray40, methodArray56);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray56);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getObjectType("hi!");
        int int61 = type60.getSort();
        java.lang.Class<?> wildcardClass62 = type60.getClass();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass62);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass62);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass62);
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass62);
        java.lang.reflect.Method[] methodArray69 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray66, true, true);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray66, true, false);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(19, 52, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; hidden]", "L352738243", "L1260560966", strArray30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L367643536");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, false);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        boolean boolean15 = type1.equals((java.lang.Object) classArray13);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray21 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray30 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray29, methodArray30);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray30);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray32);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        int int36 = type35.getSort();
        java.lang.Class<?> wildcardClass37 = type35.getClass();
        org.mockito.cglib.core.ClassInfo classInfo38 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass37);
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass37);
        java.lang.Class[] classArray40 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray39);
        int int41 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray40);
        int int42 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray40);
        java.lang.String[] strArray43 = org.mockito.cglib.core.ReflectUtils.getNames(classArray40);
        java.lang.Class[] classArray44 = new java.lang.Class[] {};
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        java.lang.String[] strArray47 = org.mockito.cglib.core.ReflectUtils.getNames(classArray44);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        int int50 = type49.getSort();
        java.lang.Class<?> wildcardClass51 = type49.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray54 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass51);
        java.lang.reflect.Method[] methodArray58 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray55, false, true);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray47, methodArray58);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray43, methodArray59);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray61);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(126, type1);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        int int6 = type5.getSize();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type[] typeArray13 = classInfo12.getInterfaces();
        org.mockito.asm.Type type14 = classInfo12.getType();
        java.lang.String str15 = classInfo12.toString();
        java.lang.String str16 = classInfo12.toString();
        org.mockito.asm.Type type17 = classInfo12.getSuperType();
        org.mockito.asm.Type[] typeArray18 = classInfo12.getInterfaces();
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = type5.getDimensions();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        java.lang.String str80 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.Signature signature81 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        java.lang.String str82 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.Signature signature83 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo85 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 100);
        int int86 = methodInfo85.getModifiers();
        org.mockito.cglib.core.Signature signature87 = methodInfo85.getSignature();
        org.mockito.asm.Type type88 = signature87.getReturnType();
        java.lang.String str89 = type88.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int90 = type88.getDimensions();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type2.getSize();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray9);
        boolean boolean14 = type2.equals((java.lang.Object) propertyDescriptorArray9);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(4, type2);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type21 = classInfo20.getType();
        org.mockito.asm.Type[] typeArray22 = classInfo20.getInterfaces();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("Lorg/mockito/cglib/core/Signature;", type2, typeArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = type2.getInternalName();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        label9.info = 130;
        java.lang.String str14 = label9.toString();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        int int21 = classInfo20.getModifiers();
        org.mockito.asm.Type type22 = classInfo20.getSuperType();
        label9.info = classInfo20;
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass30);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, false, true);
        java.lang.Class[] classArray38 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray37);
        label9.info = strArray26;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        int int43 = type42.getSort();
        java.lang.Class<?> wildcardClass44 = type42.getClass();
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass44);
        org.mockito.asm.Type[] typeArray46 = classInfo45.getInterfaces();
        java.lang.Class<?> wildcardClass47 = classInfo45.getClass();
        org.mockito.cglib.core.ClassInfo classInfo48 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass47);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray49, true, true);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray26, methodArray52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(0, 16, "L30195955", "LL1580912360;", "L1695773943", strArray26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 1041);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 96);
        org.mockito.cglib.core.Signature signature85 = methodInfo84.getSignature();
        org.mockito.asm.Type type86 = signature85.getReturnType();
        java.lang.String str87 = type86.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str88 = type86.getInternalName();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(136, 9, "(SDLg/mockito/asm/Type;Lhi!;Lg/mockito/asm/Type;)Lg/mockito/asm/Type;", "", "L1332784251", strArray21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        int int14 = classInfo13.getModifiers();
        org.mockito.asm.Type type15 = classInfo13.getType();
        java.lang.String str16 = type15.getClassName();
        int int18 = type15.getOpcode(162);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("L1096978147");
        java.lang.String str22 = type21.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean32 = classInfo29.equals((java.lang.Object) type31);
        int int33 = classInfo29.getModifiers();
        org.mockito.asm.Type type34 = classInfo29.getType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSort();
        java.lang.String str40 = type38.getInternalName();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type44.getOpcode(5);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type44);
        org.mockito.asm.Type type48 = local47.getType();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type42, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray49);
        boolean boolean52 = type38.equals((java.lang.Object) 10L);
        int int53 = type38.getSort();
        org.mockito.cglib.core.Local local54 = new org.mockito.cglib.core.Local(9, type38);
        org.mockito.asm.Type type55 = local54.getType();
        boolean boolean56 = classInfo29.equals((java.lang.Object) local54);
        org.mockito.asm.Type type57 = local54.getType();
        org.mockito.asm.Type type58 = local54.getType();
        org.mockito.cglib.core.Local local59 = new org.mockito.cglib.core.Local(128, type58);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        int int63 = type62.getSort();
        java.lang.String str64 = type62.getInternalName();
        org.mockito.cglib.core.Local local65 = new org.mockito.cglib.core.Local(0, type62);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type68 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int70 = type68.getOpcode(5);
        org.mockito.cglib.core.Local local71 = new org.mockito.cglib.core.Local((-1), type68);
        org.mockito.asm.Type type72 = local71.getType();
        org.mockito.asm.Type[] typeArray73 = new org.mockito.asm.Type[] { type66, type72 };
        java.lang.String str74 = org.mockito.asm.Type.getMethodDescriptor(type62, typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type58, typeArray73);
        org.mockito.cglib.core.Signature signature76 = new org.mockito.cglib.core.Signature("C", type21, typeArray73);
        org.mockito.asm.Type[] typeArray77 = signature76.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.begin_class(56, 1045, "java.beans.PropertyDescriptor[name=L1096978147; propertyEditorClass=class org.mockito.asm.Type]", type15, typeArray77, "L904860497");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray19 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray18, methodArray19);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(136, 9, "L1706789641", "L2028272858", "L735843859", strArray14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        java.lang.String str23 = type1.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode(5);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type34, type36 };
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray40);
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray40);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray40);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray40);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1770165165", type1, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = type1.getInternalName();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        label11.info = classArray13;
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(136, 103, "L647264466", "ZL1096978147", "", strArray18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        label1.info = ' ';
        label1.info = 100.0d;
        java.lang.Object obj7 = label1.info;
        java.lang.Class<?> wildcardClass8 = label1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str16 = signature15.toString();
        label11.info = str16;
        java.lang.Class<?> wildcardClass18 = label11.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        java.lang.Class[] classArray29 = new java.lang.Class[] {};
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        int int35 = type34.getSort();
        java.lang.Class<?> wildcardClass36 = type34.getClass();
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, true, false);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray41);
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray51 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray50, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        int int56 = type55.getSort();
        java.lang.Class<?> wildcardClass57 = type55.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass57);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray60, true, true);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray63);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray64);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("hi!");
        int int68 = type67.getSort();
        java.lang.Class<?> wildcardClass69 = type67.getClass();
        org.mockito.cglib.core.ClassInfo classInfo70 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass69);
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass69);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass69);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray74, true, false);
        java.lang.reflect.Method[] methodArray78 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray32, methodArray77);
        java.lang.Object obj79 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass18, classArray25, (java.lang.Object[]) strArray32);
        java.lang.reflect.Constructor constructor80 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass8, classArray25);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor80, 107);
        org.mockito.cglib.core.MethodInfo methodInfo83 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor80);
        java.lang.String str84 = org.mockito.asm.Type.getConstructorDescriptor(constructor80);
        org.mockito.cglib.core.MethodInfo methodInfo85 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor80);
        org.mockito.cglib.core.Signature signature86 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor80);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor80);
        org.mockito.cglib.core.MethodInfo methodInfo89 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor80, 0);
        org.mockito.cglib.core.MethodInfo methodInfo91 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor80, 104);
        org.mockito.cglib.core.Signature signature92 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor80);
        org.mockito.cglib.core.Signature signature93 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor80);
        org.mockito.asm.Type type94 = signature93.getReturnType();
        org.mockito.cglib.core.Local local95 = new org.mockito.cglib.core.Local(19, type94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str96 = type94.getInternalName();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        java.lang.Class<?> wildcardClass21 = classInfo19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean31 = classInfo28.equals((java.lang.Object) type30);
        int int32 = classInfo28.getModifiers();
        org.mockito.asm.Type type33 = classInfo28.getType();
        boolean boolean34 = classInfo22.equals((java.lang.Object) type33);
        org.mockito.asm.Type type35 = type33.getElementType();
        java.lang.String str36 = type33.getDescriptor();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(155, type33);
        org.mockito.asm.Type type38 = type33.getElementType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        int int41 = type40.getSort();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray43 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.declare_field((int) (short) 1, "L1706789641", type33, (java.lang.Object) propertyDescriptorArray47);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        java.lang.String str80 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.getObjectType("hi!");
        int int83 = type82.getSort();
        java.lang.Class<?> wildcardClass84 = type82.getClass();
        org.mockito.cglib.core.ClassInfo classInfo85 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass84);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass84);
        java.lang.Class[] classArray87 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray86);
        java.lang.Object obj88 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor79, (java.lang.Object[]) propertyDescriptorArray86);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo90 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature91 = methodInfo90.getSignature();
        org.mockito.asm.Type type92 = signature91.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int93 = type92.getDimensions();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("L367643536");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, false);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray24);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        boolean boolean32 = type18.equals((java.lang.Object) classArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit(160, 36, "L1137930343", "L647264466", "L436930601", strArray33);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean19 = classInfo16.equals((java.lang.Object) type18);
        int int21 = type18.getOpcode((int) (short) 10);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 10, type18);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type type24 = local22.getType();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(1, type24);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!; constrained]");
        org.mockito.asm.Type type28 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        int int31 = type30.getSort();
        java.lang.Class<?> wildcardClass32 = type30.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.cglib.core.ClassInfo classInfo34 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean37 = classInfo34.equals((java.lang.Object) type36);
        org.mockito.asm.Type type38 = classInfo34.getSuperType();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        int int46 = type45.getSort();
        java.lang.Class<?> wildcardClass47 = type45.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass47);
        java.beans.PropertyDescriptor[] propertyDescriptorArray49 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass47);
        org.mockito.cglib.core.ClassInfo classInfo50 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean52 = classInfo50.equals((java.lang.Object) type51);
        java.lang.String str53 = type51.toString();
        org.mockito.asm.Type[] typeArray54 = new org.mockito.asm.Type[] { type38, type40, type42, type43, type51 };
        java.lang.String str55 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray54);
        boolean boolean56 = type27.equals((java.lang.Object) typeArray54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.begin_class(0, 166, "L198517259", type24, typeArray54, "L929947385");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, false, true);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        int int30 = type29.getSort();
        java.lang.Class<?> wildcardClass31 = type29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type[] typeArray33 = classInfo32.getInterfaces();
        java.lang.Class<?> wildcardClass34 = classInfo32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray36, true, true);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visit(120, (int) (byte) 100, "java.lang.Object", "L2026738770", "L1415255773", strArray11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.toString();
        label0.info = str5;
        java.lang.Object obj7 = label0.info;
        java.lang.String str8 = label0.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        label0.info = wildcardClass12;
        java.lang.Object obj16 = label0.info;
        java.lang.String str17 = label0.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType("Z");
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(153, type20);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.asm.Type type23 = local21.getType();
        label0.info = type23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = type23.getElementType();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        propertyDescriptor3.setValue("Lorg/mockito/asm/Type;", (java.lang.Object) propertyDescriptorArray14);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.Class<?> wildcardClass19 = propertyDescriptorArray14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("hi!", method31, method32);
        propertyDescriptor33.setHidden(false);
        propertyDescriptor33.setDisplayName("boolean");
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        int int42 = type41.getSort();
        java.lang.String str43 = type41.getInternalName();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type47.getOpcode(5);
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((-1), type47);
        org.mockito.asm.Type type51 = local50.getType();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type45, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray52);
        boolean boolean55 = type41.equals((java.lang.Object) 10L);
        propertyDescriptor33.setValue("Lhi!;", (java.lang.Object) type41);
        java.lang.reflect.Method method57 = propertyDescriptor33.getWriteMethod();
        boolean boolean58 = propertyDescriptor33.isHidden();
        java.lang.String str59 = propertyDescriptor33.getName();
        boolean boolean60 = classInfo29.equals((java.lang.Object) str59);
        java.lang.String str61 = classInfo29.toString();
        boolean boolean62 = classInfo20.equals((java.lang.Object) classInfo29);
        java.lang.reflect.Method method64 = null;
        java.lang.reflect.Method method65 = null;
        java.beans.PropertyDescriptor propertyDescriptor66 = new java.beans.PropertyDescriptor("L28161895", method64, method65);
        java.lang.reflect.Method method67 = null;
        propertyDescriptor66.setReadMethod(method67);
        propertyDescriptor66.setShortDescription("L388420458(DZ)Lorg/mockito/asm/Type;");
        boolean boolean71 = classInfo20.equals((java.lang.Object) "L388420458(DZ)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor33 and propertyDescriptor66", propertyDescriptor33.equals(propertyDescriptor66) ? propertyDescriptor33.hashCode() == propertyDescriptor66.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(10);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.String str8 = type6.getInternalName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray17);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray30 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray39);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray42);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature83 = methodInfo82.getSignature();
        org.mockito.cglib.core.ClassInfo classInfo84 = methodInfo82.getClassInfo();
        org.mockito.cglib.core.Signature signature85 = methodInfo82.getSignature();
        org.mockito.asm.Type[] typeArray86 = signature85.getArgumentTypes();
        org.mockito.asm.Type type87 = signature85.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str88 = type87.getInternalName();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setShortDescription("L546622177");
        boolean boolean10 = propertyDescriptor3.isPreferred();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean12 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = null;
        java.beans.PropertyDescriptor propertyDescriptor16 = new java.beans.PropertyDescriptor("hi!", method14, method15);
        propertyDescriptor16.setHidden(false);
        boolean boolean19 = propertyDescriptor16.isHidden();
        boolean boolean20 = propertyDescriptor16.isHidden();
        propertyDescriptor16.setPreferred(false);
        java.lang.reflect.Method method23 = propertyDescriptor16.getReadMethod();
        propertyDescriptor16.setPreferred(true);
        java.lang.Object obj27 = propertyDescriptor16.getValue("");
        java.lang.reflect.Method method28 = propertyDescriptor16.getReadMethod();
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor3.createPropertyEditor((java.lang.Object) method28);
        propertyDescriptor3.setShortDescription("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]]");
        java.lang.String str32 = propertyDescriptor3.getDisplayName();
        java.lang.Class<?> wildcardClass33 = propertyDescriptor3.getPropertyType();
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = null;
        java.beans.PropertyDescriptor propertyDescriptor37 = new java.beans.PropertyDescriptor("hi!", method35, method36);
        propertyDescriptor37.setHidden(false);
        propertyDescriptor37.setPreferred(false);
        propertyDescriptor37.setBound(false);
        java.lang.reflect.Method method44 = propertyDescriptor37.getWriteMethod();
        java.lang.String str45 = propertyDescriptor37.getShortDescription();
        java.lang.Class<?> wildcardClass46 = propertyDescriptor37.getPropertyType();
        propertyDescriptor37.setName("L621957885");
        propertyDescriptor37.setConstrained(false);
        java.lang.Class[] classArray52 = new java.lang.Class[] {};
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        java.lang.String[] strArray55 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        propertyDescriptor37.setValue("L1738500771", (java.lang.Object) strArray55);
        boolean boolean57 = propertyDescriptor3.equals((java.lang.Object) strArray55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor16 and propertyDescriptor37", propertyDescriptor16.equals(propertyDescriptor37) ? propertyDescriptor16.hashCode() == propertyDescriptor37.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type9.getOpcode(10);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        boolean boolean29 = type8.equals((java.lang.Object) type9);
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local(100, type9);
        org.mockito.asm.Type type31 = local30.getType();
        java.lang.String str32 = type31.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type33 = type31.getElementType();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        int int22 = type1.getOpcode((int) (short) 1);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(42, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type24 = type1.getElementType();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.CHAR_TYPE;
        int int14 = type13.getSize();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray20);
        boolean boolean25 = type13.equals((java.lang.Object) propertyDescriptorArray20);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(4, type13);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        int int31 = type30.getSort();
        java.lang.String str32 = type30.getInternalName();
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local(0, type30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type40 = local39.getType();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type34, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray41);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray41);
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        int int45 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray43);
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.declare_field(8, "L1726174064", type27, (java.lang.Object) classArray43);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        java.lang.String str80 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        java.lang.String str81 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo83 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 134);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo86 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 10);
        org.mockito.cglib.core.Signature signature87 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo88 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature89 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type type90 = signature89.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type91 = type90.getElementType();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        java.lang.String str80 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.Signature signature81 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        java.lang.String str82 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.Signature signature83 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo85 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 5);
        org.mockito.cglib.core.Signature signature86 = methodInfo85.getSignature();
        org.mockito.asm.Type type87 = signature86.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type88 = type87.getElementType();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray28);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray31);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        int int2 = type1.getSize();
        org.mockito.asm.Label label3 = new org.mockito.asm.Label();
        java.lang.Object obj4 = label3.info;
        label3.info = ' ';
        label3.info = 100.0d;
        java.lang.Object obj9 = label3.info;
        java.lang.Class<?> wildcardClass10 = label3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass10);
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str18 = signature17.toString();
        label13.info = str18;
        java.lang.Class<?> wildcardClass20 = label13.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray26);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        int int33 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.cglib.core.ClassInfo classInfo39 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass38);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, true, false);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray43);
        java.lang.Class[] classArray45 = new java.lang.Class[] {};
        int int46 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray45);
        java.lang.String[] strArray47 = org.mockito.cglib.core.ReflectUtils.getNames(classArray45);
        java.lang.String[] strArray48 = org.mockito.cglib.core.ReflectUtils.getNames(classArray45);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray53 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray52, methodArray53);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray53);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        int int58 = type57.getSort();
        java.lang.Class<?> wildcardClass59 = type57.getClass();
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass59);
        java.beans.PropertyDescriptor[] propertyDescriptorArray62 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass59);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray62, true, true);
        java.lang.reflect.Method[] methodArray66 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray48, methodArray65);
        java.lang.reflect.Method[] methodArray67 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray66);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getObjectType("hi!");
        int int70 = type69.getSort();
        java.lang.Class<?> wildcardClass71 = type69.getClass();
        org.mockito.cglib.core.ClassInfo classInfo72 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass71);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass71);
        org.mockito.cglib.core.ClassInfo classInfo74 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass71);
        org.mockito.asm.Type type75 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass71);
        java.beans.PropertyDescriptor[] propertyDescriptorArray76 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass71);
        java.lang.reflect.Method[] methodArray79 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray76, true, false);
        java.lang.reflect.Method[] methodArray80 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray79);
        java.lang.Object obj81 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass20, classArray27, (java.lang.Object[]) strArray34);
        java.lang.reflect.Constructor constructor82 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass10, classArray27);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82, 107);
        org.mockito.cglib.core.MethodInfo methodInfo85 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82);
        java.lang.String str86 = org.mockito.asm.Type.getConstructorDescriptor(constructor82);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor82);
        org.mockito.cglib.core.MethodInfo methodInfo89 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82, 2);
        org.mockito.cglib.core.MethodInfo methodInfo90 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82);
        org.mockito.cglib.core.Signature signature91 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor82);
        java.lang.String str92 = org.mockito.asm.Type.getConstructorDescriptor(constructor82);
        java.lang.String str93 = org.mockito.asm.Type.getConstructorDescriptor(constructor82);
        org.mockito.cglib.core.MethodInfo methodInfo94 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor82);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor82);
        java.lang.String str96 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int97 = type1.getDimensions();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type9, type11 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray15);
        boolean boolean18 = signature4.equals((java.lang.Object) typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        java.lang.String str20 = type0.getClassName();
        int int21 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = type0.getDimensions();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.lang.String str12 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("hi!", method15, method16);
        propertyDescriptor17.setHidden(false);
        propertyDescriptor17.setDisplayName("boolean");
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.String str27 = type25.getInternalName();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode(5);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((-1), type31);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray36);
        boolean boolean39 = type25.equals((java.lang.Object) 10L);
        propertyDescriptor17.setValue("Lhi!;", (java.lang.Object) type25);
        java.lang.reflect.Method method41 = propertyDescriptor17.getWriteMethod();
        boolean boolean42 = propertyDescriptor17.isHidden();
        java.lang.String str43 = propertyDescriptor17.getName();
        boolean boolean44 = classInfo13.equals((java.lang.Object) str43);
        org.mockito.asm.Type type45 = classInfo13.getType();
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local(124, type45);
        org.mockito.asm.Type type47 = type45.getElementType();
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str51 = signature50.getName();
        java.lang.String str52 = signature50.toString();
        org.mockito.asm.Type type53 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str54 = type53.getClassName();
        int int55 = type53.getSort();
        int int57 = type53.getOpcode(104);
        boolean boolean58 = signature50.equals((java.lang.Object) 104);
        java.lang.reflect.Method method60 = null;
        java.lang.reflect.Method method61 = null;
        java.beans.PropertyDescriptor propertyDescriptor62 = new java.beans.PropertyDescriptor("L1096978147", method60, method61);
        java.util.Enumeration<java.lang.String> strEnumeration63 = propertyDescriptor62.attributeNames();
        boolean boolean64 = signature50.equals((java.lang.Object) propertyDescriptor62);
        java.lang.String str65 = propertyDescriptor62.getShortDescription();
        java.lang.String str66 = propertyDescriptor62.getDisplayName();
        boolean boolean67 = type45.equals((java.lang.Object) propertyDescriptor62);
        java.beans.PropertyEditor propertyEditor68 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor62", propertyDescriptor17.equals(propertyDescriptor62) ? propertyDescriptor17.hashCode() == propertyDescriptor62.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray31);
        boolean boolean33 = classInfo24.equals((java.lang.Object) classArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor34 = classEmitter10.visitField(112, "L1517098075", "LL219427426;", "L1936971101", (java.lang.Object) classInfo24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean12 = type2.equals((java.lang.Object) propertyDescriptorArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type2, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = type2.getDimensions();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        int int5 = type2.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) '4', type2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(2, type2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        boolean boolean15 = type2.equals((java.lang.Object) wildcardClass11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = type2.getInternalName();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor27 = classEmitter20.visitAnnotation("L1414745043", true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        int int16 = type1.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = type1.getInternalName();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int1 = type0.getSize();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass5);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray7, true, false);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray7);
        boolean boolean12 = type0.equals((java.lang.Object) propertyDescriptorArray7);
        java.lang.String str13 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type14 = type0.getElementType();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        java.lang.Object obj4 = label0.info;
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str8 = signature7.getName();
        java.lang.String str9 = signature7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getClassName();
        int int12 = type10.getSort();
        int int14 = type10.getOpcode(104);
        boolean boolean15 = signature7.equals((java.lang.Object) 104);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = null;
        java.beans.PropertyDescriptor propertyDescriptor19 = new java.beans.PropertyDescriptor("L1096978147", method17, method18);
        java.util.Enumeration<java.lang.String> strEnumeration20 = propertyDescriptor19.attributeNames();
        boolean boolean21 = signature7.equals((java.lang.Object) propertyDescriptor19);
        java.lang.String str22 = signature7.getName();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.CHAR_TYPE;
        int int25 = type23.getOpcode(10);
        java.lang.String str26 = type23.getClassName();
        int int27 = type23.getSize();
        boolean boolean28 = signature7.equals((java.lang.Object) type23);
        label0.info = type23;
        java.lang.Object obj30 = label0.info;
        java.lang.Object obj31 = label0.info;
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str35 = signature34.getName();
        java.lang.String str36 = signature34.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str38 = type37.getClassName();
        int int39 = type37.getSort();
        int int41 = type37.getOpcode(104);
        boolean boolean42 = signature34.equals((java.lang.Object) 104);
        boolean boolean44 = signature34.equals((java.lang.Object) "Lhi!;");
        java.lang.String str45 = signature34.toString();
        java.lang.String str46 = signature34.getDescriptor();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getObjectType("hi!");
        int int49 = type48.getSort();
        java.lang.Class<?> wildcardClass50 = type48.getClass();
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray52 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        java.lang.String str54 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo55 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo57 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        boolean boolean58 = signature34.equals((java.lang.Object) classInfo57);
        org.mockito.asm.Type type59 = classInfo57.getSuperType();
        java.lang.String str60 = type59.getClassName();
        int int62 = type59.getOpcode(1041);
        label0.info = 1041;
        java.lang.reflect.Method method65 = null;
        java.lang.reflect.Method method66 = null;
        java.beans.PropertyDescriptor propertyDescriptor67 = new java.beans.PropertyDescriptor("hi!", method65, method66);
        propertyDescriptor67.setHidden(false);
        propertyDescriptor67.setDisplayName("boolean");
        boolean boolean72 = propertyDescriptor67.isHidden();
        java.lang.String str73 = propertyDescriptor67.getShortDescription();
        boolean boolean74 = propertyDescriptor67.isHidden();
        java.lang.Class<?> wildcardClass75 = propertyDescriptor67.getPropertyEditorClass();
        java.lang.String str76 = propertyDescriptor67.getShortDescription();
        propertyDescriptor67.setExpert(true);
        java.lang.Object obj80 = propertyDescriptor67.getValue("L369956882");
        label0.info = "L369956882";
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor19 and propertyDescriptor67", propertyDescriptor19.equals(propertyDescriptor67) ? propertyDescriptor19.hashCode() == propertyDescriptor67.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        int int16 = type1.getSort();
        int int18 = type1.getOpcode(14);
        int int20 = type1.getOpcode(55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type1.getInternalName();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type11.getOpcode(10);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.String str19 = type17.getInternalName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type21, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray28);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        int int35 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray34);
        java.lang.String[] strArray36 = org.mockito.cglib.core.ReflectUtils.getNames(classArray34);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSort();
        java.lang.Class<?> wildcardClass40 = type38.getClass();
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type[] typeArray42 = classInfo41.getInterfaces();
        java.lang.Class<?> wildcardClass43 = classInfo41.getClass();
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.lang.reflect.Method[] methodArray48 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray45, true, false);
        java.lang.reflect.Method[] methodArray49 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray36, methodArray48);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray33, methodArray49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray50);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        java.lang.String str83 = org.mockito.asm.Type.getConstructorDescriptor(constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo84 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.Signature signature85 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type[] typeArray86 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor79);
        org.mockito.cglib.core.MethodInfo methodInfo88 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 0);
        org.mockito.cglib.core.MethodInfo methodInfo90 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 104);
        org.mockito.cglib.core.Signature signature91 = org.mockito.cglib.core.ReflectUtils.getSignature((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type type92 = signature91.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str93 = type92.getInternalName();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray16);
        label0.info = str18;
        java.lang.String str20 = label0.toString();
        java.lang.String str21 = label0.toString();
        java.lang.String[] strArray23 = new java.lang.String[] { "org.mockito.asm.Type" };
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass27);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray30);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, false, false);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray34);
        label0.info = strArray23;
        java.lang.String[] strArray39 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L1096978147]", "L319431409" };
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        int int42 = type41.getSort();
        java.lang.Class<?> wildcardClass43 = type41.getClass();
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        java.beans.PropertyDescriptor[] propertyDescriptorArray45 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray46 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray45);
        int int47 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray46);
        java.lang.String[] strArray49 = org.mockito.cglib.core.ReflectUtils.getNames(classArray46);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        int int52 = type51.getSort();
        java.lang.Class<?> wildcardClass53 = type51.getClass();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        java.beans.PropertyDescriptor[] propertyDescriptorArray55 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass53);
        java.lang.String str56 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass53);
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass53);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray57, false, false);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray60);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray62);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("L1619796034", method1, method2);
        propertyDescriptor3.setExpert(false);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("D", "L874100273");
        java.lang.String str9 = signature8.toString();
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str9);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setDisplayName("boolean");
        boolean boolean20 = propertyDescriptor15.isHidden();
        java.lang.String str21 = propertyDescriptor15.getShortDescription();
        boolean boolean22 = propertyDescriptor15.isHidden();
        propertyDescriptor15.setConstrained(false);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        propertyDescriptor29.setHidden(false);
        java.lang.reflect.Method method32 = propertyDescriptor29.getReadMethod();
        java.lang.reflect.Method method33 = propertyDescriptor29.getReadMethod();
        java.lang.reflect.Method method34 = propertyDescriptor29.getReadMethod();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type40 = local39.getType();
        java.lang.String str41 = type40.toString();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.lang.String str44 = classInfo43.toString();
        java.beans.PropertyEditor propertyEditor45 = propertyDescriptor29.createPropertyEditor((java.lang.Object) str44);
        propertyDescriptor15.setValue("(JLorg/mockito/asm/Type;)Lhi!;", (java.lang.Object) propertyDescriptor29);
        propertyDescriptor3.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor29);
        java.lang.reflect.Method method48 = propertyDescriptor29.getReadMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor15", propertyDescriptor3.equals(propertyDescriptor15) ? propertyDescriptor3.hashCode() == propertyDescriptor15.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type[] typeArray83 = methodInfo82.getExceptionTypes();
        java.lang.String str84 = methodInfo82.toString();
        java.lang.String str85 = methodInfo82.toString();
        org.mockito.cglib.core.Signature signature86 = methodInfo82.getSignature();
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter87);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter90);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter91);
        boolean boolean93 = methodInfo82.equals((java.lang.Object) classEmitter91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor96 = classEmitter91.visitAnnotation("L1161485131", false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type3.getOpcode(5);
        int int6 = type3.getSize();
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local((int) '4', type3);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(2, type3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        boolean boolean16 = type3.equals((java.lang.Object) wildcardClass12);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((int) (short) 10, type3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = type3.getInternalName();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray2);
        label0.info = classArray2;
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray2);
        java.lang.String[] strArray6 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getInternalName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.String[] strArray30 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        java.lang.Class[] classArray31 = new java.lang.Class[] {};
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.String[] strArray34 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray39 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray38, methodArray39);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray39);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        int int44 = type43.getSort();
        java.lang.Class<?> wildcardClass45 = type43.getClass();
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray48, true, true);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray34, methodArray51);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray30, methodArray51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray53);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(130);
        int int6 = type1.getSort();
        int int7 = type1.getSort();
        java.lang.String str8 = type1.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        int int13 = type10.getSize();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((int) '4', type10);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.lang.String str22 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        boolean boolean24 = type10.equals((java.lang.Object) wildcardClass18);
        int int25 = type10.getSort();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type[] typeArray32 = classInfo31.getInterfaces();
        org.mockito.asm.Type type33 = classInfo31.getType();
        java.lang.String str34 = classInfo31.toString();
        org.mockito.asm.Type[] typeArray35 = classInfo31.getInterfaces();
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray35);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("", type1, typeArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = type1.getInternalName();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean10 = classInfo7.equals((java.lang.Object) type9);
        org.mockito.asm.Type type11 = classInfo7.getSuperType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean25 = classInfo23.equals((java.lang.Object) type24);
        java.lang.String str26 = type24.toString();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type11, type13, type15, type16, type24 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray27);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (byte) 10, type1);
        java.lang.String str30 = type1.getDescriptor();
        int int32 = type1.getOpcode((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str33 = type1.getInternalName();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type9, type11 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray15);
        boolean boolean18 = signature4.equals((java.lang.Object) typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        int int26 = classInfo25.getModifiers();
        int int27 = classInfo25.getModifiers();
        org.mockito.asm.Type[] typeArray28 = classInfo25.getInterfaces();
        org.mockito.asm.Type type29 = classInfo25.getSuperType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("Lg/mockito/asm/Type;");
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode(5);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type41.getOpcode(5);
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((-1), type41);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type39, type41 };
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray45);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray45);
        java.lang.String str48 = type33.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getObjectType("hi!");
        int int51 = type50.getSort();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int54 = type52.getOpcode(5);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int57 = type55.getOpcode(5);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type60 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int62 = type60.getOpcode(5);
        org.mockito.cglib.core.Local local63 = new org.mockito.cglib.core.Local((-1), type60);
        org.mockito.asm.Type[] typeArray64 = new org.mockito.asm.Type[] { type58, type60 };
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type55, typeArray64);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type52, typeArray64);
        java.lang.String str67 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray64);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("C", type33, typeArray64);
        java.lang.String str69 = org.mockito.asm.Type.getMethodDescriptor(type31, typeArray64);
        boolean boolean70 = classInfo25.equals((java.lang.Object) typeArray64);
        org.mockito.asm.Type[] typeArray71 = classInfo25.getInterfaces();
        org.mockito.asm.Type[] typeArray72 = classInfo25.getInterfaces();
        java.lang.String str73 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str74 = type0.getInternalName();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getInternalName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type15, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray22);
        boolean boolean25 = type11.equals((java.lang.Object) 10L);
        propertyDescriptor3.setValue("Lhi!;", (java.lang.Object) type11);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setName("L1683403049");
        boolean boolean33 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method36 = null;
        java.lang.reflect.Method method37 = null;
        java.beans.PropertyDescriptor propertyDescriptor38 = new java.beans.PropertyDescriptor("hi!", method36, method37);
        propertyDescriptor38.setConstrained(false);
        java.lang.String str41 = propertyDescriptor38.getShortDescription();
        boolean boolean42 = propertyDescriptor38.isPreferred();
        java.lang.reflect.Method method45 = null;
        java.lang.reflect.Method method46 = null;
        java.beans.PropertyDescriptor propertyDescriptor47 = new java.beans.PropertyDescriptor("hi!", method45, method46);
        propertyDescriptor47.setHidden(false);
        propertyDescriptor47.setDisplayName("boolean");
        propertyDescriptor47.setExpert(false);
        propertyDescriptor47.setHidden(true);
        propertyDescriptor38.setValue("char", (java.lang.Object) true);
        java.lang.Object obj58 = propertyDescriptor38.getValue("");
        java.lang.Object obj60 = propertyDescriptor38.getValue("(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V");
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("hi!");
        int int64 = type63.getSort();
        java.lang.Class<?> wildcardClass65 = type63.getClass();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray67 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass65);
        java.lang.String str70 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass65);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass65);
        propertyDescriptor38.setValue("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; hidden; values={java.beans.PropertyDescriptor[name=hi!]=java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]}]", (java.lang.Object) propertyDescriptorArray71);
        propertyDescriptor3.setValue("L2116473805", (java.lang.Object) propertyDescriptorArray71);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray71, false, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor38", propertyDescriptor3.equals(propertyDescriptor38) ? propertyDescriptor3.hashCode() == propertyDescriptor38.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        java.lang.Object obj4 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        label0.info = type5;
        java.lang.String str8 = type5.getClassName();
        java.lang.String str9 = type5.getDescriptor();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        label10.info = ' ';
        label10.info = 100.0d;
        java.lang.Object obj16 = label10.info;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str25 = signature24.toString();
        label20.info = str25;
        java.lang.Class<?> wildcardClass27 = label20.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        int int30 = type29.getSort();
        java.lang.Class<?> wildcardClass31 = type29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass31);
        java.lang.Class[] classArray34 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray33);
        int int35 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray34);
        int int36 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray34);
        int int37 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray34);
        java.lang.Class[] classArray38 = new java.lang.Class[] {};
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray38);
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray38);
        java.lang.String[] strArray41 = org.mockito.cglib.core.ReflectUtils.getNames(classArray38);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        int int44 = type43.getSort();
        java.lang.Class<?> wildcardClass45 = type43.getClass();
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass45);
        java.lang.reflect.Method[] methodArray50 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray47, true, false);
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray50);
        java.lang.Class[] classArray52 = new java.lang.Class[] {};
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        java.lang.String[] strArray55 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray60 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray59, methodArray60);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray60);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("hi!");
        int int65 = type64.getSort();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray69 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass66);
        java.lang.reflect.Method[] methodArray72 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray69, true, true);
        java.lang.reflect.Method[] methodArray73 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray72);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray73);
        org.mockito.asm.Type type76 = org.mockito.asm.Type.getObjectType("hi!");
        int int77 = type76.getSort();
        java.lang.Class<?> wildcardClass78 = type76.getClass();
        org.mockito.cglib.core.ClassInfo classInfo79 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass78);
        java.beans.PropertyDescriptor[] propertyDescriptorArray80 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass78);
        org.mockito.cglib.core.ClassInfo classInfo81 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass78);
        org.mockito.asm.Type type82 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass78);
        java.beans.PropertyDescriptor[] propertyDescriptorArray83 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass78);
        java.lang.reflect.Method[] methodArray86 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray83, true, false);
        java.lang.reflect.Method[] methodArray87 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray41, methodArray86);
        java.lang.Object obj88 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass27, classArray34, (java.lang.Object[]) strArray41);
        java.lang.reflect.Constructor constructor89 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray34);
        org.mockito.cglib.core.MethodInfo methodInfo91 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor89, 107);
        org.mockito.cglib.core.MethodInfo methodInfo92 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor89);
        java.lang.String str93 = org.mockito.asm.Type.getConstructorDescriptor(constructor89);
        org.mockito.asm.Type[] typeArray94 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes((java.lang.reflect.Member) constructor89);
        java.lang.String str95 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray94);
        int int96 = type5.getSort();
        int int98 = type5.getOpcode(137);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type99 = type5.getElementType();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean15 = classInfo12.equals((java.lang.Object) type14);
        int int16 = classInfo12.getModifiers();
        org.mockito.asm.Type type17 = classInfo12.getType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.String str23 = type21.getInternalName();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type27.getOpcode(5);
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type25, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray32);
        boolean boolean35 = type21.equals((java.lang.Object) 10L);
        int int36 = type21.getSort();
        org.mockito.cglib.core.Local local37 = new org.mockito.cglib.core.Local(9, type21);
        org.mockito.asm.Type type38 = local37.getType();
        boolean boolean39 = classInfo12.equals((java.lang.Object) local37);
        boolean boolean41 = classInfo12.equals((java.lang.Object) 100.0d);
        org.mockito.asm.Type type42 = classInfo12.getSuperType();
        java.lang.String str43 = type42.getClassName();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        int int48 = type47.getSort();
        java.lang.Class<?> wildcardClass49 = type47.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean54 = classInfo51.equals((java.lang.Object) type53);
        int int56 = type53.getOpcode((int) (short) 10);
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) (short) 10, type53);
        org.mockito.asm.Type type58 = local57.getType();
        org.mockito.asm.Type type59 = local57.getType();
        org.mockito.cglib.core.Local local60 = new org.mockito.cglib.core.Local(1, type59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(64, "L184252267", type42, (java.lang.Object) 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        propertyDescriptor13.setHidden(false);
        propertyDescriptor13.setDisplayName("boolean");
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.String str23 = type21.getInternalName();
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local(0, type21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int29 = type27.getOpcode(5);
        org.mockito.cglib.core.Local local30 = new org.mockito.cglib.core.Local((-1), type27);
        org.mockito.asm.Type type31 = local30.getType();
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type25, type31 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray32);
        boolean boolean35 = type21.equals((java.lang.Object) 10L);
        propertyDescriptor13.setValue("Lhi!;", (java.lang.Object) type21);
        java.lang.reflect.Method method37 = propertyDescriptor13.getWriteMethod();
        boolean boolean38 = propertyDescriptor13.isHidden();
        java.lang.String str39 = propertyDescriptor13.getName();
        boolean boolean40 = classInfo9.equals((java.lang.Object) str39);
        org.mockito.asm.Type type41 = classInfo9.getType();
        org.mockito.cglib.core.Local local42 = new org.mockito.cglib.core.Local(124, type41);
        org.mockito.asm.Type type43 = type41.getElementType();
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str47 = signature46.getName();
        java.lang.String str48 = signature46.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.getClassName();
        int int51 = type49.getSort();
        int int53 = type49.getOpcode(104);
        boolean boolean54 = signature46.equals((java.lang.Object) 104);
        java.lang.reflect.Method method56 = null;
        java.lang.reflect.Method method57 = null;
        java.beans.PropertyDescriptor propertyDescriptor58 = new java.beans.PropertyDescriptor("L1096978147", method56, method57);
        java.util.Enumeration<java.lang.String> strEnumeration59 = propertyDescriptor58.attributeNames();
        boolean boolean60 = signature46.equals((java.lang.Object) propertyDescriptor58);
        java.lang.String str61 = propertyDescriptor58.getShortDescription();
        java.lang.String str62 = propertyDescriptor58.getDisplayName();
        boolean boolean63 = type41.equals((java.lang.Object) propertyDescriptor58);
        java.lang.String str64 = type41.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor13 and propertyDescriptor58", propertyDescriptor13.equals(propertyDescriptor58) ? propertyDescriptor13.hashCode() == propertyDescriptor58.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type25 = classEmitter20.getSuperType();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean17 = classInfo14.equals((java.lang.Object) type16);
        int int18 = classInfo14.getModifiers();
        org.mockito.asm.Type type19 = classInfo14.getType();
        org.mockito.asm.Type type20 = type19.getElementType();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        int int32 = type31.getSort();
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean38 = classInfo35.equals((java.lang.Object) type37);
        int int39 = classInfo35.getModifiers();
        org.mockito.asm.Type[] typeArray40 = classInfo35.getInterfaces();
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray40);
        boolean boolean42 = type20.equals((java.lang.Object) typeArray40);
        java.lang.Class[] classArray43 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray40);
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.String[] strArray46 = org.mockito.cglib.core.ReflectUtils.getNames(classArray43);
        java.lang.Class[] classArray47 = new java.lang.Class[] {};
        int int48 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        int int49 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray47);
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray47);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getObjectType("hi!");
        int int53 = type52.getSort();
        java.lang.Class<?> wildcardClass54 = type52.getClass();
        org.mockito.cglib.core.ClassInfo classInfo55 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass54);
        java.beans.PropertyDescriptor[] propertyDescriptorArray56 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass54);
        java.lang.reflect.Method[] methodArray59 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray56, true, false);
        java.lang.reflect.Method[] methodArray60 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray50, methodArray59);
        java.lang.reflect.Method[] methodArray61 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray46, methodArray60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(138, (int) (byte) -1, "", "L1006610172", "L1701858396", strArray46);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter2.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str28 = signature27.toString();
        label23.info = str28;
        java.lang.Class<?> wildcardClass30 = label23.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        int int33 = type32.getSort();
        java.lang.Class<?> wildcardClass34 = type32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass34);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray36);
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        int int40 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        java.lang.Class[] classArray41 = new java.lang.Class[] {};
        int int42 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray41);
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray41);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray41);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getObjectType("hi!");
        int int47 = type46.getSort();
        java.lang.Class<?> wildcardClass48 = type46.getClass();
        org.mockito.cglib.core.ClassInfo classInfo49 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass48);
        java.beans.PropertyDescriptor[] propertyDescriptorArray50 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass48);
        java.lang.reflect.Method[] methodArray53 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray50, true, false);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray53);
        java.lang.Class[] classArray55 = new java.lang.Class[] {};
        int int56 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray55);
        java.lang.String[] strArray57 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        java.lang.String[] strArray58 = org.mockito.cglib.core.ReflectUtils.getNames(classArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray63 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray62, methodArray63);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray63);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("hi!");
        int int68 = type67.getSort();
        java.lang.Class<?> wildcardClass69 = type67.getClass();
        org.mockito.asm.Type type70 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass69);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass69);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass69);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray72, true, true);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray58, methodArray75);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray76);
        org.mockito.asm.Type type79 = org.mockito.asm.Type.getObjectType("hi!");
        int int80 = type79.getSort();
        java.lang.Class<?> wildcardClass81 = type79.getClass();
        org.mockito.cglib.core.ClassInfo classInfo82 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass81);
        java.beans.PropertyDescriptor[] propertyDescriptorArray83 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass81);
        org.mockito.cglib.core.ClassInfo classInfo84 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass81);
        org.mockito.asm.Type type85 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass81);
        java.beans.PropertyDescriptor[] propertyDescriptorArray86 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass81);
        java.lang.reflect.Method[] methodArray89 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray86, true, false);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray44, methodArray89);
        java.lang.Object obj91 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass30, classArray37, (java.lang.Object[]) strArray44);
        java.beans.PropertyDescriptor[] propertyDescriptorArray92 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass30);
        java.lang.reflect.Method[] methodArray95 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray92, false, true);
        java.lang.reflect.Method[] methodArray96 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visit(51, 111, "L1638126583", "L367643536", "Lg.mockito.asm.Type;", strArray22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str3 = type2.getClassName();
        int int4 = type2.getSort();
        int int6 = type2.getOpcode(130);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type[] typeArray13 = classInfo12.getInterfaces();
        org.mockito.asm.Type type14 = classInfo12.getType();
        java.lang.String str15 = classInfo12.toString();
        org.mockito.asm.Type[] typeArray16 = classInfo12.getInterfaces();
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]", type2, typeArray16);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((int) (byte) 0, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = type2.getDimensions();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        label15.info = classArray17;
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray17);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visit(1041, 145, "(DZ)I", "L246239756", "LL2085007337;", strArray21);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, false, true);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray22);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray11);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visit(1049, 19, "L282132328", "L325498895", "()Lva/lang/Object;", strArray11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass24);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray29, true, true);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(56, 6, "java.beans.PropertyDescriptor[name=ava.beans.PropertyDescriptor[name=hi!]", "L1307823084", "L2083306876", strArray20);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        label10.info = classArray12;
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visit(1, 104, "L461345669", "L444376247", "L1210117394", strArray17);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(10);
        java.lang.String str3 = type0.getClassName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.String str8 = type6.getInternalName();
        org.mockito.cglib.core.Local local9 = new org.mockito.cglib.core.Local(0, type6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type16 = local15.getType();
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type10, type16 };
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray17);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray32, true, true);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray36);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = classInfo6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.toString();
        int int10 = type7.getSize();
        int int12 = type7.getOpcode(1041);
        int int13 = type7.getSize();
        int int14 = type7.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type15 = type7.getElementType();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean19 = classInfo16.equals((java.lang.Object) type18);
        org.mockito.asm.Type type20 = classInfo16.getSuperType();
        int int21 = classInfo16.getModifiers();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.String str27 = type25.getInternalName();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode(5);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((-1), type31);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray36);
        boolean boolean39 = type25.equals((java.lang.Object) 10L);
        int int40 = type25.getSort();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(9, type25);
        org.mockito.asm.Type type42 = local41.getType();
        int int43 = local41.getIndex();
        org.mockito.asm.Type type44 = local41.getType();
        boolean boolean45 = classInfo16.equals((java.lang.Object) type44);
        org.mockito.asm.Type[] typeArray46 = classInfo16.getInterfaces();
        int int47 = classInfo16.getModifiers();
        org.mockito.asm.Type type48 = classInfo16.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor49 = classEmitter4.visitField(124, "L1991125346", "()[Ljava/lang/reflect/Method;", "Lorg/mockito/asm/Type;", (java.lang.Object) classInfo16);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo80 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type[] typeArray81 = methodInfo80.getExceptionTypes();
        org.mockito.cglib.core.Signature signature82 = methodInfo80.getSignature();
        org.mockito.asm.Type type83 = signature82.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type84 = type83.getElementType();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        boolean boolean9 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        java.lang.Object obj13 = propertyDescriptor3.getValue("");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type15.getSize();
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str20 = signature19.getName();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type26.getOpcode(5);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type24, type26 };
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type21, typeArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray30);
        boolean boolean33 = signature19.equals((java.lang.Object) typeArray30);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray30);
        java.lang.Class<?> wildcardClass35 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass35);
        propertyDescriptor3.setValue("(DZ)Z", (java.lang.Object) propertyDescriptorArray36);
        java.lang.reflect.Method method39 = null;
        java.lang.reflect.Method method40 = null;
        java.beans.PropertyDescriptor propertyDescriptor41 = new java.beans.PropertyDescriptor("hi!", method39, method40);
        propertyDescriptor41.setHidden(false);
        java.lang.reflect.Method method44 = propertyDescriptor41.getReadMethod();
        propertyDescriptor41.setExpert(false);
        java.beans.PropertyEditor propertyEditor48 = propertyDescriptor41.createPropertyEditor((java.lang.Object) 8);
        java.lang.reflect.Method method49 = null;
        propertyDescriptor41.setReadMethod(method49);
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("L191230559", method52, method53);
        java.beans.PropertyEditor propertyEditor55 = propertyDescriptor41.createPropertyEditor((java.lang.Object) propertyDescriptor54);
        boolean boolean56 = propertyDescriptor41.isExpert();
        boolean boolean57 = propertyDescriptor3.equals((java.lang.Object) boolean56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor41 and propertyDescriptor54", propertyDescriptor41.equals(propertyDescriptor54) ? propertyDescriptor41.hashCode() == propertyDescriptor54.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitEnd();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L546622177");
        int int10 = type8.getOpcode((int) (byte) -1);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(133, type8);
        int int12 = type8.getSize();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        java.lang.String str21 = type20.getInternalName();
        java.lang.String str22 = type20.getInternalName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.declare_field(36, "L1517098075", type8, (java.lang.Object) type20);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        int int15 = classInfo11.getModifiers();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        boolean boolean23 = signature18.equals((java.lang.Object) classEmitter20);
        boolean boolean24 = classInfo11.equals((java.lang.Object) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter25.visitOuterClass("LL751231323;", "L1714330135", "L322196530");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass28);
        java.lang.String str31 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass28);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray35, true, true);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(0, (int) (short) -1, "L2070346003", "L933903703", "L1732526852", strArray24);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean12 = type2.equals((java.lang.Object) propertyDescriptorArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type2, typeArray26);
        java.lang.String str30 = type2.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = type2.getDimensions();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        label0.info = 100.0d;
        java.lang.Object obj6 = label0.info;
        java.lang.Class<?> wildcardClass7 = label0.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass7);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        java.lang.Class<?> wildcardClass17 = label10.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.Class[] classArray28 = new java.lang.Class[] {};
        int int29 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray28);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray28);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass35);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray40);
        java.lang.Class[] classArray42 = new java.lang.Class[] {};
        int int43 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray45 = org.mockito.cglib.core.ReflectUtils.getNames(classArray42);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray50 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray51 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray49, methodArray50);
        java.lang.reflect.Method[] methodArray52 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray50);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getObjectType("hi!");
        int int55 = type54.getSort();
        java.lang.Class<?> wildcardClass56 = type54.getClass();
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass56);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass56);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, true);
        java.lang.reflect.Method[] methodArray63 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray45, methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray63);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        int int67 = type66.getSort();
        java.lang.Class<?> wildcardClass68 = type66.getClass();
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray70 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        org.mockito.cglib.core.ClassInfo classInfo71 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass68);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass68);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass68);
        java.lang.reflect.Method[] methodArray76 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray73, true, false);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray76);
        java.lang.Object obj78 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass17, classArray24, (java.lang.Object[]) strArray31);
        java.lang.reflect.Constructor constructor79 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass7, classArray24);
        org.mockito.cglib.core.MethodInfo methodInfo81 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79, 107);
        org.mockito.cglib.core.MethodInfo methodInfo82 = org.mockito.cglib.core.ReflectUtils.getMethodInfo((java.lang.reflect.Member) constructor79);
        org.mockito.asm.Type[] typeArray83 = methodInfo82.getExceptionTypes();
        java.lang.String str84 = methodInfo82.toString();
        java.lang.String str85 = methodInfo82.toString();
        org.mockito.cglib.core.Signature signature86 = methodInfo82.getSignature();
        org.mockito.cglib.core.ClassEmitter classEmitter87 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter88 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter87);
        org.mockito.cglib.core.ClassEmitter classEmitter89 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter90 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter88);
        org.mockito.cglib.core.ClassEmitter classEmitter91 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter90);
        org.mockito.cglib.core.ClassEmitter classEmitter92 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter91);
        boolean boolean93 = methodInfo82.equals((java.lang.Object) classEmitter91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter91.visitOuterClass("L1605130010", "L1968563042", "L1771399126");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        org.mockito.asm.Type type8 = classInfo7.getType();
        int int9 = classInfo7.getModifiers();
        org.mockito.asm.Type type10 = classInfo7.getType();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter11);
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter12.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        boolean boolean16 = type10.equals((java.lang.Object) classEmitter12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter12.visitInnerClass("java.beans.PropertyDescriptor[name=boolean; shortDescription=L863364317]", "java.beans.PropertyDescriptor[name=hi!; preferred; values={L549452582=Lhi!;}]", "Lg.mockito.asm.Type;", 130);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((-1), type2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean12 = type2.equals((java.lang.Object) propertyDescriptorArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("D", type2, typeArray26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type30 = type2.getElementType();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getReturnType("S");
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        propertyDescriptor12.setHidden(false);
        propertyDescriptor12.setDisplayName("boolean");
        boolean boolean17 = propertyDescriptor12.isHidden();
        boolean boolean18 = propertyDescriptor12.isPreferred();
        java.lang.reflect.Method method19 = null;
        propertyDescriptor12.setWriteMethod(method19);
        java.lang.Object obj22 = propertyDescriptor12.getValue("");
        boolean boolean23 = type8.equals((java.lang.Object) propertyDescriptor12);
        boolean boolean24 = propertyDescriptor12.isExpert();
        label0.info = propertyDescriptor12;
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, true);
        label0.info = methodArray34;
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        label36.info = 3;
        label36.info = 130;
        java.lang.String str41 = label36.toString();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        int int44 = type43.getSort();
        java.lang.Class<?> wildcardClass45 = type43.getClass();
        org.mockito.cglib.core.ClassInfo classInfo46 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass45);
        org.mockito.asm.Type type47 = classInfo46.getType();
        org.mockito.asm.Type type48 = classInfo46.getType();
        label36.info = type48;
        java.lang.String str50 = label36.toString();
        java.lang.reflect.Method method52 = null;
        java.lang.reflect.Method method53 = null;
        java.beans.PropertyDescriptor propertyDescriptor54 = new java.beans.PropertyDescriptor("Lorg/mockito/cglib/core/Signature;", method52, method53);
        java.lang.reflect.Method method55 = null;
        propertyDescriptor54.setWriteMethod(method55);
        propertyDescriptor54.setHidden(true);
        propertyDescriptor54.setDisplayName("L1949262277");
        java.lang.Object obj62 = propertyDescriptor54.getValue("()Lava.beans.PropertyDescriptor[name=hi!;");
        java.lang.reflect.Method method63 = null;
        propertyDescriptor54.setReadMethod(method63);
        label36.info = propertyDescriptor54;
        java.lang.Object obj66 = label36.info;
        java.lang.String str67 = label36.toString();
        java.lang.Object obj68 = label36.info;
        label0.info = obj68;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and obj68", propertyDescriptor12.equals(obj68) ? propertyDescriptor12.hashCode() == obj68.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(142, 5, "L1615312415", "L1359432116", "L83848900", strArray16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray20 = classInfo19.getInterfaces();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        boolean boolean26 = classInfo19.equals((java.lang.Object) classArray21);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(4, 23, "L223841028", "ava.beans.PropertyDescriptor[name=hi!", "java.beans.PropertyDescriptor[name=boolean; shortDescription=org/mockito/asm/Label]", strArray28);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter3.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray18);
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visit(59, 31, "LLorg/mockito/asm/Type;(IZ)C;", "L937219864", "", strArray27);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        label17.info = classArray19;
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass29);
        java.lang.String str32 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, false, false);
        java.lang.Class[] classArray37 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray33);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, false);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit(0, 0, "L1958580256", "()Lhi!;", "L1099184960", strArray25);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter10.getClassInfo();
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray26, true, false);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        int int33 = type32.getSort();
        java.lang.Class<?> wildcardClass34 = type32.getClass();
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass34);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass34);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray36, true, false);
        java.lang.reflect.Method[] methodArray40 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visit(24, 22, "L1092932024", "[Ljava/lang/Class;", "L1517098075", strArray20);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean9 = classInfo6.equals((java.lang.Object) type8);
        int int10 = classInfo6.getModifiers();
        org.mockito.asm.Type type11 = classInfo6.getType();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.String str16 = type14.getInternalName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("C", type11, typeArray25);
        java.lang.String str28 = signature27.getName();
        org.mockito.asm.Type[] typeArray29 = signature27.getArgumentTypes();
        java.lang.String str30 = signature27.toString();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        boolean boolean34 = signature27.equals((java.lang.Object) classEmitter31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type35 = classEmitter31.getSuperType();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("L1619796034", method1, method2);
        propertyDescriptor3.setExpert(false);
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("D", "L874100273");
        java.lang.String str9 = signature8.toString();
        java.beans.PropertyEditor propertyEditor10 = propertyDescriptor3.createPropertyEditor((java.lang.Object) str9);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setDisplayName("boolean");
        boolean boolean20 = propertyDescriptor15.isHidden();
        java.lang.String str21 = propertyDescriptor15.getShortDescription();
        boolean boolean22 = propertyDescriptor15.isHidden();
        propertyDescriptor15.setConstrained(false);
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("hi!", method27, method28);
        propertyDescriptor29.setHidden(false);
        java.lang.reflect.Method method32 = propertyDescriptor29.getReadMethod();
        java.lang.reflect.Method method33 = propertyDescriptor29.getReadMethod();
        java.lang.reflect.Method method34 = propertyDescriptor29.getReadMethod();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.cglib.core.Local local39 = new org.mockito.cglib.core.Local((-1), type36);
        org.mockito.asm.Type type40 = local39.getType();
        java.lang.String str41 = type40.toString();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        java.lang.String str44 = classInfo43.toString();
        java.beans.PropertyEditor propertyEditor45 = propertyDescriptor29.createPropertyEditor((java.lang.Object) str44);
        propertyDescriptor15.setValue("(JLorg/mockito/asm/Type;)Lhi!;", (java.lang.Object) propertyDescriptor29);
        propertyDescriptor3.setValue("java/lang/Object", (java.lang.Object) propertyDescriptor29);
        propertyDescriptor29.setExpert(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor15", propertyDescriptor3.equals(propertyDescriptor15) ? propertyDescriptor3.hashCode() == propertyDescriptor15.hashCode() : true);
    }
}

